package ex1_ex4;

import ex1_ex4.StringProcessor;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class StringProcessorTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void string_clone_Test() {
        assertEquals("AbAbAb", StringProcessor.string_clone(3, "Ab"));
    }

    @Test
    public void string_clone_expTest() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("String can`t be null");
        StringProcessor.string_clone(4,null);
    }

    @Test
    public void string_clone_N_expTest() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("N can't be < 0");
        StringProcessor.string_clone(-1, "Hello");
    }

    @Test
    public void NumberOfInputs_Test() {
        assertEquals(3, StringProcessor.NumberOfInputs("AbAbAb", "Ab"));
    }

    @Test
    public void NumberOfInputs_Null_expTest() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("str2 can't be null");
        StringProcessor.NumberOfInputs("AbAbAb", null);
    }

    @Test
    public void NumberOfInputs_Empty_expTest() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("str2 can't be empty");
        StringProcessor.NumberOfInputs("AbAbAb", "");
    }

    @Test
    public void num_swap_Test1() {
        assertEquals("onetwothree", StringProcessor.num_swap("123"));
    }

    @Test
    public void num_swap_Test2() {
        assertEquals("onetwo", StringProcessor.num_swap("12"));
    }

    @Test
    public void num_swap_Test3() {
        assertEquals("456", StringProcessor.num_swap("456"));
    }

    @Test
    public void num_swap_Null_expTest() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("String can't be null");
        StringProcessor.num_swap(null);
    }

    @Test
    public void num_swap_Empty_expTest() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("String can't be empty");
        StringProcessor.num_swap("");
    }

    @Test
    public void SecondCharDel_Test1() {
        assertEquals("A", StringProcessor.SecondCharDel("Ab"));
    }

    @Test
    public void SecondCharDel_Test2() {
        assertEquals("AAA", StringProcessor.SecondCharDel("AbAbAb"));
    }

    @Test
    public void SecondCharDel_Test3() {
        assertEquals("AAAA", StringProcessor.SecondCharDel("AbAbAbA"));
    }

    @Test
    public void SecondCharDel_Null_expTest() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("String can't be null");
        StringProcessor.SecondCharDel(null);
    }

    @Test
    public void SecondCharDel_Empty_expTest() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("String can't be empty");
        StringProcessor.SecondCharDel("");
    }
}