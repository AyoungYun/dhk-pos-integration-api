package response.api.external.shop.accept;

/**
 * [RESPONSE]
 * USE
 *  - AcceptShopStatus (자동/수동 접수 조회 및 변경)
 */

public class Data {

    String shopCd; // 매장 코드 (ex. DT0017)
    String dumAutoAcceptYn; // Y: 자동 접수, N: 수동 접수 (ex. Y)
}
