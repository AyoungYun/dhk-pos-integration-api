package response.api.external.shop;

/**
 * [RESPONSE]
 * USE
 *  - GetShopInfo (매장 정보 조회)
 */

public class Data {

    String shopCd; // 매장 코드 (ex. DT0017)
    String shopNm; // 매장 이름 (ex. JS컴퍼니)
    String ownerNm; // 대표자명 (ex. 박지성)
    String bizNo; // 사업자 번호 (ex. 2148814829)
    String bizTypeNm; // 업태명 (ex. 요식업)
    String bizKindNm; // 종목명 (ex. 카페)
    String bizShopNm; // 상호명 (ex. JS컴퍼니)
    String telNo; // 전화번호 (ex. 02-7450-3592)
    String hpNo; // 휴대폰 번호 (ex. null)
    String faxNo; // 팩스 번호 (ex. null)
    String emailAddr; // 이메일 주소 (ex. null)
    String postNo; // 우편번호 (ex. 08513)
    String addr; // 주소 (ex. 서울 금천구 벚꽃로 234 (가산동, 에이스하이엔드타워6차)
    String addrDtl; // 상세 주소 (ex. 604호)
    String useYn; // 매장 상태 구분 (ex. Y)
}
