package com.p118pd.sdk;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.RemoteViews;
import com.netease.nimlib.notifier.support26.annotation.RequiresApi;
import com.p118pd.sdk.C8844ooO0Oo0;
import com.p118pd.sdk.C8852ooO0OoOo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RequiresApi(16)
/* renamed from: com.pd.sdk.ooO0Oo0o  reason: case insensitive filesystem */
public class C8847ooO0Oo0o {
    public static final String OooO = "android.support.useSideChannel";
    public static Class<?> OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f22043OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f22044OooO00o = "NotificationCompat";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Field f22045OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f22046OooO00o = false;
    public static final Object OooO0O0 = new Object();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f22047OooO0O0 = "android.support.localOnly";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static Field f22048OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static boolean f22049OooO0O0 = false;
    public static final String OooO0OO = "android.support.actionExtras";

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static Field f22050OooO0OO = null;
    public static final String OooO0Oo = "android.support.remoteInputs";

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static Field f22051OooO0Oo = null;
    public static final String OooO0o = "android.support.groupKey";
    public static final String OooO0o0 = "android.support.dataRemoteInputs";

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static Field f22052OooO0o0 = null;
    public static final String OooO0oO = "android.support.isGroupSummary";
    public static final String OooO0oo = "android.support.sortKey";
    public static final String OooOO0 = "android.support.allowGeneratedReplies";
    public static final String OooOO0O = "icon";
    public static final String OooOO0o = "title";
    public static final String OooOOO = "extras";
    public static final String OooOOO0 = "actionIntent";
    public static final String OooOOOO = "remoteInputs";
    public static final String OooOOOo = "dataOnlyRemoteInputs";

    /* renamed from: com.pd.sdk.ooO0Oo0o$OooO00o */
    public static class OooO00o implements AbstractC8832ooO0OO, AbstractC8836ooO0OO0o {
        public Notification.Builder OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Bundle f22053OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public RemoteViews f22054OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<Bundle> f22055OooO00o = new ArrayList();
        public RemoteViews OooO0O0;

        public OooO00o(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, int i4, CharSequence charSequence4, boolean z3, Bundle bundle, String str, boolean z4, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
            PendingIntent pendingIntent3;
            boolean z5 = false;
            Notification.Builder deleteIntent = new Notification.Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
            if ((notification.flags & 128) != 0) {
                pendingIntent3 = pendingIntent2;
                z5 = true;
            } else {
                pendingIntent3 = pendingIntent2;
            }
            this.OooO00o = deleteIntent.setFullScreenIntent(pendingIntent3, z5).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z2).setPriority(i4).setProgress(i2, i3, z);
            Bundle bundle2 = new Bundle();
            this.f22053OooO00o = bundle2;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (z3) {
                this.f22053OooO00o.putBoolean("android.support.localOnly", true);
            }
            if (str != null) {
                this.f22053OooO00o.putString("android.support.groupKey", str);
                if (z4) {
                    this.f22053OooO00o.putBoolean("android.support.isGroupSummary", true);
                } else {
                    this.f22053OooO00o.putBoolean("android.support.useSideChannel", true);
                }
            }
            if (str2 != null) {
                this.f22053OooO00o.putString("android.support.sortKey", str2);
            }
            this.f22054OooO00o = remoteViews2;
            this.OooO0O0 = remoteViews3;
        }

        @Override // com.p118pd.sdk.AbstractC8836ooO0OO0o
        public void OooO00o(C8844ooO0Oo0.OooO00o oooO00o) {
            this.f22055OooO00o.add(C8847ooO0Oo0o.OooO00o(this.OooO00o, oooO00o));
        }

        @Override // com.p118pd.sdk.AbstractC8832ooO0OO, com.p118pd.sdk.AbstractC8832ooO0OO
        public Notification.Builder OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC8832ooO0OO, com.p118pd.sdk.AbstractC8832ooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Notification m20481OooO00o() {
            Notification build = this.OooO00o.build();
            Bundle OooO00o2 = C8847ooO0Oo0o.m20479OooO00o(build);
            Bundle bundle = new Bundle(this.f22053OooO00o);
            for (String str : this.f22053OooO00o.keySet()) {
                if (OooO00o2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            OooO00o2.putAll(bundle);
            SparseArray<Bundle> OooO00o3 = C8847ooO0Oo0o.OooO00o(this.f22055OooO00o);
            if (OooO00o3 != null) {
                C8847ooO0Oo0o.m20479OooO00o(build).putSparseParcelableArray("android.support.actionExtras", OooO00o3);
            }
            RemoteViews remoteViews = this.f22054OooO00o;
            if (remoteViews != null) {
                build.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.OooO0O0;
            if (remoteViews2 != null) {
                build.bigContentView = remoteViews2;
            }
            return build;
        }
    }

    public static void OooO00o(AbstractC8832ooO0OO ooo0oo, CharSequence charSequence, boolean z, CharSequence charSequence2, CharSequence charSequence3) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(ooo0oo.OooO00o()).setBigContentTitle(charSequence).bigText(charSequence3);
        if (z) {
            bigText.setSummaryText(charSequence2);
        }
    }

    public static void OooO00o(AbstractC8832ooO0OO ooo0oo, CharSequence charSequence, boolean z, CharSequence charSequence2, Bitmap bitmap, Bitmap bitmap2, boolean z2) {
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(ooo0oo.OooO00o()).setBigContentTitle(charSequence).bigPicture(bitmap);
        if (z2) {
            bigPicture.bigLargeIcon(bitmap2);
        }
        if (z) {
            bigPicture.setSummaryText(charSequence2);
        }
    }

    public static void OooO00o(AbstractC8832ooO0OO ooo0oo, CharSequence charSequence, boolean z, CharSequence charSequence2, ArrayList<CharSequence> arrayList) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(ooo0oo.OooO00o()).setBigContentTitle(charSequence);
        if (z) {
            bigContentTitle.setSummaryText(charSequence2);
        }
        Iterator<CharSequence> it = arrayList.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine(it.next());
        }
    }

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
    public static Bundle m20479OooO00o(Notification notification) {
        synchronized (f22043OooO00o) {
            if (f22046OooO00o) {
                return null;
            }
            if (f22045OooO00o == null) {
                Field declaredField = Notification.class.getDeclaredField("extras");
                if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                    f22046OooO00o = true;
                    return null;
                }
                try {
                    declaredField.setAccessible(true);
                    f22045OooO00o = declaredField;
                } catch (IllegalAccessException | NoSuchFieldException unused) {
                    f22046OooO00o = true;
                    return null;
                }
            }
            Bundle bundle = (Bundle) f22045OooO00o.get(notification);
            if (bundle == null) {
                bundle = new Bundle();
                f22045OooO00o.set(notification, bundle);
            }
            return bundle;
        }
    }

    public static C8844ooO0Oo0.OooO00o OooO00o(C8844ooO0Oo0.OooO00o.AbstractC4975OooO00o oooO00o, C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o oooO00o2, int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        boolean z;
        C8852ooO0OoOo.OooO00o[] oooO00oArr;
        C8852ooO0OoOo.OooO00o[] oooO00oArr2;
        if (bundle != null) {
            C8852ooO0OoOo.OooO00o[] OooO00o2 = C8853ooO0Ooo0.OooO00o(C8835ooO0OO0O.OooO00o(bundle, "android.support.remoteInputs"), oooO00o2);
            oooO00oArr = C8853ooO0Ooo0.OooO00o(C8835ooO0OO0O.OooO00o(bundle, "android.support.dataRemoteInputs"), oooO00o2);
            oooO00oArr2 = OooO00o2;
            z = bundle.getBoolean("android.support.allowGeneratedReplies");
        } else {
            oooO00oArr2 = null;
            oooO00oArr = null;
            z = false;
        }
        return oooO00o.OooO00o(i, charSequence, pendingIntent, bundle, oooO00oArr2, oooO00oArr, z);
    }

    public static Bundle OooO00o(Notification.Builder builder, C8844ooO0Oo0.OooO00o oooO00o) {
        builder.addAction(oooO00o.OooO00o(), oooO00o.m20470OooO00o(), oooO00o.m20468OooO00o());
        Bundle bundle = new Bundle(oooO00o.m20469OooO00o());
        if (oooO00o.OooO0O0() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", C8853ooO0Ooo0.OooO00o(oooO00o.OooO0O0()));
        }
        if (oooO00o.m20472OooO00o() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", C8853ooO0Ooo0.OooO00o(oooO00o.m20472OooO00o()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", oooO00o.m20471OooO00o());
        return bundle;
    }

    public static int OooO00o(Notification notification) {
        int length;
        synchronized (OooO0O0) {
            Object[] OooO00o2 = m20480OooO00o(notification);
            length = OooO00o2 != null ? OooO00o2.length : 0;
        }
        return length;
    }

    public static C8844ooO0Oo0.OooO00o OooO00o(Notification notification, int i, C8844ooO0Oo0.OooO00o.AbstractC4975OooO00o oooO00o, C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o oooO00o2) {
        SparseArray sparseParcelableArray;
        synchronized (OooO0O0) {
            try {
                Object[] OooO00o2 = m20480OooO00o(notification);
                if (OooO00o2 != null) {
                    Object obj = OooO00o2[i];
                    Bundle OooO00o3 = m20479OooO00o(notification);
                    return OooO00o(oooO00o, oooO00o2, f22050OooO0OO.getInt(obj), (CharSequence) f22051OooO0Oo.get(obj), (PendingIntent) f22052OooO0o0.get(obj), (OooO00o3 == null || (sparseParcelableArray = OooO00o3.getSparseParcelableArray("android.support.actionExtras")) == null) ? null : (Bundle) sparseParcelableArray.get(i));
                }
            } catch (IllegalAccessException unused) {
                f22049OooO0O0 = true;
            } catch (Throwable th) {
                throw th;
            }
            return null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Object[] m20480OooO00o(Notification notification) {
        synchronized (OooO0O0) {
            if (!OooO00o()) {
                return null;
            }
            try {
                return (Object[]) f22048OooO0O0.get(notification);
            } catch (IllegalAccessException unused) {
                f22049OooO0O0 = true;
                return null;
            }
        }
    }

    public static boolean OooO00o() {
        if (f22049OooO0O0) {
            return false;
        }
        try {
            if (f22048OooO0O0 == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                OooO00o = cls;
                f22050OooO0OO = cls.getDeclaredField("icon");
                f22051OooO0Oo = OooO00o.getDeclaredField("title");
                f22052OooO0o0 = OooO00o.getDeclaredField("actionIntent");
                Field declaredField = Notification.class.getDeclaredField("actions");
                f22048OooO0O0 = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException unused) {
            f22049OooO0O0 = true;
        } catch (NoSuchFieldException unused2) {
            f22049OooO0O0 = true;
        }
        return true ^ f22049OooO0O0;
    }

    public static C8844ooO0Oo0.OooO00o[] OooO00o(ArrayList<Parcelable> arrayList, C8844ooO0Oo0.OooO00o.AbstractC4975OooO00o oooO00o, C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o oooO00o2) {
        if (arrayList == null) {
            return null;
        }
        C8844ooO0Oo0.OooO00o[] OooO00o2 = oooO00o.OooO00o(arrayList.size());
        for (int i = 0; i < OooO00o2.length; i++) {
            OooO00o2[i] = OooO00o((Bundle) arrayList.get(i), oooO00o, oooO00o2);
        }
        return OooO00o2;
    }

    public static C8844ooO0Oo0.OooO00o OooO00o(Bundle bundle, C8844ooO0Oo0.OooO00o.AbstractC4975OooO00o oooO00o, C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o oooO00o2) {
        Bundle bundle2 = bundle.getBundle("extras");
        return oooO00o.OooO00o(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), C8853ooO0Ooo0.OooO00o(C8835ooO0OO0O.OooO00o(bundle, "remoteInputs"), oooO00o2), C8853ooO0Ooo0.OooO00o(C8835ooO0OO0O.OooO00o(bundle, "dataOnlyRemoteInputs"), oooO00o2), bundle2 != null ? bundle2.getBoolean("android.support.allowGeneratedReplies", false) : false);
    }

    public static ArrayList<Parcelable> OooO00o(C8844ooO0Oo0.OooO00o[] oooO00oArr) {
        if (oooO00oArr == null) {
            return null;
        }
        ArrayList<Parcelable> arrayList = new ArrayList<>(oooO00oArr.length);
        for (C8844ooO0Oo0.OooO00o oooO00o : oooO00oArr) {
            arrayList.add(OooO00o(oooO00o));
        }
        return arrayList;
    }

    public static Bundle OooO00o(C8844ooO0Oo0.OooO00o oooO00o) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("icon", oooO00o.OooO00o());
        bundle2.putCharSequence("title", oooO00o.m20470OooO00o());
        bundle2.putParcelable("actionIntent", oooO00o.m20468OooO00o());
        if (oooO00o.m20469OooO00o() != null) {
            bundle = new Bundle(oooO00o.m20469OooO00o());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", oooO00o.m20471OooO00o());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", C8853ooO0Ooo0.OooO00o(oooO00o.OooO0O0()));
        return bundle2;
    }
}
