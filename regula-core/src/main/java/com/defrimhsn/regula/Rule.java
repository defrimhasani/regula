package com.defrimhsn.regula;

public interface Rule<T> {

    String description();

    boolean supported(T data);

    RuleValidationResponse<T> validate(T data);
}
