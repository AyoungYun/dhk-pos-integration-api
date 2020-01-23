package com.deliveryhero.okpos.request.api.external.order.check;

/**
 * [REQUEST]
 * USE
 *  - CheckOrderProd - Prod (주문 상품 확인) {Sheet.22}
 */

public class Side {

    private final String prodCd; // 상품 코드 (ex. 000002)
    private final String prodNm; // 상품명 - 선택: 값이 없으면 상품명 일치 여부 체크 안함 (ex. 곱배기)

    public Side(String prodCd, String prodNm) {
        this.prodCd = prodCd;
        this.prodNm = prodNm;
    }

    public String getProdCd() {
        return prodCd;
    }

    public String getProdNm() {
        return prodNm;
    }
}
