package basepattern.chaplinskiy.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    public List<TeamPlayerFootbal> players = new ArrayList<>();

    public void addPlayer(TeamPlayerFootbal teamPlayerFootbal) {
        players.add(teamPlayerFootbal);
    }

    public void removePlayer(TeamPlayerFootbal teamPlayerFootbal){
        players.remove(teamPlayerFootbal);
    }

    public void createTeam(){
        System.out.println("Create team football");

        for(TeamPlayerFootbal t : players){
            t.playFootbal();
        }
    }


}
