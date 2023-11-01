package Spring2022.Final.Six.AOr;

import java.util.ArrayList;
import java.util.Collections;

public class MyCollection {
    public static void main(String[] args) {
        ArrayList<Device> myDevices = new ArrayList<>();

        myDevices.add(new Device("Samsung Galaxy Tab", "Tablet", 10600));
        myDevices.add(new Device("HUAWEI Mate 40 Pro", "Smart Phone", 88000));
        myDevices.add(new Device("HP 250 G8 Core i3 11th Gen", "Laptop",64000));

        for(Device d: myDevices)
            d.display();

        Collections.sort(myDevices); // Sort by Price

        for(Device d: myDevices)
            d.display();
    }
}
