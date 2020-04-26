package com.itheima.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 目的:
 * 1. 提供SqlSession
 * 2. 保证SqlSessionFactory全局只有一个
 */
public class SqlSessionFactoryUtils {

    private static  SqlSessionFactory sqlSessionFactory;

    /**
     * 保证sqlSessionFactory只加载一次
     */
    static {
        InputStream is = null;
        try {
            //1.读取核心配置文件  ;
            is = Resources.getResourceAsStream("SqlMapConfig.xml");
            //2. 构建SqlSessionFactory
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private SqlSessionFactoryUtils() {
    }

    /**
     * 获得SqlSession
     * @return
     */
    public static SqlSession openSession() {
        //3. 获得session (里面封装Connection)
       // SqlSession sqlSession = sqlSessionFactory.openSession(true);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return  sqlSession;
    }



}
