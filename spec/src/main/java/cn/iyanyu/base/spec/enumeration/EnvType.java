package cn.iyanyu.base.spec.enumeration;

public enum EnvType {
    DEV("dev"),
    TEST("test"),
    PROD("prod");

    private String value;

    private EnvType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}