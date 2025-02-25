// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.InventoryDestinationBucketEncryptionSseKms;
import com.pulumi.aws.s3.outputs.InventoryDestinationBucketEncryptionSseS3;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InventoryDestinationBucketEncryption {
    /**
     * @return Specifies to use server-side encryption with AWS KMS-managed keys to encrypt the inventory file (documented below).
     * 
     */
    private @Nullable InventoryDestinationBucketEncryptionSseKms sseKms;
    /**
     * @return Specifies to use server-side encryption with Amazon S3-managed keys (SSE-S3) to encrypt the inventory file.
     * 
     */
    private @Nullable InventoryDestinationBucketEncryptionSseS3 sseS3;

    private InventoryDestinationBucketEncryption() {}
    /**
     * @return Specifies to use server-side encryption with AWS KMS-managed keys to encrypt the inventory file (documented below).
     * 
     */
    public Optional<InventoryDestinationBucketEncryptionSseKms> sseKms() {
        return Optional.ofNullable(this.sseKms);
    }
    /**
     * @return Specifies to use server-side encryption with Amazon S3-managed keys (SSE-S3) to encrypt the inventory file.
     * 
     */
    public Optional<InventoryDestinationBucketEncryptionSseS3> sseS3() {
        return Optional.ofNullable(this.sseS3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryDestinationBucketEncryption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable InventoryDestinationBucketEncryptionSseKms sseKms;
        private @Nullable InventoryDestinationBucketEncryptionSseS3 sseS3;
        public Builder() {}
        public Builder(InventoryDestinationBucketEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sseKms = defaults.sseKms;
    	      this.sseS3 = defaults.sseS3;
        }

        @CustomType.Setter
        public Builder sseKms(@Nullable InventoryDestinationBucketEncryptionSseKms sseKms) {
            this.sseKms = sseKms;
            return this;
        }
        @CustomType.Setter
        public Builder sseS3(@Nullable InventoryDestinationBucketEncryptionSseS3 sseS3) {
            this.sseS3 = sseS3;
            return this;
        }
        public InventoryDestinationBucketEncryption build() {
            final var o = new InventoryDestinationBucketEncryption();
            o.sseKms = sseKms;
            o.sseS3 = sseS3;
            return o;
        }
    }
}
