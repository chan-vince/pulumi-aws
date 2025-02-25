// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudfront.CachePolicyArgs;
import com.pulumi.aws.cloudfront.inputs.CachePolicyState;
import com.pulumi.aws.cloudfront.outputs.CachePolicyParametersInCacheKeyAndForwardedToOrigin;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * Use the `aws.cloudfront.CachePolicy` resource to create a cache policy for CloudFront.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudfront.CachePolicy;
 * import com.pulumi.aws.cloudfront.CachePolicyArgs;
 * import com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginArgs;
 * import com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs;
 * import com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs;
 * import com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs;
 * import com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersArgs;
 * import com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigArgs;
 * import com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsArgs;
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
 *         var example = new CachePolicy(&#34;example&#34;, CachePolicyArgs.builder()        
 *             .comment(&#34;test comment&#34;)
 *             .defaultTtl(50)
 *             .maxTtl(100)
 *             .minTtl(1)
 *             .parametersInCacheKeyAndForwardedToOrigin(CachePolicyParametersInCacheKeyAndForwardedToOriginArgs.builder()
 *                 .cookiesConfig(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs.builder()
 *                     .cookieBehavior(&#34;whitelist&#34;)
 *                     .cookies(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs.builder()
 *                         .items(&#34;example&#34;)
 *                         .build())
 *                     .build())
 *                 .headersConfig(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs.builder()
 *                     .headerBehavior(&#34;whitelist&#34;)
 *                     .headers(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersArgs.builder()
 *                         .items(&#34;example&#34;)
 *                         .build())
 *                     .build())
 *                 .queryStringsConfig(CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigArgs.builder()
 *                     .queryStringBehavior(&#34;whitelist&#34;)
 *                     .queryStrings(CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsArgs.builder()
 *                         .items(&#34;example&#34;)
 *                         .build())
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
 * Using `pulumi import`, import CloudFront cache policies using the `id` of the cache policy. For example:
 * 
 * ```sh
 *  $ pulumi import aws:cloudfront/cachePolicy:CachePolicy policy 658327ea-f89d-4fab-a63d-7e88639e58f6
 * ```
 * 
 */
@ResourceType(type="aws:cloudfront/cachePolicy:CachePolicy")
public class CachePolicy extends com.pulumi.resources.CustomResource {
    /**
     * Description for the cache policy.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Description for the cache policy.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Amount of time, in seconds, that objects are allowed to remain in the CloudFront cache before CloudFront sends a new request to the origin server to check if the object has been updated.
     * 
     */
    @Export(name="defaultTtl", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> defaultTtl;

    /**
     * @return Amount of time, in seconds, that objects are allowed to remain in the CloudFront cache before CloudFront sends a new request to the origin server to check if the object has been updated.
     * 
     */
    public Output<Optional<Integer>> defaultTtl() {
        return Codegen.optional(this.defaultTtl);
    }
    /**
     * Current version of the cache policy.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return Current version of the cache policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Maximum amount of time, in seconds, that objects stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
     * 
     */
    @Export(name="maxTtl", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxTtl;

    /**
     * @return Maximum amount of time, in seconds, that objects stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
     * 
     */
    public Output<Optional<Integer>> maxTtl() {
        return Codegen.optional(this.maxTtl);
    }
    /**
     * Minimum amount of time, in seconds, that objects should remain in the CloudFront cache before a new request is sent to the origin to check for updates.
     * 
     */
    @Export(name="minTtl", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minTtl;

    /**
     * @return Minimum amount of time, in seconds, that objects should remain in the CloudFront cache before a new request is sent to the origin to check for updates.
     * 
     */
    public Output<Optional<Integer>> minTtl() {
        return Codegen.optional(this.minTtl);
    }
    /**
     * Unique name used to identify the cache policy.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Unique name used to identify the cache policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration for including HTTP headers, cookies, and URL query strings in the cache key. For more information, refer to the Parameters In Cache Key And Forwarded To Origin section.
     * 
     */
    @Export(name="parametersInCacheKeyAndForwardedToOrigin", refs={CachePolicyParametersInCacheKeyAndForwardedToOrigin.class}, tree="[0]")
    private Output<CachePolicyParametersInCacheKeyAndForwardedToOrigin> parametersInCacheKeyAndForwardedToOrigin;

    /**
     * @return Configuration for including HTTP headers, cookies, and URL query strings in the cache key. For more information, refer to the Parameters In Cache Key And Forwarded To Origin section.
     * 
     */
    public Output<CachePolicyParametersInCacheKeyAndForwardedToOrigin> parametersInCacheKeyAndForwardedToOrigin() {
        return this.parametersInCacheKeyAndForwardedToOrigin;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CachePolicy(String name) {
        this(name, CachePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CachePolicy(String name, CachePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CachePolicy(String name, CachePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudfront/cachePolicy:CachePolicy", name, args == null ? CachePolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CachePolicy(String name, Output<String> id, @Nullable CachePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudfront/cachePolicy:CachePolicy", name, state, makeResourceOptions(options, id));
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
    public static CachePolicy get(String name, Output<String> id, @Nullable CachePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CachePolicy(name, id, state, options);
    }
}
