package com.itheima.test;

import com.itheima.bean.Account;
import com.itheima.bean.QueryVo;
import com.itheima.bean.User;
import com.itheima.dao.UserDao;
import com.itheima.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

public class mybatisTest {

    @Test
    public void fun01() throws Exception{
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        QueryVo queryVo = new QueryVo();
        User user = new User();
        //user.setUid(8);
        user.setUsername("张%");
        queryVo.setUser(user);

        List<User> list = userDao.findByQueryVo(queryVo);
        System.out.println(list);

        sqlSession.close();
    }

    @Test
    public void fun02() throws Exception{
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        QueryVo queryVo = new QueryVo();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(3);
        ids.add(4);
        queryVo.setIds(ids);

        List<User> list = userDao.findRange(queryVo);


        System.out.println(list);

        sqlSession.close();
    }

    @Test
    public void fun03() throws Exception{
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        Account account = new Account();
        List<Account> list = userDao.findAccountList();
        System.out.println(list);
        sqlSession.close();
    }

    @Test
    public void fun04() throws Exception{
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        List<Role> list = userDao.findRoleList();
        System.out.println(list);
        sqlSession.close();
    }

}
