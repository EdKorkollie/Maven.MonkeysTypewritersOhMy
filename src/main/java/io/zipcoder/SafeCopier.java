package io.zipcoder;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Make this extend the Copier like `UnsafeCopier`, except use locks to make sure that the actual intro gets printed
 * correctly every time.  Make the run method thread safe.
 */
public class SafeCopier extends Copier{

    private Lock copyLock = new ReentrantLock();

    public SafeCopier(String tocopy) {
        super(tocopy);
    }

    public void run() {

        copyLock.lock();
        super.run();
        copyLock.unlock();
    }

}
