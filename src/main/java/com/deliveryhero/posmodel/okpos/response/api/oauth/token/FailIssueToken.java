package com.deliveryhero.posmodel.okpos.response.api.oauth.token;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [FAIL RESPONSE]
 * Title: TOKEN 발급 (제휴사) {Sheet.10}
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/oauth/token
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 제휴사에 발급한 아이디와 비밀번호로 API 연동을 위한 접속 토큰을 발급받습니다. (외부에 유출이 되지 않도록 주의)
 *               만료 시간이 지났거나 또는 유효하지 않은 토큰일 경우 재발급 액션이 필요합니다.
 */

public class FailIssueToken {

    private final String error; // (ex. invalid_client)
    @JsonProperty("error_description")
    private final String errorDescription; // (ex. Bad client credentials)

    public FailIssueToken(String error, String errorDescription) {
        this.error = error;
        this.errorDescription = errorDescription;
    }

    public String getError() {
        return error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }
}
