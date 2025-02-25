// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Gets the contents of the specified Systems Manager document.
 *
 * ## Example Usage
 *
 * To get the contents of the document owned by AWS.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const foo = aws.ssm.getDocument({
 *     name: "AWS-GatherSoftwareInventory",
 *     documentFormat: "YAML",
 * });
 * export const content = foo.then(foo => foo.content);
 * ```
 *
 * To get the contents of the custom document.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.ssm.getDocument({
 *     name: aws_ssm_document.test.name,
 *     documentFormat: "JSON",
 * });
 * ```
 */
export function getDocument(args: GetDocumentArgs, opts?: pulumi.InvokeOptions): Promise<GetDocumentResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ssm/getDocument:getDocument", {
        "documentFormat": args.documentFormat,
        "documentVersion": args.documentVersion,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getDocument.
 */
export interface GetDocumentArgs {
    /**
     * Returns the document in the specified format. The document format can be either `JSON`, `YAML` and `TEXT`. JSON is the default format.
     */
    documentFormat?: string;
    /**
     * Document version for which you want information.
     */
    documentVersion?: string;
    /**
     * Name of the Systems Manager document.
     */
    name: string;
}

/**
 * A collection of values returned by getDocument.
 */
export interface GetDocumentResult {
    /**
     * ARN of the document. If the document is an AWS managed document, this value will be set to the name of the document instead.
     */
    readonly arn: string;
    /**
     * Contents of the document.
     */
    readonly content: string;
    readonly documentFormat?: string;
    /**
     * Type of the document.
     */
    readonly documentType: string;
    readonly documentVersion?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
}
/**
 * Gets the contents of the specified Systems Manager document.
 *
 * ## Example Usage
 *
 * To get the contents of the document owned by AWS.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const foo = aws.ssm.getDocument({
 *     name: "AWS-GatherSoftwareInventory",
 *     documentFormat: "YAML",
 * });
 * export const content = foo.then(foo => foo.content);
 * ```
 *
 * To get the contents of the custom document.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.ssm.getDocument({
 *     name: aws_ssm_document.test.name,
 *     documentFormat: "JSON",
 * });
 * ```
 */
export function getDocumentOutput(args: GetDocumentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDocumentResult> {
    return pulumi.output(args).apply((a: any) => getDocument(a, opts))
}

/**
 * A collection of arguments for invoking getDocument.
 */
export interface GetDocumentOutputArgs {
    /**
     * Returns the document in the specified format. The document format can be either `JSON`, `YAML` and `TEXT`. JSON is the default format.
     */
    documentFormat?: pulumi.Input<string>;
    /**
     * Document version for which you want information.
     */
    documentVersion?: pulumi.Input<string>;
    /**
     * Name of the Systems Manager document.
     */
    name: pulumi.Input<string>;
}
