public class Runner extends Thread {
    String name;
    Runner other;
    String teamName;
    int count = 0;
    int maxCount = 30;
    String meter = "";

    Runner(String name, String teamName) {
        this.name = name;
        this.teamName = teamName;
    }

    Runner(String name, String teamName, Runner other) {
        this.name = name;
        this.teamName = teamName;
        this.other = other;
    }

    public void run() {
        try {
            if (other != null) {
                other.join();
                System.out.println(other.name + " из комманды " + teamName + " передал эстафету участнику " + name);
            }

            while (count < maxCount) {
                ++count;
                switch (count % 10) {
                    case 0:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        meter = "метров";
                        break;
                    case 1:
                        meter = "метр";
                        break;
                    case 2:
                    case 3:
                    case 4:
                        meter = "метра";
                        break;
                }
            System.out.println(name + " из комманды " + teamName + " пробежал(а) " + count + " " + meter);
            sleep((long) Math.random() * 50);
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
