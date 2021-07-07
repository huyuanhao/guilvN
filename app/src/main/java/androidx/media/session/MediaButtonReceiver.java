package androidx.media.session;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.RemoteException;
import android.support.p000v4.media.MediaBrowserCompat;
import android.support.p000v4.media.session.MediaControllerCompat;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.support.p000v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import androidx.media.MediaBrowserServiceCompat;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {
    public static final String OooO00o = "MediaButtonReceiver";

    public static class OooO00o extends MediaBrowserCompat.ConnectionCallback {
        public final BroadcastReceiver.PendingResult OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Context f14479OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Intent f14480OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public MediaBrowserCompat f14481OooO00o;

        public OooO00o(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f14479OooO00o = context;
            this.f14480OooO00o = intent;
            this.OooO00o = pendingResult;
        }

        public void OooO00o(MediaBrowserCompat mediaBrowserCompat) {
            this.f14481OooO00o = mediaBrowserCompat;
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnected() {
            try {
                new MediaControllerCompat(this.f14479OooO00o, this.f14481OooO00o.getSessionToken()).dispatchMediaButtonEvent((KeyEvent) this.f14480OooO00o.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException unused) {
            }
            OooO00o();
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionFailed() {
            OooO00o();
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionSuspended() {
            OooO00o();
        }

        private void OooO00o() {
            this.f14481OooO00o.disconnect();
            this.OooO00o.finish();
        }
    }

    public static KeyEvent OooO00o(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.getController().dispatchMediaButtonEvent(keyEvent);
        return keyEvent;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            String str = "Ignore unsupported intent: " + intent;
            return;
        }
        ComponentName OooO00o2 = OooO00o(context, "android.intent.action.MEDIA_BUTTON");
        if (OooO00o2 != null) {
            intent.setComponent(OooO00o2);
            OooO00o(context, intent);
            return;
        }
        ComponentName OooO00o3 = OooO00o(context, MediaBrowserServiceCompat.f14421o0ooOoO);
        if (OooO00o3 != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            OooO00o oooO00o = new OooO00o(applicationContext, intent, goAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, OooO00o3, oooO00o, null);
            oooO00o.OooO00o(mediaBrowserCompat);
            mediaBrowserCompat.connect();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }

    public static PendingIntent OooO00o(Context context, long j) {
        ComponentName OooO00o2 = OooO00o(context);
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o(context, OooO00o2, j);
    }

    public static PendingIntent OooO00o(Context context, ComponentName componentName, long j) {
        if (componentName == null) {
            return null;
        }
        int keyCode = PlaybackStateCompat.toKeyCode(j);
        if (keyCode == 0) {
            String str = "Cannot build a media button pending intent with the given action: " + j;
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, keyCode));
        return PendingIntent.getBroadcast(context, keyCode, intent, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static ComponentName OooO00o(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        queryBroadcastReceivers.size();
        return null;
    }

    public static void OooO00o(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public static ComponentName OooO00o(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }
}
