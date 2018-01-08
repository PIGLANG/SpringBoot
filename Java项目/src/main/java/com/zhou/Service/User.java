package com.zhou.Service;

/**
 * Created by zhoumeineng on 2018/1/4.
 */
public class User {
    private String user_qq;
    private String gname;
    private int gno;

    public User(String user_qq, String gname, int gno) {
        this.user_qq = user_qq;
        this.gname = gname;
        this.gno = gno;
    }

    public String getUser_qq() {
        return user_qq;
    }

    public void setUser_qq(String user_qq) {
        this.user_qq = user_qq;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public int getGno() {
        return gno;
    }

    public void setGno(int gno) {
        this.gno = gno;
    }
}
