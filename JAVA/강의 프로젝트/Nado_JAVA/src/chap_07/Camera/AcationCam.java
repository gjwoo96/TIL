package chap_07.Camera;

public final class AcationCam extends Camera{
    //final을 선언하게되면 다시 값수정 불가능.
    //public final String lens = "광각렌즈";

    //선언만하고 생성자에서 선언하는것도 가능 하지만 재 선언은 불가능
   public final String lens;

    public AcationCam() {
        super("액션카메라");
        lens = "광각렌즈";
    }

    public final void makeVideo(){
        System.out.println(this.name + " : "+this.lens+"로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
