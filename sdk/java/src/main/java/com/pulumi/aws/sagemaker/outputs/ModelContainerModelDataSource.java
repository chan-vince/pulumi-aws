// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.aws.sagemaker.outputs.ModelContainerModelDataSourceS3DataSource;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ModelContainerModelDataSource {
    /**
     * @return The S3 location of model data to deploy.
     * 
     */
    private List<ModelContainerModelDataSourceS3DataSource> s3DataSources;

    private ModelContainerModelDataSource() {}
    /**
     * @return The S3 location of model data to deploy.
     * 
     */
    public List<ModelContainerModelDataSourceS3DataSource> s3DataSources() {
        return this.s3DataSources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelContainerModelDataSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ModelContainerModelDataSourceS3DataSource> s3DataSources;
        public Builder() {}
        public Builder(ModelContainerModelDataSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3DataSources = defaults.s3DataSources;
        }

        @CustomType.Setter
        public Builder s3DataSources(List<ModelContainerModelDataSourceS3DataSource> s3DataSources) {
            this.s3DataSources = Objects.requireNonNull(s3DataSources);
            return this;
        }
        public Builder s3DataSources(ModelContainerModelDataSourceS3DataSource... s3DataSources) {
            return s3DataSources(List.of(s3DataSources));
        }
        public ModelContainerModelDataSource build() {
            final var o = new ModelContainerModelDataSource();
            o.s3DataSources = s3DataSources;
            return o;
        }
    }
}
