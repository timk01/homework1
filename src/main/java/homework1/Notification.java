package main.java.homework1;

public enum Notification {
    RECEIVED("получено"),
    APPROVED("одобрено"),
    OPENED("открыто"),
    CLOSED("закрыто");

    private final String conditionInRus;

    Notification(String conditionInRus) {
        this.conditionInRus = conditionInRus;
    }

    public String getConditionInRus() {
        return conditionInRus;
    }
}
