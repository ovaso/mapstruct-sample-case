package org.example.mapstruct.case2;

public enum Case2Status {
    ENABLED(0),
    BANNED(1),
    ;

    private final int code;

    Case2Status(final int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
