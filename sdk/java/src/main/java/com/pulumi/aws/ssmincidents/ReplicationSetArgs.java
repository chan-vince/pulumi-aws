// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssmincidents;

import com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReplicationSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicationSetArgs Empty = new ReplicationSetArgs();

    @Import(name="regions", required=true)
    private Output<List<ReplicationSetRegionArgs>> regions;

    public Output<List<ReplicationSetRegionArgs>> regions() {
        return this.regions;
    }

    /**
     * Tags applied to the replication set.
     * 
     * For information about the maximum allowed number of Regions and tag value constraints, see [CreateReplicationSet in the *AWS Systems Manager Incident Manager API Reference*](https://docs.aws.amazon.com/incident-manager/latest/APIReference/API_CreateReplicationSet.html).
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Tags applied to the replication set.
     * 
     * For information about the maximum allowed number of Regions and tag value constraints, see [CreateReplicationSet in the *AWS Systems Manager Incident Manager API Reference*](https://docs.aws.amazon.com/incident-manager/latest/APIReference/API_CreateReplicationSet.html).
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ReplicationSetArgs() {}

    private ReplicationSetArgs(ReplicationSetArgs $) {
        this.regions = $.regions;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationSetArgs $;

        public Builder() {
            $ = new ReplicationSetArgs();
        }

        public Builder(ReplicationSetArgs defaults) {
            $ = new ReplicationSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder regions(Output<List<ReplicationSetRegionArgs>> regions) {
            $.regions = regions;
            return this;
        }

        public Builder regions(List<ReplicationSetRegionArgs> regions) {
            return regions(Output.of(regions));
        }

        public Builder regions(ReplicationSetRegionArgs... regions) {
            return regions(List.of(regions));
        }

        /**
         * @param tags Tags applied to the replication set.
         * 
         * For information about the maximum allowed number of Regions and tag value constraints, see [CreateReplicationSet in the *AWS Systems Manager Incident Manager API Reference*](https://docs.aws.amazon.com/incident-manager/latest/APIReference/API_CreateReplicationSet.html).
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags applied to the replication set.
         * 
         * For information about the maximum allowed number of Regions and tag value constraints, see [CreateReplicationSet in the *AWS Systems Manager Incident Manager API Reference*](https://docs.aws.amazon.com/incident-manager/latest/APIReference/API_CreateReplicationSet.html).
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ReplicationSetArgs build() {
            $.regions = Objects.requireNonNull($.regions, "expected parameter 'regions' to be non-null");
            return $;
        }
    }

}
