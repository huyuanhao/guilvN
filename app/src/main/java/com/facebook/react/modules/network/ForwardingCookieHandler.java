package com.facebook.react.modules.network;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.GuardedResultAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ForwardingCookieHandler extends CookieHandler {
    public static final String COOKIE_HEADER = "Cookie";
    public static final boolean USES_LEGACY_STORE = (Build.VERSION.SDK_INT < 21);
    public static final String VERSION_ONE_HEADER = "Set-cookie2";
    public static final String VERSION_ZERO_HEADER = "Set-cookie";
    public final ReactContext mContext;
    @Nullable
    public CookieManager mCookieManager;
    public final CookieSaver mCookieSaver = new CookieSaver();

    public class CookieSaver {
        public static final int MSG_PERSIST_COOKIES = 1;
        public static final int TIMEOUT = 30000;
        public final Handler mHandler;

        public CookieSaver() {
            this.mHandler = new Handler(Looper.getMainLooper(), new Handler.Callback(ForwardingCookieHandler.this) {
                /* class com.facebook.react.modules.network.ForwardingCookieHandler.CookieSaver.C07731 */

                public boolean handleMessage(Message message) {
                    if (message.what != 1) {
                        return false;
                    }
                    CookieSaver.this.persistCookies();
                    return true;
                }
            });
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        @TargetApi(21)
        private void flush() {
            CookieManager cookieManager = ForwardingCookieHandler.this.getCookieManager();
            if (cookieManager != null) {
                cookieManager.flush();
            }
        }

        public void onCookiesModified() {
            if (ForwardingCookieHandler.USES_LEGACY_STORE) {
                this.mHandler.sendEmptyMessageDelayed(1, 30000);
            }
        }

        public void persistCookies() {
            this.mHandler.removeMessages(1);
            ForwardingCookieHandler.this.runInBackground(new Runnable() {
                /* class com.facebook.react.modules.network.ForwardingCookieHandler.CookieSaver.RunnableC07742 */

                public void run() {
                    if (ForwardingCookieHandler.USES_LEGACY_STORE) {
                        CookieSyncManager.getInstance().sync();
                    } else {
                        CookieSaver.this.flush();
                    }
                }
            });
        }
    }

    public ForwardingCookieHandler(ReactContext reactContext) {
        this.mContext = reactContext;
    }

    @TargetApi(21)
    private void addCookieAsync(String str, String str2) {
        CookieManager cookieManager = getCookieManager();
        if (cookieManager != null) {
            cookieManager.setCookie(str, str2, null);
        }
    }

    private void addCookies(final String str, final List<String> list) {
        final CookieManager cookieManager = getCookieManager();
        if (cookieManager != null) {
            if (USES_LEGACY_STORE) {
                runInBackground(new Runnable() {
                    /* class com.facebook.react.modules.network.ForwardingCookieHandler.RunnableC07713 */

                    public void run() {
                        for (String str : list) {
                            cookieManager.setCookie(str, str);
                        }
                        ForwardingCookieHandler.this.mCookieSaver.onCookiesModified();
                    }
                });
                return;
            }
            for (String str2 : list) {
                addCookieAsync(str, str2);
            }
            cookieManager.flush();
            this.mCookieSaver.onCookiesModified();
        }
    }

    private void clearCookiesAsync(final Callback callback) {
        CookieManager cookieManager = getCookieManager();
        if (cookieManager != null) {
            cookieManager.removeAllCookies(new ValueCallback<Boolean>() {
                /* class com.facebook.react.modules.network.ForwardingCookieHandler.C07702 */

                public void onReceiveValue(Boolean bool) {
                    ForwardingCookieHandler.this.mCookieSaver.onCookiesModified();
                    callback.invoke(bool);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @Nullable
    private CookieManager getCookieManager() {
        if (this.mCookieManager == null) {
            possiblyWorkaroundSyncManager(this.mContext);
            try {
                CookieManager instance = CookieManager.getInstance();
                this.mCookieManager = instance;
                if (USES_LEGACY_STORE) {
                    instance.removeExpiredCookie();
                }
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return this.mCookieManager;
    }

    public static boolean isCookieHeader(String str) {
        return str.equalsIgnoreCase(VERSION_ZERO_HEADER) || str.equalsIgnoreCase(VERSION_ONE_HEADER);
    }

    public static void possiblyWorkaroundSyncManager(Context context) {
        if (USES_LEGACY_STORE) {
            CookieSyncManager.createInstance(context).sync();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void runInBackground(final Runnable runnable) {
        new GuardedAsyncTask<Void, Void>(this.mContext) {
            /* class com.facebook.react.modules.network.ForwardingCookieHandler.AsyncTaskC07724 */

            public void doInBackgroundGuarded(Void... voidArr) {
                runnable.run();
            }
        }.execute(new Void[0]);
    }

    public void clearCookies(final Callback callback) {
        if (USES_LEGACY_STORE) {
            new GuardedResultAsyncTask<Boolean>(this.mContext) {
                /* class com.facebook.react.modules.network.ForwardingCookieHandler.AsyncTaskC07691 */

                @Override // com.facebook.react.bridge.GuardedResultAsyncTask
                public Boolean doInBackgroundGuarded() {
                    CookieManager cookieManager = ForwardingCookieHandler.this.getCookieManager();
                    if (cookieManager != null) {
                        cookieManager.removeAllCookie();
                    }
                    ForwardingCookieHandler.this.mCookieSaver.onCookiesModified();
                    return true;
                }

                public void onPostExecuteGuarded(Boolean bool) {
                    callback.invoke(bool);
                }
            }.execute(new Void[0]);
        } else {
            clearCookiesAsync(callback);
        }
    }

    public void destroy() {
        if (USES_LEGACY_STORE) {
            CookieManager cookieManager = getCookieManager();
            if (cookieManager != null) {
                cookieManager.removeExpiredCookie();
            }
            this.mCookieSaver.persistCookies();
        }
    }

    @Override // java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        CookieManager cookieManager = getCookieManager();
        if (cookieManager == null) {
            return Collections.emptyMap();
        }
        String cookie = cookieManager.getCookie(uri.toString());
        if (TextUtils.isEmpty(cookie)) {
            return Collections.emptyMap();
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(cookie));
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) throws IOException {
        String uri2 = uri.toString();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && isCookieHeader(key)) {
                addCookies(uri2, entry.getValue());
            }
        }
    }
}
