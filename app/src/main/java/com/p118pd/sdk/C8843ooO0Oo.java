package com.p118pd.sdk;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import com.netease.nimlib.notifier.support26.annotation.RequiresApi;
import com.p118pd.sdk.C8844ooO0Oo0;
import com.p118pd.sdk.C8852ooO0OoOo;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(19)
/* renamed from: com.pd.sdk.ooO0Oo  reason: case insensitive filesystem */
public class C8843ooO0Oo {

    /* renamed from: com.pd.sdk.ooO0Oo$OooO00o */
    public static class OooO00o implements AbstractC8832ooO0OO, AbstractC8836ooO0OO0o {
        public Notification.Builder OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bundle f22039OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public RemoteViews f22040OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<Bundle> f22041OooO00o = new ArrayList();
        public RemoteViews OooO0O0;

        public OooO00o(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList<String> arrayList, Bundle bundle, String str, boolean z5, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
            PendingIntent pendingIntent3;
            boolean z6 = false;
            Notification.Builder deleteIntent = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
            if ((notification.flags & 128) != 0) {
                pendingIntent3 = pendingIntent2;
                z6 = true;
            } else {
                pendingIntent3 = pendingIntent2;
            }
            this.OooO00o = deleteIntent.setFullScreenIntent(pendingIntent3, z6).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z);
            Bundle bundle2 = new Bundle();
            this.f22039OooO00o = bundle2;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f22039OooO00o.putStringArray("android.people", (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
            if (z4) {
                this.f22039OooO00o.putBoolean("android.support.localOnly", true);
            }
            if (str != null) {
                this.f22039OooO00o.putString("android.support.groupKey", str);
                if (z5) {
                    this.f22039OooO00o.putBoolean("android.support.isGroupSummary", true);
                } else {
                    this.f22039OooO00o.putBoolean("android.support.useSideChannel", true);
                }
            }
            if (str2 != null) {
                this.f22039OooO00o.putString("android.support.sortKey", str2);
            }
            this.f22040OooO00o = remoteViews2;
            this.OooO0O0 = remoteViews3;
        }

        @Override // com.p118pd.sdk.AbstractC8836ooO0OO0o
        public void OooO00o(C8844ooO0Oo0.OooO00o oooO00o) {
            this.f22041OooO00o.add(C8847ooO0Oo0o.OooO00o(this.OooO00o, oooO00o));
        }

        @Override // com.p118pd.sdk.AbstractC8832ooO0OO, com.p118pd.sdk.AbstractC8832ooO0OO
        public Notification.Builder OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC8832ooO0OO, com.p118pd.sdk.AbstractC8832ooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Notification m20467OooO00o() {
            SparseArray<Bundle> OooO00o2 = C8847ooO0Oo0o.OooO00o(this.f22041OooO00o);
            if (OooO00o2 != null) {
                this.f22039OooO00o.putSparseParcelableArray("android.support.actionExtras", OooO00o2);
            }
            this.OooO00o.setExtras(this.f22039OooO00o);
            Notification build = this.OooO00o.build();
            RemoteViews remoteViews = this.f22040OooO00o;
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

    public static C8844ooO0Oo0.OooO00o OooO00o(Notification notification, int i, C8844ooO0Oo0.OooO00o.AbstractC4975OooO00o oooO00o, C8852ooO0OoOo.OooO00o.AbstractC4976OooO00o oooO00o2) {
        Notification.Action action = notification.actions[i];
        SparseArray sparseParcelableArray = notification.extras.getSparseParcelableArray("android.support.actionExtras");
        return C8847ooO0Oo0o.OooO00o(oooO00o, oooO00o2, action.icon, action.title, action.actionIntent, sparseParcelableArray != null ? (Bundle) sparseParcelableArray.get(i) : null);
    }
}
