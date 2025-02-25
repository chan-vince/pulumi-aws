// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEventCategoriesResult {
    /**
     * @return List of the event categories.
     * 
     */
    private List<String> eventCategories;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String sourceType;

    private GetEventCategoriesResult() {}
    /**
     * @return List of the event categories.
     * 
     */
    public List<String> eventCategories() {
        return this.eventCategories;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> sourceType() {
        return Optional.ofNullable(this.sourceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventCategoriesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> eventCategories;
        private String id;
        private @Nullable String sourceType;
        public Builder() {}
        public Builder(GetEventCategoriesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventCategories = defaults.eventCategories;
    	      this.id = defaults.id;
    	      this.sourceType = defaults.sourceType;
        }

        @CustomType.Setter
        public Builder eventCategories(List<String> eventCategories) {
            this.eventCategories = Objects.requireNonNull(eventCategories);
            return this;
        }
        public Builder eventCategories(String... eventCategories) {
            return eventCategories(List.of(eventCategories));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder sourceType(@Nullable String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public GetEventCategoriesResult build() {
            final var o = new GetEventCategoriesResult();
            o.eventCategories = eventCategories;
            o.id = id;
            o.sourceType = sourceType;
            return o;
        }
    }
}
