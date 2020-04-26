package com.itheima.bean;

import java.util.List;

public class Role {

    private Integer rid;
    private String rName;
    private String rDesc;

    //1个角色对应多个用户
    private List<User> users;

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", rName='" + rName + '\'' +
                ", rDesc='" + rDesc + '\'' +
                ", users=" + users +
                '}';
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrDesc() {
        return rDesc;
    }

    public void setrDesc(String rDesc) {
        this.rDesc = rDesc;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
