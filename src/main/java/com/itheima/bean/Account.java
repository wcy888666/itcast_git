package com.itheima.bean;

public class Account {

    private Integer aid;
    private Integer uid;
    private Double money;

    //表达关系:一个用户对应一个账户
    private User user;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", uid=" + uid +
                ", money=" + money +
                ", user=" + user +
                '}';
    }
}
