import com.shiguang.config.MyConfig;
import com.shiguang.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());


    }


}
