package ex7_ex11;

public class FinanceReport {
    private String creatorName;
    private PaymentDate reportDate;
    private final Payment[] arrPayment;

    public FinanceReport ()  {
        this.creatorName = "Ivanov Ivan Ivanovich";
        this.reportDate = new PaymentDate(1,1,2000);
        this.arrPayment = new Payment[0];
    }

    public FinanceReport (String creatorName, PaymentDate reportDate, Payment[] arrPayment) {
        this.creatorName = creatorName;
        this.reportDate = reportDate;
        this.arrPayment = new Payment[arrPayment.length];
        for (int i = 0; i < arrPayment.length; i++) {
            this.arrPayment[i] = arrPayment[i];
        }
    }

    public String getCreatorName() {
        return creatorName;
    }
    public PaymentDate getReportDate() {
        return reportDate;
    }
    public int getCountOfArrPayment() {
        return arrPayment.length;
    }
    public Payment getPayment(int size) {
        if ((size < 0) || (size >= getCountOfArrPayment())) { throw new IllegalArgumentException("size is out of array"); }
        return this.arrPayment[size];
    }

    public void setCreatorName(String creatorName) {
        if (creatorName == null) throw new IllegalArgumentException("Name can't be null");
        this.creatorName = creatorName;
    }

    public void setReportDate(PaymentDate reportDate) {
        this.reportDate = reportDate;
    }

    public void setPayment(Payment new_payment, int size) {
        if ((size < 0) || (size >= getCountOfArrPayment())) { throw new IllegalArgumentException("size is out of array"); }
        this.arrPayment[size] = new_payment;
    }

    @Override
    public String toString() {
        String report = String.format("Author: %s, Date: %s, Payments: [\n", creatorName, reportDate.toString());
        for (int i = 0; i < this.arrPayment.length; i++) {
            report += String.format("Payer: %s, Date: %s, Sum: %d rub., %d kop.\n", this.arrPayment[i].getFullName(), this.arrPayment[i].getDate().toString(), this.arrPayment[i].getPayment()/100, this.arrPayment[i].getPayment()%100);
        }
        report += "]";
        return report;
    }

    public FinanceReport (FinanceReport finRep) {
        this.creatorName = finRep.getCreatorName();
        this.reportDate = new PaymentDate(finRep.getReportDate().getDay(), finRep.getReportDate().getMonth(), finRep.getReportDate().getYear());
        this.arrPayment = new Payment[finRep.getCountOfArrPayment()];
        for (int i = 0; i < this.arrPayment.length; i++) {
            this.arrPayment[i] = finRep.getPayment(i);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        FinanceReport that = (FinanceReport) o;

        if ((getCreatorName().equals(that.getCreatorName())) && (PaymentDate.getEqualsDate(getReportDate(), that.getReportDate())) && (arrPayment.length == that.getCountOfArrPayment())) {
            for (int i = 0; i < arrPayment.length; i++) {
                if (arrPayment[i].equals(that.getPayment(i))) return false;
            }
        } else return false;
        return true;
    }
}
