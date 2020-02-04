package com.deliveryhero.posmodel.okpos.response.api.external.order.check;

/**
 * [RESPONSE]
 * USE
 *  - SuccessCheckOrderProd (주문 상품 확인) {Sheet.22}
 *  - FailCheckOrderProd (주문 상품 확인) {Sheet.22}
 */

public class CheckOrderProdData {

    private final String prodCd; // 상품 코드 (ex. 000109)
    private final String prodNm; // 상품명 (ex. 세트메뉴)

    public CheckOrderProdData(String prodCd, String prodNm) {
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
