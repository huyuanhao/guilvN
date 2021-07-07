package com.p118pd.sdk;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;

/* renamed from: com.pd.sdk.o00OO0o  reason: case insensitive filesystem */
public class C7087o00OO0o {
    public static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate mBridge = new OooO00o(this);

    /* renamed from: com.pd.sdk.o00OO0o$OooO00o */
    public static final class OooO00o extends View.AccessibilityDelegate {
        public final C7087o00OO0o OooO00o;

        public OooO00o(C7087o00OO0o o00oo0o) {
            this.OooO00o = o00oo0o;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.OooO00o.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @RequiresApi(16)
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C7125o00OoOOO accessibilityNodeProvider = this.OooO00o.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.OooO00o();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.OooO00o.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.OooO00o.onInitializeAccessibilityNodeInfo(view, C7120o00OoOO.OooO00o(accessibilityNodeInfo));
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.OooO00o.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.OooO00o.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.OooO00o.performAccessibilityAction(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.OooO00o.sendAccessibilityEvent(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.OooO00o.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return DEFAULT_DELEGATE.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C7125o00OoOOO getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = DEFAULT_DELEGATE.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C7125o00OoOOO(accessibilityNodeProvider);
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        DEFAULT_DELEGATE.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C7120o00OoOO o00oooo) {
        DEFAULT_DELEGATE.onInitializeAccessibilityNodeInfo(view, o00oooo.m18404OooO00o());
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        DEFAULT_DELEGATE.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return DEFAULT_DELEGATE.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return DEFAULT_DELEGATE.performAccessibilityAction(view, i, bundle);
        }
        return false;
    }

    public void sendAccessibilityEvent(View view, int i) {
        DEFAULT_DELEGATE.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        DEFAULT_DELEGATE.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
