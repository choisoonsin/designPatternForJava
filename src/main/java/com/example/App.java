package com.example;

import com.example.template.Tea;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        Tea tea = new Tea();
        tea.prepareRecipe();
        
    }
}
