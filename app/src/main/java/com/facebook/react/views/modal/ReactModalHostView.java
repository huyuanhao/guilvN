package com.facebook.react.views.modal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.C0587R;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.common.ContextUtils;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.ArrayList;
import javax.annotation.Nullable;

public class ReactModalHostView extends ViewGroup implements LifecycleEventListener {
    public String mAnimationType;
    @Nullable
    public Dialog mDialog;
    public boolean mHardwareAccelerated;
    public DialogRootViewGroup mHostView;
    @Nullable
    public OnRequestCloseListener mOnRequestCloseListener;
    @Nullable
    public DialogInterface.OnShowListener mOnShowListener;
    public boolean mPropertyRequiresNewDialog;
    public boolean mTransparent;

    public static class DialogRootViewGroup extends ReactViewGroup implements RootView {
        public final JSTouchDispatcher mJSTouchDispatcher = new JSTouchDispatcher(this);

        public DialogRootViewGroup(Context context) {
            super(context);
        }

        private EventDispatcher getEventDispatcher() {
            return ((UIManagerModule) getReactContext().getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private ReactContext getReactContext() {
            return (ReactContext) getContext();
        }

        @Override // com.facebook.react.uimanager.RootView
        public void handleException(Throwable th) {
            getReactContext().handleException(new RuntimeException(th));
        }

        @Override // com.facebook.react.uimanager.RootView
        public void onChildStartedNativeGesture(MotionEvent motionEvent) {
            this.mJSTouchDispatcher.onChildStartedNativeGesture(motionEvent, getEventDispatcher());
        }

        @Override // com.facebook.react.views.view.ReactViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.mJSTouchDispatcher.handleTouchEvent(motionEvent, getEventDispatcher());
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // com.facebook.react.views.view.ReactViewGroup
        public void onSizeChanged(final int i, final int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (getChildCount() > 0) {
                final int id = getChildAt(0).getId();
                ReactContext reactContext = getReactContext();
                reactContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactContext) {
                    /* class com.facebook.react.views.modal.ReactModalHostView.DialogRootViewGroup.C08701 */

                    @Override // com.facebook.react.bridge.GuardedRunnable
                    public void runGuarded() {
                        ((UIManagerModule) DialogRootViewGroup.this.getReactContext().getNativeModule(UIManagerModule.class)).updateNodeSize(id, i, i2);
                    }
                });
            }
        }

        @Override // com.facebook.react.views.view.ReactViewGroup
        public boolean onTouchEvent(MotionEvent motionEvent) {
            this.mJSTouchDispatcher.handleTouchEvent(motionEvent, getEventDispatcher());
            super.onTouchEvent(motionEvent);
            return true;
        }

        public void requestDisallowInterceptTouchEvent(boolean z) {
        }
    }

    public interface OnRequestCloseListener {
        void onRequestClose(DialogInterface dialogInterface);
    }

    public ReactModalHostView(Context context) {
        super(context);
        ((ReactContext) context).addLifecycleEventListener(this);
        this.mHostView = new DialogRootViewGroup(context);
    }

    private void dismiss() {
        Activity activity;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            if (dialog.isShowing() && ((activity = (Activity) ContextUtils.findContextOfType(this.mDialog.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                this.mDialog.dismiss();
            }
            this.mDialog = null;
            ((ViewGroup) this.mHostView.getParent()).removeViewAt(0);
        }
    }

    private View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.mHostView);
        frameLayout.setFitsSystemWindows(true);
        return frameLayout;
    }

    @Nullable
    private Activity getCurrentActivity() {
        return ((ReactContext) getContext()).getCurrentActivity();
    }

    private void updateProperties() {
        Assertions.assertNotNull(this.mDialog, "mDialog must exist when we call updateProperties");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if ((currentActivity.getWindow().getAttributes().flags & 1024) != 0) {
                this.mDialog.getWindow().addFlags(1024);
            } else {
                this.mDialog.getWindow().clearFlags(1024);
            }
        }
        if (this.mTransparent) {
            this.mDialog.getWindow().clearFlags(2);
            return;
        }
        this.mDialog.getWindow().setDimAmount(0.5f);
        this.mDialog.getWindow().setFlags(2, 2);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        this.mHostView.addView(view, i);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        this.mHostView.dispatchProvideStructure(viewStructure);
    }

    public View getChildAt(int i) {
        return this.mHostView.getChildAt(i);
    }

    public int getChildCount() {
        return this.mHostView.getChildCount();
    }

    @Nullable
    @VisibleForTesting
    public Dialog getDialog() {
        return this.mDialog;
    }

    public void onDropInstance() {
        ((ReactContext) getContext()).removeLifecycleEventListener(this);
        dismiss();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        onDropInstance();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        showOrUpdate();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void removeView(View view) {
        this.mHostView.removeView(view);
    }

    public void removeViewAt(int i) {
        this.mHostView.removeView(getChildAt(i));
    }

    public void setAnimationType(String str) {
        this.mAnimationType = str;
        this.mPropertyRequiresNewDialog = true;
    }

    public void setHardwareAccelerated(boolean z) {
        this.mHardwareAccelerated = z;
        this.mPropertyRequiresNewDialog = true;
    }

    public void setOnRequestCloseListener(OnRequestCloseListener onRequestCloseListener) {
        this.mOnRequestCloseListener = onRequestCloseListener;
    }

    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.mOnShowListener = onShowListener;
    }

    public void setTransparent(boolean z) {
        this.mTransparent = z;
    }

    public void showOrUpdate() {
        if (this.mDialog != null) {
            if (this.mPropertyRequiresNewDialog) {
                dismiss();
            } else {
                updateProperties();
                return;
            }
        }
        this.mPropertyRequiresNewDialog = false;
        int i = C0587R.style.Theme_FullScreenDialog;
        if (this.mAnimationType.equals("fade")) {
            i = C0587R.style.Theme_FullScreenDialogAnimatedFade;
        } else if (this.mAnimationType.equals("slide")) {
            i = C0587R.style.Theme_FullScreenDialogAnimatedSlide;
        }
        Activity currentActivity = getCurrentActivity();
        Dialog dialog = new Dialog(currentActivity == null ? getContext() : currentActivity, i);
        this.mDialog = dialog;
        dialog.setContentView(getContentView());
        updateProperties();
        this.mDialog.setOnShowListener(this.mOnShowListener);
        this.mDialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
            /* class com.facebook.react.views.modal.ReactModalHostView.DialogInterface$OnKeyListenerC08691 */

            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 1) {
                    return false;
                }
                if (i == 4) {
                    Assertions.assertNotNull(ReactModalHostView.this.mOnRequestCloseListener, "setOnRequestCloseListener must be called by the manager");
                    ReactModalHostView.this.mOnRequestCloseListener.onRequestClose(dialogInterface);
                    return true;
                }
                Activity currentActivity = ((ReactContext) ReactModalHostView.this.getContext()).getCurrentActivity();
                if (currentActivity != null) {
                    return currentActivity.onKeyUp(i, keyEvent);
                }
                return false;
            }
        });
        this.mDialog.getWindow().setSoftInputMode(16);
        if (this.mHardwareAccelerated) {
            this.mDialog.getWindow().addFlags(16777216);
        }
        if (currentActivity != null && !currentActivity.isFinishing()) {
            this.mDialog.show();
        }
    }
}
