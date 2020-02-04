package com.deliveryhero.posmodel.okpos.response.api.external.product;

import java.util.List;

/**
 * [RESPONSE]
 * USE
 *  - GetAllProdInfo (상품 정보 조회 (전체)) {Sheet.13}
 *  - GetProdInfo (상품 정보 조회 (단품)) {Sheet.14}
 */

public class GetProdInfoData {

    private final String shopCd; // (ex. DT0017)
    private final List<Prod> prods;
    private final List<Option> options;
    private final List<Side> sides;

    public GetProdInfoData(String shopCd, List<Prod> prods, List<Option> options, List<Side> sides) {
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
