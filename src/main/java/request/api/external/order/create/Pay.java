package request.api.external.order.create;

/**
 * [REQUEST]
 * USE
 *  - CreateOrder (주문(결제) 등록)
 */

public class Pay {

    private String payFg; // 01: 현금, 02: 신용카드 (ex. 02)
    private Integer payAmt; // 결제 금액 (ex. 12000)

    public Pay(String payFg, Integer payAmt) {
        this.payFg = payFg;
        this.payAmt = payAmt;
    }

    public String getPayFg() {
        return payFg;
    }

    public Integer getPayAmt() {
        return payAmt;
    }
}
