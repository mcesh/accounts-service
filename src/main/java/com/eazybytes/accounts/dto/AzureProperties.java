package com.eazybytes.accounts.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties(prefix = "azure")
@Getter
@Setter
public class AzureProperties {

    private ScappsBlobProperties scappsblob;
    private ServiceBusProperties servicebus;

    @Getter
    @Setter
    public static class ScappsBlobProperties {
        private String connectionstring;
        private String container;

        public ScappsBlobProperties() {
            this.connectionstring = null;
            this.container = null;
        }
    }

    @Getter
    @Setter
    public static class ServiceBusProperties {
        private String namespace;
        private String topicClientId;
        private String pricingTier;
        private boolean passwordlessEnabled;
        private String topic;
        private String partitionKey;
        private String managedIdentityClientId;

        public ServiceBusProperties() {
            this.namespace = null;
            this.topicClientId = null;
            this.pricingTier = "Standard";
            this.passwordlessEnabled = true;
            this.topic = null;
            this.partitionKey = null;
            this.managedIdentityClientId = null;
        }
    }
}


