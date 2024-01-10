package Training_Java.Polymorpthism.sub;

public class SellPhoneShop {
    public static void main(String[] args) {
        Phone a_phone = new Apple();
        a_phone.Call();
        a_phone.Internet();
        a_phone.Message();
        ((Apple)a_phone).AppleTunes();
    }
}
