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
// source: google/cloud/retail/v2/user_event.proto

package com.google.cloud.retail.v2;

public final class UserEventProto {
  private UserEventProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_UserEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_UserEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_UserEvent_AttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_UserEvent_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ProductDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ProductDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_PurchaseTransaction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_PurchaseTransaction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/retail/v2/user_event.prot"
          + "o\022\026google.cloud.retail.v2\032\034google/api/an"
          + "notations.proto\032\037google/api/field_behavi"
          + "or.proto\032#google/cloud/retail/v2/common."
          + "proto\032$google/cloud/retail/v2/product.pr"
          + "oto\032\037google/protobuf/timestamp.proto\032\036go"
          + "ogle/protobuf/wrappers.proto\"\374\004\n\tUserEve"
          + "nt\022\027\n\nevent_type\030\001 \001(\tB\003\340A\002\022\027\n\nvisitor_i"
          + "d\030\002 \001(\tB\003\340A\002\022.\n\nevent_time\030\003 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\022\026\n\016experiment_ids\030\004"
          + " \003(\t\022\031\n\021attribution_token\030\005 \001(\t\022>\n\017produ"
          + "ct_details\030\006 \003(\0132%.google.cloud.retail.v"
          + "2.ProductDetail\022E\n\nattributes\030\007 \003(\01321.go"
          + "ogle.cloud.retail.v2.UserEvent.Attribute"
          + "sEntry\022\017\n\007cart_id\030\010 \001(\t\022I\n\024purchase_tran"
          + "saction\030\t \001(\0132+.google.cloud.retail.v2.P"
          + "urchaseTransaction\022\024\n\014search_query\030\n \001(\t"
          + "\022\027\n\017page_categories\030\013 \003(\t\0223\n\tuser_info\030\014"
          + " \001(\0132 .google.cloud.retail.v2.UserInfo\022\013"
          + "\n\003uri\030\r \001(\t\022\024\n\014referrer_uri\030\016 \001(\t\022\024\n\014pag"
          + "e_view_id\030\017 \001(\t\032Z\n\017AttributesEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\0226\n\005value\030\002 \001(\0132\'.google.cloud.re"
          + "tail.v2.CustomAttribute:\0028\001\"u\n\rProductDe"
          + "tail\0225\n\007product\030\001 \001(\0132\037.google.cloud.ret"
          + "ail.v2.ProductB\003\340A\002\022-\n\010quantity\030\002 \001(\0132\033."
          + "google.protobuf.Int32Value\"n\n\023PurchaseTr"
          + "ansaction\022\n\n\002id\030\001 \001(\t\022\024\n\007revenue\030\002 \001(\002B\003"
          + "\340A\002\022\013\n\003tax\030\003 \001(\002\022\014\n\004cost\030\004 \001(\002\022\032\n\rcurren"
          + "cy_code\030\005 \001(\tB\003\340A\002B\303\001\n\032com.google.cloud."
          + "retail.v2B\016UserEventProtoP\001Z<google.gola"
          + "ng.org/genproto/googleapis/cloud/retail/"
          + "v2;retail\242\002\006RETAIL\252\002\026Google.Cloud.Retail"
          + ".V2\312\002\026Google\\Cloud\\Retail\\V2\352\002\031Google::C"
          + "loud::Retail::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.retail.v2.CommonProto.getDescriptor(),
              com.google.cloud.retail.v2.ProductProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2_UserEvent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_UserEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_UserEvent_descriptor,
            new java.lang.String[] {
              "EventType",
              "VisitorId",
              "EventTime",
              "ExperimentIds",
              "AttributionToken",
              "ProductDetails",
              "Attributes",
              "CartId",
              "PurchaseTransaction",
              "SearchQuery",
              "PageCategories",
              "UserInfo",
              "Uri",
              "ReferrerUri",
              "PageViewId",
            });
    internal_static_google_cloud_retail_v2_UserEvent_AttributesEntry_descriptor =
        internal_static_google_cloud_retail_v2_UserEvent_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2_UserEvent_AttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_UserEvent_AttributesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_retail_v2_ProductDetail_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2_ProductDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ProductDetail_descriptor,
            new java.lang.String[] {
              "Product", "Quantity",
            });
    internal_static_google_cloud_retail_v2_PurchaseTransaction_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2_PurchaseTransaction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_PurchaseTransaction_descriptor,
            new java.lang.String[] {
              "Id", "Revenue", "Tax", "Cost", "CurrencyCode",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.retail.v2.CommonProto.getDescriptor();
    com.google.cloud.retail.v2.ProductProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}