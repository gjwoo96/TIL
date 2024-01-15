package Training_Java.Polymorpthism.sub;

public class Samsung implements Phone{
    @Override
    public void Call() {
        System.out.println("전화를 겁니다.");
    }

    @Override
    public void Internet() {
        System.out.println("삼성 인터넷에 접속합니다.");
    }

    @Override
    public void Message() {
        System.out.println("삼성 메세지를 보냅니다.");
    }

    public void shot(){
        System.out.println("사진을 찍습니다.");
    }
}
