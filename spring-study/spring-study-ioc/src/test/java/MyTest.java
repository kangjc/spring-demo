import com.shiguang.pojo.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        //获取spring的上下文对象 官方建议使用ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloSpring hello = (HelloSpring) context.getBean("helloSpring");
        System.out.println(hello.toString());


    }
}
