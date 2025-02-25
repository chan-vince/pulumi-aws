// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecommit;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.codecommit.TriggerArgs;
import com.pulumi.aws.codecommit.inputs.TriggerState;
import com.pulumi.aws.codecommit.outputs.TriggerTrigger;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a CodeCommit Trigger Resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.codecommit.Repository;
 * import com.pulumi.aws.codecommit.RepositoryArgs;
 * import com.pulumi.aws.codecommit.Trigger;
 * import com.pulumi.aws.codecommit.TriggerArgs;
 * import com.pulumi.aws.codecommit.inputs.TriggerTriggerArgs;
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
 *         var testRepository = new Repository(&#34;testRepository&#34;, RepositoryArgs.builder()        
 *             .repositoryName(&#34;test&#34;)
 *             .build());
 * 
 *         var testTrigger = new Trigger(&#34;testTrigger&#34;, TriggerArgs.builder()        
 *             .repositoryName(testRepository.repositoryName())
 *             .triggers(TriggerTriggerArgs.builder()
 *                 .name(&#34;all&#34;)
 *                 .events(&#34;all&#34;)
 *                 .destinationArn(aws_sns_topic.test().arn())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:codecommit/trigger:Trigger")
public class Trigger extends com.pulumi.resources.CustomResource {
    /**
     * System-generated unique identifier.
     * 
     */
    @Export(name="configurationId", refs={String.class}, tree="[0]")
    private Output<String> configurationId;

    /**
     * @return System-generated unique identifier.
     * 
     */
    public Output<String> configurationId() {
        return this.configurationId;
    }
    /**
     * The name for the repository. This needs to be less than 100 characters.
     * 
     */
    @Export(name="repositoryName", refs={String.class}, tree="[0]")
    private Output<String> repositoryName;

    /**
     * @return The name for the repository. This needs to be less than 100 characters.
     * 
     */
    public Output<String> repositoryName() {
        return this.repositoryName;
    }
    /**
     * The name of the trigger.
     * 
     */
    @Export(name="triggers", refs={List.class,TriggerTrigger.class}, tree="[0,1]")
    private Output<List<TriggerTrigger>> triggers;

    /**
     * @return The name of the trigger.
     * 
     */
    public Output<List<TriggerTrigger>> triggers() {
        return this.triggers;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Trigger(String name) {
        this(name, TriggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Trigger(String name, TriggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Trigger(String name, TriggerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codecommit/trigger:Trigger", name, args == null ? TriggerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Trigger(String name, Output<String> id, @Nullable TriggerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codecommit/trigger:Trigger", name, state, makeResourceOptions(options, id));
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
    public static Trigger get(String name, Output<String> id, @Nullable TriggerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Trigger(name, id, state, options);
    }
}
