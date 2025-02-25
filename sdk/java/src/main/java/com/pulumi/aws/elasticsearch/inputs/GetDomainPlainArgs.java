// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDomainPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainPlainArgs Empty = new GetDomainPlainArgs();

    /**
     * Name of the domain.
     * 
     */
    @Import(name="domainName", required=true)
    private String domainName;

    /**
     * @return Name of the domain.
     * 
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Tags assigned to the domain.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Tags assigned to the domain.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetDomainPlainArgs() {}

    private GetDomainPlainArgs(GetDomainPlainArgs $) {
        this.domainName = $.domainName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainPlainArgs $;

        public Builder() {
            $ = new GetDomainPlainArgs();
        }

        public Builder(GetDomainPlainArgs defaults) {
            $ = new GetDomainPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName Name of the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param tags Tags assigned to the domain.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetDomainPlainArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            return $;
        }
    }

}
