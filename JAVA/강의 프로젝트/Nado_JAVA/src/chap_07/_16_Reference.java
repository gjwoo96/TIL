package chap_07;

import chap_07.Camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        //기본 자료형 (Primitive Data Types): int, float, double ...
        int[] i = new int[3];
        System.out.println(i[0]);// 값을 넣지 않아도 0이 할당된다.

        /*참조 자료형 (Non-primitive, Reference Data Types) : String,Camera,SpeedCam...*/
        String[] s = new String[3];
        System.out.println(s[0]); // 참조형 변수는 0이아닌 null 이할당된다.

        Camera c1 = new Camera();
        Camera c2 = new Camera();

        c1.name = "c1 카메라";
        c2.name = "c2 카메라";
        System.out.println("c1 :"+c1.name);
        System.out.println("c2 :"+c2.name);
        System.out.println("===================");
        /*c2는 c1을 참조하게된다. 즉 c1,c2는 같은 카메라를 참조하게되므로*/
        /*아래처럼 카메라의 필드값을 수정하면 같은값이 나오게된다.*/
        c2 = c1;
        System.out.println("c1 :"+c1.name);
        System.out.println("c2 :"+c2.name);
        System.out.println("=====================");
        c2.name = "고장난 카메라";
        System.out.println("c1 :"+c1.name);
        System.out.println("c2 :"+c2.name);
        System.out.println("==================== method call");
        //c2는 c1을 참조하기때문에 이값을 다른 메소드에 넘겨줄경우
        //c1,c2의 모든값이 바뀌는 상황이 생기게된다.
        changeName(c2);
        System.out.println("c1 :"+c1.name);
        System.out.println("c2 :"+c2.name);
        System.out.println("====null insert ======");
        //현재는 c1 > c1을 참조하고있는데 이 관계를 끊어주고싶을경우  null을 넣어준다.
        c2 = null;
        System.out.println("c1 :"+c1.name);
        System.out.println("c2 :"+c2.name);
    }

    public static void changeName(Camera camera){
        camera.name = "잘못된 카메라";
    }
}
