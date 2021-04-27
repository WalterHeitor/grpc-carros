// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpcCarros.proto

package br.com.soft.walter;

/**
 * Protobuf type {@code br.com.soft.walter.GrpcCarrosRequest}
 */
public final class GrpcCarrosRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:br.com.soft.walter.GrpcCarrosRequest)
    GrpcCarrosRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrpcCarrosRequest.newBuilder() to construct.
  private GrpcCarrosRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrpcCarrosRequest() {
    modelo_ = "";
    placa_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GrpcCarrosRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GrpcCarrosRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            modelo_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            placa_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.soft.walter.GrpcCarros.internal_static_br_com_soft_walter_GrpcCarrosRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.soft.walter.GrpcCarros.internal_static_br_com_soft_walter_GrpcCarrosRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.soft.walter.GrpcCarrosRequest.class, br.com.soft.walter.GrpcCarrosRequest.Builder.class);
  }

  public static final int MODELO_FIELD_NUMBER = 1;
  private volatile java.lang.Object modelo_;
  /**
   * <code>string modelo = 1;</code>
   * @return The modelo.
   */
  @java.lang.Override
  public java.lang.String getModelo() {
    java.lang.Object ref = modelo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      modelo_ = s;
      return s;
    }
  }
  /**
   * <code>string modelo = 1;</code>
   * @return The bytes for modelo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModeloBytes() {
    java.lang.Object ref = modelo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      modelo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLACA_FIELD_NUMBER = 2;
  private volatile java.lang.Object placa_;
  /**
   * <code>string placa = 2;</code>
   * @return The placa.
   */
  @java.lang.Override
  public java.lang.String getPlaca() {
    java.lang.Object ref = placa_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      placa_ = s;
      return s;
    }
  }
  /**
   * <code>string placa = 2;</code>
   * @return The bytes for placa.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlacaBytes() {
    java.lang.Object ref = placa_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      placa_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getModeloBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, modelo_);
    }
    if (!getPlacaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, placa_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getModeloBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, modelo_);
    }
    if (!getPlacaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, placa_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof br.com.soft.walter.GrpcCarrosRequest)) {
      return super.equals(obj);
    }
    br.com.soft.walter.GrpcCarrosRequest other = (br.com.soft.walter.GrpcCarrosRequest) obj;

    if (!getModelo()
        .equals(other.getModelo())) return false;
    if (!getPlaca()
        .equals(other.getPlaca())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MODELO_FIELD_NUMBER;
    hash = (53 * hash) + getModelo().hashCode();
    hash = (37 * hash) + PLACA_FIELD_NUMBER;
    hash = (53 * hash) + getPlaca().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.soft.walter.GrpcCarrosRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.soft.walter.GrpcCarrosRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.soft.walter.GrpcCarrosRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.soft.walter.GrpcCarrosRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.soft.walter.GrpcCarrosRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.soft.walter.GrpcCarrosRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.soft.walter.GrpcCarrosRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.soft.walter.GrpcCarrosRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.soft.walter.GrpcCarrosRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.soft.walter.GrpcCarrosRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.soft.walter.GrpcCarrosRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.soft.walter.GrpcCarrosRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(br.com.soft.walter.GrpcCarrosRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code br.com.soft.walter.GrpcCarrosRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:br.com.soft.walter.GrpcCarrosRequest)
      br.com.soft.walter.GrpcCarrosRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.soft.walter.GrpcCarros.internal_static_br_com_soft_walter_GrpcCarrosRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.soft.walter.GrpcCarros.internal_static_br_com_soft_walter_GrpcCarrosRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.soft.walter.GrpcCarrosRequest.class, br.com.soft.walter.GrpcCarrosRequest.Builder.class);
    }

    // Construct using br.com.soft.walter.GrpcCarrosRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      modelo_ = "";

      placa_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.soft.walter.GrpcCarros.internal_static_br_com_soft_walter_GrpcCarrosRequest_descriptor;
    }

    @java.lang.Override
    public br.com.soft.walter.GrpcCarrosRequest getDefaultInstanceForType() {
      return br.com.soft.walter.GrpcCarrosRequest.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.soft.walter.GrpcCarrosRequest build() {
      br.com.soft.walter.GrpcCarrosRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.soft.walter.GrpcCarrosRequest buildPartial() {
      br.com.soft.walter.GrpcCarrosRequest result = new br.com.soft.walter.GrpcCarrosRequest(this);
      result.modelo_ = modelo_;
      result.placa_ = placa_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof br.com.soft.walter.GrpcCarrosRequest) {
        return mergeFrom((br.com.soft.walter.GrpcCarrosRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.soft.walter.GrpcCarrosRequest other) {
      if (other == br.com.soft.walter.GrpcCarrosRequest.getDefaultInstance()) return this;
      if (!other.getModelo().isEmpty()) {
        modelo_ = other.modelo_;
        onChanged();
      }
      if (!other.getPlaca().isEmpty()) {
        placa_ = other.placa_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      br.com.soft.walter.GrpcCarrosRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.soft.walter.GrpcCarrosRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object modelo_ = "";
    /**
     * <code>string modelo = 1;</code>
     * @return The modelo.
     */
    public java.lang.String getModelo() {
      java.lang.Object ref = modelo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        modelo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string modelo = 1;</code>
     * @return The bytes for modelo.
     */
    public com.google.protobuf.ByteString
        getModeloBytes() {
      java.lang.Object ref = modelo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        modelo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string modelo = 1;</code>
     * @param value The modelo to set.
     * @return This builder for chaining.
     */
    public Builder setModelo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      modelo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string modelo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearModelo() {
      
      modelo_ = getDefaultInstance().getModelo();
      onChanged();
      return this;
    }
    /**
     * <code>string modelo = 1;</code>
     * @param value The bytes for modelo to set.
     * @return This builder for chaining.
     */
    public Builder setModeloBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      modelo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object placa_ = "";
    /**
     * <code>string placa = 2;</code>
     * @return The placa.
     */
    public java.lang.String getPlaca() {
      java.lang.Object ref = placa_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        placa_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string placa = 2;</code>
     * @return The bytes for placa.
     */
    public com.google.protobuf.ByteString
        getPlacaBytes() {
      java.lang.Object ref = placa_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        placa_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string placa = 2;</code>
     * @param value The placa to set.
     * @return This builder for chaining.
     */
    public Builder setPlaca(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      placa_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string placa = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlaca() {
      
      placa_ = getDefaultInstance().getPlaca();
      onChanged();
      return this;
    }
    /**
     * <code>string placa = 2;</code>
     * @param value The bytes for placa to set.
     * @return This builder for chaining.
     */
    public Builder setPlacaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      placa_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:br.com.soft.walter.GrpcCarrosRequest)
  }

  // @@protoc_insertion_point(class_scope:br.com.soft.walter.GrpcCarrosRequest)
  private static final br.com.soft.walter.GrpcCarrosRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.soft.walter.GrpcCarrosRequest();
  }

  public static br.com.soft.walter.GrpcCarrosRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrpcCarrosRequest>
      PARSER = new com.google.protobuf.AbstractParser<GrpcCarrosRequest>() {
    @java.lang.Override
    public GrpcCarrosRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GrpcCarrosRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrpcCarrosRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrpcCarrosRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.soft.walter.GrpcCarrosRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
