package ex7_ex11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FinanceReportProcessorTest {
    @Test
    public void testFirstSymbolName() {
        int size = 3;
        FinanceReport finRep1 = new FinanceReport("Kravtsov German Ruslanovich", new PaymentDate(21, 3, 2023), new Payment[size]);
        finRep1.setPayment(new Payment("Petrov Petor Petrovich", 110, new PaymentDate(20,2,2022)), 0);
        finRep1.setPayment(new Payment("Vasiliev Vasia Vasilievich", 90, new PaymentDate(19,7,2003)), 1);
        finRep1.setPayment(new Payment("Pirojkov Artur Vladimirovich", 999, new PaymentDate(15,5,2022)), 2);

        assertEquals("Author: Kravtsov German Ruslanovich, Date: 21.3.2023, Payments: [\n" +
                "Payer: Petrov Petor Petrovich, Date: 20.2.2022, Sum: 1 rub., 10 kop.\n" +
                "Payer: Pirojkov Artur Vladimirovich, Date: 15.5.2022, Sum: 9 rub., 99 kop.\n" +
                "]", FinanceReportProcessor.firstSymbolName('P', finRep1).toString());
    }

    @Test
    public void testPaymentLimit() {
        int size = 3;
        FinanceReport finRep1 = new FinanceReport("Kravtsov German Ruslanovich", new PaymentDate(21, 3, 2023), new Payment[size]);
        finRep1.setPayment(new Payment("Petrov Petor Petrovich", 110, new PaymentDate(20,2,2022)), 0);
        finRep1.setPayment(new Payment("Vasiliev Vasia Vasilievich", 90, new PaymentDate(19,7,2003)), 1);
        finRep1.setPayment(new Payment("Pirojkov Artur Vladimirovich", 999, new PaymentDate(15,5,2022)), 2);

        assertEquals("Author: Kravtsov German Ruslanovich, Date: 21.3.2023, Payments: [\n" +
                "Payer: Petrov Petor Petrovich, Date: 20.2.2022, Sum: 1 rub., 10 kop.\n" +
                "Payer: Vasiliev Vasia Vasilievich, Date: 19.7.2003, Sum: 0 rub., 90 kop.\n" +
                "]", FinanceReportProcessor.paymentLimit(200, finRep1).toString());
    }
}
