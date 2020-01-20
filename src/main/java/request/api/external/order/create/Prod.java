package request.api.external.order.create;

import java.util.List;

/**
 * [REQUEST]
 * USE
 *  - CreateOrder (주문(결제) 등록)
 */

public class Prod {

    private final String prodCd; // 상품 코드 (ex. 000001)
    private final String prodNm; // 상품명 (ex. 간짜장)
    private final Integer qty; // 상품 수량 (ex. 2)
    private final Integer price; // 상품 가격 (ex. 5000)
    private final String discountType; // 할인 유형 - amount, percent (ex. amount)
    private final Integer discount; // 할인 금액 (ex. 1000)
    private final List<Option> option; // 상품 속성
    private final List<Side> sides; // 세트 메뉴 추가 상품

    public Prod(String prodCd, String prodNm, Integer qty, Integer price, String discountType, Integer discount,
                List<Option> option, List<Side> sides) {
        this.prodCd = prodCd;
        this.prodNm = prodNm;
        this.qty = qty;
        this.price = price;
        this.discountType = discountType;
        this.discount = discount;
        this.option = option;
        this.sides = sides;
    }

    public String getProdCd() {
        return prodCd;
    }

    public String getProdNm() {
        return prodNm;
    }

    public Integer getQty() {
        return qty;
    }

    public Integer getPrice() {
        return price;
    }

    public String getDiscountType() {
        return discountType;
    }

    public Integer getDiscount() {
        return discount;
    }

    public List<Option> getOption() {
        return option;
    }

    public List<Side> getSides() {
        return sides;
    }
}
