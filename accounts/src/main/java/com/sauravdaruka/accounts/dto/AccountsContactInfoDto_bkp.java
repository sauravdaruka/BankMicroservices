package com.sauravdaruka.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

//@ConfigurationProperties(prefix = "accounts")
public record AccountsContactInfoDto_bkp(String message, Map<String, String> contactDetails, List<String> onCallSupport) {

}