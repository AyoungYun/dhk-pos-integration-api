package com.deliveryhero.posmodel.okpos.request.api.external.order.action;

/**
 * [REQUEST]
 * Title: 주문 등록/취소/조회 처리 {Sheet.15}
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/external/order/action
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 매장의 개점 상태를 조회합니다.
 */

public class ActionOrder<T extends ActionOrderData> {

    private final String action; // 등록(create), 취소(cancel), 조회(search) 처리 지정 (ex. create)
    private final T data;

    public ActionOrder(String action, T data) {
        this.action = action;
        this.data = data;
    }

    public String getAction() {
        return action;
    }

    public T getData() {
        return data;
    }
}
