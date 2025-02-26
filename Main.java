import com.silphco.PayD;
import com.teamrocket.Xpay;

public class Main {
    public static void main(String[] args) {
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Somchai Jaidee");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23);
        PayD payD = new XpayToPayDAdapter(xpay);
        testPayD(payD);
    }
    private static void testPayD(PayD payD) {
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCreditCardNo());
        System.out.println(payD.getCardExpMonthYear());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }

}
