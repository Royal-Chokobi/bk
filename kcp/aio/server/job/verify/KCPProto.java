// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KCPGrpcService.proto

package kcp.aio.server.job.verify;

public final class KCPProto {
  private KCPProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kcp_aio_server_job_verify_GrpcRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kcp_aio_server_job_verify_GrpcRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kcp_aio_server_job_verify_GrpcReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kcp_aio_server_job_verify_GrpcReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024KCPGrpcService.proto\022\031kcp.aio.server.j" +
      "ob.verify\"\221\001\n\013GrpcRequest\022\n\n\002t0\030\001 \001(\002\022\n\n" +
      "\002t1\030\002 \001(\002\022\n\n\002t2\030\003 \001(\002\022\n\n\002t3\030\004 \001(\002\022\n\n\002t4\030" +
      "\005 \001(\002\022\n\n\002t5\030\006 \001(\002\022\n\n\002t6\030\007 \001(\002\022\n\n\002t7\030\010 \001(" +
      "\002\022\n\n\002t8\030\t \001(\002\022\n\n\002t9\030\n \001(\002\022\n\n\002re\030\013 \001(\t\"\034\n" +
      "\tGrpcReply\022\017\n\007message\030\001 \001(\t2e\n\007Greeter\022Z" +
      "\n\010callGrpc\022&.kcp.aio.server.job.verify.G" +
      "rpcRequest\032$.kcp.aio.server.job.verify.G" +
      "rpcReply\"\000B-\n\031kcp.aio.server.job.verifyB" +
      "\010KCPProtoP\001\242\002\003HLWb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_kcp_aio_server_job_verify_GrpcRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kcp_aio_server_job_verify_GrpcRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kcp_aio_server_job_verify_GrpcRequest_descriptor,
        new java.lang.String[] { "T0", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "Re", });
    internal_static_kcp_aio_server_job_verify_GrpcReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_kcp_aio_server_job_verify_GrpcReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kcp_aio_server_job_verify_GrpcReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
