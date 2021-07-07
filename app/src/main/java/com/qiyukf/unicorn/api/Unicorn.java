package com.qiyukf.unicorn.api;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p121a.p122a.C1732f;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.C2438c;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.msg.MessageService;
import com.qiyukf.unicorn.api.msg.OnPushMessageListener;
import com.qiyukf.unicorn.api.msg.UnicornMessage;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p232k.C2713k;
import com.qiyukf.unicorn.p244ui.activity.ServiceMessageActivity;
import com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment;

public class Unicorn {
    public static final String TAG = "QIYU";
    public static C2452d delegate;

    public static void addPushMessageListener(OnPushMessageListener onPushMessageListener) {
        if (isInit()) {
            C2452d.m5375g().mo36336a(onPushMessageListener);
        }
    }

    public static void addUnreadCountChangeListener(final UnreadCountChangeListener unreadCountChangeListener, final boolean z) {
        C2713k.m6273a(new Runnable() {
            /* class com.qiyukf.unicorn.api.Unicorn.RunnableC24034 */

            public final void run() {
                C2438c h = C2452d.m5376h();
                if (h != null) {
                    h.mo35655a(unreadCountChangeListener, z);
                }
            }
        });
    }

    public static void clearCache() {
        C2713k.m6273a(new Runnable() {
            /* class com.qiyukf.unicorn.api.Unicorn.RunnableC24078 */

            public final void run() {
                if (Unicorn.isInit()) {
                    try {
                        C1732f.m3104a().mo33907b();
                        C2349d.m5133c(EnumC2347c.TYPE_FILE);
                    } catch (Throwable th) {
                        C1709a.m3019d(Unicorn.TAG, "clear cache error", th);
                    }
                }
            }
        });
    }

    public static int getUnreadCount() {
        C2438c h = C2452d.m5376h();
        if (h != null) {
            return h.mo35663d();
        }
        return 0;
    }

    public static boolean init(Context context, String str, YSFOptions ySFOptions, @NonNull UnicornImageLoader unicornImageLoader) {
        delegate = C2452d.m5354a(context, str, ySFOptions, unicornImageLoader);
        return !C2205d.m4583f() || delegate != null;
    }

    public static boolean isInit() {
        return delegate != null && C2452d.m5366b();
    }

    @Deprecated
    public static boolean isServiceAvailable() {
        return true;
    }

    public static void logout() {
        C2713k.m6273a(new Runnable() {
            /* class com.qiyukf.unicorn.api.Unicorn.RunnableC24045 */

            public final void run() {
                Unicorn.setUserInfo(null);
            }
        });
    }

    @Deprecated
    public static ServiceMessageFragment newServiceFragment(String str, ConsultSource consultSource) {
        return newServiceFragment(str, consultSource, null);
    }

    public static ServiceMessageFragment newServiceFragment(String str, ConsultSource consultSource, ViewGroup viewGroup) {
        if (delegate != null) {
            ServiceMessageFragment serviceMessageFragment = new ServiceMessageFragment();
            serviceMessageFragment.setArguments(str, consultSource, viewGroup);
            return serviceMessageFragment;
        }
        C1709a.m3016c(TAG, "QIYU is not init, please init first.");
        return null;
    }

    public static void openServiceActivity(final Context context, final String str, final ConsultSource consultSource) {
        C2713k.m6273a(new Runnable() {
            /* class com.qiyukf.unicorn.api.Unicorn.RunnableC24012 */

            public final void run() {
                if (Unicorn.delegate != null) {
                    ServiceMessageActivity.start(context, str, consultSource);
                } else {
                    C1709a.m3016c(Unicorn.TAG, "QIYU is not init, please init first.");
                }
            }
        });
    }

    public static void pullTemplateMsg(final long j) {
        C2713k.m6273a(new Runnable() {
            /* class com.qiyukf.unicorn.api.Unicorn.RunnableC24067 */

            public final void run() {
                if (Unicorn.isInit()) {
                    C2452d unused = Unicorn.delegate;
                    C2452d.m5360a(C2667c.m6116a(), j);
                }
            }
        });
    }

    public static UnicornMessage queryLastMessage() {
        if (isInit()) {
            return ((MsgService) NIMClient.getService(MsgService.class)).queryLastMessage(C2667c.m6116a(), SessionTypeEnum.Ysf);
        }
        return null;
    }

    public static void removePushMessageListener(OnPushMessageListener onPushMessageListener) {
        if (isInit()) {
            C2452d.m5375g().mo36347b(onPushMessageListener);
        }
    }

    @Deprecated
    public static void sendProductMessage(ProductDetail productDetail) {
        MessageService.sendProductMessage(productDetail);
    }

    public static boolean setUserInfo(YSFUserInfo ySFUserInfo) {
        return setUserInfo(ySFUserInfo, null);
    }

    public static boolean setUserInfo(YSFUserInfo ySFUserInfo, RequestCallback<Void> requestCallback) {
        return isInit() && delegate.mo35677a(ySFUserInfo, requestCallback);
    }

    public static void toggleNotification(final boolean z) {
        C2713k.m6273a(new Runnable() {
            /* class com.qiyukf.unicorn.api.Unicorn.RunnableC24056 */

            public final void run() {
                if (Unicorn.isInit()) {
                    C2437b.m5258b(z);
                }
            }
        });
    }

    public static void trackUserAccess(final String str, final String str2) {
        C2713k.m6273a(new Runnable() {
            /* class com.qiyukf.unicorn.api.Unicorn.RunnableC24023 */

            public final void run() {
                if (Unicorn.isInit()) {
                    Unicorn.delegate.mo35676a(str, str2);
                }
            }
        });
    }

    public static void updateOptions(final YSFOptions ySFOptions) {
        C2713k.m6273a(new Runnable() {
            /* class com.qiyukf.unicorn.api.Unicorn.RunnableC24001 */

            public final void run() {
                if (Unicorn.isInit()) {
                    Unicorn.delegate.mo35675a(ySFOptions);
                }
            }
        });
    }
}
