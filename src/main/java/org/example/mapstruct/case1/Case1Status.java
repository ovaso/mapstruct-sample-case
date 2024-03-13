package org.example.mapstruct.case1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Case1Status {
    ENABLED(0),
    BANNED(1),
    ;

    private final int code;
}
