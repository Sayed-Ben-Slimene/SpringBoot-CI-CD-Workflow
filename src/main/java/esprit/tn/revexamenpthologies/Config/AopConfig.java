package esprit.tn.revexamenpthologies.Config;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class AopConfig {



    @AfterReturning(value = "execution(* esprit.tn.revexamenpthologies.services.*.*(..))")
    void journal(JoinPoint joinPoint){
        String name=joinPoint.getSignature().getName();
        log.info("La methode "+name+" a utilise un string comme parametre");
    }

}
