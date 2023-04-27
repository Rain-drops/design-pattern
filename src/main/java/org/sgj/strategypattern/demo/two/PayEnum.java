package org.sgj.strategypattern.demo.two;

public enum PayEnum {
    ALIPAY("alipay", ""),
    WECHATPAY("wechatpay","");

    private String code;
    private String desc;

    PayEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
