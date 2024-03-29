package chap_07.Camera;

//자식 클래스
public class SpeedCam extends Camera{
    public SpeedCam() {
        this.name = "과속단속 카메라";
    }

    public void checkSpeed(){
        //속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate(){
        //번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override // 어노테이션
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
