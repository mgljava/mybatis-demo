package com.github.mgljava.dao;

import com.github.mgljava.domain.People;
import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface PeopleDao {

  @Select("SELECT * FROM people")
  List<People> findAll();
}
