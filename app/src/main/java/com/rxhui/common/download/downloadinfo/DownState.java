package com.rxhui.common.download.downloadinfo;

public enum DownState {
    START(0),
    DOWN(1),
    PAUSE(2),
    STOP(3),
    ERROR(4),
    FINISH(5);
    
    public int state;

    /* access modifiers changed from: public */
    DownState(int i) {
        this.state = i;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int i) {
        this.state = i;
    }
}
