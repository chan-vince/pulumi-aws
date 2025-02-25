// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AddonArgs, AddonState } from "./addon";
export type Addon = import("./addon").Addon;
export const Addon: typeof import("./addon").Addon = null as any;
utilities.lazyLoad(exports, ["Addon"], () => require("./addon"));

export { ClusterArgs, ClusterState } from "./cluster";
export type Cluster = import("./cluster").Cluster;
export const Cluster: typeof import("./cluster").Cluster = null as any;
utilities.lazyLoad(exports, ["Cluster"], () => require("./cluster"));

export { FargateProfileArgs, FargateProfileState } from "./fargateProfile";
export type FargateProfile = import("./fargateProfile").FargateProfile;
export const FargateProfile: typeof import("./fargateProfile").FargateProfile = null as any;
utilities.lazyLoad(exports, ["FargateProfile"], () => require("./fargateProfile"));

export { GetAddonArgs, GetAddonResult, GetAddonOutputArgs } from "./getAddon";
export const getAddon: typeof import("./getAddon").getAddon = null as any;
export const getAddonOutput: typeof import("./getAddon").getAddonOutput = null as any;
utilities.lazyLoad(exports, ["getAddon","getAddonOutput"], () => require("./getAddon"));

export { GetAddonVersionArgs, GetAddonVersionResult, GetAddonVersionOutputArgs } from "./getAddonVersion";
export const getAddonVersion: typeof import("./getAddonVersion").getAddonVersion = null as any;
export const getAddonVersionOutput: typeof import("./getAddonVersion").getAddonVersionOutput = null as any;
utilities.lazyLoad(exports, ["getAddonVersion","getAddonVersionOutput"], () => require("./getAddonVersion"));

export { GetClusterArgs, GetClusterResult, GetClusterOutputArgs } from "./getCluster";
export const getCluster: typeof import("./getCluster").getCluster = null as any;
export const getClusterOutput: typeof import("./getCluster").getClusterOutput = null as any;
utilities.lazyLoad(exports, ["getCluster","getClusterOutput"], () => require("./getCluster"));

export { GetClusterAuthArgs, GetClusterAuthResult, GetClusterAuthOutputArgs } from "./getClusterAuth";
export const getClusterAuth: typeof import("./getClusterAuth").getClusterAuth = null as any;
export const getClusterAuthOutput: typeof import("./getClusterAuth").getClusterAuthOutput = null as any;
utilities.lazyLoad(exports, ["getClusterAuth","getClusterAuthOutput"], () => require("./getClusterAuth"));

export { GetClustersResult } from "./getClusters";
export const getClusters: typeof import("./getClusters").getClusters = null as any;
export const getClustersOutput: typeof import("./getClusters").getClustersOutput = null as any;
utilities.lazyLoad(exports, ["getClusters","getClustersOutput"], () => require("./getClusters"));

export { GetNodeGroupArgs, GetNodeGroupResult, GetNodeGroupOutputArgs } from "./getNodeGroup";
export const getNodeGroup: typeof import("./getNodeGroup").getNodeGroup = null as any;
export const getNodeGroupOutput: typeof import("./getNodeGroup").getNodeGroupOutput = null as any;
utilities.lazyLoad(exports, ["getNodeGroup","getNodeGroupOutput"], () => require("./getNodeGroup"));

export { GetNodeGroupsArgs, GetNodeGroupsResult, GetNodeGroupsOutputArgs } from "./getNodeGroups";
export const getNodeGroups: typeof import("./getNodeGroups").getNodeGroups = null as any;
export const getNodeGroupsOutput: typeof import("./getNodeGroups").getNodeGroupsOutput = null as any;
utilities.lazyLoad(exports, ["getNodeGroups","getNodeGroupsOutput"], () => require("./getNodeGroups"));

export { IdentityProviderConfigArgs, IdentityProviderConfigState } from "./identityProviderConfig";
export type IdentityProviderConfig = import("./identityProviderConfig").IdentityProviderConfig;
export const IdentityProviderConfig: typeof import("./identityProviderConfig").IdentityProviderConfig = null as any;
utilities.lazyLoad(exports, ["IdentityProviderConfig"], () => require("./identityProviderConfig"));

export { NodeGroupArgs, NodeGroupState } from "./nodeGroup";
export type NodeGroup = import("./nodeGroup").NodeGroup;
export const NodeGroup: typeof import("./nodeGroup").NodeGroup = null as any;
utilities.lazyLoad(exports, ["NodeGroup"], () => require("./nodeGroup"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:eks/addon:Addon":
                return new Addon(name, <any>undefined, { urn })
            case "aws:eks/cluster:Cluster":
                return new Cluster(name, <any>undefined, { urn })
            case "aws:eks/fargateProfile:FargateProfile":
                return new FargateProfile(name, <any>undefined, { urn })
            case "aws:eks/identityProviderConfig:IdentityProviderConfig":
                return new IdentityProviderConfig(name, <any>undefined, { urn })
            case "aws:eks/nodeGroup:NodeGroup":
                return new NodeGroup(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "eks/addon", _module)
pulumi.runtime.registerResourceModule("aws", "eks/cluster", _module)
pulumi.runtime.registerResourceModule("aws", "eks/fargateProfile", _module)
pulumi.runtime.registerResourceModule("aws", "eks/identityProviderConfig", _module)
pulumi.runtime.registerResourceModule("aws", "eks/nodeGroup", _module)
