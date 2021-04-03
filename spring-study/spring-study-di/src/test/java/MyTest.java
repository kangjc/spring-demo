
import com.alibaba.fastjson.JSON;
import com.shiguang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Object student = context.getBean("student");
//        System.out.println(JSON.toJSON(student));
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(JSON.toJSON(user));
    }
}
