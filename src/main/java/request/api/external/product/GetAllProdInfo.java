package request.api.external.product;

/**
 * [REQUEST]
 * Title: 상품 정보 조회 (전체)
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: GET
 * URL: /api/external/product/{shopCd}
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 매장의 전체 상품 정보를 조회합니다.
 */

public class GetAllProdInfo {

    private final String shopCd; // 매장 코드 (ex. DT0017)

    public GetAllProdInfo(String shopCd) {
        this.shopCd = shopCd;
    }

    public String getShopCd() {
        return shopCd;
    }
}
