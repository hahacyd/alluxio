// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: job_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.RegisterJobWorkerPRequest}
 */
public  final class RegisterJobWorkerPRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.RegisterJobWorkerPRequest)
    RegisterJobWorkerPRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegisterJobWorkerPRequest.newBuilder() to construct.
  private RegisterJobWorkerPRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisterJobWorkerPRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RegisterJobWorkerPRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            alluxio.grpc.WorkerNetAddress.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = workerNetAddress_.toBuilder();
            }
            workerNetAddress_ = input.readMessage(alluxio.grpc.WorkerNetAddress.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(workerNetAddress_);
              workerNetAddress_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            alluxio.grpc.RegisterJobWorkerPOptions.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = options_.toBuilder();
            }
            options_ = input.readMessage(alluxio.grpc.RegisterJobWorkerPOptions.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(options_);
              options_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
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
    return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_RegisterJobWorkerPRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_RegisterJobWorkerPRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.RegisterJobWorkerPRequest.class, alluxio.grpc.RegisterJobWorkerPRequest.Builder.class);
  }

  private int bitField0_;
  public static final int WORKERNETADDRESS_FIELD_NUMBER = 1;
  private alluxio.grpc.WorkerNetAddress workerNetAddress_;
  /**
   * <code>optional .alluxio.grpc.WorkerNetAddress workerNetAddress = 1;</code>
   */
  public boolean hasWorkerNetAddress() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .alluxio.grpc.WorkerNetAddress workerNetAddress = 1;</code>
   */
  public alluxio.grpc.WorkerNetAddress getWorkerNetAddress() {
    return workerNetAddress_ == null ? alluxio.grpc.WorkerNetAddress.getDefaultInstance() : workerNetAddress_;
  }
  /**
   * <code>optional .alluxio.grpc.WorkerNetAddress workerNetAddress = 1;</code>
   */
  public alluxio.grpc.WorkerNetAddressOrBuilder getWorkerNetAddressOrBuilder() {
    return workerNetAddress_ == null ? alluxio.grpc.WorkerNetAddress.getDefaultInstance() : workerNetAddress_;
  }

  public static final int OPTIONS_FIELD_NUMBER = 2;
  private alluxio.grpc.RegisterJobWorkerPOptions options_;
  /**
   * <code>optional .alluxio.grpc.RegisterJobWorkerPOptions options = 2;</code>
   */
  public boolean hasOptions() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .alluxio.grpc.RegisterJobWorkerPOptions options = 2;</code>
   */
  public alluxio.grpc.RegisterJobWorkerPOptions getOptions() {
    return options_ == null ? alluxio.grpc.RegisterJobWorkerPOptions.getDefaultInstance() : options_;
  }
  /**
   * <code>optional .alluxio.grpc.RegisterJobWorkerPOptions options = 2;</code>
   */
  public alluxio.grpc.RegisterJobWorkerPOptionsOrBuilder getOptionsOrBuilder() {
    return options_ == null ? alluxio.grpc.RegisterJobWorkerPOptions.getDefaultInstance() : options_;
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
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getWorkerNetAddress());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, getOptions());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWorkerNetAddress());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOptions());
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
    if (!(obj instanceof alluxio.grpc.RegisterJobWorkerPRequest)) {
      return super.equals(obj);
    }
    alluxio.grpc.RegisterJobWorkerPRequest other = (alluxio.grpc.RegisterJobWorkerPRequest) obj;

    boolean result = true;
    result = result && (hasWorkerNetAddress() == other.hasWorkerNetAddress());
    if (hasWorkerNetAddress()) {
      result = result && getWorkerNetAddress()
          .equals(other.getWorkerNetAddress());
    }
    result = result && (hasOptions() == other.hasOptions());
    if (hasOptions()) {
      result = result && getOptions()
          .equals(other.getOptions());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasWorkerNetAddress()) {
      hash = (37 * hash) + WORKERNETADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getWorkerNetAddress().hashCode();
    }
    if (hasOptions()) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.RegisterJobWorkerPRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.RegisterJobWorkerPRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.RegisterJobWorkerPRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.RegisterJobWorkerPRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.RegisterJobWorkerPRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.RegisterJobWorkerPRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.RegisterJobWorkerPRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.RegisterJobWorkerPRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.RegisterJobWorkerPRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.RegisterJobWorkerPRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.RegisterJobWorkerPRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.RegisterJobWorkerPRequest parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.RegisterJobWorkerPRequest prototype) {
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
   * Protobuf type {@code alluxio.grpc.RegisterJobWorkerPRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.RegisterJobWorkerPRequest)
      alluxio.grpc.RegisterJobWorkerPRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_RegisterJobWorkerPRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_RegisterJobWorkerPRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.RegisterJobWorkerPRequest.class, alluxio.grpc.RegisterJobWorkerPRequest.Builder.class);
    }

    // Construct using alluxio.grpc.RegisterJobWorkerPRequest.newBuilder()
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
        getWorkerNetAddressFieldBuilder();
        getOptionsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (workerNetAddressBuilder_ == null) {
        workerNetAddress_ = null;
      } else {
        workerNetAddressBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (optionsBuilder_ == null) {
        options_ = null;
      } else {
        optionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_RegisterJobWorkerPRequest_descriptor;
    }

    public alluxio.grpc.RegisterJobWorkerPRequest getDefaultInstanceForType() {
      return alluxio.grpc.RegisterJobWorkerPRequest.getDefaultInstance();
    }

    public alluxio.grpc.RegisterJobWorkerPRequest build() {
      alluxio.grpc.RegisterJobWorkerPRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.RegisterJobWorkerPRequest buildPartial() {
      alluxio.grpc.RegisterJobWorkerPRequest result = new alluxio.grpc.RegisterJobWorkerPRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (workerNetAddressBuilder_ == null) {
        result.workerNetAddress_ = workerNetAddress_;
      } else {
        result.workerNetAddress_ = workerNetAddressBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      if (optionsBuilder_ == null) {
        result.options_ = options_;
      } else {
        result.options_ = optionsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.RegisterJobWorkerPRequest) {
        return mergeFrom((alluxio.grpc.RegisterJobWorkerPRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.RegisterJobWorkerPRequest other) {
      if (other == alluxio.grpc.RegisterJobWorkerPRequest.getDefaultInstance()) return this;
      if (other.hasWorkerNetAddress()) {
        mergeWorkerNetAddress(other.getWorkerNetAddress());
      }
      if (other.hasOptions()) {
        mergeOptions(other.getOptions());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      alluxio.grpc.RegisterJobWorkerPRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.RegisterJobWorkerPRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private alluxio.grpc.WorkerNetAddress workerNetAddress_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.WorkerNetAddress, alluxio.grpc.WorkerNetAddress.Builder, alluxio.grpc.WorkerNetAddressOrBuilder> workerNetAddressBuilder_;
    /**
     * <code>optional .alluxio.grpc.WorkerNetAddress workerNetAddress = 1;</code>
     */
    public boolean hasWorkerNetAddress() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .alluxio.grpc.WorkerNetAddress workerNetAddress = 1;</code>
     */
    public alluxio.grpc.WorkerNetAddress getWorkerNetAddress() {
      if (workerNetAddressBuilder_ == null) {
        return workerNetAddress_ == null ? alluxio.grpc.WorkerNetAddress.getDefaultInstance() : workerNetAddress_;
      } else {
        return workerNetAddressBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .alluxio.grpc.WorkerNetAddress workerNetAddress = 1;</code>
     */
    public Builder setWorkerNetAddress(alluxio.grpc.WorkerNetAddress value) {
      if (workerNetAddressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workerNetAddress_ = value;
        onChanged();
      } else {
        workerNetAddressBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.WorkerNetAddress workerNetAddress = 1;</code>
     */
    public Builder setWorkerNetAddress(
        alluxio.grpc.WorkerNetAddress.Builder builderForValue) {
      if (workerNetAddressBuilder_ == null) {
        workerNetAddress_ = builderForValue.build();
        onChanged();
      } else {
        workerNetAddressBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.WorkerNetAddress workerNetAddress = 1;</code>
     */
    public Builder mergeWorkerNetAddress(alluxio.grpc.WorkerNetAddress value) {
      if (workerNetAddressBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            workerNetAddress_ != null &&
            workerNetAddress_ != alluxio.grpc.WorkerNetAddress.getDefaultInstance()) {
          workerNetAddress_ =
            alluxio.grpc.WorkerNetAddress.newBuilder(workerNetAddress_).mergeFrom(value).buildPartial();
        } else {
          workerNetAddress_ = value;
        }
        onChanged();
      } else {
        workerNetAddressBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.WorkerNetAddress workerNetAddress = 1;</code>
     */
    public Builder clearWorkerNetAddress() {
      if (workerNetAddressBuilder_ == null) {
        workerNetAddress_ = null;
        onChanged();
      } else {
        workerNetAddressBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.WorkerNetAddress workerNetAddress = 1;</code>
     */
    public alluxio.grpc.WorkerNetAddress.Builder getWorkerNetAddressBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWorkerNetAddressFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .alluxio.grpc.WorkerNetAddress workerNetAddress = 1;</code>
     */
    public alluxio.grpc.WorkerNetAddressOrBuilder getWorkerNetAddressOrBuilder() {
      if (workerNetAddressBuilder_ != null) {
        return workerNetAddressBuilder_.getMessageOrBuilder();
      } else {
        return workerNetAddress_ == null ?
            alluxio.grpc.WorkerNetAddress.getDefaultInstance() : workerNetAddress_;
      }
    }
    /**
     * <code>optional .alluxio.grpc.WorkerNetAddress workerNetAddress = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.WorkerNetAddress, alluxio.grpc.WorkerNetAddress.Builder, alluxio.grpc.WorkerNetAddressOrBuilder> 
        getWorkerNetAddressFieldBuilder() {
      if (workerNetAddressBuilder_ == null) {
        workerNetAddressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.WorkerNetAddress, alluxio.grpc.WorkerNetAddress.Builder, alluxio.grpc.WorkerNetAddressOrBuilder>(
                getWorkerNetAddress(),
                getParentForChildren(),
                isClean());
        workerNetAddress_ = null;
      }
      return workerNetAddressBuilder_;
    }

    private alluxio.grpc.RegisterJobWorkerPOptions options_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.RegisterJobWorkerPOptions, alluxio.grpc.RegisterJobWorkerPOptions.Builder, alluxio.grpc.RegisterJobWorkerPOptionsOrBuilder> optionsBuilder_;
    /**
     * <code>optional .alluxio.grpc.RegisterJobWorkerPOptions options = 2;</code>
     */
    public boolean hasOptions() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .alluxio.grpc.RegisterJobWorkerPOptions options = 2;</code>
     */
    public alluxio.grpc.RegisterJobWorkerPOptions getOptions() {
      if (optionsBuilder_ == null) {
        return options_ == null ? alluxio.grpc.RegisterJobWorkerPOptions.getDefaultInstance() : options_;
      } else {
        return optionsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .alluxio.grpc.RegisterJobWorkerPOptions options = 2;</code>
     */
    public Builder setOptions(alluxio.grpc.RegisterJobWorkerPOptions value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        options_ = value;
        onChanged();
      } else {
        optionsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.RegisterJobWorkerPOptions options = 2;</code>
     */
    public Builder setOptions(
        alluxio.grpc.RegisterJobWorkerPOptions.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        options_ = builderForValue.build();
        onChanged();
      } else {
        optionsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.RegisterJobWorkerPOptions options = 2;</code>
     */
    public Builder mergeOptions(alluxio.grpc.RegisterJobWorkerPOptions value) {
      if (optionsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002) &&
            options_ != null &&
            options_ != alluxio.grpc.RegisterJobWorkerPOptions.getDefaultInstance()) {
          options_ =
            alluxio.grpc.RegisterJobWorkerPOptions.newBuilder(options_).mergeFrom(value).buildPartial();
        } else {
          options_ = value;
        }
        onChanged();
      } else {
        optionsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.RegisterJobWorkerPOptions options = 2;</code>
     */
    public Builder clearOptions() {
      if (optionsBuilder_ == null) {
        options_ = null;
        onChanged();
      } else {
        optionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.RegisterJobWorkerPOptions options = 2;</code>
     */
    public alluxio.grpc.RegisterJobWorkerPOptions.Builder getOptionsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOptionsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .alluxio.grpc.RegisterJobWorkerPOptions options = 2;</code>
     */
    public alluxio.grpc.RegisterJobWorkerPOptionsOrBuilder getOptionsOrBuilder() {
      if (optionsBuilder_ != null) {
        return optionsBuilder_.getMessageOrBuilder();
      } else {
        return options_ == null ?
            alluxio.grpc.RegisterJobWorkerPOptions.getDefaultInstance() : options_;
      }
    }
    /**
     * <code>optional .alluxio.grpc.RegisterJobWorkerPOptions options = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.RegisterJobWorkerPOptions, alluxio.grpc.RegisterJobWorkerPOptions.Builder, alluxio.grpc.RegisterJobWorkerPOptionsOrBuilder> 
        getOptionsFieldBuilder() {
      if (optionsBuilder_ == null) {
        optionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.RegisterJobWorkerPOptions, alluxio.grpc.RegisterJobWorkerPOptions.Builder, alluxio.grpc.RegisterJobWorkerPOptionsOrBuilder>(
                getOptions(),
                getParentForChildren(),
                isClean());
        options_ = null;
      }
      return optionsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.RegisterJobWorkerPRequest)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.RegisterJobWorkerPRequest)
  private static final alluxio.grpc.RegisterJobWorkerPRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.RegisterJobWorkerPRequest();
  }

  public static alluxio.grpc.RegisterJobWorkerPRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<RegisterJobWorkerPRequest>
      PARSER = new com.google.protobuf.AbstractParser<RegisterJobWorkerPRequest>() {
    public RegisterJobWorkerPRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RegisterJobWorkerPRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegisterJobWorkerPRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterJobWorkerPRequest> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.RegisterJobWorkerPRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

