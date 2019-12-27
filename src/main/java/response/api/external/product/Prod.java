package response.api.external.product;

/**
 * [RESPONSE]
 * USE
 *  - GetAllProdInfo - Data (상품 정보 조회 (전체))
 *  - GetProdInfo - Data (상품 정보 조회 (단품))
 */

public class Prod {

    String classCd; // 상품 분류 코드 (ex. 01)
    String classNm; // 상품 분류명 (ex. 기타)
    String prodCd; // 상품 코드 (ex. 000109)
    String prodNm; // 상품명 (ex. 세트메뉴)
    int price; // 상품 가격 (ex. 15000)
    String optionClassCd; // 상품 옵션 분류 코드 (ex. 01)
    String sideClassCds; // 사이드 상품 분류 코드 (ex. 000001000001,000001000002)
    String setYn; // 세트 상품 여부 - Y: 세트, N: 단품 (ex. N)
    String taxYn; // 과세 상품 여부 - Y: 과세, N: 비과세 (ex. Y)
    String soldOutYn; // 매진 여부 - Y/N (ex. N)
}
