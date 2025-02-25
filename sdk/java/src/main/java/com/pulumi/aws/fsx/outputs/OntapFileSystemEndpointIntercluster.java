// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OntapFileSystemEndpointIntercluster {
    /**
     * @return The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
     * 
     */
    private @Nullable String dnsName;
    /**
     * @return IP addresses of the file system endpoint.
     * 
     */
    private @Nullable List<String> ipAddresses;

    private OntapFileSystemEndpointIntercluster() {}
    /**
     * @return The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
     * 
     */
    public Optional<String> dnsName() {
        return Optional.ofNullable(this.dnsName);
    }
    /**
     * @return IP addresses of the file system endpoint.
     * 
     */
    public List<String> ipAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapFileSystemEndpointIntercluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String dnsName;
        private @Nullable List<String> ipAddresses;
        public Builder() {}
        public Builder(OntapFileSystemEndpointIntercluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsName = defaults.dnsName;
    	      this.ipAddresses = defaults.ipAddresses;
        }

        @CustomType.Setter
        public Builder dnsName(@Nullable String dnsName) {
            this.dnsName = dnsName;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        public OntapFileSystemEndpointIntercluster build() {
            final var o = new OntapFileSystemEndpointIntercluster();
            o.dnsName = dnsName;
            o.ipAddresses = ipAddresses;
            return o;
        }
    }
}
