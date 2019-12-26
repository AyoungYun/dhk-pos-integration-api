package request.api.external.order.create;

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

    String shopCd; // 매장 코드 (ex. DT0017)
    String orderTime; // 주문 일시 - YYYYMMDDHH24MISS (ex. 20171205134850)
    String mobileOrderTypeCd; // D: 배달 주문, P: 픽업 주문, R: 예약 주문 (ex. D)
    String mobileOrderNo; // 모바일 주문 번호 (ex. 99999999999999)
    int deliveryFee; // 배송비 (ex. 500)
    int totalAmount; // 총 주문금액 (ex. 13500)
    int actualAmount; // 실 주문금액 - 할인 및 배송비 등은 차감 (ex. 11500)
    int totalDiscount; // 총 할인금액 (ex. 1500)
    String prepaidYn; // 선불: Y, 후불: N (ex. Y)
    Pay pays; // 결제 정보
    Prod prods; // 상품 정보
    /* 공통 */
    String customerName; // 고객명 - 한글 3글자 입력 제한 (ex. 고객명)
    String phone; // 연락처 (ex. 01099999999)
    String message; // 사용자 메세지 (ex. 1층에서 연락주세요)
    String visitTime; // 방문(픽업) 예약 시간 - YYYYMMDDHH24MISS (ex. 20171205134850)
    /* 배달 주문 추가 정보 */
    String landAddr; // 지번 주소 (ex. 서울특별시 금천구 가산동 60-25 에이스하이엔드타워6차)
    String landAddrDetail; // 지번 주소 상세 (ex. 604호)
    String loadAddr; // 도로명 주소 (ex. 서울특별시 금천구 벚꽃로 234(가산동))
    String loadAddrDetail; // 도로명 주소 상세 (ex. 604호)
    /* 픽업 주문 추가 정보 */
    String pickupMinute; // 픽업 예상 시간(분) (ex. 30)
    /* 예약 주문 추가 정보 */
    String visitCustomerCount; // 방문 고객 수 (ex. 5)
}
