package com.github.mgljava.dao;

import com.github.mgljava.domain.User;
import java.util.List;

public interface UserDao {

  List<User> findAll();
}
