public class Main {

    public static void main(String[] args) {
        String[] teamNames = {"Динамо", "ЦСКА"};
        String[][] runnerNames = {{"Петр", "Василий", "Иван", "Глафира"}, {"Юрий", "Оксана", "Александр", "Анна"}};
        Relay relay = new Relay(teamNames, runnerNames);
        //System.out.println("Победила команда ");
        relay.run();
    }
}
