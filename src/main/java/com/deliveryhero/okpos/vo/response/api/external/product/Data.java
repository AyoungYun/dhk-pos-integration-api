package com.deliveryhero.okpos.vo.response.api.external.product;

import java.util.List;

/**
 * [RESPONSE]
 * USE
 *  - GetAllProdInfo (상품 정보 조회 (전체))
 *  - GetProdInfo (상품 정보 조회 (단품))
 */

public class Data {

    private final String shopCd; // (ex. DT0017)
    private final List<Prod> prods;
    private final List<Option> options;
    private final List<Side> sides;

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
