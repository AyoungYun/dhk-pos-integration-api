package com.deliveryhero.okpos.request.api.oauth.token;

/**
 * [REQUEST]
 * Title: TOKEN 발급 (제휴사)
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/oauth/token
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 제휴사에 발급한 아이디와 비밀번호로 API 연동을 위한 접속 토큰을 발급받습니다. (외부에 유출이 되지 않도록 주의)
 *               만료 시간이 지났거나 또는 유효하지 않은 토큰일 경우 재발급 액션이 필요합니다.
 */

public class IssueToken {

    private final String grant_type; // 인증방식 - 고정값 (client_credentials)
    private final String client_id; // 제휴사 발급 아이디 (ex. apiclient)
    private final String client_secret; // 제휴사 발급 비밀번호 (ex. apisecret)

    public IssueToken(String grant_type, String client_id, String client_secret) {
        this.grant_type = grant_type;
        this.client_id = client_id;
        this.client_secret = client_secret;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public String getClient_id() {
        return client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }
}
