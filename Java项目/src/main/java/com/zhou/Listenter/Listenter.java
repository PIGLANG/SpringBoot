package com.zhou.Listenter;

import com.zhou.ApplicationEvent.Event;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by zhoumeineng on 2018/1/2.
 */
@Component
public class Listenter implements ApplicationListener<Event> {

    @Override
    public void onApplicationEvent(Event event) {
        System.out.printf("监听："+event.getMsg());
    }
}
