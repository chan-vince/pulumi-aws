// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetParametersByPathPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetParametersByPathPlainArgs Empty = new GetParametersByPathPlainArgs();

    /**
     * The hierarchy for the parameter. Hierarchies start with a forward slash (/). The hierarchy is the parameter name except the last part of the parameter. The last part of the parameter name can&#39;t be in the path. A parameter name hierarchy can have a maximum of 15 levels. **Note:** If the parameter name (e.g., `/my-app/my-param`) is specified, the data source will not retrieve any value as designed, unless there are other parameters that happen to use the former path in their hierarchy (e.g., `/my-app/my-param/my-actual-param`).
     * 
     */
    @Import(name="path", required=true)
    private String path;

    /**
     * @return The hierarchy for the parameter. Hierarchies start with a forward slash (/). The hierarchy is the parameter name except the last part of the parameter. The last part of the parameter name can&#39;t be in the path. A parameter name hierarchy can have a maximum of 15 levels. **Note:** If the parameter name (e.g., `/my-app/my-param`) is specified, the data source will not retrieve any value as designed, unless there are other parameters that happen to use the former path in their hierarchy (e.g., `/my-app/my-param/my-actual-param`).
     * 
     */
    public String path() {
        return this.path;
    }

    /**
     * Whether to retrieve all parameters within the hirerachy. Defaults to `false`.
     * 
     */
    @Import(name="recursive")
    private @Nullable Boolean recursive;

    /**
     * @return Whether to retrieve all parameters within the hirerachy. Defaults to `false`.
     * 
     */
    public Optional<Boolean> recursive() {
        return Optional.ofNullable(this.recursive);
    }

    /**
     * Whether to retrieve all parameters in the hierarchy, particularly those of `SecureString` type, with their value decrypted. Defaults to `true`.
     * 
     */
    @Import(name="withDecryption")
    private @Nullable Boolean withDecryption;

    /**
     * @return Whether to retrieve all parameters in the hierarchy, particularly those of `SecureString` type, with their value decrypted. Defaults to `true`.
     * 
     */
    public Optional<Boolean> withDecryption() {
        return Optional.ofNullable(this.withDecryption);
    }

    private GetParametersByPathPlainArgs() {}

    private GetParametersByPathPlainArgs(GetParametersByPathPlainArgs $) {
        this.path = $.path;
        this.recursive = $.recursive;
        this.withDecryption = $.withDecryption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetParametersByPathPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetParametersByPathPlainArgs $;

        public Builder() {
            $ = new GetParametersByPathPlainArgs();
        }

        public Builder(GetParametersByPathPlainArgs defaults) {
            $ = new GetParametersByPathPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path The hierarchy for the parameter. Hierarchies start with a forward slash (/). The hierarchy is the parameter name except the last part of the parameter. The last part of the parameter name can&#39;t be in the path. A parameter name hierarchy can have a maximum of 15 levels. **Note:** If the parameter name (e.g., `/my-app/my-param`) is specified, the data source will not retrieve any value as designed, unless there are other parameters that happen to use the former path in their hierarchy (e.g., `/my-app/my-param/my-actual-param`).
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            $.path = path;
            return this;
        }

        /**
         * @param recursive Whether to retrieve all parameters within the hirerachy. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder recursive(@Nullable Boolean recursive) {
            $.recursive = recursive;
            return this;
        }

        /**
         * @param withDecryption Whether to retrieve all parameters in the hierarchy, particularly those of `SecureString` type, with their value decrypted. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder withDecryption(@Nullable Boolean withDecryption) {
            $.withDecryption = withDecryption;
            return this;
        }

        public GetParametersByPathPlainArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
