// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudtrail.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TrailInsightSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrailInsightSelectorArgs Empty = new TrailInsightSelectorArgs();

    /**
     * Type of insights to log on a trail. Valid values are: `ApiCallRateInsight` and `ApiErrorRateInsight`.
     * 
     */
    @Import(name="insightType", required=true)
    private Output<String> insightType;

    /**
     * @return Type of insights to log on a trail. Valid values are: `ApiCallRateInsight` and `ApiErrorRateInsight`.
     * 
     */
    public Output<String> insightType() {
        return this.insightType;
    }

    private TrailInsightSelectorArgs() {}

    private TrailInsightSelectorArgs(TrailInsightSelectorArgs $) {
        this.insightType = $.insightType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrailInsightSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrailInsightSelectorArgs $;

        public Builder() {
            $ = new TrailInsightSelectorArgs();
        }

        public Builder(TrailInsightSelectorArgs defaults) {
            $ = new TrailInsightSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param insightType Type of insights to log on a trail. Valid values are: `ApiCallRateInsight` and `ApiErrorRateInsight`.
         * 
         * @return builder
         * 
         */
        public Builder insightType(Output<String> insightType) {
            $.insightType = insightType;
            return this;
        }

        /**
         * @param insightType Type of insights to log on a trail. Valid values are: `ApiCallRateInsight` and `ApiErrorRateInsight`.
         * 
         * @return builder
         * 
         */
        public Builder insightType(String insightType) {
            return insightType(Output.of(insightType));
        }

        public TrailInsightSelectorArgs build() {
            $.insightType = Objects.requireNonNull($.insightType, "expected parameter 'insightType' to be non-null");
            return $;
        }
    }

}
