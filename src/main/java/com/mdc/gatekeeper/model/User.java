package com.mdc.gatekeeper.model;


public record User(
        int userId,
        String userName,
        String password,
        String email,
        boolean enabled) {
}
