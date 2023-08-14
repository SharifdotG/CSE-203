package Fall2022.CT2.SetE;

public class Zoo {
    public static void main(String[] args) {
        Shark shark = new Shark("Whale Shark", "gray and white", 1128);

        shark.hunt("fish",8);

        shark.display();
    }
}

/*
 * Output:
 * Whale Shark like to hunt fish.
 * Species: Whale Shark
 * Color: gray and white
 * Weight: 1136.0
 */