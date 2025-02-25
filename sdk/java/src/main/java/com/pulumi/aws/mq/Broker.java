// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mq;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.mq.BrokerArgs;
import com.pulumi.aws.mq.inputs.BrokerState;
import com.pulumi.aws.mq.outputs.BrokerConfiguration;
import com.pulumi.aws.mq.outputs.BrokerEncryptionOptions;
import com.pulumi.aws.mq.outputs.BrokerInstance;
import com.pulumi.aws.mq.outputs.BrokerLdapServerMetadata;
import com.pulumi.aws.mq.outputs.BrokerLogs;
import com.pulumi.aws.mq.outputs.BrokerMaintenanceWindowStartTime;
import com.pulumi.aws.mq.outputs.BrokerUser;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amazon MQ broker resource. This resources also manages users for the broker.
 * 
 * &gt; For more information on Amazon MQ, see [Amazon MQ documentation](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/welcome.html).
 * 
 * &gt; **NOTE:** Amazon MQ currently places limits on **RabbitMQ** brokers. For example, a RabbitMQ broker cannot have: instances with an associated IP address of an ENI attached to the broker, an associated LDAP server to authenticate and authorize broker connections, storage type `EFS`, or audit logging. Although this resource allows you to create RabbitMQ users, RabbitMQ users cannot have console access or groups. Also, Amazon MQ does not return information about RabbitMQ users so drift detection is not possible.
 * 
 * &gt; **NOTE:** Changes to an MQ Broker can occur when you change a parameter, such as `configuration` or `user`, and are reflected in the next maintenance window. Because of this, the provider may report a difference in its planning phase because a modification has not yet taken place. You can use the `apply_immediately` flag to instruct the service to apply the change immediately (see documentation below). Using `apply_immediately` can result in a brief downtime as the broker reboots.
 * 
 * ## Example Usage
 * ### Basic Example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.mq.Broker;
 * import com.pulumi.aws.mq.BrokerArgs;
 * import com.pulumi.aws.mq.inputs.BrokerConfigurationArgs;
 * import com.pulumi.aws.mq.inputs.BrokerUserArgs;
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
 *         var example = new Broker(&#34;example&#34;, BrokerArgs.builder()        
 *             .configuration(BrokerConfigurationArgs.builder()
 *                 .id(aws_mq_configuration.test().id())
 *                 .revision(aws_mq_configuration.test().latest_revision())
 *                 .build())
 *             .engineType(&#34;ActiveMQ&#34;)
 *             .engineVersion(&#34;5.17.6&#34;)
 *             .hostInstanceType(&#34;mq.t2.micro&#34;)
 *             .securityGroups(aws_security_group.test().id())
 *             .users(BrokerUserArgs.builder()
 *                 .username(&#34;ExampleUser&#34;)
 *                 .password(&#34;MindTheGap&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### High-throughput Optimized Example
 * 
 * This example shows the use of EBS storage for high-throughput optimized performance.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.mq.Broker;
 * import com.pulumi.aws.mq.BrokerArgs;
 * import com.pulumi.aws.mq.inputs.BrokerConfigurationArgs;
 * import com.pulumi.aws.mq.inputs.BrokerUserArgs;
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
 *         var example = new Broker(&#34;example&#34;, BrokerArgs.builder()        
 *             .configuration(BrokerConfigurationArgs.builder()
 *                 .id(aws_mq_configuration.test().id())
 *                 .revision(aws_mq_configuration.test().latest_revision())
 *                 .build())
 *             .engineType(&#34;ActiveMQ&#34;)
 *             .engineVersion(&#34;5.17.6&#34;)
 *             .storageType(&#34;ebs&#34;)
 *             .hostInstanceType(&#34;mq.m5.large&#34;)
 *             .securityGroups(aws_security_group.test().id())
 *             .users(BrokerUserArgs.builder()
 *                 .username(&#34;ExampleUser&#34;)
 *                 .password(&#34;MindTheGap&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import MQ Brokers using their broker id. For example:
 * 
 * ```sh
 *  $ pulumi import aws:mq/broker:Broker example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:mq/broker:Broker")
public class Broker extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether any broker modifications are applied immediately, or during the next maintenance window. Default is `false`.
     * 
     */
    @Export(name="applyImmediately", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> applyImmediately;

    /**
     * @return Specifies whether any broker modifications are applied immediately, or during the next maintenance window. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> applyImmediately() {
        return Codegen.optional(this.applyImmediately);
    }
    /**
     * ARN of the broker.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the broker.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Authentication strategy used to secure the broker. Valid values are `simple` and `ldap`. `ldap` is not supported for `engine_type` `RabbitMQ`.
     * 
     */
    @Export(name="authenticationStrategy", refs={String.class}, tree="[0]")
    private Output<String> authenticationStrategy;

    /**
     * @return Authentication strategy used to secure the broker. Valid values are `simple` and `ldap`. `ldap` is not supported for `engine_type` `RabbitMQ`.
     * 
     */
    public Output<String> authenticationStrategy() {
        return this.authenticationStrategy;
    }
    /**
     * Whether to automatically upgrade to new minor versions of brokers as Amazon MQ makes releases available.
     * 
     */
    @Export(name="autoMinorVersionUpgrade", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoMinorVersionUpgrade;

    /**
     * @return Whether to automatically upgrade to new minor versions of brokers as Amazon MQ makes releases available.
     * 
     */
    public Output<Optional<Boolean>> autoMinorVersionUpgrade() {
        return Codegen.optional(this.autoMinorVersionUpgrade);
    }
    /**
     * Name of the broker.
     * 
     */
    @Export(name="brokerName", refs={String.class}, tree="[0]")
    private Output<String> brokerName;

    /**
     * @return Name of the broker.
     * 
     */
    public Output<String> brokerName() {
        return this.brokerName;
    }
    /**
     * Configuration block for broker configuration. Applies to `engine_type` of `ActiveMQ` and `RabbitMQ` only. Detailed below.
     * 
     */
    @Export(name="configuration", refs={BrokerConfiguration.class}, tree="[0]")
    private Output<BrokerConfiguration> configuration;

    /**
     * @return Configuration block for broker configuration. Applies to `engine_type` of `ActiveMQ` and `RabbitMQ` only. Detailed below.
     * 
     */
    public Output<BrokerConfiguration> configuration() {
        return this.configuration;
    }
    /**
     * Deployment mode of the broker. Valid values are `SINGLE_INSTANCE`, `ACTIVE_STANDBY_MULTI_AZ`, and `CLUSTER_MULTI_AZ`. Default is `SINGLE_INSTANCE`.
     * 
     */
    @Export(name="deploymentMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deploymentMode;

    /**
     * @return Deployment mode of the broker. Valid values are `SINGLE_INSTANCE`, `ACTIVE_STANDBY_MULTI_AZ`, and `CLUSTER_MULTI_AZ`. Default is `SINGLE_INSTANCE`.
     * 
     */
    public Output<Optional<String>> deploymentMode() {
        return Codegen.optional(this.deploymentMode);
    }
    /**
     * Configuration block containing encryption options. Detailed below.
     * 
     */
    @Export(name="encryptionOptions", refs={BrokerEncryptionOptions.class}, tree="[0]")
    private Output</* @Nullable */ BrokerEncryptionOptions> encryptionOptions;

    /**
     * @return Configuration block containing encryption options. Detailed below.
     * 
     */
    public Output<Optional<BrokerEncryptionOptions>> encryptionOptions() {
        return Codegen.optional(this.encryptionOptions);
    }
    /**
     * Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
     * 
     */
    @Export(name="engineType", refs={String.class}, tree="[0]")
    private Output<String> engineType;

    /**
     * @return Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
     * 
     */
    public Output<String> engineType() {
        return this.engineType;
    }
    /**
     * Version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions. For example, `5.17.6`.
     * 
     */
    @Export(name="engineVersion", refs={String.class}, tree="[0]")
    private Output<String> engineVersion;

    /**
     * @return Version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions. For example, `5.17.6`.
     * 
     */
    public Output<String> engineVersion() {
        return this.engineVersion;
    }
    /**
     * Broker&#39;s instance type. For example, `mq.t3.micro`, `mq.m5.large`.
     * 
     */
    @Export(name="hostInstanceType", refs={String.class}, tree="[0]")
    private Output<String> hostInstanceType;

    /**
     * @return Broker&#39;s instance type. For example, `mq.t3.micro`, `mq.m5.large`.
     * 
     */
    public Output<String> hostInstanceType() {
        return this.hostInstanceType;
    }
    /**
     * List of information about allocated brokers (both active &amp; standby).
     * * `instances.0.console_url` - The URL of the [ActiveMQ Web Console](http://activemq.apache.org/web-console.html) or the [RabbitMQ Management UI](https://www.rabbitmq.com/management.html#external-monitoring) depending on `engine_type`.
     * * `instances.0.ip_address` - IP Address of the broker.
     * * `instances.0.endpoints` - Broker&#39;s wire-level protocol endpoints in the following order &amp; format referenceable e.g., as `instances.0.endpoints.0` (SSL):
     * * For `ActiveMQ`:
     * * `ssl://broker-id.mq.us-west-2.amazonaws.com:61617`
     * * `amqp+ssl://broker-id.mq.us-west-2.amazonaws.com:5671`
     * * `stomp+ssl://broker-id.mq.us-west-2.amazonaws.com:61614`
     * * `mqtt+ssl://broker-id.mq.us-west-2.amazonaws.com:8883`
     * * `wss://broker-id.mq.us-west-2.amazonaws.com:61619`
     * * For `RabbitMQ`:
     * * `amqps://broker-id.mq.us-west-2.amazonaws.com:5671`
     * 
     */
    @Export(name="instances", refs={List.class,BrokerInstance.class}, tree="[0,1]")
    private Output<List<BrokerInstance>> instances;

    /**
     * @return List of information about allocated brokers (both active &amp; standby).
     * * `instances.0.console_url` - The URL of the [ActiveMQ Web Console](http://activemq.apache.org/web-console.html) or the [RabbitMQ Management UI](https://www.rabbitmq.com/management.html#external-monitoring) depending on `engine_type`.
     * * `instances.0.ip_address` - IP Address of the broker.
     * * `instances.0.endpoints` - Broker&#39;s wire-level protocol endpoints in the following order &amp; format referenceable e.g., as `instances.0.endpoints.0` (SSL):
     * * For `ActiveMQ`:
     * * `ssl://broker-id.mq.us-west-2.amazonaws.com:61617`
     * * `amqp+ssl://broker-id.mq.us-west-2.amazonaws.com:5671`
     * * `stomp+ssl://broker-id.mq.us-west-2.amazonaws.com:61614`
     * * `mqtt+ssl://broker-id.mq.us-west-2.amazonaws.com:8883`
     * * `wss://broker-id.mq.us-west-2.amazonaws.com:61619`
     * * For `RabbitMQ`:
     * * `amqps://broker-id.mq.us-west-2.amazonaws.com:5671`
     * 
     */
    public Output<List<BrokerInstance>> instances() {
        return this.instances;
    }
    /**
     * Configuration block for the LDAP server used to authenticate and authorize connections to the broker. Not supported for `engine_type` `RabbitMQ`. Detailed below. (Currently, AWS may not process changes to LDAP server metadata.)
     * 
     */
    @Export(name="ldapServerMetadata", refs={BrokerLdapServerMetadata.class}, tree="[0]")
    private Output</* @Nullable */ BrokerLdapServerMetadata> ldapServerMetadata;

    /**
     * @return Configuration block for the LDAP server used to authenticate and authorize connections to the broker. Not supported for `engine_type` `RabbitMQ`. Detailed below. (Currently, AWS may not process changes to LDAP server metadata.)
     * 
     */
    public Output<Optional<BrokerLdapServerMetadata>> ldapServerMetadata() {
        return Codegen.optional(this.ldapServerMetadata);
    }
    /**
     * Configuration block for the logging configuration of the broker. Detailed below.
     * 
     */
    @Export(name="logs", refs={BrokerLogs.class}, tree="[0]")
    private Output</* @Nullable */ BrokerLogs> logs;

    /**
     * @return Configuration block for the logging configuration of the broker. Detailed below.
     * 
     */
    public Output<Optional<BrokerLogs>> logs() {
        return Codegen.optional(this.logs);
    }
    /**
     * Configuration block for the maintenance window start time. Detailed below.
     * 
     */
    @Export(name="maintenanceWindowStartTime", refs={BrokerMaintenanceWindowStartTime.class}, tree="[0]")
    private Output<BrokerMaintenanceWindowStartTime> maintenanceWindowStartTime;

    /**
     * @return Configuration block for the maintenance window start time. Detailed below.
     * 
     */
    public Output<BrokerMaintenanceWindowStartTime> maintenanceWindowStartTime() {
        return this.maintenanceWindowStartTime;
    }
    /**
     * Whether to enable connections from applications outside of the VPC that hosts the broker&#39;s subnets.
     * 
     */
    @Export(name="publiclyAccessible", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> publiclyAccessible;

    /**
     * @return Whether to enable connections from applications outside of the VPC that hosts the broker&#39;s subnets.
     * 
     */
    public Output<Optional<Boolean>> publiclyAccessible() {
        return Codegen.optional(this.publiclyAccessible);
    }
    /**
     * List of security group IDs assigned to the broker.
     * 
     */
    @Export(name="securityGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> securityGroups;

    /**
     * @return List of security group IDs assigned to the broker.
     * 
     */
    public Output<Optional<List<String>>> securityGroups() {
        return Codegen.optional(this.securityGroups);
    }
    /**
     * Storage type of the broker. For `engine_type` `ActiveMQ`, the valid values are `efs` and `ebs`, and the AWS-default is `efs`. For `engine_type` `RabbitMQ`, only `ebs` is supported. When using `ebs`, only the `mq.m5` broker instance type family is supported.
     * 
     */
    @Export(name="storageType", refs={String.class}, tree="[0]")
    private Output<String> storageType;

    /**
     * @return Storage type of the broker. For `engine_type` `ActiveMQ`, the valid values are `efs` and `ebs`, and the AWS-default is `efs`. For `engine_type` `RabbitMQ`, only `ebs` is supported. When using `ebs`, only the `mq.m5` broker instance type family is supported.
     * 
     */
    public Output<String> storageType() {
        return this.storageType;
    }
    /**
     * List of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires multiple subnets.
     * 
     */
    @Export(name="subnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subnetIds;

    /**
     * @return List of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires multiple subnets.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    /**
     * Map of tags to assign to the broker. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the broker. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Configuration block for broker users. For `engine_type` of `RabbitMQ`, Amazon MQ does not return broker users preventing this resource from making user updates and drift detection. Detailed below.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="users", refs={List.class,BrokerUser.class}, tree="[0,1]")
    private Output<List<BrokerUser>> users;

    /**
     * @return Configuration block for broker users. For `engine_type` of `RabbitMQ`, Amazon MQ does not return broker users preventing this resource from making user updates and drift detection. Detailed below.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<List<BrokerUser>> users() {
        return this.users;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Broker(String name) {
        this(name, BrokerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Broker(String name, BrokerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Broker(String name, BrokerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:mq/broker:Broker", name, args == null ? BrokerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Broker(String name, Output<String> id, @Nullable BrokerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:mq/broker:Broker", name, state, makeResourceOptions(options, id));
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
    public static Broker get(String name, Output<String> id, @Nullable BrokerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Broker(name, id, state, options);
    }
}
