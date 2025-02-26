import com.silphco.PayD;
import com.teamrocket.Xpay;
public class XpayToPayDAdapter implements PayD {
    private final Xpay xpay;

    public XpayToPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
    }
    // getters and setters

    @Override
    public String getCreditCardNo() {
        return String.valueOf(Long.parseLong(xpay.getCreditCardNo()));
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        xpay.setCreditCardNo(String.valueOf(Long.parseLong(creditCardNo)));
    }

    @Override
    public String getCardOwnerName() { // call PayD method
        return xpay.getCustomerName(); // XPay method
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        xpay.setCustomerName(cardOwnerName);
    }

    @Override
    public String getCardExpMonthYear() {
        return xpay.getCardExpMonth() + "/" + xpay.getCardExpYear();
    }

    @Override
    public Integer getCVVNo() {
        return 0;
    }

    @Override
    public Double getTotalAmount() {
        return 0.0;
    }

    @Override
    public void setCardExpMonthYear(String cardExpMonthYear) {
        xpay.setCardExpMonth(cardExpMonthYear.substring(0, 2));
        xpay.setCardExpYear(cardExpMonthYear.substring(3, 2));
    }

    @Override
    public void setCVVNo(Integer cVVNo) {

    }

    @Override
    public void setTotalAmount(Double totalAmount) {

    }
}
