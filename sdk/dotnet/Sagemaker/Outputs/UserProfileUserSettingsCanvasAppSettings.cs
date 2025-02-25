// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Outputs
{

    [OutputType]
    public sealed class UserProfileUserSettingsCanvasAppSettings
    {
        /// <summary>
        /// The model deployment settings for the SageMaker Canvas application. See Direct Deploy Settings below.
        /// </summary>
        public readonly Outputs.UserProfileUserSettingsCanvasAppSettingsDirectDeploySettings? DirectDeploySettings;
        /// <summary>
        /// The settings for connecting to an external data source with OAuth. See Identity Provider OAuth Settings below.
        /// </summary>
        public readonly ImmutableArray<Outputs.UserProfileUserSettingsCanvasAppSettingsIdentityProviderOauthSetting> IdentityProviderOauthSettings;
        /// <summary>
        /// The settings for document querying. See Kendra Settings below.
        /// </summary>
        public readonly Outputs.UserProfileUserSettingsCanvasAppSettingsKendraSettings? KendraSettings;
        /// <summary>
        /// The model registry settings for the SageMaker Canvas application. See Model Register Settings below.
        /// </summary>
        public readonly Outputs.UserProfileUserSettingsCanvasAppSettingsModelRegisterSettings? ModelRegisterSettings;
        /// <summary>
        /// Time series forecast settings for the Canvas app. see Time Series Forecasting Settings below.
        /// </summary>
        public readonly Outputs.UserProfileUserSettingsCanvasAppSettingsTimeSeriesForecastingSettings? TimeSeriesForecastingSettings;
        /// <summary>
        /// The workspace settings for the SageMaker Canvas application. See Workspace Settings below.
        /// </summary>
        public readonly Outputs.UserProfileUserSettingsCanvasAppSettingsWorkspaceSettings? WorkspaceSettings;

        [OutputConstructor]
        private UserProfileUserSettingsCanvasAppSettings(
            Outputs.UserProfileUserSettingsCanvasAppSettingsDirectDeploySettings? directDeploySettings,

            ImmutableArray<Outputs.UserProfileUserSettingsCanvasAppSettingsIdentityProviderOauthSetting> identityProviderOauthSettings,

            Outputs.UserProfileUserSettingsCanvasAppSettingsKendraSettings? kendraSettings,

            Outputs.UserProfileUserSettingsCanvasAppSettingsModelRegisterSettings? modelRegisterSettings,

            Outputs.UserProfileUserSettingsCanvasAppSettingsTimeSeriesForecastingSettings? timeSeriesForecastingSettings,

            Outputs.UserProfileUserSettingsCanvasAppSettingsWorkspaceSettings? workspaceSettings)
        {
            DirectDeploySettings = directDeploySettings;
            IdentityProviderOauthSettings = identityProviderOauthSettings;
            KendraSettings = kendraSettings;
            ModelRegisterSettings = modelRegisterSettings;
            TimeSeriesForecastingSettings = timeSeriesForecastingSettings;
            WorkspaceSettings = workspaceSettings;
        }
    }
}
