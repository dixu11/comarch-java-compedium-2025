package obiektowe.citizen;

import java.util.ArrayList;
import java.util.List;

public class Town {

    private List<Citizen> citizens = new ArrayList<>();

    public void addCitizen(Citizen citizen) {
        citizens.add(citizen);
    }

    public int howManyCanVote() {
        int counter = 0;
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                counter++;
            }
        }
        return counter;
    }

    public void whoCanVote() {
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                System.out.println("Głosować może: " + citizen.getName());
            }
        }
    }


}
