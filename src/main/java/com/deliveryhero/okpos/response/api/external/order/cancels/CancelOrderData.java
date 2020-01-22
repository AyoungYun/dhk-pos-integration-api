package com.deliveryhero.okpos.response.api.external.order.cancels;

import com.deliveryhero.okpos.response.api.external.order.action.ActionOrderData;

/**
 * [RESPONSE]
 * Title: 주문(결제) 취소
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/external/order/cancels
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 고객의 주문 취소를 처리합니다.
 *               매장에서 접수한 주문은 취소가 가능하지 않습니다.
 */

public class CancelOrderData extends ActionOrderData {

    private final String resultCode; // 성공 결과 코드 (ex. 000)
    private final String resultMsg; // 결과 메세지 (ex. success)
    private final Data data;

    public CancelOrderData(String resultCode, String resultMsg, Data data) {
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
