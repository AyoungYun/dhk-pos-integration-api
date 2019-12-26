package request.api.callback;

/**
 * [REQUEST]
 * Title: 주문 상태 Notify
 * Direction: OKPOS(DumAPI) -> 제휴사
 * Method: POST
 * URL: 예) https://www.partner.co.kr/api/callback
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 주문 상태가 갱신이 되면 제휴사에 통지해 줍니다. (제휴사에서 콜백 URL 전달)
 */

public class OrderStatusNotify {

    String shopCd; // 매장 코드 (ex. DT0017)
    String mobileOrderNo; // 모바일 주문 번호 (ex. 99999999999999)
    String stepCd; // 스탭 코드 (ex. 100)
    String orderStatus; // 주문 상태 (ex. accepted)
    String notiMsg; // 고객에게 보여 줄 메세지 (ex. 접수가 되었습니다. 배송 예상 시간은 17시 50분 입니다.)
    String deliveryTime; // 배송 예상 시간 - 접수 시간부터 기본 50분 (ex. 17:50)
}
