package request.api.external.shop.open;

/**
 * [REQUEST]
 * Title: 매장 개점 조회
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: GET
 * URL: /api/external/shop/open/{shopCd}
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 매장의 개점 상태를 조회합니다.
 */

public class GetShopOpenStatus {

    String shopCd; // 매장 코드 (ex. DT0017)
}
