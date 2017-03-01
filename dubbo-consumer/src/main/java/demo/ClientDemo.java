package demo;

import com.dubbo.demo.service.DTO.UserDTO;
import com.dubbo.demo.service.ITest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by wangc on 2017/3/1.
 */
public class ClientDemo {
    /*public static void main(String[] args) {
        // 这里注意spring配置文件的名字和路径
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"classpath*:applicationContext.xml"});
        ITest test = (ITest) applicationContext.getBean("springservice");
        test.sayHello("我在这里消费！！！");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    /*public static void main(String[] args) {
        // 这里注意spring配置文件的名字和路径
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"classpath*:applicationContext.xml"});
        ITest test = (ITest) applicationContext.getBean("springservice");
        try {
            UserDTO user = new UserDTO();
            user.setUserName("wangchen");
            user.setPassword("123456");
            String result = test.addUser(user);
            System.out.println(result);
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) {
        // 这里注意spring配置文件的名字和路径
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"classpath*:applicationContext.xml"});
        ITest test = (ITest) applicationContext.getBean("springservice");
        try {
            UserDTO user = test.getUser("wangchen");
            System.out.println("username:" + user.getUserName());
            System.out.println("password:" + user.getPassword());
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
