package chapter7.swan;

import chapter7.bird.Bird;

public class Swan extends Bird {
    public void swim() {
        floatInWater();
    }

    public void helpOtherSwanSwim() {
        Swan anotherSwan = new Swan();
        anotherSwan.floatInWater();
    }
    // TODO: 2 cases from above does work as we inherit directly from Bird

//    public void helpOtherBirdSwim() {
//        Bird bird = new Bird();
//        bird.floatInWater();
//    }
    // TODO: doesn't compile as we reference protected methods from another package

//    public void helpAnotherSwanSwim() {
//        Bird bird = new Swan();
//        bird.floatInWater();
//    }
    // TODO: although we use Swan, it's stored in a Bird reference.
    //  And this method is protected -> can't be used in another package without:
    //  - inheritance with reference to the child
}
