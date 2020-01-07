package response.api.external.order.check;

/**
 * [FAIL RESPONSE]
 * Title: 주문 상품 확인
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/external/order/check
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 주문 등록 포스의 개점 여부를 체크합니다.
 *               주문 상품의 품절 여부와 상품 코드의 유효성을 체크합니다.
 *               상품명 속성 및 값이 있을 때 상품명 일치 여부를 체크합니다.
 */

public class FailCheckOrderProd {

    private String resultCode; // 성공 결과 코드 (ex. SV0027)
    private String resultMsg; // 결과 메세지 - 실패 사유 (ex. 일시 품절 된 상품이 포함되어 있습니다.)
    private Data data; // 실패한 상품 정보

    public FailCheckOrderProd(String resultCode, String resultMsg, Data data) {
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
