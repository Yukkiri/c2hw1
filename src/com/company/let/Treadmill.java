package com.company.let;

import com.company.creatures.Skills;

public class Treadmill implements Let{
    private int distant;

    public Treadmill(int distant){
        this.distant = distant;
    }


    @Override
    public boolean overcoming(Skills creature) {
        return creature.run(distant);
    }
}
