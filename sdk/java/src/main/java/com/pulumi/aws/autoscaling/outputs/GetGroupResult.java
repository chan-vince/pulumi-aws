// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.aws.autoscaling.outputs.GetGroupInstanceMaintenancePolicy;
import com.pulumi.aws.autoscaling.outputs.GetGroupLaunchTemplate;
import com.pulumi.aws.autoscaling.outputs.GetGroupMixedInstancesPolicy;
import com.pulumi.aws.autoscaling.outputs.GetGroupTag;
import com.pulumi.aws.autoscaling.outputs.GetGroupTrafficSource;
import com.pulumi.aws.autoscaling.outputs.GetGroupWarmPool;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGroupResult {
    /**
     * @return ARN of the Auto Scaling group.
     * 
     */
    private String arn;
    /**
     * @return One or more Availability Zones for the group.
     * 
     */
    private List<String> availabilityZones;
    private Integer defaultCooldown;
    /**
     * @return Desired size of the group.
     * 
     */
    private Integer desiredCapacity;
    /**
     * @return The unit of measurement for the value returned for `desired_capacity`.
     * 
     */
    private String desiredCapacityType;
    /**
     * @return List of metrics enabled for collection.
     * 
     */
    private List<String> enabledMetrics;
    /**
     * @return The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service.
     * 
     */
    private Integer healthCheckGracePeriod;
    /**
     * @return Service to use for the health checks. The valid values are EC2 and ELB.
     * 
     */
    private String healthCheckType;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Instance maintenance policy for the group.
     * 
     */
    private List<GetGroupInstanceMaintenancePolicy> instanceMaintenancePolicies;
    /**
     * @return The name of the associated launch configuration.
     * 
     */
    private String launchConfiguration;
    /**
     * @return List of launch templates along with the overrides.
     * 
     */
    private List<GetGroupLaunchTemplate> launchTemplates;
    /**
     * @return One or more load balancers associated with the group.
     * 
     */
    private List<String> loadBalancers;
    /**
     * @return Maximum amount of time, in seconds, that an instance can be in service.
     * 
     */
    private Integer maxInstanceLifetime;
    /**
     * @return Maximum size of the group.
     * 
     */
    private Integer maxSize;
    /**
     * @return Minimum number of instances to maintain in the warm pool.
     * 
     */
    private Integer minSize;
    /**
     * @return List of mixed instances policy objects for the group.
     * 
     */
    private List<GetGroupMixedInstancesPolicy> mixedInstancesPolicies;
    /**
     * @return Name of the Auto Scaling Group.
     * 
     */
    private String name;
    private Boolean newInstancesProtectedFromScaleIn;
    /**
     * @return Name of the placement group into which to launch your instances, if any. For more information, see Placement Groups (http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the Amazon Elastic Compute Cloud User Guide.
     * 
     */
    private String placementGroup;
    /**
     * @return Predicted capacity of the group.
     * 
     */
    private Integer predictedCapacity;
    /**
     * @return ARN of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf.
     * 
     */
    private String serviceLinkedRoleArn;
    /**
     * @return Current state of the group when DeleteAutoScalingGroup is in progress.
     * 
     */
    private String status;
    /**
     * @return List of processes suspended processes for the Auto Scaling Group.
     * 
     */
    private List<String> suspendedProcesses;
    /**
     * @return List of tags for the group.
     * 
     */
    private List<GetGroupTag> tags;
    /**
     * @return ARNs of the target groups for your load balancer.
     * 
     */
    private List<String> targetGroupArns;
    /**
     * @return The termination policies for the group.
     * 
     */
    private List<String> terminationPolicies;
    /**
     * @return Traffic sources.
     * 
     */
    private List<GetGroupTrafficSource> trafficSources;
    /**
     * @return VPC ID for the group.
     * 
     */
    private String vpcZoneIdentifier;
    /**
     * @return Current size of the warm pool.
     * 
     */
    private Integer warmPoolSize;
    /**
     * @return List of warm pool configuration objects.
     * 
     */
    private List<GetGroupWarmPool> warmPools;

    private GetGroupResult() {}
    /**
     * @return ARN of the Auto Scaling group.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return One or more Availability Zones for the group.
     * 
     */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }
    public Integer defaultCooldown() {
        return this.defaultCooldown;
    }
    /**
     * @return Desired size of the group.
     * 
     */
    public Integer desiredCapacity() {
        return this.desiredCapacity;
    }
    /**
     * @return The unit of measurement for the value returned for `desired_capacity`.
     * 
     */
    public String desiredCapacityType() {
        return this.desiredCapacityType;
    }
    /**
     * @return List of metrics enabled for collection.
     * 
     */
    public List<String> enabledMetrics() {
        return this.enabledMetrics;
    }
    /**
     * @return The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service.
     * 
     */
    public Integer healthCheckGracePeriod() {
        return this.healthCheckGracePeriod;
    }
    /**
     * @return Service to use for the health checks. The valid values are EC2 and ELB.
     * 
     */
    public String healthCheckType() {
        return this.healthCheckType;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Instance maintenance policy for the group.
     * 
     */
    public List<GetGroupInstanceMaintenancePolicy> instanceMaintenancePolicies() {
        return this.instanceMaintenancePolicies;
    }
    /**
     * @return The name of the associated launch configuration.
     * 
     */
    public String launchConfiguration() {
        return this.launchConfiguration;
    }
    /**
     * @return List of launch templates along with the overrides.
     * 
     */
    public List<GetGroupLaunchTemplate> launchTemplates() {
        return this.launchTemplates;
    }
    /**
     * @return One or more load balancers associated with the group.
     * 
     */
    public List<String> loadBalancers() {
        return this.loadBalancers;
    }
    /**
     * @return Maximum amount of time, in seconds, that an instance can be in service.
     * 
     */
    public Integer maxInstanceLifetime() {
        return this.maxInstanceLifetime;
    }
    /**
     * @return Maximum size of the group.
     * 
     */
    public Integer maxSize() {
        return this.maxSize;
    }
    /**
     * @return Minimum number of instances to maintain in the warm pool.
     * 
     */
    public Integer minSize() {
        return this.minSize;
    }
    /**
     * @return List of mixed instances policy objects for the group.
     * 
     */
    public List<GetGroupMixedInstancesPolicy> mixedInstancesPolicies() {
        return this.mixedInstancesPolicies;
    }
    /**
     * @return Name of the Auto Scaling Group.
     * 
     */
    public String name() {
        return this.name;
    }
    public Boolean newInstancesProtectedFromScaleIn() {
        return this.newInstancesProtectedFromScaleIn;
    }
    /**
     * @return Name of the placement group into which to launch your instances, if any. For more information, see Placement Groups (http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the Amazon Elastic Compute Cloud User Guide.
     * 
     */
    public String placementGroup() {
        return this.placementGroup;
    }
    /**
     * @return Predicted capacity of the group.
     * 
     */
    public Integer predictedCapacity() {
        return this.predictedCapacity;
    }
    /**
     * @return ARN of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf.
     * 
     */
    public String serviceLinkedRoleArn() {
        return this.serviceLinkedRoleArn;
    }
    /**
     * @return Current state of the group when DeleteAutoScalingGroup is in progress.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return List of processes suspended processes for the Auto Scaling Group.
     * 
     */
    public List<String> suspendedProcesses() {
        return this.suspendedProcesses;
    }
    /**
     * @return List of tags for the group.
     * 
     */
    public List<GetGroupTag> tags() {
        return this.tags;
    }
    /**
     * @return ARNs of the target groups for your load balancer.
     * 
     */
    public List<String> targetGroupArns() {
        return this.targetGroupArns;
    }
    /**
     * @return The termination policies for the group.
     * 
     */
    public List<String> terminationPolicies() {
        return this.terminationPolicies;
    }
    /**
     * @return Traffic sources.
     * 
     */
    public List<GetGroupTrafficSource> trafficSources() {
        return this.trafficSources;
    }
    /**
     * @return VPC ID for the group.
     * 
     */
    public String vpcZoneIdentifier() {
        return this.vpcZoneIdentifier;
    }
    /**
     * @return Current size of the warm pool.
     * 
     */
    public Integer warmPoolSize() {
        return this.warmPoolSize;
    }
    /**
     * @return List of warm pool configuration objects.
     * 
     */
    public List<GetGroupWarmPool> warmPools() {
        return this.warmPools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private List<String> availabilityZones;
        private Integer defaultCooldown;
        private Integer desiredCapacity;
        private String desiredCapacityType;
        private List<String> enabledMetrics;
        private Integer healthCheckGracePeriod;
        private String healthCheckType;
        private String id;
        private List<GetGroupInstanceMaintenancePolicy> instanceMaintenancePolicies;
        private String launchConfiguration;
        private List<GetGroupLaunchTemplate> launchTemplates;
        private List<String> loadBalancers;
        private Integer maxInstanceLifetime;
        private Integer maxSize;
        private Integer minSize;
        private List<GetGroupMixedInstancesPolicy> mixedInstancesPolicies;
        private String name;
        private Boolean newInstancesProtectedFromScaleIn;
        private String placementGroup;
        private Integer predictedCapacity;
        private String serviceLinkedRoleArn;
        private String status;
        private List<String> suspendedProcesses;
        private List<GetGroupTag> tags;
        private List<String> targetGroupArns;
        private List<String> terminationPolicies;
        private List<GetGroupTrafficSource> trafficSources;
        private String vpcZoneIdentifier;
        private Integer warmPoolSize;
        private List<GetGroupWarmPool> warmPools;
        public Builder() {}
        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.defaultCooldown = defaults.defaultCooldown;
    	      this.desiredCapacity = defaults.desiredCapacity;
    	      this.desiredCapacityType = defaults.desiredCapacityType;
    	      this.enabledMetrics = defaults.enabledMetrics;
    	      this.healthCheckGracePeriod = defaults.healthCheckGracePeriod;
    	      this.healthCheckType = defaults.healthCheckType;
    	      this.id = defaults.id;
    	      this.instanceMaintenancePolicies = defaults.instanceMaintenancePolicies;
    	      this.launchConfiguration = defaults.launchConfiguration;
    	      this.launchTemplates = defaults.launchTemplates;
    	      this.loadBalancers = defaults.loadBalancers;
    	      this.maxInstanceLifetime = defaults.maxInstanceLifetime;
    	      this.maxSize = defaults.maxSize;
    	      this.minSize = defaults.minSize;
    	      this.mixedInstancesPolicies = defaults.mixedInstancesPolicies;
    	      this.name = defaults.name;
    	      this.newInstancesProtectedFromScaleIn = defaults.newInstancesProtectedFromScaleIn;
    	      this.placementGroup = defaults.placementGroup;
    	      this.predictedCapacity = defaults.predictedCapacity;
    	      this.serviceLinkedRoleArn = defaults.serviceLinkedRoleArn;
    	      this.status = defaults.status;
    	      this.suspendedProcesses = defaults.suspendedProcesses;
    	      this.tags = defaults.tags;
    	      this.targetGroupArns = defaults.targetGroupArns;
    	      this.terminationPolicies = defaults.terminationPolicies;
    	      this.trafficSources = defaults.trafficSources;
    	      this.vpcZoneIdentifier = defaults.vpcZoneIdentifier;
    	      this.warmPoolSize = defaults.warmPoolSize;
    	      this.warmPools = defaults.warmPools;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        @CustomType.Setter
        public Builder defaultCooldown(Integer defaultCooldown) {
            this.defaultCooldown = Objects.requireNonNull(defaultCooldown);
            return this;
        }
        @CustomType.Setter
        public Builder desiredCapacity(Integer desiredCapacity) {
            this.desiredCapacity = Objects.requireNonNull(desiredCapacity);
            return this;
        }
        @CustomType.Setter
        public Builder desiredCapacityType(String desiredCapacityType) {
            this.desiredCapacityType = Objects.requireNonNull(desiredCapacityType);
            return this;
        }
        @CustomType.Setter
        public Builder enabledMetrics(List<String> enabledMetrics) {
            this.enabledMetrics = Objects.requireNonNull(enabledMetrics);
            return this;
        }
        public Builder enabledMetrics(String... enabledMetrics) {
            return enabledMetrics(List.of(enabledMetrics));
        }
        @CustomType.Setter
        public Builder healthCheckGracePeriod(Integer healthCheckGracePeriod) {
            this.healthCheckGracePeriod = Objects.requireNonNull(healthCheckGracePeriod);
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckType(String healthCheckType) {
            this.healthCheckType = Objects.requireNonNull(healthCheckType);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceMaintenancePolicies(List<GetGroupInstanceMaintenancePolicy> instanceMaintenancePolicies) {
            this.instanceMaintenancePolicies = Objects.requireNonNull(instanceMaintenancePolicies);
            return this;
        }
        public Builder instanceMaintenancePolicies(GetGroupInstanceMaintenancePolicy... instanceMaintenancePolicies) {
            return instanceMaintenancePolicies(List.of(instanceMaintenancePolicies));
        }
        @CustomType.Setter
        public Builder launchConfiguration(String launchConfiguration) {
            this.launchConfiguration = Objects.requireNonNull(launchConfiguration);
            return this;
        }
        @CustomType.Setter
        public Builder launchTemplates(List<GetGroupLaunchTemplate> launchTemplates) {
            this.launchTemplates = Objects.requireNonNull(launchTemplates);
            return this;
        }
        public Builder launchTemplates(GetGroupLaunchTemplate... launchTemplates) {
            return launchTemplates(List.of(launchTemplates));
        }
        @CustomType.Setter
        public Builder loadBalancers(List<String> loadBalancers) {
            this.loadBalancers = Objects.requireNonNull(loadBalancers);
            return this;
        }
        public Builder loadBalancers(String... loadBalancers) {
            return loadBalancers(List.of(loadBalancers));
        }
        @CustomType.Setter
        public Builder maxInstanceLifetime(Integer maxInstanceLifetime) {
            this.maxInstanceLifetime = Objects.requireNonNull(maxInstanceLifetime);
            return this;
        }
        @CustomType.Setter
        public Builder maxSize(Integer maxSize) {
            this.maxSize = Objects.requireNonNull(maxSize);
            return this;
        }
        @CustomType.Setter
        public Builder minSize(Integer minSize) {
            this.minSize = Objects.requireNonNull(minSize);
            return this;
        }
        @CustomType.Setter
        public Builder mixedInstancesPolicies(List<GetGroupMixedInstancesPolicy> mixedInstancesPolicies) {
            this.mixedInstancesPolicies = Objects.requireNonNull(mixedInstancesPolicies);
            return this;
        }
        public Builder mixedInstancesPolicies(GetGroupMixedInstancesPolicy... mixedInstancesPolicies) {
            return mixedInstancesPolicies(List.of(mixedInstancesPolicies));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder newInstancesProtectedFromScaleIn(Boolean newInstancesProtectedFromScaleIn) {
            this.newInstancesProtectedFromScaleIn = Objects.requireNonNull(newInstancesProtectedFromScaleIn);
            return this;
        }
        @CustomType.Setter
        public Builder placementGroup(String placementGroup) {
            this.placementGroup = Objects.requireNonNull(placementGroup);
            return this;
        }
        @CustomType.Setter
        public Builder predictedCapacity(Integer predictedCapacity) {
            this.predictedCapacity = Objects.requireNonNull(predictedCapacity);
            return this;
        }
        @CustomType.Setter
        public Builder serviceLinkedRoleArn(String serviceLinkedRoleArn) {
            this.serviceLinkedRoleArn = Objects.requireNonNull(serviceLinkedRoleArn);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder suspendedProcesses(List<String> suspendedProcesses) {
            this.suspendedProcesses = Objects.requireNonNull(suspendedProcesses);
            return this;
        }
        public Builder suspendedProcesses(String... suspendedProcesses) {
            return suspendedProcesses(List.of(suspendedProcesses));
        }
        @CustomType.Setter
        public Builder tags(List<GetGroupTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetGroupTag... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder targetGroupArns(List<String> targetGroupArns) {
            this.targetGroupArns = Objects.requireNonNull(targetGroupArns);
            return this;
        }
        public Builder targetGroupArns(String... targetGroupArns) {
            return targetGroupArns(List.of(targetGroupArns));
        }
        @CustomType.Setter
        public Builder terminationPolicies(List<String> terminationPolicies) {
            this.terminationPolicies = Objects.requireNonNull(terminationPolicies);
            return this;
        }
        public Builder terminationPolicies(String... terminationPolicies) {
            return terminationPolicies(List.of(terminationPolicies));
        }
        @CustomType.Setter
        public Builder trafficSources(List<GetGroupTrafficSource> trafficSources) {
            this.trafficSources = Objects.requireNonNull(trafficSources);
            return this;
        }
        public Builder trafficSources(GetGroupTrafficSource... trafficSources) {
            return trafficSources(List.of(trafficSources));
        }
        @CustomType.Setter
        public Builder vpcZoneIdentifier(String vpcZoneIdentifier) {
            this.vpcZoneIdentifier = Objects.requireNonNull(vpcZoneIdentifier);
            return this;
        }
        @CustomType.Setter
        public Builder warmPoolSize(Integer warmPoolSize) {
            this.warmPoolSize = Objects.requireNonNull(warmPoolSize);
            return this;
        }
        @CustomType.Setter
        public Builder warmPools(List<GetGroupWarmPool> warmPools) {
            this.warmPools = Objects.requireNonNull(warmPools);
            return this;
        }
        public Builder warmPools(GetGroupWarmPool... warmPools) {
            return warmPools(List.of(warmPools));
        }
        public GetGroupResult build() {
            final var o = new GetGroupResult();
            o.arn = arn;
            o.availabilityZones = availabilityZones;
            o.defaultCooldown = defaultCooldown;
            o.desiredCapacity = desiredCapacity;
            o.desiredCapacityType = desiredCapacityType;
            o.enabledMetrics = enabledMetrics;
            o.healthCheckGracePeriod = healthCheckGracePeriod;
            o.healthCheckType = healthCheckType;
            o.id = id;
            o.instanceMaintenancePolicies = instanceMaintenancePolicies;
            o.launchConfiguration = launchConfiguration;
            o.launchTemplates = launchTemplates;
            o.loadBalancers = loadBalancers;
            o.maxInstanceLifetime = maxInstanceLifetime;
            o.maxSize = maxSize;
            o.minSize = minSize;
            o.mixedInstancesPolicies = mixedInstancesPolicies;
            o.name = name;
            o.newInstancesProtectedFromScaleIn = newInstancesProtectedFromScaleIn;
            o.placementGroup = placementGroup;
            o.predictedCapacity = predictedCapacity;
            o.serviceLinkedRoleArn = serviceLinkedRoleArn;
            o.status = status;
            o.suspendedProcesses = suspendedProcesses;
            o.tags = tags;
            o.targetGroupArns = targetGroupArns;
            o.terminationPolicies = terminationPolicies;
            o.trafficSources = trafficSources;
            o.vpcZoneIdentifier = vpcZoneIdentifier;
            o.warmPoolSize = warmPoolSize;
            o.warmPools = warmPools;
            return o;
        }
    }
}
