package br.com.soft.walter;

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
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: grpcCarros.proto")
public final class GrpcCarrosServiceGrpc {

  private GrpcCarrosServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.soft.walter.GrpcCarrosService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.soft.walter.GrpcCarrosRequest,
      br.com.soft.walter.GrpcCarrosResponse> getAdicionarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "adicionar",
      requestType = br.com.soft.walter.GrpcCarrosRequest.class,
      responseType = br.com.soft.walter.GrpcCarrosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.soft.walter.GrpcCarrosRequest,
      br.com.soft.walter.GrpcCarrosResponse> getAdicionarMethod() {
    io.grpc.MethodDescriptor<br.com.soft.walter.GrpcCarrosRequest, br.com.soft.walter.GrpcCarrosResponse> getAdicionarMethod;
    if ((getAdicionarMethod = GrpcCarrosServiceGrpc.getAdicionarMethod) == null) {
      synchronized (GrpcCarrosServiceGrpc.class) {
        if ((getAdicionarMethod = GrpcCarrosServiceGrpc.getAdicionarMethod) == null) {
          GrpcCarrosServiceGrpc.getAdicionarMethod = getAdicionarMethod =
              io.grpc.MethodDescriptor.<br.com.soft.walter.GrpcCarrosRequest, br.com.soft.walter.GrpcCarrosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "adicionar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.soft.walter.GrpcCarrosRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.soft.walter.GrpcCarrosResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcCarrosServiceMethodDescriptorSupplier("adicionar"))
              .build();
        }
      }
    }
    return getAdicionarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrpcCarrosServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcCarrosServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcCarrosServiceStub>() {
        @java.lang.Override
        public GrpcCarrosServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcCarrosServiceStub(channel, callOptions);
        }
      };
    return GrpcCarrosServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrpcCarrosServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcCarrosServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcCarrosServiceBlockingStub>() {
        @java.lang.Override
        public GrpcCarrosServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcCarrosServiceBlockingStub(channel, callOptions);
        }
      };
    return GrpcCarrosServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GrpcCarrosServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcCarrosServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcCarrosServiceFutureStub>() {
        @java.lang.Override
        public GrpcCarrosServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcCarrosServiceFutureStub(channel, callOptions);
        }
      };
    return GrpcCarrosServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GrpcCarrosServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void adicionar(br.com.soft.walter.GrpcCarrosRequest request,
        io.grpc.stub.StreamObserver<br.com.soft.walter.GrpcCarrosResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdicionarMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAdicionarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.soft.walter.GrpcCarrosRequest,
                br.com.soft.walter.GrpcCarrosResponse>(
                  this, METHODID_ADICIONAR)))
          .build();
    }
  }

  /**
   */
  public static final class GrpcCarrosServiceStub extends io.grpc.stub.AbstractAsyncStub<GrpcCarrosServiceStub> {
    private GrpcCarrosServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcCarrosServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcCarrosServiceStub(channel, callOptions);
    }

    /**
     */
    public void adicionar(br.com.soft.walter.GrpcCarrosRequest request,
        io.grpc.stub.StreamObserver<br.com.soft.walter.GrpcCarrosResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdicionarMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GrpcCarrosServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GrpcCarrosServiceBlockingStub> {
    private GrpcCarrosServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcCarrosServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcCarrosServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.soft.walter.GrpcCarrosResponse adicionar(br.com.soft.walter.GrpcCarrosRequest request) {
      return blockingUnaryCall(
          getChannel(), getAdicionarMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GrpcCarrosServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GrpcCarrosServiceFutureStub> {
    private GrpcCarrosServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcCarrosServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcCarrosServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.soft.walter.GrpcCarrosResponse> adicionar(
        br.com.soft.walter.GrpcCarrosRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAdicionarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADICIONAR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GrpcCarrosServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GrpcCarrosServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADICIONAR:
          serviceImpl.adicionar((br.com.soft.walter.GrpcCarrosRequest) request,
              (io.grpc.stub.StreamObserver<br.com.soft.walter.GrpcCarrosResponse>) responseObserver);
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

  private static abstract class GrpcCarrosServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GrpcCarrosServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.soft.walter.GrpcCarros.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GrpcCarrosService");
    }
  }

  private static final class GrpcCarrosServiceFileDescriptorSupplier
      extends GrpcCarrosServiceBaseDescriptorSupplier {
    GrpcCarrosServiceFileDescriptorSupplier() {}
  }

  private static final class GrpcCarrosServiceMethodDescriptorSupplier
      extends GrpcCarrosServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GrpcCarrosServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GrpcCarrosServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GrpcCarrosServiceFileDescriptorSupplier())
              .addMethod(getAdicionarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
