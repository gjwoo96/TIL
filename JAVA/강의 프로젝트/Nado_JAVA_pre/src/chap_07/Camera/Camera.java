package chap_07.Camera;

//부모 클래스
public class Camera {
    public String name;

    public Camera() {
        this.name = "카메라";
    }
    
    public void takePicture(){
        //사진촬영
        System.out.println(this.name+ ": 사진을 촬영합니다.");
    }
    public void recordVideo(){
        //동영상 녹화
        System.out.println(this.name+": 동영상을 촬영합니다.");
    }

    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능 : 사진 촬영, 동영상 녹화");
    }

}
