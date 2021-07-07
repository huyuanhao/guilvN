package com.facebook.react.uimanager;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.RadioButton;

public class AccessibilityHelper {
    public static final String BUTTON = "button";
    public static final View.AccessibilityDelegate BUTTON_DELEGATE = new View.AccessibilityDelegate() {
        /* class com.facebook.react.uimanager.AccessibilityHelper.C08351 */

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(Button.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Button.class.getName());
        }
    };
    public static final String RADIOBUTTON_CHECKED = "radiobutton_checked";
    public static final View.AccessibilityDelegate RADIOBUTTON_CHECKED_DELEGATE = new View.AccessibilityDelegate() {
        /* class com.facebook.react.uimanager.AccessibilityHelper.C08362 */

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(RadioButton.class.getName());
            accessibilityEvent.setChecked(true);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(RadioButton.class.getName());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    };
    public static final String RADIOBUTTON_UNCHECKED = "radiobutton_unchecked";
    public static final View.AccessibilityDelegate RADIOBUTTON_UNCHECKED_DELEGATE = new View.AccessibilityDelegate() {
        /* class com.facebook.react.uimanager.AccessibilityHelper.C08373 */

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(RadioButton.class.getName());
            accessibilityEvent.setChecked(false);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(RadioButton.class.getName());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(false);
        }
    };

    public static void sendAccessibilityEvent(View view, int i) {
        view.sendAccessibilityEvent(i);
    }

    public static void updateAccessibilityComponentType(View view, String str) {
        if (str == null) {
            view.setAccessibilityDelegate(null);
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1377687758) {
            if (hashCode != -1320494052) {
                if (hashCode == -714126251 && str.equals(RADIOBUTTON_CHECKED)) {
                    c = 1;
                }
            } else if (str.equals(RADIOBUTTON_UNCHECKED)) {
                c = 2;
            }
        } else if (str.equals(BUTTON)) {
            c = 0;
        }
        if (c == 0) {
            view.setAccessibilityDelegate(BUTTON_DELEGATE);
        } else if (c == 1) {
            view.setAccessibilityDelegate(RADIOBUTTON_CHECKED_DELEGATE);
        } else if (c != 2) {
            view.setAccessibilityDelegate(null);
        } else {
            view.setAccessibilityDelegate(RADIOBUTTON_UNCHECKED_DELEGATE);
        }
    }
}
