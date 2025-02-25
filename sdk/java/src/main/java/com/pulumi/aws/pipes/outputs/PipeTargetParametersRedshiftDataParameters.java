// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pipes.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipeTargetParametersRedshiftDataParameters {
    /**
     * @return The name of the database. Required when authenticating using temporary credentials.
     * 
     */
    private String database;
    /**
     * @return The database user name. Required when authenticating using temporary credentials.
     * 
     */
    private @Nullable String dbUser;
    /**
     * @return The name or ARN of the secret that enables access to the database. Required when authenticating using Secrets Manager.
     * 
     */
    private @Nullable String secretManagerArn;
    /**
     * @return List of SQL statements text to run, each of maximum length of 100,000.
     * 
     */
    private List<String> sqls;
    /**
     * @return The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
     * 
     */
    private @Nullable String statementName;
    /**
     * @return Indicates whether to send an event back to EventBridge after the SQL statement runs.
     * 
     */
    private @Nullable Boolean withEvent;

    private PipeTargetParametersRedshiftDataParameters() {}
    /**
     * @return The name of the database. Required when authenticating using temporary credentials.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return The database user name. Required when authenticating using temporary credentials.
     * 
     */
    public Optional<String> dbUser() {
        return Optional.ofNullable(this.dbUser);
    }
    /**
     * @return The name or ARN of the secret that enables access to the database. Required when authenticating using Secrets Manager.
     * 
     */
    public Optional<String> secretManagerArn() {
        return Optional.ofNullable(this.secretManagerArn);
    }
    /**
     * @return List of SQL statements text to run, each of maximum length of 100,000.
     * 
     */
    public List<String> sqls() {
        return this.sqls;
    }
    /**
     * @return The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
     * 
     */
    public Optional<String> statementName() {
        return Optional.ofNullable(this.statementName);
    }
    /**
     * @return Indicates whether to send an event back to EventBridge after the SQL statement runs.
     * 
     */
    public Optional<Boolean> withEvent() {
        return Optional.ofNullable(this.withEvent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipeTargetParametersRedshiftDataParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String database;
        private @Nullable String dbUser;
        private @Nullable String secretManagerArn;
        private List<String> sqls;
        private @Nullable String statementName;
        private @Nullable Boolean withEvent;
        public Builder() {}
        public Builder(PipeTargetParametersRedshiftDataParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.dbUser = defaults.dbUser;
    	      this.secretManagerArn = defaults.secretManagerArn;
    	      this.sqls = defaults.sqls;
    	      this.statementName = defaults.statementName;
    	      this.withEvent = defaults.withEvent;
        }

        @CustomType.Setter
        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        @CustomType.Setter
        public Builder dbUser(@Nullable String dbUser) {
            this.dbUser = dbUser;
            return this;
        }
        @CustomType.Setter
        public Builder secretManagerArn(@Nullable String secretManagerArn) {
            this.secretManagerArn = secretManagerArn;
            return this;
        }
        @CustomType.Setter
        public Builder sqls(List<String> sqls) {
            this.sqls = Objects.requireNonNull(sqls);
            return this;
        }
        public Builder sqls(String... sqls) {
            return sqls(List.of(sqls));
        }
        @CustomType.Setter
        public Builder statementName(@Nullable String statementName) {
            this.statementName = statementName;
            return this;
        }
        @CustomType.Setter
        public Builder withEvent(@Nullable Boolean withEvent) {
            this.withEvent = withEvent;
            return this;
        }
        public PipeTargetParametersRedshiftDataParameters build() {
            final var o = new PipeTargetParametersRedshiftDataParameters();
            o.database = database;
            o.dbUser = dbUser;
            o.secretManagerArn = secretManagerArn;
            o.sqls = sqls;
            o.statementName = statementName;
            o.withEvent = withEvent;
            return o;
        }
    }
}
