// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.aws.costexplorer.outputs.AnomalySubscriptionThresholdExpressionNotCostCategory;
import com.pulumi.aws.costexplorer.outputs.AnomalySubscriptionThresholdExpressionNotDimension;
import com.pulumi.aws.costexplorer.outputs.AnomalySubscriptionThresholdExpressionNotTags;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnomalySubscriptionThresholdExpressionNot {
    /**
     * @return Configuration block for the filter that&#39;s based on  values. See Cost Category below.
     * 
     */
    private @Nullable AnomalySubscriptionThresholdExpressionNotCostCategory costCategory;
    /**
     * @return Configuration block for the specific Dimension to use for.
     * 
     */
    private @Nullable AnomalySubscriptionThresholdExpressionNotDimension dimension;
    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    private @Nullable AnomalySubscriptionThresholdExpressionNotTags tags;

    private AnomalySubscriptionThresholdExpressionNot() {}
    /**
     * @return Configuration block for the filter that&#39;s based on  values. See Cost Category below.
     * 
     */
    public Optional<AnomalySubscriptionThresholdExpressionNotCostCategory> costCategory() {
        return Optional.ofNullable(this.costCategory);
    }
    /**
     * @return Configuration block for the specific Dimension to use for.
     * 
     */
    public Optional<AnomalySubscriptionThresholdExpressionNotDimension> dimension() {
        return Optional.ofNullable(this.dimension);
    }
    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<AnomalySubscriptionThresholdExpressionNotTags> tags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalySubscriptionThresholdExpressionNot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AnomalySubscriptionThresholdExpressionNotCostCategory costCategory;
        private @Nullable AnomalySubscriptionThresholdExpressionNotDimension dimension;
        private @Nullable AnomalySubscriptionThresholdExpressionNotTags tags;
        public Builder() {}
        public Builder(AnomalySubscriptionThresholdExpressionNot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.costCategory = defaults.costCategory;
    	      this.dimension = defaults.dimension;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder costCategory(@Nullable AnomalySubscriptionThresholdExpressionNotCostCategory costCategory) {
            this.costCategory = costCategory;
            return this;
        }
        @CustomType.Setter
        public Builder dimension(@Nullable AnomalySubscriptionThresholdExpressionNotDimension dimension) {
            this.dimension = dimension;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable AnomalySubscriptionThresholdExpressionNotTags tags) {
            this.tags = tags;
            return this;
        }
        public AnomalySubscriptionThresholdExpressionNot build() {
            final var o = new AnomalySubscriptionThresholdExpressionNot();
            o.costCategory = costCategory;
            o.dimension = dimension;
            o.tags = tags;
            return o;
        }
    }
}
