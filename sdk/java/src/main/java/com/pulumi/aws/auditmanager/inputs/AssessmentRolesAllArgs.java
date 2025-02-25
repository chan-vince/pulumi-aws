// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.auditmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AssessmentRolesAllArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssessmentRolesAllArgs Empty = new AssessmentRolesAllArgs();

    /**
     * Amazon Resource Name (ARN) of the IAM role.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return Amazon Resource Name (ARN) of the IAM role.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * Type of customer persona. For assessment creation, type must always be `PROCESS_OWNER`.
     * 
     */
    @Import(name="roleType", required=true)
    private Output<String> roleType;

    /**
     * @return Type of customer persona. For assessment creation, type must always be `PROCESS_OWNER`.
     * 
     */
    public Output<String> roleType() {
        return this.roleType;
    }

    private AssessmentRolesAllArgs() {}

    private AssessmentRolesAllArgs(AssessmentRolesAllArgs $) {
        this.roleArn = $.roleArn;
        this.roleType = $.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssessmentRolesAllArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssessmentRolesAllArgs $;

        public Builder() {
            $ = new AssessmentRolesAllArgs();
        }

        public Builder(AssessmentRolesAllArgs defaults) {
            $ = new AssessmentRolesAllArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param roleArn Amazon Resource Name (ARN) of the IAM role.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn Amazon Resource Name (ARN) of the IAM role.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param roleType Type of customer persona. For assessment creation, type must always be `PROCESS_OWNER`.
         * 
         * @return builder
         * 
         */
        public Builder roleType(Output<String> roleType) {
            $.roleType = roleType;
            return this;
        }

        /**
         * @param roleType Type of customer persona. For assessment creation, type must always be `PROCESS_OWNER`.
         * 
         * @return builder
         * 
         */
        public Builder roleType(String roleType) {
            return roleType(Output.of(roleType));
        }

        public AssessmentRolesAllArgs build() {
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.roleType = Objects.requireNonNull($.roleType, "expected parameter 'roleType' to be non-null");
            return $;
        }
    }

}
