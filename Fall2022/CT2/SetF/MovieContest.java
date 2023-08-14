package Fall2022.CT2.SetF;

public class MovieContest {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Sharif Md. Yousuf", 28, 8);

        myMovie.reviewThisMovie(true, 3);

        myMovie.display();
    }
}

/*
 * Output:
 * Name: Sharif Md. Yousuf
 * Duration: 28 minutes
 * Rank: 11
 */