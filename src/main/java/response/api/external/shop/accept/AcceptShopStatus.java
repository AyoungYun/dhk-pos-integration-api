package response.api.external.shop.accept;

/**
 * [RESPONSE]
 * Title: 자동/수동 접수 조회 및 변경
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/external/shop/accept
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 매장의 자동/수동 접수 상태 조회 또는 자동/수동 접수로 매장 설정을 변경합니다.
 */

public class AcceptShopStatus {

    String resultCode; // 성공 결과 코드 (ex. 000)
    String resultMsg; // 결과 메세지 (ex. success)
    Data data;
}
