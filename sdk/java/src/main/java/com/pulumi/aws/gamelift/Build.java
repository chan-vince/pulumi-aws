// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.gamelift;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.gamelift.BuildArgs;
import com.pulumi.aws.gamelift.inputs.BuildState;
import com.pulumi.aws.gamelift.outputs.BuildStorageLocation;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an GameLift Build resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.gamelift.Build;
 * import com.pulumi.aws.gamelift.BuildArgs;
 * import com.pulumi.aws.gamelift.inputs.BuildStorageLocationArgs;
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
 *         var test = new Build(&#34;test&#34;, BuildArgs.builder()        
 *             .operatingSystem(&#34;WINDOWS_2012&#34;)
 *             .storageLocation(BuildStorageLocationArgs.builder()
 *                 .bucket(aws_s3_bucket.test().id())
 *                 .key(aws_s3_object.test().key())
 *                 .roleArn(aws_iam_role.test().arn())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import GameLift Builds using the ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:gamelift/build:Build example &lt;build-id&gt;
 * ```
 * 
 */
@ResourceType(type="aws:gamelift/build:Build")
public class Build extends com.pulumi.resources.CustomResource {
    /**
     * GameLift Build ARN.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return GameLift Build ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Name of the build
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the build
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Operating system that the game server binaries are built to run on. Valid values: `WINDOWS_2012`, `AMAZON_LINUX`, `AMAZON_LINUX_2`, `WINDOWS_2016`, `AMAZON_LINUX_2023`.
     * 
     */
    @Export(name="operatingSystem", refs={String.class}, tree="[0]")
    private Output<String> operatingSystem;

    /**
     * @return Operating system that the game server binaries are built to run on. Valid values: `WINDOWS_2012`, `AMAZON_LINUX`, `AMAZON_LINUX_2`, `WINDOWS_2016`, `AMAZON_LINUX_2023`.
     * 
     */
    public Output<String> operatingSystem() {
        return this.operatingSystem;
    }
    /**
     * Information indicating where your game build files are stored. See below.
     * 
     */
    @Export(name="storageLocation", refs={BuildStorageLocation.class}, tree="[0]")
    private Output<BuildStorageLocation> storageLocation;

    /**
     * @return Information indicating where your game build files are stored. See below.
     * 
     */
    public Output<BuildStorageLocation> storageLocation() {
        return this.storageLocation;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Version that is associated with this build.
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> version;

    /**
     * @return Version that is associated with this build.
     * 
     */
    public Output<Optional<String>> version() {
        return Codegen.optional(this.version);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Build(String name) {
        this(name, BuildArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Build(String name, BuildArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Build(String name, BuildArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:gamelift/build:Build", name, args == null ? BuildArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Build(String name, Output<String> id, @Nullable BuildState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:gamelift/build:Build", name, state, makeResourceOptions(options, id));
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
    public static Build get(String name, Output<String> id, @Nullable BuildState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Build(name, id, state, options);
    }
}
