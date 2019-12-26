package response.api.external.product;

/**
 * [RESPONSE]
 * USE
 *  - GetProdsInfo - Data (상품 정보 조회 (전체))
 *  - GetProdInfo - Data (상품 정보 조회 (단품))
 */

public class Side {

    String classCd; // 사이드 상품 분류 코드 (ex. 000001000001)
    String classNm; // 사이드 상품 분류명 (ex. 세트1)
    int classMaxQty; // 사이드 상품 선택 제한 - 0: 선택 제한 없음, 1: 1개만 선택 가능 (ex. 0)
    String sideCd; // 사이드 상품 코드 (ex. 000020)
    String sideNm; // 사이드 상품명 (ex. 짜장면)
    int sidePrice; // 사이드 상품 가격 (ex. 2000)
}
