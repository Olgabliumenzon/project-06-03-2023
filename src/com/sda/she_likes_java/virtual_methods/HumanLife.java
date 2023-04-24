package com.sda.she_likes_java.virtual_methods;

public class HumanLife {

    public void tellMeWhoYouAre(Human human) {
        if (human != null) {
            human.whoYouAre();
        }
    }

    public void tryToCastHumanToMan(Human maybeWomanOrMan) {
        // instanceof operator - tests if argument is of given type
        // tests if MaybeWomanOrMan is of type Man
        if (maybeWomanOrMan instanceof Man) {
            // casting / down casting
            // works for the references
            (
                    (Man) maybeWomanOrMan
            ).learnToCleanHouse();

            ((Man) maybeWomanOrMan).learnToCleanHouse();
        }

        if (maybeWomanOrMan instanceof Woman) {
            System.out.println("It's a woman");
            ((Woman) maybeWomanOrMan).learnJava();
        }
    }
}