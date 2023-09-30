package ex7_ex11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaymentTest {
    @Test
    public void testEquals1() {
        assertEquals(true, (new Payment("Ivanov Ivan Ivanovich", 777, new PaymentDate(1, 1, 2000))).equals(new Payment("Ivanov Ivan Ivanovich", 777, new PaymentDate(1, 1, 2000))));
    }

    @Test
    public void testEquals2() {
        assertEquals(false, (new Payment("Petrov Ivan Ivanovich", 777, new PaymentDate(1, 1, 2000))).equals(new Payment("Ivanov Ivan Ivanovich", 777, new PaymentDate(1, 1, 2000))));
    }

    @Test
    public void testEquals3() {
        assertEquals(false, (new Payment("Ivanov Ivan Ivanovich", 888, new PaymentDate(1, 1, 2000))).equals(new Payment("Ivanov Ivan Ivanovich", 777, new PaymentDate(1, 1, 2000))));
    }

    @Test
    public void testEquals4() {
        assertEquals(false, (new Payment("Ivanov Ivan Ivanovich", 777, new PaymentDate(2, 2, 2022))).equals(new Payment("Ivanov Ivan Ivanovich", 777, new PaymentDate(1, 1, 2000))));
    }

    @Test
    public void testToString() {
        Payment pay = new Payment();
        assertEquals("Payment {fullName: 'Ivanov Ivan Ivanovich', payment: 0, date: 1.1.2000}", pay.toString());

    }
}
