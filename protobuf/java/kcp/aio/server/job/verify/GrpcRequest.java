// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KCPGrpcService.proto

package kcp.aio.server.job.verify;

/**
 * <pre>
 * The request message containing the user's name.
 * </pre>
 *
 * Protobuf type {@code verify.GrpcRequest}
 */
public  final class GrpcRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:verify.GrpcRequest)
    GrpcRequestOrBuilder {
  // Use GrpcRequest.newBuilder() to construct.
  private GrpcRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrpcRequest() {
    t0_ = 0F;
    t1_ = 0F;
    t2_ = 0F;
    t3_ = 0F;
    t4_ = 0F;
    t5_ = 0F;
    t6_ = 0F;
    t7_ = 0F;
    t8_ = 0F;
    t9_ = 0F;
    re_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GrpcRequest(
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
          case 13: {

            t0_ = input.readFloat();
            break;
          }
          case 21: {

            t1_ = input.readFloat();
            break;
          }
          case 29: {

            t2_ = input.readFloat();
            break;
          }
          case 37: {

            t3_ = input.readFloat();
            break;
          }
          case 45: {

            t4_ = input.readFloat();
            break;
          }
          case 53: {

            t5_ = input.readFloat();
            break;
          }
          case 61: {

            t6_ = input.readFloat();
            break;
          }
          case 69: {

            t7_ = input.readFloat();
            break;
          }
          case 77: {

            t8_ = input.readFloat();
            break;
          }
          case 85: {

            t9_ = input.readFloat();
            break;
          }
          case 90: {
            java.lang.String s = input.readStringRequireUtf8();

            re_ = s;
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
    return kcp.aio.server.job.verify.KCPProto.internal_static_verify_GrpcRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return kcp.aio.server.job.verify.KCPProto.internal_static_verify_GrpcRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            kcp.aio.server.job.verify.GrpcRequest.class, kcp.aio.server.job.verify.GrpcRequest.Builder.class);
  }

  public static final int T0_FIELD_NUMBER = 1;
  private float t0_;
  /**
   * <code>float t0 = 1;</code>
   */
  public float getT0() {
    return t0_;
  }

  public static final int T1_FIELD_NUMBER = 2;
  private float t1_;
  /**
   * <code>float t1 = 2;</code>
   */
  public float getT1() {
    return t1_;
  }

  public static final int T2_FIELD_NUMBER = 3;
  private float t2_;
  /**
   * <code>float t2 = 3;</code>
   */
  public float getT2() {
    return t2_;
  }

  public static final int T3_FIELD_NUMBER = 4;
  private float t3_;
  /**
   * <code>float t3 = 4;</code>
   */
  public float getT3() {
    return t3_;
  }

  public static final int T4_FIELD_NUMBER = 5;
  private float t4_;
  /**
   * <code>float t4 = 5;</code>
   */
  public float getT4() {
    return t4_;
  }

  public static final int T5_FIELD_NUMBER = 6;
  private float t5_;
  /**
   * <code>float t5 = 6;</code>
   */
  public float getT5() {
    return t5_;
  }

  public static final int T6_FIELD_NUMBER = 7;
  private float t6_;
  /**
   * <code>float t6 = 7;</code>
   */
  public float getT6() {
    return t6_;
  }

  public static final int T7_FIELD_NUMBER = 8;
  private float t7_;
  /**
   * <code>float t7 = 8;</code>
   */
  public float getT7() {
    return t7_;
  }

  public static final int T8_FIELD_NUMBER = 9;
  private float t8_;
  /**
   * <code>float t8 = 9;</code>
   */
  public float getT8() {
    return t8_;
  }

  public static final int T9_FIELD_NUMBER = 10;
  private float t9_;
  /**
   * <code>float t9 = 10;</code>
   */
  public float getT9() {
    return t9_;
  }

  public static final int RE_FIELD_NUMBER = 11;
  private volatile java.lang.Object re_;
  /**
   * <code>string re = 11;</code>
   */
  public java.lang.String getRe() {
    java.lang.Object ref = re_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      re_ = s;
      return s;
    }
  }
  /**
   * <code>string re = 11;</code>
   */
  public com.google.protobuf.ByteString
      getReBytes() {
    java.lang.Object ref = re_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      re_ = b;
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
    if (t0_ != 0F) {
      output.writeFloat(1, t0_);
    }
    if (t1_ != 0F) {
      output.writeFloat(2, t1_);
    }
    if (t2_ != 0F) {
      output.writeFloat(3, t2_);
    }
    if (t3_ != 0F) {
      output.writeFloat(4, t3_);
    }
    if (t4_ != 0F) {
      output.writeFloat(5, t4_);
    }
    if (t5_ != 0F) {
      output.writeFloat(6, t5_);
    }
    if (t6_ != 0F) {
      output.writeFloat(7, t6_);
    }
    if (t7_ != 0F) {
      output.writeFloat(8, t7_);
    }
    if (t8_ != 0F) {
      output.writeFloat(9, t8_);
    }
    if (t9_ != 0F) {
      output.writeFloat(10, t9_);
    }
    if (!getReBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 11, re_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (t0_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, t0_);
    }
    if (t1_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, t1_);
    }
    if (t2_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, t2_);
    }
    if (t3_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, t3_);
    }
    if (t4_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, t4_);
    }
    if (t5_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(6, t5_);
    }
    if (t6_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(7, t6_);
    }
    if (t7_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(8, t7_);
    }
    if (t8_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(9, t8_);
    }
    if (t9_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(10, t9_);
    }
    if (!getReBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, re_);
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
    if (!(obj instanceof kcp.aio.server.job.verify.GrpcRequest)) {
      return super.equals(obj);
    }
    kcp.aio.server.job.verify.GrpcRequest other = (kcp.aio.server.job.verify.GrpcRequest) obj;

    boolean result = true;
    result = result && (
        java.lang.Float.floatToIntBits(getT0())
        == java.lang.Float.floatToIntBits(
            other.getT0()));
    result = result && (
        java.lang.Float.floatToIntBits(getT1())
        == java.lang.Float.floatToIntBits(
            other.getT1()));
    result = result && (
        java.lang.Float.floatToIntBits(getT2())
        == java.lang.Float.floatToIntBits(
            other.getT2()));
    result = result && (
        java.lang.Float.floatToIntBits(getT3())
        == java.lang.Float.floatToIntBits(
            other.getT3()));
    result = result && (
        java.lang.Float.floatToIntBits(getT4())
        == java.lang.Float.floatToIntBits(
            other.getT4()));
    result = result && (
        java.lang.Float.floatToIntBits(getT5())
        == java.lang.Float.floatToIntBits(
            other.getT5()));
    result = result && (
        java.lang.Float.floatToIntBits(getT6())
        == java.lang.Float.floatToIntBits(
            other.getT6()));
    result = result && (
        java.lang.Float.floatToIntBits(getT7())
        == java.lang.Float.floatToIntBits(
            other.getT7()));
    result = result && (
        java.lang.Float.floatToIntBits(getT8())
        == java.lang.Float.floatToIntBits(
            other.getT8()));
    result = result && (
        java.lang.Float.floatToIntBits(getT9())
        == java.lang.Float.floatToIntBits(
            other.getT9()));
    result = result && getRe()
        .equals(other.getRe());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + T0_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getT0());
    hash = (37 * hash) + T1_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getT1());
    hash = (37 * hash) + T2_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getT2());
    hash = (37 * hash) + T3_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getT3());
    hash = (37 * hash) + T4_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getT4());
    hash = (37 * hash) + T5_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getT5());
    hash = (37 * hash) + T6_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getT6());
    hash = (37 * hash) + T7_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getT7());
    hash = (37 * hash) + T8_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getT8());
    hash = (37 * hash) + T9_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getT9());
    hash = (37 * hash) + RE_FIELD_NUMBER;
    hash = (53 * hash) + getRe().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static kcp.aio.server.job.verify.GrpcRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kcp.aio.server.job.verify.GrpcRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kcp.aio.server.job.verify.GrpcRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kcp.aio.server.job.verify.GrpcRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kcp.aio.server.job.verify.GrpcRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kcp.aio.server.job.verify.GrpcRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kcp.aio.server.job.verify.GrpcRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kcp.aio.server.job.verify.GrpcRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static kcp.aio.server.job.verify.GrpcRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static kcp.aio.server.job.verify.GrpcRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static kcp.aio.server.job.verify.GrpcRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kcp.aio.server.job.verify.GrpcRequest parseFrom(
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
  public static Builder newBuilder(kcp.aio.server.job.verify.GrpcRequest prototype) {
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
   * The request message containing the user's name.
   * </pre>
   *
   * Protobuf type {@code verify.GrpcRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:verify.GrpcRequest)
      kcp.aio.server.job.verify.GrpcRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return kcp.aio.server.job.verify.KCPProto.internal_static_verify_GrpcRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return kcp.aio.server.job.verify.KCPProto.internal_static_verify_GrpcRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              kcp.aio.server.job.verify.GrpcRequest.class, kcp.aio.server.job.verify.GrpcRequest.Builder.class);
    }

    // Construct using kcp.aio.server.job.verify.GrpcRequest.newBuilder()
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
      t0_ = 0F;

      t1_ = 0F;

      t2_ = 0F;

      t3_ = 0F;

      t4_ = 0F;

      t5_ = 0F;

      t6_ = 0F;

      t7_ = 0F;

      t8_ = 0F;

      t9_ = 0F;

      re_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return kcp.aio.server.job.verify.KCPProto.internal_static_verify_GrpcRequest_descriptor;
    }

    public kcp.aio.server.job.verify.GrpcRequest getDefaultInstanceForType() {
      return kcp.aio.server.job.verify.GrpcRequest.getDefaultInstance();
    }

    public kcp.aio.server.job.verify.GrpcRequest build() {
      kcp.aio.server.job.verify.GrpcRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public kcp.aio.server.job.verify.GrpcRequest buildPartial() {
      kcp.aio.server.job.verify.GrpcRequest result = new kcp.aio.server.job.verify.GrpcRequest(this);
      result.t0_ = t0_;
      result.t1_ = t1_;
      result.t2_ = t2_;
      result.t3_ = t3_;
      result.t4_ = t4_;
      result.t5_ = t5_;
      result.t6_ = t6_;
      result.t7_ = t7_;
      result.t8_ = t8_;
      result.t9_ = t9_;
      result.re_ = re_;
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
      if (other instanceof kcp.aio.server.job.verify.GrpcRequest) {
        return mergeFrom((kcp.aio.server.job.verify.GrpcRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(kcp.aio.server.job.verify.GrpcRequest other) {
      if (other == kcp.aio.server.job.verify.GrpcRequest.getDefaultInstance()) return this;
      if (other.getT0() != 0F) {
        setT0(other.getT0());
      }
      if (other.getT1() != 0F) {
        setT1(other.getT1());
      }
      if (other.getT2() != 0F) {
        setT2(other.getT2());
      }
      if (other.getT3() != 0F) {
        setT3(other.getT3());
      }
      if (other.getT4() != 0F) {
        setT4(other.getT4());
      }
      if (other.getT5() != 0F) {
        setT5(other.getT5());
      }
      if (other.getT6() != 0F) {
        setT6(other.getT6());
      }
      if (other.getT7() != 0F) {
        setT7(other.getT7());
      }
      if (other.getT8() != 0F) {
        setT8(other.getT8());
      }
      if (other.getT9() != 0F) {
        setT9(other.getT9());
      }
      if (!other.getRe().isEmpty()) {
        re_ = other.re_;
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
      kcp.aio.server.job.verify.GrpcRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (kcp.aio.server.job.verify.GrpcRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float t0_ ;
    /**
     * <code>float t0 = 1;</code>
     */
    public float getT0() {
      return t0_;
    }
    /**
     * <code>float t0 = 1;</code>
     */
    public Builder setT0(float value) {
      
      t0_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float t0 = 1;</code>
     */
    public Builder clearT0() {
      
      t0_ = 0F;
      onChanged();
      return this;
    }

    private float t1_ ;
    /**
     * <code>float t1 = 2;</code>
     */
    public float getT1() {
      return t1_;
    }
    /**
     * <code>float t1 = 2;</code>
     */
    public Builder setT1(float value) {
      
      t1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float t1 = 2;</code>
     */
    public Builder clearT1() {
      
      t1_ = 0F;
      onChanged();
      return this;
    }

    private float t2_ ;
    /**
     * <code>float t2 = 3;</code>
     */
    public float getT2() {
      return t2_;
    }
    /**
     * <code>float t2 = 3;</code>
     */
    public Builder setT2(float value) {
      
      t2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float t2 = 3;</code>
     */
    public Builder clearT2() {
      
      t2_ = 0F;
      onChanged();
      return this;
    }

    private float t3_ ;
    /**
     * <code>float t3 = 4;</code>
     */
    public float getT3() {
      return t3_;
    }
    /**
     * <code>float t3 = 4;</code>
     */
    public Builder setT3(float value) {
      
      t3_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float t3 = 4;</code>
     */
    public Builder clearT3() {
      
      t3_ = 0F;
      onChanged();
      return this;
    }

    private float t4_ ;
    /**
     * <code>float t4 = 5;</code>
     */
    public float getT4() {
      return t4_;
    }
    /**
     * <code>float t4 = 5;</code>
     */
    public Builder setT4(float value) {
      
      t4_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float t4 = 5;</code>
     */
    public Builder clearT4() {
      
      t4_ = 0F;
      onChanged();
      return this;
    }

    private float t5_ ;
    /**
     * <code>float t5 = 6;</code>
     */
    public float getT5() {
      return t5_;
    }
    /**
     * <code>float t5 = 6;</code>
     */
    public Builder setT5(float value) {
      
      t5_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float t5 = 6;</code>
     */
    public Builder clearT5() {
      
      t5_ = 0F;
      onChanged();
      return this;
    }

    private float t6_ ;
    /**
     * <code>float t6 = 7;</code>
     */
    public float getT6() {
      return t6_;
    }
    /**
     * <code>float t6 = 7;</code>
     */
    public Builder setT6(float value) {
      
      t6_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float t6 = 7;</code>
     */
    public Builder clearT6() {
      
      t6_ = 0F;
      onChanged();
      return this;
    }

    private float t7_ ;
    /**
     * <code>float t7 = 8;</code>
     */
    public float getT7() {
      return t7_;
    }
    /**
     * <code>float t7 = 8;</code>
     */
    public Builder setT7(float value) {
      
      t7_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float t7 = 8;</code>
     */
    public Builder clearT7() {
      
      t7_ = 0F;
      onChanged();
      return this;
    }

    private float t8_ ;
    /**
     * <code>float t8 = 9;</code>
     */
    public float getT8() {
      return t8_;
    }
    /**
     * <code>float t8 = 9;</code>
     */
    public Builder setT8(float value) {
      
      t8_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float t8 = 9;</code>
     */
    public Builder clearT8() {
      
      t8_ = 0F;
      onChanged();
      return this;
    }

    private float t9_ ;
    /**
     * <code>float t9 = 10;</code>
     */
    public float getT9() {
      return t9_;
    }
    /**
     * <code>float t9 = 10;</code>
     */
    public Builder setT9(float value) {
      
      t9_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float t9 = 10;</code>
     */
    public Builder clearT9() {
      
      t9_ = 0F;
      onChanged();
      return this;
    }

    private java.lang.Object re_ = "";
    /**
     * <code>string re = 11;</code>
     */
    public java.lang.String getRe() {
      java.lang.Object ref = re_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        re_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string re = 11;</code>
     */
    public com.google.protobuf.ByteString
        getReBytes() {
      java.lang.Object ref = re_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        re_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string re = 11;</code>
     */
    public Builder setRe(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      re_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string re = 11;</code>
     */
    public Builder clearRe() {
      
      re_ = getDefaultInstance().getRe();
      onChanged();
      return this;
    }
    /**
     * <code>string re = 11;</code>
     */
    public Builder setReBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      re_ = value;
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


    // @@protoc_insertion_point(builder_scope:verify.GrpcRequest)
  }

  // @@protoc_insertion_point(class_scope:verify.GrpcRequest)
  private static final kcp.aio.server.job.verify.GrpcRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new kcp.aio.server.job.verify.GrpcRequest();
  }

  public static kcp.aio.server.job.verify.GrpcRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrpcRequest>
      PARSER = new com.google.protobuf.AbstractParser<GrpcRequest>() {
    public GrpcRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GrpcRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrpcRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrpcRequest> getParserForType() {
    return PARSER;
  }

  public kcp.aio.server.job.verify.GrpcRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

