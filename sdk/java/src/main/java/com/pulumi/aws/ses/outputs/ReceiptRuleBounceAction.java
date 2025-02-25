// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReceiptRuleBounceAction {
    /**
     * @return The message to send
     * 
     */
    private String message;
    /**
     * @return The position of the action in the receipt rule
     * 
     */
    private Integer position;
    /**
     * @return The email address of the sender
     * 
     */
    private String sender;
    /**
     * @return The RFC 5321 SMTP reply code
     * 
     */
    private String smtpReplyCode;
    /**
     * @return The RFC 3463 SMTP enhanced status code
     * 
     */
    private @Nullable String statusCode;
    /**
     * @return The ARN of an SNS topic to notify
     * 
     */
    private @Nullable String topicArn;

    private ReceiptRuleBounceAction() {}
    /**
     * @return The message to send
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return The position of the action in the receipt rule
     * 
     */
    public Integer position() {
        return this.position;
    }
    /**
     * @return The email address of the sender
     * 
     */
    public String sender() {
        return this.sender;
    }
    /**
     * @return The RFC 5321 SMTP reply code
     * 
     */
    public String smtpReplyCode() {
        return this.smtpReplyCode;
    }
    /**
     * @return The RFC 3463 SMTP enhanced status code
     * 
     */
    public Optional<String> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }
    /**
     * @return The ARN of an SNS topic to notify
     * 
     */
    public Optional<String> topicArn() {
        return Optional.ofNullable(this.topicArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleBounceAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String message;
        private Integer position;
        private String sender;
        private String smtpReplyCode;
        private @Nullable String statusCode;
        private @Nullable String topicArn;
        public Builder() {}
        public Builder(ReceiptRuleBounceAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.position = defaults.position;
    	      this.sender = defaults.sender;
    	      this.smtpReplyCode = defaults.smtpReplyCode;
    	      this.statusCode = defaults.statusCode;
    	      this.topicArn = defaults.topicArn;
        }

        @CustomType.Setter
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        @CustomType.Setter
        public Builder position(Integer position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }
        @CustomType.Setter
        public Builder sender(String sender) {
            this.sender = Objects.requireNonNull(sender);
            return this;
        }
        @CustomType.Setter
        public Builder smtpReplyCode(String smtpReplyCode) {
            this.smtpReplyCode = Objects.requireNonNull(smtpReplyCode);
            return this;
        }
        @CustomType.Setter
        public Builder statusCode(@Nullable String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        @CustomType.Setter
        public Builder topicArn(@Nullable String topicArn) {
            this.topicArn = topicArn;
            return this;
        }
        public ReceiptRuleBounceAction build() {
            final var o = new ReceiptRuleBounceAction();
            o.message = message;
            o.position = position;
            o.sender = sender;
            o.smtpReplyCode = smtpReplyCode;
            o.statusCode = statusCode;
            o.topicArn = topicArn;
            return o;
        }
    }
}
