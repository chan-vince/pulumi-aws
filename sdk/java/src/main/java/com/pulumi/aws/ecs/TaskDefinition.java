// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ecs.TaskDefinitionArgs;
import com.pulumi.aws.ecs.inputs.TaskDefinitionState;
import com.pulumi.aws.ecs.outputs.TaskDefinitionEphemeralStorage;
import com.pulumi.aws.ecs.outputs.TaskDefinitionInferenceAccelerator;
import com.pulumi.aws.ecs.outputs.TaskDefinitionPlacementConstraint;
import com.pulumi.aws.ecs.outputs.TaskDefinitionProxyConfiguration;
import com.pulumi.aws.ecs.outputs.TaskDefinitionRuntimePlatform;
import com.pulumi.aws.ecs.outputs.TaskDefinitionVolume;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a revision of an ECS task definition to be used in `aws.ecs.Service`.
 * 
 * ## Example Usage
 * ### Basic Example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecs.TaskDefinition;
 * import com.pulumi.aws.ecs.TaskDefinitionArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionPlacementConstraintArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var service = new TaskDefinition(&#34;service&#34;, TaskDefinitionArgs.builder()        
 *             .family(&#34;service&#34;)
 *             .containerDefinitions(serializeJson(
 *                 jsonArray(
 *                     jsonObject(
 *                         jsonProperty(&#34;name&#34;, &#34;first&#34;),
 *                         jsonProperty(&#34;image&#34;, &#34;service-first&#34;),
 *                         jsonProperty(&#34;cpu&#34;, 10),
 *                         jsonProperty(&#34;memory&#34;, 512),
 *                         jsonProperty(&#34;essential&#34;, true),
 *                         jsonProperty(&#34;portMappings&#34;, jsonArray(jsonObject(
 *                             jsonProperty(&#34;containerPort&#34;, 80),
 *                             jsonProperty(&#34;hostPort&#34;, 80)
 *                         )))
 *                     ), 
 *                     jsonObject(
 *                         jsonProperty(&#34;name&#34;, &#34;second&#34;),
 *                         jsonProperty(&#34;image&#34;, &#34;service-second&#34;),
 *                         jsonProperty(&#34;cpu&#34;, 10),
 *                         jsonProperty(&#34;memory&#34;, 256),
 *                         jsonProperty(&#34;essential&#34;, true),
 *                         jsonProperty(&#34;portMappings&#34;, jsonArray(jsonObject(
 *                             jsonProperty(&#34;containerPort&#34;, 443),
 *                             jsonProperty(&#34;hostPort&#34;, 443)
 *                         )))
 *                     )
 *                 )))
 *             .volumes(TaskDefinitionVolumeArgs.builder()
 *                 .name(&#34;service-storage&#34;)
 *                 .hostPath(&#34;/ecs/service-storage&#34;)
 *                 .build())
 *             .placementConstraints(TaskDefinitionPlacementConstraintArgs.builder()
 *                 .type(&#34;memberOf&#34;)
 *                 .expression(&#34;attribute:ecs.availability-zone in [us-west-2a, us-west-2b]&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With AppMesh Proxy
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecs.TaskDefinition;
 * import com.pulumi.aws.ecs.TaskDefinitionArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionProxyConfigurationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var service = new TaskDefinition(&#34;service&#34;, TaskDefinitionArgs.builder()        
 *             .family(&#34;service&#34;)
 *             .containerDefinitions(Files.readString(Paths.get(&#34;task-definitions/service.json&#34;)))
 *             .proxyConfiguration(TaskDefinitionProxyConfigurationArgs.builder()
 *                 .type(&#34;APPMESH&#34;)
 *                 .containerName(&#34;applicationContainerName&#34;)
 *                 .properties(Map.ofEntries(
 *                     Map.entry(&#34;AppPorts&#34;, &#34;8080&#34;),
 *                     Map.entry(&#34;EgressIgnoredIPs&#34;, &#34;169.254.170.2,169.254.169.254&#34;),
 *                     Map.entry(&#34;IgnoredUID&#34;, &#34;1337&#34;),
 *                     Map.entry(&#34;ProxyEgressPort&#34;, 15001),
 *                     Map.entry(&#34;ProxyIngressPort&#34;, 15000)
 *                 ))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Example Using `docker_volume_configuration`
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecs.TaskDefinition;
 * import com.pulumi.aws.ecs.TaskDefinitionArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeDockerVolumeConfigurationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var service = new TaskDefinition(&#34;service&#34;, TaskDefinitionArgs.builder()        
 *             .family(&#34;service&#34;)
 *             .containerDefinitions(Files.readString(Paths.get(&#34;task-definitions/service.json&#34;)))
 *             .volumes(TaskDefinitionVolumeArgs.builder()
 *                 .name(&#34;service-storage&#34;)
 *                 .dockerVolumeConfiguration(TaskDefinitionVolumeDockerVolumeConfigurationArgs.builder()
 *                     .scope(&#34;shared&#34;)
 *                     .autoprovision(true)
 *                     .driver(&#34;local&#34;)
 *                     .driverOpts(Map.ofEntries(
 *                         Map.entry(&#34;type&#34;, &#34;nfs&#34;),
 *                         Map.entry(&#34;device&#34;, String.format(&#34;%s:/&#34;, aws_efs_file_system.fs().dns_name())),
 *                         Map.entry(&#34;o&#34;, String.format(&#34;addr=%s,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2,noresvport&#34;, aws_efs_file_system.fs().dns_name()))
 *                     ))
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Example Using `efs_volume_configuration`
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecs.TaskDefinition;
 * import com.pulumi.aws.ecs.TaskDefinitionArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var service = new TaskDefinition(&#34;service&#34;, TaskDefinitionArgs.builder()        
 *             .family(&#34;service&#34;)
 *             .containerDefinitions(Files.readString(Paths.get(&#34;task-definitions/service.json&#34;)))
 *             .volumes(TaskDefinitionVolumeArgs.builder()
 *                 .name(&#34;service-storage&#34;)
 *                 .efsVolumeConfiguration(TaskDefinitionVolumeEfsVolumeConfigurationArgs.builder()
 *                     .fileSystemId(aws_efs_file_system.fs().id())
 *                     .rootDirectory(&#34;/opt/data&#34;)
 *                     .transitEncryption(&#34;ENABLED&#34;)
 *                     .transitEncryptionPort(2999)
 *                     .authorizationConfig(TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs.builder()
 *                         .accessPointId(aws_efs_access_point.test().id())
 *                         .iam(&#34;ENABLED&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Example Using `fsx_windows_file_server_volume_configuration`
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.secretsmanager.SecretVersion;
 * import com.pulumi.aws.secretsmanager.SecretVersionArgs;
 * import com.pulumi.aws.ecs.TaskDefinition;
 * import com.pulumi.aws.ecs.TaskDefinitionArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new SecretVersion(&#34;test&#34;, SecretVersionArgs.builder()        
 *             .secretId(aws_secretsmanager_secret.test().id())
 *             .secretString(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;username&#34;, &#34;admin&#34;),
 *                     jsonProperty(&#34;password&#34;, aws_directory_service_directory.test().password())
 *                 )))
 *             .build());
 * 
 *         var service = new TaskDefinition(&#34;service&#34;, TaskDefinitionArgs.builder()        
 *             .family(&#34;service&#34;)
 *             .containerDefinitions(Files.readString(Paths.get(&#34;task-definitions/service.json&#34;)))
 *             .volumes(TaskDefinitionVolumeArgs.builder()
 *                 .name(&#34;service-storage&#34;)
 *                 .fsxWindowsFileServerVolumeConfiguration(TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs.builder()
 *                     .fileSystemId(aws_fsx_windows_file_system.test().id())
 *                     .rootDirectory(&#34;\\data&#34;)
 *                     .authorizationConfig(TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs.builder()
 *                         .credentialsParameter(test.arn())
 *                         .domain(aws_directory_service_directory.test().name())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Example Using `container_definitions` and `inference_accelerator`
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecs.TaskDefinition;
 * import com.pulumi.aws.ecs.TaskDefinitionArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionInferenceAcceleratorArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new TaskDefinition(&#34;test&#34;, TaskDefinitionArgs.builder()        
 *             .containerDefinitions(&#34;&#34;&#34;
 * [
 *   {
 *     &#34;cpu&#34;: 10,
 *     &#34;command&#34;: [&#34;sleep&#34;, &#34;10&#34;],
 *     &#34;entryPoint&#34;: [&#34;/&#34;],
 *     &#34;environment&#34;: [
 *       {&#34;name&#34;: &#34;VARNAME&#34;, &#34;value&#34;: &#34;VARVAL&#34;}
 *     ],
 *     &#34;essential&#34;: true,
 *     &#34;image&#34;: &#34;jenkins&#34;,
 *     &#34;memory&#34;: 128,
 *     &#34;name&#34;: &#34;jenkins&#34;,
 *     &#34;portMappings&#34;: [
 *       {
 *         &#34;containerPort&#34;: 80,
 *         &#34;hostPort&#34;: 8080
 *       }
 *     ],
 *         &#34;resourceRequirements&#34;:[
 *             {
 *                 &#34;type&#34;:&#34;InferenceAccelerator&#34;,
 *                 &#34;value&#34;:&#34;device_1&#34;
 *             }
 *         ]
 *   }
 * ]
 * 
 *             &#34;&#34;&#34;)
 *             .family(&#34;test&#34;)
 *             .inferenceAccelerators(TaskDefinitionInferenceAcceleratorArgs.builder()
 *                 .deviceName(&#34;device_1&#34;)
 *                 .deviceType(&#34;eia1.medium&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Example Using `runtime_platform` and `fargate`
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecs.TaskDefinition;
 * import com.pulumi.aws.ecs.TaskDefinitionArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionRuntimePlatformArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new TaskDefinition(&#34;test&#34;, TaskDefinitionArgs.builder()        
 *             .containerDefinitions(&#34;&#34;&#34;
 * [
 *   {
 *     &#34;name&#34;: &#34;iis&#34;,
 *     &#34;image&#34;: &#34;mcr.microsoft.com/windows/servercore/iis&#34;,
 *     &#34;cpu&#34;: 1024,
 *     &#34;memory&#34;: 2048,
 *     &#34;essential&#34;: true
 *   }
 * ]
 * 
 *             &#34;&#34;&#34;)
 *             .cpu(1024)
 *             .family(&#34;test&#34;)
 *             .memory(2048)
 *             .networkMode(&#34;awsvpc&#34;)
 *             .requiresCompatibilities(&#34;FARGATE&#34;)
 *             .runtimePlatform(TaskDefinitionRuntimePlatformArgs.builder()
 *                 .cpuArchitecture(&#34;X86_64&#34;)
 *                 .operatingSystemFamily(&#34;WINDOWS_SERVER_2019_CORE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import ECS Task Definitions using their ARNs. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ecs/taskDefinition:TaskDefinition example arn:aws:ecs:us-east-1:012345678910:task-definition/mytaskfamily:123
 * ```
 * 
 */
@ResourceType(type="aws:ecs/taskDefinition:TaskDefinition")
public class TaskDefinition extends com.pulumi.resources.CustomResource {
    /**
     * Full ARN of the Task Definition (including both `family` and `revision`).
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Full ARN of the Task Definition (including both `family` and `revision`).
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * ARN of the Task Definition with the trailing `revision` removed. This may be useful for situations where the latest task definition is always desired. If a revision isn&#39;t specified, the latest ACTIVE revision is used. See the [AWS documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_StartTask.html#ECS-StartTask-request-taskDefinition) for details.
     * 
     */
    @Export(name="arnWithoutRevision", refs={String.class}, tree="[0]")
    private Output<String> arnWithoutRevision;

    /**
     * @return ARN of the Task Definition with the trailing `revision` removed. This may be useful for situations where the latest task definition is always desired. If a revision isn&#39;t specified, the latest ACTIVE revision is used. See the [AWS documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_StartTask.html#ECS-StartTask-request-taskDefinition) for details.
     * 
     */
    public Output<String> arnWithoutRevision() {
        return this.arnWithoutRevision;
    }
    /**
     * A list of valid [container definitions](http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html) provided as a single valid JSON document. Please note that you should only provide values that are part of the container definition document. For a detailed description of what parameters are available, see the [Task Definition Parameters](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html) section from the official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
     * 
     */
    @Export(name="containerDefinitions", refs={String.class}, tree="[0]")
    private Output<String> containerDefinitions;

    /**
     * @return A list of valid [container definitions](http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html) provided as a single valid JSON document. Please note that you should only provide values that are part of the container definition document. For a detailed description of what parameters are available, see the [Task Definition Parameters](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html) section from the official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
     * 
     */
    public Output<String> containerDefinitions() {
        return this.containerDefinitions;
    }
    /**
     * Number of cpu units used by the task. If the `requires_compatibilities` is `FARGATE` this field is required.
     * 
     */
    @Export(name="cpu", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cpu;

    /**
     * @return Number of cpu units used by the task. If the `requires_compatibilities` is `FARGATE` this field is required.
     * 
     */
    public Output<Optional<String>> cpu() {
        return Codegen.optional(this.cpu);
    }
    /**
     * The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of ephemeral storage available, beyond the default amount, for tasks hosted on AWS Fargate. See Ephemeral Storage.
     * 
     */
    @Export(name="ephemeralStorage", refs={TaskDefinitionEphemeralStorage.class}, tree="[0]")
    private Output</* @Nullable */ TaskDefinitionEphemeralStorage> ephemeralStorage;

    /**
     * @return The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of ephemeral storage available, beyond the default amount, for tasks hosted on AWS Fargate. See Ephemeral Storage.
     * 
     */
    public Output<Optional<TaskDefinitionEphemeralStorage>> ephemeralStorage() {
        return Codegen.optional(this.ephemeralStorage);
    }
    /**
     * ARN of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
     * 
     */
    @Export(name="executionRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> executionRoleArn;

    /**
     * @return ARN of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
     * 
     */
    public Output<Optional<String>> executionRoleArn() {
        return Codegen.optional(this.executionRoleArn);
    }
    /**
     * A unique name for your task definition.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="family", refs={String.class}, tree="[0]")
    private Output<String> family;

    /**
     * @return A unique name for your task definition.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> family() {
        return this.family;
    }
    /**
     * Configuration block(s) with Inference Accelerators settings. Detailed below.
     * 
     */
    @Export(name="inferenceAccelerators", refs={List.class,TaskDefinitionInferenceAccelerator.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TaskDefinitionInferenceAccelerator>> inferenceAccelerators;

    /**
     * @return Configuration block(s) with Inference Accelerators settings. Detailed below.
     * 
     */
    public Output<Optional<List<TaskDefinitionInferenceAccelerator>>> inferenceAccelerators() {
        return Codegen.optional(this.inferenceAccelerators);
    }
    /**
     * IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
     * 
     */
    @Export(name="ipcMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipcMode;

    /**
     * @return IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
     * 
     */
    public Output<Optional<String>> ipcMode() {
        return Codegen.optional(this.ipcMode);
    }
    /**
     * Amount (in MiB) of memory used by the task. If the `requires_compatibilities` is `FARGATE` this field is required.
     * 
     */
    @Export(name="memory", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> memory;

    /**
     * @return Amount (in MiB) of memory used by the task. If the `requires_compatibilities` is `FARGATE` this field is required.
     * 
     */
    public Output<Optional<String>> memory() {
        return Codegen.optional(this.memory);
    }
    /**
     * Docker networking mode to use for the containers in the task. Valid values are `none`, `bridge`, `awsvpc`, and `host`.
     * 
     */
    @Export(name="networkMode", refs={String.class}, tree="[0]")
    private Output<String> networkMode;

    /**
     * @return Docker networking mode to use for the containers in the task. Valid values are `none`, `bridge`, `awsvpc`, and `host`.
     * 
     */
    public Output<String> networkMode() {
        return this.networkMode;
    }
    /**
     * Process namespace to use for the containers in the task. The valid values are `host` and `task`.
     * 
     */
    @Export(name="pidMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pidMode;

    /**
     * @return Process namespace to use for the containers in the task. The valid values are `host` and `task`.
     * 
     */
    public Output<Optional<String>> pidMode() {
        return Codegen.optional(this.pidMode);
    }
    /**
     * Configuration block for rules that are taken into consideration during task placement. Maximum number of `placement_constraints` is `10`. Detailed below.
     * 
     */
    @Export(name="placementConstraints", refs={List.class,TaskDefinitionPlacementConstraint.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TaskDefinitionPlacementConstraint>> placementConstraints;

    /**
     * @return Configuration block for rules that are taken into consideration during task placement. Maximum number of `placement_constraints` is `10`. Detailed below.
     * 
     */
    public Output<Optional<List<TaskDefinitionPlacementConstraint>>> placementConstraints() {
        return Codegen.optional(this.placementConstraints);
    }
    /**
     * Configuration block for the App Mesh proxy. Detailed below.
     * 
     */
    @Export(name="proxyConfiguration", refs={TaskDefinitionProxyConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ TaskDefinitionProxyConfiguration> proxyConfiguration;

    /**
     * @return Configuration block for the App Mesh proxy. Detailed below.
     * 
     */
    public Output<Optional<TaskDefinitionProxyConfiguration>> proxyConfiguration() {
        return Codegen.optional(this.proxyConfiguration);
    }
    /**
     * Set of launch types required by the task. The valid values are `EC2` and `FARGATE`.
     * 
     */
    @Export(name="requiresCompatibilities", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> requiresCompatibilities;

    /**
     * @return Set of launch types required by the task. The valid values are `EC2` and `FARGATE`.
     * 
     */
    public Output<Optional<List<String>>> requiresCompatibilities() {
        return Codegen.optional(this.requiresCompatibilities);
    }
    /**
     * Revision of the task in a particular family.
     * 
     */
    @Export(name="revision", refs={Integer.class}, tree="[0]")
    private Output<Integer> revision;

    /**
     * @return Revision of the task in a particular family.
     * 
     */
    public Output<Integer> revision() {
        return this.revision;
    }
    /**
     * Configuration block for runtime_platform that containers in your task may use.
     * 
     */
    @Export(name="runtimePlatform", refs={TaskDefinitionRuntimePlatform.class}, tree="[0]")
    private Output</* @Nullable */ TaskDefinitionRuntimePlatform> runtimePlatform;

    /**
     * @return Configuration block for runtime_platform that containers in your task may use.
     * 
     */
    public Output<Optional<TaskDefinitionRuntimePlatform>> runtimePlatform() {
        return Codegen.optional(this.runtimePlatform);
    }
    /**
     * Whether to retain the old revision when the resource is destroyed or replacement is necessary. Default is `false`.
     * 
     */
    @Export(name="skipDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipDestroy;

    /**
     * @return Whether to retain the old revision when the resource is destroyed or replacement is necessary. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> skipDestroy() {
        return Codegen.optional(this.skipDestroy);
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * ARN of IAM role that allows your Amazon ECS container task to make calls to other AWS services.
     * 
     */
    @Export(name="taskRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> taskRoleArn;

    /**
     * @return ARN of IAM role that allows your Amazon ECS container task to make calls to other AWS services.
     * 
     */
    public Output<Optional<String>> taskRoleArn() {
        return Codegen.optional(this.taskRoleArn);
    }
    /**
     * Configuration block for volumes that containers in your task may use. Detailed below.
     * 
     */
    @Export(name="volumes", refs={List.class,TaskDefinitionVolume.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TaskDefinitionVolume>> volumes;

    /**
     * @return Configuration block for volumes that containers in your task may use. Detailed below.
     * 
     */
    public Output<Optional<List<TaskDefinitionVolume>>> volumes() {
        return Codegen.optional(this.volumes);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TaskDefinition(String name) {
        this(name, TaskDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TaskDefinition(String name, TaskDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TaskDefinition(String name, TaskDefinitionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/taskDefinition:TaskDefinition", name, args == null ? TaskDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TaskDefinition(String name, Output<String> id, @Nullable TaskDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/taskDefinition:TaskDefinition", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "tagsAll"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TaskDefinition get(String name, Output<String> id, @Nullable TaskDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TaskDefinition(name, id, state, options);
    }
}
