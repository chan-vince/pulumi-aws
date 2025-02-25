// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.finspace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KxClusterSavedownStorageConfiguration {
    /**
     * @return Size of temporary storage in gigabytes. Must be between 10 and 16000.
     * 
     */
    private Integer size;
    /**
     * @return Type of writeable storage space for temporarily storing your savedown data. The valid values are:
     * * SDS01 - This type represents 3000 IOPS and io2 ebs volume type.
     * 
     */
    private String type;

    private KxClusterSavedownStorageConfiguration() {}
    /**
     * @return Size of temporary storage in gigabytes. Must be between 10 and 16000.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return Type of writeable storage space for temporarily storing your savedown data. The valid values are:
     * * SDS01 - This type represents 3000 IOPS and io2 ebs volume type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KxClusterSavedownStorageConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer size;
        private String type;
        public Builder() {}
        public Builder(KxClusterSavedownStorageConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public KxClusterSavedownStorageConfiguration build() {
            final var o = new KxClusterSavedownStorageConfiguration();
            o.size = size;
            o.type = type;
            return o;
        }
    }
}
