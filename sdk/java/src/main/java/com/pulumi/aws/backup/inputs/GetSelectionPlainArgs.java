// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSelectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSelectionPlainArgs Empty = new GetSelectionPlainArgs();

    /**
     * Backup plan ID associated with the selection of resources.
     * 
     */
    @Import(name="planId", required=true)
    private String planId;

    /**
     * @return Backup plan ID associated with the selection of resources.
     * 
     */
    public String planId() {
        return this.planId;
    }

    /**
     * Backup selection ID.
     * 
     */
    @Import(name="selectionId", required=true)
    private String selectionId;

    /**
     * @return Backup selection ID.
     * 
     */
    public String selectionId() {
        return this.selectionId;
    }

    private GetSelectionPlainArgs() {}

    private GetSelectionPlainArgs(GetSelectionPlainArgs $) {
        this.planId = $.planId;
        this.selectionId = $.selectionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSelectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSelectionPlainArgs $;

        public Builder() {
            $ = new GetSelectionPlainArgs();
        }

        public Builder(GetSelectionPlainArgs defaults) {
            $ = new GetSelectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param planId Backup plan ID associated with the selection of resources.
         * 
         * @return builder
         * 
         */
        public Builder planId(String planId) {
            $.planId = planId;
            return this;
        }

        /**
         * @param selectionId Backup selection ID.
         * 
         * @return builder
         * 
         */
        public Builder selectionId(String selectionId) {
            $.selectionId = selectionId;
            return this;
        }

        public GetSelectionPlainArgs build() {
            $.planId = Objects.requireNonNull($.planId, "expected parameter 'planId' to be non-null");
            $.selectionId = Objects.requireNonNull($.selectionId, "expected parameter 'selectionId' to be non-null");
            return $;
        }
    }

}
