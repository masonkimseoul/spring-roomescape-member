package roomescape.dto;

import roomescape.domain.Member;

public record MemberResponse(Long id, String name) {
    public static MemberResponse from(Member member) {
        return new MemberResponse(
                member.getId(),
                member.getName().getValue()
        );
    }

    public static MemberResponse from(LoginMember loginMember) {
        return new MemberResponse(
                loginMember.id(),
                loginMember.name()
        );
    }
}
