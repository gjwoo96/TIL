package Training_Java.Polymorpthism;

public class Olympic {
    public static void main(String[] args) {
        //다형성 미사용
        FootBallPlayer fbp = new FootBallPlayer();
        Runner rn = new Runner();
        Person ps = new Person();
        //다형성 사용
        Person FbPlayer = new FootBallPlayer();
        Person Runner = new Runner();
        FbPlayer.Run();
        Runner.Run();

        if(FbPlayer instanceof Person){
            System.out.println("축구선수는 사람을 참조해요");
        }else {
            System.out.println("축구선수는 참조 안해요");
        }
        if(ps instanceof FootBallPlayer){
            System.out.println("사람은 축구선수를 참조해요");
        }else{
            System.out.println("사람은 참조 안해요");
        }

        //부모를 상속받은 자식클래스를 객체로 선언할때 부모클래스타입으로 선언하고, 부모클래스에 있는 메소드를 사용한다.
        //단 자식클래스에 선언한 메소드일경우에는 InstanceOf라는 메소드를 통해서

    }


}
