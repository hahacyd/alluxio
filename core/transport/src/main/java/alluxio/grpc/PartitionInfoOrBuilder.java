// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: key_value_master.proto

package alluxio.grpc;

public interface PartitionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.PartitionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bytes keyStart = 1;</code>
   */
  boolean hasKeyStart();
  /**
   * <code>optional bytes keyStart = 1;</code>
   */
  com.google.protobuf.ByteString getKeyStart();

  /**
   * <code>optional bytes keyLimit = 2;</code>
   */
  boolean hasKeyLimit();
  /**
   * <code>optional bytes keyLimit = 2;</code>
   */
  com.google.protobuf.ByteString getKeyLimit();

  /**
   * <code>optional int64 blockId = 3;</code>
   */
  boolean hasBlockId();
  /**
   * <code>optional int64 blockId = 3;</code>
   */
  long getBlockId();

  /**
   * <code>optional int32 keyCount = 4;</code>
   */
  boolean hasKeyCount();
  /**
   * <code>optional int32 keyCount = 4;</code>
   */
  int getKeyCount();
}
