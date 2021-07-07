package com.facebook.common.activitylistener;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.common.internal.Preconditions;
import java.lang.ref.WeakReference;

public class ActivityListenerManager {

    public static class Listener extends BaseActivityListener {
        public final WeakReference<ActivityListener> mActivityListenerRef;

        public Listener(ActivityListener activityListener) {
            this.mActivityListenerRef = new WeakReference<>(activityListener);
        }

        private ActivityListener getListenerOrCleanUp(Activity activity) {
            ActivityListener activityListener = this.mActivityListenerRef.get();
            if (activityListener == null) {
                Preconditions.checkArgument(activity instanceof ListenableActivity);
                ((ListenableActivity) activity).removeActivityListener(this);
            }
            return activityListener;
        }

        @Override // com.facebook.common.activitylistener.BaseActivityListener, com.facebook.common.activitylistener.ActivityListener
        public void onActivityCreate(Activity activity) {
            ActivityListener listenerOrCleanUp = getListenerOrCleanUp(activity);
            if (listenerOrCleanUp != null) {
                listenerOrCleanUp.onActivityCreate(activity);
            }
        }

        @Override // com.facebook.common.activitylistener.BaseActivityListener, com.facebook.common.activitylistener.ActivityListener
        public void onDestroy(Activity activity) {
            ActivityListener listenerOrCleanUp = getListenerOrCleanUp(activity);
            if (listenerOrCleanUp != null) {
                listenerOrCleanUp.onDestroy(activity);
            }
        }

        @Override // com.facebook.common.activitylistener.BaseActivityListener, com.facebook.common.activitylistener.ActivityListener
        public void onPause(Activity activity) {
            ActivityListener listenerOrCleanUp = getListenerOrCleanUp(activity);
            if (listenerOrCleanUp != null) {
                listenerOrCleanUp.onPause(activity);
            }
        }

        @Override // com.facebook.common.activitylistener.BaseActivityListener, com.facebook.common.activitylistener.ActivityListener
        public void onResume(Activity activity) {
            ActivityListener listenerOrCleanUp = getListenerOrCleanUp(activity);
            if (listenerOrCleanUp != null) {
                listenerOrCleanUp.onResume(activity);
            }
        }

        @Override // com.facebook.common.activitylistener.BaseActivityListener, com.facebook.common.activitylistener.ActivityListener
        public void onStart(Activity activity) {
            ActivityListener listenerOrCleanUp = getListenerOrCleanUp(activity);
            if (listenerOrCleanUp != null) {
                listenerOrCleanUp.onStart(activity);
            }
        }

        @Override // com.facebook.common.activitylistener.BaseActivityListener, com.facebook.common.activitylistener.ActivityListener
        public void onStop(Activity activity) {
            ActivityListener listenerOrCleanUp = getListenerOrCleanUp(activity);
            if (listenerOrCleanUp != null) {
                listenerOrCleanUp.onStop(activity);
            }
        }
    }

    public static void register(ActivityListener activityListener, Context context) {
        if (!(context instanceof ListenableActivity) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof ListenableActivity) {
            ((ListenableActivity) context).addActivityListener(new Listener(activityListener));
        }
    }
}
