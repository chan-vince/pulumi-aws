// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFirewallPolicyFirewallPolicyStatefulRuleGroupReferenceOverride {
    private @Nullable String action;

    private GetFirewallPolicyFirewallPolicyStatefulRuleGroupReferenceOverride() {}
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyFirewallPolicyStatefulRuleGroupReferenceOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        public Builder() {}
        public Builder(GetFirewallPolicyFirewallPolicyStatefulRuleGroupReferenceOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        public GetFirewallPolicyFirewallPolicyStatefulRuleGroupReferenceOverride build() {
            final var o = new GetFirewallPolicyFirewallPolicyStatefulRuleGroupReferenceOverride();
            o.action = action;
            return o;
        }
    }
}
