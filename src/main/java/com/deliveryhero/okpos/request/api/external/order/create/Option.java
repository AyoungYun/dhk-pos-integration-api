package com.deliveryhero.okpos.request.api.external.order.create;

/**
 * [REQUEST]
 * USE
 *  - CreateOrder - Prod (주문(결제) 등록) {Sheet.16}
 */

public class Option {

    private final String optionCd; // 속성 코드 (ex. A01001)
    private final String optionNm; // 속성명 (ex. 맵게)

    public Option(String optionCd, String optionNm) {
        this.optionCd = optionCd;
        this.optionNm = optionNm;
    }

    public String getOptionCd() {
        return optionCd;
    }

    public String getOptionNm() {
        return optionNm;
    }
}
