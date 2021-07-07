package com.facebook.react.uimanager;

public class ReactRootViewTagGenerator {
    public static final int ROOT_VIEW_TAG_INCREMENT = 10;
    public static int sNextRootViewTag = 1;

    public static synchronized int getNextRootViewTag() {
        int i;
        synchronized (ReactRootViewTagGenerator.class) {
            i = sNextRootViewTag;
            sNextRootViewTag += 10;
        }
        return i;
    }
}
