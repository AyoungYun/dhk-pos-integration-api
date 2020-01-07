package response.api.callback;

/**
 * [RESPONSE]
 * Title: 주문 상태 Notify
 * Direction: OKPOS(DumAPI) -> 제휴사
 * Method: POST
 * URL: 예) https://www.partner.co.kr/api/callback
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 주문 상태가 갱신이 되면 제휴사에 통지해 줍니다. (제휴사에서 콜백 URL 전달)
 */

public class OrderStateNotify {

    private String resultCode; // 성공 결과 코드 (ex. 000)
    private String resultMsg; // 결과 메세지 (ex. success)

    public OrderStateNotify(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }
}
