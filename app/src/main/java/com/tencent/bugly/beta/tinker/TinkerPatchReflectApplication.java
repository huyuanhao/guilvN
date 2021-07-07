package com.tencent.bugly.beta.tinker;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import com.tencent.tinker.loader.TinkerLoader;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public class TinkerPatchReflectApplication extends TinkerApplication {
    public static final String TAG = "Tinker.ReflectApp";
    public boolean isReflectFailure = false;
    public String rawApplicationName = null;
    public Application realApplication;

    public TinkerPatchReflectApplication() {
        super(7, "com.tencent.bugly.beta.tinker.TinkerApplicationLike", TinkerLoader.class.getName(), false);
    }

    public void attachBaseContext(Context context) {
        TinkerPatchReflectApplication.super.attachBaseContext(context);
        try {
            String rawApplicationName2 = getRawApplicationName(context);
            if (rawApplicationName2 != null) {
                Application application = (Application) Class.forName(rawApplicationName2, false, getClassLoader()).getConstructor(new Class[0]).newInstance(new Object[0]);
                this.realApplication = application;
                if (application != null) {
                    try {
                        Method declaredMethod = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(this.realApplication, context);
                    } catch (Exception e) {
                        throw new IllegalStateException(e);
                    }
                }
            } else {
                throw new RuntimeException("can get real realApplication from manifest!");
            }
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            return TinkerPatchReflectApplication.super.bindService(intent, serviceConnection, i);
        }
        return application.bindService(intent, serviceConnection, i);
    }

    public AssetManager getAssets() {
        Application application;
        return (!this.isReflectFailure || (application = this.realApplication) == null) ? TinkerPatchReflectApplication.super.getAssets() : application.getAssets();
    }

    public ClassLoader getClassLoader() {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            return TinkerPatchReflectApplication.super.getClassLoader();
        }
        return application.getClassLoader();
    }

    public ContentResolver getContentResolver() {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            return TinkerPatchReflectApplication.super.getContentResolver();
        }
        return application.getContentResolver();
    }

    public String getRawApplicationName(Context context) {
        String str = this.rawApplicationName;
        if (str != null) {
            return str;
        }
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("TINKER_PATCH_APPLICATION");
            if (obj != null) {
                this.rawApplicationName = String.valueOf(obj);
            } else {
                this.rawApplicationName = null;
            }
            Log.i(TAG, "with app realApplication from manifest applicationName:" + this.rawApplicationName);
            return this.rawApplicationName;
        } catch (Exception e) {
            String str2 = "getManifestApplication exception:" + e.getMessage();
            return null;
        }
    }

    public Resources getResources() {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            return TinkerPatchReflectApplication.super.getResources();
        }
        return application.getResources();
    }

    public void onConfigurationChanged(Configuration configuration) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            TinkerPatchReflectApplication.super.onConfigurationChanged(configuration);
        } else {
            application.onConfigurationChanged(configuration);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: com.tencent.bugly.beta.tinker.TinkerPatchReflectApplication */
    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate() {
        Class<?> cls;
        if (this.realApplication != null) {
            try {
                Class<?> cls2 = Class.forName("android.app.ActivityThread");
                Object activityThread = ShareReflectUtil.getActivityThread(this, cls2);
                Field declaredField = cls2.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Application application = (Application) declaredField.get(activityThread);
                if (this.realApplication != null && application == this) {
                    declaredField.set(activityThread, this.realApplication);
                }
                if (this.realApplication != null) {
                    Field declaredField2 = cls2.getDeclaredField("mAllApplications");
                    declaredField2.setAccessible(true);
                    List list = (List) declaredField2.get(activityThread);
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) == this) {
                            list.set(i, this.realApplication);
                        }
                    }
                }
                try {
                    cls = Class.forName("android.app.LoadedApk");
                } catch (ClassNotFoundException unused) {
                    cls = Class.forName("android.app.ActivityThread$PackageInfo");
                }
                Field declaredField3 = cls.getDeclaredField("mApplication");
                declaredField3.setAccessible(true);
                Field field = null;
                try {
                    field = Application.class.getDeclaredField("mLoadedApk");
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
                String[] strArr = {"mPackages", "mResourcePackages"};
                for (int i2 = 0; i2 < 2; i2++) {
                    Field declaredField4 = cls2.getDeclaredField(strArr[i2]);
                    declaredField4.setAccessible(true);
                    for (Map.Entry entry : ((Map) declaredField4.get(activityThread)).entrySet()) {
                        Object obj = ((WeakReference) entry.getValue()).get();
                        if (obj != null && declaredField3.get(obj) == this) {
                            if (this.realApplication != null) {
                                declaredField3.set(obj, this.realApplication);
                            }
                            if (!(this.realApplication == null || field == null)) {
                                field.set(this.realApplication, obj);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                String str = "Error, reflect Application fail, result:" + th;
                this.isReflectFailure = true;
            }
            if (!this.isReflectFailure) {
                try {
                    Class<?> cls3 = Class.forName("com.tencent.bugly.beta.tinker.TinkerApplicationLike", false, getClassLoader());
                    String str2 = "replaceApplicationLike delegateClass:" + cls3;
                    ShareReflectUtil.findField(cls3, "application").set(cls3.getDeclaredMethod("getTinkerPatchApplicationLike", new Class[0]).invoke(cls3, new Object[0]), this.realApplication);
                } catch (Throwable th2) {
                    String str3 = "replaceApplicationLike exception:" + th2.getMessage();
                }
            }
        }
        TinkerPatchReflectApplication.super.onCreate();
        Application application2 = this.realApplication;
        if (application2 != null) {
            application2.onCreate();
        }
    }

    public void onLowMemory() {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            TinkerPatchReflectApplication.super.onLowMemory();
        } else {
            application.onLowMemory();
        }
    }

    public void onTerminate() {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            TinkerPatchReflectApplication.super.onTerminate();
        } else {
            application.onTerminate();
        }
    }

    @TargetApi(14)
    public void onTrimMemory(int i) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            TinkerPatchReflectApplication.super.onTrimMemory(i);
        } else {
            application.onTrimMemory(i);
        }
    }

    @TargetApi(14)
    public void registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            TinkerPatchReflectApplication.super.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        } else {
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    @TargetApi(14)
    public void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            TinkerPatchReflectApplication.super.registerComponentCallbacks(componentCallbacks);
        } else {
            application.registerComponentCallbacks(componentCallbacks);
        }
    }

    @TargetApi(18)
    public void registerOnProvideAssistDataListener(Application.OnProvideAssistDataListener onProvideAssistDataListener) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            TinkerPatchReflectApplication.super.registerOnProvideAssistDataListener(onProvideAssistDataListener);
        } else {
            application.registerOnProvideAssistDataListener(onProvideAssistDataListener);
        }
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            return TinkerPatchReflectApplication.super.registerReceiver(broadcastReceiver, intentFilter);
        }
        return application.registerReceiver(broadcastReceiver, intentFilter);
    }

    public void unbindService(ServiceConnection serviceConnection) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            TinkerPatchReflectApplication.super.unbindService(serviceConnection);
        } else {
            application.unbindService(serviceConnection);
        }
    }

    @TargetApi(14)
    public void unregisterActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            TinkerPatchReflectApplication.super.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        } else {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    @TargetApi(14)
    public void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            TinkerPatchReflectApplication.super.unregisterComponentCallbacks(componentCallbacks);
        } else {
            application.unregisterComponentCallbacks(componentCallbacks);
        }
    }

    @TargetApi(18)
    public void unregisterOnProvideAssistDataListener(Application.OnProvideAssistDataListener onProvideAssistDataListener) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            TinkerPatchReflectApplication.super.unregisterOnProvideAssistDataListener(onProvideAssistDataListener);
        } else {
            application.unregisterOnProvideAssistDataListener(onProvideAssistDataListener);
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        Application application;
        if (!this.isReflectFailure || (application = this.realApplication) == null) {
            TinkerPatchReflectApplication.super.unregisterReceiver(broadcastReceiver);
        } else {
            application.unregisterReceiver(broadcastReceiver);
        }
    }
}
