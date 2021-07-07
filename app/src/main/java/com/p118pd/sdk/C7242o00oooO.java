package com.p118pd.sdk;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.media.C0078R;

/* renamed from: com.pd.sdk.o00oooO  reason: case insensitive filesystem */
public class C7242o00oooO {

    /* renamed from: com.pd.sdk.o00oooO$OooO0O0 */
    public static class OooO0O0 extends NotificationCompat.OooO {
        public static final int OooO00o = 3;
        public static final int OooO0O0 = 5;

        /* renamed from: OooO00o  reason: collision with other field name */
        public PendingIntent f19773OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public MediaSessionCompat.Token f19774OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f19775OooO00o = null;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f19776OooO0O0;

        public OooO0O0() {
        }

        public static MediaSessionCompat.Token OooO00o(Notification notification) {
            Bundle OooO00o2 = NotificationCompat.m14477OooO00o(notification);
            if (OooO00o2 == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                Parcelable parcelable = OooO00o2.getParcelable("android.mediaSession");
                if (parcelable != null) {
                    return MediaSessionCompat.Token.fromToken(parcelable);
                }
                return null;
            }
            IBinder OooO00o3 = C6990o000O0oo.OooO00o(OooO00o2, "android.mediaSession");
            if (OooO00o3 == null) {
                return null;
            }
            Parcel obtain = Parcel.obtain();
            obtain.writeStrongBinder(OooO00o3);
            obtain.setDataPosition(0);
            MediaSessionCompat.Token createFromParcel = MediaSessionCompat.Token.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            return createFromParcel;
        }

        @Override // androidx.core.app.NotificationCompat.OooO
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews OooO0O0(AbstractC6992o000OO00 o000oo00) {
            if (Build.VERSION.SDK_INT >= 21) {
                return null;
            }
            return m18724OooO0O0();
        }

        public OooO0O0(NotificationCompat.OooO0OO oooO0OO) {
            OooO00o(oooO0OO);
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public RemoteViews m18724OooO0O0() {
            int i;
            RemoteViews OooO00o2 = OooO00o(false, OooO0O0(), true);
            int size = ((NotificationCompat.OooO) this).OooO00o.f13933OooO00o.size();
            int[] iArr = this.f19775OooO00o;
            if (iArr == null) {
                i = 0;
            } else {
                i = Math.min(iArr.length, 3);
            }
            OooO00o2.removeAllViews(C0078R.C0081id.media_actions);
            if (i > 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (i2 < size) {
                        OooO00o2.addView(C0078R.C0081id.media_actions, OooO00o(((NotificationCompat.OooO) this).OooO00o.f13933OooO00o.get(this.f19775OooO00o[i2])));
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i2), Integer.valueOf(size - 1)));
                    }
                }
            }
            if (this.f19776OooO0O0) {
                OooO00o2.setViewVisibility(C0078R.C0081id.end_padder, 8);
                OooO00o2.setViewVisibility(C0078R.C0081id.cancel_action, 0);
                OooO00o2.setOnClickPendingIntent(C0078R.C0081id.cancel_action, this.f19773OooO00o);
                OooO00o2.setInt(C0078R.C0081id.cancel_action, "setAlpha", ((NotificationCompat.OooO) this).OooO00o.f13926OooO00o.getResources().getInteger(C0078R.integer.cancel_button_image_alpha));
            } else {
                OooO00o2.setViewVisibility(C0078R.C0081id.end_padder, 0);
                OooO00o2.setViewVisibility(C0078R.C0081id.cancel_action, 8);
            }
            return OooO00o2;
        }

        public OooO0O0 OooO00o(int... iArr) {
            this.f19775OooO00o = iArr;
            return this;
        }

        public OooO0O0 OooO00o(MediaSessionCompat.Token token) {
            this.f19774OooO00o = token;
            return this;
        }

        public OooO0O0 OooO00o(boolean z) {
            if (Build.VERSION.SDK_INT < 21) {
                this.f19776OooO0O0 = z;
            }
            return this;
        }

        public OooO0O0 OooO00o(PendingIntent pendingIntent) {
            this.f19773OooO00o = pendingIntent;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.OooO, androidx.core.app.NotificationCompat.OooO
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18723OooO00o(AbstractC6992o000OO00 o000oo00) {
            if (Build.VERSION.SDK_INT >= 21) {
                o000oo00.OooO00o().setStyle(OooO00o(new Notification.MediaStyle()));
            } else if (this.f19776OooO0O0) {
                o000oo00.OooO00o().setOngoing(true);
            }
        }

        @RequiresApi(21)
        public Notification.MediaStyle OooO00o(Notification.MediaStyle mediaStyle) {
            int[] iArr = this.f19775OooO00o;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            MediaSessionCompat.Token token = this.f19774OooO00o;
            if (token != null) {
                mediaStyle.setMediaSession((MediaSession.Token) token.getToken());
            }
            return mediaStyle;
        }

        public int OooO0O0() {
            return C0078R.layout.notification_template_media;
        }

        private RemoteViews OooO00o(NotificationCompat.Action action) {
            boolean z = action.m14485OooO00o() == null;
            RemoteViews remoteViews = new RemoteViews(((NotificationCompat.OooO) this).OooO00o.f13926OooO00o.getPackageName(), C0078R.layout.notification_media_action);
            remoteViews.setImageViewResource(C0078R.C0081id.action0, action.OooO00o());
            if (!z) {
                remoteViews.setOnClickPendingIntent(C0078R.C0081id.action0, action.m14485OooO00o());
            }
            if (Build.VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(C0078R.C0081id.action0, action.m14487OooO00o());
            }
            return remoteViews;
        }

        @Override // androidx.core.app.NotificationCompat.OooO, androidx.core.app.NotificationCompat.OooO
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews OooO00o(AbstractC6992o000OO00 o000oo00) {
            if (Build.VERSION.SDK_INT >= 21) {
                return null;
            }
            return OooO00o();
        }

        @Override // androidx.core.app.NotificationCompat.OooO
        public RemoteViews OooO00o() {
            int min = Math.min(((NotificationCompat.OooO) this).OooO00o.f13933OooO00o.size(), 5);
            RemoteViews OooO00o2 = OooO00o(false, OooO00o(min), false);
            OooO00o2.removeAllViews(C0078R.C0081id.media_actions);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    OooO00o2.addView(C0078R.C0081id.media_actions, OooO00o(((NotificationCompat.OooO) this).OooO00o.f13933OooO00o.get(i)));
                }
            }
            if (this.f19776OooO0O0) {
                OooO00o2.setViewVisibility(C0078R.C0081id.cancel_action, 0);
                OooO00o2.setInt(C0078R.C0081id.cancel_action, "setAlpha", ((NotificationCompat.OooO) this).OooO00o.f13926OooO00o.getResources().getInteger(C0078R.integer.cancel_button_image_alpha));
                OooO00o2.setOnClickPendingIntent(C0078R.C0081id.cancel_action, this.f19773OooO00o);
            } else {
                OooO00o2.setViewVisibility(C0078R.C0081id.cancel_action, 8);
            }
            return OooO00o2;
        }

        public int OooO00o(int i) {
            return i <= 3 ? C0078R.layout.notification_template_big_media_narrow : C0078R.layout.notification_template_big_media;
        }
    }

    /* renamed from: com.pd.sdk.o00oooO$OooO00o */
    public static class OooO00o extends OooO0O0 {
        @Override // com.p118pd.sdk.C7242o00oooO.OooO0O0, com.p118pd.sdk.C7242o00oooO.OooO0O0, androidx.core.app.NotificationCompat.OooO, androidx.core.app.NotificationCompat.OooO
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18722OooO00o(AbstractC6992o000OO00 o000oo00) {
            if (Build.VERSION.SDK_INT >= 24) {
                o000oo00.OooO00o().setStyle(OooO00o(new Notification.DecoratedMediaCustomViewStyle()));
            } else {
                super.m18723OooO00o(o000oo00);
            }
        }

        @Override // com.p118pd.sdk.C7242o00oooO.OooO0O0, androidx.core.app.NotificationCompat.OooO
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews OooO0O0(AbstractC6992o000OO00 o000oo00) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            boolean z = true;
            boolean z2 = ((NotificationCompat.OooO) this).OooO00o.m14506OooO0O0() != null;
            if (Build.VERSION.SDK_INT >= 21) {
                if (!z2 && ((NotificationCompat.OooO) this).OooO00o.m14502OooO00o() == null) {
                    z = false;
                }
                if (z) {
                    RemoteViews OooO0O0 = m18724OooO0O0();
                    if (z2) {
                        OooO00o(OooO0O0, ((NotificationCompat.OooO) this).OooO00o.m14506OooO0O0());
                    }
                    OooO0O0(OooO0O0);
                    return OooO0O0;
                }
            } else {
                RemoteViews OooO0O02 = m18724OooO0O0();
                if (z2) {
                    OooO00o(OooO0O02, ((NotificationCompat.OooO) this).OooO00o.m14506OooO0O0());
                    return OooO0O02;
                }
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.OooO
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews OooO0OO(AbstractC6992o000OO00 o000oo00) {
            RemoteViews remoteViews;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            if (((NotificationCompat.OooO) this).OooO00o.OooO0OO() != null) {
                remoteViews = ((NotificationCompat.OooO) this).OooO00o.OooO0OO();
            } else {
                remoteViews = ((NotificationCompat.OooO) this).OooO00o.m14506OooO0O0();
            }
            if (remoteViews == null) {
                return null;
            }
            RemoteViews OooO00o = OooO00o();
            OooO00o(OooO00o, remoteViews);
            if (Build.VERSION.SDK_INT >= 21) {
                OooO0O0(OooO00o);
            }
            return OooO00o;
        }

        @Override // com.p118pd.sdk.C7242o00oooO.OooO0O0, com.p118pd.sdk.C7242o00oooO.OooO0O0, androidx.core.app.NotificationCompat.OooO, androidx.core.app.NotificationCompat.OooO
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews OooO00o(AbstractC6992o000OO00 o000oo00) {
            RemoteViews remoteViews;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            if (((NotificationCompat.OooO) this).OooO00o.m14502OooO00o() != null) {
                remoteViews = ((NotificationCompat.OooO) this).OooO00o.m14502OooO00o();
            } else {
                remoteViews = ((NotificationCompat.OooO) this).OooO00o.m14506OooO0O0();
            }
            if (remoteViews == null) {
                return null;
            }
            RemoteViews OooO00o = OooO00o();
            OooO00o(OooO00o, remoteViews);
            if (Build.VERSION.SDK_INT >= 21) {
                OooO0O0(OooO00o);
            }
            return OooO00o;
        }

        @Override // com.p118pd.sdk.C7242o00oooO.OooO0O0, com.p118pd.sdk.C7242o00oooO.OooO0O0
        public int OooO0O0() {
            if (((NotificationCompat.OooO) this).OooO00o.m14506OooO0O0() != null) {
                return C0078R.layout.notification_template_media_custom;
            }
            return super.OooO0O0();
        }

        private void OooO0O0(RemoteViews remoteViews) {
            int i;
            if (((NotificationCompat.OooO) this).OooO00o.OooO00o() != 0) {
                i = ((NotificationCompat.OooO) this).OooO00o.OooO00o();
            } else {
                i = ((NotificationCompat.OooO) this).OooO00o.f13926OooO00o.getResources().getColor(C0078R.C0079color.notification_material_background_media_default_color);
            }
            remoteViews.setInt(C0078R.C0081id.status_bar_latest_event_content, "setBackgroundColor", i);
        }

        @Override // com.p118pd.sdk.C7242o00oooO.OooO0O0
        public int OooO00o(int i) {
            return i <= 3 ? C0078R.layout.notification_template_big_media_narrow_custom : C0078R.layout.notification_template_big_media_custom;
        }
    }
}
