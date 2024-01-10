package Training_Java.Polymorpthism.sub;

public class Apple implements Phone{
    @Override
    public void Call() {
        System.out.println("아이폰 전화겁니다.");
    }

    @Override
    public void Internet() {
        System.out.println("아이폰 인터넷접속합니다.");
    }

    @Override
    public void Message() {
        System.out.println("아이폰 메세지보냅니다.");
    }
    public void AppleTunes(){
        System.out.println("애플튠즈에 접속합니다.");
    }
}
