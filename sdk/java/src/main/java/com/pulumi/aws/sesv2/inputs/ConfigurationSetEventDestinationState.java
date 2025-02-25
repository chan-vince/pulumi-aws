// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sesv2.inputs;

import com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationSetEventDestinationState extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationSetEventDestinationState Empty = new ConfigurationSetEventDestinationState();

    /**
     * The name of the configuration set.
     * 
     */
    @Import(name="configurationSetName")
    private @Nullable Output<String> configurationSetName;

    /**
     * @return The name of the configuration set.
     * 
     */
    public Optional<Output<String>> configurationSetName() {
        return Optional.ofNullable(this.configurationSetName);
    }

    /**
     * A name that identifies the event destination within the configuration set.
     * 
     */
    @Import(name="eventDestination")
    private @Nullable Output<ConfigurationSetEventDestinationEventDestinationArgs> eventDestination;

    /**
     * @return A name that identifies the event destination within the configuration set.
     * 
     */
    public Optional<Output<ConfigurationSetEventDestinationEventDestinationArgs>> eventDestination() {
        return Optional.ofNullable(this.eventDestination);
    }

    /**
     * An object that defines the event destination. See event_destination below.
     * 
     */
    @Import(name="eventDestinationName")
    private @Nullable Output<String> eventDestinationName;

    /**
     * @return An object that defines the event destination. See event_destination below.
     * 
     */
    public Optional<Output<String>> eventDestinationName() {
        return Optional.ofNullable(this.eventDestinationName);
    }

    private ConfigurationSetEventDestinationState() {}

    private ConfigurationSetEventDestinationState(ConfigurationSetEventDestinationState $) {
        this.configurationSetName = $.configurationSetName;
        this.eventDestination = $.eventDestination;
        this.eventDestinationName = $.eventDestinationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationSetEventDestinationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationSetEventDestinationState $;

        public Builder() {
            $ = new ConfigurationSetEventDestinationState();
        }

        public Builder(ConfigurationSetEventDestinationState defaults) {
            $ = new ConfigurationSetEventDestinationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationSetName The name of the configuration set.
         * 
         * @return builder
         * 
         */
        public Builder configurationSetName(@Nullable Output<String> configurationSetName) {
            $.configurationSetName = configurationSetName;
            return this;
        }

        /**
         * @param configurationSetName The name of the configuration set.
         * 
         * @return builder
         * 
         */
        public Builder configurationSetName(String configurationSetName) {
            return configurationSetName(Output.of(configurationSetName));
        }

        /**
         * @param eventDestination A name that identifies the event destination within the configuration set.
         * 
         * @return builder
         * 
         */
        public Builder eventDestination(@Nullable Output<ConfigurationSetEventDestinationEventDestinationArgs> eventDestination) {
            $.eventDestination = eventDestination;
            return this;
        }

        /**
         * @param eventDestination A name that identifies the event destination within the configuration set.
         * 
         * @return builder
         * 
         */
        public Builder eventDestination(ConfigurationSetEventDestinationEventDestinationArgs eventDestination) {
            return eventDestination(Output.of(eventDestination));
        }

        /**
         * @param eventDestinationName An object that defines the event destination. See event_destination below.
         * 
         * @return builder
         * 
         */
        public Builder eventDestinationName(@Nullable Output<String> eventDestinationName) {
            $.eventDestinationName = eventDestinationName;
            return this;
        }

        /**
         * @param eventDestinationName An object that defines the event destination. See event_destination below.
         * 
         * @return builder
         * 
         */
        public Builder eventDestinationName(String eventDestinationName) {
            return eventDestinationName(Output.of(eventDestinationName));
        }

        public ConfigurationSetEventDestinationState build() {
            return $;
        }
    }

}
