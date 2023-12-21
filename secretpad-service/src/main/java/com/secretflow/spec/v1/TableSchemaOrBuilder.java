// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secretflow/spec/v1/data.proto

package com.secretflow.spec.v1;

public interface TableSchemaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:secretflow.spec.v1.TableSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id column name(s).
   * Optional, can be empty.
   * </pre>
   *
   * <code>repeated string ids = 1;</code>
   * @return A list containing the ids.
   */
  java.util.List<java.lang.String>
      getIdsList();
  /**
   * <pre>
   * Id column name(s).
   * Optional, can be empty.
   * </pre>
   *
   * <code>repeated string ids = 1;</code>
   * @return The count of ids.
   */
  int getIdsCount();
  /**
   * <pre>
   * Id column name(s).
   * Optional, can be empty.
   * </pre>
   *
   * <code>repeated string ids = 1;</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  java.lang.String getIds(int index);
  /**
   * <pre>
   * Id column name(s).
   * Optional, can be empty.
   * </pre>
   *
   * <code>repeated string ids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the ids at the given index.
   */
  com.google.protobuf.ByteString
      getIdsBytes(int index);

  /**
   * <pre>
   * Feature column name(s).
   * </pre>
   *
   * <code>repeated string features = 2;</code>
   * @return A list containing the features.
   */
  java.util.List<java.lang.String>
      getFeaturesList();
  /**
   * <pre>
   * Feature column name(s).
   * </pre>
   *
   * <code>repeated string features = 2;</code>
   * @return The count of features.
   */
  int getFeaturesCount();
  /**
   * <pre>
   * Feature column name(s).
   * </pre>
   *
   * <code>repeated string features = 2;</code>
   * @param index The index of the element to return.
   * @return The features at the given index.
   */
  java.lang.String getFeatures(int index);
  /**
   * <pre>
   * Feature column name(s).
   * </pre>
   *
   * <code>repeated string features = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the features at the given index.
   */
  com.google.protobuf.ByteString
      getFeaturesBytes(int index);

  /**
   * <pre>
   * Label column name(s).
   * Optional, can be empty.
   * </pre>
   *
   * <code>repeated string labels = 3;</code>
   * @return A list containing the labels.
   */
  java.util.List<java.lang.String>
      getLabelsList();
  /**
   * <pre>
   * Label column name(s).
   * Optional, can be empty.
   * </pre>
   *
   * <code>repeated string labels = 3;</code>
   * @return The count of labels.
   */
  int getLabelsCount();
  /**
   * <pre>
   * Label column name(s).
   * Optional, can be empty.
   * </pre>
   *
   * <code>repeated string labels = 3;</code>
   * @param index The index of the element to return.
   * @return The labels at the given index.
   */
  java.lang.String getLabels(int index);
  /**
   * <pre>
   * Label column name(s).
   * Optional, can be empty.
   * </pre>
   *
   * <code>repeated string labels = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the labels at the given index.
   */
  com.google.protobuf.ByteString
      getLabelsBytes(int index);

  /**
   * <pre>
   * Id column data type(s).
   * Len(id) should match len(id_types).
   * </pre>
   *
   * <code>repeated string id_types = 4;</code>
   * @return A list containing the idTypes.
   */
  java.util.List<java.lang.String>
      getIdTypesList();
  /**
   * <pre>
   * Id column data type(s).
   * Len(id) should match len(id_types).
   * </pre>
   *
   * <code>repeated string id_types = 4;</code>
   * @return The count of idTypes.
   */
  int getIdTypesCount();
  /**
   * <pre>
   * Id column data type(s).
   * Len(id) should match len(id_types).
   * </pre>
   *
   * <code>repeated string id_types = 4;</code>
   * @param index The index of the element to return.
   * @return The idTypes at the given index.
   */
  java.lang.String getIdTypes(int index);
  /**
   * <pre>
   * Id column data type(s).
   * Len(id) should match len(id_types).
   * </pre>
   *
   * <code>repeated string id_types = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the idTypes at the given index.
   */
  com.google.protobuf.ByteString
      getIdTypesBytes(int index);

  /**
   * <pre>
   * Feature column data type(s).
   * Len(features) should match len(feature_types).
   * </pre>
   *
   * <code>repeated string feature_types = 5;</code>
   * @return A list containing the featureTypes.
   */
  java.util.List<java.lang.String>
      getFeatureTypesList();
  /**
   * <pre>
   * Feature column data type(s).
   * Len(features) should match len(feature_types).
   * </pre>
   *
   * <code>repeated string feature_types = 5;</code>
   * @return The count of featureTypes.
   */
  int getFeatureTypesCount();
  /**
   * <pre>
   * Feature column data type(s).
   * Len(features) should match len(feature_types).
   * </pre>
   *
   * <code>repeated string feature_types = 5;</code>
   * @param index The index of the element to return.
   * @return The featureTypes at the given index.
   */
  java.lang.String getFeatureTypes(int index);
  /**
   * <pre>
   * Feature column data type(s).
   * Len(features) should match len(feature_types).
   * </pre>
   *
   * <code>repeated string feature_types = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the featureTypes at the given index.
   */
  com.google.protobuf.ByteString
      getFeatureTypesBytes(int index);

  /**
   * <pre>
   * Label column data type(s).
   * Len(labels) should match len(label_types).
   * </pre>
   *
   * <code>repeated string label_types = 6;</code>
   * @return A list containing the labelTypes.
   */
  java.util.List<java.lang.String>
      getLabelTypesList();
  /**
   * <pre>
   * Label column data type(s).
   * Len(labels) should match len(label_types).
   * </pre>
   *
   * <code>repeated string label_types = 6;</code>
   * @return The count of labelTypes.
   */
  int getLabelTypesCount();
  /**
   * <pre>
   * Label column data type(s).
   * Len(labels) should match len(label_types).
   * </pre>
   *
   * <code>repeated string label_types = 6;</code>
   * @param index The index of the element to return.
   * @return The labelTypes at the given index.
   */
  java.lang.String getLabelTypes(int index);
  /**
   * <pre>
   * Label column data type(s).
   * Len(labels) should match len(label_types).
   * </pre>
   *
   * <code>repeated string label_types = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the labelTypes at the given index.
   */
  com.google.protobuf.ByteString
      getLabelTypesBytes(int index);
}