package Spring2022.Final.Three.AB;

public class Zoo {
    public static void main(String[] args) {
        Alligator alligtr = new Alligator(11.6, 22, "Black");

        alligtr.incubateEgg(28);

        System.out.println(alligtr);
    }
}
