// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KCPGrpcService.proto

package kr.kcp.aio.grpc;

/**
 * <pre>
 * The response message containing the greetings
 * </pre>
 *
 * Protobuf type {@code kcpgrpc.GrpcReply}
 */
public  final class GrpcReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kcpgrpc.GrpcReply)
    GrpcReplyOrBuilder {
  // Use GrpcReply.newBuilder() to construct.
  private GrpcReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrpcReply() {
    outMessage_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GrpcReply(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            outMessage_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return kr.kcp.aio.grpc.KCPProto.internal_static_kcpgrpc_GrpcReply_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return kr.kcp.aio.grpc.KCPProto.internal_static_kcpgrpc_GrpcReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            kr.kcp.aio.grpc.GrpcReply.class, kr.kcp.aio.grpc.GrpcReply.Builder.class);
  }

  public static final int OUTMESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object outMessage_;
  /**
   * <code>string outMessage = 1;</code>
   */
  public java.lang.String getOutMessage() {
    java.lang.Object ref = outMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      outMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string outMessage = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOutMessageBytes() {
    java.lang.Object ref = outMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      outMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getOutMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, outMessage_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOutMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, outMessage_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof kr.kcp.aio.grpc.GrpcReply)) {
      return super.equals(obj);
    }
    kr.kcp.aio.grpc.GrpcReply other = (kr.kcp.aio.grpc.GrpcReply) obj;

    boolean result = true;
    result = result && getOutMessage()
        .equals(other.getOutMessage());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OUTMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getOutMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static kr.kcp.aio.grpc.GrpcReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kr.kcp.aio.grpc.GrpcReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kr.kcp.aio.grpc.GrpcReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kr.kcp.aio.grpc.GrpcReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kr.kcp.aio.grpc.GrpcReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kr.kcp.aio.grpc.GrpcReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kr.kcp.aio.grpc.GrpcReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kr.kcp.aio.grpc.GrpcReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static kr.kcp.aio.grpc.GrpcReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static kr.kcp.aio.grpc.GrpcReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static kr.kcp.aio.grpc.GrpcReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kr.kcp.aio.grpc.GrpcReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(kr.kcp.aio.grpc.GrpcReply prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * The response message containing the greetings
   * </pre>
   *
   * Protobuf type {@code kcpgrpc.GrpcReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kcpgrpc.GrpcReply)
      kr.kcp.aio.grpc.GrpcReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return kr.kcp.aio.grpc.KCPProto.internal_static_kcpgrpc_GrpcReply_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return kr.kcp.aio.grpc.KCPProto.internal_static_kcpgrpc_GrpcReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              kr.kcp.aio.grpc.GrpcReply.class, kr.kcp.aio.grpc.GrpcReply.Builder.class);
    }

    // Construct using kr.kcp.aio.grpc.GrpcReply.newBuilder()
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
    public Builder clear() {
      super.clear();
      outMessage_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return kr.kcp.aio.grpc.KCPProto.internal_static_kcpgrpc_GrpcReply_descriptor;
    }

    public kr.kcp.aio.grpc.GrpcReply getDefaultInstanceForType() {
      return kr.kcp.aio.grpc.GrpcReply.getDefaultInstance();
    }

    public kr.kcp.aio.grpc.GrpcReply build() {
      kr.kcp.aio.grpc.GrpcReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public kr.kcp.aio.grpc.GrpcReply buildPartial() {
      kr.kcp.aio.grpc.GrpcReply result = new kr.kcp.aio.grpc.GrpcReply(this);
      result.outMessage_ = outMessage_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof kr.kcp.aio.grpc.GrpcReply) {
        return mergeFrom((kr.kcp.aio.grpc.GrpcReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(kr.kcp.aio.grpc.GrpcReply other) {
      if (other == kr.kcp.aio.grpc.GrpcReply.getDefaultInstance()) return this;
      if (!other.getOutMessage().isEmpty()) {
        outMessage_ = other.outMessage_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      kr.kcp.aio.grpc.GrpcReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (kr.kcp.aio.grpc.GrpcReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object outMessage_ = "";
    /**
     * <code>string outMessage = 1;</code>
     */
    public java.lang.String getOutMessage() {
      java.lang.Object ref = outMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string outMessage = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOutMessageBytes() {
      java.lang.Object ref = outMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        outMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string outMessage = 1;</code>
     */
    public Builder setOutMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      outMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string outMessage = 1;</code>
     */
    public Builder clearOutMessage() {
      
      outMessage_ = getDefaultInstance().getOutMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string outMessage = 1;</code>
     */
    public Builder setOutMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      outMessage_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:kcpgrpc.GrpcReply)
  }

  // @@protoc_insertion_point(class_scope:kcpgrpc.GrpcReply)
  private static final kr.kcp.aio.grpc.GrpcReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new kr.kcp.aio.grpc.GrpcReply();
  }

  public static kr.kcp.aio.grpc.GrpcReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrpcReply>
      PARSER = new com.google.protobuf.AbstractParser<GrpcReply>() {
    public GrpcReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GrpcReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrpcReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrpcReply> getParserForType() {
    return PARSER;
  }

  public kr.kcp.aio.grpc.GrpcReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

