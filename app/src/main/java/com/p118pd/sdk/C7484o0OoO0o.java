package com.p118pd.sdk;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o0OoO0o  reason: case insensitive filesystem */
public class C7484o0OoO0o implements AbstractC6992o000OO00 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Notification.Builder f20306OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Bundle f20307OooO00o = new Bundle();

    /* renamed from: OooO00o  reason: collision with other field name */
    public RemoteViews f20308OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final NotificationCompat.OooO0OO f20309OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<Bundle> f20310OooO00o = new ArrayList();
    public RemoteViews OooO0O0;
    public RemoteViews OooO0OO;

    public C7484o0OoO0o(NotificationCompat.OooO0OO oooO0OO) {
        ArrayList<String> arrayList;
        this.f20309OooO00o = oooO0OO;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f20306OooO00o = new Notification.Builder(oooO0OO.f13926OooO00o, oooO0OO.f13950OooO0Oo);
        } else {
            this.f20306OooO00o = new Notification.Builder(oooO0OO.f13926OooO00o);
        }
        Notification notification = oooO0OO.f13936OooO0O0;
        this.f20306OooO00o.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, oooO0OO.f13929OooO00o).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(oooO0OO.f13931OooO00o).setContentText(oooO0OO.f13939OooO0O0).setContentInfo(oooO0OO.f13944OooO0OO).setContentIntent(oooO0OO.f13925OooO00o).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(oooO0OO.f13937OooO0O0, (notification.flags & 128) != 0).setLargeIcon(oooO0OO.f13927OooO00o).setNumber(oooO0OO.OooO00o).setProgress(oooO0OO.OooO0OO, oooO0OO.OooO0Oo, oooO0OO.f13947OooO0OO);
        if (Build.VERSION.SDK_INT < 21) {
            this.f20306OooO00o.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f20306OooO00o.setSubText(oooO0OO.f13949OooO0Oo).setUsesChronometer(oooO0OO.f13942OooO0O0).setPriority(oooO0OO.OooO0O0);
            Iterator<NotificationCompat.Action> it = oooO0OO.f13933OooO00o.iterator();
            while (it.hasNext()) {
                OooO00o(it.next());
            }
            Bundle bundle = oooO0OO.f13928OooO00o;
            if (bundle != null) {
                this.f20307OooO00o.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (oooO0OO.f13954OooO0o0) {
                    this.f20307OooO00o.putBoolean("android.support.localOnly", true);
                }
                String str = oooO0OO.f13932OooO00o;
                if (str != null) {
                    this.f20307OooO00o.putString("android.support.groupKey", str);
                    if (oooO0OO.f13951OooO0Oo) {
                        this.f20307OooO00o.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f20307OooO00o.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = oooO0OO.f13940OooO0O0;
                if (str2 != null) {
                    this.f20307OooO00o.putString("android.support.sortKey", str2);
                }
            }
            this.f20308OooO00o = oooO0OO.f13938OooO0O0;
            this.OooO0O0 = oooO0OO.f13943OooO0OO;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f20306OooO00o.setShowWhen(oooO0OO.f13934OooO00o);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = oooO0OO.f13946OooO0OO) != null && !arrayList.isEmpty()) {
                Bundle bundle2 = this.f20307OooO00o;
                ArrayList<String> arrayList2 = oooO0OO.f13946OooO0OO;
                bundle2.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f20306OooO00o.setLocalOnly(oooO0OO.f13954OooO0o0).setGroup(oooO0OO.f13932OooO00o).setGroupSummary(oooO0OO.f13951OooO0Oo).setSortKey(oooO0OO.f13940OooO0O0);
            this.OooO00o = oooO0OO.OooO0oo;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f20306OooO00o.setCategory(oooO0OO.f13945OooO0OO).setColor(oooO0OO.OooO0o0).setVisibility(oooO0OO.OooO0o).setPublicVersion(oooO0OO.f13924OooO00o).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = oooO0OO.f13946OooO0OO.iterator();
            while (it2.hasNext()) {
                this.f20306OooO00o.addPerson(it2.next());
            }
            this.OooO0OO = oooO0OO.f13948OooO0Oo;
            if (oooO0OO.f13941OooO0O0.size() > 0) {
                Bundle bundle3 = oooO0OO.m14501OooO00o().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle();
                for (int i = 0; i < oooO0OO.f13941OooO0O0.size(); i++) {
                    bundle4.putBundle(Integer.toString(i), C6994o000OOO.OooO00o(oooO0OO.f13941OooO0O0.get(i)));
                }
                bundle3.putBundle(NotificationCompat.C5028OooO0Oo.OooO0o0, bundle4);
                oooO0OO.m14501OooO00o().putBundle("android.car.EXTENSIONS", bundle3);
                this.f20307OooO00o.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f20306OooO00o.setExtras(oooO0OO.f13928OooO00o).setRemoteInputHistory(oooO0OO.f13935OooO00o);
            RemoteViews remoteViews = oooO0OO.f13938OooO0O0;
            if (remoteViews != null) {
                this.f20306OooO00o.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = oooO0OO.f13943OooO0OO;
            if (remoteViews2 != null) {
                this.f20306OooO00o.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = oooO0OO.f13948OooO0Oo;
            if (remoteViews3 != null) {
                this.f20306OooO00o.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f20306OooO00o.setBadgeIconType(oooO0OO.OooO0oO).setShortcutId(oooO0OO.f13953OooO0o0).setTimeoutAfter(oooO0OO.f13923OooO00o).setGroupAlertBehavior(oooO0OO.OooO0oo);
            if (oooO0OO.f13955OooO0oO) {
                this.f20306OooO00o.setColorized(oooO0OO.f13952OooO0o);
            }
            if (!TextUtils.isEmpty(oooO0OO.f13950OooO0Oo)) {
                this.f20306OooO00o.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6992o000OO00
    public Notification.Builder OooO00o() {
        return this.f20306OooO00o;
    }

    public Notification OooO0O0() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f20306OooO00o.build();
        }
        if (i >= 24) {
            Notification build = this.f20306OooO00o.build();
            if (this.OooO00o != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.OooO00o != 2)) {
                    OooO00o(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.OooO00o == 1) {
                    OooO00o(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f20306OooO00o.setExtras(this.f20307OooO00o);
            Notification build2 = this.f20306OooO00o.build();
            RemoteViews remoteViews = this.f20308OooO00o;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.OooO0O0;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.OooO0OO;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.OooO00o != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.OooO00o != 2)) {
                    OooO00o(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.OooO00o == 1) {
                    OooO00o(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f20306OooO00o.setExtras(this.f20307OooO00o);
            Notification build3 = this.f20306OooO00o.build();
            RemoteViews remoteViews4 = this.f20308OooO00o;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.OooO0O0;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.OooO00o != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.OooO00o != 2)) {
                    OooO00o(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.OooO00o == 1) {
                    OooO00o(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> OooO00o2 = C6994o000OOO.OooO00o(this.f20310OooO00o);
            if (OooO00o2 != null) {
                this.f20307OooO00o.putSparseParcelableArray("android.support.actionExtras", OooO00o2);
            }
            this.f20306OooO00o.setExtras(this.f20307OooO00o);
            Notification build4 = this.f20306OooO00o.build();
            RemoteViews remoteViews6 = this.f20308OooO00o;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.OooO0O0;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f20306OooO00o.getNotification();
        } else {
            Notification build5 = this.f20306OooO00o.build();
            Bundle OooO00o3 = NotificationCompat.m14477OooO00o(build5);
            Bundle bundle = new Bundle(this.f20307OooO00o);
            for (String str : this.f20307OooO00o.keySet()) {
                if (OooO00o3.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            OooO00o3.putAll(bundle);
            SparseArray<Bundle> OooO00o4 = C6994o000OOO.OooO00o(this.f20310OooO00o);
            if (OooO00o4 != null) {
                NotificationCompat.m14477OooO00o(build5).putSparseParcelableArray("android.support.actionExtras", OooO00o4);
            }
            RemoteViews remoteViews8 = this.f20308OooO00o;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.OooO0O0;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6992o000OO00
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Notification m19109OooO00o() {
        Bundle OooO00o2;
        RemoteViews OooO0OO2;
        RemoteViews OooO00o3;
        NotificationCompat.OooO oooO = this.f20309OooO00o.f13930OooO00o;
        if (oooO != null) {
            oooO.m14498OooO00o((AbstractC6992o000OO00) this);
        }
        RemoteViews OooO0O02 = oooO != null ? oooO.OooO0O0(this) : null;
        Notification OooO0O03 = OooO0O0();
        if (OooO0O02 != null) {
            OooO0O03.contentView = OooO0O02;
        } else {
            RemoteViews remoteViews = this.f20309OooO00o.f13938OooO0O0;
            if (remoteViews != null) {
                OooO0O03.contentView = remoteViews;
            }
        }
        if (!(Build.VERSION.SDK_INT < 16 || oooO == null || (OooO00o3 = oooO.OooO00o((AbstractC6992o000OO00) this)) == null)) {
            OooO0O03.bigContentView = OooO00o3;
        }
        if (!(Build.VERSION.SDK_INT < 21 || oooO == null || (OooO0OO2 = this.f20309OooO00o.f13930OooO00o.OooO0OO(this)) == null)) {
            OooO0O03.headsUpContentView = OooO0OO2;
        }
        if (!(Build.VERSION.SDK_INT < 16 || oooO == null || (OooO00o2 = NotificationCompat.m14477OooO00o(OooO0O03)) == null)) {
            oooO.OooO00o(OooO00o2);
        }
        return OooO0O03;
    }

    private void OooO00o(NotificationCompat.Action action) {
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            Notification.Action.Builder builder = new Notification.Action.Builder(action.OooO00o(), action.m14487OooO00o(), action.m14485OooO00o());
            if (action.m14491OooO0O0() != null) {
                for (RemoteInput remoteInput : C7002o000Oo00.OooO00o(action.m14491OooO0O0())) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            if (action.m14486OooO00o() != null) {
                bundle = new Bundle(action.m14486OooO00o());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.m14488OooO00o());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(action.m14488OooO00o());
            }
            bundle.putInt(NotificationCompat.Action.OooO0O0, action.OooO0O0());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(action.OooO0O0());
            }
            bundle.putBoolean(NotificationCompat.Action.OooO00o, action.m14490OooO0O0());
            builder.addExtras(bundle);
            this.f20306OooO00o.addAction(builder.build());
        } else if (i >= 16) {
            this.f20310OooO00o.add(C6994o000OOO.OooO00o(this.f20306OooO00o, action));
        }
    }

    private void OooO00o(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & -2;
        notification.defaults = i;
        notification.defaults = i & -3;
    }
}
