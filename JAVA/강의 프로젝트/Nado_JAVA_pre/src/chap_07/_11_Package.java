package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        //패키지 (랜덤 클래스 사용)
        Random rd = new Random();
        System.out.println("랜덤 정수 :" +  rd.nextInt());
        System.out.println("랜덤 정수 (범위):" +  rd.nextInt(10));
        System.out.println("랜덤 실수:" +  rd.nextDouble());
        //JDK8 이후부터 nextDouble에 값을넣어서 범위를 제한할수있다.
        System.out.println("랜덤 실수 (범위):" +  rd.nextDouble(1.0));

        //로또 번호를 랜덤으로 뽑으려면 ? 1~45
        System.out.println("로또 번호 : "+ (rd.nextInt(45) + 1));


    }
}
