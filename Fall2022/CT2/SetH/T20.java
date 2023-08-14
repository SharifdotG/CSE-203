package Fall2022.CT2.SetH;

public class T20 {
    public static void main(String[] args) {
        Player player = new Player("Sharif Md. Yousuf", "UAPian", 28);

        player.playMatches(3);

        player.display();
    }
}

/*
 * Output:
 * Name: Sharif Md. Yousuf
 * Team Name: UAPian
 * Number of Matches Played: 31
 */