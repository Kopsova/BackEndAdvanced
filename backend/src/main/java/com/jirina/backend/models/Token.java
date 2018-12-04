package com.jirina.backend.models;

import javax.persistence.*;
import java.security.SecureRandom;
import java.sql.Timestamp;

@Entity
@Table
public class Token{

    @Id
    @GeneratedValue
    long id;
    String token;
    Timestamp generatedAt;

    @OneToOne(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    GuestBookUser user;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Token() {
        this.token = generateToken();

        this.generatedAt = new Timestamp(System.currentTimeMillis());
    }

    public Token(String token) {
        this.token = token;
    }

    public String generateToken() {
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
        String token = bytes.toString();
        return token;
    }
}
