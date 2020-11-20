package com.github.mgljava.domain;

import java.time.ZonedDateTime;
import lombok.Data;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Data
@ToString
@Alias("People")
public class People {

  private Long id;
  private String address;
  private String email;
  private int age;
}
