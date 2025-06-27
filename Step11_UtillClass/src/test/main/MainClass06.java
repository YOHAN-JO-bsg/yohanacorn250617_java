
// 함수형 인터페이스와 람다식의 기본 사용법

package test.main;

import test.mypac.MyFunction;

public class MainClass06 {
    public static void main(String[] args) {
        /*
         *  MyFunction 인터페이스는
         *  excute() 추상메소드 1개, log() default 메소드 1개, help() static 메소드 1개를 가지고 있다.
         */
    	
        // 람다식으로 MyFunction 구현
        MyFunction f1 = () -> {
            System.out.println("excute() 메서드 실행!");
        };
        // 구현 메소드 호출
        f1.excute();
        // default 메서드 호출
        f1.log();
        // static 메소드 호출
        MyFunction.help();
    }
}
