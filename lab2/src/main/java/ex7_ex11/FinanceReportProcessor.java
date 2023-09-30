package ex7_ex11;

import java.util.ArrayList;

public class FinanceReportProcessor {
    public static FinanceReport firstSymbolName(char symbol, FinanceReport finRep) {
        ArrayList<Payment> arrList = new ArrayList<Payment>();
        for (int i = 0; i < finRep.getCountOfArrPayment(); i++) {
            if (symbol == finRep.getPayment(i).getFullName().charAt(0)) {
                arrList.add(finRep.getPayment(i));
            }
        }
        return new FinanceReport(finRep.getCreatorName(), finRep.getReportDate(), arrList.toArray(new Payment[0]));
    }

    public static FinanceReport paymentLimit(int limit, FinanceReport finRep) {
        ArrayList<Payment> arrList = new ArrayList<Payment>();
        for (int i = 0; i < finRep.getCountOfArrPayment(); i++) {
            if (finRep.getPayment(i).getPayment() < limit) {
                arrList.add(finRep.getPayment(i));
            }
        }
        return new FinanceReport(finRep.getCreatorName(), finRep.getReportDate(), arrList.toArray(new Payment[0]));
    }
}
