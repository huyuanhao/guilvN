package com.umeng.socialize.handler;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.ShareContent;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.UmengErrorCode;
import com.umeng.socialize.common.QueuedWork;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.editorpage.IEditor;
import com.umeng.socialize.net.RestAPI;
import com.umeng.socialize.net.analytics.AnalyticsReqeust;
import com.umeng.socialize.net.analytics.AnalyticsResponse;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.util.Map;
import java.util.Stack;

public abstract class UMAPIShareHandler extends UMSSOHandler implements IEditor {
    public Stack<StatHolder> mStatStack = new Stack<>();

    public static class StatHolder {
        public ShareContent Content;
        public UMShareListener Listener;

        public StatHolder() {
        }
    }

    public abstract void authorizeCallBack(int i, int i2, Intent intent);

    public abstract void deleteAuth();

    public void doShare(ShareContent shareContent, UMShareListener uMShareListener) {
        if (getShareConfig().isOpenShareEditActivity()) {
            StatHolder statHolder = new StatHolder();
            statHolder.Content = shareContent;
            statHolder.Listener = uMShareListener;
            this.mStatStack.push(statHolder);
            if (this.mWeakAct.get() != null && !this.mWeakAct.get().isFinishing()) {
                try {
                    Intent intent = new Intent(this.mWeakAct.get(), Class.forName("com.umeng.socialize.editorpage.ShareActivity"));
                    intent.putExtras(getEditable(shareContent));
                    this.mWeakAct.get().startActivityForResult(intent, getRequestCode());
                } catch (ClassNotFoundException e) {
                    sendShareRequest(shareContent, uMShareListener);
                    SLog.error(UmengText.INTER.NULLJAR, e);
                    e.printStackTrace();
                }
            }
        } else {
            sendShareRequest(shareContent, uMShareListener);
        }
    }

    public abstract SHARE_MEDIA getPlatform();

    public abstract String getUID();

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        StatHolder pop;
        if (i == getRequestCode()) {
            if (i2 == 1000) {
                if (!this.mStatStack.isEmpty() && (pop = this.mStatStack.pop()) != null) {
                    pop.Listener.onCancel(getPlatform());
                }
            } else if (intent == null || !intent.hasExtra(SocializeConstants.KEY_TEXT)) {
                authorizeCallBack(i, i2, intent);
            } else if (!this.mStatStack.empty()) {
                final StatHolder pop2 = this.mStatStack.pop();
                final Bundle extras = intent.getExtras();
                if (i2 == -1) {
                    QueuedWork.runInBack(new Runnable() {
                        /* class com.umeng.socialize.handler.UMAPIShareHandler.RunnableC39281 */

                        public void run() {
                            UMAPIShareHandler.this.sendShareRequest(UMAPIShareHandler.this.getResult(pop2.Content, extras), pop2.Listener);
                        }
                    }, true);
                } else if (pop2.Listener != null) {
                    pop2.Listener.onCancel(getPlatform());
                }
            }
        }
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void onCreate(Context context, PlatformConfig.Platform platform) {
        super.onCreate(context, platform);
    }

    public void sendShareRequest(final ShareContent shareContent, final UMShareListener uMShareListener) {
        final SHARE_MEDIA platform = getPlatform();
        String lowerCase = platform.toString().toLowerCase();
        String uid = getUID();
        AnalyticsReqeust analyticsReqeust = new AnalyticsReqeust(getContext(), lowerCase, shareContent.mText);
        analyticsReqeust.setMedia(shareContent.mMedia);
        analyticsReqeust.setmUsid(uid);
        analyticsReqeust.setReqType(0);
        final AnalyticsResponse doShareByRequest = RestAPI.doShareByRequest(analyticsReqeust);
        if (doShareByRequest == null) {
            QueuedWork.runInMain(new Runnable() {
                /* class com.umeng.socialize.handler.UMAPIShareHandler.RunnableC39313 */

                public void run() {
                    UMShareListener uMShareListener = uMShareListener;
                    SHARE_MEDIA share_media = platform;
                    uMShareListener.onError(share_media, new Throwable(UmengErrorCode.ShareFailed.getMessage() + "response is null"));
                }
            });
        } else if (!doShareByRequest.isOk()) {
            QueuedWork.runInMain(new Runnable(doShareByRequest) {
                /* class com.umeng.socialize.handler.UMAPIShareHandler.RunnableC39324 */
                public final /* synthetic */ AnalyticsResponse val$resp;

                {
                    this.val$resp = r2;
                }

                public void run() {
                    if (this.val$resp.mStCode == 5027) {
                        UMAPIShareHandler.this.deleteAuth();
                        UMAPIShareHandler.this.share(shareContent, uMShareListener);
                        return;
                    }
                    UMShareListener uMShareListener = uMShareListener;
                    SHARE_MEDIA share_media = platform;
                    uMShareListener.onError(share_media, new Throwable(UmengErrorCode.ShareFailed.getMessage() + doShareByRequest.mMsg));
                }
            });
        } else {
            QueuedWork.runInMain(new Runnable() {
                /* class com.umeng.socialize.handler.UMAPIShareHandler.RunnableC39335 */

                public void run() {
                    uMShareListener.onResult(platform);
                }
            });
        }
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean share(final ShareContent shareContent, final UMShareListener uMShareListener) {
        if (isAuthorize()) {
            doShare(shareContent, uMShareListener);
            return false;
        }
        authorize(new UMAuthListener() {
            /* class com.umeng.socialize.handler.UMAPIShareHandler.C39292 */

            @Override // com.umeng.socialize.UMAuthListener
            public void onCancel(SHARE_MEDIA share_media, int i) {
                uMShareListener.onCancel(share_media);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
                QueuedWork.runInBack(new Runnable() {
                    /* class com.umeng.socialize.handler.UMAPIShareHandler.C39292.RunnableC39301 */

                    public void run() {
                        C39292 r0 = C39292.this;
                        UMAPIShareHandler.this.doShare(shareContent, uMShareListener);
                    }
                }, true);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onError(SHARE_MEDIA share_media, int i, Throwable th) {
                uMShareListener.onError(share_media, th);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onStart(SHARE_MEDIA share_media) {
                uMShareListener.onStart(share_media);
            }
        });
        return false;
    }
}
