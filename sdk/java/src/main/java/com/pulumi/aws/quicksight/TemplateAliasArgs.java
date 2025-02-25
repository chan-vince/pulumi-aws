// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TemplateAliasArgs extends com.pulumi.resources.ResourceArgs {

    public static final TemplateAliasArgs Empty = new TemplateAliasArgs();

    /**
     * Display name of the template alias.
     * 
     */
    @Import(name="aliasName", required=true)
    private Output<String> aliasName;

    /**
     * @return Display name of the template alias.
     * 
     */
    public Output<String> aliasName() {
        return this.aliasName;
    }

    /**
     * AWS account ID.
     * 
     */
    @Import(name="awsAccountId")
    private @Nullable Output<String> awsAccountId;

    /**
     * @return AWS account ID.
     * 
     */
    public Optional<Output<String>> awsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }

    /**
     * ID of the template.
     * 
     */
    @Import(name="templateId", required=true)
    private Output<String> templateId;

    /**
     * @return ID of the template.
     * 
     */
    public Output<String> templateId() {
        return this.templateId;
    }

    /**
     * Version number of the template.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="templateVersionNumber", required=true)
    private Output<Integer> templateVersionNumber;

    /**
     * @return Version number of the template.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<Integer> templateVersionNumber() {
        return this.templateVersionNumber;
    }

    private TemplateAliasArgs() {}

    private TemplateAliasArgs(TemplateAliasArgs $) {
        this.aliasName = $.aliasName;
        this.awsAccountId = $.awsAccountId;
        this.templateId = $.templateId;
        this.templateVersionNumber = $.templateVersionNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateAliasArgs $;

        public Builder() {
            $ = new TemplateAliasArgs();
        }

        public Builder(TemplateAliasArgs defaults) {
            $ = new TemplateAliasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aliasName Display name of the template alias.
         * 
         * @return builder
         * 
         */
        public Builder aliasName(Output<String> aliasName) {
            $.aliasName = aliasName;
            return this;
        }

        /**
         * @param aliasName Display name of the template alias.
         * 
         * @return builder
         * 
         */
        public Builder aliasName(String aliasName) {
            return aliasName(Output.of(aliasName));
        }

        /**
         * @param awsAccountId AWS account ID.
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(@Nullable Output<String> awsAccountId) {
            $.awsAccountId = awsAccountId;
            return this;
        }

        /**
         * @param awsAccountId AWS account ID.
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(String awsAccountId) {
            return awsAccountId(Output.of(awsAccountId));
        }

        /**
         * @param templateId ID of the template.
         * 
         * @return builder
         * 
         */
        public Builder templateId(Output<String> templateId) {
            $.templateId = templateId;
            return this;
        }

        /**
         * @param templateId ID of the template.
         * 
         * @return builder
         * 
         */
        public Builder templateId(String templateId) {
            return templateId(Output.of(templateId));
        }

        /**
         * @param templateVersionNumber Version number of the template.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder templateVersionNumber(Output<Integer> templateVersionNumber) {
            $.templateVersionNumber = templateVersionNumber;
            return this;
        }

        /**
         * @param templateVersionNumber Version number of the template.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder templateVersionNumber(Integer templateVersionNumber) {
            return templateVersionNumber(Output.of(templateVersionNumber));
        }

        public TemplateAliasArgs build() {
            $.aliasName = Objects.requireNonNull($.aliasName, "expected parameter 'aliasName' to be non-null");
            $.templateId = Objects.requireNonNull($.templateId, "expected parameter 'templateId' to be non-null");
            $.templateVersionNumber = Objects.requireNonNull($.templateVersionNumber, "expected parameter 'templateVersionNumber' to be non-null");
            return $;
        }
    }

}
