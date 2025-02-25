// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OntapVolumeSnaplockConfigurationRetentionPeriodDefaultRetention {
    /**
     * @return The type of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. Setting this value to `NONE` disables autocommit. Valid values: `MINUTES`, `HOURS`, `DAYS`, `MONTHS`, `YEARS`, `NONE`.
     * 
     */
    private @Nullable String type;
    /**
     * @return The amount of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume.
     * 
     */
    private @Nullable Integer value;

    private OntapVolumeSnaplockConfigurationRetentionPeriodDefaultRetention() {}
    /**
     * @return The type of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume. Setting this value to `NONE` disables autocommit. Valid values: `MINUTES`, `HOURS`, `DAYS`, `MONTHS`, `YEARS`, `NONE`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The amount of time for the autocommit period of a file in an FSx for ONTAP SnapLock volume.
     * 
     */
    public Optional<Integer> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapVolumeSnaplockConfigurationRetentionPeriodDefaultRetention defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String type;
        private @Nullable Integer value;
        public Builder() {}
        public Builder(OntapVolumeSnaplockConfigurationRetentionPeriodDefaultRetention defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable Integer value) {
            this.value = value;
            return this;
        }
        public OntapVolumeSnaplockConfigurationRetentionPeriodDefaultRetention build() {
            final var o = new OntapVolumeSnaplockConfigurationRetentionPeriodDefaultRetention();
            o.type = type;
            o.value = value;
            return o;
        }
    }
}
