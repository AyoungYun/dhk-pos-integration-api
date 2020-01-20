package request.api.external.order.check;

/**
 * [REQUEST]
 * USE
 *  - CheckOrderProd - Prod (주문 상품 확인)
 */

public class Option {

    private final String optionCd; // 속성 코드 (ex. A01001)
    private final String optionNm; // 속성명 - 선택: 값이 없으면 상품명 일치 여부 체크 안함 (ex. 맵게)

    public Option(String optionCd, String optionNm) {
        this.optionCd = optionCd;
        this.optionNm = optionNm;
    }

    public String getOptionCd() {
        return optionCd;
    }

    public String getOptionNm() {
        return optionNm;
    }
}
