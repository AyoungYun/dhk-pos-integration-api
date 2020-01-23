package com.deliveryhero.okpos.request.api.external.shop.accept;

/**
 * [REQUEST]
 * Title: 자동/수동 접수 조회 및 변경 {Sheet.21}
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/external/shop/accept
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 매장의 자동/수동 접수 상태 조회 또는 자동/수동 접수로 매장 설정을 변경합니다.
 */

public class AcceptShopStatus {

    private final String shopCd; // 매장 코드 (ex. DT0017)
    private final String dumAutoAcceptYn; // Y: 자동 접수, N: 수동 접수, S: 접수 상태 확인 (ex. Y)

    public AcceptShopStatus(String shopCd, String dumAutoAcceptYn) {
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
