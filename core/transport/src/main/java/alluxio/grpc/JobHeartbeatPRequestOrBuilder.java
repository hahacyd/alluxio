// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: job_master.proto

package alluxio.grpc;

public interface JobHeartbeatPRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.JobHeartbeatPRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 workerId = 1;</code>
   */
  boolean hasWorkerId();
  /**
   * <code>optional int64 workerId = 1;</code>
   */
  long getWorkerId();

  /**
   * <code>repeated .alluxio.grpc.TaskInfo taskInfos = 2;</code>
   */
  java.util.List<alluxio.grpc.TaskInfo> 
      getTaskInfosList();
  /**
   * <code>repeated .alluxio.grpc.TaskInfo taskInfos = 2;</code>
   */
  alluxio.grpc.TaskInfo getTaskInfos(int index);
  /**
   * <code>repeated .alluxio.grpc.TaskInfo taskInfos = 2;</code>
   */
  int getTaskInfosCount();
  /**
   * <code>repeated .alluxio.grpc.TaskInfo taskInfos = 2;</code>
   */
  java.util.List<? extends alluxio.grpc.TaskInfoOrBuilder> 
      getTaskInfosOrBuilderList();
  /**
   * <code>repeated .alluxio.grpc.TaskInfo taskInfos = 2;</code>
   */
  alluxio.grpc.TaskInfoOrBuilder getTaskInfosOrBuilder(
      int index);

  /**
   * <code>optional .alluxio.grpc.JobHeartbeatPOptions options = 3;</code>
   */
  boolean hasOptions();
  /**
   * <code>optional .alluxio.grpc.JobHeartbeatPOptions options = 3;</code>
   */
  alluxio.grpc.JobHeartbeatPOptions getOptions();
  /**
   * <code>optional .alluxio.grpc.JobHeartbeatPOptions options = 3;</code>
   */
  alluxio.grpc.JobHeartbeatPOptionsOrBuilder getOptionsOrBuilder();
}
