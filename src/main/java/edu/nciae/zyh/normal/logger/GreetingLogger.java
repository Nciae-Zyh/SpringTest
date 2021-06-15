package edu.nciae.zyh.normal.logger;

import edu.nciae.zyh.normal.Greeting;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

public class GreetingLogger {
    private static Logger logger = Logger.getLogger(Greeting.class);

    public void before(JoinPoint jp) {
        logger.info("调用" + jp.getTarget() + "的" + jp.getSignature() + "方法。方法入参：" + Arrays.toString(jp.getArgs()));
    }

    public void after(JoinPoint jp, Object result) {
        logger.info("调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName() + " 方法。方法返回值：" + result);
    }
}
