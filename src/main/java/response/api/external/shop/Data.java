package response.api.external.shop;

/**
 * [RESPONSE]
 * USE
 *  - GetShopInfo (매장 정보 조회)
 */

public class Data {

    private String shopCd; // 매장 코드 (ex. DT0017)
    private String shopNm; // 매장 이름 (ex. JS컴퍼니)
    private String ownerNm; // 대표자명 (ex. 박지성)
    private String bizNo; // 사업자 번호 (ex. 2148814829)
    private String bizTypeNm; // 업태명 (ex. 요식업)
    private String bizKindNm; // 종목명 (ex. 카페)
    private String bizShopNm; // 상호명 (ex. JS컴퍼니)
    private String telNo; // 전화번호 (ex. 02-7450-3592)
    private String hpNo; // 휴대폰 번호 (ex. null)
    private String faxNo; // 팩스 번호 (ex. null)
    private String emailAddr; // 이메일 주소 (ex. null)
    private String postNo; // 우편번호 (ex. 08513)
    private String addr; // 주소 (ex. 서울 금천구 벚꽃로 234 (가산동, 에이스하이엔드타워6차))
    private String addrDtl; // 상세 주소 (ex. 604호)
    private String useYn; // 매장 상태 구분 (ex. Y)

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
