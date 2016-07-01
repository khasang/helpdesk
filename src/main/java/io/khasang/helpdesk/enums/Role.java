package io.khasang.helpdesk.enums;

public enum Role {
    ROLE_ADMIN, ROLE_USER;

    public String withoutPrefix() {
        final String prefix = "ROLE_";
        return name().replaceFirst(prefix, "");
    }
}