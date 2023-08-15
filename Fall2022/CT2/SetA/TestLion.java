package Fall2022.CT2.SetA;

public class TestLion {
    public static void main(String[] args) {
        Lion myLion = new Lion("Royal Bengal Tiger", "Golden", 200);

        myLion.hunt("deer");

        myLion.display();
    }
}

/*
 * Output:
 * Royal Bengal Tiger like to hunt deer.
 * Species: Royal Bengal Tiger
 * Color: Golden
 * Weight: 200.0
 */