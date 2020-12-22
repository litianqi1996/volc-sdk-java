// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.model.vod.request;

/**
 * Protobuf type {@code Volcengine.Models.Vod.Request.VodUrlUploadRequest}
 */
public final class VodUrlUploadRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Models.Vod.Request.VodUrlUploadRequest)
    VodUrlUploadRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodUrlUploadRequest.newBuilder() to construct.
  private VodUrlUploadRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodUrlUploadRequest() {
    spaceName_ = "";
    uRLSets_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodUrlUploadRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodUrlUploadRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            spaceName_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              uRLSets_ = new java.util.ArrayList<com.volcengine.model.vod.business.VodUrlUploadURLSet>();
              mutable_bitField0_ |= 0x00000001;
            }
            uRLSets_.add(
                input.readMessage(com.volcengine.model.vod.business.VodUrlUploadURLSet.parser(), extensionRegistry));
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
        uRLSets_ = java.util.Collections.unmodifiableList(uRLSets_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.model.vod.request.VodRequest.internal_static_Volcengine_Models_Vod_Request_VodUrlUploadRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.model.vod.request.VodRequest.internal_static_Volcengine_Models_Vod_Request_VodUrlUploadRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.model.vod.request.VodUrlUploadRequest.class, com.volcengine.model.vod.request.VodUrlUploadRequest.Builder.class);
  }

  public static final int SPACENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object spaceName_;
  /**
   * <pre>
   * 上传的空间名
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  @java.lang.Override
  public java.lang.String getSpaceName() {
    java.lang.Object ref = spaceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      spaceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 上传的空间名
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSpaceNameBytes() {
    java.lang.Object ref = spaceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      spaceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URLSETS_FIELD_NUMBER = 2;
  private java.util.List<com.volcengine.model.vod.business.VodUrlUploadURLSet> uRLSets_;
  /**
   * <pre>
   * 上传URL设置参数集合
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.volcengine.model.vod.business.VodUrlUploadURLSet> getURLSetsList() {
    return uRLSets_;
  }
  /**
   * <pre>
   * 上传URL设置参数集合
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.volcengine.model.vod.business.VodUrlUploadURLSetOrBuilder> 
      getURLSetsOrBuilderList() {
    return uRLSets_;
  }
  /**
   * <pre>
   * 上传URL设置参数集合
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
   */
  @java.lang.Override
  public int getURLSetsCount() {
    return uRLSets_.size();
  }
  /**
   * <pre>
   * 上传URL设置参数集合
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
   */
  @java.lang.Override
  public com.volcengine.model.vod.business.VodUrlUploadURLSet getURLSets(int index) {
    return uRLSets_.get(index);
  }
  /**
   * <pre>
   * 上传URL设置参数集合
   * </pre>
   *
   * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
   */
  @java.lang.Override
  public com.volcengine.model.vod.business.VodUrlUploadURLSetOrBuilder getURLSetsOrBuilder(
      int index) {
    return uRLSets_.get(index);
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
    if (!getSpaceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, spaceName_);
    }
    for (int i = 0; i < uRLSets_.size(); i++) {
      output.writeMessage(2, uRLSets_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSpaceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, spaceName_);
    }
    for (int i = 0; i < uRLSets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, uRLSets_.get(i));
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
    if (!(obj instanceof com.volcengine.model.vod.request.VodUrlUploadRequest)) {
      return super.equals(obj);
    }
    com.volcengine.model.vod.request.VodUrlUploadRequest other = (com.volcengine.model.vod.request.VodUrlUploadRequest) obj;

    if (!getSpaceName()
        .equals(other.getSpaceName())) return false;
    if (!getURLSetsList()
        .equals(other.getURLSetsList())) return false;
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
    hash = (37 * hash) + SPACENAME_FIELD_NUMBER;
    hash = (53 * hash) + getSpaceName().hashCode();
    if (getURLSetsCount() > 0) {
      hash = (37 * hash) + URLSETS_FIELD_NUMBER;
      hash = (53 * hash) + getURLSetsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.model.vod.request.VodUrlUploadRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.request.VodUrlUploadRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.request.VodUrlUploadRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.request.VodUrlUploadRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.request.VodUrlUploadRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.request.VodUrlUploadRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.request.VodUrlUploadRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.request.VodUrlUploadRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.model.vod.request.VodUrlUploadRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.request.VodUrlUploadRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.model.vod.request.VodUrlUploadRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.request.VodUrlUploadRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.model.vod.request.VodUrlUploadRequest prototype) {
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
   * Protobuf type {@code Volcengine.Models.Vod.Request.VodUrlUploadRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Models.Vod.Request.VodUrlUploadRequest)
      com.volcengine.model.vod.request.VodUrlUploadRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.model.vod.request.VodRequest.internal_static_Volcengine_Models_Vod_Request_VodUrlUploadRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.model.vod.request.VodRequest.internal_static_Volcengine_Models_Vod_Request_VodUrlUploadRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.model.vod.request.VodUrlUploadRequest.class, com.volcengine.model.vod.request.VodUrlUploadRequest.Builder.class);
    }

    // Construct using com.volcengine.model.vod.request.VodUrlUploadRequest.newBuilder()
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
        getURLSetsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      spaceName_ = "";

      if (uRLSetsBuilder_ == null) {
        uRLSets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        uRLSetsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.model.vod.request.VodRequest.internal_static_Volcengine_Models_Vod_Request_VodUrlUploadRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.model.vod.request.VodUrlUploadRequest getDefaultInstanceForType() {
      return com.volcengine.model.vod.request.VodUrlUploadRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.model.vod.request.VodUrlUploadRequest build() {
      com.volcengine.model.vod.request.VodUrlUploadRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.model.vod.request.VodUrlUploadRequest buildPartial() {
      com.volcengine.model.vod.request.VodUrlUploadRequest result = new com.volcengine.model.vod.request.VodUrlUploadRequest(this);
      int from_bitField0_ = bitField0_;
      result.spaceName_ = spaceName_;
      if (uRLSetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          uRLSets_ = java.util.Collections.unmodifiableList(uRLSets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.uRLSets_ = uRLSets_;
      } else {
        result.uRLSets_ = uRLSetsBuilder_.build();
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
      if (other instanceof com.volcengine.model.vod.request.VodUrlUploadRequest) {
        return mergeFrom((com.volcengine.model.vod.request.VodUrlUploadRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.model.vod.request.VodUrlUploadRequest other) {
      if (other == com.volcengine.model.vod.request.VodUrlUploadRequest.getDefaultInstance()) return this;
      if (!other.getSpaceName().isEmpty()) {
        spaceName_ = other.spaceName_;
        onChanged();
      }
      if (uRLSetsBuilder_ == null) {
        if (!other.uRLSets_.isEmpty()) {
          if (uRLSets_.isEmpty()) {
            uRLSets_ = other.uRLSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureURLSetsIsMutable();
            uRLSets_.addAll(other.uRLSets_);
          }
          onChanged();
        }
      } else {
        if (!other.uRLSets_.isEmpty()) {
          if (uRLSetsBuilder_.isEmpty()) {
            uRLSetsBuilder_.dispose();
            uRLSetsBuilder_ = null;
            uRLSets_ = other.uRLSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            uRLSetsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getURLSetsFieldBuilder() : null;
          } else {
            uRLSetsBuilder_.addAllMessages(other.uRLSets_);
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
      com.volcengine.model.vod.request.VodUrlUploadRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.model.vod.request.VodUrlUploadRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object spaceName_ = "";
    /**
     * <pre>
     * 上传的空间名
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
     * @return The spaceName.
     */
    public java.lang.String getSpaceName() {
      java.lang.Object ref = spaceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spaceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 上传的空间名
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
     * @return The bytes for spaceName.
     */
    public com.google.protobuf.ByteString
        getSpaceNameBytes() {
      java.lang.Object ref = spaceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spaceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 上传的空间名
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
     * @param value The spaceName to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      spaceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 上传的空间名
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpaceName() {
      
      spaceName_ = getDefaultInstance().getSpaceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 上传的空间名
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
     * @param value The bytes for spaceName to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      spaceName_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.volcengine.model.vod.business.VodUrlUploadURLSet> uRLSets_ =
      java.util.Collections.emptyList();
    private void ensureURLSetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        uRLSets_ = new java.util.ArrayList<com.volcengine.model.vod.business.VodUrlUploadURLSet>(uRLSets_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.model.vod.business.VodUrlUploadURLSet, com.volcengine.model.vod.business.VodUrlUploadURLSet.Builder, com.volcengine.model.vod.business.VodUrlUploadURLSetOrBuilder> uRLSetsBuilder_;

    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public java.util.List<com.volcengine.model.vod.business.VodUrlUploadURLSet> getURLSetsList() {
      if (uRLSetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(uRLSets_);
      } else {
        return uRLSetsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public int getURLSetsCount() {
      if (uRLSetsBuilder_ == null) {
        return uRLSets_.size();
      } else {
        return uRLSetsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public com.volcengine.model.vod.business.VodUrlUploadURLSet getURLSets(int index) {
      if (uRLSetsBuilder_ == null) {
        return uRLSets_.get(index);
      } else {
        return uRLSetsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public Builder setURLSets(
        int index, com.volcengine.model.vod.business.VodUrlUploadURLSet value) {
      if (uRLSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureURLSetsIsMutable();
        uRLSets_.set(index, value);
        onChanged();
      } else {
        uRLSetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public Builder setURLSets(
        int index, com.volcengine.model.vod.business.VodUrlUploadURLSet.Builder builderForValue) {
      if (uRLSetsBuilder_ == null) {
        ensureURLSetsIsMutable();
        uRLSets_.set(index, builderForValue.build());
        onChanged();
      } else {
        uRLSetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public Builder addURLSets(com.volcengine.model.vod.business.VodUrlUploadURLSet value) {
      if (uRLSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureURLSetsIsMutable();
        uRLSets_.add(value);
        onChanged();
      } else {
        uRLSetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public Builder addURLSets(
        int index, com.volcengine.model.vod.business.VodUrlUploadURLSet value) {
      if (uRLSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureURLSetsIsMutable();
        uRLSets_.add(index, value);
        onChanged();
      } else {
        uRLSetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public Builder addURLSets(
        com.volcengine.model.vod.business.VodUrlUploadURLSet.Builder builderForValue) {
      if (uRLSetsBuilder_ == null) {
        ensureURLSetsIsMutable();
        uRLSets_.add(builderForValue.build());
        onChanged();
      } else {
        uRLSetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public Builder addURLSets(
        int index, com.volcengine.model.vod.business.VodUrlUploadURLSet.Builder builderForValue) {
      if (uRLSetsBuilder_ == null) {
        ensureURLSetsIsMutable();
        uRLSets_.add(index, builderForValue.build());
        onChanged();
      } else {
        uRLSetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public Builder addAllURLSets(
        java.lang.Iterable<? extends com.volcengine.model.vod.business.VodUrlUploadURLSet> values) {
      if (uRLSetsBuilder_ == null) {
        ensureURLSetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, uRLSets_);
        onChanged();
      } else {
        uRLSetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public Builder clearURLSets() {
      if (uRLSetsBuilder_ == null) {
        uRLSets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        uRLSetsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public Builder removeURLSets(int index) {
      if (uRLSetsBuilder_ == null) {
        ensureURLSetsIsMutable();
        uRLSets_.remove(index);
        onChanged();
      } else {
        uRLSetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public com.volcengine.model.vod.business.VodUrlUploadURLSet.Builder getURLSetsBuilder(
        int index) {
      return getURLSetsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public com.volcengine.model.vod.business.VodUrlUploadURLSetOrBuilder getURLSetsOrBuilder(
        int index) {
      if (uRLSetsBuilder_ == null) {
        return uRLSets_.get(index);  } else {
        return uRLSetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public java.util.List<? extends com.volcengine.model.vod.business.VodUrlUploadURLSetOrBuilder> 
         getURLSetsOrBuilderList() {
      if (uRLSetsBuilder_ != null) {
        return uRLSetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(uRLSets_);
      }
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public com.volcengine.model.vod.business.VodUrlUploadURLSet.Builder addURLSetsBuilder() {
      return getURLSetsFieldBuilder().addBuilder(
          com.volcengine.model.vod.business.VodUrlUploadURLSet.getDefaultInstance());
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public com.volcengine.model.vod.business.VodUrlUploadURLSet.Builder addURLSetsBuilder(
        int index) {
      return getURLSetsFieldBuilder().addBuilder(
          index, com.volcengine.model.vod.business.VodUrlUploadURLSet.getDefaultInstance());
    }
    /**
     * <pre>
     * 上传URL设置参数集合
     * </pre>
     *
     * <code>repeated .Volcengine.Models.Vod.Business.VodUrlUploadURLSet URLSets = 2;</code>
     */
    public java.util.List<com.volcengine.model.vod.business.VodUrlUploadURLSet.Builder> 
         getURLSetsBuilderList() {
      return getURLSetsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.model.vod.business.VodUrlUploadURLSet, com.volcengine.model.vod.business.VodUrlUploadURLSet.Builder, com.volcengine.model.vod.business.VodUrlUploadURLSetOrBuilder> 
        getURLSetsFieldBuilder() {
      if (uRLSetsBuilder_ == null) {
        uRLSetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.volcengine.model.vod.business.VodUrlUploadURLSet, com.volcengine.model.vod.business.VodUrlUploadURLSet.Builder, com.volcengine.model.vod.business.VodUrlUploadURLSetOrBuilder>(
                uRLSets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        uRLSets_ = null;
      }
      return uRLSetsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Models.Vod.Request.VodUrlUploadRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Models.Vod.Request.VodUrlUploadRequest)
  private static final com.volcengine.model.vod.request.VodUrlUploadRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.model.vod.request.VodUrlUploadRequest();
  }

  public static com.volcengine.model.vod.request.VodUrlUploadRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodUrlUploadRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodUrlUploadRequest>() {
    @java.lang.Override
    public VodUrlUploadRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodUrlUploadRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodUrlUploadRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodUrlUploadRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.model.vod.request.VodUrlUploadRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

