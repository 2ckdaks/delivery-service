package org.delivery.db.user.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum UserStatus {

    REGISTRED("등록"),

    UNREGISTRED("해지")
    ;

    private final String description;
}
