package response.api.external.shop.status;

/**
 * [RESPONSE]
 * Title: 매장 상태 조회
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: GET
 * URL: /api/external/shop/status/{shopCd}
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 매장 POS의 개점 상태를 조회합니다.
 */

public class GetShopStatus {

    String resultCode; // 성공 결과 코드 (ex. 000)
    String resultMsg; // 결과 메세지 (ex. success)
    Data data;
}
