// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CaCertificateValidity {
    /**
     * @return The certificate is not valid after this date.
     * 
     */
    private @Nullable String notAfter;
    /**
     * @return The certificate is not valid before this date.
     * 
     */
    private @Nullable String notBefore;

    private CaCertificateValidity() {}
    /**
     * @return The certificate is not valid after this date.
     * 
     */
    public Optional<String> notAfter() {
        return Optional.ofNullable(this.notAfter);
    }
    /**
     * @return The certificate is not valid before this date.
     * 
     */
    public Optional<String> notBefore() {
        return Optional.ofNullable(this.notBefore);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaCertificateValidity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String notAfter;
        private @Nullable String notBefore;
        public Builder() {}
        public Builder(CaCertificateValidity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notAfter = defaults.notAfter;
    	      this.notBefore = defaults.notBefore;
        }

        @CustomType.Setter
        public Builder notAfter(@Nullable String notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        @CustomType.Setter
        public Builder notBefore(@Nullable String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public CaCertificateValidity build() {
            final var o = new CaCertificateValidity();
            o.notAfter = notAfter;
            o.notBefore = notBefore;
            return o;
        }
    }
}
