package com.deliveryhero.posmodel.okpos.request.api.external.order.cancels;

import com.deliveryhero.posmodel.okpos.request.api.external.order.action.ActionOrderData;

/**
 * [REQUEST]
 * Title: 주문(결제) 취소 {Sheet.17}
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/external/order/cancels
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 고객의 주문 취소를 처리합니다.
 *               매장에서 접수한 주문은 취소가 가능하지 않습니다.
 */

public class CancelOrder extends ActionOrderData {

    private final String shopCd; // 매장 코드 (ex. DT0017)
    private final String mobileOrderNo; // 모바일 주문 번호 (ex. 99999999999999)
    private final String mobileRegNo; // 모바일 주문 접수 번호 - 주문 등록 시에 리턴 받은 접수 번호 입력 (ex. 0001)

    public CancelOrder(String shopCd, String mobileOrderNo, String mobileRegNo) {
        this.shopCd = shopCd;
        this.mobileOrderNo = mobileOrderNo;
        this.mobileRegNo = mobileRegNo;
    }

    public String getShopCd() {
        return shopCd;
    }

    public String getMobileOrderNo() {
        return mobileOrderNo;
    }

    public String getMobileRegNo() {
        return mobileRegNo;
    }
}
