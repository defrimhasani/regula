package com.defrimhsn.regula;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes ={
        DefaultRuleEngine.class, NameStartsWithA.class
})
class RegulaSpringBootStarterApplicationTests {

    @Autowired
    private RuleEngine ruleEngine;

    @Test
    void contextLoads() {

        ruleEngine.validate("Abc 1234");
    }

}
