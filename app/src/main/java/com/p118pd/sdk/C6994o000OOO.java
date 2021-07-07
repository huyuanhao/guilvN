package com.p118pd.sdk;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RequiresApi(16)
/* renamed from: com.pd.sdk.o000OOO  reason: case insensitive filesystem */
public class C6994o000OOO {
    public static final String OooO = "dataOnlyRemoteInputs";
    public static Class<?> OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f19205OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19206OooO00o = "NotificationCompat";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Field f19207OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f19208OooO00o = false;
    public static final Object OooO0O0 = new Object();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f19209OooO0O0 = "android.support.dataRemoteInputs";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static Field f19210OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static boolean f19211OooO0O0 = false;
    public static final String OooO0OO = "android.support.allowGeneratedReplies";

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static Field f19212OooO0OO = null;
    public static final String OooO0Oo = "icon";

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static Field f19213OooO0Oo = null;
    public static final String OooO0o = "actionIntent";
    public static final String OooO0o0 = "title";

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static Field f19214OooO0o0 = null;
    public static final String OooO0oO = "extras";
    public static final String OooO0oo = "remoteInputs";
    public static final String OooOO0 = "resultKey";
    public static final String OooOO0O = "label";
    public static final String OooOO0o = "choices";
    public static final String OooOOO = "allowedDataTypes";
    public static final String OooOOO0 = "allowFreeFormInput";
    public static final String OooOOOO = "semanticAction";
    public static final String OooOOOo = "showsUserInterface";

    public static SparseArray<Bundle> OooO00o(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Bundle m18208OooO00o(Notification notification) {
        synchronized (f19205OooO00o) {
            if (f19208OooO00o) {
                return null;
            }
            if (f19207OooO00o == null) {
                Field declaredField = Notification.class.getDeclaredField("extras");
                if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                    f19208OooO00o = true;
                    return null;
                }
                try {
                    declaredField.setAccessible(true);
                    f19207OooO00o = declaredField;
                } catch (IllegalAccessException | NoSuchFieldException unused) {
                    f19208OooO00o = true;
                    return null;
                }
            }
            Bundle bundle = (Bundle) f19207OooO00o.get(notification);
            if (bundle == null) {
                bundle = new Bundle();
                f19207OooO00o.set(notification, bundle);
            }
            return bundle;
        }
    }

    public static NotificationCompat.Action OooO00o(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        boolean z;
        C7002o000Oo00[] o000oo00Arr;
        C7002o000Oo00[] o000oo00Arr2;
        if (bundle != null) {
            o000oo00Arr2 = OooO00o(OooO00o(bundle, "android.support.remoteInputs"));
            o000oo00Arr = OooO00o(OooO00o(bundle, "android.support.dataRemoteInputs"));
            z = bundle.getBoolean("android.support.allowGeneratedReplies");
        } else {
            o000oo00Arr2 = null;
            o000oo00Arr = null;
            z = false;
        }
        return new NotificationCompat.Action(i, charSequence, pendingIntent, bundle, o000oo00Arr2, o000oo00Arr, z, 0, true);
    }

    public static Bundle OooO00o(Notification.Builder builder, NotificationCompat.Action action) {
        builder.addAction(action.OooO00o(), action.m14487OooO00o(), action.m14485OooO00o());
        Bundle bundle = new Bundle(action.m14486OooO00o());
        if (action.m14491OooO0O0() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", OooO00o(action.m14491OooO0O0()));
        }
        if (action.m14489OooO00o() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", OooO00o(action.m14489OooO00o()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.m14488OooO00o());
        return bundle;
    }

    public static int OooO00o(Notification notification) {
        int length;
        synchronized (OooO0O0) {
            Object[] OooO00o2 = m18210OooO00o(notification);
            length = OooO00o2 != null ? OooO00o2.length : 0;
        }
        return length;
    }

    public static NotificationCompat.Action OooO00o(Notification notification, int i) {
        SparseArray sparseParcelableArray;
        synchronized (OooO0O0) {
            try {
                Object[] OooO00o2 = m18210OooO00o(notification);
                if (OooO00o2 != null) {
                    Object obj = OooO00o2[i];
                    Bundle OooO00o3 = m18208OooO00o(notification);
                    return OooO00o(f19212OooO0OO.getInt(obj), (CharSequence) f19213OooO0Oo.get(obj), (PendingIntent) f19214OooO0o0.get(obj), (OooO00o3 == null || (sparseParcelableArray = OooO00o3.getSparseParcelableArray("android.support.actionExtras")) == null) ? null : (Bundle) sparseParcelableArray.get(i));
                }
            } catch (IllegalAccessException unused) {
                f19211OooO0O0 = true;
            } catch (Throwable th) {
                throw th;
            }
            return null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Object[] m18210OooO00o(Notification notification) {
        synchronized (OooO0O0) {
            if (!OooO00o()) {
                return null;
            }
            try {
                return (Object[]) f19210OooO0O0.get(notification);
            } catch (IllegalAccessException unused) {
                f19211OooO0O0 = true;
                return null;
            }
        }
    }

    public static boolean OooO00o() {
        if (f19211OooO0O0) {
            return false;
        }
        try {
            if (f19210OooO0O0 == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                OooO00o = cls;
                f19212OooO0OO = cls.getDeclaredField("icon");
                f19213OooO0Oo = OooO00o.getDeclaredField("title");
                f19214OooO0o0 = OooO00o.getDeclaredField("actionIntent");
                Field declaredField = Notification.class.getDeclaredField("actions");
                f19210OooO0O0 = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException unused) {
            f19211OooO0O0 = true;
        } catch (NoSuchFieldException unused2) {
            f19211OooO0O0 = true;
        }
        return true ^ f19211OooO0O0;
    }

    public static NotificationCompat.Action OooO00o(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new NotificationCompat.Action(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), OooO00o(OooO00o(bundle, "remoteInputs")), OooO00o(OooO00o(bundle, "dataOnlyRemoteInputs")), bundle2 != null ? bundle2.getBoolean("android.support.allowGeneratedReplies", false) : false, bundle.getInt(OooOOOO), bundle.getBoolean(OooOOOo));
    }

    public static Bundle OooO00o(NotificationCompat.Action action) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("icon", action.OooO00o());
        bundle2.putCharSequence("title", action.m14487OooO00o());
        bundle2.putParcelable("actionIntent", action.m14485OooO00o());
        if (action.m14486OooO00o() != null) {
            bundle = new Bundle(action.m14486OooO00o());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.m14488OooO00o());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", OooO00o(action.m14491OooO0O0()));
        bundle2.putBoolean(OooOOOo, action.m14490OooO0O0());
        bundle2.putInt(OooOOOO, action.OooO0O0());
        return bundle2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C7002o000Oo00 m18209OooO00o(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new C7002o000Oo00(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), bundle.getBundle("extras"), hashSet);
    }

    public static Bundle OooO00o(C7002o000Oo00 o000oo00) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", o000oo00.m18229OooO00o());
        bundle.putCharSequence("label", o000oo00.m18228OooO00o());
        bundle.putCharSequenceArray("choices", o000oo00.m18232OooO00o());
        bundle.putBoolean("allowFreeFormInput", o000oo00.m18231OooO00o());
        bundle.putBundle("extras", o000oo00.OooO00o());
        Set<String> OooO00o2 = o000oo00.m18230OooO00o();
        if (OooO00o2 != null && !OooO00o2.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(OooO00o2.size());
            for (String str : OooO00o2) {
                arrayList.add(str);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    public static C7002o000Oo00[] OooO00o(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        C7002o000Oo00[] o000oo00Arr = new C7002o000Oo00[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            o000oo00Arr[i] = m18209OooO00o(bundleArr[i]);
        }
        return o000oo00Arr;
    }

    public static Bundle[] OooO00o(C7002o000Oo00[] o000oo00Arr) {
        if (o000oo00Arr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[o000oo00Arr.length];
        for (int i = 0; i < o000oo00Arr.length; i++) {
            bundleArr[i] = OooO00o(o000oo00Arr[i]);
        }
        return bundleArr;
    }

    public static Bundle[] OooO00o(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }
}
