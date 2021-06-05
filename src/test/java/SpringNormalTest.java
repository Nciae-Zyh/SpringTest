import edu.nciae.zyh.annotation.Greeting;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringNormalTest {
    /**
     * 1.（第4章上机练习1）在控制台输出：张嘎说：“三天不打小鬼子，手都痒痒！”
     */
    @Test
    public void test01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans00.xml");
        edu.nciae.zyh.normal.Greeting greeting=( edu.nciae.zyh.normal.Greeting)context.getBean("greeting00");
        greeting.say();
    }

    /**
     * 2.（第5章上机练习1）使用构造注入完成属性赋值
     */
    @Test
    public void test02(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans00.xml");
        edu.nciae.zyh.normal.Greeting greeting=( edu.nciae.zyh.normal.Greeting)context.getBean("greeting01");
        greeting.say();
    }

    /**
     * 3.（第5章上机练习2、3）使用p命名空间注入直接量、使用p命名空间注入Bean组件
     */
    @Test
    public void test03(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans00.xml");
        edu.nciae.zyh.normal.Greeting greeting=( edu.nciae.zyh.normal.Greeting)context.getBean("greeting02");
        greeting.say();
    }

    /**
     * 4.（第5章上机练习4）使用注解实现依赖注入
     */
    @Test
    public void test04(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans00.xml");
        edu.nciae.zyh.normal.rel.Greeting greeting=( edu.nciae.zyh.normal.rel.Greeting)context.getBean("greeting03");
        greeting.say();
    }
    @Test
    public void test05(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans02.xml");
        edu.nciae.zyh.annotation.Greeting greeting=(Greeting) context.getBean("greeting");
        greeting.say();
    }

}
