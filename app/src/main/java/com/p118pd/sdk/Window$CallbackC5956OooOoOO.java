package com.p118pd.sdk;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.OooOoOO  reason: case insensitive filesystem */
public class Window$CallbackC5956OooOoOO implements Window.Callback {
    public final Window.Callback OooO00o;

    public Window$CallbackC5956OooOoOO(Window.Callback callback) {
        if (callback != null) {
            this.OooO00o = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.OooO00o.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.OooO00o.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.OooO00o.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.OooO00o.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.OooO00o.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.OooO00o.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.OooO00o.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.OooO00o.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.OooO00o.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.OooO00o.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.OooO00o.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.OooO00o.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.OooO00o.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.OooO00o.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.OooO00o.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.OooO00o.onPanelClosed(i, menu);
    }

    @RequiresApi(26)
    public void onPointerCaptureChanged(boolean z) {
        this.OooO00o.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.OooO00o.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    @RequiresApi(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.OooO00o.onProvideKeyboardShortcuts(list, menu, i);
    }

    @RequiresApi(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.OooO00o.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.OooO00o.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.OooO00o.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.OooO00o.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested() {
        return this.OooO00o.onSearchRequested();
    }

    @RequiresApi(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.OooO00o.onWindowStartingActionMode(callback, i);
    }
}
