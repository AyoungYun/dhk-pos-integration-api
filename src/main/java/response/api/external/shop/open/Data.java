package response.api.external.shop.open;

/**
 * [RESPONSE]
 * USE
 *  - GetShopOpenStatus (매장 개점 조회)
 */

public class Data {

    String shopCd; // 매장 코드 (ex. DT0017)
    String posNo; // 포스 번호 (ex. 01)
    String saleDate; // 개점일 - YYYYMMDDHH24MISS (ex. 20180603121314)
    String closeFg; // 개점여부 - 1: 개점, 2: 중간마감, 3: 일마감 (ex. 1)
}
