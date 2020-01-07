package request.api.external.order.create;

/**
 * [REQUEST]
 * USE
 *  - CreateOrder - Prod (주문(결제) 등록)
 */

public class Side {

    private String prodCd; // 추가 상품 코드 (ex. 000002)
    private String prodNm; // 추가 상품명 (ex. 곱배기)
    private Integer qty; // 추가 상품 수량 (ex. 1)
    private Integer price; // 추가 상품 가격 (ex. 500)
    private String discountType; // 할인 유형 - amount, percent (ex. amount)
    private Integer discount; // 할인 금액 (ex. 500)

    public Side(String prodCd, String prodNm, Integer qty, Integer price, String discountType, Integer discount) {
        this.prodCd = prodCd;
        this.prodNm = prodNm;
        this.qty = qty;
        this.price = price;
        this.discountType = discountType;
        this.discount = discount;
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
}
