public class Bankomat {
    int banknote20;
    int banknote50;
    int banknote100;
    int num20;
    int num50;
    int num100;
    int sum;

    Bankomat(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
        sum = this.setSum();
    }




    public boolean takeMoney(int money) {
        if(money>this.sum){
            return false;
        }
        int numSum;
        boolean isSucces = false;
        int minCount = 999999;
        for (int i = 0; i <= this.banknote20; i++) {
            for (int j = 0; j <= this.banknote50; j++) {
                for (int k = 0;k <= this.banknote100; k++){
                    numSum = i * 20 + j * 50 + k * 100;
                    if (numSum == money) {
                        if (minCount > i + j + k) {
                            minCount = i + j + k;
                            this.num20 = i;
                            this.num50 = j;
                            this.num100 = k;
                        }
                        isSucces = true;
                    }
                }
            }
        }
        if (isSucces) {
            this.banknote20 -= this.num20;
            this.banknote50 -= this.num50;
            this.banknote100 -= this.num100;
        }
        return isSucces;

    }

    private int setSum(){
        return 20*this.banknote20 + 50 * this.banknote50 + 100* this.banknote100;
    }


    public static void main(String[] args) {
        Bankomat ATM = new Bankomat(10, 20, 30);
        if(ATM.takeMoney(4200)){
            System.out.println("Успех");
            System.out.println("Купюры в 20 - "+ ATM.num20);
            System.out.println("Купюры в 50 - "+ ATM.num50);
            System.out.println("Купюры в 100 - "+ ATM.num100);
        }else{
            System.out.println("Нет суммы");
        }

    }
}
