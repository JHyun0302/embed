package hello;

import hello.boot.MySpringApplication;
import hello.boot.MySpringBootAnnotation;

/**
 * @MySpringBootAnnotation 안의 @ComponentScan으로 hello 패키지와 그 하위의 모든 파일 대상으로 @Component 검사
 * main 메서드 실행되면서 .run() 메서드 실행
 */
@MySpringBootAnnotation
public class MySpringBootMain {
    public static void main(String[] args) {
        System.out.println("MySpringBootMain.main");
        //MySpringApplication.run(@SpringBootApplication 있는 현재 클래스, args)
        MySpringApplication.run(MySpringBootMain.class, args);
    }
}
