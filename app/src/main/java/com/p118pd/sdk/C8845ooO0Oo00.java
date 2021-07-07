package com.p118pd.sdk;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.netease.nimlib.notifier.support26.annotation.RequiresApi;
import com.p118pd.sdk.C8844ooO0Oo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RequiresApi(24)
/* renamed from: com.pd.sdk.ooO0Oo00  reason: case insensitive filesystem */
public class C8845ooO0Oo00 {

    /* renamed from: com.pd.sdk.ooO0Oo00$OooO00o */
    public static class OooO00o implements AbstractC8832ooO0OO, AbstractC8836ooO0OO0o {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Notification.Builder f22042OooO00o;

        public OooO00o(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList<String> arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, CharSequence[] charSequenceArr, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4, int i7) {
            PendingIntent pendingIntent3;
            boolean z6 = true;
            Notification.Builder deleteIntent = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
            if ((notification.flags & 128) != 0) {
                pendingIntent3 = pendingIntent2;
            } else {
                pendingIntent3 = pendingIntent2;
                z6 = false;
            }
            Notification.Builder remoteInputHistory = deleteIntent.setFullScreenIntent(pendingIntent3, z6).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setExtras(bundle).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2).setRemoteInputHistory(charSequenceArr);
            this.f22042OooO00o = remoteInputHistory;
            if (remoteViews2 != null) {
                remoteInputHistory.setCustomContentView(remoteViews2);
            }
            if (remoteViews3 != null) {
                this.f22042OooO00o.setCustomBigContentView(remoteViews3);
            }
            if (remoteViews4 != null) {
                this.f22042OooO00o.setCustomHeadsUpContentView(remoteViews4);
            }
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                this.f22042OooO00o.addPerson(it.next());
            }
            this.OooO00o = i7;
        }

        @Override // com.p118pd.sdk.AbstractC8836ooO0OO0o
        public void OooO00o(C8844ooO0Oo0.OooO00o oooO00o) {
            C8845ooO0Oo00.OooO00o(this.f22042OooO00o, oooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC8832ooO0OO, com.p118pd.sdk.AbstractC8832ooO0OO
        public Notification.Builder OooO00o() {
            return this.f22042OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC8832ooO0OO, com.p118pd.sdk.AbstractC8832ooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Notification m20478OooO00o() {
            Notification build = this.f22042OooO00o.build();
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

    public static void OooO00o(AbstractC8832ooO0OO ooo0oo, CharSequence charSequence, CharSequence charSequence2, List<CharSequence> list, List<Long> list2, List<CharSequence> list3, List<String> list4, List<Uri> list5) {
        Notification.MessagingStyle conversationTitle = new Notification.MessagingStyle(charSequence).setConversationTitle(charSequence2);
        for (int i = 0; i < list.size(); i++) {
            Notification.MessagingStyle.Message message = new Notification.MessagingStyle.Message(list.get(i), list2.get(i).longValue(), list3.get(i));
            if (list4.get(i) != null) {
                message.setData(list4.get(i), list5.get(i));
            }
            conversationTitle.addMessage(message);
        }
        conversationTitle.setBuilder(ooo0oo.OooO00o());
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
        builder2.setAllowGeneratedReplies(oooO00o.m20471OooO00o());
        builder.addAction(builder2.build());
    }
}
