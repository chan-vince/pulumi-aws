// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.aws.medialive.inputs.ChannelDestinationMediaPackageSettingArgs;
import com.pulumi.aws.medialive.inputs.ChannelDestinationMultiplexSettingsArgs;
import com.pulumi.aws.medialive.inputs.ChannelDestinationSettingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelDestinationArgs Empty = new ChannelDestinationArgs();

    /**
     * User-specified id. Ths is used in an output group or an output.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return User-specified id. Ths is used in an output group or an output.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Destination settings for a MediaPackage output; one destination for both encoders. See Media Package Settings for more details.
     * 
     */
    @Import(name="mediaPackageSettings")
    private @Nullable Output<List<ChannelDestinationMediaPackageSettingArgs>> mediaPackageSettings;

    /**
     * @return Destination settings for a MediaPackage output; one destination for both encoders. See Media Package Settings for more details.
     * 
     */
    public Optional<Output<List<ChannelDestinationMediaPackageSettingArgs>>> mediaPackageSettings() {
        return Optional.ofNullable(this.mediaPackageSettings);
    }

    /**
     * Destination settings for a Multiplex output; one destination for both encoders. See Multiplex Settings for more details.
     * 
     */
    @Import(name="multiplexSettings")
    private @Nullable Output<ChannelDestinationMultiplexSettingsArgs> multiplexSettings;

    /**
     * @return Destination settings for a Multiplex output; one destination for both encoders. See Multiplex Settings for more details.
     * 
     */
    public Optional<Output<ChannelDestinationMultiplexSettingsArgs>> multiplexSettings() {
        return Optional.ofNullable(this.multiplexSettings);
    }

    /**
     * Destination settings for a standard output; one destination for each redundant encoder. See Settings for more details.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<List<ChannelDestinationSettingArgs>> settings;

    /**
     * @return Destination settings for a standard output; one destination for each redundant encoder. See Settings for more details.
     * 
     */
    public Optional<Output<List<ChannelDestinationSettingArgs>>> settings() {
        return Optional.ofNullable(this.settings);
    }

    private ChannelDestinationArgs() {}

    private ChannelDestinationArgs(ChannelDestinationArgs $) {
        this.id = $.id;
        this.mediaPackageSettings = $.mediaPackageSettings;
        this.multiplexSettings = $.multiplexSettings;
        this.settings = $.settings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelDestinationArgs $;

        public Builder() {
            $ = new ChannelDestinationArgs();
        }

        public Builder(ChannelDestinationArgs defaults) {
            $ = new ChannelDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id User-specified id. Ths is used in an output group or an output.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id User-specified id. Ths is used in an output group or an output.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param mediaPackageSettings Destination settings for a MediaPackage output; one destination for both encoders. See Media Package Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder mediaPackageSettings(@Nullable Output<List<ChannelDestinationMediaPackageSettingArgs>> mediaPackageSettings) {
            $.mediaPackageSettings = mediaPackageSettings;
            return this;
        }

        /**
         * @param mediaPackageSettings Destination settings for a MediaPackage output; one destination for both encoders. See Media Package Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder mediaPackageSettings(List<ChannelDestinationMediaPackageSettingArgs> mediaPackageSettings) {
            return mediaPackageSettings(Output.of(mediaPackageSettings));
        }

        /**
         * @param mediaPackageSettings Destination settings for a MediaPackage output; one destination for both encoders. See Media Package Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder mediaPackageSettings(ChannelDestinationMediaPackageSettingArgs... mediaPackageSettings) {
            return mediaPackageSettings(List.of(mediaPackageSettings));
        }

        /**
         * @param multiplexSettings Destination settings for a Multiplex output; one destination for both encoders. See Multiplex Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder multiplexSettings(@Nullable Output<ChannelDestinationMultiplexSettingsArgs> multiplexSettings) {
            $.multiplexSettings = multiplexSettings;
            return this;
        }

        /**
         * @param multiplexSettings Destination settings for a Multiplex output; one destination for both encoders. See Multiplex Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder multiplexSettings(ChannelDestinationMultiplexSettingsArgs multiplexSettings) {
            return multiplexSettings(Output.of(multiplexSettings));
        }

        /**
         * @param settings Destination settings for a standard output; one destination for each redundant encoder. See Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<List<ChannelDestinationSettingArgs>> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings Destination settings for a standard output; one destination for each redundant encoder. See Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder settings(List<ChannelDestinationSettingArgs> settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param settings Destination settings for a standard output; one destination for each redundant encoder. See Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder settings(ChannelDestinationSettingArgs... settings) {
            return settings(List.of(settings));
        }

        public ChannelDestinationArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
