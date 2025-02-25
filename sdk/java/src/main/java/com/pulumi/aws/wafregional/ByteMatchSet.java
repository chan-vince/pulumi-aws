// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.wafregional.ByteMatchSetArgs;
import com.pulumi.aws.wafregional.inputs.ByteMatchSetState;
import com.pulumi.aws.wafregional.outputs.ByteMatchSetByteMatchTuple;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a WAF Regional Byte Match Set Resource for use with Application Load Balancer.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.wafregional.ByteMatchSet;
 * import com.pulumi.aws.wafregional.ByteMatchSetArgs;
 * import com.pulumi.aws.wafregional.inputs.ByteMatchSetByteMatchTupleArgs;
 * import com.pulumi.aws.wafregional.inputs.ByteMatchSetByteMatchTupleFieldToMatchArgs;
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
 *         var byteSet = new ByteMatchSet(&#34;byteSet&#34;, ByteMatchSetArgs.builder()        
 *             .byteMatchTuples(ByteMatchSetByteMatchTupleArgs.builder()
 *                 .fieldToMatch(ByteMatchSetByteMatchTupleFieldToMatchArgs.builder()
 *                     .data(&#34;referer&#34;)
 *                     .type(&#34;HEADER&#34;)
 *                     .build())
 *                 .positionalConstraint(&#34;CONTAINS&#34;)
 *                 .targetString(&#34;badrefer1&#34;)
 *                 .textTransformation(&#34;NONE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import WAF Regional Byte Match Set using the id. For example:
 * 
 * ```sh
 *  $ pulumi import aws:wafregional/byteMatchSet:ByteMatchSet byte_set a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:wafregional/byteMatchSet:ByteMatchSet")
public class ByteMatchSet extends com.pulumi.resources.CustomResource {
    /**
     * Settings for the ByteMatchSet, such as the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests. ByteMatchTuple documented below.
     * 
     */
    @Export(name="byteMatchTuples", refs={List.class,ByteMatchSetByteMatchTuple.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ByteMatchSetByteMatchTuple>> byteMatchTuples;

    /**
     * @return Settings for the ByteMatchSet, such as the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests. ByteMatchTuple documented below.
     * 
     */
    public Output<Optional<List<ByteMatchSetByteMatchTuple>>> byteMatchTuples() {
        return Codegen.optional(this.byteMatchTuples);
    }
    /**
     * The name or description of the ByteMatchSet.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name or description of the ByteMatchSet.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ByteMatchSet(String name) {
        this(name, ByteMatchSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ByteMatchSet(String name, @Nullable ByteMatchSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ByteMatchSet(String name, @Nullable ByteMatchSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/byteMatchSet:ByteMatchSet", name, args == null ? ByteMatchSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ByteMatchSet(String name, Output<String> id, @Nullable ByteMatchSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/byteMatchSet:ByteMatchSet", name, state, makeResourceOptions(options, id));
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
    public static ByteMatchSet get(String name, Output<String> id, @Nullable ByteMatchSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ByteMatchSet(name, id, state, options);
    }
}
