package request.api.external.order.create;

/**
 * [REQUEST]
 * USE
 *  - CreateOrder (주문(결제) 등록)
 */

public class Prod {

    String prodCd; // 상품 코드 (ex. 000001)
    String prodNm; // 상품명 (ex. 간짜장)
    int qty; // 상품 수량 (ex. 2)
    int price; // 상품 가격 (ex. 5000)
    String discountType; // 할인 유형 - amount, percent (ex. amount)
    int discount; // 할인 금액 (ex. 1000)
    Option option; // 상품 속성
    Side sides; // 세트 메뉴 추가 상품
}
