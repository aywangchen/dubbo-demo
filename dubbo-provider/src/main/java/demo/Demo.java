package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangc on 2017/3/1.
 */
public class Demo {
    public static void main(String[] arg){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"classpath*:applicationContext.xml" });
        while(true);
    }
}
