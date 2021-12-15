package ua.step.homework;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import ua.step.BaseTest;
import ua.step.homework.Task04;


public class TaskTest04 extends BaseTest {
    @Test
    public void test() {
        Task04.main(null);
        String errorMessage = "Wrong result";
        assertTrue(errorMessage, outContent.toString().startsWith("6 28 496 8128"));
    }
}
