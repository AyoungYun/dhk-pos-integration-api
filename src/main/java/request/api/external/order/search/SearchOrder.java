package request.api.external.order.search;

/**
 * [REQUEST]
 * Title: 주문(결제) 조회
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/external/order/search
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 주문 내역을 조회합니다.
 */

public class SearchOrder {

    String shopCd; // 매장 코드 (ex. DT0017)
    String mobileOrderNo; // 모바일 주문 번호 (ex. 99999999999999)
}
