package com.deliveryhero.okpos.response.api.external.shop;

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

    public Data(DataBuilder builder) {
        this.shopCd = builder.shopCd;
        this.shopNm = builder.shopNm;
        this.ownerNm = builder.ownerNm;
        this.bizNo = builder.bizNo;
        this.bizTypeNm = builder.bizTypeNm;
        this.bizKindNm = builder.bizKindNm;
        this.bizShopNm = builder.bizShopNm;
        this.telNo = builder.telNo;
        this.hpNo = builder.hpNo;
        this.faxNo = builder.faxNo;
        this.emailAddr = builder.emailAddr;
        this.postNo = builder.postNo;
        this.addr = builder.addr;
        this.addrDtl = builder.addrDtl;
        this.useYn = builder.useYn;
    }

    public static final class DataBuilder {
        private String shopCd;
        private String shopNm;
        private String ownerNm;
        private String bizNo;
        private String bizTypeNm;
        private String bizKindNm;
        private String bizShopNm;
        private String telNo;
        private String hpNo;
        private String faxNo;
        private String emailAddr;
        private String postNo;
        private String addr;
        private String addrDtl;
        private String useYn;

        public DataBuilder withShopCd(String shopCd) {
            this.shopCd = shopCd;
            return this;
        }

        public DataBuilder withShopNm(String shopNm) {
            this.shopNm = shopNm;
            return this;
        }

        public DataBuilder withOwnerNm(String ownerNm) {
            this.ownerNm = ownerNm;
            return this;
        }

        public DataBuilder withBizNo(String bizNo) {
            this.bizNo = bizNo;
            return this;
        }

        public DataBuilder withBizTypeNm(String bizTypeNm) {
            this.bizTypeNm = bizTypeNm;
            return this;
        }

        public DataBuilder withBizKindNm(String bizKindNm) {
            this.bizKindNm = bizKindNm;
            return this;
        }

        public DataBuilder withBizShopNm(String bizShopNm) {
            this.bizShopNm = bizShopNm;
            return this;
        }

        public DataBuilder withTelNo(String telNo) {
            this.telNo = telNo;
            return this;
        }

        public DataBuilder withHpNo(String hpNo) {
            this.hpNo = hpNo;
            return this;
        }

        public DataBuilder withFaxNo(String faxNo) {
            this.faxNo = faxNo;
            return this;
        }

        public DataBuilder withEmailAddr(String emailAddr) {
            this.emailAddr = emailAddr;
            return this;
        }

        public DataBuilder withPostNo(String postNo) {
            this.postNo = postNo;
            return this;
        }

        public DataBuilder withAddr(String addr) {
            this.addr = addr;
            return this;
        }

        public DataBuilder withAddrDtl(String addrDtl) {
            this.addrDtl = addrDtl;
            return this;
        }

        public DataBuilder withUseYn(String useYn) {
            this.useYn = useYn;
            return this;
        }

        public Data build() {
            return new Data(this);
        }
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
