package Spring2023.Assignment2.Question4;

import java.io.*;

public class WrestlerSerialization {
    public static void main(String[] args) {
        Wrestler w1 = new Wrestler("John Cena", 46, "Attitude Adjustment");
        Wrestler w2 = new Wrestler("The Rock", 51, "Rock Bottom");

        // Serializing Wrestler objects and saving to data_ser.txt
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Programming\\VSCode\\CSE 203 CT Solve\\Spring2023\\Assignment2\\Question4\\data_ser.txt"));
            
            oos.writeObject(w1);
            oos.writeObject(w2);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserializing Wrestler objects from data_ser.txt
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Programming\\JetBrains\\CSE203Assignment2\\src\\Question4\\data_ser.txt"));
            
            Wrestler w3 = (Wrestler) ois.readObject();
            Wrestler w4 = (Wrestler) ois.readObject();

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
