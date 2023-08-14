package Fall2022.CT2.SetF;

public class Movie {
    private String name;
    private int duration;
    private int rank;

    public Movie(String name, int duration, int rank) {
        this.name = name;
        this.duration = duration;
        this.rank = rank;
    }

    public void reviewThisMovie(boolean isGood, double score) {
        if (isGood) {
            rank += score;
        } else {
            rank -= score;
        }
    }

    public int getRank() {
        return rank;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Rank: " + rank);
    }
}

