package com.github.mgljava.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
  private Long id;
  private String username;
  private String address;
}
