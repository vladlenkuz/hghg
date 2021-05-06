package HomeWork9;

public class Human  implements Action  {

    private int jumpLimit;
    private int runLimit;

    public Human(int jumpLimit, int runLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    public int getJumpLimitHum() {
        return jumpLimit;
    }

    public int getRunLimitHum() {
        return runLimit;
    }

    @Override
    public void run(Treadmill treadmill) {
        if (getRunLimitHum()>=treadmill.getLenghtWay()){
            System.out.println("Человек" + " пробежал " + treadmill.getLenghtWay() + " метров по беговой дорожке.");
        } else {
            System.out.println("Человек" + " слаб. Он сошел с дистанции.");
        }
    }

    @Override
    public void jump(Wall wall) {
        if (getJumpLimitHum()>= wall.getHeight()){
            System.out.println("Кот перепрыгнул стену высотой  " + wall.getHeight() + " метров.");
        } else {
            System.out.println("Кот выбыл из соревнований. ");
        }
    }
}
