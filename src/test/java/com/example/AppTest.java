package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.template.Tea;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void testAppTest() {

        Tea tea = new Tea();
        tea.prepareRecipe();

    }
    
}
