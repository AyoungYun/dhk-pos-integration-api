package response.api.external.order.create;

/**
 * [RESPONSE]
 * USE
 *  - CreateOrder (주문(결제) 등록)
 */

public class Data {

    String shopCd; // 매장 코드 (ex. DT0017)
    String mobileOrderFg; // 모바일 주문 구분 - 03: 덤, 04: 요기요, 05: 더 페이 (ex. 05)
    String mobileOrderNo; // 모바일 주문 번호 (ex. 99999999999999)
    String mobileRegNo; // 모바일 주문 접수 번호 - 주문 취소 시 필요 (ex. 0001)
}
