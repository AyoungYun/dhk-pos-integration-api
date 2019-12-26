package response.api.external.product;

/**
 * [RESPONSE]
 * USE
 *  - GetProdsInfo - Data (상품 정보 조회 (전체))
 *  - GetProdInfo - Data (상품 정보 조회 (단품))
 */

public class Option {

    String classCd; // 상품 옵션 분류 코드 (ex. 01)
    String classNm; // 상품 옵션 분류명 (ex. 맵기)
    String optionCd; // 상품 옵션 코드 (ex. A01001)
    String optionNm; // 상품 옵션명 (ex. 매운맛)
}
