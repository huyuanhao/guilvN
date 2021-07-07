package com.p118pd.sdk;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.CoreComponentFactory;
import java.lang.reflect.InvocationTargetException;

@RequiresApi(28)
/* renamed from: com.pd.sdk.o000O0O0  reason: case insensitive filesystem */
public class AppComponentFactoryC6985o000O0O0 extends AppComponentFactory {
    @NonNull
    public Application OooO00o(@NonNull ClassLoader classLoader, @NonNull String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Application) classLoader.loadClass(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @Override // android.app.AppComponentFactory
    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) CoreComponentFactory.OooO00o(OooO00o(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public final Application instantiateApplication(ClassLoader classLoader, String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) CoreComponentFactory.OooO00o(OooO00o(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) CoreComponentFactory.OooO00o(m18202OooO00o(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) CoreComponentFactory.OooO00o(m18201OooO00o(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) CoreComponentFactory.OooO00o(m18200OooO00o(classLoader, str, intent));
    }

    @NonNull
    public Activity OooO00o(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Activity) classLoader.loadClass(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BroadcastReceiver m18201OooO00o(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (BroadcastReceiver) classLoader.loadClass(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Service m18200OooO00o(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Service) classLoader.loadClass(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ContentProvider m18202OooO00o(@NonNull ClassLoader classLoader, @NonNull String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (ContentProvider) classLoader.loadClass(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }
}
