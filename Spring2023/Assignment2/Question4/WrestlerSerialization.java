package Spring2023.Assignment2.Question4;

import java.io.*;
import java.util.ArrayList;

public class WrestlerSerialization {
    public static void main(String[] args) {
        ArrayList<Wrestler> wrestlers = new ArrayList<>();
        wrestlers.add(new Wrestler("John Cena", 46, "Attitude Adjustment"));
        wrestlers.add(new Wrestler("The Rock", 51, "Rock Bottom"));

        // Serializing Wrestler objects and saving to data_ser.txt
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Programming\\JetBrains\\CSE203Assignment2\\src\\Question4\\data_ser.txt"))) {
            oos.writeObject(wrestlers);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Deserializing Wrestler objects from data_ser.txt
        ArrayList<Wrestler> deserializedWrestlers = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Programming\\JetBrains\\CSE203Assignment2\\src\\Question4\\data_ser.txt"))) {
            deserializedWrestlers = (ArrayList<Wrestler>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Wrestler wrestler : deserializedWrestlers) {
            System.out.println(wrestler);
        }
    }
}
