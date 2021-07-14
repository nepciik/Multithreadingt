public class Relay extends Thread {
    String[] teamNames;
    String[][] runnerNames;

    Relay(String[] teamNames, String[][] runnerNames) {
        this.teamNames = teamNames;
        this.runnerNames = runnerNames;
    }

    public void run() {
        Team team1 = new Team(teamNames[0], runnerNames[0]);
        team1.run();
        Team team2 = new Team(teamNames[1], runnerNames[1]);
        team2.run();
    }
}
