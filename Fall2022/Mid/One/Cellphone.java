package Fall2022.Mid.One;

public class Cellphone {
    public static void main(String[] args) {
        // Create an object of Electronics class
        Electronics myPhone = new Electronics("iPhone", "Black", 45);

        // Get the last 2 digits of your ID (replace '28' with your actual ID)
        int time = Integer.parseInt("28");

        // Call the running() method
        myPhone.running(time);

        // Call the showCharging() method
        myPhone.showCharging();
    }
}

