// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsNielsenConfiguration {
    /**
     * @return Enter the Distributor ID assigned to your organization by Nielsen.
     * 
     */
    private @Nullable String distributorId;
    /**
     * @return Enables Nielsen PCM to ID3 tagging.
     * 
     */
    private @Nullable String nielsenPcmToId3Tagging;

    private ChannelEncoderSettingsNielsenConfiguration() {}
    /**
     * @return Enter the Distributor ID assigned to your organization by Nielsen.
     * 
     */
    public Optional<String> distributorId() {
        return Optional.ofNullable(this.distributorId);
    }
    /**
     * @return Enables Nielsen PCM to ID3 tagging.
     * 
     */
    public Optional<String> nielsenPcmToId3Tagging() {
        return Optional.ofNullable(this.nielsenPcmToId3Tagging);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsNielsenConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String distributorId;
        private @Nullable String nielsenPcmToId3Tagging;
        public Builder() {}
        public Builder(ChannelEncoderSettingsNielsenConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributorId = defaults.distributorId;
    	      this.nielsenPcmToId3Tagging = defaults.nielsenPcmToId3Tagging;
        }

        @CustomType.Setter
        public Builder distributorId(@Nullable String distributorId) {
            this.distributorId = distributorId;
            return this;
        }
        @CustomType.Setter
        public Builder nielsenPcmToId3Tagging(@Nullable String nielsenPcmToId3Tagging) {
            this.nielsenPcmToId3Tagging = nielsenPcmToId3Tagging;
            return this;
        }
        public ChannelEncoderSettingsNielsenConfiguration build() {
            final var o = new ChannelEncoderSettingsNielsenConfiguration();
            o.distributorId = distributorId;
            o.nielsenPcmToId3Tagging = nielsenPcmToId3Tagging;
            return o;
        }
    }
}
