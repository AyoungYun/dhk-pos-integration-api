package com.deliveryhero.posmodel.okpos.response.api.external.product;

/**
 * [RESPONSE]
 * Title: 상품 정보 조회 (단품) {Sheet.14}
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: GET
 * URL: /api/external/product/{shopCd}/{prodCd}
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 입력한 상품 코드의 대한 상품 정보를 조회합니다.
 */

public class GetProdInfo {

    private final String resultCode; // 성공 결과 코드 (ex. 000)
    private final String resultMsg; // 결과 메세지 (ex. success)
    private final GetProdInfoData data;

    public GetProdInfo(String resultCode, String resultMsg, GetProdInfoData data) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.data = data;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public GetProdInfoData getData() {
        return data;
    }
}
