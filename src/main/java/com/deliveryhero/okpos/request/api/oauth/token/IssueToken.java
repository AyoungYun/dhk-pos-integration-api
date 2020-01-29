package com.deliveryhero.okpos.request.api.oauth.token;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [REQUEST]
 * Title: TOKEN 발급 (제휴사) {Sheet.10}
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/oauth/token
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 제휴사에 발급한 아이디와 비밀번호로 API 연동을 위한 접속 토큰을 발급받습니다. (외부에 유출이 되지 않도록 주의)
 *               만료 시간이 지났거나 또는 유효하지 않은 토큰일 경우 재발급 액션이 필요합니다.
 */

public class IssueToken {

    @JsonProperty("grant_type")
    private final String grantType; // 인증방식 - 고정값 (client_credentials)
    @JsonProperty("client_id")
    private final String clientID; // 제휴사 발급 아이디 (ex. apiclient)
    @JsonProperty("client_secret")
    private final String clientSecret; // 제휴사 발급 비밀번호 (ex. apisecret)

    public IssueToken(String grantType, String clientID, String clientSecret) {
        this.grantType = grantType;
        this.clientID = clientID;
        this.clientSecret = clientSecret;
    }

    public String getGrantType() {
        return grantType;
    }

    public String getClientID() {
        return clientID;
    }

    public String getClientSecret() {
        return clientSecret;
    }
}
