package obiektowe.citizen;

public abstract class Citizen {

    private String name;

    public Citizen(String name) {
        this.name = name;
    }

    public abstract boolean canVote();

    public String getName() {
        return name;
    }
}
