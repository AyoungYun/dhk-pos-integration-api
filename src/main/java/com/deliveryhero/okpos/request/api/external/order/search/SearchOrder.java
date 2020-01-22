package com.deliveryhero.okpos.request.api.external.order.search;

import com.deliveryhero.okpos.request.api.external.order.action.ActionOrderData;

/**
 * [REQUEST]
 * Title: 주문(결제) 조회
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/external/order/search
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 주문 내역을 조회합니다.
 */

public class SearchOrder extends ActionOrderData {

    private final String shopCd; // 매장 코드 (ex. DT0017)
    private final String mobileOrderNo; // 모바일 주문 번호 (ex. 99999999999999)

    public SearchOrder(String shopCd, String mobileOrderNo) {
        this.shopCd = shopCd;
        this.mobileOrderNo = mobileOrderNo;
    }

    public String getShopCd() {
        return shopCd;
    }

    public String getMobileOrderNo() {
        return mobileOrderNo;
    }
}
