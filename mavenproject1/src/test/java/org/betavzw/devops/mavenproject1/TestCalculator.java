/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.betavzw.devops.mavenproject1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Jef
 */
public class TestCalculator {

    @Test
    public final void testAdd() {
        int getal1 = 1;
        int getal2 = 1;
        int expected = 2;
        Calculator calc = new CalculatorImpl();
        int som = calc.add(getal1, getal2);
        assertEquals(expected, som);
    }

}
