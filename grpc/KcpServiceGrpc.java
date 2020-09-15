package kr.kcp.aio.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: KCPGrpcService.proto")
public final class KcpServiceGrpc {

  private KcpServiceGrpc() {}

  public static final String SERVICE_NAME = "kcpgrpc.KcpService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<kr.kcp.aio.grpc.GrpcRequest,
      kr.kcp.aio.grpc.GrpcReply> METHOD_CALL_GRPC =
      io.grpc.MethodDescriptor.<kr.kcp.aio.grpc.GrpcRequest, kr.kcp.aio.grpc.GrpcReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "kcpgrpc.KcpService", "CallGrpc"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kr.kcp.aio.grpc.GrpcRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              kr.kcp.aio.grpc.GrpcReply.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KcpServiceStub newStub(io.grpc.Channel channel) {
    return new KcpServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KcpServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KcpServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KcpServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KcpServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class KcpServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void callGrpc(kr.kcp.aio.grpc.GrpcRequest request,
        io.grpc.stub.StreamObserver<kr.kcp.aio.grpc.GrpcReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CALL_GRPC, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CALL_GRPC,
            asyncUnaryCall(
              new MethodHandlers<
                kr.kcp.aio.grpc.GrpcRequest,
                kr.kcp.aio.grpc.GrpcReply>(
                  this, METHODID_CALL_GRPC)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class KcpServiceStub extends io.grpc.stub.AbstractStub<KcpServiceStub> {
    private KcpServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KcpServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KcpServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KcpServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void callGrpc(kr.kcp.aio.grpc.GrpcRequest request,
        io.grpc.stub.StreamObserver<kr.kcp.aio.grpc.GrpcReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CALL_GRPC, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class KcpServiceBlockingStub extends io.grpc.stub.AbstractStub<KcpServiceBlockingStub> {
    private KcpServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KcpServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KcpServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KcpServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public kr.kcp.aio.grpc.GrpcReply callGrpc(kr.kcp.aio.grpc.GrpcRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CALL_GRPC, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class KcpServiceFutureStub extends io.grpc.stub.AbstractStub<KcpServiceFutureStub> {
    private KcpServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KcpServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KcpServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KcpServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kr.kcp.aio.grpc.GrpcReply> callGrpc(
        kr.kcp.aio.grpc.GrpcRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CALL_GRPC, getCallOptions()), request);
    }
  }

  private static final int METHODID_CALL_GRPC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KcpServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KcpServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALL_GRPC:
          serviceImpl.callGrpc((kr.kcp.aio.grpc.GrpcRequest) request,
              (io.grpc.stub.StreamObserver<kr.kcp.aio.grpc.GrpcReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class KcpServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kr.kcp.aio.grpc.KCPProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KcpServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KcpServiceDescriptorSupplier())
              .addMethod(METHOD_CALL_GRPC)
              .build();
        }
      }
    }
    return result;
  }
}
