package request.api.external.order.create;

/**
 * [REQUEST]
 * USE
 *  - CreateOrder (주문(결제) 등록)
 */

public class Pay {

    String payFg; // 01: 현금, 02: 신용카드 (ex. 02)
    int payAmt; // 결제 금액 (ex. 12000)
}
