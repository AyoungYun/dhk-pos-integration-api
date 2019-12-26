package request.api.external.order.create;

/**
 * [REQUEST]
 * USE
 *  - CreateOrder - Prod (주문(결제) 등록)
 */

public class Side {

    String prodCd; // 추가 상품 코드 (ex. 000002)
    String prodNm; // 추가 상품명 (ex. 곱배기)
    int qty; // 추가 상품 수량 (ex. 1)
    int price; // 추가 상품 가격 (ex. 500)
    String discountType; // 할인 유형 - amount, percent (ex. amount)
    int discount; // 할인 금액 (ex. 500)
}
