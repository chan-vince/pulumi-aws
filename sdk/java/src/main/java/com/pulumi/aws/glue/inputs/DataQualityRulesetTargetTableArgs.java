// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataQualityRulesetTargetTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataQualityRulesetTargetTableArgs Empty = new DataQualityRulesetTargetTableArgs();

    /**
     * The catalog id where the AWS Glue table exists.
     * 
     */
    @Import(name="catalogId")
    private @Nullable Output<String> catalogId;

    /**
     * @return The catalog id where the AWS Glue table exists.
     * 
     */
    public Optional<Output<String>> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }

    /**
     * Name of the database where the AWS Glue table exists.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return Name of the database where the AWS Glue table exists.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * Name of the AWS Glue table.
     * 
     */
    @Import(name="tableName", required=true)
    private Output<String> tableName;

    /**
     * @return Name of the AWS Glue table.
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
    }

    private DataQualityRulesetTargetTableArgs() {}

    private DataQualityRulesetTargetTableArgs(DataQualityRulesetTargetTableArgs $) {
        this.catalogId = $.catalogId;
        this.databaseName = $.databaseName;
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataQualityRulesetTargetTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataQualityRulesetTargetTableArgs $;

        public Builder() {
            $ = new DataQualityRulesetTargetTableArgs();
        }

        public Builder(DataQualityRulesetTargetTableArgs defaults) {
            $ = new DataQualityRulesetTargetTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogId The catalog id where the AWS Glue table exists.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(@Nullable Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        /**
         * @param catalogId The catalog id where the AWS Glue table exists.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        /**
         * @param databaseName Name of the database where the AWS Glue table exists.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName Name of the database where the AWS Glue table exists.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param tableName Name of the AWS Glue table.
         * 
         * @return builder
         * 
         */
        public Builder tableName(Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        /**
         * @param tableName Name of the AWS Glue table.
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public DataQualityRulesetTargetTableArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            return $;
        }
    }

}
