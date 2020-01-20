package response.api.external.product;

/**
 * [RESPONSE]
 * USE
 *  - GetAllProdInfo - Data (상품 정보 조회 (전체))
 *  - GetProdInfo - Data (상품 정보 조회 (단품))
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

    public Prod(String classCd, String classNm, String prodCd, String prodNm, Integer price, String optionClassCd,
                String sideClassCds, String setYn, String taxYn, String soldOutYn) {
        this.classCd = classCd;
        this.classNm = classNm;
        this.prodCd = prodCd;
        this.prodNm = prodNm;
        this.price = price;
        this.optionClassCd = optionClassCd;
        this.sideClassCds = sideClassCds;
        this.setYn = setYn;
        this.taxYn = taxYn;
        this.soldOutYn = soldOutYn;
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
