package com.company.let;

import com.company.creatures.Skills;

public class Wall implements Let {
    private int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public boolean overcoming(Skills creature) {
        return creature.jump(height);
    }
}
