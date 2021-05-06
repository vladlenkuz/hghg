package HomeWork9;

public class Cat  implements Action{
    private int jumpLimit;
    private int runLimit;
    private boolean finish;

    public Cat(int jumpLimit, int runLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinishCat(boolean finish) {
        this.finish = finish;
    }

    public int getJumpLimitCat() {
        return jumpLimit;
    }

    public void setJumpLimitCat(int jumpLimit) {
        this.jumpLimit = jumpLimit;
    }

    public int getRunLimitCat() {
        return runLimit;
    }

    public void setRunLimitCat(int runLimit) {
        this.runLimit = runLimit;
    }

    @Override
    public void run(Treadmill treadmill) {
        if (getRunLimitCat()>=treadmill.getLenghtWay()){
            System.out.println("Кот" + " пробежал " + treadmill.getLenghtWay() + " метров по беговой дорожке.");
            setFinishCat(true);
        } else {
            System.out.println("Кот" + " слаб. Он сошел с дистанции.");
            setFinishCat(false);
        }

    }

    @Override
    public void jump(Wall wall) {
        if (getJumpLimitCat()>= wall.getHeight()){
            System.out.println("Кот" + " перепрыгнул стену высотой  " + wall.getHeight() + " метров.");
        } else {
            System.out.println("Кот"  + " выбыл из соревнований. ");
        }
    }


}
