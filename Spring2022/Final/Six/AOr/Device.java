package Spring2022.Final.Six.AOr;

public class Device implements Comparable<Device> {
    String name, category;
    int price;

    public Device(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public void display() {
        System.out.printf("%s:%s:%d\n", name, category, price);
    }

    @Override
    public int compareTo(Device otherDevice) {
        return Integer.compare(this.price, otherDevice.price);
    }
}
