package com.sauravdaruka.cards.dto;

import java.util.List;
import java.util.Map;

//@ConfigurationProperties(prefix = "cards")
public record CardsContactInfoDto_bkp(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
}