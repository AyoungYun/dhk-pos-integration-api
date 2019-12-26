package response.api.external.product;

/**
 * [RESPONSE]
 * USE
 *  - GetProdsInfo (상품 정보 조회 (전체))
 *  - GetProdInfo (상품 정보 조회 (단품))
 */

public class Data {

    String shopCd; // (ex. DT0017)
    Prod prods;
    Option options;
    Side sides;
}
