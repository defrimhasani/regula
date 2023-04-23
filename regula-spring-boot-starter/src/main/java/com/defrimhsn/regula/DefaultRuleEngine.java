package com.defrimhsn.regula;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class DefaultRuleEngine implements RuleEngine {

    private final ApplicationContext context;

    public DefaultRuleEngine(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public <T> void validate(T data) {

    }
}
