package com.eazybytes.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties(prefix = "azure")
public record AzureProperties(ScappsBlobProperties scappsblob,ServiceBusProperties servicebus) {

    public static record ScappsBlobProperties(@DefaultValue("#{null}") String connectionstring,
                                              @DefaultValue("#{null}") String container) {
    }

    public static record ServiceBusProperties(@DefaultValue("#{null}") String namespace,
                                              @DefaultValue("#{null}") String topicClientId,
                                              @DefaultValue("Standard") String pricingTier,
                                              @DefaultValue("true") boolean passwordlessEnabled,
                                              @DefaultValue("#{null}") String topic,
                                              @DefaultValue("#{null}") String partitionKey,
                                              @DefaultValue("#{null}") String managedIdentityClientId) {
    }
}

