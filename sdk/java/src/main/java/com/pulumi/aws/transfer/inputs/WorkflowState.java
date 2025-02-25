// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.inputs;

import com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepArgs;
import com.pulumi.aws.transfer.inputs.WorkflowStepArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowState extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowState Empty = new WorkflowState();

    /**
     * The Workflow ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Workflow ARN.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A textual description for the workflow.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A textual description for the workflow.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the steps (actions) to take if errors are encountered during execution of the workflow. See Workflow Steps below.
     * 
     */
    @Import(name="onExceptionSteps")
    private @Nullable Output<List<WorkflowOnExceptionStepArgs>> onExceptionSteps;

    /**
     * @return Specifies the steps (actions) to take if errors are encountered during execution of the workflow. See Workflow Steps below.
     * 
     */
    public Optional<Output<List<WorkflowOnExceptionStepArgs>>> onExceptionSteps() {
        return Optional.ofNullable(this.onExceptionSteps);
    }

    /**
     * Specifies the details for the steps that are in the specified workflow. See Workflow Steps below.
     * 
     */
    @Import(name="steps")
    private @Nullable Output<List<WorkflowStepArgs>> steps;

    /**
     * @return Specifies the details for the steps that are in the specified workflow. See Workflow Steps below.
     * 
     */
    public Optional<Output<List<WorkflowStepArgs>>> steps() {
        return Optional.ofNullable(this.steps);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private WorkflowState() {}

    private WorkflowState(WorkflowState $) {
        this.arn = $.arn;
        this.description = $.description;
        this.onExceptionSteps = $.onExceptionSteps;
        this.steps = $.steps;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowState $;

        public Builder() {
            $ = new WorkflowState();
        }

        public Builder(WorkflowState defaults) {
            $ = new WorkflowState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Workflow ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Workflow ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param description A textual description for the workflow.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A textual description for the workflow.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered during execution of the workflow. See Workflow Steps below.
         * 
         * @return builder
         * 
         */
        public Builder onExceptionSteps(@Nullable Output<List<WorkflowOnExceptionStepArgs>> onExceptionSteps) {
            $.onExceptionSteps = onExceptionSteps;
            return this;
        }

        /**
         * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered during execution of the workflow. See Workflow Steps below.
         * 
         * @return builder
         * 
         */
        public Builder onExceptionSteps(List<WorkflowOnExceptionStepArgs> onExceptionSteps) {
            return onExceptionSteps(Output.of(onExceptionSteps));
        }

        /**
         * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered during execution of the workflow. See Workflow Steps below.
         * 
         * @return builder
         * 
         */
        public Builder onExceptionSteps(WorkflowOnExceptionStepArgs... onExceptionSteps) {
            return onExceptionSteps(List.of(onExceptionSteps));
        }

        /**
         * @param steps Specifies the details for the steps that are in the specified workflow. See Workflow Steps below.
         * 
         * @return builder
         * 
         */
        public Builder steps(@Nullable Output<List<WorkflowStepArgs>> steps) {
            $.steps = steps;
            return this;
        }

        /**
         * @param steps Specifies the details for the steps that are in the specified workflow. See Workflow Steps below.
         * 
         * @return builder
         * 
         */
        public Builder steps(List<WorkflowStepArgs> steps) {
            return steps(Output.of(steps));
        }

        /**
         * @param steps Specifies the details for the steps that are in the specified workflow. See Workflow Steps below.
         * 
         * @return builder
         * 
         */
        public Builder steps(WorkflowStepArgs... steps) {
            return steps(List.of(steps));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         * @deprecated
         * Please use `tags` instead.
         * 
         */
        @Deprecated /* Please use `tags` instead. */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         * @deprecated
         * Please use `tags` instead.
         * 
         */
        @Deprecated /* Please use `tags` instead. */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public WorkflowState build() {
            return $;
        }
    }

}
