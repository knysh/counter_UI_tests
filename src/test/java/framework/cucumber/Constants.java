package framework.cucumber;

public enum Constants {
    XPATH_START_POINT("//");

    private final String attribute;

    Constants(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return attribute;
    }
}
