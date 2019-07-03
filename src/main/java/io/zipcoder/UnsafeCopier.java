package io.zipcoder;

import java.util.Random;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    Random random = new Random();

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {

        super.run();
    }
}
