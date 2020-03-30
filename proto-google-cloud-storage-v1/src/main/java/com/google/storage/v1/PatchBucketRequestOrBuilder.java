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
// source: google/storage/v1/storage.proto

package com.google.storage.v1;

public interface PatchBucketRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.storage.v1.PatchBucketRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of a bucket.
   * </pre>
   *
   * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bucket.
   */
  java.lang.String getBucket();
  /**
   *
   *
   * <pre>
   * Required. Name of a bucket.
   * </pre>
   *
   * <code>string bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for bucket.
   */
  com.google.protobuf.ByteString getBucketBytes();

  /**
   *
   *
   * <pre>
   * Makes the return of the bucket metadata conditional on whether the bucket's
   * current metageneration matches the given value.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value if_metageneration_match = 2;</code>
   *
   * @return Whether the ifMetagenerationMatch field is set.
   */
  boolean hasIfMetagenerationMatch();
  /**
   *
   *
   * <pre>
   * Makes the return of the bucket metadata conditional on whether the bucket's
   * current metageneration matches the given value.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value if_metageneration_match = 2;</code>
   *
   * @return The ifMetagenerationMatch.
   */
  com.google.protobuf.Int64Value getIfMetagenerationMatch();
  /**
   *
   *
   * <pre>
   * Makes the return of the bucket metadata conditional on whether the bucket's
   * current metageneration matches the given value.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value if_metageneration_match = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIfMetagenerationMatchOrBuilder();

  /**
   *
   *
   * <pre>
   * Makes the return of the bucket metadata conditional on whether the bucket's
   * current metageneration does not match the given value.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value if_metageneration_not_match = 3;</code>
   *
   * @return Whether the ifMetagenerationNotMatch field is set.
   */
  boolean hasIfMetagenerationNotMatch();
  /**
   *
   *
   * <pre>
   * Makes the return of the bucket metadata conditional on whether the bucket's
   * current metageneration does not match the given value.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value if_metageneration_not_match = 3;</code>
   *
   * @return The ifMetagenerationNotMatch.
   */
  com.google.protobuf.Int64Value getIfMetagenerationNotMatch();
  /**
   *
   *
   * <pre>
   * Makes the return of the bucket metadata conditional on whether the bucket's
   * current metageneration does not match the given value.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value if_metageneration_not_match = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIfMetagenerationNotMatchOrBuilder();

  /**
   *
   *
   * <pre>
   * Apply a predefined set of access controls to this bucket.
   * </pre>
   *
   * <code>.google.storage.v1.CommonEnums.PredefinedBucketAcl predefined_acl = 4;</code>
   *
   * @return The enum numeric value on the wire for predefinedAcl.
   */
  int getPredefinedAclValue();
  /**
   *
   *
   * <pre>
   * Apply a predefined set of access controls to this bucket.
   * </pre>
   *
   * <code>.google.storage.v1.CommonEnums.PredefinedBucketAcl predefined_acl = 4;</code>
   *
   * @return The predefinedAcl.
   */
  com.google.storage.v1.CommonEnums.PredefinedBucketAcl getPredefinedAcl();

  /**
   *
   *
   * <pre>
   * Apply a predefined set of default object access controls to this bucket.
   * </pre>
   *
   * <code>.google.storage.v1.CommonEnums.PredefinedObjectAcl predefined_default_object_acl = 5;
   * </code>
   *
   * @return The enum numeric value on the wire for predefinedDefaultObjectAcl.
   */
  int getPredefinedDefaultObjectAclValue();
  /**
   *
   *
   * <pre>
   * Apply a predefined set of default object access controls to this bucket.
   * </pre>
   *
   * <code>.google.storage.v1.CommonEnums.PredefinedObjectAcl predefined_default_object_acl = 5;
   * </code>
   *
   * @return The predefinedDefaultObjectAcl.
   */
  com.google.storage.v1.CommonEnums.PredefinedObjectAcl getPredefinedDefaultObjectAcl();

  /**
   *
   *
   * <pre>
   * Set of properties to return. Defaults to `FULL`.
   * </pre>
   *
   * <code>.google.storage.v1.CommonEnums.Projection projection = 6;</code>
   *
   * @return The enum numeric value on the wire for projection.
   */
  int getProjectionValue();
  /**
   *
   *
   * <pre>
   * Set of properties to return. Defaults to `FULL`.
   * </pre>
   *
   * <code>.google.storage.v1.CommonEnums.Projection projection = 6;</code>
   *
   * @return The projection.
   */
  com.google.storage.v1.CommonEnums.Projection getProjection();

  /**
   *
   *
   * <pre>
   * The Bucket metadata for updating.
   * </pre>
   *
   * <code>.google.storage.v1.Bucket metadata = 8;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * The Bucket metadata for updating.
   * </pre>
   *
   * <code>.google.storage.v1.Bucket metadata = 8;</code>
   *
   * @return The metadata.
   */
  com.google.storage.v1.Bucket getMetadata();
  /**
   *
   *
   * <pre>
   * The Bucket metadata for updating.
   * </pre>
   *
   * <code>.google.storage.v1.Bucket metadata = 8;</code>
   */
  com.google.storage.v1.BucketOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * List of fields to be updated.
   * To specify ALL fields, equivalent to the JSON API's "update" function,
   * specify a single field with the value `*`. Note: not recommended. If a new
   * field is introduced at a later time, an older client updating with the `*`
   * may accidentally reset the new field's value.
   * Not specifying any fields is an error.
   * Not specifying a field while setting that field to a non-default value is
   * an error.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 9;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * List of fields to be updated.
   * To specify ALL fields, equivalent to the JSON API's "update" function,
   * specify a single field with the value `*`. Note: not recommended. If a new
   * field is introduced at a later time, an older client updating with the `*`
   * may accidentally reset the new field's value.
   * Not specifying any fields is an error.
   * Not specifying a field while setting that field to a non-default value is
   * an error.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 9;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * List of fields to be updated.
   * To specify ALL fields, equivalent to the JSON API's "update" function,
   * specify a single field with the value `*`. Note: not recommended. If a new
   * field is introduced at a later time, an older client updating with the `*`
   * may accidentally reset the new field's value.
   * Not specifying any fields is an error.
   * Not specifying a field while setting that field to a non-default value is
   * an error.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 9;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * A set of parameters common to all Storage API requests.
   * </pre>
   *
   * <code>.google.storage.v1.CommonRequestParams common_request_params = 10;</code>
   *
   * @return Whether the commonRequestParams field is set.
   */
  boolean hasCommonRequestParams();
  /**
   *
   *
   * <pre>
   * A set of parameters common to all Storage API requests.
   * </pre>
   *
   * <code>.google.storage.v1.CommonRequestParams common_request_params = 10;</code>
   *
   * @return The commonRequestParams.
   */
  com.google.storage.v1.CommonRequestParams getCommonRequestParams();
  /**
   *
   *
   * <pre>
   * A set of parameters common to all Storage API requests.
   * </pre>
   *
   * <code>.google.storage.v1.CommonRequestParams common_request_params = 10;</code>
   */
  com.google.storage.v1.CommonRequestParamsOrBuilder getCommonRequestParamsOrBuilder();
}