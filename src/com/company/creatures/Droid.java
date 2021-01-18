package com.company.creatures;

public class Droid implements Skills {
    private int jumpHeight;
    private int runDistant;

    public Droid(int jumpHeight, int runDistant){
        this.jumpHeight = jumpHeight;
        this.runDistant = runDistant;
    }

    public Droid(){
        this(5, 20000);
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
        System.out.println("Droid is trying to jump...");
        if(height <= jumpHeight) {
            System.out.println("Droid successfully jumped on " + height + "m!");
            return true;
        } else {
            System.out.println("Droid was unsuccessful!");
            return false;
        }
    }

    @Override
    public boolean run(int distant) {
        System.out.println("Droid is trying to run...");
        if(distant <= runDistant) {
            System.out.println("Droid successfully run " + distant + "m!");
            return true;
        } else {
            System.out.println("Droid was unsuccessful!");
            return false;
        }
    }
}
