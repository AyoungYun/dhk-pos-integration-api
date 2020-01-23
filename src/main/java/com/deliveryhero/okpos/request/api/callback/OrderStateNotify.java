package com.deliveryhero.okpos.request.api.callback;

/**
 * [REQUEST]
 * Title: 주문 상태 Notify {Sheet.20}
 * Direction: OKPOS(DumAPI) -> 제휴사
 * Method: POST
 * URL: 예) https://www.partner.co.kr/api/callback
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 주문 상태가 갱신이 되면 제휴사에 통지해 줍니다. (제휴사에서 콜백 URL 전달)
 */

public class OrderStateNotify {

    private final String shopCd; // 매장 코드 (ex. DT0017)
    private final String mobileOrderNo; // 모바일 주문 번호 (ex. 99999999999999)
    private final String stepCd; // 스탭 코드 (ex. 100)
    private final String orderState; // 주문 상태 (ex. accepted)
    private final String notiMsg; // 고객에게 보여 줄 메세지 (ex. 접수가 되었습니다. 배송 예상 시간은 17시 50분 입니다.)
    private final String deliveryTime; // 배송 예상 시간 - 접수 시간부터 기본 50분 (ex. 17:50)

    public OrderStateNotify(String shopCd, String mobileOrderNo, String stepCd, String orderState, String notiMsg,
                            String deliveryTime) {
        this.shopCd = shopCd;
        this.mobileOrderNo = mobileOrderNo;
        this.stepCd = stepCd;
        this.orderState = orderState;
        this.notiMsg = notiMsg;
        this.deliveryTime = deliveryTime;
    }

    public String getShopCd() {
        return shopCd;
    }

    public String getMobileOrderNo() {
        return mobileOrderNo;
    }

    public String getStepCd() {
        return stepCd;
    }

    public String getOrderState() {
        return orderState;
    }

    public String getNotiMsg() {
        return notiMsg;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }
}
