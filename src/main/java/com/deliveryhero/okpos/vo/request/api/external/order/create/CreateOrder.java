package com.deliveryhero.okpos.vo.request.api.external.order.create;

import java.util.List;

/**
 * [REQUEST]
 * Title: 주문(결제) 등록
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/external/order/create
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 제휴사에서 고객의 주문 내역을 전송해주면 등록하고 POS 내려줍니다.
 *               모바일 주분번호는 최대 14Byte의 숫자로 제휴사에서 유니크하게 생성하시면 됩니다.
 *               배송비가 있는 매장은 배송비 싯가 상품이 등록되어 있어야 합니다. (ASP 어드민 확인 필요)
 *               상품별로 할인금액 설정이 가능합니다.
 */

public class CreateOrder {

    private final String shopCd; // 매장 코드 (ex. DT0017)
    private final String orderTime; // 주문 일시 - YYYYMMDDHH24MISS (ex. 20171205134850)
    private final String mobileOrderTypeCd; // D: 배달 주문, P: 픽업 주문, R: 예약 주문 (ex. D)
    private final String mobileOrderNo; // 모바일 주문 번호 (ex. 99999999999999)
    private final Integer deliveryFee; // 배송비 (ex. 500)
    private final Integer totalAmount; // 총 주문금액 (ex. 13500)
    private final Integer actualAmount; // 실 주문금액 - 할인 및 배송비 등은 차감 (ex. 11500)
    private final Integer totalDiscount; // 총 할인금액 (ex. 1500)
    private final String prepaidYn; // 선불: Y, 후불: N (ex. Y)
    private final Pay pays; // 결제 정보
    private final List<Prod> prods; // 상품 정보
    /* 공통 */
    private final String customerName; // 고객명 - 한글 3글자 입력 제한 (ex. 고객명)
    private final String phone; // 연락처 (ex. 01099999999)
    private final String message; // 사용자 메세지 (ex. 1층에서 연락주세요)
    private final String visitTime; // 방문(픽업) 예약 시간 - YYYYMMDDHH24MISS (ex. 20171205134850)
    /* 배달 주문 추가 정보 */
    private final String landAddr; // 지번 주소 (ex. 서울특별시 금천구 가산동 60-25 에이스하이엔드타워6차)
    private final String landAddrDetail; // 지번 상세 주소 (ex. 604호)
    private final String loadAddr; // 도로명 주소 (ex. 서울특별시 금천구 벚꽃로 234(가산동))
    private final String loadAddrDetail; // 도로명 상세 주소 (ex. 604호)
    /* 픽업 주문 추가 정보 */
    private final String pickupMinute; // 픽업 예상 시간(분) (ex. 30)
    /* 예약 주문 추가 정보 */
    private final String visitCustomerCount; // 방문 고객 수 (ex. 5)

    public CreateOrder(CreateOrderBuilder builder) {
        this.shopCd = builder.shopCd;
        this.orderTime = builder.orderTime;
        this.mobileOrderTypeCd = builder.mobileOrderTypeCd;
        this.mobileOrderNo = builder.mobileOrderNo;
        this.deliveryFee = builder.deliveryFee;
        this.totalAmount = builder.totalAmount;
        this.actualAmount = builder.actualAmount;
        this.totalDiscount = builder.totalDiscount;
        this.prepaidYn = builder.prepaidYn;
        this.pays = builder.pays;
        this.prods = builder.prods;
        this.customerName = builder.customerName;
        this.phone = builder.phone;
        this.message = builder.message;
        this.visitTime = builder.visitTime;
        this.landAddr = builder.landAddr;
        this.landAddrDetail = builder.landAddrDetail;
        this.loadAddr = builder.loadAddr;
        this.loadAddrDetail = builder.loadAddrDetail;
        this.pickupMinute = builder.pickupMinute;
        this.visitCustomerCount = builder.visitCustomerCount;
    }

    public static final class CreateOrderBuilder {
        private String shopCd;
        private String orderTime;
        private String mobileOrderTypeCd;
        private String mobileOrderNo;
        private Integer deliveryFee;
        private Integer totalAmount;
        private Integer actualAmount;
        private Integer totalDiscount;
        private String prepaidYn;
        private Pay pays;
        private List<Prod> prods;
        private String customerName;
        private String phone;
        private String message;
        private String visitTime;
        private String landAddr;
        private String landAddrDetail;
        private String loadAddr;
        private String loadAddrDetail;
        private String pickupMinute;
        private String visitCustomerCount;

        public CreateOrderBuilder withShopCd(String shopCd) {
            this.shopCd = shopCd;
            return this;
        }

        public CreateOrderBuilder withOrderTime(String orderTime) {
            this.orderTime = orderTime;
            return this;
        }

        public CreateOrderBuilder withMobileOrderTypeCd(String mobileOrderTypeCd) {
            this.mobileOrderTypeCd = mobileOrderTypeCd;
            return this;
        }

        public CreateOrderBuilder withMobileOrderNo(String mobileOrderNo) {
            this.mobileOrderNo = mobileOrderNo;
            return this;
        }

        public CreateOrderBuilder withDeliveryFee(Integer deliveryFee) {
            this.deliveryFee = deliveryFee;
            return this;
        }

        public CreateOrderBuilder withTotalAmount(Integer totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public CreateOrderBuilder withActualAmount(Integer actualAmount) {
            this.actualAmount = actualAmount;
            return this;
        }

        public CreateOrderBuilder withTotalDiscount(Integer totalDiscount) {
            this.totalDiscount = totalDiscount;
            return this;
        }

        public CreateOrderBuilder withPrepaidYn(String prepaidYn) {
            this.prepaidYn = prepaidYn;
            return this;
        }

        public CreateOrderBuilder withPays(Pay pays) {
            this.pays = pays;
            return this;
        }

        public CreateOrderBuilder withProds(List<Prod> prods) {
            this.prods = prods;
            return this;
        }

        public CreateOrderBuilder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public CreateOrderBuilder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public CreateOrderBuilder withMessage(String message) {
            this.message = message;
            return this;
        }

        public CreateOrderBuilder withVisitTime(String visitTime) {
            this.visitTime = visitTime;
            return this;
        }

        public CreateOrderBuilder withLandAddr(String landAddr) {
            this.landAddr = landAddr;
            return this;
        }

        public CreateOrderBuilder withLandAddrDetail(String landAddrDetail) {
            this.landAddrDetail = landAddrDetail;
            return this;
        }

        public CreateOrderBuilder withLoadAddr(String loadAddr) {
            this.loadAddr = loadAddr;
            return this;
        }

        public CreateOrderBuilder withLoadAddrDetail(String loadAddrDetail) {
            this.loadAddrDetail = loadAddrDetail;
            return this;
        }

        public CreateOrderBuilder withPickupMinute(String pickupMinute) {
            this.pickupMinute = pickupMinute;
            return this;
        }

        public CreateOrderBuilder withVisitCustomerCount(String visitCustomerCount) {
            this.visitCustomerCount = visitCustomerCount;
            return this;
        }

        public CreateOrder build() {
            return new CreateOrder(this);
        }
    }


    public String getShopCd() {
        return shopCd;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public String getMobileOrderTypeCd() {
        return mobileOrderTypeCd;
    }

    public String getMobileOrderNo() {
        return mobileOrderNo;
    }

    public Integer getDeliveryFee() {
        return deliveryFee;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public Integer getActualAmount() {
        return actualAmount;
    }

    public Integer getTotalDiscount() {
        return totalDiscount;
    }

    public String getPrepaidYn() {
        return prepaidYn;
    }

    public Pay getPays() {
        return pays;
    }

    public List<Prod> getProds() {
        return prods;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhone() {
        return phone;
    }

    public String getMessage() {
        return message;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public String getLandAddr() {
        return landAddr;
    }

    public String getLandAddrDetail() {
        return landAddrDetail;
    }

    public String getLoadAddr() {
        return loadAddr;
    }

    public String getLoadAddrDetail() {
        return loadAddrDetail;
    }

    public String getPickupMinute() {
        return pickupMinute;
    }

    public String getVisitCustomerCount() {
        return visitCustomerCount;
    }
}
