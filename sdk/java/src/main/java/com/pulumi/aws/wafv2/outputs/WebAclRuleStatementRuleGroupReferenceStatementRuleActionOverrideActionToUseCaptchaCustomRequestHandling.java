// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingInsertHeader;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandling {
    /**
     * @return The `insert_header` blocks used to define HTTP headers added to the request. See `insert_header` below for details.
     * 
     */
    private List<WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingInsertHeader> insertHeaders;

    private WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandling() {}
    /**
     * @return The `insert_header` blocks used to define HTTP headers added to the request. See `insert_header` below for details.
     * 
     */
    public List<WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingInsertHeader> insertHeaders() {
        return this.insertHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingInsertHeader> insertHeaders;
        public Builder() {}
        public Builder(WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        @CustomType.Setter
        public Builder insertHeaders(List<WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingInsertHeader> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }
        public Builder insertHeaders(WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingInsertHeader... insertHeaders) {
            return insertHeaders(List.of(insertHeaders));
        }
        public WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandling build() {
            final var o = new WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandling();
            o.insertHeaders = insertHeaders;
            return o;
        }
    }
}
