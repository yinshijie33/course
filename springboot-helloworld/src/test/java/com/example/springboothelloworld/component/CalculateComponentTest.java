package com.example.springboothelloworld.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author ysj
 * @create 2021-02-27 21:46
 */
@SpringBootTest
public class CalculateComponentTest {
    @Autowired
    private CalculateComponent calculateComponent;
    @Test
    public void test_add(){
        Assertions.assertEquals(2,calculateComponent.add(1,1));
    }
}
