package com.deliveryhero.okpos.response.api.external.shop.open;

/**
 * [RESPONSE]
 * USE
 *  - GetShopOpenStatus (매장 개점 조회)
 */

public class Data {

    private final String shopCd; // 매장 코드 (ex. DT0017)
    private final String posNo; // 포스 번호 (ex. 01)
    private final String saleDate; // 개점일 - YYYYMMDDHH24MISS (ex. 20180603121314)
    private final String closeFg; // 개점여부 - 1: 개점, 2: 중간마감, 3: 일마감 (ex. 1)

    public Data(String shopCd, String posNo, String saleDate, String closeFg) {
        this.shopCd = shopCd;
        this.posNo = posNo;
        this.saleDate = saleDate;
        this.closeFg = closeFg;
    }

    public String getShopCd() {
        return shopCd;
    }

    public String getPosNo() {
        return posNo;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public String getCloseFg() {
        return closeFg;
    }
}
