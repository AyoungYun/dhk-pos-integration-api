package com.deliveryhero.okpos.response.api.external.product;

/**
 * [RESPONSE]
 * USE
 *  - GetAllProdInfo - GetProdInfoData (상품 정보 조회 (전체)) {Sheet.13}
 *  - GetProdInfo - GetProdInfoData (상품 정보 조회 (단품)) {Sheet.14}
 */

public class Side {

    private final String classCd; // 사이드 상품 분류 코드 (ex. 000001000001)
    private final String classNm; // 사이드 상품 분류명 (ex. 세트1)
    private final Integer classMaxQty; // 사이드 상품 선택 제한 - 0: 선택 제한 없음, 1: 1개만 선택 가능 (ex. 0)
    private final String sideCd; // 사이드 상품 코드 (ex. 000020)
    private final String sideNm; // 사이드 상품명 (ex. 짜장면)
    private final Integer sidePrice; // 사이드 상품 가격 (ex. 2000)

    public Side(String classCd, String classNm, Integer classMaxQty, String sideCd, String sideNm, Integer sidePrice) {
        this.classCd = classCd;
        this.classNm = classNm;
        this.classMaxQty = classMaxQty;
        this.sideCd = sideCd;
        this.sideNm = sideNm;
        this.sidePrice = sidePrice;
    }

    public String getClassCd() {
        return classCd;
    }

    public String getClassNm() {
        return classNm;
    }

    public Integer getClassMaxQty() {
        return classMaxQty;
    }

    public String getSideCd() {
        return sideCd;
    }

    public String getSideNm() {
        return sideNm;
    }

    public Integer getSidePrice() {
        return sidePrice;
    }
}
