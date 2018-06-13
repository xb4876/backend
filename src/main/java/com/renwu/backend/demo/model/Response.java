package com.renwu.backend.demo.model;
/**
 * Title: 统一响应结构
 * Description:使用REST框架实现前后端分离架构，我们需要首先确定返回的JSON响应结构是统一的，
 * 也就是说，每个REST请求将返回相同结构的JSON响应结构。不妨定义一个相对通用的JSON响应结构，其
 * 中包含两部分：元数据与返回值，其中，元数据表示操作是否成功与返回值消息等，返回值对应服务端方法所返回的数据。
 * { "meta": { "success": true, "message": "ok" }, "data": ... }
 * @author xb4876
 * @created 2018年5月31日 下午14:24:12
 */
public class Response {

    private static final String OK = "ok";
    private static final String ERROR = "error";

    private Meta meta;     // 元数据
    private Object data;   // 响应内容

    public Response success() {
        this.meta = new Meta(true, OK);
        return this;
    }

    public Response success(Object data) {
        this.meta = new Meta(true, OK);
        this.data = data;
        return this;
    }

    public Response failure() {
        this.meta = new Meta(false, ERROR);
        return this;
    }

    public Response failure(String message) {
        this.meta = new Meta(false, message);
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public Object getData() {
        return data;
    }
}