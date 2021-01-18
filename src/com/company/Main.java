package com.company;

import com.company.creatures.Cat;
import com.company.creatures.Droid;
import com.company.creatures.Human;
import com.company.creatures.Skills;
import com.company.let.Let;
import com.company.let.Treadmill;
import com.company.let.Wall;

public class Main {

    public static void main(String[] args) {
        Let[] lets = {new Wall(2), new Treadmill(1000), new Treadmill(5000), new Wall(5)};

        Skills[] creatures = {new Droid(), new Human(), new Cat(), new Droid(2, 500), new Human(5, 6000), new Cat(10, 5000)};

        for (Skills creature: creatures) {
            for (Let let : lets) {
                if(!let.overcoming(creature)){
                    break;
                };
            }
        }
    }
}

//useless comment for pull request