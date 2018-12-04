package com.jirina.backend.models;

import javax.persistence.*;
@Entity
@Table
public class GuestBookUser {

    @Id
    @GeneratedValue
    long id;
    String username;
    String password;

    @OneToOne(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="token_id")
    Token token;

    public GuestBookUser(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public GuestBookUser() {
    }
}
