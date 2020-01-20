package response.api.external.shop.status;

/**
 * [RESPONSE]
 * USE
 *  - GetShopStatus (매장 상태 조회)
 */

public class Data {

    private final String shopCd; // 매장 코드 (ex. DT0017)
    private final String shopStatFg; // 매장 상태 - 1: 오픈, 2: 폐점, 4: 출고 보류, 9: 데모 (ex. 1)
    private final String shopStatNm; // 매장 상태명 (ex. 오픈)

    public Data(String shopCd, String shopStatFg, String shopStatNm) {
        this.shopCd = shopCd;
        this.shopStatFg = shopStatFg;
        this.shopStatNm = shopStatNm;
    }

    public String getShopCd() {
        return shopCd;
    }

    public String getShopStatFg() {
        return shopStatFg;
    }

    public String getShopStatNm() {
        return shopStatNm;
    }
}
