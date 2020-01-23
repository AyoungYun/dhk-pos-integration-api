package com.deliveryhero.okpos.response.api.external.product;

/**
 * [RESPONSE]
 * USE
 *  - GetAllProdInfo - GetProdInfoData (상품 정보 조회 (전체)) {Sheet.13}
 *  - GetProdInfo - GetProdInfoData (상품 정보 조회 (단품)) {Sheet.14}
 */

public class Prod {

    private final String classCd; // 상품 분류 코드 (ex. 01)
    private final String classNm; // 상품 분류명 (ex. 기타)
    private final String prodCd; // 상품 코드 (ex. 000109)
    private final String prodNm; // 상품명 (ex. 세트메뉴)
    private final Integer price; // 상품 가격 (ex. 15000)
    private final String optionClassCd; // 상품 옵션 분류 코드 (ex. 01)
    private final String sideClassCds; // 사이드 상품 분류 코드 (ex. 000001000001,000001000002)
    private final String setYn; // 세트 상품 여부 - Y: 세트, N: 단품 (ex. N)
    private final String taxYn; // 과세 상품 여부 - Y: 과세, N: 비과세 (ex. Y)
    private final String soldOutYn; // 매진 여부 - Y/N (ex. N)

    public Prod(ProdBuilder builder) {
        this.classCd = builder.classCd;
        this.classNm = builder.classNm;
        this.prodCd = builder.prodCd;
        this.prodNm = builder.prodNm;
        this.price = builder.price;
        this.optionClassCd = builder.optionClassCd;
        this.sideClassCds = builder.sideClassCds;
        this.setYn = builder.setYn;
        this.taxYn = builder.taxYn;
        this.soldOutYn = builder.soldOutYn;
    }

    public static final class ProdBuilder {
        private String classCd;
        private String classNm;
        private String prodCd;
        private String prodNm;
        private Integer price;
        private String optionClassCd;
        private String sideClassCds;
        private String setYn;
        private String taxYn;
        private String soldOutYn;

        public ProdBuilder withClassCd(String classCd) {
            this.classCd = classCd;
            return this;
        }

        public ProdBuilder withClassNm(String classNm) {
            this.classNm = classNm;
            return this;
        }

        public ProdBuilder withProdCd(String prodCd) {
            this.prodCd = prodCd;
            return this;
        }

        public ProdBuilder withProdNm(String prodNm) {
            this.prodNm = prodNm;
            return this;
        }

        public ProdBuilder withPrice(Integer price) {
            this.price = price;
            return this;
        }

        public ProdBuilder withOptionClassCd(String optionClassCd) {
            this.optionClassCd = optionClassCd;
            return this;
        }

        public ProdBuilder withSideClassCds(String sideClassCds) {
            this.sideClassCds = sideClassCds;
            return this;
        }

        public ProdBuilder withSetYn(String setYn) {
            this.setYn = setYn;
            return this;
        }

        public ProdBuilder withTaxYn(String taxYn) {
            this.taxYn = taxYn;
            return this;
        }

        public ProdBuilder withSoldOutYn(String soldOutYn) {
            this.soldOutYn = soldOutYn;
            return this;
        }

        public Prod build() {
            return new Prod(this);
        }
    }

    public String getClassCd() {
        return classCd;
    }

    public String getClassNm() {
        return classNm;
    }

    public String getProdCd() {
        return prodCd;
    }

    public String getProdNm() {
        return prodNm;
    }

    public Integer getPrice() {
        return price;
    }

    public String getOptionClassCd() {
        return optionClassCd;
    }

    public String getSideClassCds() {
        return sideClassCds;
    }

    public String getSetYn() {
        return setYn;
    }

    public String getTaxYn() {
        return taxYn;
    }

    public String getSoldOutYn() {
        return soldOutYn;
    }
}
