package chap_08;

import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        //b1.resolution = "FHD" //접근제어자가 default여서 접근불가
        //b1.price = 20000; // private
        //b1.color = "블랙"; // protected
    }
}
