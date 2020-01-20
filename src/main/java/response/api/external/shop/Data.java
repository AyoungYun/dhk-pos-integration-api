package response.api.external.shop;

/**
 * [RESPONSE]
 * USE
 *  - GetShopInfo (매장 정보 조회)
 */

public class Data {

    private final String shopCd; // 매장 코드 (ex. DT0017)
    private final String shopNm; // 매장 이름 (ex. JS컴퍼니)
    private final String ownerNm; // 대표자명 (ex. 박지성)
    private final String bizNo; // 사업자 번호 (ex. 2148814829)
    private final String bizTypeNm; // 업태명 (ex. 요식업)
    private final String bizKindNm; // 종목명 (ex. 카페)
    private final String bizShopNm; // 상호명 (ex. JS컴퍼니)
    private final String telNo; // 전화번호 (ex. 02-7450-3592)
    private final String hpNo; // 휴대폰 번호 (ex. null)
    private final String faxNo; // 팩스 번호 (ex. null)
    private final String emailAddr; // 이메일 주소 (ex. null)
    private final String postNo; // 우편번호 (ex. 08513)
    private final String addr; // 주소 (ex. 서울 금천구 벚꽃로 234 (가산동, 에이스하이엔드타워6차))
    private final String addrDtl; // 상세 주소 (ex. 604호)
    private final String useYn; // 매장 상태 구분 (ex. Y)

    public Data(String shopCd, String shopNm, String ownerNm, String bizNo, String bizTypeNm, String bizKindNm,
                String bizShopNm, String telNo, String hpNo, String faxNo, String emailAddr, String postNo, String addr,
                String addrDtl, String useYn) {
        this.shopCd = shopCd;
        this.shopNm = shopNm;
        this.ownerNm = ownerNm;
        this.bizNo = bizNo;
        this.bizTypeNm = bizTypeNm;
        this.bizKindNm = bizKindNm;
        this.bizShopNm = bizShopNm;
        this.telNo = telNo;
        this.hpNo = hpNo;
        this.faxNo = faxNo;
        this.emailAddr = emailAddr;
        this.postNo = postNo;
        this.addr = addr;
        this.addrDtl = addrDtl;
        this.useYn = useYn;
    }

    public String getShopCd() {
        return shopCd;
    }

    public String getShopNm() {
        return shopNm;
    }

    public String getOwnerNm() {
        return ownerNm;
    }

    public String getBizNo() {
        return bizNo;
    }

    public String getBizTypeNm() {
        return bizTypeNm;
    }

    public String getBizKindNm() {
        return bizKindNm;
    }

    public String getBizShopNm() {
        return bizShopNm;
    }

    public String getTelNo() {
        return telNo;
    }

    public String getHpNo() {
        return hpNo;
    }

    public String getFaxNo() {
        return faxNo;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public String getPostNo() {
        return postNo;
    }

    public String getAddr() {
        return addr;
    }

    public String getAddrDtl() {
        return addrDtl;
    }

    public String getUseYn() {
        return useYn;
    }
}
