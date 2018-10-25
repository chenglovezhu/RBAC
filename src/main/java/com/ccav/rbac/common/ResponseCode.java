package com.ccav.rbac.common;

/**
 * Created by cc
 */
public enum ResponseCode {

    //配置状态代码
    SUCCESS(0, "SUCCESS"),
    ERROR(1, "ERROR");

    private final int code;
    private final String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    }
