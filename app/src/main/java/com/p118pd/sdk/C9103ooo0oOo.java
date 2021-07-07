package com.p118pd.sdk;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.netease.nimlib.notifier.support26.annotation.RequiresApi;
import com.p118pd.sdk.C8844ooO0Oo0;
import java.util.ArrayList;
import java.util.Iterator;

@RequiresApi(26)
/* renamed from: com.pd.sdk.ooo0oOo  reason: case insensitive filesystem */
public class C9103ooo0oOo {

    /* renamed from: com.pd.sdk.ooo0oOo$OooO00o */
    public static class OooO00o implements AbstractC8832ooO0OO, AbstractC8836ooO0OO0o {
        public Notification.Builder OooO00o;

        public OooO00o(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList<String> arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, CharSequence[] charSequenceArr, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4, String str4, int i7, String str5, long j, boolean z6, boolean z7, int i8) {
            PendingIntent pendingIntent3;
            boolean z8 = true;
            Notification.Builder deleteIntent = new Notification.Builder(context, str4).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
            if ((notification.flags & 128) != 0) {
                pendingIntent3 = pendingIntent2;
            } else {
                pendingIntent3 = pendingIntent2;
                z8 = false;
            }
            Notification.Builder groupAlertBehavior = deleteIntent.setFullScreenIntent(pendingIntent3, z8).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setExtras(bundle).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2).setRemoteInputHistory(charSequenceArr).setChannelId(str4).setBadgeIconType(i7).setShortcutId(str5).setTimeoutAfter(j).setGroupAlertBehavior(i8);
            this.OooO00o = groupAlertBehavior;
            if (z7) {
                groupAlertBehavior.setColorized(z6);
            }
            if (remoteViews2 != null) {
                this.OooO00o.setCustomContentView(remoteViews2);
            }
            if (remoteViews3 != null) {
                this.OooO00o.setCustomBigContentView(remoteViews3);
            }
            if (remoteViews4 != null) {
                this.OooO00o.setCustomHeadsUpContentView(remoteViews4);
            }
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                this.OooO00o.addPerson(it.next());
            }
        }

        @Override // com.p118pd.sdk.AbstractC8836ooO0OO0o
        public void OooO00o(C8844ooO0Oo0.OooO00o oooO00o) {
            C8845ooO0Oo00.OooO00o(this.OooO00o, oooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC8832ooO0OO, com.p118pd.sdk.AbstractC8832ooO0OO
        public Notification.Builder OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC8832ooO0OO, com.p118pd.sdk.AbstractC8832ooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Notification m20771OooO00o() {
            return this.OooO00o.build();
        }
    }
}
