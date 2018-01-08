package com.zhou.ApplicationEvent;

import org.springframework.context.ApplicationEvent;

/**
 * Created by zhoumeineng on 2018/1/2.
 */
public class Event extends ApplicationEvent {

    private static  final long seriaVersionUID =1L;
    private String msg;
    public Event(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
