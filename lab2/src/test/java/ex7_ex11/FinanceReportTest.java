package ex7_ex11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FinanceReportTest {
    @Test
    public void testToString() {
        Payment testPay1 = new Payment();
        Payment testPay2 = new Payment("Petrov Petor Petrovich", 110, new PaymentDate(20,2,2022));
        Payment testPay3 = new Payment("Vasiliev Vasia Vasilievich", 90, new PaymentDate(19,7,2003));
        int size = 3;
        Payment[] testArr = new Payment[size];
        testArr[0] = testPay1;
        testArr[1] = testPay2;
        testArr[2] = testPay3;

        FinanceReport testRep = new FinanceReport("Kravtsov German Ruslanovich", new PaymentDate(21, 3, 2023), testArr);

        assertEquals("Author: Kravtsov German Ruslanovich, Date: 21.3.2023, Payments: [\n" +
                "Payer: Ivanov Ivan Ivanovich, Date: 1.1.2000, Sum: 0 rub., 0 kop.\n" +
                "Payer: Petrov Petor Petrovich, Date: 20.2.2022, Sum: 1 rub., 10 kop.\n" +
                "Payer: Vasiliev Vasia Vasilievich, Date: 19.7.2003, Sum: 0 rub., 90 kop.\n" +
                "]", testRep.toString());
    }

    @Test
    public void testCopy() {
        int arrSize = 3;
        FinanceReport finRep1 = new FinanceReport("Alexov Alex Alexandrovich", new PaymentDate(31,12,2022), new Payment[arrSize]);
        finRep1.setPayment(new Payment(), 0);
        finRep1.setPayment(new Payment("Petrov Petor Petrovich", 110, new PaymentDate(20,2,2022)), 1);
        finRep1.setPayment(new Payment("Vasiliev Vasia Vasilievich", 90, new PaymentDate(19,7,2003)), 2);

        FinanceReport finRep2 = new FinanceReport(finRep1);

        finRep2.setPayment(new Payment("Nikolaev Nikolai Nikolaevich", 999, new PaymentDate(15,5,2022)), 0);
        assertEquals(false, finRep1.equals(finRep2));
    }
}
