// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: key_value_worker.proto

package alluxio.grpc;

public interface GetPRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.GetPRequest)
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
   * <code>optional bytes key = 2;</code>
   */
  boolean hasKey();
  /**
   * <code>optional bytes key = 2;</code>
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <code>optional .alluxio.grpc.GetPOptions options = 3;</code>
   */
  boolean hasOptions();
  /**
   * <code>optional .alluxio.grpc.GetPOptions options = 3;</code>
   */
  alluxio.grpc.GetPOptions getOptions();
  /**
   * <code>optional .alluxio.grpc.GetPOptions options = 3;</code>
   */
  alluxio.grpc.GetPOptionsOrBuilder getOptionsOrBuilder();
}
