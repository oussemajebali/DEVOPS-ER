package tn.esprit.eventsproject.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class PerformanceAspect {
    // third commit to test automatic build in jenkins
    @Around("execution(* tn.esprit.eventsproject.services.*.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info(pjp.getSignature().getName() +" Method execution time: " + elapsedTime
                +"milliseconds.");
        return obj;
    }
}
