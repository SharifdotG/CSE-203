package Spring2023.CT1.SecB.Set2;

public class Two {
    public static void main(String[] args) {
        int data = 11;
        int a = 28;
        int data2 = data%3 * ++a;
        System.out.println(data2--);
        int data3 = data2 / a;
        System.out.println(data3);
    }
}

/*
 * Answer:
 * Output:
 * 58
 * 1
 */