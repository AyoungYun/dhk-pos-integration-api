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

    public Prod(ProdBuilder builder) {
        this.prodCd = builder.prodCd;
        this.prodNm = builder.prodNm;
        this.qty = builder.qty;
        this.price = builder.price;
        this.discountType = builder.discountType;
        this.discount = builder.discount;
        this.option = builder.option;
        this.sides = builder.sides;
    }

    public static final class ProdBuilder {
        private String prodCd;
        private String prodNm;
        private Integer qty;
        private Integer price;
        private String discountType;
        private Integer discount;
        private List<Option> option;
        private List<Side> sides;

        public ProdBuilder withProdCd(String prodCd) {
            this.prodCd = prodCd;
            return this;
        }

        public ProdBuilder withProdNm(String prodNm) {
            this.prodNm = prodNm;
            return this;
        }

        public ProdBuilder withQty(Integer qty) {
            this.qty = qty;
            return this;
        }

        public ProdBuilder withPrice(Integer price) {
            this.price = price;
            return this;
        }

        public ProdBuilder withDiscountType(String discountType) {
            this.discountType = discountType;
            return this;
        }

        public ProdBuilder withDiscount(Integer discount) {
            this.discount = discount;
            return this;
        }

        public ProdBuilder withOption(List<Option> option) {
            this.option = option;
            return this;
        }

        public ProdBuilder withSides(List<Side> sides) {
            this.sides = sides;
            return this;
        }

        public Prod build() {
            return new Prod(this);
        }
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
