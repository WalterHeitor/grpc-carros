// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpcCarros.proto

package br.com.soft.walter;

public final class GrpcCarros {
  private GrpcCarros() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_soft_walter_GrpcCarrosRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_soft_walter_GrpcCarrosRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_soft_walter_GrpcCarrosResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_soft_walter_GrpcCarrosResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020grpcCarros.proto\022\022br.com.soft.walter\"2" +
      "\n\021GrpcCarrosRequest\022\016\n\006modelo\030\001 \001(\t\022\r\n\005p" +
      "laca\030\002 \001(\t\"?\n\022GrpcCarrosResponse\022\016\n\006mode" +
      "lo\030\001 \001(\t\022\r\n\005placa\030\002 \001(\t\022\n\n\002id\030\003 \001(\0032q\n\021G" +
      "rpcCarrosService\022\\\n\tadicionar\022%.br.com.s" +
      "oft.walter.GrpcCarrosRequest\032&.br.com.so" +
      "ft.walter.GrpcCarrosResponse\"\000B(\n\022br.com" +
      ".soft.walterB\nGrpcCarrosP\001\242\002\003HLWb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_br_com_soft_walter_GrpcCarrosRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_br_com_soft_walter_GrpcCarrosRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_soft_walter_GrpcCarrosRequest_descriptor,
        new java.lang.String[] { "Modelo", "Placa", });
    internal_static_br_com_soft_walter_GrpcCarrosResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_br_com_soft_walter_GrpcCarrosResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_soft_walter_GrpcCarrosResponse_descriptor,
        new java.lang.String[] { "Modelo", "Placa", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}