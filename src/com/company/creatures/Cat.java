package com.company.creatures;

public class Cat implements Skills {
    private int jumpHeight;
    private int runDistant;

    public Cat(int jumpHeight, int runDistant){
        this.jumpHeight = jumpHeight;
        this.runDistant = runDistant;
    }

    public Cat(){
        this(3, 2500);
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
        System.out.println("Cat is trying to jump...");
        if(height <= jumpHeight) {
            System.out.println("Cat successfully jumped on " + height + "m!");
            return true;
        } else {
            System.out.println("Cat was unsuccessful!");
            return false;
        }
    }

    @Override
    public boolean run(int distant) {
        System.out.println("Cat is trying to run...");
        if(distant <= runDistant) {
            System.out.println("Cat successfully run " + distant + "m!");
            return true;
        } else {
            System.out.println("Cat was unsuccessful!");
            return false;
        }
    }
}
