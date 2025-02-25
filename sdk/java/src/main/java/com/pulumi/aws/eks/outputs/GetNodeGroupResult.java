// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.outputs;

import com.pulumi.aws.eks.outputs.GetNodeGroupLaunchTemplate;
import com.pulumi.aws.eks.outputs.GetNodeGroupRemoteAccess;
import com.pulumi.aws.eks.outputs.GetNodeGroupResource;
import com.pulumi.aws.eks.outputs.GetNodeGroupScalingConfig;
import com.pulumi.aws.eks.outputs.GetNodeGroupTaint;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNodeGroupResult {
    /**
     * @return Type of Amazon Machine Image (AMI) associated with the EKS Node Group.
     * 
     */
    private String amiType;
    /**
     * @return ARN of the EKS Node Group.
     * 
     */
    private String arn;
    /**
     * @return Type of capacity associated with the EKS Node Group. Valid values: `ON_DEMAND`, `SPOT`.
     * 
     */
    private String capacityType;
    private String clusterName;
    /**
     * @return Disk size in GiB for worker nodes.
     * 
     */
    private Integer diskSize;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Set of instance types associated with the EKS Node Group.
     * 
     */
    private List<String> instanceTypes;
    /**
     * @return Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return Nested attribute containing information about the launch template used to create the EKS Node Group.
     * 
     */
    private List<GetNodeGroupLaunchTemplate> launchTemplates;
    private String nodeGroupName;
    /**
     * @return ARN of the IAM Role that provides permissions for the EKS Node Group.
     * 
     */
    private String nodeRoleArn;
    /**
     * @return AMI version of the EKS Node Group.
     * 
     */
    private String releaseVersion;
    /**
     * @return Configuration block with remote access settings.
     * 
     */
    private List<GetNodeGroupRemoteAccess> remoteAccesses;
    /**
     * @return List of objects containing information about underlying resources.
     * 
     */
    private List<GetNodeGroupResource> resources;
    /**
     * @return Configuration block with scaling settings.
     * 
     */
    private List<GetNodeGroupScalingConfig> scalingConfigs;
    /**
     * @return Status of the EKS Node Group.
     * 
     */
    private String status;
    /**
     * @return Identifiers of EC2 Subnets to associate with the EKS Node Group.
     * 
     */
    private List<String> subnetIds;
    /**
     * @return Key-value map of resource tags.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return List of objects containing information about taints applied to the nodes in the EKS Node Group.
     * 
     */
    private List<GetNodeGroupTaint> taints;
    /**
     * @return Kubernetes version.
     * 
     */
    private String version;

    private GetNodeGroupResult() {}
    /**
     * @return Type of Amazon Machine Image (AMI) associated with the EKS Node Group.
     * 
     */
    public String amiType() {
        return this.amiType;
    }
    /**
     * @return ARN of the EKS Node Group.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Type of capacity associated with the EKS Node Group. Valid values: `ON_DEMAND`, `SPOT`.
     * 
     */
    public String capacityType() {
        return this.capacityType;
    }
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return Disk size in GiB for worker nodes.
     * 
     */
    public Integer diskSize() {
        return this.diskSize;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Set of instance types associated with the EKS Node Group.
     * 
     */
    public List<String> instanceTypes() {
        return this.instanceTypes;
    }
    /**
     * @return Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Nested attribute containing information about the launch template used to create the EKS Node Group.
     * 
     */
    public List<GetNodeGroupLaunchTemplate> launchTemplates() {
        return this.launchTemplates;
    }
    public String nodeGroupName() {
        return this.nodeGroupName;
    }
    /**
     * @return ARN of the IAM Role that provides permissions for the EKS Node Group.
     * 
     */
    public String nodeRoleArn() {
        return this.nodeRoleArn;
    }
    /**
     * @return AMI version of the EKS Node Group.
     * 
     */
    public String releaseVersion() {
        return this.releaseVersion;
    }
    /**
     * @return Configuration block with remote access settings.
     * 
     */
    public List<GetNodeGroupRemoteAccess> remoteAccesses() {
        return this.remoteAccesses;
    }
    /**
     * @return List of objects containing information about underlying resources.
     * 
     */
    public List<GetNodeGroupResource> resources() {
        return this.resources;
    }
    /**
     * @return Configuration block with scaling settings.
     * 
     */
    public List<GetNodeGroupScalingConfig> scalingConfigs() {
        return this.scalingConfigs;
    }
    /**
     * @return Status of the EKS Node Group.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Identifiers of EC2 Subnets to associate with the EKS Node Group.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * @return Key-value map of resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return List of objects containing information about taints applied to the nodes in the EKS Node Group.
     * 
     */
    public List<GetNodeGroupTaint> taints() {
        return this.taints;
    }
    /**
     * @return Kubernetes version.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String amiType;
        private String arn;
        private String capacityType;
        private String clusterName;
        private Integer diskSize;
        private String id;
        private List<String> instanceTypes;
        private Map<String,String> labels;
        private List<GetNodeGroupLaunchTemplate> launchTemplates;
        private String nodeGroupName;
        private String nodeRoleArn;
        private String releaseVersion;
        private List<GetNodeGroupRemoteAccess> remoteAccesses;
        private List<GetNodeGroupResource> resources;
        private List<GetNodeGroupScalingConfig> scalingConfigs;
        private String status;
        private List<String> subnetIds;
        private Map<String,String> tags;
        private List<GetNodeGroupTaint> taints;
        private String version;
        public Builder() {}
        public Builder(GetNodeGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiType = defaults.amiType;
    	      this.arn = defaults.arn;
    	      this.capacityType = defaults.capacityType;
    	      this.clusterName = defaults.clusterName;
    	      this.diskSize = defaults.diskSize;
    	      this.id = defaults.id;
    	      this.instanceTypes = defaults.instanceTypes;
    	      this.labels = defaults.labels;
    	      this.launchTemplates = defaults.launchTemplates;
    	      this.nodeGroupName = defaults.nodeGroupName;
    	      this.nodeRoleArn = defaults.nodeRoleArn;
    	      this.releaseVersion = defaults.releaseVersion;
    	      this.remoteAccesses = defaults.remoteAccesses;
    	      this.resources = defaults.resources;
    	      this.scalingConfigs = defaults.scalingConfigs;
    	      this.status = defaults.status;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder amiType(String amiType) {
            this.amiType = Objects.requireNonNull(amiType);
            return this;
        }
        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder capacityType(String capacityType) {
            this.capacityType = Objects.requireNonNull(capacityType);
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        @CustomType.Setter
        public Builder diskSize(Integer diskSize) {
            this.diskSize = Objects.requireNonNull(diskSize);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceTypes(List<String> instanceTypes) {
            this.instanceTypes = Objects.requireNonNull(instanceTypes);
            return this;
        }
        public Builder instanceTypes(String... instanceTypes) {
            return instanceTypes(List.of(instanceTypes));
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder launchTemplates(List<GetNodeGroupLaunchTemplate> launchTemplates) {
            this.launchTemplates = Objects.requireNonNull(launchTemplates);
            return this;
        }
        public Builder launchTemplates(GetNodeGroupLaunchTemplate... launchTemplates) {
            return launchTemplates(List.of(launchTemplates));
        }
        @CustomType.Setter
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = Objects.requireNonNull(nodeGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder nodeRoleArn(String nodeRoleArn) {
            this.nodeRoleArn = Objects.requireNonNull(nodeRoleArn);
            return this;
        }
        @CustomType.Setter
        public Builder releaseVersion(String releaseVersion) {
            this.releaseVersion = Objects.requireNonNull(releaseVersion);
            return this;
        }
        @CustomType.Setter
        public Builder remoteAccesses(List<GetNodeGroupRemoteAccess> remoteAccesses) {
            this.remoteAccesses = Objects.requireNonNull(remoteAccesses);
            return this;
        }
        public Builder remoteAccesses(GetNodeGroupRemoteAccess... remoteAccesses) {
            return remoteAccesses(List.of(remoteAccesses));
        }
        @CustomType.Setter
        public Builder resources(List<GetNodeGroupResource> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(GetNodeGroupResource... resources) {
            return resources(List.of(resources));
        }
        @CustomType.Setter
        public Builder scalingConfigs(List<GetNodeGroupScalingConfig> scalingConfigs) {
            this.scalingConfigs = Objects.requireNonNull(scalingConfigs);
            return this;
        }
        public Builder scalingConfigs(GetNodeGroupScalingConfig... scalingConfigs) {
            return scalingConfigs(List.of(scalingConfigs));
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder taints(List<GetNodeGroupTaint> taints) {
            this.taints = Objects.requireNonNull(taints);
            return this;
        }
        public Builder taints(GetNodeGroupTaint... taints) {
            return taints(List.of(taints));
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetNodeGroupResult build() {
            final var o = new GetNodeGroupResult();
            o.amiType = amiType;
            o.arn = arn;
            o.capacityType = capacityType;
            o.clusterName = clusterName;
            o.diskSize = diskSize;
            o.id = id;
            o.instanceTypes = instanceTypes;
            o.labels = labels;
            o.launchTemplates = launchTemplates;
            o.nodeGroupName = nodeGroupName;
            o.nodeRoleArn = nodeRoleArn;
            o.releaseVersion = releaseVersion;
            o.remoteAccesses = remoteAccesses;
            o.resources = resources;
            o.scalingConfigs = scalingConfigs;
            o.status = status;
            o.subnetIds = subnetIds;
            o.tags = tags;
            o.taints = taints;
            o.version = version;
            return o;
        }
    }
}
