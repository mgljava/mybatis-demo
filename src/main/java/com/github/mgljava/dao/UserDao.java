package com.github.mgljava.dao;

import com.github.mgljava.domain.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDao {

  List<User> findAll();

  @Select("SELECT * FROM user WHERE id = #{id}")
  User findUserById(Long id);

  User findById(Long id);

  void updateById(@Param("id") Long id, @Param("address") String address);
}
