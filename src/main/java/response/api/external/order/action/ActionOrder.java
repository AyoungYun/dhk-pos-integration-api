package response.api.external.order.action;

/**
 * [RESPONSE]
 * Title: 주문 등록/취소/조회 처리
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/external/order/action
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 매장의 개점 상태를 조회합니다.
 */

public class ActionOrder {

    String resultCode; // 성공 결과 코드 (ex. 000)
    String resultMsg; // 결과 메세지 (ex. success)
    Data data;
}
