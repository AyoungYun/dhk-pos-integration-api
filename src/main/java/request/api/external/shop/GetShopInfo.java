package request.api.external.shop;

/**
 * [REQUEST]
 * Title: 매장 정보 조회
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: GET
 * URL: /api/external/shop/{shopCd}
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 매장 정보를 조회합니다.
 */

public class GetShopInfo {

    private String shopCd; // 매장 코드 (ex. DT0017)

    public GetShopInfo(String shopCd) {
        this.shopCd = shopCd;
    }

    public String getShopCd() {
        return shopCd;
    }
}
