package language.util;

public enum VariableType {
    T(-1, 4), S(-2, 2);

    private final int code;
    private final int baseSize;

    VariableType(final int code, final int baseSize) {
        this.code = code;
        this.baseSize = baseSize;
    }

    public int getCode() {
        return code;
    }

    public int getBaseSize() {
        return baseSize;
    }

    public static VariableType getType(int code) {
        for (VariableType variableType : values()) {
            if (variableType.code == code) {
                return variableType;
            }
        }
        throw new RuntimeException("No such code.");
    }
}
