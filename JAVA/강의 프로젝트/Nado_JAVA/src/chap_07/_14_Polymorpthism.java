package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _14_Polymorpthism {
    public static void main(String[] args) {
        //다형성

        //Class Personm : 사람
        //Class Student extends Person : 학생(학생은 사람이다.)

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("-----------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for(Camera cam : cameras){
            cam.showMainFeature();
        }

        System.out.println("---------------");

        if(camera instanceof Camera){
            System.out.println("카메라입니다.");
        }if(factoryCam instanceof FactoryCam){
            ((FactoryCam)factoryCam).detectFire();
        }

    }
}
