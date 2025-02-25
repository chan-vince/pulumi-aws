// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TableImportTableInputFormatOptionsCsv {
    /**
     * @return The delimiter used for separating items in the CSV file being imported.
     * 
     */
    private @Nullable String delimiter;
    /**
     * @return List of the headers used to specify a common header for all source CSV files being imported.
     * 
     */
    private @Nullable List<String> headerLists;

    private TableImportTableInputFormatOptionsCsv() {}
    /**
     * @return The delimiter used for separating items in the CSV file being imported.
     * 
     */
    public Optional<String> delimiter() {
        return Optional.ofNullable(this.delimiter);
    }
    /**
     * @return List of the headers used to specify a common header for all source CSV files being imported.
     * 
     */
    public List<String> headerLists() {
        return this.headerLists == null ? List.of() : this.headerLists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableImportTableInputFormatOptionsCsv defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String delimiter;
        private @Nullable List<String> headerLists;
        public Builder() {}
        public Builder(TableImportTableInputFormatOptionsCsv defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delimiter = defaults.delimiter;
    	      this.headerLists = defaults.headerLists;
        }

        @CustomType.Setter
        public Builder delimiter(@Nullable String delimiter) {
            this.delimiter = delimiter;
            return this;
        }
        @CustomType.Setter
        public Builder headerLists(@Nullable List<String> headerLists) {
            this.headerLists = headerLists;
            return this;
        }
        public Builder headerLists(String... headerLists) {
            return headerLists(List.of(headerLists));
        }
        public TableImportTableInputFormatOptionsCsv build() {
            final var o = new TableImportTableInputFormatOptionsCsv();
            o.delimiter = delimiter;
            o.headerLists = headerLists;
            return o;
        }
    }
}
