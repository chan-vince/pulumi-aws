// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetLaunchTemplateCapacityReservationSpecificationCapacityReservationTarget;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLaunchTemplateCapacityReservationSpecification {
    private String capacityReservationPreference;
    private List<GetLaunchTemplateCapacityReservationSpecificationCapacityReservationTarget> capacityReservationTargets;

    private GetLaunchTemplateCapacityReservationSpecification() {}
    public String capacityReservationPreference() {
        return this.capacityReservationPreference;
    }
    public List<GetLaunchTemplateCapacityReservationSpecificationCapacityReservationTarget> capacityReservationTargets() {
        return this.capacityReservationTargets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateCapacityReservationSpecification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String capacityReservationPreference;
        private List<GetLaunchTemplateCapacityReservationSpecificationCapacityReservationTarget> capacityReservationTargets;
        public Builder() {}
        public Builder(GetLaunchTemplateCapacityReservationSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationPreference = defaults.capacityReservationPreference;
    	      this.capacityReservationTargets = defaults.capacityReservationTargets;
        }

        @CustomType.Setter
        public Builder capacityReservationPreference(String capacityReservationPreference) {
            this.capacityReservationPreference = Objects.requireNonNull(capacityReservationPreference);
            return this;
        }
        @CustomType.Setter
        public Builder capacityReservationTargets(List<GetLaunchTemplateCapacityReservationSpecificationCapacityReservationTarget> capacityReservationTargets) {
            this.capacityReservationTargets = Objects.requireNonNull(capacityReservationTargets);
            return this;
        }
        public Builder capacityReservationTargets(GetLaunchTemplateCapacityReservationSpecificationCapacityReservationTarget... capacityReservationTargets) {
            return capacityReservationTargets(List.of(capacityReservationTargets));
        }
        public GetLaunchTemplateCapacityReservationSpecification build() {
            final var o = new GetLaunchTemplateCapacityReservationSpecification();
            o.capacityReservationPreference = capacityReservationPreference;
            o.capacityReservationTargets = capacityReservationTargets;
            return o;
        }
    }
}
