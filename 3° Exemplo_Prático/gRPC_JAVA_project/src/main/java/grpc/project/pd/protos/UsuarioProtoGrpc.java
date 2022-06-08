package grpc.project.pd.protos;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: usuario.proto")
public final class UsuarioProtoGrpc {

  private UsuarioProtoGrpc() {}

  public static final String SERVICE_NAME = "usuarioProto.UsuarioProto";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.project.pd.protos.UserIdRequest,
      grpc.project.pd.protos.UserResponse> getUsuarioPorIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "usuarioPorId",
      requestType = grpc.project.pd.protos.UserIdRequest.class,
      responseType = grpc.project.pd.protos.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.pd.protos.UserIdRequest,
      grpc.project.pd.protos.UserResponse> getUsuarioPorIdMethod() {
    io.grpc.MethodDescriptor<grpc.project.pd.protos.UserIdRequest, grpc.project.pd.protos.UserResponse> getUsuarioPorIdMethod;
    if ((getUsuarioPorIdMethod = UsuarioProtoGrpc.getUsuarioPorIdMethod) == null) {
      synchronized (UsuarioProtoGrpc.class) {
        if ((getUsuarioPorIdMethod = UsuarioProtoGrpc.getUsuarioPorIdMethod) == null) {
          UsuarioProtoGrpc.getUsuarioPorIdMethod = getUsuarioPorIdMethod = 
              io.grpc.MethodDescriptor.<grpc.project.pd.protos.UserIdRequest, grpc.project.pd.protos.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "usuarioProto.UsuarioProto", "usuarioPorId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.pd.protos.UserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.pd.protos.UserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UsuarioProtoMethodDescriptorSupplier("usuarioPorId"))
                  .build();
          }
        }
     }
     return getUsuarioPorIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsuarioProtoStub newStub(io.grpc.Channel channel) {
    return new UsuarioProtoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsuarioProtoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UsuarioProtoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsuarioProtoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UsuarioProtoFutureStub(channel);
  }

  /**
   */
  public static abstract class UsuarioProtoImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *rpc listarUsuarios(Void) returns (UserListResponse) {}
     * </pre>
     */
    public void usuarioPorId(grpc.project.pd.protos.UserIdRequest request,
        io.grpc.stub.StreamObserver<grpc.project.pd.protos.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUsuarioPorIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUsuarioPorIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.pd.protos.UserIdRequest,
                grpc.project.pd.protos.UserResponse>(
                  this, METHODID_USUARIO_POR_ID)))
          .build();
    }
  }

  /**
   */
  public static final class UsuarioProtoStub extends io.grpc.stub.AbstractStub<UsuarioProtoStub> {
    private UsuarioProtoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsuarioProtoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsuarioProtoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsuarioProtoStub(channel, callOptions);
    }

    /**
     * <pre>
     *rpc listarUsuarios(Void) returns (UserListResponse) {}
     * </pre>
     */
    public void usuarioPorId(grpc.project.pd.protos.UserIdRequest request,
        io.grpc.stub.StreamObserver<grpc.project.pd.protos.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUsuarioPorIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UsuarioProtoBlockingStub extends io.grpc.stub.AbstractStub<UsuarioProtoBlockingStub> {
    private UsuarioProtoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsuarioProtoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsuarioProtoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsuarioProtoBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *rpc listarUsuarios(Void) returns (UserListResponse) {}
     * </pre>
     */
    public grpc.project.pd.protos.UserResponse usuarioPorId(grpc.project.pd.protos.UserIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getUsuarioPorIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UsuarioProtoFutureStub extends io.grpc.stub.AbstractStub<UsuarioProtoFutureStub> {
    private UsuarioProtoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsuarioProtoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsuarioProtoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsuarioProtoFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *rpc listarUsuarios(Void) returns (UserListResponse) {}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.pd.protos.UserResponse> usuarioPorId(
        grpc.project.pd.protos.UserIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUsuarioPorIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_USUARIO_POR_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UsuarioProtoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UsuarioProtoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_USUARIO_POR_ID:
          serviceImpl.usuarioPorId((grpc.project.pd.protos.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<grpc.project.pd.protos.UserResponse>) responseObserver);
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

  private static abstract class UsuarioProtoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsuarioProtoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.project.pd.protos.usuarioProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UsuarioProto");
    }
  }

  private static final class UsuarioProtoFileDescriptorSupplier
      extends UsuarioProtoBaseDescriptorSupplier {
    UsuarioProtoFileDescriptorSupplier() {}
  }

  private static final class UsuarioProtoMethodDescriptorSupplier
      extends UsuarioProtoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UsuarioProtoMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UsuarioProtoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsuarioProtoFileDescriptorSupplier())
              .addMethod(getUsuarioPorIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
