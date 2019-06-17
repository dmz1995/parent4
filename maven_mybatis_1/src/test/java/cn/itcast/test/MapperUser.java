package cn.itcast.test;

import cn.itcast.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MapperUser {
    @Test
    public void test() throws Exception {
        //ibatis提供的Resources加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = build.openSession(true);
        List<Object> list = sqlSession.selectList("usermapper.select");
        System.out.println(list);
    }
    @Test
    public void test1() throws Exception {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = build.openSession();
        int delete = sqlSession.delete("usermapper.delete", 5);
        sqlSession.commit();
        System.out.println(delete);
    }

    @Test
    public void test2() throws Exception {
//        模拟
        User user = new User();
        user.setUsername("张无忌");
        user.setPassword("123");
        user.setBirthday(new Date());
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        int insert = sqlSession.insert("usermapper.add", user);
        System.out.println(insert);
    }
}
