package com.defrimhsn.regula;

public record RuleValidationResponse<T>(Rule<T> rule,
                                        ValidationStatus status,
                                        Throwable throwable) {

    public RuleValidationResponse(Rule<T> rule, ValidationStatus status) {
        this(rule, status, null);
    }

    public boolean isPassed() {
        return ValidationStatus.PASSED == status;
    }

    public boolean isFailed() {
        return ValidationStatus.FAILED == status;
    }

    public static <T> RuleValidationResponse<T> rulePassed(Rule<T> rule) {
        return new RuleValidationResponse<>(rule, ValidationStatus.PASSED);
    }

    public static <T> RuleValidationResponse<T> ruleFailed(Rule<T> rule) {
        return new RuleValidationResponse<>(rule, ValidationStatus.FAILED);
    }
}
