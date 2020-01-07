package response.api.external.shop.open;

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

    private String resultCode; // 성공 결과 코드 (ex. 000)
    private String resultMsg; // 결과 메세지 (ex. success)
    private Data data;

    public GetShopOpenStatus(String resultCode, String resultMsg, Data data) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.data = data;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public Data getData() {
        return data;
    }
}
