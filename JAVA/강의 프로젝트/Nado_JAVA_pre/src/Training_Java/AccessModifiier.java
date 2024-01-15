package Training_Java;

public class AccessModifiier {

    protected String P_Str = "안녕하세요";

    public static void main(String[] args) {
        AccessModifiier amf = new AccessModifiier();
        amf.getAccessModifierTypeNum();
    }
   public void getAccessModifierTypeNum (){
       AccessModifier_Sub ams = new AccessModifier_Sub();
       int pNum = ams.protectedNum;
       int dNum = ams.defaultNum;
       System.out.println(pNum);
       System.out.println(P_Str);
       P_Str = "하이룽";
       System.out.println(P_Str);
   }
}
