import edu.nciae.zyh.annotation.service.FactorialService;
import edu.nciae.zyh.annotation.service.Greeting;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    /**
     *1.（第4章上机练习1）在控制台输出：张嘎说：“三天不打小鬼子，手都痒痒！”
     */
    @Test
    public void test01(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("experience01.xml");
        edu.nciae.zyh.normal.normal.Greeting greeting=(edu.nciae.zyh.normal.normal.Greeting) applicationContext.getBean("greeting");
        greeting.say();
    }

    /**
     * 2.（第5章上机练习1）使用构造注入完成属性赋值
     */
    @Test
    public void test02(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("experience02.xml");
        edu.nciae.zyh.normal.normal.Greeting greeting=(edu.nciae.zyh.normal.normal.Greeting) applicationContext.getBean("greeting");
        greeting.say();
    }

    /**
     * 3.（第5章上机练习2、3）使用p命名空间注入直接量、使用p命名空间注入Bean组件
     */
    @Test
    public void test03(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("experience03.xml");
        edu.nciae.zyh.normal.normal.Greeting greeting=(edu.nciae.zyh.normal.normal.Greeting) applicationContext.getBean("greeting");
        greeting.say();
    }

    /**
     * 不利用注释的依赖注入。
     */
    @Test
    public void test04_1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("experience04_1.xml");
        edu.nciae.zyh.normal.rely.Greeting greeting=(edu.nciae.zyh.normal.rely.Greeting) applicationContext.getBean("greeting");
        greeting.say();
    }
    /**
     * 4.（第5章上机练习4）使用注解实现依赖注入
     */
    @Test
    public void test04_2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("experience04_2.xml");
        Greeting greeting=(Greeting) applicationContext.getBean("greeting");
        greeting.say();
    }

    /**
     * 不利用注释的日志记录
     */
    @Test
    public void test05_1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("experience05_1.xml");
        edu.nciae.zyh.normal.normal.Greeting greeting=(edu.nciae.zyh.normal.normal.Greeting) applicationContext.getBean("greeting");
        greeting.say();
        greeting.say2(8);
    }

    /**
     * 5. 分别使用前置增强和后置增强对某个业务方法的执行过程进行日志记录。
     */
    @Test
    public void test05_2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("experience05_2.xml");
        Greeting greeting=(Greeting) applicationContext.getBean("greeting");
        greeting.say();
        FactorialService factorialService =(FactorialService) applicationContext.getBean("factorialService");
        int num=9;
        System.out.println(num+"!="+factorialService.factorial(num));
    }
}
