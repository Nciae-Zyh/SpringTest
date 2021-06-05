import edu.nciae.zyh.annotation.Greeting;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans01.xml");
        Greeting greeting=(Greeting) context.getBean("greeting01");
        greeting.say();
    }
    @Test
    public void test02(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans01.xml");
        Greeting greeting=(Greeting) context.getBean("greeting02");
        greeting.say();
    }
    @Test
    public void test03(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans01.xml");
        Greeting greeting=(Greeting) context.getBean("greeting03");
        greeting.say();
    }
    @Test
    public void test04(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans02.xml");
        edu.nciae.zyh.annotation.Greeting greeting=(Greeting) context.getBean("greeting");
        greeting.say();
    }
}
