package TEST;


import com.zhou.Config.EventConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhoumeineng on 2018/1/2.
 */
public class TestConection {

    public static void main(String[] arc) throws IOException {

        /**
         *
         *  发送请求
         * */

//        URL url = new URL("http://localhost:8086/loginService/login");
//        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//        httpURLConnection.setRequestMethod("POST");
//        httpURLConnection.setDoInput(true);
//        httpURLConnection.setDoOutput(true);
//        Map map = new HashMap();
//        map.put("userName","12324125");
//
//        OutputStream outputStream = httpURLConnection.getOutputStream();
//        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
//        dataOutputStream.writeUTF(map.toString());
//
//       InputStream inputStream = httpURLConnection.getInputStream();
//       InputStreamReader reader = new InputStreamReader(inputStream);
//        BufferedReader reader1 = new BufferedReader(reader);
//       String line = new String();
//       StringBuffer stringBuffer = new StringBuffer();
//        while ((line=reader1.readLine())!=null){
//            stringBuffer.append(line);
//        }
//
//        outputStream.close();
//        inputStream.close();
//        httpURLConnection.disconnect();
//        System.out.printf(stringBuffer.toString());



        /**
         *
         * 测试监听
         *
         *  */

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher =  context.getBean(DemoPublisher.class);
        publisher.publish();
        context.close();


    }
}
