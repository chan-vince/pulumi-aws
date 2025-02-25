// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.BucketObjectv2OverrideProviderDefaultTags;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketObjectv2OverrideProvider {
    /**
     * @return Override the provider `default_tags` configuration block.
     * 
     */
    private @Nullable BucketObjectv2OverrideProviderDefaultTags defaultTags;

    private BucketObjectv2OverrideProvider() {}
    /**
     * @return Override the provider `default_tags` configuration block.
     * 
     */
    public Optional<BucketObjectv2OverrideProviderDefaultTags> defaultTags() {
        return Optional.ofNullable(this.defaultTags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectv2OverrideProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable BucketObjectv2OverrideProviderDefaultTags defaultTags;
        public Builder() {}
        public Builder(BucketObjectv2OverrideProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultTags = defaults.defaultTags;
        }

        @CustomType.Setter
        public Builder defaultTags(@Nullable BucketObjectv2OverrideProviderDefaultTags defaultTags) {
            this.defaultTags = defaultTags;
            return this;
        }
        public BucketObjectv2OverrideProvider build() {
            final var o = new BucketObjectv2OverrideProvider();
            o.defaultTags = defaultTags;
            return o;
        }
    }
}
