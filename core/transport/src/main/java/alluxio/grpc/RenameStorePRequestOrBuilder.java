// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: key_value_master.proto

package alluxio.grpc;

public interface RenameStorePRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.RenameStorePRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string oldPath = 1;</code>
   */
  boolean hasOldPath();
  /**
   * <code>optional string oldPath = 1;</code>
   */
  java.lang.String getOldPath();
  /**
   * <code>optional string oldPath = 1;</code>
   */
  com.google.protobuf.ByteString
      getOldPathBytes();

  /**
   * <code>optional string newPath = 2;</code>
   */
  boolean hasNewPath();
  /**
   * <code>optional string newPath = 2;</code>
   */
  java.lang.String getNewPath();
  /**
   * <code>optional string newPath = 2;</code>
   */
  com.google.protobuf.ByteString
      getNewPathBytes();

  /**
   * <code>optional .alluxio.grpc.RenameStorePOptions options = 3;</code>
   */
  boolean hasOptions();
  /**
   * <code>optional .alluxio.grpc.RenameStorePOptions options = 3;</code>
   */
  alluxio.grpc.RenameStorePOptions getOptions();
  /**
   * <code>optional .alluxio.grpc.RenameStorePOptions options = 3;</code>
   */
  alluxio.grpc.RenameStorePOptionsOrBuilder getOptionsOrBuilder();
}
