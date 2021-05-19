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
public final class CarrosServiceGrpc {

  private CarrosServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.soft.walter.CarrosService";

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
    if ((getAdicionarMethod = CarrosServiceGrpc.getAdicionarMethod) == null) {
      synchronized (CarrosServiceGrpc.class) {
        if ((getAdicionarMethod = CarrosServiceGrpc.getAdicionarMethod) == null) {
          CarrosServiceGrpc.getAdicionarMethod = getAdicionarMethod =
              io.grpc.MethodDescriptor.<br.com.soft.walter.GrpcCarrosRequest, br.com.soft.walter.GrpcCarrosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "adicionar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.soft.walter.GrpcCarrosRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.soft.walter.GrpcCarrosResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CarrosServiceMethodDescriptorSupplier("adicionar"))
              .build();
        }
      }
    }
    return getAdicionarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarrosServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarrosServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarrosServiceStub>() {
        @java.lang.Override
        public CarrosServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarrosServiceStub(channel, callOptions);
        }
      };
    return CarrosServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarrosServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarrosServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarrosServiceBlockingStub>() {
        @java.lang.Override
        public CarrosServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarrosServiceBlockingStub(channel, callOptions);
        }
      };
    return CarrosServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarrosServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarrosServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarrosServiceFutureStub>() {
        @java.lang.Override
        public CarrosServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarrosServiceFutureStub(channel, callOptions);
        }
      };
    return CarrosServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CarrosServiceImplBase implements io.grpc.BindableService {

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
  public static final class CarrosServiceStub extends io.grpc.stub.AbstractAsyncStub<CarrosServiceStub> {
    private CarrosServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarrosServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarrosServiceStub(channel, callOptions);
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
  public static final class CarrosServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CarrosServiceBlockingStub> {
    private CarrosServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarrosServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarrosServiceBlockingStub(channel, callOptions);
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
  public static final class CarrosServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CarrosServiceFutureStub> {
    private CarrosServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarrosServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarrosServiceFutureStub(channel, callOptions);
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
    private final CarrosServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CarrosServiceImplBase serviceImpl, int methodId) {
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

  private static abstract class CarrosServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarrosServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.soft.walter.GrpcCarros.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarrosService");
    }
  }

  private static final class CarrosServiceFileDescriptorSupplier
      extends CarrosServiceBaseDescriptorSupplier {
    CarrosServiceFileDescriptorSupplier() {}
  }

  private static final class CarrosServiceMethodDescriptorSupplier
      extends CarrosServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarrosServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CarrosServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarrosServiceFileDescriptorSupplier())
              .addMethod(getAdicionarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
