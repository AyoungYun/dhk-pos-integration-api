package response.api.external.shop;

/**
 * [RESPONSE]
 * Title: 매장 정보 조회
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: GET
 * URL: /api/external/shop/{shopCd}
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 매장 정보를 조회합니다.
 */

public class GetShopInfo {

    private final String resultCode; // 성공 결과 코드 (ex. 000)
    private final String resultMsg; // 결과 메세지 (ex. success)
    private final Data data;

    public GetShopInfo(String resultCode, String resultMsg, Data data) {
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
