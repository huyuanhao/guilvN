package android.support.p000v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p000v4.media.MediaBrowserCompatApi21;
import android.support.p000v4.media.MediaBrowserCompatApi23;
import android.support.p000v4.media.MediaBrowserCompatApi26;
import android.support.p000v4.media.session.IMediaSession;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.support.p000v4.p001os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.MediaBrowserServiceCompat;
import com.p118pd.sdk.C6971o0000oO0;
import com.p118pd.sdk.C6990o000O0oo;
import com.p118pd.sdk.C7229o00ooOO;
import com.p118pd.sdk.C7231o00ooOOo;
import com.umeng.message.proguard.C3848l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {
    public static final String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
    public static final String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    public static final boolean DEBUG = Log.isLoggable(TAG, 3);
    public static final String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final String EXTRA_MEDIA_ID = "android.media.browse.extra.MEDIA_ID";
    public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
    public static final String TAG = "MediaBrowserCompat";
    public final MediaBrowserImpl mImpl;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CallbackHandler */
    public static class CallbackHandler extends Handler {
        public final WeakReference<MediaBrowserServiceCallbackImpl> mCallbackImplRef;
        public WeakReference<Messenger> mCallbacksMessengerRef;

        public CallbackHandler(MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {
            this.mCallbackImplRef = new WeakReference<>(mediaBrowserServiceCallbackImpl);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.mCallbacksMessengerRef;
            if (weakReference != null && weakReference.get() != null && this.mCallbackImplRef.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.ensureClassLoader(data);
                MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl = this.mCallbackImplRef.get();
                Messenger messenger = this.mCallbacksMessengerRef.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle(C7231o00ooOOo.f19755OooOO0O);
                        MediaSessionCompat.ensureClassLoader(bundle);
                        mediaBrowserServiceCallbackImpl.onServiceConnected(messenger, data.getString(C7231o00ooOOo.f19749OooO0Oo), (MediaSessionCompat.Token) data.getParcelable(C7231o00ooOOo.f19750OooO0o), bundle);
                    } else if (i == 2) {
                        mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);
                    } else if (i != 3) {
                        String str = "Unhandled message: " + message + "\n  Client version: " + 1 + "\n  Service version: " + message.arg1;
                    } else {
                        Bundle bundle2 = data.getBundle(C7231o00ooOOo.f19752OooO0oO);
                        MediaSessionCompat.ensureClassLoader(bundle2);
                        Bundle bundle3 = data.getBundle(C7231o00ooOOo.f19753OooO0oo);
                        MediaSessionCompat.ensureClassLoader(bundle3);
                        mediaBrowserServiceCallbackImpl.onLoadChildren(messenger, data.getString(C7231o00ooOOo.f19749OooO0Oo), data.getParcelableArrayList(C7231o00ooOOo.f19751OooO0o0), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);
                    }
                }
            }
        }

        public void setCallbacksMessenger(Messenger messenger) {
            this.mCallbacksMessengerRef = new WeakReference<>(messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ConnectionCallback */
    public static class ConnectionCallback {
        public ConnectionCallbackInternal mConnectionCallbackInternal;
        public final Object mConnectionCallbackObj;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal */
        public interface ConnectionCallbackInternal {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ConnectionCallback$StubApi21 */
        public class StubApi21 implements MediaBrowserCompatApi21.ConnectionCallback {
            public StubApi21() {
            }

            @Override // android.support.p000v4.media.MediaBrowserCompatApi21.ConnectionCallback
            public void onConnected() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnected();
                }
                ConnectionCallback.this.onConnected();
            }

            @Override // android.support.p000v4.media.MediaBrowserCompatApi21.ConnectionCallback
            public void onConnectionFailed() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnectionFailed();
                }
                ConnectionCallback.this.onConnectionFailed();
            }

            @Override // android.support.p000v4.media.MediaBrowserCompatApi21.ConnectionCallback
            public void onConnectionSuspended() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnectionSuspended();
                }
                ConnectionCallback.this.onConnectionSuspended();
            }
        }

        public ConnectionCallback() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.mConnectionCallbackObj = MediaBrowserCompatApi21.createConnectionCallback(new StubApi21());
            } else {
                this.mConnectionCallbackObj = null;
            }
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }

        public void setInternalConnectionCallback(ConnectionCallbackInternal connectionCallbackInternal) {
            this.mConnectionCallbackInternal = connectionCallbackInternal;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionCallback */
    public static abstract class CustomActionCallback {
        public void onError(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onProgressUpdate(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onResult(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    public static class CustomActionResultReceiver extends ResultReceiver {
        public final String mAction;
        public final CustomActionCallback mCallback;
        public final Bundle mExtras;

        public CustomActionResultReceiver(String str, Bundle bundle, CustomActionCallback customActionCallback, Handler handler) {
            super(handler);
            this.mAction = str;
            this.mExtras = bundle;
            this.mCallback = customActionCallback;
        }

        @Override // android.support.p000v4.p001os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            if (this.mCallback != null) {
                MediaSessionCompat.ensureClassLoader(bundle);
                if (i == -1) {
                    this.mCallback.onError(this.mAction, this.mExtras, bundle);
                } else if (i == 0) {
                    this.mCallback.onResult(this.mAction, this.mExtras, bundle);
                } else if (i != 1) {
                    String str = "Unknown result code: " + i + " (extras=" + this.mExtras + ", resultData=" + bundle + C3848l.f10402t;
                } else {
                    this.mCallback.onProgressUpdate(this.mAction, this.mExtras, bundle);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemCallback */
    public static abstract class ItemCallback {
        public final Object mItemCallbackObj;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemCallback$StubApi23 */
        public class StubApi23 implements MediaBrowserCompatApi23.ItemCallback {
            public StubApi23() {
            }

            @Override // android.support.p000v4.media.MediaBrowserCompatApi23.ItemCallback
            public void onError(@NonNull String str) {
                ItemCallback.this.onError(str);
            }

            @Override // android.support.p000v4.media.MediaBrowserCompatApi23.ItemCallback
            public void onItemLoaded(Parcel parcel) {
                if (parcel == null) {
                    ItemCallback.this.onItemLoaded(null);
                    return;
                }
                parcel.setDataPosition(0);
                parcel.recycle();
                ItemCallback.this.onItemLoaded(MediaItem.CREATOR.createFromParcel(parcel));
            }
        }

        public ItemCallback() {
            if (Build.VERSION.SDK_INT >= 23) {
                this.mItemCallbackObj = MediaBrowserCompatApi23.createItemCallback(new StubApi23());
            } else {
                this.mItemCallbackObj = null;
            }
        }

        public void onError(@NonNull String str) {
        }

        public void onItemLoaded(MediaItem mediaItem) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    public static class ItemReceiver extends ResultReceiver {
        public final ItemCallback mCallback;
        public final String mMediaId;

        public ItemReceiver(String str, ItemCallback itemCallback, Handler handler) {
            super(handler);
            this.mMediaId = str;
            this.mCallback = itemCallback;
        }

        @Override // android.support.p000v4.p001os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.f14418o0OOO0o)) {
                this.mCallback.onError(this.mMediaId);
                return;
            }
            Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.f14418o0OOO0o);
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.mCallback.onItemLoaded((MediaItem) parcelable);
            } else {
                this.mCallback.onError(this.mMediaId);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl */
    public interface MediaBrowserImpl {
        void connect();

        void disconnect();

        @Nullable
        Bundle getExtras();

        void getItem(@NonNull String str, @NonNull ItemCallback itemCallback);

        @Nullable
        Bundle getNotifyChildrenChangedOptions();

        @NonNull
        String getRoot();

        ComponentName getServiceComponent();

        @NonNull
        MediaSessionCompat.Token getSessionToken();

        boolean isConnected();

        void search(@NonNull String str, Bundle bundle, @NonNull SearchCallback searchCallback);

        void sendCustomAction(@NonNull String str, Bundle bundle, @Nullable CustomActionCallback customActionCallback);

        void subscribe(@NonNull String str, @Nullable Bundle bundle, @NonNull SubscriptionCallback subscriptionCallback);

        void unsubscribe(@NonNull String str, SubscriptionCallback subscriptionCallback);
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21 */
    public static class MediaBrowserImplApi21 implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl, ConnectionCallback.ConnectionCallbackInternal {
        public final Object mBrowserObj;
        public Messenger mCallbacksMessenger;
        public final Context mContext;
        public final CallbackHandler mHandler = new CallbackHandler(this);
        public MediaSessionCompat.Token mMediaSessionToken;
        public Bundle mNotifyChildrenChangedOptions;
        public final Bundle mRootHints;
        public ServiceBinderWrapper mServiceBinderWrapper;
        public int mServiceVersion;
        public final C6971o0000oO0<String, Subscription> mSubscriptions = new C6971o0000oO0<>();

        public MediaBrowserImplApi21(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            Bundle bundle2;
            this.mContext = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.mRootHints = bundle2;
            bundle2.putInt(C7231o00ooOOo.f19760OooOOOo, 1);
            connectionCallback.setInternalConnectionCallback(this);
            this.mBrowserObj = MediaBrowserCompatApi21.createBrowser(context, componentName, connectionCallback.mConnectionCallbackObj, this.mRootHints);
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
            MediaBrowserCompatApi21.connect(this.mBrowserObj);
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
            Messenger messenger;
            ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;
            if (!(serviceBinderWrapper == null || (messenger = this.mCallbacksMessenger) == null)) {
                try {
                    serviceBinderWrapper.unregisterCallbackMessenger(messenger);
                } catch (RemoteException unused) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error unregistering client messenger.");
                }
            }
            MediaBrowserCompatApi21.disconnect(this.mBrowserObj);
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        @Nullable
        public Bundle getExtras() {
            return MediaBrowserCompatApi21.getExtras(this.mBrowserObj);
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(@NonNull final String str, @NonNull final ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            } else if (itemCallback == null) {
                throw new IllegalArgumentException("cb is null");
            } else if (!MediaBrowserCompatApi21.isConnected(this.mBrowserObj)) {
                Log.i(MediaBrowserCompat.TAG, "Not connected, unable to retrieve the MediaItem.");
                this.mHandler.post(new Runnable() {
                    /* class android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplApi21.RunnableC00001 */

                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            } else if (this.mServiceBinderWrapper == null) {
                this.mHandler.post(new Runnable() {
                    /* class android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplApi21.RunnableC00012 */

                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            } else {
                try {
                    this.mServiceBinderWrapper.getMediaItem(str, new ItemReceiver(str, itemCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error getting media item: " + str);
                    this.mHandler.post(new Runnable() {
                        /* class android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplApi21.RunnableC00023 */

                        public void run() {
                            itemCallback.onError(str);
                        }
                    });
                }
            }
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getNotifyChildrenChangedOptions() {
            return this.mNotifyChildrenChangedOptions;
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        @NonNull
        public String getRoot() {
            return MediaBrowserCompatApi21.getRoot(this.mBrowserObj);
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public ComponentName getServiceComponent() {
            return MediaBrowserCompatApi21.getServiceComponent(this.mBrowserObj);
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        @NonNull
        public MediaSessionCompat.Token getSessionToken() {
            if (this.mMediaSessionToken == null) {
                this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(MediaBrowserCompatApi21.getSessionToken(this.mBrowserObj));
            }
            return this.mMediaSessionToken;
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
            return MediaBrowserCompatApi21.isConnected(this.mBrowserObj);
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnected() {
            Bundle extras = MediaBrowserCompatApi21.getExtras(this.mBrowserObj);
            if (extras != null) {
                this.mServiceVersion = extras.getInt(C7231o00ooOOo.f19761OooOOo0, 0);
                IBinder OooO00o = C6990o000O0oo.OooO00o(extras, C7231o00ooOOo.OooOOo);
                if (OooO00o != null) {
                    this.mServiceBinderWrapper = new ServiceBinderWrapper(OooO00o, this.mRootHints);
                    Messenger messenger = new Messenger(this.mHandler);
                    this.mCallbacksMessenger = messenger;
                    this.mHandler.setCallbacksMessenger(messenger);
                    try {
                        this.mServiceBinderWrapper.registerCallbackMessenger(this.mContext, this.mCallbacksMessenger);
                    } catch (RemoteException unused) {
                        Log.i(MediaBrowserCompat.TAG, "Remote error registering client messenger.");
                    }
                }
                IMediaSession asInterface = IMediaSession.Stub.asInterface(C6990o000O0oo.OooO00o(extras, C7231o00ooOOo.OooOOoo));
                if (asInterface != null) {
                    this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(MediaBrowserCompatApi21.getSessionToken(this.mBrowserObj), asInterface);
                }
            }
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionFailed() {
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(Messenger messenger) {
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionSuspended() {
            this.mServiceBinderWrapper = null;
            this.mCallbacksMessenger = null;
            this.mMediaSessionToken = null;
            this.mHandler.setCallbacksMessenger(null);
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.mCallbacksMessenger == messenger) {
                Subscription subscription = this.mSubscriptions.get(str);
                if (subscription != null) {
                    SubscriptionCallback callback = subscription.getCallback(bundle);
                    if (callback == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            callback.onError(str);
                            return;
                        }
                        this.mNotifyChildrenChangedOptions = bundle2;
                        callback.onChildrenLoaded(str, list);
                        this.mNotifyChildrenChangedOptions = null;
                    } else if (list == null) {
                        callback.onError(str, bundle);
                    } else {
                        this.mNotifyChildrenChangedOptions = bundle2;
                        callback.onChildrenLoaded(str, list, bundle);
                        this.mNotifyChildrenChangedOptions = null;
                    }
                } else if (MediaBrowserCompat.DEBUG) {
                    String str2 = "onLoadChildren for id that isn't subscribed id=" + str;
                }
            }
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void search(@NonNull final String str, final Bundle bundle, @NonNull final SearchCallback searchCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("search() called while not connected");
            } else if (this.mServiceBinderWrapper == null) {
                Log.i(MediaBrowserCompat.TAG, "The connected service doesn't support search.");
                this.mHandler.post(new Runnable() {
                    /* class android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplApi21.RunnableC00034 */

                    public void run() {
                        searchCallback.onError(str, bundle);
                    }
                });
            } else {
                try {
                    this.mServiceBinderWrapper.search(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException e) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error searching items with query: " + str, e);
                    this.mHandler.post(new Runnable() {
                        /* class android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplApi21.RunnableC00045 */

                        public void run() {
                            searchCallback.onError(str, bundle);
                        }
                    });
                }
            }
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(@NonNull final String str, final Bundle bundle, @Nullable final CustomActionCallback customActionCallback) {
            if (isConnected()) {
                if (this.mServiceBinderWrapper == null) {
                    Log.i(MediaBrowserCompat.TAG, "The connected service doesn't support sendCustomAction.");
                    if (customActionCallback != null) {
                        this.mHandler.post(new Runnable() {
                            /* class android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplApi21.RunnableC00056 */

                            public void run() {
                                customActionCallback.onError(str, bundle, null);
                            }
                        });
                    }
                }
                try {
                    this.mServiceBinderWrapper.sendCustomAction(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException e) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e);
                    if (customActionCallback != null) {
                        this.mHandler.post(new Runnable() {
                            /* class android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplApi21.RunnableC00067 */

                            public void run() {
                                customActionCallback.onError(str, bundle, null);
                            }
                        });
                    }
                }
            } else {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with " + "extras " + bundle + " because the browser is not connected to the " + "service.");
            }
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(@NonNull String str, Bundle bundle, @NonNull SubscriptionCallback subscriptionCallback) {
            Bundle bundle2;
            Subscription subscription = this.mSubscriptions.get(str);
            if (subscription == null) {
                subscription = new Subscription();
                this.mSubscriptions.put(str, subscription);
            }
            subscriptionCallback.setSubscription(subscription);
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            subscription.putCallback(bundle2, subscriptionCallback);
            ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;
            if (serviceBinderWrapper == null) {
                MediaBrowserCompatApi21.subscribe(this.mBrowserObj, str, subscriptionCallback.mSubscriptionCallbackObj);
                return;
            }
            try {
                serviceBinderWrapper.addSubscription(str, subscriptionCallback.mToken, bundle2, this.mCallbacksMessenger);
            } catch (RemoteException unused) {
                Log.i(MediaBrowserCompat.TAG, "Remote error subscribing media item: " + str);
            }
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(@NonNull String str, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = this.mSubscriptions.get(str);
            if (subscription != null) {
                ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;
                if (serviceBinderWrapper == null) {
                    if (subscriptionCallback == null) {
                        MediaBrowserCompatApi21.unsubscribe(this.mBrowserObj, str);
                    } else {
                        List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                        List<Bundle> optionsList = subscription.getOptionsList();
                        for (int size = callbacks.size() - 1; size >= 0; size--) {
                            if (callbacks.get(size) == subscriptionCallback) {
                                callbacks.remove(size);
                                optionsList.remove(size);
                            }
                        }
                        if (callbacks.size() == 0) {
                            MediaBrowserCompatApi21.unsubscribe(this.mBrowserObj, str);
                        }
                    }
                } else if (subscriptionCallback == null) {
                    try {
                        serviceBinderWrapper.removeSubscription(str, null, this.mCallbacksMessenger);
                    } catch (RemoteException unused) {
                        String str2 = "removeSubscription failed with RemoteException parentId=" + str;
                    }
                } else {
                    List<SubscriptionCallback> callbacks2 = subscription.getCallbacks();
                    List<Bundle> optionsList2 = subscription.getOptionsList();
                    for (int size2 = callbacks2.size() - 1; size2 >= 0; size2--) {
                        if (callbacks2.get(size2) == subscriptionCallback) {
                            this.mServiceBinderWrapper.removeSubscription(str, subscriptionCallback.mToken, this.mCallbacksMessenger);
                            callbacks2.remove(size2);
                            optionsList2.remove(size2);
                        }
                    }
                }
                if (subscription.isEmpty() || subscriptionCallback == null) {
                    this.mSubscriptions.remove(str);
                }
            }
        }
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi23 */
    public static class MediaBrowserImplApi23 extends MediaBrowserImplApi21 {
        public MediaBrowserImplApi23(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(@NonNull String str, @NonNull ItemCallback itemCallback) {
            if (this.mServiceBinderWrapper == null) {
                MediaBrowserCompatApi23.getItem(this.mBrowserObj, str, itemCallback.mItemCallbackObj);
            } else {
                super.getItem(str, itemCallback);
            }
        }
    }

    @RequiresApi(26)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi26 */
    public static class MediaBrowserImplApi26 extends MediaBrowserImplApi23 {
        public MediaBrowserImplApi26(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(@NonNull String str, @Nullable Bundle bundle, @NonNull SubscriptionCallback subscriptionCallback) {
            if (this.mServiceBinderWrapper != null && this.mServiceVersion >= 2) {
                super.subscribe(str, bundle, subscriptionCallback);
            } else if (bundle == null) {
                MediaBrowserCompatApi21.subscribe(this.mBrowserObj, str, subscriptionCallback.mSubscriptionCallbackObj);
            } else {
                MediaBrowserCompatApi26.subscribe(this.mBrowserObj, str, bundle, subscriptionCallback.mSubscriptionCallbackObj);
            }
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(@NonNull String str, SubscriptionCallback subscriptionCallback) {
            if (this.mServiceBinderWrapper != null && this.mServiceVersion >= 2) {
                super.unsubscribe(str, subscriptionCallback);
            } else if (subscriptionCallback == null) {
                MediaBrowserCompatApi21.unsubscribe(this.mBrowserObj, str);
            } else {
                MediaBrowserCompatApi26.unsubscribe(this.mBrowserObj, str, subscriptionCallback.mSubscriptionCallbackObj);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase */
    public static class MediaBrowserImplBase implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl {
        public static final int CONNECT_STATE_CONNECTED = 3;
        public static final int CONNECT_STATE_CONNECTING = 2;
        public static final int CONNECT_STATE_DISCONNECTED = 1;
        public static final int CONNECT_STATE_DISCONNECTING = 0;
        public static final int CONNECT_STATE_SUSPENDED = 4;
        public final ConnectionCallback mCallback;
        public Messenger mCallbacksMessenger;
        public final Context mContext;
        public Bundle mExtras;
        public final CallbackHandler mHandler = new CallbackHandler(this);
        public MediaSessionCompat.Token mMediaSessionToken;
        public Bundle mNotifyChildrenChangedOptions;
        public final Bundle mRootHints;
        public String mRootId;
        public ServiceBinderWrapper mServiceBinderWrapper;
        public final ComponentName mServiceComponent;
        public MediaServiceConnection mServiceConnection;
        public int mState = 1;
        public final C6971o0000oO0<String, Subscription> mSubscriptions = new C6971o0000oO0<>();

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection */
        public class MediaServiceConnection implements ServiceConnection {
            public MediaServiceConnection() {
            }

            private void postOrRun(Runnable runnable) {
                if (Thread.currentThread() == MediaBrowserImplBase.this.mHandler.getLooper().getThread()) {
                    runnable.run();
                } else {
                    MediaBrowserImplBase.this.mHandler.post(runnable);
                }
            }

            public boolean isCurrent(String str) {
                int i;
                MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                if (mediaBrowserImplBase.mServiceConnection == this && (i = mediaBrowserImplBase.mState) != 0 && i != 1) {
                    return true;
                }
                int i2 = MediaBrowserImplBase.this.mState;
                if (i2 == 0 || i2 == 1) {
                    return false;
                }
                Log.i(MediaBrowserCompat.TAG, str + " for " + MediaBrowserImplBase.this.mServiceComponent + " with mServiceConnection=" + MediaBrowserImplBase.this.mServiceConnection + " this=" + this);
                return false;
            }

            public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                postOrRun(new Runnable() {
                    /* class android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.RunnableC00131 */

                    public void run() {
                        if (MediaBrowserCompat.DEBUG) {
                            String str = "MediaServiceConnection.onServiceConnected name=" + componentName + " binder=" + iBinder;
                            MediaBrowserImplBase.this.dump();
                        }
                        if (MediaServiceConnection.this.isCurrent("onServiceConnected")) {
                            MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                            mediaBrowserImplBase.mServiceBinderWrapper = new ServiceBinderWrapper(iBinder, mediaBrowserImplBase.mRootHints);
                            MediaBrowserImplBase.this.mCallbacksMessenger = new Messenger(MediaBrowserImplBase.this.mHandler);
                            MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                            mediaBrowserImplBase2.mHandler.setCallbacksMessenger(mediaBrowserImplBase2.mCallbacksMessenger);
                            MediaBrowserImplBase.this.mState = 2;
                            try {
                                if (MediaBrowserCompat.DEBUG) {
                                    MediaBrowserImplBase.this.dump();
                                }
                                MediaBrowserImplBase.this.mServiceBinderWrapper.connect(MediaBrowserImplBase.this.mContext, MediaBrowserImplBase.this.mCallbacksMessenger);
                            } catch (RemoteException unused) {
                                String str2 = "RemoteException during connect for " + MediaBrowserImplBase.this.mServiceComponent;
                                if (MediaBrowserCompat.DEBUG) {
                                    MediaBrowserImplBase.this.dump();
                                }
                            }
                        }
                    }
                });
            }

            public void onServiceDisconnected(final ComponentName componentName) {
                postOrRun(new Runnable() {
                    /* class android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.RunnableC00142 */

                    public void run() {
                        if (MediaBrowserCompat.DEBUG) {
                            String str = "MediaServiceConnection.onServiceDisconnected name=" + componentName + " this=" + this + " mServiceConnection=" + MediaBrowserImplBase.this.mServiceConnection;
                            MediaBrowserImplBase.this.dump();
                        }
                        if (MediaServiceConnection.this.isCurrent("onServiceDisconnected")) {
                            MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                            mediaBrowserImplBase.mServiceBinderWrapper = null;
                            mediaBrowserImplBase.mCallbacksMessenger = null;
                            mediaBrowserImplBase.mHandler.setCallbacksMessenger(null);
                            MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                            mediaBrowserImplBase2.mState = 4;
                            mediaBrowserImplBase2.mCallback.onConnectionSuspended();
                        }
                    }
                });
            }
        }

        public MediaBrowserImplBase(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            Bundle bundle2;
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (connectionCallback != null) {
                this.mContext = context;
                this.mServiceComponent = componentName;
                this.mCallback = connectionCallback;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                this.mRootHints = bundle2;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        public static String getStateLabel(int i) {
            if (i == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + i;
        }

        private boolean isCurrent(Messenger messenger, String str) {
            int i;
            if (this.mCallbacksMessenger == messenger && (i = this.mState) != 0 && i != 1) {
                return true;
            }
            int i2 = this.mState;
            if (i2 == 0 || i2 == 1) {
                return false;
            }
            Log.i(MediaBrowserCompat.TAG, str + " for " + this.mServiceComponent + " with mCallbacksMessenger=" + this.mCallbacksMessenger + " this=" + this);
            return false;
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
            int i = this.mState;
            if (i == 0 || i == 1) {
                this.mState = 2;
                this.mHandler.post(new Runnable() {
                    /* class android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplBase.RunnableC00071 */

                    public void run() {
                        MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                        if (mediaBrowserImplBase.mState != 0) {
                            mediaBrowserImplBase.mState = 2;
                            if (!MediaBrowserCompat.DEBUG || mediaBrowserImplBase.mServiceConnection == null) {
                                MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                                if (mediaBrowserImplBase2.mServiceBinderWrapper != null) {
                                    throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + MediaBrowserImplBase.this.mServiceBinderWrapper);
                                } else if (mediaBrowserImplBase2.mCallbacksMessenger == null) {
                                    Intent intent = new Intent(MediaBrowserServiceCompat.f14421o0ooOoO);
                                    intent.setComponent(MediaBrowserImplBase.this.mServiceComponent);
                                    MediaBrowserImplBase mediaBrowserImplBase3 = MediaBrowserImplBase.this;
                                    mediaBrowserImplBase3.mServiceConnection = new MediaServiceConnection();
                                    boolean z = false;
                                    try {
                                        z = MediaBrowserImplBase.this.mContext.bindService(intent, MediaBrowserImplBase.this.mServiceConnection, 1);
                                    } catch (Exception unused) {
                                        String str = "Failed binding to service " + MediaBrowserImplBase.this.mServiceComponent;
                                    }
                                    if (!z) {
                                        MediaBrowserImplBase.this.forceCloseConnection();
                                        MediaBrowserImplBase.this.mCallback.onConnectionFailed();
                                    }
                                    if (MediaBrowserCompat.DEBUG) {
                                        MediaBrowserImplBase.this.dump();
                                    }
                                } else {
                                    throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + MediaBrowserImplBase.this.mCallbacksMessenger);
                                }
                            } else {
                                throw new RuntimeException("mServiceConnection should be null. Instead it is " + MediaBrowserImplBase.this.mServiceConnection);
                            }
                        }
                    }
                });
                return;
            }
            throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + getStateLabel(this.mState) + C3848l.f10402t);
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
            this.mState = 0;
            this.mHandler.post(new Runnable() {
                /* class android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplBase.RunnableC00082 */

                public void run() {
                    MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                    Messenger messenger = mediaBrowserImplBase.mCallbacksMessenger;
                    if (messenger != null) {
                        try {
                            mediaBrowserImplBase.mServiceBinderWrapper.disconnect(messenger);
                        } catch (RemoteException unused) {
                            String str = "RemoteException during connect for " + MediaBrowserImplBase.this.mServiceComponent;
                        }
                    }
                    MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                    int i = mediaBrowserImplBase2.mState;
                    mediaBrowserImplBase2.forceCloseConnection();
                    if (i != 0) {
                        MediaBrowserImplBase.this.mState = i;
                    }
                    if (MediaBrowserCompat.DEBUG) {
                        MediaBrowserImplBase.this.dump();
                    }
                }
            });
        }

        public void dump() {
            String str = "  mServiceComponent=" + this.mServiceComponent;
            String str2 = "  mCallback=" + this.mCallback;
            String str3 = "  mRootHints=" + this.mRootHints;
            String str4 = "  mState=" + getStateLabel(this.mState);
            String str5 = "  mServiceConnection=" + this.mServiceConnection;
            String str6 = "  mServiceBinderWrapper=" + this.mServiceBinderWrapper;
            String str7 = "  mCallbacksMessenger=" + this.mCallbacksMessenger;
            String str8 = "  mRootId=" + this.mRootId;
            String str9 = "  mMediaSessionToken=" + this.mMediaSessionToken;
        }

        public void forceCloseConnection() {
            MediaServiceConnection mediaServiceConnection = this.mServiceConnection;
            if (mediaServiceConnection != null) {
                this.mContext.unbindService(mediaServiceConnection);
            }
            this.mState = 1;
            this.mServiceConnection = null;
            this.mServiceBinderWrapper = null;
            this.mCallbacksMessenger = null;
            this.mHandler.setCallbacksMessenger(null);
            this.mRootId = null;
            this.mMediaSessionToken = null;
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        @Nullable
        public Bundle getExtras() {
            if (isConnected()) {
                return this.mExtras;
            }
            throw new IllegalStateException("getExtras() called while not connected (state=" + getStateLabel(this.mState) + C3848l.f10402t);
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(@NonNull final String str, @NonNull final ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            } else if (itemCallback == null) {
                throw new IllegalArgumentException("cb is null");
            } else if (!isConnected()) {
                Log.i(MediaBrowserCompat.TAG, "Not connected, unable to retrieve the MediaItem.");
                this.mHandler.post(new Runnable() {
                    /* class android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplBase.RunnableC00093 */

                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            } else {
                try {
                    this.mServiceBinderWrapper.getMediaItem(str, new ItemReceiver(str, itemCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error getting media item: " + str);
                    this.mHandler.post(new Runnable() {
                        /* class android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplBase.RunnableC00104 */

                        public void run() {
                            itemCallback.onError(str);
                        }
                    });
                }
            }
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getNotifyChildrenChangedOptions() {
            return this.mNotifyChildrenChangedOptions;
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        @NonNull
        public String getRoot() {
            if (isConnected()) {
                return this.mRootId;
            }
            throw new IllegalStateException("getRoot() called while not connected(state=" + getStateLabel(this.mState) + C3848l.f10402t);
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        @NonNull
        public ComponentName getServiceComponent() {
            if (isConnected()) {
                return this.mServiceComponent;
            }
            throw new IllegalStateException("getServiceComponent() called while not connected (state=" + this.mState + C3848l.f10402t);
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        @NonNull
        public MediaSessionCompat.Token getSessionToken() {
            if (isConnected()) {
                return this.mMediaSessionToken;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.mState + C3848l.f10402t);
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
            return this.mState == 3;
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(Messenger messenger) {
            String str = "onConnectFailed for " + this.mServiceComponent;
            if (isCurrent(messenger, "onConnectFailed")) {
                if (this.mState != 2) {
                    String str2 = "onConnect from service while mState=" + getStateLabel(this.mState) + "... ignoring";
                    return;
                }
                forceCloseConnection();
                this.mCallback.onConnectionFailed();
            }
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (isCurrent(messenger, "onLoadChildren")) {
                if (MediaBrowserCompat.DEBUG) {
                    String str2 = "onLoadChildren for " + this.mServiceComponent + " id=" + str;
                }
                Subscription subscription = this.mSubscriptions.get(str);
                if (subscription != null) {
                    SubscriptionCallback callback = subscription.getCallback(bundle);
                    if (callback == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            callback.onError(str);
                            return;
                        }
                        this.mNotifyChildrenChangedOptions = bundle2;
                        callback.onChildrenLoaded(str, list);
                        this.mNotifyChildrenChangedOptions = null;
                    } else if (list == null) {
                        callback.onError(str, bundle);
                    } else {
                        this.mNotifyChildrenChangedOptions = bundle2;
                        callback.onChildrenLoaded(str, list, bundle);
                        this.mNotifyChildrenChangedOptions = null;
                    }
                } else if (MediaBrowserCompat.DEBUG) {
                    String str3 = "onLoadChildren for id that isn't subscribed id=" + str;
                }
            }
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (isCurrent(messenger, "onConnect")) {
                if (this.mState != 2) {
                    String str2 = "onConnect from service while mState=" + getStateLabel(this.mState) + "... ignoring";
                    return;
                }
                this.mRootId = str;
                this.mMediaSessionToken = token;
                this.mExtras = bundle;
                this.mState = 3;
                if (MediaBrowserCompat.DEBUG) {
                    dump();
                }
                this.mCallback.onConnected();
                try {
                    for (Map.Entry<String, Subscription> entry : this.mSubscriptions.entrySet()) {
                        String key = entry.getKey();
                        Subscription value = entry.getValue();
                        List<SubscriptionCallback> callbacks = value.getCallbacks();
                        List<Bundle> optionsList = value.getOptionsList();
                        for (int i = 0; i < callbacks.size(); i++) {
                            this.mServiceBinderWrapper.addSubscription(key, callbacks.get(i).mToken, optionsList.get(i), this.mCallbacksMessenger);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void search(@NonNull final String str, final Bundle bundle, @NonNull final SearchCallback searchCallback) {
            if (isConnected()) {
                try {
                    this.mServiceBinderWrapper.search(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException e) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error searching items with query: " + str, e);
                    this.mHandler.post(new Runnable() {
                        /* class android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplBase.RunnableC00115 */

                        public void run() {
                            searchCallback.onError(str, bundle);
                        }
                    });
                }
            } else {
                throw new IllegalStateException("search() called while not connected (state=" + getStateLabel(this.mState) + C3848l.f10402t);
            }
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(@NonNull final String str, final Bundle bundle, @Nullable final CustomActionCallback customActionCallback) {
            if (isConnected()) {
                try {
                    this.mServiceBinderWrapper.sendCustomAction(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException e) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e);
                    if (customActionCallback != null) {
                        this.mHandler.post(new Runnable() {
                            /* class android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImplBase.RunnableC00126 */

                            public void run() {
                                customActionCallback.onError(str, bundle, null);
                            }
                        });
                    }
                }
            } else {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with " + "extras " + bundle + " because the browser is not connected to the " + "service.");
            }
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(@NonNull String str, Bundle bundle, @NonNull SubscriptionCallback subscriptionCallback) {
            Bundle bundle2;
            Subscription subscription = this.mSubscriptions.get(str);
            if (subscription == null) {
                subscription = new Subscription();
                this.mSubscriptions.put(str, subscription);
            }
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            subscription.putCallback(bundle2, subscriptionCallback);
            if (isConnected()) {
                try {
                    this.mServiceBinderWrapper.addSubscription(str, subscriptionCallback.mToken, bundle2, this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    String str2 = "addSubscription failed with RemoteException parentId=" + str;
                }
            }
        }

        @Override // android.support.p000v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(@NonNull String str, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = this.mSubscriptions.get(str);
            if (subscription != null) {
                if (subscriptionCallback == null) {
                    try {
                        if (isConnected()) {
                            this.mServiceBinderWrapper.removeSubscription(str, null, this.mCallbacksMessenger);
                        }
                    } catch (RemoteException unused) {
                        String str2 = "removeSubscription failed with RemoteException parentId=" + str;
                    }
                } else {
                    List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                    List<Bundle> optionsList = subscription.getOptionsList();
                    for (int size = callbacks.size() - 1; size >= 0; size--) {
                        if (callbacks.get(size) == subscriptionCallback) {
                            if (isConnected()) {
                                this.mServiceBinderWrapper.removeSubscription(str, subscriptionCallback.mToken, this.mCallbacksMessenger);
                            }
                            callbacks.remove(size);
                            optionsList.remove(size);
                        }
                    }
                }
                if (subscription.isEmpty() || subscriptionCallback == null) {
                    this.mSubscriptions.remove(str);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserServiceCallbackImpl */
    public interface MediaBrowserServiceCallbackImpl {
        void onConnectionFailed(Messenger messenger);

        void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchCallback */
    public static abstract class SearchCallback {
        public void onError(@NonNull String str, Bundle bundle) {
        }

        public void onSearchResult(@NonNull String str, Bundle bundle, @NonNull List<MediaItem> list) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    public static class SearchResultReceiver extends ResultReceiver {
        public final SearchCallback mCallback;
        public final Bundle mExtras;
        public final String mQuery;

        public SearchResultReceiver(String str, Bundle bundle, SearchCallback searchCallback, Handler handler) {
            super(handler);
            this.mQuery = str;
            this.mExtras = bundle;
            this.mCallback = searchCallback;
        }

        @Override // android.support.p000v4.p001os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.f14419o0Oo0oo)) {
                this.mCallback.onError(this.mQuery, this.mExtras);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.f14419o0Oo0oo);
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.mCallback.onSearchResult(this.mQuery, this.mExtras, arrayList);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper */
    public static class ServiceBinderWrapper {
        public Messenger mMessenger;
        public Bundle mRootHints;

        public ServiceBinderWrapper(IBinder iBinder, Bundle bundle) {
            this.mMessenger = new Messenger(iBinder);
            this.mRootHints = bundle;
        }

        private void sendRequest(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.mMessenger.send(obtain);
        }

        public void addSubscription(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(C7231o00ooOOo.f19749OooO0Oo, str);
            C6990o000O0oo.OooO00o(bundle2, C7231o00ooOOo.f19746OooO00o, iBinder);
            bundle2.putBundle(C7231o00ooOOo.f19752OooO0oO, bundle);
            sendRequest(3, bundle2, messenger);
        }

        public void connect(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C7231o00ooOOo.f19745OooO, context.getPackageName());
            bundle.putBundle(C7231o00ooOOo.f19755OooOO0O, this.mRootHints);
            sendRequest(1, bundle, messenger);
        }

        public void disconnect(Messenger messenger) throws RemoteException {
            sendRequest(2, null, messenger);
        }

        public void getMediaItem(String str, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C7231o00ooOOo.f19749OooO0Oo, str);
            bundle.putParcelable(C7231o00ooOOo.f19754OooOO0, resultReceiver);
            sendRequest(5, bundle, messenger);
        }

        public void registerCallbackMessenger(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C7231o00ooOOo.f19745OooO, context.getPackageName());
            bundle.putBundle(C7231o00ooOOo.f19755OooOO0O, this.mRootHints);
            sendRequest(6, bundle, messenger);
        }

        public void removeSubscription(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C7231o00ooOOo.f19749OooO0Oo, str);
            C6990o000O0oo.OooO00o(bundle, C7231o00ooOOo.f19746OooO00o, iBinder);
            sendRequest(4, bundle, messenger);
        }

        public void search(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(C7231o00ooOOo.f19758OooOOO0, str);
            bundle2.putBundle(C7231o00ooOOo.f19756OooOO0o, bundle);
            bundle2.putParcelable(C7231o00ooOOo.f19754OooOO0, resultReceiver);
            sendRequest(8, bundle2, messenger);
        }

        public void sendCustomAction(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(C7231o00ooOOo.f19757OooOOO, str);
            bundle2.putBundle(C7231o00ooOOo.f19759OooOOOO, bundle);
            bundle2.putParcelable(C7231o00ooOOo.f19754OooOO0, resultReceiver);
            sendRequest(9, bundle2, messenger);
        }

        public void unregisterCallbackMessenger(Messenger messenger) throws RemoteException {
            sendRequest(7, null, messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$Subscription */
    public static class Subscription {
        public final List<SubscriptionCallback> mCallbacks = new ArrayList();
        public final List<Bundle> mOptionsList = new ArrayList();

        public SubscriptionCallback getCallback(Bundle bundle) {
            for (int i = 0; i < this.mOptionsList.size(); i++) {
                if (C7229o00ooOO.OooO00o(this.mOptionsList.get(i), bundle)) {
                    return this.mCallbacks.get(i);
                }
            }
            return null;
        }

        public List<SubscriptionCallback> getCallbacks() {
            return this.mCallbacks;
        }

        public List<Bundle> getOptionsList() {
            return this.mOptionsList;
        }

        public boolean isEmpty() {
            return this.mCallbacks.isEmpty();
        }

        public void putCallback(Bundle bundle, SubscriptionCallback subscriptionCallback) {
            for (int i = 0; i < this.mOptionsList.size(); i++) {
                if (C7229o00ooOO.OooO00o(this.mOptionsList.get(i), bundle)) {
                    this.mCallbacks.set(i, subscriptionCallback);
                    return;
                }
            }
            this.mCallbacks.add(subscriptionCallback);
            this.mOptionsList.add(bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SubscriptionCallback */
    public static abstract class SubscriptionCallback {
        public final Object mSubscriptionCallbackObj;
        public WeakReference<Subscription> mSubscriptionRef;
        public final IBinder mToken = new Binder();

        /* renamed from: android.support.v4.media.MediaBrowserCompat$SubscriptionCallback$StubApi21 */
        public class StubApi21 implements MediaBrowserCompatApi21.SubscriptionCallback {
            public StubApi21() {
            }

            public List<MediaItem> applyOptions(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
                int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }

            @Override // android.support.p000v4.media.MediaBrowserCompatApi21.SubscriptionCallback
            public void onChildrenLoaded(@NonNull String str, List<?> list) {
                WeakReference<Subscription> weakReference = SubscriptionCallback.this.mSubscriptionRef;
                Subscription subscription = weakReference == null ? null : weakReference.get();
                if (subscription == null) {
                    SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list));
                    return;
                }
                List<MediaItem> fromMediaItemList = MediaItem.fromMediaItemList(list);
                List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                List<Bundle> optionsList = subscription.getOptionsList();
                for (int i = 0; i < callbacks.size(); i++) {
                    Bundle bundle = optionsList.get(i);
                    if (bundle == null) {
                        SubscriptionCallback.this.onChildrenLoaded(str, fromMediaItemList);
                    } else {
                        SubscriptionCallback.this.onChildrenLoaded(str, applyOptions(fromMediaItemList, bundle), bundle);
                    }
                }
            }

            @Override // android.support.p000v4.media.MediaBrowserCompatApi21.SubscriptionCallback
            public void onError(@NonNull String str) {
                SubscriptionCallback.this.onError(str);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$SubscriptionCallback$StubApi26 */
        public class StubApi26 extends StubApi21 implements MediaBrowserCompatApi26.SubscriptionCallback {
            public StubApi26() {
                super();
            }

            @Override // android.support.p000v4.media.MediaBrowserCompatApi26.SubscriptionCallback
            public void onChildrenLoaded(@NonNull String str, List<?> list, @NonNull Bundle bundle) {
                SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list), bundle);
            }

            @Override // android.support.p000v4.media.MediaBrowserCompatApi26.SubscriptionCallback
            public void onError(@NonNull String str, @NonNull Bundle bundle) {
                SubscriptionCallback.this.onError(str, bundle);
            }
        }

        public SubscriptionCallback() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                this.mSubscriptionCallbackObj = MediaBrowserCompatApi26.createSubscriptionCallback(new StubApi26());
            } else if (i >= 21) {
                this.mSubscriptionCallbackObj = MediaBrowserCompatApi21.createSubscriptionCallback(new StubApi21());
            } else {
                this.mSubscriptionCallbackObj = null;
            }
        }

        public void onChildrenLoaded(@NonNull String str, @NonNull List<MediaItem> list) {
        }

        public void onChildrenLoaded(@NonNull String str, @NonNull List<MediaItem> list, @NonNull Bundle bundle) {
        }

        public void onError(@NonNull String str) {
        }

        public void onError(@NonNull String str, @NonNull Bundle bundle) {
        }

        public void setSubscription(Subscription subscription) {
            this.mSubscriptionRef = new WeakReference<>(subscription);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.mImpl = new MediaBrowserImplApi26(context, componentName, connectionCallback, bundle);
        } else if (i >= 23) {
            this.mImpl = new MediaBrowserImplApi23(context, componentName, connectionCallback, bundle);
        } else if (i >= 21) {
            this.mImpl = new MediaBrowserImplApi21(context, componentName, connectionCallback, bundle);
        } else {
            this.mImpl = new MediaBrowserImplBase(context, componentName, connectionCallback, bundle);
        }
    }

    public void connect() {
        this.mImpl.connect();
    }

    public void disconnect() {
        this.mImpl.disconnect();
    }

    @Nullable
    public Bundle getExtras() {
        return this.mImpl.getExtras();
    }

    public void getItem(@NonNull String str, @NonNull ItemCallback itemCallback) {
        this.mImpl.getItem(str, itemCallback);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Bundle getNotifyChildrenChangedOptions() {
        return this.mImpl.getNotifyChildrenChangedOptions();
    }

    @NonNull
    public String getRoot() {
        return this.mImpl.getRoot();
    }

    @NonNull
    public ComponentName getServiceComponent() {
        return this.mImpl.getServiceComponent();
    }

    @NonNull
    public MediaSessionCompat.Token getSessionToken() {
        return this.mImpl.getSessionToken();
    }

    public boolean isConnected() {
        return this.mImpl.isConnected();
    }

    public void search(@NonNull String str, Bundle bundle, @NonNull SearchCallback searchCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        } else if (searchCallback != null) {
            this.mImpl.search(str, bundle, searchCallback);
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    public void sendCustomAction(@NonNull String str, Bundle bundle, @Nullable CustomActionCallback customActionCallback) {
        if (!TextUtils.isEmpty(str)) {
            this.mImpl.sendCustomAction(str, bundle, customActionCallback);
            return;
        }
        throw new IllegalArgumentException("action cannot be empty");
    }

    public void subscribe(@NonNull String str, @NonNull SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (subscriptionCallback != null) {
            this.mImpl.subscribe(str, null, subscriptionCallback);
        } else {
            throw new IllegalArgumentException("callback is null");
        }
    }

    public void unsubscribe(@NonNull String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mImpl.unsubscribe(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    public void unsubscribe(@NonNull String str, @NonNull SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (subscriptionCallback != null) {
            this.mImpl.unsubscribe(str, subscriptionCallback);
        } else {
            throw new IllegalArgumentException("callback is null");
        }
    }

    public void subscribe(@NonNull String str, @NonNull Bundle bundle, @NonNull SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (subscriptionCallback == null) {
            throw new IllegalArgumentException("callback is null");
        } else if (bundle != null) {
            this.mImpl.subscribe(str, bundle, subscriptionCallback);
        } else {
            throw new IllegalArgumentException("options are null");
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() {
            /* class android.support.p000v4.media.MediaBrowserCompat.MediaItem.C00151 */

            @Override // android.os.Parcelable.Creator
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        public final MediaDescriptionCompat mDescription;
        public final int mFlags;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$Flags */
        public @interface Flags {
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
                this.mFlags = i;
                this.mDescription = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        public static MediaItem fromMediaItem(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.fromMediaDescription(MediaBrowserCompatApi21.MediaItem.getDescription(obj)), MediaBrowserCompatApi21.MediaItem.getFlags(obj));
        }

        public static List<MediaItem> fromMediaItemList(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fromMediaItem(it.next()));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        @NonNull
        public MediaDescriptionCompat getDescription() {
            return this.mDescription;
        }

        public int getFlags() {
            return this.mFlags;
        }

        @Nullable
        public String getMediaId() {
            return this.mDescription.getMediaId();
        }

        public boolean isBrowsable() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isPlayable() {
            return (this.mFlags & 2) != 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.mFlags + ", mDescription=" + this.mDescription + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mFlags);
            this.mDescription.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.mFlags = parcel.readInt();
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
