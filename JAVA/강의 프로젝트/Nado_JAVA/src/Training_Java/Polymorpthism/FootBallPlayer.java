package Training_Java.Polymorpthism;

public class FootBallPlayer extends Person{
    @Override
    public void Run() {
        System.out.println("필드 위를 달립니다.");
    }

    @Override
    public void Breath() {
        System.out.println("필드 위에서 숨을 쉽니다.");
    }
    public void Goal(){
        System.out.println("골을 넣습니다.");
    }
}
