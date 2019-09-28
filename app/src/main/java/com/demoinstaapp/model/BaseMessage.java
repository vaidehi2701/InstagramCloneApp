package com.demoinstaapp.model;

public class BaseMessage {

    class Message {
        String message;
        User sender;
        long createdAt;
    }
    class User {
        String nickname;
        String profileUrl;
    }
}
