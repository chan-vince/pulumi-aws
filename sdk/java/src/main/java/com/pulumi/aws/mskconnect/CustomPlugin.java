// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.mskconnect.CustomPluginArgs;
import com.pulumi.aws.mskconnect.inputs.CustomPluginState;
import com.pulumi.aws.mskconnect.outputs.CustomPluginLocation;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amazon MSK Connect Custom Plugin Resource.
 * 
 * ## Example Usage
 * ### Basic configuration
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketObjectv2;
 * import com.pulumi.aws.s3.BucketObjectv2Args;
 * import com.pulumi.aws.mskconnect.CustomPlugin;
 * import com.pulumi.aws.mskconnect.CustomPluginArgs;
 * import com.pulumi.aws.mskconnect.inputs.CustomPluginLocationArgs;
 * import com.pulumi.aws.mskconnect.inputs.CustomPluginLocationS3Args;
 * import com.pulumi.asset.FileAsset;
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
 *         var exampleBucketV2 = new BucketV2(&#34;exampleBucketV2&#34;);
 * 
 *         var exampleBucketObjectv2 = new BucketObjectv2(&#34;exampleBucketObjectv2&#34;, BucketObjectv2Args.builder()        
 *             .bucket(exampleBucketV2.id())
 *             .key(&#34;debezium.zip&#34;)
 *             .source(new FileAsset(&#34;debezium.zip&#34;))
 *             .build());
 * 
 *         var exampleCustomPlugin = new CustomPlugin(&#34;exampleCustomPlugin&#34;, CustomPluginArgs.builder()        
 *             .contentType(&#34;ZIP&#34;)
 *             .location(CustomPluginLocationArgs.builder()
 *                 .s3(CustomPluginLocationS3Args.builder()
 *                     .bucketArn(exampleBucketV2.arn())
 *                     .fileKey(exampleBucketObjectv2.key())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import MSK Connect Custom Plugin using the plugin&#39;s `arn`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:mskconnect/customPlugin:CustomPlugin example &#39;arn:aws:kafkaconnect:eu-central-1:123456789012:custom-plugin/debezium-example/abcdefgh-1234-5678-9abc-defghijklmno-4&#39;
 * ```
 * 
 */
@ResourceType(type="aws:mskconnect/customPlugin:CustomPlugin")
public class CustomPlugin extends com.pulumi.resources.CustomResource {
    /**
     * the Amazon Resource Name (ARN) of the custom plugin.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return the Amazon Resource Name (ARN) of the custom plugin.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The type of the plugin file. Allowed values are `ZIP` and `JAR`.
     * 
     */
    @Export(name="contentType", refs={String.class}, tree="[0]")
    private Output<String> contentType;

    /**
     * @return The type of the plugin file. Allowed values are `ZIP` and `JAR`.
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }
    /**
     * A summary description of the custom plugin.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A summary description of the custom plugin.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * an ID of the latest successfully created revision of the custom plugin.
     * 
     */
    @Export(name="latestRevision", refs={Integer.class}, tree="[0]")
    private Output<Integer> latestRevision;

    /**
     * @return an ID of the latest successfully created revision of the custom plugin.
     * 
     */
    public Output<Integer> latestRevision() {
        return this.latestRevision;
    }
    /**
     * Information about the location of a custom plugin. See below.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="location", refs={CustomPluginLocation.class}, tree="[0]")
    private Output<CustomPluginLocation> location;

    /**
     * @return Information about the location of a custom plugin. See below.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<CustomPluginLocation> location() {
        return this.location;
    }
    /**
     * The name of the custom plugin..
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the custom plugin..
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * the state of the custom plugin.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return the state of the custom plugin.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomPlugin(String name) {
        this(name, CustomPluginArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomPlugin(String name, CustomPluginArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomPlugin(String name, CustomPluginArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:mskconnect/customPlugin:CustomPlugin", name, args == null ? CustomPluginArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomPlugin(String name, Output<String> id, @Nullable CustomPluginState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:mskconnect/customPlugin:CustomPlugin", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static CustomPlugin get(String name, Output<String> id, @Nullable CustomPluginState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomPlugin(name, id, state, options);
    }
}
