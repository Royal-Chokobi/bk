// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KCPGrpcService.proto

package kr.kcp.aio.grpc;

public interface GrpcRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kcpgrpc.GrpcRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, string&gt; inputParams = 1;</code>
   */
  int getInputParamsCount();
  /**
   * <code>map&lt;string, string&gt; inputParams = 1;</code>
   */
  boolean containsInputParams(
      java.lang.String key);
  /**
   * Use {@link #getInputParamsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getInputParams();
  /**
   * <code>map&lt;string, string&gt; inputParams = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getInputParamsMap();
  /**
   * <code>map&lt;string, string&gt; inputParams = 1;</code>
   */

  java.lang.String getInputParamsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; inputParams = 1;</code>
   */

  java.lang.String getInputParamsOrThrow(
      java.lang.String key);

  /**
   * <code>string inMessage = 2;</code>
   */
  java.lang.String getInMessage();
  /**
   * <code>string inMessage = 2;</code>
   */
  com.google.protobuf.ByteString
      getInMessageBytes();
}
