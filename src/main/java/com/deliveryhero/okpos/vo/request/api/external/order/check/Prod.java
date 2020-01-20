package com.deliveryhero.okpos.vo.request.api.external.order.check;

import java.util.List;

/**
 * [REQUEST]
 * USE
 *  - CheckOrderProd (주문 상품 확인)
 */

public class Prod {

    private final String prodCd; // 상품 코드 (ex. 000001)
    private final String prodNm; // 상품명 - 선택: 값이 없으면 상품명 일치 여부 체크 안함 (ex. 간짜장)
    private final List<Option> option; // 상품 속성
    private final List<Side> sides; // 사이드(선택) 상품

    public Prod(String prodCd, String prodNm, List<Option> option, List<Side> sides) {
        this.prodCd = prodCd;
        this.prodNm = prodNm;
        this.option = option;
        this.sides = sides;
    }

    public String getProdCd() {
        return prodCd;
    }

    public String getProdNm() {
        return prodNm;
    }

    public List<Option> getOption() {
        return option;
    }

    public List<Side> getSides() {
        return sides;
    }
}
