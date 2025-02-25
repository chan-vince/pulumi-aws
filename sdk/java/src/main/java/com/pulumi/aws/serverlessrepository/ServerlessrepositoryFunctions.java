// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.serverlessrepository;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.serverlessrepository.inputs.GetApplicationArgs;
import com.pulumi.aws.serverlessrepository.inputs.GetApplicationPlainArgs;
import com.pulumi.aws.serverlessrepository.outputs.GetApplicationResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ServerlessrepositoryFunctions {
    /**
     * Use this data source to get information about an AWS Serverless Application Repository application. For example, this can be used to determine the required `capabilities` for an application.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.serverlessrepository.ServerlessrepositoryFunctions;
     * import com.pulumi.aws.serverlessrepository.inputs.GetApplicationArgs;
     * import com.pulumi.aws.serverlessrepository.CloudFormationStack;
     * import com.pulumi.aws.serverlessrepository.CloudFormationStackArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var exampleApplication = ServerlessrepositoryFunctions.getApplication(GetApplicationArgs.builder()
     *             .applicationId(&#34;arn:aws:serverlessrepo:us-east-1:123456789012:applications/ExampleApplication&#34;)
     *             .build());
     * 
     *         var exampleCloudFormationStack = new CloudFormationStack(&#34;exampleCloudFormationStack&#34;, CloudFormationStackArgs.builder()        
     *             .applicationId(exampleApplication.applyValue(getApplicationResult -&gt; getApplicationResult.applicationId()))
     *             .semanticVersion(exampleApplication.applyValue(getApplicationResult -&gt; getApplicationResult.semanticVersion()))
     *             .capabilities(exampleApplication.applyValue(getApplicationResult -&gt; getApplicationResult.requiredCapabilities()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetApplicationResult> getApplication(GetApplicationArgs args) {
        return getApplication(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about an AWS Serverless Application Repository application. For example, this can be used to determine the required `capabilities` for an application.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.serverlessrepository.ServerlessrepositoryFunctions;
     * import com.pulumi.aws.serverlessrepository.inputs.GetApplicationArgs;
     * import com.pulumi.aws.serverlessrepository.CloudFormationStack;
     * import com.pulumi.aws.serverlessrepository.CloudFormationStackArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var exampleApplication = ServerlessrepositoryFunctions.getApplication(GetApplicationArgs.builder()
     *             .applicationId(&#34;arn:aws:serverlessrepo:us-east-1:123456789012:applications/ExampleApplication&#34;)
     *             .build());
     * 
     *         var exampleCloudFormationStack = new CloudFormationStack(&#34;exampleCloudFormationStack&#34;, CloudFormationStackArgs.builder()        
     *             .applicationId(exampleApplication.applyValue(getApplicationResult -&gt; getApplicationResult.applicationId()))
     *             .semanticVersion(exampleApplication.applyValue(getApplicationResult -&gt; getApplicationResult.semanticVersion()))
     *             .capabilities(exampleApplication.applyValue(getApplicationResult -&gt; getApplicationResult.requiredCapabilities()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplicationPlain(GetApplicationPlainArgs args) {
        return getApplicationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about an AWS Serverless Application Repository application. For example, this can be used to determine the required `capabilities` for an application.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.serverlessrepository.ServerlessrepositoryFunctions;
     * import com.pulumi.aws.serverlessrepository.inputs.GetApplicationArgs;
     * import com.pulumi.aws.serverlessrepository.CloudFormationStack;
     * import com.pulumi.aws.serverlessrepository.CloudFormationStackArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var exampleApplication = ServerlessrepositoryFunctions.getApplication(GetApplicationArgs.builder()
     *             .applicationId(&#34;arn:aws:serverlessrepo:us-east-1:123456789012:applications/ExampleApplication&#34;)
     *             .build());
     * 
     *         var exampleCloudFormationStack = new CloudFormationStack(&#34;exampleCloudFormationStack&#34;, CloudFormationStackArgs.builder()        
     *             .applicationId(exampleApplication.applyValue(getApplicationResult -&gt; getApplicationResult.applicationId()))
     *             .semanticVersion(exampleApplication.applyValue(getApplicationResult -&gt; getApplicationResult.semanticVersion()))
     *             .capabilities(exampleApplication.applyValue(getApplicationResult -&gt; getApplicationResult.requiredCapabilities()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetApplicationResult> getApplication(GetApplicationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:serverlessrepository/getApplication:getApplication", TypeShape.of(GetApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about an AWS Serverless Application Repository application. For example, this can be used to determine the required `capabilities` for an application.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.serverlessrepository.ServerlessrepositoryFunctions;
     * import com.pulumi.aws.serverlessrepository.inputs.GetApplicationArgs;
     * import com.pulumi.aws.serverlessrepository.CloudFormationStack;
     * import com.pulumi.aws.serverlessrepository.CloudFormationStackArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var exampleApplication = ServerlessrepositoryFunctions.getApplication(GetApplicationArgs.builder()
     *             .applicationId(&#34;arn:aws:serverlessrepo:us-east-1:123456789012:applications/ExampleApplication&#34;)
     *             .build());
     * 
     *         var exampleCloudFormationStack = new CloudFormationStack(&#34;exampleCloudFormationStack&#34;, CloudFormationStackArgs.builder()        
     *             .applicationId(exampleApplication.applyValue(getApplicationResult -&gt; getApplicationResult.applicationId()))
     *             .semanticVersion(exampleApplication.applyValue(getApplicationResult -&gt; getApplicationResult.semanticVersion()))
     *             .capabilities(exampleApplication.applyValue(getApplicationResult -&gt; getApplicationResult.requiredCapabilities()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplicationPlain(GetApplicationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:serverlessrepository/getApplication:getApplication", TypeShape.of(GetApplicationResult.class), args, Utilities.withVersion(options));
    }
}
