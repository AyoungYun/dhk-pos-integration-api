package com.deliveryhero.okpos.response.api.external.order.create;

/**
 * [RESPONSE]
 * USE
 *  - CreateOrder (주문(결제) 등록)
 */

public class Data {

    private final String shopCd; // 매장 코드 (ex. DT0017)
    private final String mobileOrderFg; // 모바일 주문 구분 - 03: 덤, 04: 요기요, 05: 더 페이 (ex. 05)
    private final String mobileOrderNo; // 모바일 주문 번호 (ex. 99999999999999)
    private final String mobileRegNo; // 모바일 주문 접수 번호 - 주문 취소 시 필요 (ex. 0001)

    public Data(String shopCd, String mobileOrderFg, String mobileOrderNo, String mobileRegNo) {
        this.shopCd = shopCd;
        this.mobileOrderFg = mobileOrderFg;
        this.mobileOrderNo = mobileOrderNo;
        this.mobileRegNo = mobileRegNo;
    }

    public String getShopCd() {
        return shopCd;
    }

    public String getMobileOrderFg() {
        return mobileOrderFg;
    }

    public String getMobileOrderNo() {
        return mobileOrderNo;
    }

    public String getMobileRegNo() {
        return mobileRegNo;
    }
}
