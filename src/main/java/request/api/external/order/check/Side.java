package request.api.external.order.check;

/**
 * [REQUEST]
 * USE
 *  - CheckOrderProd - Prod (주문 상품 확인)
 */

public class Side {

    String prodCd; // 상품 코드 (ex. 000002)
    String prodNm; // 상품명 - 선택: 값이 없으면 상품명 일치 여부 체크 안함 (ex. 곱배기)
}
