// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigSessionStickinessConfig {
    /**
     * @return The amount of time in seconds after which sessions will cease if no requests are received. Valid values are `300` – `3600` (5–60 minutes). The value must be less than or equal to `maximum_ttl`.
     * 
     */
    private Integer idleTtl;
    /**
     * @return The maximum amount of time in seconds to consider requests from the viewer as being part of the same session. Valid values are `300` – `3600` (5–60 minutes). The value must be greater than or equal to `idle_ttl`.
     * 
     */
    private Integer maximumTtl;

    private ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigSessionStickinessConfig() {}
    /**
     * @return The amount of time in seconds after which sessions will cease if no requests are received. Valid values are `300` – `3600` (5–60 minutes). The value must be less than or equal to `maximum_ttl`.
     * 
     */
    public Integer idleTtl() {
        return this.idleTtl;
    }
    /**
     * @return The maximum amount of time in seconds to consider requests from the viewer as being part of the same session. Valid values are `300` – `3600` (5–60 minutes). The value must be greater than or equal to `idle_ttl`.
     * 
     */
    public Integer maximumTtl() {
        return this.maximumTtl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigSessionStickinessConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer idleTtl;
        private Integer maximumTtl;
        public Builder() {}
        public Builder(ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigSessionStickinessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idleTtl = defaults.idleTtl;
    	      this.maximumTtl = defaults.maximumTtl;
        }

        @CustomType.Setter
        public Builder idleTtl(Integer idleTtl) {
            this.idleTtl = Objects.requireNonNull(idleTtl);
            return this;
        }
        @CustomType.Setter
        public Builder maximumTtl(Integer maximumTtl) {
            this.maximumTtl = Objects.requireNonNull(maximumTtl);
            return this;
        }
        public ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigSessionStickinessConfig build() {
            final var o = new ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigSessionStickinessConfig();
            o.idleTtl = idleTtl;
            o.maximumTtl = maximumTtl;
            return o;
        }
    }
}
