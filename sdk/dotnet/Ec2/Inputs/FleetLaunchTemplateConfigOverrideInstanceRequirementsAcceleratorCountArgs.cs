// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorCountArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum number of vCPUs. To specify no maximum limit, omit this parameter.
        /// </summary>
        [Input("max")]
        public Input<int>? Max { get; set; }

        /// <summary>
        /// The minimum number of vCPUs. To specify no minimum limit, specify `0`.
        /// </summary>
        [Input("min")]
        public Input<int>? Min { get; set; }

        public FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorCountArgs()
        {
        }
        public static new FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorCountArgs Empty => new FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorCountArgs();
    }
}
