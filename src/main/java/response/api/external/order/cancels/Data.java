package response.api.external.order.cancels;

/**
 * [RESPONSE]
 * USE
 *  - CancelOrder (주문(결제) 취소)
 */

public class Data {

    String shopCd; // 매장 코드 (ex. DT0017)
    String mobileOrderFg; // 모바일 주문 구분 - 03: 덤, 04: 요기요, 05: 더 페이 (ex. 05)
    String mobileOrderNo; // 모바일 주문 번호 (ex. 99999999999999)
    String mobileRegNo; // 모바일 주문 접수 번호 - 주문 취소 시 필요 (ex. 0001)
    String stepCd; // 스탭 코드 -
    // 000: 접수 대기, 100: 접수, 200: 조리중, 300: 픽업 준비,
    // 500: 배송 요청, 550: 배송중, 700: 완료, 900: 취소 (ex. 900)
    String stepNm; // 스탭명 (ex. 취소)
}
