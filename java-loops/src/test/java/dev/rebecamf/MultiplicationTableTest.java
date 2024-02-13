package dev.rebecamf;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import dev.rebecamf.loops.MultiplicationTable;

public class MultiplicationTableTest {


    @Test

    public void testGenerateTable() {
        int n =  9;
        int[] expected = {9,  18,  27,  36,  45,  54,  63,  72,  81,  90};
        int[] result = MultiplicationTable.generateTable(n);
        assertArrayEquals(expected, result, "The generated table does not match the expected values");
    }
}
