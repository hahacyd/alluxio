// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file_system_master.proto

package alluxio.grpc;

public interface GetMountTablePResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.GetMountTablePResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .alluxio.grpc.MountPointInfo&gt; mountPoints = 1;</code>
   */
  int getMountPointsCount();
  /**
   * <code>map&lt;string, .alluxio.grpc.MountPointInfo&gt; mountPoints = 1;</code>
   */
  boolean containsMountPoints(
      java.lang.String key);
  /**
   * Use {@link #getMountPointsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, alluxio.grpc.MountPointInfo>
  getMountPoints();
  /**
   * <code>map&lt;string, .alluxio.grpc.MountPointInfo&gt; mountPoints = 1;</code>
   */
  java.util.Map<java.lang.String, alluxio.grpc.MountPointInfo>
  getMountPointsMap();
  /**
   * <code>map&lt;string, .alluxio.grpc.MountPointInfo&gt; mountPoints = 1;</code>
   */

  alluxio.grpc.MountPointInfo getMountPointsOrDefault(
      java.lang.String key,
      alluxio.grpc.MountPointInfo defaultValue);
  /**
   * <code>map&lt;string, .alluxio.grpc.MountPointInfo&gt; mountPoints = 1;</code>
   */

  alluxio.grpc.MountPointInfo getMountPointsOrThrow(
      java.lang.String key);
}
