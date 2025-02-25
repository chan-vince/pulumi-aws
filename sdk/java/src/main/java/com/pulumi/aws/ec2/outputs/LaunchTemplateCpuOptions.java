// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LaunchTemplateCpuOptions {
    /**
     * @return Indicates whether to enable the instance for AMD SEV-SNP. AMD SEV-SNP is supported with M6a, R6a, and C6a instance types only. Valid values are `enabled` and `disabled`.
     * 
     */
    private @Nullable String amdSevSnp;
    /**
     * @return The number of CPU cores for the instance.
     * 
     */
    private @Nullable Integer coreCount;
    /**
     * @return The number of threads per CPU core.
     * To disable Intel Hyper-Threading Technology for the instance, specify a value of 1.
     * Otherwise, specify the default value of 2.
     * 
     * Both number of CPU cores and threads per core must be specified. Valid number of CPU cores and threads per core for the instance type can be found in the [CPU Options Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html?shortFooter=true#cpu-options-supported-instances-values)
     * 
     */
    private @Nullable Integer threadsPerCore;

    private LaunchTemplateCpuOptions() {}
    /**
     * @return Indicates whether to enable the instance for AMD SEV-SNP. AMD SEV-SNP is supported with M6a, R6a, and C6a instance types only. Valid values are `enabled` and `disabled`.
     * 
     */
    public Optional<String> amdSevSnp() {
        return Optional.ofNullable(this.amdSevSnp);
    }
    /**
     * @return The number of CPU cores for the instance.
     * 
     */
    public Optional<Integer> coreCount() {
        return Optional.ofNullable(this.coreCount);
    }
    /**
     * @return The number of threads per CPU core.
     * To disable Intel Hyper-Threading Technology for the instance, specify a value of 1.
     * Otherwise, specify the default value of 2.
     * 
     * Both number of CPU cores and threads per core must be specified. Valid number of CPU cores and threads per core for the instance type can be found in the [CPU Options Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html?shortFooter=true#cpu-options-supported-instances-values)
     * 
     */
    public Optional<Integer> threadsPerCore() {
        return Optional.ofNullable(this.threadsPerCore);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateCpuOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String amdSevSnp;
        private @Nullable Integer coreCount;
        private @Nullable Integer threadsPerCore;
        public Builder() {}
        public Builder(LaunchTemplateCpuOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amdSevSnp = defaults.amdSevSnp;
    	      this.coreCount = defaults.coreCount;
    	      this.threadsPerCore = defaults.threadsPerCore;
        }

        @CustomType.Setter
        public Builder amdSevSnp(@Nullable String amdSevSnp) {
            this.amdSevSnp = amdSevSnp;
            return this;
        }
        @CustomType.Setter
        public Builder coreCount(@Nullable Integer coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        @CustomType.Setter
        public Builder threadsPerCore(@Nullable Integer threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public LaunchTemplateCpuOptions build() {
            final var o = new LaunchTemplateCpuOptions();
            o.amdSevSnp = amdSevSnp;
            o.coreCount = coreCount;
            o.threadsPerCore = threadsPerCore;
            return o;
        }
    }
}
