package com.deliveryhero.okpos.response.api.oauth.token;

/**
 * [SUCCESS RESPONSE]
 * Title: TOKEN 발급 (제휴사)
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/oauth/token
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 제휴사에 발급한 아이디와 비밀번호로 API 연동을 위한 접속 토큰을 발급받습니다. (외부에 유출이 되지 않도록 주의)
 *               만료 시간이 지났거나 또는 유효하지 않은 토큰일 경우 재발급 액션이 필요합니다.
 */

public class SuccessIssueToken {

    private final String access_token; // API 연동 접속 토큰 (ex. 5a72af0a-b21e-446f-9060-758bf048edfe)
    private final String token_type; // 토큰 유형 (ex. bearer)
    private final Integer expires_in; // 토큰 만료 (ex. 43199)
    private final String scope; // 토큰 범위 (ex. read write trust)

    public SuccessIssueToken(String access_token, String token_type, Integer expires_in, String scope) {
        this.access_token = access_token;
        this.token_type = token_type;
        this.expires_in = expires_in;
        this.scope = scope;
    }

    public String getAccess_token() {
        return access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public Integer getExpires_in() {
        return expires_in;
    }

    public String getScope() {
        return scope;
    }
}
