package chap_07;

import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        //Super
        //부모클래스에 어떤걸 자식클래스에서 사용하는것
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();
        System.out.println("---------------------------");

        factoryCam.recordVideo();
        speedCam.takePicture();
    }
}
