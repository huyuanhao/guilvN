package org.android.spdy;

public enum RequestPriority {
    HIGHEST(0),
    HIGH(1),
    MEDIUM(2),
    LOW(3),
    LOWEST(4),
    IDLE(5),
    DEFAULT_PRIORITY(1);
    
    public int priority;

    /* access modifiers changed from: public */
    RequestPriority(int i) {
        this.priority = i;
    }

    public int getPriorityInt() {
        return this.priority;
    }
}
