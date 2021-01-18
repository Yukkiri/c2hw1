package com.company.creatures;

public class Human implements Skills {

    private int jumpHeight;
    private int runDistant;

    public Human(int jumpHeight, int runDistant){
        this.jumpHeight = jumpHeight;
        this.runDistant = runDistant;
    }

    public Human(){
        this(1, 4000);
    }

    public int getRunDistant() {
        return runDistant;
    }

    public void setRunDistant(int runDistant) {
        this.runDistant = runDistant;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    @Override
    public boolean jump(int height) {
        System.out.println("Human is trying to jump...");
        if(height <= jumpHeight) {
            System.out.println("Human successfully jumped on " + height + "m!");
            return true;
        } else {
            System.out.println("Human was unsuccessful!");
            return false;
        }
    }

    @Override
    public boolean run(int distant) {
        System.out.println("Human is trying to run...");
        if(distant <= runDistant) {
            System.out.println("Human successfully run " + distant + "m!");
            return true;
        } else {
            System.out.println("Human was unsuccessful!");
            return false;
        }
    }
}
