public class Computer {
    double price;
    String model;
    Ram ram;
    Hdd hdd;

    Computer(double price, String model){
        this.price = price;
        this.model = model;
        this.ram = new Ram();
        this.hdd = new Hdd();
    }

    Computer(double price, String model, Ram ram, Hdd hdd){
        this.model = model;
        this.price = price;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public String toString(){
        return "Computer{" +
                "model='" + model + '/' +
                ", price=" + price +
                ", ram=" + ram.toString() +
                ", hdd" + hdd.toString() +
                '}';
    }

    public static void main(String[] args){
        Computer computer1 = new Computer(2000, "Lenovo");
        System.out.println(computer1);
        Ram ram = new Ram("DDR5", 16);
        Hdd hdd = new Hdd("Samsung",512,"Внутренний");
        Computer computer2 = new Computer(3000, "Honor",ram, hdd);
        System.out.println(computer2);
    }

}
class Ram{
    String name;
    int capacity;
    Ram(){
        this.name = "DDR4";
        this.capacity = 8;
    }
    Ram(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    @Override
    public String toString(){
        return "Ram{" +
                "name='" + name + '/' +
                ", capacity=" + capacity +
                '}';
    }

}
class Hdd{
    String name;
    int capacity;
    String type;

    Hdd(){
        this.name = "TOSHIBA";
        this.capacity = 1024;
        this.type = "Внешний";
    }


    Hdd(String name, int capacity, String type){
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }
    @Override
    public String toString(){
        return "Hdd{" +
                "name='" + name + '/' +
                ", capacity=" + capacity +'/' +
                ", type =" + type +'/' +
                '}';
    }
}
