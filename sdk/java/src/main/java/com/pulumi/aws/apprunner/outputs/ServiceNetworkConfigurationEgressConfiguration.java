// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceNetworkConfigurationEgressConfiguration {
    /**
     * @return The type of egress configuration. Valid values are: `DEFAULT` and `VPC`.
     * 
     */
    private @Nullable String egressType;
    /**
     * @return The Amazon Resource Name (ARN) of the App Runner VPC connector that you want to associate with your App Runner service. Only valid when `EgressType = VPC`.
     * 
     */
    private @Nullable String vpcConnectorArn;

    private ServiceNetworkConfigurationEgressConfiguration() {}
    /**
     * @return The type of egress configuration. Valid values are: `DEFAULT` and `VPC`.
     * 
     */
    public Optional<String> egressType() {
        return Optional.ofNullable(this.egressType);
    }
    /**
     * @return The Amazon Resource Name (ARN) of the App Runner VPC connector that you want to associate with your App Runner service. Only valid when `EgressType = VPC`.
     * 
     */
    public Optional<String> vpcConnectorArn() {
        return Optional.ofNullable(this.vpcConnectorArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceNetworkConfigurationEgressConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String egressType;
        private @Nullable String vpcConnectorArn;
        public Builder() {}
        public Builder(ServiceNetworkConfigurationEgressConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressType = defaults.egressType;
    	      this.vpcConnectorArn = defaults.vpcConnectorArn;
        }

        @CustomType.Setter
        public Builder egressType(@Nullable String egressType) {
            this.egressType = egressType;
            return this;
        }
        @CustomType.Setter
        public Builder vpcConnectorArn(@Nullable String vpcConnectorArn) {
            this.vpcConnectorArn = vpcConnectorArn;
            return this;
        }
        public ServiceNetworkConfigurationEgressConfiguration build() {
            final var o = new ServiceNetworkConfigurationEgressConfiguration();
            o.egressType = egressType;
            o.vpcConnectorArn = vpcConnectorArn;
            return o;
        }
    }
}
