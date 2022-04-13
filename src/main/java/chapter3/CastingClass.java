package chapter3;

import java.util.Random;

public class CastingClass {
    short fur = (short)4;

    float egg = (float) 2.0 / 9; // as without casting it'll become double

    short mouse = 4;
    short hamster = 10;
    short capybara = (short)(mouse * hamster); // as without it'll be int

    // casting may appear in various parts of the expression, but remember: unary
    short cat = 10;
    short dog = 3;
    short catDog = (short)(cat * dog);
    short nextCatDog = (short) (1 + catDog);

//    long goat = 10;
//    int sheep = 5;
//    sheep *= goat;

    int owl = 3;
    int food = (owl < 2) ? 3 : 4;

    // side effects
    int sheep = 7;
    int zzz = 2;
    int sleep = (zzz <= 10) ? sheep++ : zzz++;

}
