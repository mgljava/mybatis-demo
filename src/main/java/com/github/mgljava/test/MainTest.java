package com.github.mgljava.test;


import com.github.mgljava.dao.PeopleDao;
import com.github.mgljava.dao.UserDao;
import com.github.mgljava.domain.People;
import com.github.mgljava.domain.User;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MainTest {

  public static void main(String[] args) throws Exception{
    // 读取配置文件
    InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");

    // 创建SqlSessionFactory工厂
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    SqlSessionFactory sessionFactory = builder.build(inputStream);

    // 使用工厂生产SqlSession对象
    SqlSession session = sessionFactory.openSession();

    // 使用SqlSession创建Dao接口的代理对象
    UserDao mapper = session.getMapper(UserDao.class);
    PeopleDao peopleDao = session.getMapper(PeopleDao.class);

    // 使用代理对象执行方法
    List<User> all = mapper.findAll();
    all.forEach(System.out::println);

    System.out.println("-------------------");
    User userById = mapper.findUserById(3L);
    System.out.println(userById);

    System.out.println("-------people-------");
    List<People> all1 = peopleDao.findAll();
    System.out.println(all1);
    // 释放资源
    session.close();
    inputStream.close();
  }
}
