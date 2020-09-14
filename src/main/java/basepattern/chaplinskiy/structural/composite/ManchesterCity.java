package basepattern.chaplinskiy.structural.composite;

public class ManchesterCity {
    public static void main(String[] args) {
        Team team = new Team();

        TeamPlayerFootbal attackPlayer1 = new AttackPlayer();
        TeamPlayerFootbal attackPlayer2 = new AttackPlayer();
        TeamPlayerFootbal attackPlayer3 = new AttackPlayer();

        TeamPlayerFootbal defenderPlayer1 = new DefenderPlayer();
        TeamPlayerFootbal defenderPlayer2 = new DefenderPlayer();
        TeamPlayerFootbal defenderPlayer3 = new DefenderPlayer();

        TeamPlayerFootbal goalkeeper = new Goalkeeper();

        team.addPlayer(attackPlayer1);
        team.addPlayer(attackPlayer2);
        team.addPlayer(attackPlayer3);

        team.addPlayer(defenderPlayer1);
        team.addPlayer(defenderPlayer2);
        team.addPlayer(defenderPlayer3);

        team.addPlayer(goalkeeper);

        team.createTeam();


    }
}
