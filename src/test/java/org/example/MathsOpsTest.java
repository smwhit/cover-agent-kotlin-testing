package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathsOpsTest {


@Test
public void test_sub_two_positive_integers() {
    MathsOps mathsOps = new MathsOps();
    int result = mathsOps.sub(10, 5);
    assertEquals(5, result);
}

@Test
public void test_add_two_positive_integers() {
    MathsOps mathsOps = new MathsOps();
    int result = mathsOps.add(5, 10);
    assertEquals(15, result);
}

}
