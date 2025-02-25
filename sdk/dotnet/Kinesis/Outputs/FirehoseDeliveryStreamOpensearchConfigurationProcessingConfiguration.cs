// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kinesis.Outputs
{

    [OutputType]
    public sealed class FirehoseDeliveryStreamOpensearchConfigurationProcessingConfiguration
    {
        /// <summary>
        /// Enables or disables data processing.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Array of data processors. More details are given below
        /// </summary>
        public readonly ImmutableArray<Outputs.FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessor> Processors;

        [OutputConstructor]
        private FirehoseDeliveryStreamOpensearchConfigurationProcessingConfiguration(
            bool? enabled,

            ImmutableArray<Outputs.FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessor> processors)
        {
            Enabled = enabled;
            Processors = processors;
        }
    }
}
