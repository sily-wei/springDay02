import com.wn.user.FuZaBean;
import com.wn.user.User;
import com.wn.user.UserDemo;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author weining
 * @date 2019/10/29 16:21
 */
public class TestSpring {

    @Test
    public void UserTest() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringMVC.xml");
        User user = applicationContext.getBean("user", User.class);
        User user2 = applicationContext.getBean("user", User.class);

        user.setUsername("张三");
        System.out.println(user.getUsername());

        user2.setUsername("张三");
        System.out.println(user2.getUsername());

        System.out.println(user==user2);
        applicationContext.close();

    }

    @Test
    public void UserTest2() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringMVC.xml");
        UserDemo user = applicationContext.getBean("userDemo", UserDemo.class);
        UserDemo user2 = applicationContext.getBean("userDemo", UserDemo.class);

        user.setUsername("张三");
        System.out.println(user.getUsername());

        user2.setUsername("张三");
        System.out.println(user2.getUsername());

        System.out.println(user==user2);
        applicationContext.close();

    }

    @Test
    public void UserTest3() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringMVC.xml");
        UserDemo user = applicationContext.getBean("userDemo3", UserDemo.class);
        System.out.println(user.getUsername());

        applicationContext.close();

    }


    @Test
    public void UserTest4() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringMVC.xml");
        UserDemo user = applicationContext.getBean("userDemo4", UserDemo.class);
        System.out.println(user.getUsername());

        applicationContext.close();

    }

    @Test
    public void UserTest5() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringMVC.xml");
        UserDemo user = applicationContext.getBean("userDemo3", UserDemo.class);
        System.out.println(user.getUsername());
        System.out.println(user.getUser().getUsername());
        applicationContext.close();
    }

    @Test
    public void UserTest6() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringMVC.xml");
        FuZaBean fuZaBean = applicationContext.getBean("fuZaBean", FuZaBean.class);
        System.out.println(Arrays.toString(fuZaBean.getMyStrs()));
        System.out.println(fuZaBean.getMyList());
        System.out.println(fuZaBean.getMyMap());
        System.out.println(fuZaBean.getMyProps());
        System.out.println(fuZaBean.getMySet());
        applicationContext.close();
    }
}
