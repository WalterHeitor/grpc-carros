package br.com.soft.walter;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.ServerServiceDefinition;
import io.grpc.ServiceDescriptor;
import io.grpc.StatusException;
import io.grpc.kotlin.AbstractCoroutineServerImpl;
import io.grpc.kotlin.AbstractCoroutineStub;
import io.grpc.kotlin.StubFor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;

/**
 * Holder for Kotlin coroutine-based client and server APIs for br.com.soft.walter.CarrosService.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048G\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\n8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lbr/com/soft/walter/CarrosServiceGrpcKt;", "", "()V", "adicionarMethod", "Lio/grpc/MethodDescriptor;", "Lbr/com/soft/walter/GrpcCarrosRequest;", "Lbr/com/soft/walter/GrpcCarrosResponse;", "getAdicionarMethod", "()Lio/grpc/MethodDescriptor;", "serviceDescriptor", "Lio/grpc/ServiceDescriptor;", "getServiceDescriptor$annotations", "getServiceDescriptor", "()Lio/grpc/ServiceDescriptor;", "CarrosServiceCoroutineImplBase", "CarrosServiceCoroutineStub", "grpc-carros"})
public final class CarrosServiceGrpcKt {
    @org.jetbrains.annotations.NotNull()
    public static final br.com.soft.walter.CarrosServiceGrpcKt INSTANCE = null;
    
    @java.lang.Deprecated()
    public static void getServiceDescriptor$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.grpc.ServiceDescriptor getServiceDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.grpc.MethodDescriptor<br.com.soft.walter.GrpcCarrosRequest, br.com.soft.walter.GrpcCarrosResponse> getAdicionarMethod() {
        return null;
    }
    
    private CarrosServiceGrpcKt() {
        super();
    }
    
    /**
     * A stub for issuing RPCs to a(n) br.com.soft.walter.CarrosService service as suspending
     * coroutines.
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lbr/com/soft/walter/CarrosServiceGrpcKt$CarrosServiceCoroutineStub;", "Lio/grpc/kotlin/AbstractCoroutineStub;", "channel", "Lio/grpc/Channel;", "callOptions", "Lio/grpc/CallOptions;", "(Lio/grpc/Channel;Lio/grpc/CallOptions;)V", "adicionar", "Lbr/com/soft/walter/GrpcCarrosResponse;", "request", "Lbr/com/soft/walter/GrpcCarrosRequest;", "(Lbr/com/soft/walter/GrpcCarrosRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "build", "grpc-carros"})
    @io.grpc.kotlin.StubFor(value = br.com.soft.walter.CarrosServiceGrpc.class)
    public static final class CarrosServiceCoroutineStub extends io.grpc.kotlin.AbstractCoroutineStub<br.com.soft.walter.CarrosServiceGrpcKt.CarrosServiceCoroutineStub> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected br.com.soft.walter.CarrosServiceGrpcKt.CarrosServiceCoroutineStub build(@org.jetbrains.annotations.NotNull()
        io.grpc.Channel channel, @org.jetbrains.annotations.NotNull()
        io.grpc.CallOptions callOptions) {
            return null;
        }
        
        /**
         * Executes this RPC and returns the response message, suspending until the RPC completes
         * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
         * corresponding
         * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
         * with the corresponding exception as a cause.
         *
         * @param request The request message to send to the server.
         *
         * @return The single response from the server.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object adicionar(@org.jetbrains.annotations.NotNull()
        br.com.soft.walter.GrpcCarrosRequest request, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super br.com.soft.walter.GrpcCarrosResponse> p1) {
            return null;
        }
        
        public CarrosServiceCoroutineStub(@org.jetbrains.annotations.NotNull()
        io.grpc.Channel channel, @org.jetbrains.annotations.NotNull()
        io.grpc.CallOptions callOptions) {
            super(null, null);
        }
        
        public CarrosServiceCoroutineStub(@org.jetbrains.annotations.NotNull()
        io.grpc.Channel channel) {
            super(null, null);
        }
    }
    
    /**
     * Skeletal implementation of the br.com.soft.walter.CarrosService service based on Kotlin
     * coroutines.
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lbr/com/soft/walter/CarrosServiceGrpcKt$CarrosServiceCoroutineImplBase;", "Lio/grpc/kotlin/AbstractCoroutineServerImpl;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "adicionar", "Lbr/com/soft/walter/GrpcCarrosResponse;", "request", "Lbr/com/soft/walter/GrpcCarrosRequest;", "(Lbr/com/soft/walter/GrpcCarrosRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bindService", "Lio/grpc/ServerServiceDefinition;", "grpc-carros"})
    public static abstract class CarrosServiceCoroutineImplBase extends io.grpc.kotlin.AbstractCoroutineServerImpl {
        
        /**
         * Returns the response to an RPC for br.com.soft.walter.CarrosService.adicionar.
         *
         * If this method fails with a [StatusException], the RPC will fail with the corresponding
         * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
         * the RPC will fail
         * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
         * fail with `Status.UNKNOWN` with the exception as a cause.
         *
         * @param request The request from the client.
         */
        @org.jetbrains.annotations.Nullable()
        public java.lang.Object adicionar(@org.jetbrains.annotations.NotNull()
        br.com.soft.walter.GrpcCarrosRequest p0, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super br.com.soft.walter.GrpcCarrosResponse> p1) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final io.grpc.ServerServiceDefinition bindService() {
            return null;
        }
        
        public CarrosServiceCoroutineImplBase(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.CoroutineContext coroutineContext) {
            super(null);
        }
        
        public CarrosServiceCoroutineImplBase() {
            super(null);
        }
    }
}