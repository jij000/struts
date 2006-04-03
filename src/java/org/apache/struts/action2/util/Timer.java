/*
 * Copyright (c) 2002-2003 by OpenSymphony
 * All rights reserved.
 */
package org.apache.struts.action2.util;


/**
 * A bean that can be used to time execution of pages
 *
 * @author Rickard �berg (rickard@middleware-company.com)
 * @version $Revision$
 */
public class Timer {

    // Attributes ----------------------------------------------------
    long current = System.currentTimeMillis();
    long start = current;


    // Public --------------------------------------------------------
    public long getTime() {
        // Return how long time has passed since last check point
        long now = System.currentTimeMillis();
        long time = now - current;

        // Reset so that next time we get from this point
        current = now;

        return time;
    }

    public long getTotal() {
        // Reset start so that next time we get from this point
        return System.currentTimeMillis() - start;
    }
}
