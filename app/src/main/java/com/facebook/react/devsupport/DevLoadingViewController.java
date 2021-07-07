package com.facebook.react.devsupport;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.common.logging.FLog;
import com.facebook.react.C0587R;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import javax.annotation.Nullable;

public class DevLoadingViewController {
    public static boolean sEnabled = true;
    @Nullable
    public PopupWindow mDevLoadingPopup;
    @Nullable
    public TextView mDevLoadingView;
    public final ReactInstanceManagerDevHelper mReactInstanceManagerHelper;

    public DevLoadingViewController(Context context, ReactInstanceManagerDevHelper reactInstanceManagerDevHelper) {
        this.mReactInstanceManagerHelper = reactInstanceManagerDevHelper;
    }

    @Nullable
    private Context getContext() {
        return this.mReactInstanceManagerHelper.getCurrentActivity();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void hideInternal() {
        PopupWindow popupWindow = this.mDevLoadingPopup;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.mDevLoadingPopup.dismiss();
            this.mDevLoadingPopup = null;
            this.mDevLoadingView = null;
        }
    }

    public static void setDevLoadingEnabled(boolean z) {
        sEnabled = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void showInternal(String str) {
        PopupWindow popupWindow = this.mDevLoadingPopup;
        if (popupWindow == null || !popupWindow.isShowing()) {
            Activity currentActivity = this.mReactInstanceManagerHelper.getCurrentActivity();
            if (currentActivity == null) {
                FLog.m873e(ReactConstants.TAG, "Unable to display loading message because react activity isn't available");
                return;
            }
            Rect rect = new Rect();
            currentActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int i = rect.top;
            TextView textView = (TextView) ((LayoutInflater) currentActivity.getSystemService("layout_inflater")).inflate(C0587R.layout.dev_loading_view, (ViewGroup) null);
            this.mDevLoadingView = textView;
            textView.setText(str);
            PopupWindow popupWindow2 = new PopupWindow(this.mDevLoadingView, -1, -2);
            this.mDevLoadingPopup = popupWindow2;
            popupWindow2.setTouchable(false);
            this.mDevLoadingPopup.showAtLocation(currentActivity.getWindow().getDecorView(), 0, 0, i);
        }
    }

    public void hide() {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                /* class com.facebook.react.devsupport.DevLoadingViewController.RunnableC06773 */

                public void run() {
                    DevLoadingViewController.this.hideInternal();
                }
            });
        }
    }

    public void showForRemoteJSEnabled() {
        Context context = getContext();
        if (context != null) {
            showMessage(context.getString(C0587R.string.catalyst_remotedbg_message));
        }
    }

    public void showForUrl(String str) {
        Context context = getContext();
        if (context != null) {
            try {
                URL url = new URL(str);
                int i = C0587R.string.catalyst_loading_from_url;
                showMessage(context.getString(i, url.getHost() + Constants.COLON_SEPARATOR + url.getPort()));
            } catch (MalformedURLException e) {
                FLog.m873e(ReactConstants.TAG, "Bundle url format is invalid. \n\n" + e.toString());
            }
        }
    }

    public void showMessage(final String str) {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                /* class com.facebook.react.devsupport.DevLoadingViewController.RunnableC06751 */

                public void run() {
                    DevLoadingViewController.this.showInternal(str);
                }
            });
        }
    }

    public void updateProgress(@Nullable final String str, @Nullable final Integer num, @Nullable final Integer num2) {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                /* class com.facebook.react.devsupport.DevLoadingViewController.RunnableC06762 */

                public void run() {
                    Integer num;
                    StringBuilder sb = new StringBuilder();
                    String str = str;
                    if (str == null) {
                        str = "Loading";
                    }
                    sb.append(str);
                    if (!(num == null || (num = num2) == null || num.intValue() <= 0)) {
                        sb.append(String.format(Locale.getDefault(), " %.1f%% (%d/%d)", Float.valueOf((((float) num.intValue()) / ((float) num2.intValue())) * 100.0f), num, num2));
                    }
                    sb.append("…");
                    if (DevLoadingViewController.this.mDevLoadingView != null) {
                        DevLoadingViewController.this.mDevLoadingView.setText(sb);
                    }
                }
            });
        }
    }
}
