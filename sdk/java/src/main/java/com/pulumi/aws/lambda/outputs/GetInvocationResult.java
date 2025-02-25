// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInvocationResult {
    private String functionName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String input;
    private @Nullable String qualifier;
    /**
     * @return String result of the lambda function invocation.
     * 
     */
    private String result;

    private GetInvocationResult() {}
    public String functionName() {
        return this.functionName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String input() {
        return this.input;
    }
    public Optional<String> qualifier() {
        return Optional.ofNullable(this.qualifier);
    }
    /**
     * @return String result of the lambda function invocation.
     * 
     */
    public String result() {
        return this.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInvocationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String functionName;
        private String id;
        private String input;
        private @Nullable String qualifier;
        private String result;
        public Builder() {}
        public Builder(GetInvocationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
    	      this.id = defaults.id;
    	      this.input = defaults.input;
    	      this.qualifier = defaults.qualifier;
    	      this.result = defaults.result;
        }

        @CustomType.Setter
        public Builder functionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder input(String input) {
            this.input = Objects.requireNonNull(input);
            return this;
        }
        @CustomType.Setter
        public Builder qualifier(@Nullable String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        @CustomType.Setter
        public Builder result(String result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }
        public GetInvocationResult build() {
            final var o = new GetInvocationResult();
            o.functionName = functionName;
            o.id = id;
            o.input = input;
            o.qualifier = qualifier;
            o.result = result;
            return o;
        }
    }
}
