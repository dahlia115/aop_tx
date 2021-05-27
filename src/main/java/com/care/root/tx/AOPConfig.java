package com.care.root.tx;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@Aspect	//aop로 쓰겠다
@EnableAspectJAutoProxy //중간 다리역할
public class AOPConfig {
	@Around("execution(public String buy_form(..))") //이메소드를 어느 시점에 실행 시켜줄 것 인가(시작할 때와 끝날 때 동작
	public void commonAop(ProceedingJoinPoint joinpoint) { 
		try {
			System.out.println("==== 공통기능 시작 ====");
			joinpoint.proceed();//일시중지 후 buy_form()시작
			System.out.println("==== 공통기능 종료 ====");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	@Before("execution(* com.care.root.tx.TestServiceImpl.buy(..))") //실행 전 (범위 지정)
	public void commonAop02() {
		System.out.println("서비스 실행 전에 실행");
	}
	//@After 실행 후
}
