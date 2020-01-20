package com.deliveryhero.okpos.vo.response.api.external.shop.accept;

/**
 * [RESPONSE]
 * USE
 *  - AcceptShopStatus (자동/수동 접수 조회 및 변경)
 */

public class Data {

    private final String shopCd; // 매장 코드 (ex. DT0017)
    private final String dumAutoAcceptYn; // Y: 자동 접수, N: 수동 접수 (ex. Y)

    public Data(String shopCd, String dumAutoAcceptYn) {
        this.shopCd = shopCd;
        this.dumAutoAcceptYn = dumAutoAcceptYn;
    }

    public String getShopCd() {
        return shopCd;
    }

    public String getDumAutoAcceptYn() {
        return dumAutoAcceptYn;
    }
}
