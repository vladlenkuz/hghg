package HomeWork9;

public class Main {
    public static void main(String[] args) {
//     Treadmill treadmill = new Treadmill(200);
//     Wall wall = new Wall(50);
//     Cat cat = new Cat(2,200);
//     cat.run(treadmill);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat(5, 200);
        cats[1] = new Cat(4, 350);
        cats[2] = new Cat(1, 180);

        Object[] lets = new Object[4];
        lets[0] = new Treadmill(200);
        lets[1] = new Treadmill(250);
        lets[2] = new Treadmill(190);
        lets[3] = new Treadmill(180);

        for (int i = 0; i < cats.length; i++) {
            for (int j = 0; j < lets.length; j++) {
                cats[i].run((Treadmill) lets[j]);
                if (cats[i].isFinish()) {
                } else {
                    System.out.println("Участник выбыл из соревнования");
                    System.out.println("------------------------------");
                    break;
                }
                System.out.println("-  -  -  -  -  -  -  -  -  -  -");
            }


        }
    }
}
