package TEST;

import com.zhou.ApplicationEvent.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by zhoumeineng on 2018/1/2.
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;//发布事件

    @Bean(destroyMethod = "")
    public void publish(){
        applicationContext.publishEvent(new Event(this,"来发一下"));

    }
}
