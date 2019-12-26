package response.api.external.product;

/**
 * [RESPONSE]
 * Title: 상품 정보 조회 (전체)
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: GET
 * URL: /api/external/product/{shopCd}
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 매장의 전체 상품 정보를 조회합니다.
 */

public class GetProdsInfo {

    String resultCode; // 성공 결과 코드 (ex. 000)
    String resultMsg; // 결과 메세지 (ex. success)
    Data data;
}
