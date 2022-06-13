/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/product_service.proto

package com.google.cloud.retail.v2alpha;

public interface ListProductsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.ListProductsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent branch resource name, such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/branches/0`. Use
   * `default_branch` as the branch ID, to list products under the default
   * branch.
   * If the caller does not have permission to list
   * [Product][google.cloud.retail.v2alpha.Product]s under this branch,
   * regardless of whether or not this branch exists, a PERMISSION_DENIED error
   * is returned.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent branch resource name, such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/branches/0`. Use
   * `default_branch` as the branch ID, to list products under the default
   * branch.
   * If the caller does not have permission to list
   * [Product][google.cloud.retail.v2alpha.Product]s under this branch,
   * regardless of whether or not this branch exists, a PERMISSION_DENIED error
   * is returned.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Maximum number of [Product][google.cloud.retail.v2alpha.Product]s to
   * return. If unspecified, defaults to 100. The maximum allowed value is 1000.
   * Values above 1000 will be coerced to 1000.
   * If this field is negative, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token
   * [ListProductsResponse.next_page_token][google.cloud.retail.v2alpha.ListProductsResponse.next_page_token],
   * received from a previous
   * [ProductService.ListProducts][google.cloud.retail.v2alpha.ProductService.ListProducts]
   * call. Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to
   * [ProductService.ListProducts][google.cloud.retail.v2alpha.ProductService.ListProducts]
   * must match the call that provided the page token. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A page token
   * [ListProductsResponse.next_page_token][google.cloud.retail.v2alpha.ListProductsResponse.next_page_token],
   * received from a previous
   * [ProductService.ListProducts][google.cloud.retail.v2alpha.ProductService.ListProducts]
   * call. Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to
   * [ProductService.ListProducts][google.cloud.retail.v2alpha.ProductService.ListProducts]
   * must match the call that provided the page token. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * A filter to apply on the list results. Supported features:
   * * List all the products under the parent branch if
   * [filter][google.cloud.retail.v2alpha.ListProductsRequest.filter] is unset.
   * * List
   * [Product.Type.VARIANT][google.cloud.retail.v2alpha.Product.Type.VARIANT]
   * [Product][google.cloud.retail.v2alpha.Product]s sharing the same
   *   [Product.Type.PRIMARY][google.cloud.retail.v2alpha.Product.Type.PRIMARY]
   *   [Product][google.cloud.retail.v2alpha.Product]. For example:
   *     `primary_product_id = "some_product_id"`
   * * List [Product][google.cloud.retail.v2alpha.Product]s bundled in a
   * [Product.Type.COLLECTION][google.cloud.retail.v2alpha.Product.Type.COLLECTION]
   * [Product][google.cloud.retail.v2alpha.Product].
   *   For example:
   *     `collection_product_id = "some_product_id"`
   * * List [Product][google.cloud.retail.v2alpha.Product]s with a partibular
   * type. For example:
   *     `type = "PRIMARY"`
   *     `type = "VARIANT"`
   *     `type = "COLLECTION"`
   * If the field is unrecognizable, an INVALID_ARGUMENT error is returned.
   * If the specified
   * [Product.Type.PRIMARY][google.cloud.retail.v2alpha.Product.Type.PRIMARY]
   * [Product][google.cloud.retail.v2alpha.Product] or
   * [Product.Type.COLLECTION][google.cloud.retail.v2alpha.Product.Type.COLLECTION]
   * [Product][google.cloud.retail.v2alpha.Product] does not exist, a NOT_FOUND
   * error is returned.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * A filter to apply on the list results. Supported features:
   * * List all the products under the parent branch if
   * [filter][google.cloud.retail.v2alpha.ListProductsRequest.filter] is unset.
   * * List
   * [Product.Type.VARIANT][google.cloud.retail.v2alpha.Product.Type.VARIANT]
   * [Product][google.cloud.retail.v2alpha.Product]s sharing the same
   *   [Product.Type.PRIMARY][google.cloud.retail.v2alpha.Product.Type.PRIMARY]
   *   [Product][google.cloud.retail.v2alpha.Product]. For example:
   *     `primary_product_id = "some_product_id"`
   * * List [Product][google.cloud.retail.v2alpha.Product]s bundled in a
   * [Product.Type.COLLECTION][google.cloud.retail.v2alpha.Product.Type.COLLECTION]
   * [Product][google.cloud.retail.v2alpha.Product].
   *   For example:
   *     `collection_product_id = "some_product_id"`
   * * List [Product][google.cloud.retail.v2alpha.Product]s with a partibular
   * type. For example:
   *     `type = "PRIMARY"`
   *     `type = "VARIANT"`
   *     `type = "COLLECTION"`
   * If the field is unrecognizable, an INVALID_ARGUMENT error is returned.
   * If the specified
   * [Product.Type.PRIMARY][google.cloud.retail.v2alpha.Product.Type.PRIMARY]
   * [Product][google.cloud.retail.v2alpha.Product] or
   * [Product.Type.COLLECTION][google.cloud.retail.v2alpha.Product.Type.COLLECTION]
   * [Product][google.cloud.retail.v2alpha.Product] does not exist, a NOT_FOUND
   * error is returned.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The fields of [Product][google.cloud.retail.v2alpha.Product] to return in
   * the responses. If not set or empty, the following fields are returned:
   * * [Product.name][google.cloud.retail.v2alpha.Product.name]
   * * [Product.id][google.cloud.retail.v2alpha.Product.id]
   * * [Product.title][google.cloud.retail.v2alpha.Product.title]
   * * [Product.uri][google.cloud.retail.v2alpha.Product.uri]
   * * [Product.images][google.cloud.retail.v2alpha.Product.images]
   * * [Product.price_info][google.cloud.retail.v2alpha.Product.price_info]
   * * [Product.brands][google.cloud.retail.v2alpha.Product.brands]
   * If "*" is provided, all fields are returned.
   * [Product.name][google.cloud.retail.v2alpha.Product.name] is always returned
   * no matter what mask is set.
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5;</code>
   *
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   *
   *
   * <pre>
   * The fields of [Product][google.cloud.retail.v2alpha.Product] to return in
   * the responses. If not set or empty, the following fields are returned:
   * * [Product.name][google.cloud.retail.v2alpha.Product.name]
   * * [Product.id][google.cloud.retail.v2alpha.Product.id]
   * * [Product.title][google.cloud.retail.v2alpha.Product.title]
   * * [Product.uri][google.cloud.retail.v2alpha.Product.uri]
   * * [Product.images][google.cloud.retail.v2alpha.Product.images]
   * * [Product.price_info][google.cloud.retail.v2alpha.Product.price_info]
   * * [Product.brands][google.cloud.retail.v2alpha.Product.brands]
   * If "*" is provided, all fields are returned.
   * [Product.name][google.cloud.retail.v2alpha.Product.name] is always returned
   * no matter what mask is set.
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5;</code>
   *
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   *
   *
   * <pre>
   * The fields of [Product][google.cloud.retail.v2alpha.Product] to return in
   * the responses. If not set or empty, the following fields are returned:
   * * [Product.name][google.cloud.retail.v2alpha.Product.name]
   * * [Product.id][google.cloud.retail.v2alpha.Product.id]
   * * [Product.title][google.cloud.retail.v2alpha.Product.title]
   * * [Product.uri][google.cloud.retail.v2alpha.Product.uri]
   * * [Product.images][google.cloud.retail.v2alpha.Product.images]
   * * [Product.price_info][google.cloud.retail.v2alpha.Product.price_info]
   * * [Product.brands][google.cloud.retail.v2alpha.Product.brands]
   * If "*" is provided, all fields are returned.
   * [Product.name][google.cloud.retail.v2alpha.Product.name] is always returned
   * no matter what mask is set.
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * If true and
   * [page_token][google.cloud.retail.v2alpha.ListProductsRequest.page_token] is
   * empty,
   * [ListProductsResponse.total_size][google.cloud.retail.v2alpha.ListProductsResponse.total_size]
   * is set to the total count of matched items irrespective of pagination.
   * Notice that setting this field to true affects the performance.
   * </pre>
   *
   * <code>bool require_total_size = 6;</code>
   *
   * @return The requireTotalSize.
   */
  boolean getRequireTotalSize();
}