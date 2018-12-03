package cn.tangcco.aop;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;
import java.util.logging.Logger;

public class ControllerLogin {
    private final Logger logger=Logger.getLogger("ControllerLogin");

    public void before(JoinPoint joinPoint){
        logger.info("调用了:"+joinPoint.getTarget()+"类的,"+joinPoint.getSignature().getName()+"方法,入参:"+ Arrays.toString(joinPoint.getArgs()));
    }
    public void after(JoinPoint joinPoint,Object result){
        logger.info("调用了:"+joinPoint.getTarget()+"类的,"+joinPoint.getSignature().getName()+"方法,返回"+result);
    }
}
