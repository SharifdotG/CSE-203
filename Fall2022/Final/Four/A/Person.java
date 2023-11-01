package Fall2022.Final.Four.A;

public class Person {
    String name, phoneNo;

    public Person(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public int findMagicNumber(int id) {
        int index = id % 11;
        char d = phoneNo.charAt(index);
        int digit = Integer.parseInt("" + d);
        return 2 * digit;
    }
}
