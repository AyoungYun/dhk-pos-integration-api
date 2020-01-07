package request.api.external.order.create;

/**
 * [REQUEST]
 * USE
 *  - CreateOrder - Prod (주문(결제) 등록)
 */

public class Option {

    private String optionCd; // 속성 코드 (ex. A01001)
    private String optionNm; // 속성명 (ex. 맵게)

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
