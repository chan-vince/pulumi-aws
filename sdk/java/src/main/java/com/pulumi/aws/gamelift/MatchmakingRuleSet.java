// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.gamelift;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.gamelift.MatchmakingRuleSetArgs;
import com.pulumi.aws.gamelift.inputs.MatchmakingRuleSetState;
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
 * Provides a GameLift Matchmaking Rule Set resources.
 * 
 * ## Import
 * 
 * GameLift Matchmaking Rule Sets
 * 
 * can be imported using the ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:gamelift/matchmakingRuleSet:MatchmakingRuleSet example &lt;ruleset-id&gt;
 * ```
 * 
 */
@ResourceType(type="aws:gamelift/matchmakingRuleSet:MatchmakingRuleSet")
public class MatchmakingRuleSet extends com.pulumi.resources.CustomResource {
    /**
     * Rule Set ARN.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Rule Set ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Name of the matchmaking rule set.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the matchmaking rule set.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * JSON encoded string containing rule set data.
     * 
     */
    @Export(name="ruleSetBody", refs={String.class}, tree="[0]")
    private Output<String> ruleSetBody;

    /**
     * @return JSON encoded string containing rule set data.
     * 
     */
    public Output<String> ruleSetBody() {
        return this.ruleSetBody;
    }
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MatchmakingRuleSet(String name) {
        this(name, MatchmakingRuleSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MatchmakingRuleSet(String name, MatchmakingRuleSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MatchmakingRuleSet(String name, MatchmakingRuleSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:gamelift/matchmakingRuleSet:MatchmakingRuleSet", name, args == null ? MatchmakingRuleSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MatchmakingRuleSet(String name, Output<String> id, @Nullable MatchmakingRuleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:gamelift/matchmakingRuleSet:MatchmakingRuleSet", name, state, makeResourceOptions(options, id));
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
    public static MatchmakingRuleSet get(String name, Output<String> id, @Nullable MatchmakingRuleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MatchmakingRuleSet(name, id, state, options);
    }
}
