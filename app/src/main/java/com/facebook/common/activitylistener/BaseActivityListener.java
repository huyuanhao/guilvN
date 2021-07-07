package com.facebook.common.activitylistener;

import android.app.Activity;
import s.h.e.l.l.C;

public class BaseActivityListener implements ActivityListener {
    static {
        C.i(4);
    }

    @Override // com.facebook.common.activitylistener.ActivityListener
    public native int getPriority();

    @Override // com.facebook.common.activitylistener.ActivityListener
    public native void onActivityCreate(Activity activity);

    @Override // com.facebook.common.activitylistener.ActivityListener
    public native void onDestroy(Activity activity);

    @Override // com.facebook.common.activitylistener.ActivityListener
    public native void onPause(Activity activity);

    @Override // com.facebook.common.activitylistener.ActivityListener
    public native void onResume(Activity activity);

    @Override // com.facebook.common.activitylistener.ActivityListener
    public native void onStart(Activity activity);

    @Override // com.facebook.common.activitylistener.ActivityListener
    public native void onStop(Activity activity);
}
