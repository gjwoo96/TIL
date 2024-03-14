package chap_07;

import chap_07.Camera.AcationCam;
import chap_07.Camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        //Final
        AcationCam acationCam = new AcationCam();
        //acationCam.lens = "표준렌즈";
        acationCam.recordVideo();;
        acationCam.makeVideo();

        System.out.println("---------------------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.makeVideo();


    }
}
