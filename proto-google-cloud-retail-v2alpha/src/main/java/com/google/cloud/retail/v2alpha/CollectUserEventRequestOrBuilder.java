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
// source: google/cloud/retail/v2alpha/user_event_service.proto

package com.google.cloud.retail.v2alpha;

public interface CollectUserEventRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.CollectUserEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent catalog name, such as
   * `projects/1234/locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent catalog name, such as
   * `projects/1234/locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. URL encoded UserEvent proto with a length limit of 2,000,000
   * characters.
   * </pre>
   *
   * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The userEvent.
   */
  java.lang.String getUserEvent();
  /**
   *
   *
   * <pre>
   * Required. URL encoded UserEvent proto with a length limit of 2,000,000
   * characters.
   * </pre>
   *
   * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for userEvent.
   */
  com.google.protobuf.ByteString getUserEventBytes();

  /**
   *
   *
   * <pre>
   * The URL including cgi-parameters but excluding the hash fragment with a
   * length limit of 5,000 characters. This is often more useful than the
   * referer URL, because many browsers only send the domain for 3rd party
   * requests.
   * </pre>
   *
   * <code>string uri = 3;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * The URL including cgi-parameters but excluding the hash fragment with a
   * length limit of 5,000 characters. This is often more useful than the
   * referer URL, because many browsers only send the domain for 3rd party
   * requests.
   * </pre>
   *
   * <code>string uri = 3;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * The event timestamp in milliseconds. This prevents browser caching of
   * otherwise identical get requests. The name is abbreviated to reduce the
   * payload bytes.
   * </pre>
   *
   * <code>int64 ets = 4;</code>
   *
   * @return The ets.
   */
  long getEts();
}
