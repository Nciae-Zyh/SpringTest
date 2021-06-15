package edu.nciae.zyh.normal.normal.logger;

import edu.nciae.zyh.normal.normal.service.FactorialService;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

public class FactorialLogger {

    private static final Logger log=Logger.getLogger(FactorialService.class);

    public void before(JoinPoint jp){
        System.out.println("前置增强：");
        log.info("调用" + jp.getTarget() + "的" + jp.getSignature() + "方法。方法入参：" + Arrays.toString(jp.getArgs()));
    }

    public void after(JoinPoint jp,Object result){
        System.out.println("后置增强：");
        log.info("调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName() + " 方法。方法返回值：" + result);
    }
}
