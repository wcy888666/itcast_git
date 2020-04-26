package com.itheima.bean;

import java.util.List;

public class QueryVo {

    private User user;

    private List<Integer> ids;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public List<Integer> getIds() {
        return ids;
    }
}
