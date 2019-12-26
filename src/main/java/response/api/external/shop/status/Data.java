package response.api.external.shop.status;

/**
 * [RESPONSE]
 * USE
 *  - GetShopStatus (매장 상태 조회)
 */

public class Data {

    String shopCd; // 매장 코드 (ex. DT0017)
    String shopStatFg; // 매장 상태 - 1: 오픈, 2: 폐점, 4: 출고 보류, 9: 데모 (ex. 1)
    String shopStatNm; // 매장 상태명 (ex. 오픈)
}
