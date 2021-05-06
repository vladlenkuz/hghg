package HomeWork9;

public class Robot  implements Action {
    private int jumpLimit;
    private int runLimit;

    public Robot(int jumpLimit, int runLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    public int getJumpLimitRob() {
        return jumpLimit;
    }

    public int getRunLimitRob() {
        return runLimit;
    }

    @Override
    public void run(Treadmill treadmill) {
        if (getRunLimitRob()>=treadmill.getLenghtWay()){
            System.out.println("Робот" + " пробежал " + treadmill.getLenghtWay() + " метров по беговой дорожке.");
        } else {
            System.out.println("Робот" + " слаб. Он сошел с дистанции.");
        }
    }

    @Override
    public void jump(Wall wall) {
        if (getJumpLimitRob()>= wall.getHeight()){
            System.out.println("Робот" + " перепрыгнул стену высотой  " + wall.getHeight() + " метров.");
        } else {
            System.out.println("Робот"  + " выбыл из соревнований. ");
        }
    }

}
