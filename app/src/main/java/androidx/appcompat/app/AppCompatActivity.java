package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.p118pd.sdk.AbstractC5932OooO0Oo;
import com.p118pd.sdk.AbstractC5951OooOo00;
import com.p118pd.sdk.C6955o0000OO0;
import com.p118pd.sdk.C6977o000O;
import com.p118pd.sdk.C6981o000O00O;
import com.p118pd.sdk.C7000o000Oo;
import com.p118pd.sdk.OooO00o;

public class AppCompatActivity extends FragmentActivity implements AbstractC5932OooO0Oo, C7000o000Oo.OooO00o, OooO00o.OooO0OO {
    public AppCompatDelegate mDelegate;
    public Resources mResources;
    public int mThemeId = 0;

    private boolean performMenuItemShortcut(int i, KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().OooO00o(view, layoutParams);
    }

    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.m14326OooO00o()) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.ComponentActivity
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.OooO00o(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@IdRes int i) {
        return (T) getDelegate().OooO00o(i);
    }

    @NonNull
    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.OooO00o(this, this);
        }
        return this.mDelegate;
    }

    @Override // com.p118pd.sdk.OooO00o.OooO0OO
    @Nullable
    public OooO00o.OooO0O0 getDrawerToggleDelegate() {
        return getDelegate().m14351OooO00o();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().m14349OooO00o();
    }

    public Resources getResources() {
        if (this.mResources == null && C6955o0000OO0.OooO0O0()) {
            this.mResources = new C6955o0000OO0(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    @Nullable
    public ActionBar getSupportActionBar() {
        return getDelegate().m14350OooO00o();
    }

    @Override // com.p118pd.sdk.C7000o000Oo.OooO00o
    @Nullable
    public Intent getSupportParentActivityIntent() {
        return C6977o000O.OooO00o((Activity) this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().OooO0O0();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().OooO00o(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    @Override // androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i;
        AppCompatDelegate delegate = getDelegate();
        delegate.m14352OooO00o();
        delegate.OooO00o(bundle);
        if (delegate.m14354OooO00o() && (i = this.mThemeId) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.mThemeId, false);
            } else {
                setTheme(i);
            }
        }
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(@NonNull C7000o000Oo o000oo) {
        o000oo.OooO00o((Activity) this);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().m14358OooO0OO();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.m14321OooO00o() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().OooO0O0(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().OooO0Oo();
    }

    public void onPrepareSupportNavigateUpTaskStack(@NonNull C7000o000Oo o000oo) {
    }

    @Override // androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().OooO0OO(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onStart() {
        super.onStart();
        getDelegate().OooO0o0();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onStop() {
        super.onStop();
        getDelegate().OooO0o();
    }

    @Override // com.p118pd.sdk.AbstractC5932OooO0Oo
    @CallSuper
    public void onSupportActionModeFinished(@NonNull AbstractC5951OooOo00 oooOo00) {
    }

    @Override // com.p118pd.sdk.AbstractC5932OooO0Oo
    @CallSuper
    public void onSupportActionModeStarted(@NonNull AbstractC5951OooOo00 oooOo00) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            C7000o000Oo OooO00o = C7000o000Oo.OooO00o((Context) this);
            onCreateSupportNavigateUpTaskStack(OooO00o);
            onPrepareSupportNavigateUpTaskStack(OooO00o);
            OooO00o.m18225OooO00o();
            try {
                C6981o000O00O.m18193OooO00o((Activity) this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().OooO00o(charSequence);
    }

    @Override // com.p118pd.sdk.AbstractC5932OooO0Oo
    @Nullable
    public AbstractC5951OooOo00 onWindowStartingSupportActionMode(@NonNull AbstractC5951OooOo00.OooO00o oooO00o) {
        return null;
    }

    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.m14337OooO0oO()) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void setContentView(@LayoutRes int i) {
        getDelegate().m14353OooO00o(i);
    }

    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        getDelegate().OooO00o(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(@StyleRes int i) {
        super.setTheme(i);
        this.mThemeId = i;
    }

    @Nullable
    public AbstractC5951OooOo00 startSupportActionMode(@NonNull AbstractC5951OooOo00.OooO00o oooO00o) {
        return getDelegate().OooO00o(oooO00o);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().OooO0O0();
    }

    public void supportNavigateUpTo(@NonNull Intent intent) {
        C6977o000O.OooO00o((Activity) this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().m14357OooO0O0(i);
    }

    public boolean supportShouldUpRecreateTask(@NonNull Intent intent) {
        return C6977o000O.m18192OooO00o((Activity) this, intent);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        getDelegate().OooO00o(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().OooO0O0(view, layoutParams);
    }
}
