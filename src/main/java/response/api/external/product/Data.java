package response.api.external.product;

import java.util.List;

/**
 * [RESPONSE]
 * USE
 *  - GetAllProdInfo (상품 정보 조회 (전체))
 *  - GetProdInfo (상품 정보 조회 (단품))
 */

public class Data {

    String shopCd; // (ex. DT0017)
    List<Prod> prods;
    List<Option> options;
    List<Side> sides;
}
