package gift.domain.member.kakao;

public record KakaoTokenResponse(
    String token_type,
    String access_token,
    Long expires_in,
    String refresh_token,
    Long refresh_token_expires_in
) {

}
