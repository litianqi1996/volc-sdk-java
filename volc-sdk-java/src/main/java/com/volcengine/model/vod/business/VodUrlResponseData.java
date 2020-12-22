// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_upload.proto

package com.volcengine.model.vod.business;

/**
 * Protobuf type {@code Volcengine.Models.Vod.Business.VodUrlResponseData}
 */
public final class VodUrlResponseData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Models.Vod.Business.VodUrlResponseData)
    VodUrlResponseDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodUrlResponseData.newBuilder() to construct.
  private VodUrlResponseData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodUrlResponseData() {
    data_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodUrlResponseData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodUrlResponseData(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              data_ = new java.util.ArrayList<com.volcengine.model.vod.business.ValuePair>();
              mutable_bitField0_ |= 0x00000001;
            }
            data_.add(
                input.readMessage(com.volcengine.model.vod.business.ValuePair.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        data_ = java.util.Collections.unmodifiableList(data_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.model.vod.business.VodUpload.internal_static_Volcengine_Models_Vod_Business_VodUrlResponseData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.model.vod.business.VodUpload.internal_static_Volcengine_Models_Vod_Business_VodUrlResponseData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.model.vod.business.VodUrlResponseData.class, com.volcengine.model.vod.business.VodUrlResponseData.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private java.util.List<com.volcengine.model.vod.business.ValuePair> data_;
  /**
   * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.volcengine.model.vod.business.ValuePair> getDataList() {
    return data_;
  }
  /**
   * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.volcengine.model.vod.business.ValuePairOrBuilder> 
      getDataOrBuilderList() {
    return data_;
  }
  /**
   * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
   */
  @java.lang.Override
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.model.vod.business.ValuePair getData(int index) {
    return data_.get(index);
  }
  /**
   * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.model.vod.business.ValuePairOrBuilder getDataOrBuilder(
      int index) {
    return data_.get(index);
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
    for (int i = 0; i < data_.size(); i++) {
      output.writeMessage(1, data_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < data_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, data_.get(i));
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
    if (!(obj instanceof com.volcengine.model.vod.business.VodUrlResponseData)) {
      return super.equals(obj);
    }
    com.volcengine.model.vod.business.VodUrlResponseData other = (com.volcengine.model.vod.business.VodUrlResponseData) obj;

    if (!getDataList()
        .equals(other.getDataList())) return false;
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
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.model.vod.business.VodUrlResponseData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.business.VodUrlResponseData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.business.VodUrlResponseData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.business.VodUrlResponseData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.business.VodUrlResponseData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.business.VodUrlResponseData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.business.VodUrlResponseData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.business.VodUrlResponseData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.model.vod.business.VodUrlResponseData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.business.VodUrlResponseData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.model.vod.business.VodUrlResponseData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.business.VodUrlResponseData parseFrom(
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
  public static Builder newBuilder(com.volcengine.model.vod.business.VodUrlResponseData prototype) {
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
   * Protobuf type {@code Volcengine.Models.Vod.Business.VodUrlResponseData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Models.Vod.Business.VodUrlResponseData)
      com.volcengine.model.vod.business.VodUrlResponseDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.model.vod.business.VodUpload.internal_static_Volcengine_Models_Vod_Business_VodUrlResponseData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.model.vod.business.VodUpload.internal_static_Volcengine_Models_Vod_Business_VodUrlResponseData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.model.vod.business.VodUrlResponseData.class, com.volcengine.model.vod.business.VodUrlResponseData.Builder.class);
    }

    // Construct using com.volcengine.model.vod.business.VodUrlResponseData.newBuilder()
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
        getDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dataBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.model.vod.business.VodUpload.internal_static_Volcengine_Models_Vod_Business_VodUrlResponseData_descriptor;
    }

    @java.lang.Override
    public com.volcengine.model.vod.business.VodUrlResponseData getDefaultInstanceForType() {
      return com.volcengine.model.vod.business.VodUrlResponseData.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.model.vod.business.VodUrlResponseData build() {
      com.volcengine.model.vod.business.VodUrlResponseData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.model.vod.business.VodUrlResponseData buildPartial() {
      com.volcengine.model.vod.business.VodUrlResponseData result = new com.volcengine.model.vod.business.VodUrlResponseData(this);
      int from_bitField0_ = bitField0_;
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
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
      if (other instanceof com.volcengine.model.vod.business.VodUrlResponseData) {
        return mergeFrom((com.volcengine.model.vod.business.VodUrlResponseData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.model.vod.business.VodUrlResponseData other) {
      if (other == com.volcengine.model.vod.business.VodUrlResponseData.getDefaultInstance()) return this;
      if (dataBuilder_ == null) {
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataIsMutable();
            data_.addAll(other.data_);
          }
          onChanged();
        }
      } else {
        if (!other.data_.isEmpty()) {
          if (dataBuilder_.isEmpty()) {
            dataBuilder_.dispose();
            dataBuilder_ = null;
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataFieldBuilder() : null;
          } else {
            dataBuilder_.addAllMessages(other.data_);
          }
        }
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
      com.volcengine.model.vod.business.VodUrlResponseData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.model.vod.business.VodUrlResponseData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.volcengine.model.vod.business.ValuePair> data_ =
      java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        data_ = new java.util.ArrayList<com.volcengine.model.vod.business.ValuePair>(data_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.model.vod.business.ValuePair, com.volcengine.model.vod.business.ValuePair.Builder, com.volcengine.model.vod.business.ValuePairOrBuilder> dataBuilder_;

    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public java.util.List<com.volcengine.model.vod.business.ValuePair> getDataList() {
      if (dataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(data_);
      } else {
        return dataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public int getDataCount() {
      if (dataBuilder_ == null) {
        return data_.size();
      } else {
        return dataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public com.volcengine.model.vod.business.ValuePair getData(int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public Builder setData(
        int index, com.volcengine.model.vod.business.ValuePair value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.set(index, value);
        onChanged();
      } else {
        dataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public Builder setData(
        int index, com.volcengine.model.vod.business.ValuePair.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public Builder addData(com.volcengine.model.vod.business.ValuePair value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(value);
        onChanged();
      } else {
        dataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public Builder addData(
        int index, com.volcengine.model.vod.business.ValuePair value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(index, value);
        onChanged();
      } else {
        dataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public Builder addData(
        com.volcengine.model.vod.business.ValuePair.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public Builder addData(
        int index, com.volcengine.model.vod.business.ValuePair.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends com.volcengine.model.vod.business.ValuePair> values) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, data_);
        onChanged();
      } else {
        dataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public Builder removeData(int index) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.remove(index);
        onChanged();
      } else {
        dataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public com.volcengine.model.vod.business.ValuePair.Builder getDataBuilder(
        int index) {
      return getDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public com.volcengine.model.vod.business.ValuePairOrBuilder getDataOrBuilder(
        int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);  } else {
        return dataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public java.util.List<? extends com.volcengine.model.vod.business.ValuePairOrBuilder> 
         getDataOrBuilderList() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(data_);
      }
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public com.volcengine.model.vod.business.ValuePair.Builder addDataBuilder() {
      return getDataFieldBuilder().addBuilder(
          com.volcengine.model.vod.business.ValuePair.getDefaultInstance());
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public com.volcengine.model.vod.business.ValuePair.Builder addDataBuilder(
        int index) {
      return getDataFieldBuilder().addBuilder(
          index, com.volcengine.model.vod.business.ValuePair.getDefaultInstance());
    }
    /**
     * <code>repeated .Volcengine.Models.Vod.Business.ValuePair Data = 1;</code>
     */
    public java.util.List<com.volcengine.model.vod.business.ValuePair.Builder> 
         getDataBuilderList() {
      return getDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.model.vod.business.ValuePair, com.volcengine.model.vod.business.ValuePair.Builder, com.volcengine.model.vod.business.ValuePairOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.volcengine.model.vod.business.ValuePair, com.volcengine.model.vod.business.ValuePair.Builder, com.volcengine.model.vod.business.ValuePairOrBuilder>(
                data_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Models.Vod.Business.VodUrlResponseData)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Models.Vod.Business.VodUrlResponseData)
  private static final com.volcengine.model.vod.business.VodUrlResponseData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.model.vod.business.VodUrlResponseData();
  }

  public static com.volcengine.model.vod.business.VodUrlResponseData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodUrlResponseData>
      PARSER = new com.google.protobuf.AbstractParser<VodUrlResponseData>() {
    @java.lang.Override
    public VodUrlResponseData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodUrlResponseData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodUrlResponseData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodUrlResponseData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.model.vod.business.VodUrlResponseData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

