package com.renwu.backend.demo.model;

/**
 * Title: 请求元数据
 * @author xb4876
 * @created 2018年5月31日 下午14:24:12
 */
public class Meta {

    private boolean success;
    private String message;

    public Meta(boolean success) {
        this.success = success;
    }

    public Meta(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
