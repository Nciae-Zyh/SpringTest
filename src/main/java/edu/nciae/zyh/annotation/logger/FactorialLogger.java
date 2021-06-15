package edu.nciae.zyh.annotation.logger;

import edu.nciae.zyh.annotation.service.FactorialService;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect
public class FactorialLogger {

    private static final Logger log=Logger.getLogger(FactorialService.class);

    @Pointcut("execution(* edu.nciae.zyh.annotation.service.FactorialService.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(JoinPoint jp){
        System.out.println("前置增强：");
        log.info("调用" + jp.getTarget() + "的" + jp.getSignature() + "方法。方法入参：" + Arrays.toString(jp.getArgs()));
    }

    @AfterReturning(pointcut = "pointcut()",returning = "result")
    public void after(JoinPoint jp,Object result){
        System.out.println("后置增强：");
        log.info("调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName() + " 方法。方法返回值：" + result);
    }
}
