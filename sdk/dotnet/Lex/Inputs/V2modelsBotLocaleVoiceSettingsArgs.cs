// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lex.Inputs
{

    public sealed class V2modelsBotLocaleVoiceSettingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        [Input("voiceId", required: true)]
        public Input<string> VoiceId { get; set; } = null!;

        public V2modelsBotLocaleVoiceSettingsArgs()
        {
        }
        public static new V2modelsBotLocaleVoiceSettingsArgs Empty => new V2modelsBotLocaleVoiceSettingsArgs();
    }
}
