package racingcar.global;

public enum GeneralMessage {
    ASK_CAR_NAMES("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

    private final String message;

    GeneralMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
