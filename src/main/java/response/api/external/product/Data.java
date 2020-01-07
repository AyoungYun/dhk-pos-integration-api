package response.api.external.product;

import java.util.List;

/**
 * [RESPONSE]
 * USE
 *  - GetAllProdInfo (상품 정보 조회 (전체))
 *  - GetProdInfo (상품 정보 조회 (단품))
 */

public class Data {

    private String shopCd; // (ex. DT0017)
    private List<Prod> prods;
    private List<Option> options;
    private List<Side> sides;

    public Data(String shopCd, List<Prod> prods, List<Option> options, List<Side> sides) {
        this.shopCd = shopCd;
        this.prods = prods;
        this.options = options;
        this.sides = sides;
    }

    public String getShopCd() {
        return shopCd;
    }

    public List<Prod> getProds() {
        return prods;
    }

    public List<Option> getOptions() {
        return options;
    }

    public List<Side> getSides() {
        return sides;
    }
}
