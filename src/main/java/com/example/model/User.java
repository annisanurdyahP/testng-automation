package com.example.model;

public class User {
  public String title;
  public String username;
  public String password;
  public boolean statusLogin;
  public String expectedErrorMessage;

  public User(String title, String username, String password, boolean statusLogin, String expectedErrorMessage) {
    this.title = title;
    this.username = username;
    this.password = password;
    this.statusLogin = statusLogin;
    this.expectedErrorMessage = expectedErrorMessage;
  }
}
