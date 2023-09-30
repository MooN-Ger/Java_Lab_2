package ex7_ex11;

import java.util.Objects;

public class Payment {
    private String fullName;
    private int payment;
    private PaymentDate date;

    public Payment (String fullName, int payment, PaymentDate date) {
        this.fullName = fullName;
        this.payment = payment;
        this.date = date;
    }

    public Payment () {
        this.fullName = "Ivanov Ivan Ivanovich";
        this.payment = 0;
        this.date = new PaymentDate(1, 1, 2000);

    }

    public String getFullName() {
        return fullName;
    }

    public int getPayment() {
        return payment;
    }

    public PaymentDate getDate() { return date; }

    public void setFullName(String fullName) {
        if (fullName == null) throw new IllegalArgumentException("Name can't be null");
        this.fullName = fullName;
    }

    public void setPayment(int payment) {
        if (payment < 0) throw new IllegalArgumentException("Payment can't be < 0");
        this.payment = payment;
    }

    public void setDate(PaymentDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment that = (Payment) o;

        if (getPayment() != that.getPayment()) {
            return false;
        }

        return PaymentDate.getEqualsDate(getDate(), that.getDate()) &&
                getFullName().equals(that.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, payment, date);
    }

    @Override
    public String toString() {
        return "Payment {"
                + "fullName: '" + fullName + '\''
                + ", payment: " + payment
                + ", date: " + date
                + '}';
    }
}
