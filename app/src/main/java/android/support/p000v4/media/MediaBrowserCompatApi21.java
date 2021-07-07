package android.support.p000v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(21)
/* renamed from: android.support.v4.media.MediaBrowserCompatApi21 */
public class MediaBrowserCompatApi21 {
    public static final String NULL_MEDIA_ITEM_ID = "android.support.v4.media.MediaBrowserCompat.NULL_MEDIA_ITEM";

    /* renamed from: android.support.v4.media.MediaBrowserCompatApi21$ConnectionCallback */
    public interface ConnectionCallback {
        void onConnected();

        void onConnectionFailed();

        void onConnectionSuspended();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompatApi21$ConnectionCallbackProxy */
    public static class ConnectionCallbackProxy<T extends ConnectionCallback> extends MediaBrowser.ConnectionCallback {
        public final T mConnectionCallback;

        public ConnectionCallbackProxy(T t) {
            this.mConnectionCallback = t;
        }

        public void onConnected() {
            this.mConnectionCallback.onConnected();
        }

        public void onConnectionFailed() {
            this.mConnectionCallback.onConnectionFailed();
        }

        public void onConnectionSuspended() {
            this.mConnectionCallback.onConnectionSuspended();
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompatApi21$MediaItem */
    public static class MediaItem {
        public static Object getDescription(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getDescription();
        }

        public static int getFlags(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getFlags();
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompatApi21$SubscriptionCallback */
    public interface SubscriptionCallback {
        void onChildrenLoaded(@NonNull String str, List<?> list);

        void onError(@NonNull String str);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompatApi21$SubscriptionCallbackProxy */
    public static class SubscriptionCallbackProxy<T extends SubscriptionCallback> extends MediaBrowser.SubscriptionCallback {
        public final T mSubscriptionCallback;

        public SubscriptionCallbackProxy(T t) {
            this.mSubscriptionCallback = t;
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list) {
            this.mSubscriptionCallback.onChildrenLoaded(str, list);
        }

        public void onError(@NonNull String str) {
            this.mSubscriptionCallback.onError(str);
        }
    }

    public static void connect(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    public static Object createBrowser(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }

    public static Object createConnectionCallback(ConnectionCallback connectionCallback) {
        return new ConnectionCallbackProxy(connectionCallback);
    }

    public static Object createSubscriptionCallback(SubscriptionCallback subscriptionCallback) {
        return new SubscriptionCallbackProxy(subscriptionCallback);
    }

    public static void disconnect(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    public static Bundle getExtras(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    public static String getRoot(Object obj) {
        return ((MediaBrowser) obj).getRoot();
    }

    public static ComponentName getServiceComponent(Object obj) {
        return ((MediaBrowser) obj).getServiceComponent();
    }

    public static Object getSessionToken(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    public static boolean isConnected(Object obj) {
        return ((MediaBrowser) obj).isConnected();
    }

    public static void subscribe(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }

    public static void unsubscribe(Object obj, String str) {
        ((MediaBrowser) obj).unsubscribe(str);
    }
}
