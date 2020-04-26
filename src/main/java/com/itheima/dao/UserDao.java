package com.itheima.dao;


import com.itheima.bean.Account;
import com.itheima.bean.QueryVo;
import com.itheima.bean.User;

import javax.management.relation.Role;
import java.util.List;

public interface UserDao {

    /**
     * 复杂条件的查询
     * @param queryVo
     * @return
     */
    List<User> findByQueryVo(QueryVo queryVo);


    /**
     * 复杂条件的查询
     * @param queryVo
     * @return
     */
    List<User> findRange(QueryVo queryVo);

    /**
     * 复杂条件的查询
     * @param queryVo
     * @return
     */
    List<User> findRange02(QueryVo queryVo);

    List<Account> findAccountList();

    /**
     * 查询角色信息
     * @return
     */
    List<Role> findRoleList();

}
