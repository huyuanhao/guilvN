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

@RequiresApi(20)
/* renamed from: com.pd.sdk.ooO0OOO0  reason: case insensitive filesystem */
public class C8838ooO0OOO0 {

    /* renamed from: com.pd.sdk.ooO0OOO0$OooO00o */
    public static class OooO00o implements AbstractC8832ooO0OO, AbstractC8836ooO0OO0o {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Notification.Builder f22033OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bundle f22034OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public RemoteViews f22035OooO00o;
        public RemoteViews OooO0O0;

        public OooO00o(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList<String> arrayList, Bundle bundle, String str, boolean z5, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3, int i5) {
            PendingIntent pendingIntent3;
            boolean z6 = true;
            Notification.Builder deleteIntent = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
            if ((notification.flags & 128) != 0) {
                pendingIntent3 = pendingIntent2;
            } else {
                pendingIntent3 = pendingIntent2;
                z6 = false;
            }
            this.f22033OooO00o = deleteIntent.setFullScreenIntent(pendingIntent3, z6).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str).setGroupSummary(z5).setSortKey(str2);
            Bundle bundle2 = new Bundle();
            this.f22034OooO00o = bundle2;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f22034OooO00o.putStringArray("android.people", (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
            this.f22035OooO00o = remoteViews2;
            this.OooO0O0 = remoteViews3;
            this.OooO00o = i5;
        }

        @Override // com.p118pd.sdk.AbstractC8836ooO0OO0o
        public void OooO00o(C8844ooO0Oo0.OooO00o oooO00o) {
            C8838ooO0OOO0.OooO00o(this.f22033OooO00o, oooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC8832ooO0OO, com.p118pd.sdk.AbstractC8832ooO0OO
        public Notification.Builder OooO00o() {
            return this.f22033OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC8832ooO0OO, com.p118pd.sdk.AbstractC8832ooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Notification m20465OooO00o() {
            this.f22033OooO00o.setExtras(this.f22034OooO00o);
            Notification build = this.f22033OooO00o.build();
            RemoteViews remoteViews = this.f22035OooO00o;
            if (remoteViews != null) {
                build.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.OooO0O0;
            if (remoteViews2 != null) {
                build.bigContentView = remoteViews2;
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

    public static void OooO00o(Notification.Builder builder, C8844ooO0Oo0.OooO00o oooO00o) {
        Bundle bundle;
        Notification.Action.Builder builder2 = new Notification.Action.Builder(oooO00o.OooO00o(), oooO00o.m20470OooO00o(), oooO00o.m20468OooO00o());
        if (oooO00o.OooO0O0() != null) {
            for (RemoteInput remoteInput : C8848ooO0OoO.OooO00o(oooO00o.OooO0O0())) {
                builder2.addRemoteInput(remoteInput);
            }
        }
        if (oooO00o.m20469OooO00o() != null) {
            bundle = new Bundle(oooO00o.m20469OooO00o());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", oooO00o.m20471OooO00o());
        builder2.addExtras(bundle);
        builder.addAction(builder2.build());
    }

    public static C8844ooO0Oo0.OooO00o OooO00o(Notification notification, int i, C8844ooO0Oo0.OooO00o.AbstractC4975OooO00o oooO00o, C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o oooO00o2) {
        return OooO00o(notification.actions[i], oooO00o, oooO00o2);
    }

    public static C8844ooO0Oo0.OooO00o OooO00o(Notification.Action action, C8844ooO0Oo0.OooO00o.AbstractC4975OooO00o oooO00o, C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o oooO00o2) {
        return oooO00o.OooO00o(action.icon, action.title, action.actionIntent, action.getExtras(), C8848ooO0OoO.OooO00o(action.getRemoteInputs(), oooO00o2), null, action.getExtras().getBoolean("android.support.allowGeneratedReplies"));
    }

    public static Notification.Action OooO00o(C8844ooO0Oo0.OooO00o oooO00o) {
        Bundle bundle;
        Notification.Action.Builder builder = new Notification.Action.Builder(oooO00o.OooO00o(), oooO00o.m20470OooO00o(), oooO00o.m20468OooO00o());
        if (oooO00o.m20469OooO00o() != null) {
            bundle = new Bundle(oooO00o.m20469OooO00o());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", oooO00o.m20471OooO00o());
        builder.addExtras(bundle);
        C8852ooO0OoOo.OooO00o[] OooO0O0 = oooO00o.OooO0O0();
        if (OooO0O0 != null) {
            for (RemoteInput remoteInput : C8848ooO0OoO.OooO00o(OooO0O0)) {
                builder.addRemoteInput(remoteInput);
            }
        }
        return builder.build();
    }

    public static C8844ooO0Oo0.OooO00o[] OooO00o(ArrayList<Parcelable> arrayList, C8844ooO0Oo0.OooO00o.AbstractC4975OooO00o oooO00o, C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o oooO00o2) {
        if (arrayList == null) {
            return null;
        }
        C8844ooO0Oo0.OooO00o[] OooO00o2 = oooO00o.OooO00o(arrayList.size());
        for (int i = 0; i < OooO00o2.length; i++) {
            OooO00o2[i] = OooO00o((Notification.Action) arrayList.get(i), oooO00o, oooO00o2);
        }
        return OooO00o2;
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
}
