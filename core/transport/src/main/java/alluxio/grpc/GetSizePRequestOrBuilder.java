// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: key_value_worker.proto

package alluxio.grpc;

public interface GetSizePRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.GetSizePRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 blockId = 1;</code>
   */
  boolean hasBlockId();
  /**
   * <code>optional int64 blockId = 1;</code>
   */
  long getBlockId();

  /**
   * <code>optional .alluxio.grpc.GetSizePOptions options = 2;</code>
   */
  boolean hasOptions();
  /**
   * <code>optional .alluxio.grpc.GetSizePOptions options = 2;</code>
   */
  alluxio.grpc.GetSizePOptions getOptions();
  /**
   * <code>optional .alluxio.grpc.GetSizePOptions options = 2;</code>
   */
  alluxio.grpc.GetSizePOptionsOrBuilder getOptionsOrBuilder();
}
