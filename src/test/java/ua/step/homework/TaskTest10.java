package ua.step.homework;

import org.junit.Test;
import ua.step.BaseTest;
import ua.step.homework.Task10;

import static org.junit.Assert.assertTrue;


public class TaskTest10 extends BaseTest {

	@Test
	public void test() {
		Task10.main(null);
		String errorMessage = "Wrong result";
		assertTrue(errorMessage ,  outContent.toString().contains("232792560"));
	}
}
