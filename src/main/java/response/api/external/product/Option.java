package response.api.external.product;

/**
 * [RESPONSE]
 * USE
 *  - GetAllProdInfo - Data (상품 정보 조회 (전체))
 *  - GetProdInfo - Data (상품 정보 조회 (단품))
 */

public class Option {

    private final String classCd; // 상품 옵션 분류 코드 (ex. 01)
    private final String classNm; // 상품 옵션 분류명 (ex. 맵기)
    private final String optionCd; // 상품 옵션 코드 (ex. A01001)
    private final String optionNm; // 상품 옵션명 (ex. 매운맛)

    public Option(String classCd, String classNm, String optionCd, String optionNm) {
        this.classCd = classCd;
        this.classNm = classNm;
        this.optionCd = optionCd;
        this.optionNm = optionNm;
    }

    public String getClassCd() {
        return classCd;
    }

    public String getClassNm() {
        return classNm;
    }

    public String getOptionCd() {
        return optionCd;
    }

    public String getOptionNm() {
        return optionNm;
    }
}
