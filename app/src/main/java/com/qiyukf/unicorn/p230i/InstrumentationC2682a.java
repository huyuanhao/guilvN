package com.qiyukf.unicorn.p230i;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.app.UiAutomation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.TestLooperManager;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* renamed from: com.qiyukf.unicorn.i.a */
public final class InstrumentationC2682a extends Instrumentation {

    /* renamed from: a */
    public Instrumentation f5572a;

    public InstrumentationC2682a(Instrumentation instrumentation) {
        this.f5572a = instrumentation;
    }

    @TargetApi(26)
    public final TestLooperManager acquireLooperManager(Looper looper) {
        return this.f5572a.acquireLooperManager(looper);
    }

    @Override // android.app.Instrumentation
    public final Instrumentation.ActivityMonitor addMonitor(IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z) {
        return this.f5572a.addMonitor(intentFilter, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public final Instrumentation.ActivityMonitor addMonitor(String str, Instrumentation.ActivityResult activityResult, boolean z) {
        return this.f5572a.addMonitor(str, activityResult, z);
    }

    public final void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.f5572a.addMonitor(activityMonitor);
    }

    @TargetApi(26)
    public final void addResults(Bundle bundle) {
        this.f5572a.addResults(bundle);
    }

    public final void callActivityOnCreate(Activity activity, Bundle bundle) {
        this.f5572a.callActivityOnCreate(activity, bundle);
    }

    @TargetApi(21)
    public final void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f5572a.callActivityOnCreate(activity, bundle, persistableBundle);
    }

    public final void callActivityOnDestroy(Activity activity) {
        this.f5572a.callActivityOnDestroy(activity);
    }

    public final void callActivityOnNewIntent(Activity activity, Intent intent) {
        this.f5572a.callActivityOnNewIntent(activity, intent);
    }

    public final void callActivityOnPause(Activity activity) {
        this.f5572a.callActivityOnPause(activity);
        C2683b.m6190a().mo36451b(activity);
    }

    public final void callActivityOnPostCreate(Activity activity, Bundle bundle) {
        this.f5572a.callActivityOnPostCreate(activity, bundle);
    }

    @TargetApi(21)
    public final void callActivityOnPostCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f5572a.callActivityOnPostCreate(activity, bundle, persistableBundle);
    }

    public final void callActivityOnRestart(Activity activity) {
        this.f5572a.callActivityOnRestart(activity);
    }

    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        this.f5572a.callActivityOnRestoreInstanceState(activity, bundle);
    }

    @TargetApi(21)
    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f5572a.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
    }

    public final void callActivityOnResume(Activity activity) {
        this.f5572a.callActivityOnResume(activity);
        C2683b.m6190a().mo36443a(activity);
    }

    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        this.f5572a.callActivityOnSaveInstanceState(activity, bundle);
    }

    @TargetApi(21)
    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f5572a.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
    }

    public final void callActivityOnStart(Activity activity) {
        this.f5572a.callActivityOnStart(activity);
    }

    public final void callActivityOnStop(Activity activity) {
        this.f5572a.callActivityOnStop(activity);
    }

    public final void callActivityOnUserLeaving(Activity activity) {
        this.f5572a.callActivityOnUserLeaving(activity);
    }

    public final void callApplicationOnCreate(Application application) {
        this.f5572a.callApplicationOnCreate(application);
    }

    public final boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i) {
        return this.f5572a.checkMonitorHit(activityMonitor, i);
    }

    public final void endPerformanceSnapshot() {
        this.f5572a.endPerformanceSnapshot();
    }

    public final void finish(int i, Bundle bundle) {
        this.f5572a.finish(i, bundle);
    }

    public final Bundle getAllocCounts() {
        return this.f5572a.getAllocCounts();
    }

    public final Bundle getBinderCounts() {
        return this.f5572a.getBinderCounts();
    }

    public final ComponentName getComponentName() {
        return this.f5572a.getComponentName();
    }

    public final Context getContext() {
        return this.f5572a.getContext();
    }

    @TargetApi(26)
    public final String getProcessName() {
        return this.f5572a.getProcessName();
    }

    public final Context getTargetContext() {
        return this.f5572a.getTargetContext();
    }

    @TargetApi(18)
    public final UiAutomation getUiAutomation() {
        return this.f5572a.getUiAutomation();
    }

    @TargetApi(24)
    public final UiAutomation getUiAutomation(int i) {
        return this.f5572a.getUiAutomation(i);
    }

    public final boolean invokeContextMenuAction(Activity activity, int i, int i2) {
        return this.f5572a.invokeContextMenuAction(activity, i, i2);
    }

    public final boolean invokeMenuActionSync(Activity activity, int i, int i2) {
        return this.f5572a.invokeMenuActionSync(activity, i, i2);
    }

    public final boolean isProfiling() {
        return this.f5572a.isProfiling();
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) {
        return this.f5572a.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        return this.f5572a.newActivity(classLoader, str, intent);
    }

    @Override // android.app.Instrumentation
    public final Application newApplication(ClassLoader classLoader, String str, Context context) {
        return this.f5572a.newApplication(classLoader, str, context);
    }

    public final void onCreate(Bundle bundle) {
        this.f5572a.onCreate(bundle);
    }

    public final void onDestroy() {
        this.f5572a.onDestroy();
    }

    public final boolean onException(Object obj, Throwable th) {
        return this.f5572a.onException(obj, th);
    }

    public final void onStart() {
        this.f5572a.onStart();
    }

    public final void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.f5572a.removeMonitor(activityMonitor);
    }

    public final void runOnMainSync(Runnable runnable) {
        this.f5572a.runOnMainSync(runnable);
    }

    public final void sendCharacterSync(int i) {
        this.f5572a.sendCharacterSync(i);
    }

    public final void sendKeyDownUpSync(int i) {
        this.f5572a.sendKeyDownUpSync(i);
    }

    public final void sendKeySync(KeyEvent keyEvent) {
        this.f5572a.sendKeySync(keyEvent);
    }

    public final void sendPointerSync(MotionEvent motionEvent) {
        this.f5572a.sendPointerSync(motionEvent);
    }

    public final void sendStatus(int i, Bundle bundle) {
        this.f5572a.sendStatus(i, bundle);
    }

    public final void sendStringSync(String str) {
        this.f5572a.sendStringSync(str);
    }

    public final void sendTrackballEventSync(MotionEvent motionEvent) {
        this.f5572a.sendTrackballEventSync(motionEvent);
    }

    public final void setAutomaticPerformanceSnapshots() {
        this.f5572a.setAutomaticPerformanceSnapshots();
    }

    public final void setInTouchMode(boolean z) {
        this.f5572a.setInTouchMode(z);
    }

    public final void start() {
        this.f5572a.start();
    }

    public final Activity startActivitySync(Intent intent) {
        return this.f5572a.startActivitySync(intent);
    }

    public final void startAllocCounting() {
        this.f5572a.startAllocCounting();
    }

    public final void startPerformanceSnapshot() {
        this.f5572a.startPerformanceSnapshot();
    }

    public final void startProfiling() {
        this.f5572a.startProfiling();
    }

    public final void stopAllocCounting() {
        this.f5572a.stopAllocCounting();
    }

    public final void stopProfiling() {
        this.f5572a.stopProfiling();
    }

    public final void waitForIdle(Runnable runnable) {
        this.f5572a.waitForIdle(runnable);
    }

    public final void waitForIdleSync() {
        this.f5572a.waitForIdleSync();
    }

    public final Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        return this.f5572a.waitForMonitor(activityMonitor);
    }

    public final Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j) {
        return this.f5572a.waitForMonitorWithTimeout(activityMonitor, j);
    }
}
