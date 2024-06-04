package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
        @Test
        public void testMin() {
            int[] numbers = {4, 7, 2, 9, 1};
            assertEquals(1, NumberOperations._min(numbers));
        }

        @Test
        public void testMax() {
            int[] numbers = {4, 7, 2, 9, 1};
            assertEquals(9, NumberOperations._max(numbers));
        }

        @Test
        public void testSum() {
            int[] numbers = {4, 7, 2, 9, 1};
            assertEquals(23, NumberOperations._sum(numbers));
        }

        @Test
        public void testMult() {
            int[] numbers = {4, 7, 2};
            assertEquals(56, NumberOperations._mult(numbers));
        }

}
