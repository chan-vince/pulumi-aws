// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBudgetPlannedLimit {
    /**
     * @return The cost or usage amount that&#39;s associated with a budget forecast, actual spend, or budget threshold. Length Constraints: Minimum length of `1`. Maximum length of `2147483647`.
     * 
     */
    private String amount;
    /**
     * @return (Required) The start time of the budget limit. Format: `2017-01-01_12:00`. See [PlannedBudgetLimits](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_Budget.html#awscostmanagement-Type-budgets_Budget-PlannedBudgetLimits) documentation.
     * 
     */
    private String startTime;
    /**
     * @return The unit of measurement that&#39;s used for the budget forecast, actual spend, or budget threshold, such as USD or GBP. Length Constraints: Minimum length of `1`. Maximum length of `2147483647`.
     * 
     */
    private String unit;

    private GetBudgetPlannedLimit() {}
    /**
     * @return The cost or usage amount that&#39;s associated with a budget forecast, actual spend, or budget threshold. Length Constraints: Minimum length of `1`. Maximum length of `2147483647`.
     * 
     */
    public String amount() {
        return this.amount;
    }
    /**
     * @return (Required) The start time of the budget limit. Format: `2017-01-01_12:00`. See [PlannedBudgetLimits](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_Budget.html#awscostmanagement-Type-budgets_Budget-PlannedBudgetLimits) documentation.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return The unit of measurement that&#39;s used for the budget forecast, actual spend, or budget threshold, such as USD or GBP. Length Constraints: Minimum length of `1`. Maximum length of `2147483647`.
     * 
     */
    public String unit() {
        return this.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBudgetPlannedLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String amount;
        private String startTime;
        private String unit;
        public Builder() {}
        public Builder(GetBudgetPlannedLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.startTime = defaults.startTime;
    	      this.unit = defaults.unit;
        }

        @CustomType.Setter
        public Builder amount(String amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        @CustomType.Setter
        public Builder unit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        public GetBudgetPlannedLimit build() {
            final var o = new GetBudgetPlannedLimit();
            o.amount = amount;
            o.startTime = startTime;
            o.unit = unit;
            return o;
        }
    }
}
