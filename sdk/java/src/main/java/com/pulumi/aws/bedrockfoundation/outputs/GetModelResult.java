// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bedrockfoundation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetModelResult {
    /**
     * @return Customizations that the model supports.
     * 
     */
    private List<String> customizationsSupporteds;
    private String id;
    /**
     * @return Inference types that the model supports.
     * 
     */
    private List<String> inferenceTypesSupporteds;
    /**
     * @return Input modalities that the model supports.
     * 
     */
    private List<String> inputModalities;
    /**
     * @return Model ARN.
     * 
     */
    private String modelArn;
    private String modelId;
    /**
     * @return Model name.
     * 
     */
    private String modelName;
    /**
     * @return Output modalities that the model supports.
     * 
     */
    private List<String> outputModalities;
    /**
     * @return Model provider name.
     * 
     */
    private String providerName;
    /**
     * @return Indicates whether the model supports streaming.
     * 
     */
    private Boolean responseStreamingSupported;

    private GetModelResult() {}
    /**
     * @return Customizations that the model supports.
     * 
     */
    public List<String> customizationsSupporteds() {
        return this.customizationsSupporteds;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Inference types that the model supports.
     * 
     */
    public List<String> inferenceTypesSupporteds() {
        return this.inferenceTypesSupporteds;
    }
    /**
     * @return Input modalities that the model supports.
     * 
     */
    public List<String> inputModalities() {
        return this.inputModalities;
    }
    /**
     * @return Model ARN.
     * 
     */
    public String modelArn() {
        return this.modelArn;
    }
    public String modelId() {
        return this.modelId;
    }
    /**
     * @return Model name.
     * 
     */
    public String modelName() {
        return this.modelName;
    }
    /**
     * @return Output modalities that the model supports.
     * 
     */
    public List<String> outputModalities() {
        return this.outputModalities;
    }
    /**
     * @return Model provider name.
     * 
     */
    public String providerName() {
        return this.providerName;
    }
    /**
     * @return Indicates whether the model supports streaming.
     * 
     */
    public Boolean responseStreamingSupported() {
        return this.responseStreamingSupported;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModelResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> customizationsSupporteds;
        private String id;
        private List<String> inferenceTypesSupporteds;
        private List<String> inputModalities;
        private String modelArn;
        private String modelId;
        private String modelName;
        private List<String> outputModalities;
        private String providerName;
        private Boolean responseStreamingSupported;
        public Builder() {}
        public Builder(GetModelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customizationsSupporteds = defaults.customizationsSupporteds;
    	      this.id = defaults.id;
    	      this.inferenceTypesSupporteds = defaults.inferenceTypesSupporteds;
    	      this.inputModalities = defaults.inputModalities;
    	      this.modelArn = defaults.modelArn;
    	      this.modelId = defaults.modelId;
    	      this.modelName = defaults.modelName;
    	      this.outputModalities = defaults.outputModalities;
    	      this.providerName = defaults.providerName;
    	      this.responseStreamingSupported = defaults.responseStreamingSupported;
        }

        @CustomType.Setter
        public Builder customizationsSupporteds(List<String> customizationsSupporteds) {
            this.customizationsSupporteds = Objects.requireNonNull(customizationsSupporteds);
            return this;
        }
        public Builder customizationsSupporteds(String... customizationsSupporteds) {
            return customizationsSupporteds(List.of(customizationsSupporteds));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder inferenceTypesSupporteds(List<String> inferenceTypesSupporteds) {
            this.inferenceTypesSupporteds = Objects.requireNonNull(inferenceTypesSupporteds);
            return this;
        }
        public Builder inferenceTypesSupporteds(String... inferenceTypesSupporteds) {
            return inferenceTypesSupporteds(List.of(inferenceTypesSupporteds));
        }
        @CustomType.Setter
        public Builder inputModalities(List<String> inputModalities) {
            this.inputModalities = Objects.requireNonNull(inputModalities);
            return this;
        }
        public Builder inputModalities(String... inputModalities) {
            return inputModalities(List.of(inputModalities));
        }
        @CustomType.Setter
        public Builder modelArn(String modelArn) {
            this.modelArn = Objects.requireNonNull(modelArn);
            return this;
        }
        @CustomType.Setter
        public Builder modelId(String modelId) {
            this.modelId = Objects.requireNonNull(modelId);
            return this;
        }
        @CustomType.Setter
        public Builder modelName(String modelName) {
            this.modelName = Objects.requireNonNull(modelName);
            return this;
        }
        @CustomType.Setter
        public Builder outputModalities(List<String> outputModalities) {
            this.outputModalities = Objects.requireNonNull(outputModalities);
            return this;
        }
        public Builder outputModalities(String... outputModalities) {
            return outputModalities(List.of(outputModalities));
        }
        @CustomType.Setter
        public Builder providerName(String providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }
        @CustomType.Setter
        public Builder responseStreamingSupported(Boolean responseStreamingSupported) {
            this.responseStreamingSupported = Objects.requireNonNull(responseStreamingSupported);
            return this;
        }
        public GetModelResult build() {
            final var o = new GetModelResult();
            o.customizationsSupporteds = customizationsSupporteds;
            o.id = id;
            o.inferenceTypesSupporteds = inferenceTypesSupporteds;
            o.inputModalities = inputModalities;
            o.modelArn = modelArn;
            o.modelId = modelId;
            o.modelName = modelName;
            o.outputModalities = outputModalities;
            o.providerName = providerName;
            o.responseStreamingSupported = responseStreamingSupported;
            return o;
        }
    }
}
