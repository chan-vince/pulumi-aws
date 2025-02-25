// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.aws.glue.outputs.GetCatalogTableStorageDescriptorColumn;
import com.pulumi.aws.glue.outputs.GetCatalogTableStorageDescriptorSchemaReference;
import com.pulumi.aws.glue.outputs.GetCatalogTableStorageDescriptorSerDeInfo;
import com.pulumi.aws.glue.outputs.GetCatalogTableStorageDescriptorSkewedInfo;
import com.pulumi.aws.glue.outputs.GetCatalogTableStorageDescriptorSortColumn;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetCatalogTableStorageDescriptor {
    /**
     * @return List of reducer grouping columns, clustering columns, and bucketing columns in the table.
     * 
     */
    private List<String> bucketColumns;
    /**
     * @return Configuration block for columns in the table. See `columns` below.
     * 
     */
    private List<GetCatalogTableStorageDescriptorColumn> columns;
    /**
     * @return Whether the data in the table is compressed.
     * 
     */
    private Boolean compressed;
    /**
     * @return Input format: SequenceFileInputFormat (binary), or TextInputFormat, or a custom format.
     * 
     */
    private String inputFormat;
    /**
     * @return Physical location of the table. By default, this takes the form of the warehouse location, followed by the database location in the warehouse, followed by the table name.
     * 
     */
    private String location;
    /**
     * @return Is if the table contains any dimension columns.
     * 
     */
    private Integer numberOfBuckets;
    /**
     * @return Output format: SequenceFileOutputFormat (binary), or IgnoreKeyTextOutputFormat, or a custom format.
     * 
     */
    private String outputFormat;
    /**
     * @return Map of initialization parameters for the SerDe, in key-value form.
     * 
     */
    private Map<String,String> parameters;
    /**
     * @return Object that references a schema stored in the AWS Glue Schema Registry. See `schema_reference` below.
     * 
     */
    private List<GetCatalogTableStorageDescriptorSchemaReference> schemaReferences;
    /**
     * @return Configuration block for serialization and deserialization (&#34;SerDe&#34;) information. See `ser_de_info` below.
     * 
     */
    private List<GetCatalogTableStorageDescriptorSerDeInfo> serDeInfos;
    /**
     * @return Configuration block with information about values that appear very frequently in a column (skewed values). See `skewed_info` below.
     * 
     */
    private List<GetCatalogTableStorageDescriptorSkewedInfo> skewedInfos;
    /**
     * @return Configuration block for the sort order of each bucket in the table. See `sort_columns` below.
     * 
     */
    private List<GetCatalogTableStorageDescriptorSortColumn> sortColumns;
    /**
     * @return Whether the table data is stored in subdirectories.
     * 
     */
    private Boolean storedAsSubDirectories;

    private GetCatalogTableStorageDescriptor() {}
    /**
     * @return List of reducer grouping columns, clustering columns, and bucketing columns in the table.
     * 
     */
    public List<String> bucketColumns() {
        return this.bucketColumns;
    }
    /**
     * @return Configuration block for columns in the table. See `columns` below.
     * 
     */
    public List<GetCatalogTableStorageDescriptorColumn> columns() {
        return this.columns;
    }
    /**
     * @return Whether the data in the table is compressed.
     * 
     */
    public Boolean compressed() {
        return this.compressed;
    }
    /**
     * @return Input format: SequenceFileInputFormat (binary), or TextInputFormat, or a custom format.
     * 
     */
    public String inputFormat() {
        return this.inputFormat;
    }
    /**
     * @return Physical location of the table. By default, this takes the form of the warehouse location, followed by the database location in the warehouse, followed by the table name.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Is if the table contains any dimension columns.
     * 
     */
    public Integer numberOfBuckets() {
        return this.numberOfBuckets;
    }
    /**
     * @return Output format: SequenceFileOutputFormat (binary), or IgnoreKeyTextOutputFormat, or a custom format.
     * 
     */
    public String outputFormat() {
        return this.outputFormat;
    }
    /**
     * @return Map of initialization parameters for the SerDe, in key-value form.
     * 
     */
    public Map<String,String> parameters() {
        return this.parameters;
    }
    /**
     * @return Object that references a schema stored in the AWS Glue Schema Registry. See `schema_reference` below.
     * 
     */
    public List<GetCatalogTableStorageDescriptorSchemaReference> schemaReferences() {
        return this.schemaReferences;
    }
    /**
     * @return Configuration block for serialization and deserialization (&#34;SerDe&#34;) information. See `ser_de_info` below.
     * 
     */
    public List<GetCatalogTableStorageDescriptorSerDeInfo> serDeInfos() {
        return this.serDeInfos;
    }
    /**
     * @return Configuration block with information about values that appear very frequently in a column (skewed values). See `skewed_info` below.
     * 
     */
    public List<GetCatalogTableStorageDescriptorSkewedInfo> skewedInfos() {
        return this.skewedInfos;
    }
    /**
     * @return Configuration block for the sort order of each bucket in the table. See `sort_columns` below.
     * 
     */
    public List<GetCatalogTableStorageDescriptorSortColumn> sortColumns() {
        return this.sortColumns;
    }
    /**
     * @return Whether the table data is stored in subdirectories.
     * 
     */
    public Boolean storedAsSubDirectories() {
        return this.storedAsSubDirectories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCatalogTableStorageDescriptor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> bucketColumns;
        private List<GetCatalogTableStorageDescriptorColumn> columns;
        private Boolean compressed;
        private String inputFormat;
        private String location;
        private Integer numberOfBuckets;
        private String outputFormat;
        private Map<String,String> parameters;
        private List<GetCatalogTableStorageDescriptorSchemaReference> schemaReferences;
        private List<GetCatalogTableStorageDescriptorSerDeInfo> serDeInfos;
        private List<GetCatalogTableStorageDescriptorSkewedInfo> skewedInfos;
        private List<GetCatalogTableStorageDescriptorSortColumn> sortColumns;
        private Boolean storedAsSubDirectories;
        public Builder() {}
        public Builder(GetCatalogTableStorageDescriptor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketColumns = defaults.bucketColumns;
    	      this.columns = defaults.columns;
    	      this.compressed = defaults.compressed;
    	      this.inputFormat = defaults.inputFormat;
    	      this.location = defaults.location;
    	      this.numberOfBuckets = defaults.numberOfBuckets;
    	      this.outputFormat = defaults.outputFormat;
    	      this.parameters = defaults.parameters;
    	      this.schemaReferences = defaults.schemaReferences;
    	      this.serDeInfos = defaults.serDeInfos;
    	      this.skewedInfos = defaults.skewedInfos;
    	      this.sortColumns = defaults.sortColumns;
    	      this.storedAsSubDirectories = defaults.storedAsSubDirectories;
        }

        @CustomType.Setter
        public Builder bucketColumns(List<String> bucketColumns) {
            this.bucketColumns = Objects.requireNonNull(bucketColumns);
            return this;
        }
        public Builder bucketColumns(String... bucketColumns) {
            return bucketColumns(List.of(bucketColumns));
        }
        @CustomType.Setter
        public Builder columns(List<GetCatalogTableStorageDescriptorColumn> columns) {
            this.columns = Objects.requireNonNull(columns);
            return this;
        }
        public Builder columns(GetCatalogTableStorageDescriptorColumn... columns) {
            return columns(List.of(columns));
        }
        @CustomType.Setter
        public Builder compressed(Boolean compressed) {
            this.compressed = Objects.requireNonNull(compressed);
            return this;
        }
        @CustomType.Setter
        public Builder inputFormat(String inputFormat) {
            this.inputFormat = Objects.requireNonNull(inputFormat);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder numberOfBuckets(Integer numberOfBuckets) {
            this.numberOfBuckets = Objects.requireNonNull(numberOfBuckets);
            return this;
        }
        @CustomType.Setter
        public Builder outputFormat(String outputFormat) {
            this.outputFormat = Objects.requireNonNull(outputFormat);
            return this;
        }
        @CustomType.Setter
        public Builder parameters(Map<String,String> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        @CustomType.Setter
        public Builder schemaReferences(List<GetCatalogTableStorageDescriptorSchemaReference> schemaReferences) {
            this.schemaReferences = Objects.requireNonNull(schemaReferences);
            return this;
        }
        public Builder schemaReferences(GetCatalogTableStorageDescriptorSchemaReference... schemaReferences) {
            return schemaReferences(List.of(schemaReferences));
        }
        @CustomType.Setter
        public Builder serDeInfos(List<GetCatalogTableStorageDescriptorSerDeInfo> serDeInfos) {
            this.serDeInfos = Objects.requireNonNull(serDeInfos);
            return this;
        }
        public Builder serDeInfos(GetCatalogTableStorageDescriptorSerDeInfo... serDeInfos) {
            return serDeInfos(List.of(serDeInfos));
        }
        @CustomType.Setter
        public Builder skewedInfos(List<GetCatalogTableStorageDescriptorSkewedInfo> skewedInfos) {
            this.skewedInfos = Objects.requireNonNull(skewedInfos);
            return this;
        }
        public Builder skewedInfos(GetCatalogTableStorageDescriptorSkewedInfo... skewedInfos) {
            return skewedInfos(List.of(skewedInfos));
        }
        @CustomType.Setter
        public Builder sortColumns(List<GetCatalogTableStorageDescriptorSortColumn> sortColumns) {
            this.sortColumns = Objects.requireNonNull(sortColumns);
            return this;
        }
        public Builder sortColumns(GetCatalogTableStorageDescriptorSortColumn... sortColumns) {
            return sortColumns(List.of(sortColumns));
        }
        @CustomType.Setter
        public Builder storedAsSubDirectories(Boolean storedAsSubDirectories) {
            this.storedAsSubDirectories = Objects.requireNonNull(storedAsSubDirectories);
            return this;
        }
        public GetCatalogTableStorageDescriptor build() {
            final var o = new GetCatalogTableStorageDescriptor();
            o.bucketColumns = bucketColumns;
            o.columns = columns;
            o.compressed = compressed;
            o.inputFormat = inputFormat;
            o.location = location;
            o.numberOfBuckets = numberOfBuckets;
            o.outputFormat = outputFormat;
            o.parameters = parameters;
            o.schemaReferences = schemaReferences;
            o.serDeInfos = serDeInfos;
            o.skewedInfos = skewedInfos;
            o.sortColumns = sortColumns;
            o.storedAsSubDirectories = storedAsSubDirectories;
            return o;
        }
    }
}
