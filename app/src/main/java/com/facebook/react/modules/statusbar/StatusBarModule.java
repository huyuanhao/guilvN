package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.ViewCompat;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.learnium.RNDeviceInfo.SystemBarTintManager;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = StatusBarModule.NAME)
public class StatusBarModule extends ReactContextBaseJavaModule {
    public static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    public static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Activity currentActivity = getCurrentActivity();
        int identifier = reactApplicationContext.getResources().getIdentifier(SystemBarTintManager.SystemBarConfig.STATUS_BAR_HEIGHT_RES_NAME, "dimen", "android");
        return MapBuilder.m947of(HEIGHT_KEY, Float.valueOf(identifier > 0 ? PixelUtil.toDIPFromPixel((float) reactApplicationContext.getResources().getDimensionPixelSize(identifier)) : 0.0f), DEFAULT_BACKGROUND_COLOR_KEY, (currentActivity == null || Build.VERSION.SDK_INT < 21) ? "black" : String.format("#%06X", Integer.valueOf(currentActivity.getWindow().getStatusBarColor() & 16777215)));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void setColor(final int i, final boolean z) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            FLog.m913w(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT >= 21) {
            UiThreadUtil.runOnUiThread(new GuardedRunnable(getReactApplicationContext()) {
                /* class com.facebook.react.modules.statusbar.StatusBarModule.C07851 */

                @Override // com.facebook.react.bridge.GuardedRunnable
                @TargetApi(21)
                public void runGuarded() {
                    currentActivity.getWindow().addFlags(Integer.MIN_VALUE);
                    if (z) {
                        int statusBarColor = currentActivity.getWindow().getStatusBarColor();
                        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(statusBarColor), Integer.valueOf(i));
                        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            /* class com.facebook.react.modules.statusbar.StatusBarModule.C07851.C07861 */

                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                currentActivity.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            }
                        });
                        ofObject.setDuration(300L).setStartDelay(0);
                        ofObject.start();
                        return;
                    }
                    currentActivity.getWindow().setStatusBarColor(i);
                }
            });
        }
    }

    @ReactMethod
    public void setHidden(final boolean z) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            FLog.m913w(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() {
                /* class com.facebook.react.modules.statusbar.StatusBarModule.RunnableC07893 */

                public void run() {
                    if (z) {
                        currentActivity.getWindow().addFlags(1024);
                        currentActivity.getWindow().clearFlags(2048);
                        return;
                    }
                    currentActivity.getWindow().addFlags(2048);
                    currentActivity.getWindow().clearFlags(1024);
                }
            });
        }
    }

    @ReactMethod
    public void setStyle(@Nullable final String str) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            FLog.m913w(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT >= 23) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                /* class com.facebook.react.modules.statusbar.StatusBarModule.RunnableC07904 */

                @TargetApi(23)
                public void run() {
                    View decorView = currentActivity.getWindow().getDecorView();
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    decorView.setSystemUiVisibility("dark-content".equals(str) ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
                }
            });
        }
    }

    @ReactMethod
    public void setTranslucent(final boolean z) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            FLog.m913w(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT >= 21) {
            UiThreadUtil.runOnUiThread(new GuardedRunnable(getReactApplicationContext()) {
                /* class com.facebook.react.modules.statusbar.StatusBarModule.C07872 */

                @Override // com.facebook.react.bridge.GuardedRunnable
                @TargetApi(21)
                public void runGuarded() {
                    View decorView = currentActivity.getWindow().getDecorView();
                    if (z) {
                        decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                            /* class com.facebook.react.modules.statusbar.StatusBarModule.C07872.View$OnApplyWindowInsetsListenerC07881 */

                            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                                WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
                                return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
                            }
                        });
                    } else {
                        decorView.setOnApplyWindowInsetsListener(null);
                    }
                    ViewCompat.m14594OooO0o(decorView);
                }
            });
        }
    }
}
