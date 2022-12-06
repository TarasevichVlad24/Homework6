public class CreditCard {
    String accountNumber;
    double sum;

    CreditCard(String accountNumber, double sum) {
        this.accountNumber = accountNumber;
        this.sum = sum;
    }

    public void takeOff(double sum) {
        this.sum -= sum;
    }

    public void put(double sum) {
        this.sum += sum;
    }

    @Override
    public String toString() {
        return "CreditCard{" + "accountNumber='" + accountNumber + '/' + ", sum=" + sum + '}';
    }

    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("ABC454545ALFA1", 1000);
        CreditCard creditCard2 = new CreditCard("ABC454545ALFA2", 1500);
        CreditCard creditCard3 = new CreditCard("ABC454545ALFA3", 2500);

        System.out.println(creditCard1);
        System.out.println(creditCard2);
        System.out.println(creditCard3);

        creditCard1.put(500.35);
        creditCard2.put(1350.50);
        creditCard3.takeOff(2200.12);

        System.out.println("После выполнения операций");

        System.out.println(creditCard1);
        System.out.println(creditCard2);
        System.out.println(creditCard3);


    }

}

