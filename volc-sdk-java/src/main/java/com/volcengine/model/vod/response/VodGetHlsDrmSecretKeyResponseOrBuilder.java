// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/response/response_vod.proto

package com.volcengine.model.vod.response;

public interface VodGetHlsDrmSecretKeyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Models.Vod.Response.VodGetHlsDrmSecretKeyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  boolean hasResponseMetadata();
  /**
   * <pre>
   * 响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  com.volcengine.model.base.ResponseMetadata getResponseMetadata();
  /**
   * <pre>
   * 响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  com.volcengine.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder();

  /**
   * <pre>
   * 响应结果
   * </pre>
   *
   * <code>.Volcengine.Models.Vod.Business.VodGetHlsDrmSecretKeyResult Result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   * 响应结果
   * </pre>
   *
   * <code>.Volcengine.Models.Vod.Business.VodGetHlsDrmSecretKeyResult Result = 2;</code>
   * @return The result.
   */
  com.volcengine.model.vod.business.VodGetHlsDrmSecretKeyResult getResult();
  /**
   * <pre>
   * 响应结果
   * </pre>
   *
   * <code>.Volcengine.Models.Vod.Business.VodGetHlsDrmSecretKeyResult Result = 2;</code>
   */
  com.volcengine.model.vod.business.VodGetHlsDrmSecretKeyResultOrBuilder getResultOrBuilder();
}
