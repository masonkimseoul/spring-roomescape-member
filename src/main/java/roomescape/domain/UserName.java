package roomescape.domain;

public class UserName {

    private static final String NAME_FORMAT = "^[a-zA-Z가-힣ㄱ-ㅎ0-9]*$";

    public UserName(String userName) {
        validate(userName);
        this.userName = userName;
    }

    private final String userName;

    private void validate(String userName) {
        if (userName.isBlank()) {
            throw new IllegalArgumentException("예약자명이 입력되지 않았습니다. 1글자 이상 20글자 이하로 입력해주세요.");
        }
        if (userName.length() > 20) {
            throw new IllegalArgumentException(userName + "은 유효하지 않은 예약자명입니다. 20글자 이하로 입력해주세요.");
        }
        if (!userName.matches(NAME_FORMAT)) {
            throw new IllegalArgumentException(userName + "은 유효하지 않은 예약자명입니다. 한글, 영문, 숫자로만 입력해주세요.");
        }
    }

    public String getUserName() {
        return userName;
    }
}
