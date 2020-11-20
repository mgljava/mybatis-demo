package com.github.mgljava.dao;

import com.github.mgljava.domain.People;
import java.util.List;

public interface PeopleDao {

  List<People> findAll();
}
