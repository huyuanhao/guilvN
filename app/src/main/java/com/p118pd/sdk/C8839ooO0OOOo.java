package com.p118pd.sdk;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.netease.nimlib.notifier.support26.annotation.RequiresApi;
import com.p118pd.sdk.C8844ooO0Oo0;
import com.p118pd.sdk.C8852ooO0OoOo;
import java.util.ArrayList;
import java.util.Iterator;

@RequiresApi(21)
/* renamed from: com.pd.sdk.ooO0OOOo  reason: case insensitive filesystem */
public class C8839ooO0OOOo {
    public static final String OooO = "err";
    public static final String OooO00o = "call";
    public static final String OooO0O0 = "msg";
    public static final String OooO0OO = "email";
    public static final String OooO0Oo = "event";
    public static final String OooO0o = "alarm";
    public static final String OooO0o0 = "promo";
    public static final String OooO0oO = "progress";
    public static final String OooO0oo = "social";
    public static final String OooOO0 = "transport";
    public static final String OooOO0O = "sys";
    public static final String OooOO0o = "service";
    public static final String OooOOO = "status";
    public static final String OooOOO0 = "recommendation";
    public static final String OooOOOO = "author";
    public static final String OooOOOo = "text";
    public static final String OooOOo = "remote_input";
    public static final String OooOOo0 = "messages";
    public static final String OooOOoo = "on_reply";
    public static final String OooOo0 = "participants";
    public static final String OooOo00 = "on_read";
    public static final String OooOo0O = "timestamp";

    /* renamed from: com.pd.sdk.ooO0OOOo$OooO00o */
    public static class OooO00o implements AbstractC8832ooO0OO, AbstractC8836ooO0OO0o {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Notification.Builder f22036OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bundle f22037OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public RemoteViews f22038OooO00o;
        public RemoteViews OooO0O0;
        public RemoteViews OooO0OO;

        public OooO00o(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList<String> arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4, int i7) {
            PendingIntent pendingIntent3;
            boolean z6 = true;
            Notification.Builder deleteIntent = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
            if ((notification.flags & 128) != 0) {
                pendingIntent3 = pendingIntent2;
            } else {
                pendingIntent3 = pendingIntent2;
                z6 = false;
            }
            this.f22036OooO00o = deleteIntent.setFullScreenIntent(pendingIntent3, z6).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2);
            Bundle bundle2 = new Bundle();
            this.f22037OooO00o = bundle2;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                this.f22036OooO00o.addPerson(it.next());
            }
            this.f22038OooO00o = remoteViews2;
            this.OooO0O0 = remoteViews3;
            this.OooO0OO = remoteViews4;
            this.OooO00o = i7;
        }

        @Override // com.p118pd.sdk.AbstractC8836ooO0OO0o
        public void OooO00o(C8844ooO0Oo0.OooO00o oooO00o) {
            C8838ooO0OOO0.OooO00o(this.f22036OooO00o, oooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC8832ooO0OO, com.p118pd.sdk.AbstractC8832ooO0OO
        public Notification.Builder OooO00o() {
            return this.f22036OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC8832ooO0OO, com.p118pd.sdk.AbstractC8832ooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Notification m20466OooO00o() {
            this.f22036OooO00o.setExtras(this.f22037OooO00o);
            Notification build = this.f22036OooO00o.build();
            RemoteViews remoteViews = this.f22038OooO00o;
            if (remoteViews != null) {
                build.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.OooO0O0;
            if (remoteViews2 != null) {
                build.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.OooO0OO;
            if (remoteViews3 != null) {
                build.headsUpContentView = remoteViews3;
            }
            if (this.OooO00o != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.OooO00o != 2)) {
                    OooO00o(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.OooO00o == 1) {
                    OooO00o(build);
                }
            }
            return build;
        }

        private void OooO00o(Notification notification) {
            notification.sound = null;
            notification.vibrate = null;
            int i = notification.defaults & -2;
            notification.defaults = i;
            notification.defaults = i & -3;
        }
    }

    public static Bundle OooO00o(C8844ooO0Oo0.OooO0O0 oooO0O0) {
        String str = null;
        if (oooO0O0 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (oooO0O0.m20477OooO0O0() != null && oooO0O0.m20477OooO0O0().length > 1) {
            str = oooO0O0.m20477OooO0O0()[0];
        }
        int length = oooO0O0.m20476OooO00o().length;
        Parcelable[] parcelableArr = new Parcelable[length];
        for (int i = 0; i < length; i++) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("text", oooO0O0.m20476OooO00o()[i]);
            bundle2.putString("author", str);
            parcelableArr[i] = bundle2;
        }
        bundle.putParcelableArray("messages", parcelableArr);
        C8852ooO0OoOo.OooO00o OooO00o2 = oooO0O0.m20474OooO00o();
        if (OooO00o2 != null) {
            bundle.putParcelable("remote_input", OooO00o(OooO00o2));
        }
        bundle.putParcelable("on_reply", oooO0O0.OooO0O0());
        bundle.putParcelable("on_read", oooO0O0.m20473OooO00o());
        bundle.putStringArray("participants", oooO0O0.m20477OooO0O0());
        bundle.putLong("timestamp", oooO0O0.OooO00o());
        return bundle;
    }

    public static C8844ooO0Oo0.OooO0O0 OooO00o(Bundle bundle, C8844ooO0Oo0.OooO0O0.OooO00o oooO00o, C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o oooO00o2) {
        String[] strArr;
        C8852ooO0OoOo.OooO00o oooO00o3 = null;
        if (bundle == null) {
            return null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("messages");
        if (parcelableArray != null) {
            int length = parcelableArray.length;
            String[] strArr2 = new String[length];
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                } else if (!(parcelableArray[i] instanceof Bundle)) {
                    break;
                } else {
                    strArr2[i] = ((Bundle) parcelableArray[i]).getString("text");
                    if (strArr2[i] == null) {
                        break;
                    }
                    i++;
                }
            }
            if (!z) {
                return null;
            }
            strArr = strArr2;
        } else {
            strArr = null;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("on_read");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("on_reply");
        RemoteInput remoteInput = (RemoteInput) bundle.getParcelable("remote_input");
        String[] stringArray = bundle.getStringArray("participants");
        if (stringArray == null || stringArray.length != 1) {
            return null;
        }
        if (remoteInput != null) {
            oooO00o3 = OooO00o(remoteInput, oooO00o2);
        }
        return oooO00o.OooO00o(strArr, oooO00o3, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
    }

    public static RemoteInput OooO00o(C8852ooO0OoOo.OooO00o oooO00o) {
        return new RemoteInput.Builder(oooO00o.m20490OooO00o()).setLabel(oooO00o.m20489OooO00o()).setChoices(oooO00o.m20493OooO00o()).setAllowFreeFormInput(oooO00o.m20492OooO00o()).addExtras(oooO00o.OooO00o()).build();
    }

    public static C8852ooO0OoOo.OooO00o OooO00o(RemoteInput remoteInput, C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o oooO00o) {
        return oooO00o.OooO00o(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), remoteInput.getExtras(), null);
    }
}
