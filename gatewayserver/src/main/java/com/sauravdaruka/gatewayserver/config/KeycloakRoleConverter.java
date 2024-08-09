package com.sauravdaruka.gatewayserver.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KeycloakRoleConverter  implements Converter<Jwt, Collection<GrantedAuthority>> {

    @Override
    public Collection<GrantedAuthority> convert(Jwt source) {
        Map<String, Object> realmAccess = (Map<String, Object>) source.getClaims().get("realm_access");
        if (realmAccess == null || realmAccess.isEmpty()) {
            return new ArrayList<>();
        }
        Collection<GrantedAuthority> returnValue = ((List<String>) realmAccess.get("roles"))
                .stream().map(roleName -> "ROLE_" + roleName) // ROLE_ is prefixed because whenever .hasRole() uses ROLE_ internally : serverHttpSecurity.authorizeExchange(exchanges -> exchanges.pathMatchers("/eazybank/accounts/**").hasRole("ACCOUNTS"))
                .map(SimpleGrantedAuthority::new) // security cannot understand the roles if it is passed as a string, so pass it as an object of simple GrantedAuthority
                .collect(Collectors.toList());
        return returnValue;
    }

/*
    {
        "realm_access": {
          "roles": ["default-roles-master", "ACCOUNTS"]
        }
    }
*/
}