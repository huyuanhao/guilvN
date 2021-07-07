package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.C0033R;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.p118pd.sdk.AbstractC5932OooO0Oo;
import com.p118pd.sdk.AbstractC5951OooOo00;
import com.p118pd.sdk.AbstractC5961Oooo;
import com.p118pd.sdk.AbstractC5976OoooO00;
import com.p118pd.sdk.AbstractC7107o00Oo000;
import com.p118pd.sdk.AbstractC7286o0O0O00;
import com.p118pd.sdk.AbstractC7385o0OOO0o;
import com.p118pd.sdk.AbstractC7617o0oOO;
import com.p118pd.sdk.C5926OooO;
import com.p118pd.sdk.C5936OooO0oo;
import com.p118pd.sdk.C5938OooOO0O;
import com.p118pd.sdk.C5939OooOO0o;
import com.p118pd.sdk.C5945OooOOO0;
import com.p118pd.sdk.C5952OooOo0O;
import com.p118pd.sdk.C5955OooOoO0;
import com.p118pd.sdk.C5963Oooo000;
import com.p118pd.sdk.C5965Oooo00o;
import com.p118pd.sdk.C5994Oooooo0;
import com.p118pd.sdk.C6954o0000OO;
import com.p118pd.sdk.C6955o0000OO0;
import com.p118pd.sdk.C6970o0000oO;
import com.p118pd.sdk.C6977o000O;
import com.p118pd.sdk.C7091o00OOO;
import com.p118pd.sdk.C7104o00Oo;
import com.p118pd.sdk.C7115o00Oo0oo;
import com.p118pd.sdk.C7119o00OoO0o;
import com.p118pd.sdk.C7600o0o0Oo;
import com.p118pd.sdk.DialogC5934OooO0o0;
import com.p118pd.sdk.OooO00o;
import com.p118pd.sdk.OooOo;
import com.p118pd.sdk.Window$CallbackC5956OooOoOO;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class AppCompatDelegateImpl extends AppCompatDelegate implements C5965Oooo00o.OooO00o, LayoutInflater.Factory2 {
    public static final int[] OooO00o = {16842836};
    public static final boolean OooOOo;
    public static final boolean OooOOo0 = false;
    public static boolean OooOOoo = true;
    public static final String o0OOO0o = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    public static final String o0ooOoO = "appcompat:local_night_mode";
    public boolean OooO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f13603OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Rect f13604OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public MenuInflater f13605OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f13606OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ViewGroup f13607OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Window.Callback f13608OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Window f13609OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PopupWindow f13610OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f13611OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ActionBar f13612OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO f13613OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5003OooOO0o f13614OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooOOO f13615OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PanelFeatureState f13616OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AppCompatViewInflater f13617OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ActionBarContextView f13618OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC5932OooO0Oo f13619OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5951OooOo00 f13620OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7115o00Oo0oo f13621OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7385o0OOO0o f13622OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CharSequence f13623OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f13624OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PanelFeatureState[] f13625OooO00o;
    public Rect OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Window.Callback f13626OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Runnable f13627OooO0O0 = new OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f13628OooO0O0 = true;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public boolean OooO0o;
    public boolean OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;
    public boolean OooOO0;
    public boolean OooOO0O;
    public boolean OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public boolean OooOOOO;
    public boolean OooOOOo;
    public int o000000;
    public int o000OOo = -100;

    public static class OooO00o implements Thread.UncaughtExceptionHandler {
        public final /* synthetic */ Thread.UncaughtExceptionHandler OooO00o;

        public OooO00o(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.OooO00o = uncaughtExceptionHandler;
        }

        private boolean OooO00o(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (OooO00o(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + AppCompatDelegateImpl.o0OOO0o);
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.OooO00o.uncaughtException(thread, notFoundException);
                return;
            }
            this.OooO00o.uncaughtException(thread, th);
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.o000000 & 1) != 0) {
                appCompatDelegateImpl.OooO0o0(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.o000000 & 4096) != 0) {
                appCompatDelegateImpl2.OooO0o0(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.OooOOOO = false;
            appCompatDelegateImpl3.o000000 = 0;
        }
    }

    public class OooO0OO implements AbstractC7107o00Oo000 {
        public OooO0OO() {
        }

        @Override // com.p118pd.sdk.AbstractC7107o00Oo000
        public C7119o00OoO0o OooO00o(View view, C7119o00OoO0o o00ooo0o) {
            int OooO0oo = o00ooo0o.OooO0oo();
            int OooO0O0 = AppCompatDelegateImpl.this.OooO0O0(OooO0oo);
            if (OooO0oo != OooO0O0) {
                o00ooo0o = o00ooo0o.OooO00o(o00ooo0o.OooO0o(), OooO0O0, o00ooo0o.OooO0oO(), o00ooo0o.OooO0o0());
            }
            return ViewCompat.OooO0O0(view, o00ooo0o);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$OooO0Oo  reason: case insensitive filesystem */
    public class C4999OooO0Oo implements AbstractC7286o0O0O00.OooO00o {
        public C4999OooO0Oo() {
        }

        @Override // com.p118pd.sdk.AbstractC7286o0O0O00.OooO00o
        public void OooO00o(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.OooO0O0(rect.top);
        }
    }

    public class OooO0o implements Runnable {

        public class OooO00o extends C7104o00Oo {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.C7104o00Oo, com.p118pd.sdk.AbstractC7617o0oOO
            public void OooO00o(View view) {
                AppCompatDelegateImpl.this.f13618OooO00o.setVisibility(0);
            }

            @Override // com.p118pd.sdk.C7104o00Oo, com.p118pd.sdk.AbstractC7617o0oOO
            public void OooO0OO(View view) {
                AppCompatDelegateImpl.this.f13618OooO00o.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f13621OooO00o.OooO00o((AbstractC7617o0oOO) null);
                AppCompatDelegateImpl.this.f13621OooO00o = null;
            }
        }

        public OooO0o() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f13610OooO00o.showAtLocation(appCompatDelegateImpl.f13618OooO00o, 55, 0, 0);
            AppCompatDelegateImpl.this.OooO0oo();
            if (AppCompatDelegateImpl.this.m14381OooO0o0()) {
                AppCompatDelegateImpl.this.f13618OooO00o.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f13621OooO00o = ViewCompat.m14572OooO00o((View) appCompatDelegateImpl2.f13618OooO00o).OooO00o(1.0f);
                AppCompatDelegateImpl.this.f13621OooO00o.OooO00o(new OooO00o());
                return;
            }
            AppCompatDelegateImpl.this.f13618OooO00o.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f13618OooO00o.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$OooO0o0  reason: case insensitive filesystem */
    public class C5000OooO0o0 implements ContentFrameLayout.OooO00o {
        public C5000OooO0o0() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.OooO00o
        public void OooO00o() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.OooO00o
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.OooO0oO();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$OooO0oO  reason: case insensitive filesystem */
    public class C5001OooO0oO extends C7104o00Oo {
        public C5001OooO0oO() {
        }

        @Override // com.p118pd.sdk.C7104o00Oo, com.p118pd.sdk.AbstractC7617o0oOO
        public void OooO00o(View view) {
            AppCompatDelegateImpl.this.f13618OooO00o.setVisibility(0);
            AppCompatDelegateImpl.this.f13618OooO00o.sendAccessibilityEvent(32);
            if (AppCompatDelegateImpl.this.f13618OooO00o.getParent() instanceof View) {
                ViewCompat.m14594OooO0o((View) AppCompatDelegateImpl.this.f13618OooO00o.getParent());
            }
        }

        @Override // com.p118pd.sdk.C7104o00Oo, com.p118pd.sdk.AbstractC7617o0oOO
        public void OooO0OO(View view) {
            AppCompatDelegateImpl.this.f13618OooO00o.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f13621OooO00o.OooO00o((AbstractC7617o0oOO) null);
            AppCompatDelegateImpl.this.f13621OooO00o = null;
        }
    }

    public class OooOO0 implements AbstractC5951OooOo00.OooO00o {

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC5951OooOo00.OooO00o f13629OooO00o;

        public class OooO00o extends C7104o00Oo {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.C7104o00Oo, com.p118pd.sdk.AbstractC7617o0oOO
            public void OooO0OO(View view) {
                AppCompatDelegateImpl.this.f13618OooO00o.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f13610OooO00o;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f13618OooO00o.getParent() instanceof View) {
                    ViewCompat.m14594OooO0o((View) AppCompatDelegateImpl.this.f13618OooO00o.getParent());
                }
                AppCompatDelegateImpl.this.f13618OooO00o.removeAllViews();
                AppCompatDelegateImpl.this.f13621OooO00o.OooO00o((AbstractC7617o0oOO) null);
                AppCompatDelegateImpl.this.f13621OooO00o = null;
            }
        }

        public OooOO0(AbstractC5951OooOo00.OooO00o oooO00o) {
            this.f13629OooO00o = oooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00.OooO00o
        public boolean OooO00o(AbstractC5951OooOo00 oooOo00, Menu menu) {
            return this.f13629OooO00o.OooO00o(oooOo00, menu);
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00.OooO00o
        public boolean OooO0O0(AbstractC5951OooOo00 oooOo00, Menu menu) {
            return this.f13629OooO00o.OooO0O0(oooOo00, menu);
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00.OooO00o
        public boolean OooO00o(AbstractC5951OooOo00 oooOo00, MenuItem menuItem) {
            return this.f13629OooO00o.OooO00o(oooOo00, menuItem);
        }

        @Override // com.p118pd.sdk.AbstractC5951OooOo00.OooO00o
        public void OooO00o(AbstractC5951OooOo00 oooOo00) {
            this.f13629OooO00o.OooO00o(oooOo00);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f13610OooO00o != null) {
                appCompatDelegateImpl.f13609OooO00o.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f13624OooO00o);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f13618OooO00o != null) {
                appCompatDelegateImpl2.OooO0oo();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f13621OooO00o = ViewCompat.m14572OooO00o((View) appCompatDelegateImpl3.f13618OooO00o).OooO00o(0.0f);
                AppCompatDelegateImpl.this.f13621OooO00o.OooO00o(new OooO00o());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            AbstractC5932OooO0Oo oooO0Oo = appCompatDelegateImpl4.f13619OooO00o;
            if (oooO0Oo != null) {
                oooO0Oo.onSupportActionModeFinished(appCompatDelegateImpl4.f13620OooO00o);
            }
            AppCompatDelegateImpl.this.f13620OooO00o = null;
        }
    }

    @VisibleForTesting
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$OooOO0o  reason: case insensitive filesystem */
    public final class C5003OooOO0o {
        public BroadcastReceiver OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public IntentFilter f13630OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C5938OooOO0O f13632OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f13633OooO00o;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$OooOO0o$OooO00o */
        public class OooO00o extends BroadcastReceiver {
            public OooO00o() {
            }

            public void onReceive(Context context, Intent intent) {
                C5003OooOO0o.this.OooO0O0();
            }
        }

        public C5003OooOO0o(@NonNull C5938OooOO0O oooOO0O) {
            this.f13632OooO00o = oooOO0O;
            this.f13633OooO00o = oooOO0O.m16672OooO00o();
        }

        public int OooO00o() {
            boolean OooO00o2 = this.f13632OooO00o.m16672OooO00o();
            this.f13633OooO00o = OooO00o2;
            return OooO00o2 ? 2 : 1;
        }

        public void OooO0O0() {
            boolean OooO00o2 = this.f13632OooO00o.m16672OooO00o();
            if (OooO00o2 != this.f13633OooO00o) {
                this.f13633OooO00o = OooO00o2;
                AppCompatDelegateImpl.this.m14372OooO00o();
            }
        }

        public void OooO0OO() {
            m14384OooO00o();
            if (this.OooO00o == null) {
                this.OooO00o = new OooO00o();
            }
            if (this.f13630OooO00o == null) {
                IntentFilter intentFilter = new IntentFilter();
                this.f13630OooO00o = intentFilter;
                intentFilter.addAction("android.intent.action.TIME_SET");
                this.f13630OooO00o.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f13630OooO00o.addAction("android.intent.action.TIME_TICK");
            }
            AppCompatDelegateImpl.this.f13603OooO00o.registerReceiver(this.OooO00o, this.f13630OooO00o);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14384OooO00o() {
            BroadcastReceiver broadcastReceiver = this.OooO00o;
            if (broadcastReceiver != null) {
                AppCompatDelegateImpl.this.f13603OooO00o.unregisterReceiver(broadcastReceiver);
                this.OooO00o = null;
            }
        }
    }

    public class OooOOO0 extends ContentFrameLayout {
        public OooOOO0(Context context) {
            super(context);
        }

        private boolean OooO00o(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.OooO00o(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !OooO00o((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.OooO0Oo(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C5945OooOOO0.m16716OooO00o(getContext(), i));
        }
    }

    static {
        boolean z = Build.VERSION.SDK_INT < 21;
        OooOOo = z;
        if (z && !OooOOoo) {
            Thread.setDefaultUncaughtExceptionHandler(new OooO00o(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, AbstractC5932OooO0Oo oooO0Oo) {
        this.f13603OooO00o = context;
        this.f13609OooO00o = window;
        this.f13619OooO00o = oooO0Oo;
        Window.Callback callback = window.getCallback();
        this.f13608OooO00o = callback;
        if (!(callback instanceof OooOO0O)) {
            OooOO0O oooOO0O = new OooOO0O(callback);
            this.f13626OooO0O0 = oooOO0O;
            this.f13609OooO00o.setCallback(oooOO0O);
            C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(context, (AttributeSet) null, OooO00o);
            Drawable OooO0O02 = OooO00o2.m18170OooO0O0(0);
            if (OooO0O02 != null) {
                this.f13609OooO00o.setBackgroundDrawable(OooO0O02);
            }
            OooO00o2.m18167OooO00o();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private void OooO() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f13607OooO00o.findViewById(16908290);
        View decorView = this.f13609OooO00o.getDecorView();
        contentFrameLayout.OooO00o(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f13603OooO00o.obtainStyledAttributes(C0033R.styleable.OooOOOO);
        obtainStyledAttributes.getValue(C0033R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0033R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0033R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0033R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0033R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0033R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0033R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0033R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0033R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0033R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void OooOO0() {
        if (this.f13614OooO00o == null) {
            this.f13614OooO00o = new C5003OooOO0o(C5938OooOO0O.OooO00o(this.f13603OooO00o));
        }
    }

    private void OooOO0O() {
        if (!this.OooO0OO) {
            this.f13607OooO00o = m14360OooO0O0();
            CharSequence OooO00o2 = m14369OooO00o();
            if (!TextUtils.isEmpty(OooO00o2)) {
                AbstractC7385o0OOO0o o0ooo0o = this.f13622OooO00o;
                if (o0ooo0o != null) {
                    o0ooo0o.setWindowTitle(OooO00o2);
                } else if (m14374OooO0O0() != null) {
                    m14374OooO0O0().OooO0Oo(OooO00o2);
                } else {
                    TextView textView = this.f13611OooO00o;
                    if (textView != null) {
                        textView.setText(OooO00o2);
                    }
                }
            }
            OooO();
            OooO00o(this.f13607OooO00o);
            this.OooO0OO = true;
            PanelFeatureState OooO00o3 = OooO00o(0, false);
            if (this.OooOOO0) {
                return;
            }
            if (OooO00o3 == null || OooO00o3.f13639OooO00o == null) {
                OooO0oo(108);
            }
        }
    }

    private void OooOO0o() {
        OooOO0O();
        if (this.OooO0o && this.f13612OooO00o == null) {
            Window.Callback callback = this.f13608OooO00o;
            if (callback instanceof Activity) {
                this.f13612OooO00o = new C5939OooOO0o((Activity) this.f13608OooO00o, this.OooO0oO);
            } else if (callback instanceof Dialog) {
                this.f13612OooO00o = new C5939OooOO0o((Dialog) this.f13608OooO00o);
            }
            ActionBar actionBar = this.f13612OooO00o;
            if (actionBar != null) {
                actionBar.OooO0OO(this.OooOOOo);
            }
        }
    }

    private void OooOOO0() {
        if (this.OooO0OO) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void OooO00o(Bundle bundle) {
        Window.Callback callback = this.f13608OooO00o;
        if (callback instanceof Activity) {
            String str = null;
            try {
                str = C6977o000O.m18189OooO00o((Activity) callback);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar OooO0O02 = m14374OooO0O0();
                if (OooO0O02 == null) {
                    this.OooOOOo = true;
                } else {
                    OooO0O02.OooO0OO(true);
                }
            }
        }
        if (bundle != null && this.o000OOo == -100) {
            this.o000OOo = bundle.getInt(o0ooOoO, -100);
        }
    }

    public void OooO00o(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void OooO0O0(Bundle bundle) {
        OooOO0O();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void OooO0OO(Bundle bundle) {
        int i = this.o000OOo;
        if (i != -100) {
            bundle.putInt(o0ooOoO, i);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void OooO0Oo() {
        ActionBar OooO00o2 = m14366OooO00o();
        if (OooO00o2 != null) {
            OooO00o2.OooOO0O(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO0o  reason: collision with other method in class */
    public void m14380OooO0o() {
        ActionBar OooO00o2 = m14366OooO00o();
        if (OooO00o2 != null) {
            OooO00o2.OooOO0O(false);
        }
        C5003OooOO0o oooOO0o = this.f13614OooO00o;
        if (oooOO0o != null) {
            oooOO0o.m14384OooO00o();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void OooO0o0() {
        m14372OooO00o();
    }

    public void OooO0oO(int i) {
        if (i == 108) {
            ActionBar OooO00o2 = m14366OooO00o();
            if (OooO00o2 != null) {
                OooO00o2.OooO0O0(false);
            }
        } else if (i == 0) {
            PanelFeatureState OooO00o3 = OooO00o(i, true);
            if (OooO00o3.f13644OooO0OO) {
                OooO00o(OooO00o3, false);
            }
        }
    }

    public void OooO0oo() {
        C7115o00Oo0oo o00oo0oo = this.f13621OooO00o;
        if (o00oo0oo != null) {
            o00oo0oo.m18388OooO00o();
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return OooO00o(view, str, context, attributeSet);
    }

    public final class OooO implements AbstractC5961Oooo.OooO00o {
        public OooO() {
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo.OooO00o
        public boolean OooO00o(C5965Oooo00o oooo00o) {
            Window.Callback OooO00o2 = AppCompatDelegateImpl.this.m14365OooO00o();
            if (OooO00o2 == null) {
                return true;
            }
            OooO00o2.onMenuOpened(108, oooo00o);
            return true;
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo.OooO00o
        public void OooO00o(C5965Oooo00o oooo00o, boolean z) {
            AppCompatDelegateImpl.this.OooO0O0(oooo00o);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final ActionBar m14374OooO0O0() {
        return this.f13612OooO00o;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public final boolean m14381OooO0o0() {
        ViewGroup viewGroup;
        return this.OooO0OO && (viewGroup = this.f13607OooO00o) != null && ViewCompat.m14612OooOOO(viewGroup);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public static final class PanelFeatureState {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Context f13634OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Bundle f13635OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public View f13636OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ViewGroup f13637OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C5963Oooo000 f13638OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C5965Oooo00o f13639OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f13640OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public Bundle f13641OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public View f13642OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f13643OooO0O0;
        public int OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public boolean f13644OooO0OO;
        public int OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public boolean f13645OooO0Oo;
        public int OooO0o;

        /* renamed from: OooO0o  reason: collision with other field name */
        public boolean f13646OooO0o;
        public int OooO0o0;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public boolean f13647OooO0o0 = false;
        public boolean OooO0oO;

        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();
            public Bundle OooO00o;
            public boolean OooO0O0;
            public int o00oO0O;

            public static class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
                /* renamed from: OooO00o */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.OooO00o(parcel, classLoader);
                }

                /* renamed from: OooO00o */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.OooO00o(parcel, null);
                }

                /* renamed from: OooO00o */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            public static SavedState OooO00o(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.o00oO0O = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.OooO0O0 = z;
                if (z) {
                    savedState.OooO00o = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.o00oO0O);
                parcel.writeInt(this.OooO0O0 ? 1 : 0);
                if (this.OooO0O0) {
                    parcel.writeBundle(this.OooO00o);
                }
            }
        }

        public PanelFeatureState(int i) {
            this.OooO00o = i;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14386OooO00o() {
            if (this.f13636OooO00o == null) {
                return false;
            }
            if (this.f13642OooO0O0 == null && this.f13638OooO00o.m16766OooO00o().getCount() <= 0) {
                return false;
            }
            return true;
        }

        public void OooO0O0() {
            C5965Oooo00o oooo00o = this.f13639OooO00o;
            if (oooo00o != null) {
                oooo00o.OooO0O0(this.f13638OooO00o);
            }
            this.f13638OooO00o = null;
        }

        public void OooO00o(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0033R.attr.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C0033R.attr.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C0033R.style.Theme_AppCompat_CompactMenu, true);
            }
            C5952OooOo0O oooOo0O = new C5952OooOo0O(context, 0);
            oooOo0O.getTheme().setTo(newTheme);
            this.f13634OooO00o = oooOo0O;
            TypedArray obtainStyledAttributes = oooOo0O.obtainStyledAttributes(C0033R.styleable.OooOOOO);
            this.OooO0O0 = obtainStyledAttributes.getResourceId(C0033R.styleable.AppCompatTheme_panelBackground, 0);
            this.OooO0o = obtainStyledAttributes.getResourceId(C0033R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        public void OooO00o(C5965Oooo00o oooo00o) {
            C5963Oooo000 oooo000;
            C5965Oooo00o oooo00o2 = this.f13639OooO00o;
            if (oooo00o != oooo00o2) {
                if (oooo00o2 != null) {
                    oooo00o2.OooO0O0(this.f13638OooO00o);
                }
                this.f13639OooO00o = oooo00o;
                if (oooo00o != null && (oooo000 = this.f13638OooO00o) != null) {
                    oooo00o.OooO00o(oooo000);
                }
            }
        }

        public AbstractC5976OoooO00 OooO00o(AbstractC5961Oooo.OooO00o oooO00o) {
            if (this.f13639OooO00o == null) {
                return null;
            }
            if (this.f13638OooO00o == null) {
                C5963Oooo000 oooo000 = new C5963Oooo000(this.f13634OooO00o, C0033R.layout.abc_list_menu_item_layout);
                this.f13638OooO00o = oooo000;
                oooo000.OooO00o(oooO00o);
                this.f13639OooO00o.OooO00o(this.f13638OooO00o);
            }
            return this.f13638OooO00o.OooO00o(this.f13637OooO00o);
        }

        public Parcelable OooO00o() {
            SavedState savedState = new SavedState();
            savedState.o00oO0O = this.OooO00o;
            savedState.OooO0O0 = this.f13644OooO0OO;
            if (this.f13639OooO00o != null) {
                Bundle bundle = new Bundle();
                savedState.OooO00o = bundle;
                this.f13639OooO00o.OooO0Oo(bundle);
            }
            return savedState;
        }

        public void OooO00o(Parcelable parcelable) {
            SavedState savedState = (SavedState) parcelable;
            this.OooO00o = savedState.o00oO0O;
            this.OooO0oO = savedState.OooO0O0;
            this.f13635OooO00o = savedState.OooO00o;
            this.f13636OooO00o = null;
            this.f13637OooO00o = null;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m14385OooO00o() {
            Bundle bundle;
            C5965Oooo00o oooo00o = this.f13639OooO00o;
            if (oooo00o != null && (bundle = this.f13635OooO00o) != null) {
                oooo00o.OooO0O0(bundle);
                this.f13635OooO00o = null;
            }
        }
    }

    private boolean OooO0o0(int i, KeyEvent keyEvent) {
        AudioManager audioManager;
        boolean z;
        AbstractC7385o0OOO0o o0ooo0o;
        if (this.f13620OooO00o != null) {
            return false;
        }
        boolean z2 = true;
        PanelFeatureState OooO00o2 = OooO00o(i, true);
        if (i == 0 && (o0ooo0o = this.f13622OooO00o) != null && o0ooo0o.OooO0OO() && !ViewConfiguration.get(this.f13603OooO00o).hasPermanentMenuKey()) {
            if (this.f13622OooO00o.OooO0o()) {
                z2 = this.f13622OooO00o.OooO0oO();
            } else if (!this.OooOOO0 && m14359OooO00o(OooO00o2, keyEvent)) {
                z2 = this.f13622OooO00o.OooO0Oo();
            }
            audioManager.playSoundEffect(0);
            return z2;
        } else if (OooO00o2.f13644OooO0OO || OooO00o2.f13643OooO0O0) {
            boolean z3 = OooO00o2.f13644OooO0OO;
            OooO00o(OooO00o2, true);
            z2 = z3;
            if (z2 && (audioManager = (AudioManager) this.f13603OooO00o.getSystemService("audio")) != null) {
                audioManager.playSoundEffect(0);
            }
            return z2;
        } else if (OooO00o2.f13640OooO00o) {
            if (OooO00o2.f13646OooO0o) {
                OooO00o2.f13640OooO00o = false;
                z = m14359OooO00o(OooO00o2, keyEvent);
            } else {
                z = true;
            }
            if (z) {
                OooO00o(OooO00o2, keyEvent);
                audioManager.playSoundEffect(0);
                return z2;
            }
        }
        z2 = false;
        audioManager.playSoundEffect(0);
        return z2;
    }

    private void OooO0oo(int i) {
        this.o000000 = (1 << i) | this.o000000;
        if (!this.OooOOOO) {
            ViewCompat.OooO00o(this.f13609OooO00o.getDecorView(), this.f13627OooO0O0);
            this.OooOOOO = true;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void OooO0O0(View view, ViewGroup.LayoutParams layoutParams) {
        OooOO0O();
        ViewGroup viewGroup = (ViewGroup) this.f13607OooO00o.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f13608OooO00o.onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void OooO0OO() {
        if (this.OooOOOO) {
            this.f13609OooO00o.getDecorView().removeCallbacks(this.f13627OooO0O0);
        }
        this.OooOOO0 = true;
        ActionBar actionBar = this.f13612OooO00o;
        if (actionBar != null) {
            actionBar.m14332OooO0o();
        }
        C5003OooOO0o oooOO0o = this.f13614OooO00o;
        if (oooOO0o != null) {
            oooOO0o.m14384OooO00o();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m14379OooO0Oo() {
        AbstractC5951OooOo00 oooOo00 = this.f13620OooO00o;
        if (oooOo00 != null) {
            oooOo00.m16745OooO00o();
            return true;
        }
        ActionBar OooO00o2 = m14366OooO00o();
        if (OooO00o2 == null || !OooO00o2.m14329OooO0O0()) {
            return false;
        }
        return true;
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$OooO0oo  reason: case insensitive filesystem */
    public class C5002OooO0oo implements OooO00o.OooO0O0 {
        public C5002OooO0oo() {
        }

        @Override // com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Drawable m14382OooO00o() {
            C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(OooO00o(), (AttributeSet) null, new int[]{C0033R.attr.homeAsUpIndicator});
            Drawable OooO00o3 = OooO00o2.m18162OooO00o(0);
            OooO00o2.m18167OooO00o();
            return OooO00o3;
        }

        @Override // com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0
        public Context OooO00o() {
            return AppCompatDelegateImpl.this.OooO00o();
        }

        @Override // com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0, com.p118pd.sdk.OooO00o.OooO0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14383OooO00o() {
            ActionBar OooO00o2 = AppCompatDelegateImpl.this.m14366OooO00o();
            return (OooO00o2 == null || (OooO00o2.m14321OooO00o() & 4) == 0) ? false : true;
        }

        @Override // com.p118pd.sdk.OooO00o.OooO0O0
        public void OooO00o(Drawable drawable, int i) {
            ActionBar OooO00o2 = AppCompatDelegateImpl.this.m14366OooO00o();
            if (OooO00o2 != null) {
                OooO00o2.OooO0O0(drawable);
                OooO00o2.OooO0o(i);
            }
        }

        @Override // com.p118pd.sdk.OooO00o.OooO0O0
        public void OooO00o(int i) {
            ActionBar OooO00o2 = AppCompatDelegateImpl.this.m14366OooO00o();
            if (OooO00o2 != null) {
                OooO00o2.OooO0o(i);
            }
        }
    }

    public class OooOO0O extends Window$CallbackC5956OooOoOO {
        public OooOO0O(Window.Callback callback) {
            super(callback);
        }

        public final ActionMode OooO00o(ActionMode.Callback callback) {
            OooOo.OooO00o oooO00o = new OooOo.OooO00o(AppCompatDelegateImpl.this.f13603OooO00o, callback);
            AbstractC5951OooOo00 OooO00o2 = AppCompatDelegateImpl.this.OooO00o(oooO00o);
            if (OooO00o2 != null) {
                return oooO00o.OooO00o(OooO00o2);
            }
            return null;
        }

        @Override // com.p118pd.sdk.Window$CallbackC5956OooOoOO
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.OooO00o(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // com.p118pd.sdk.Window$CallbackC5956OooOoOO
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.OooO0O0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // com.p118pd.sdk.Window$CallbackC5956OooOoOO
        public void onContentChanged() {
        }

        @Override // com.p118pd.sdk.Window$CallbackC5956OooOoOO
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C5965Oooo00o)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // com.p118pd.sdk.Window$CallbackC5956OooOoOO
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.OooO0o(i);
            return true;
        }

        @Override // com.p118pd.sdk.Window$CallbackC5956OooOoOO
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.OooO0oO(i);
        }

        @Override // com.p118pd.sdk.Window$CallbackC5956OooOoOO
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C5965Oooo00o oooo00o = menu instanceof C5965Oooo00o ? (C5965Oooo00o) menu : null;
            if (i == 0 && oooo00o == null) {
                return false;
            }
            if (oooo00o != null) {
                oooo00o.OooO0Oo(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (oooo00o != null) {
                oooo00o.OooO0Oo(false);
            }
            return onPreparePanel;
        }

        @Override // com.p118pd.sdk.Window$CallbackC5956OooOoOO, android.view.Window.Callback
        @RequiresApi(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C5965Oooo00o oooo00o;
            PanelFeatureState OooO00o2 = AppCompatDelegateImpl.this.OooO00o(0, true);
            if (OooO00o2 == null || (oooo00o = OooO00o2.f13639OooO00o) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, oooo00o, i);
            }
        }

        @Override // com.p118pd.sdk.Window$CallbackC5956OooOoOO
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.m14377OooO0O0()) {
                return OooO00o(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // com.p118pd.sdk.Window$CallbackC5956OooOoOO
        @RequiresApi(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!AppCompatDelegateImpl.this.m14377OooO0O0() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return OooO00o(callback);
        }
    }

    public final class OooOOO implements AbstractC5961Oooo.OooO00o {
        public OooOOO() {
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo.OooO00o
        public void OooO00o(C5965Oooo00o oooo00o, boolean z) {
            C5965Oooo00o OooO00o2 = oooo00o.m16773OooO00o();
            boolean z2 = OooO00o2 != oooo00o;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                oooo00o = OooO00o2;
            }
            PanelFeatureState OooO00o3 = appCompatDelegateImpl.OooO00o((Menu) oooo00o);
            if (OooO00o3 == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.OooO00o(OooO00o3.OooO00o, OooO00o3, OooO00o2);
                AppCompatDelegateImpl.this.OooO00o(OooO00o3, true);
                return;
            }
            AppCompatDelegateImpl.this.OooO00o(OooO00o3, z);
        }

        @Override // com.p118pd.sdk.AbstractC5961Oooo.OooO00o
        public boolean OooO00o(C5965Oooo00o oooo00o) {
            Window.Callback OooO00o2;
            if (oooo00o != null) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.OooO0o || (OooO00o2 = appCompatDelegateImpl.m14365OooO00o()) == null || AppCompatDelegateImpl.this.OooOOO0) {
                return true;
            }
            OooO00o2.onMenuOpened(108, oooo00o);
            return true;
        }
    }

    public void OooO0o(int i) {
        ActionBar OooO00o2;
        if (i == 108 && (OooO00o2 = m14366OooO00o()) != null) {
            OooO00o2.OooO0O0(true);
        }
    }

    public void OooO0oO() {
        C5965Oooo00o oooo00o;
        AbstractC7385o0OOO0o o0ooo0o = this.f13622OooO00o;
        if (o0ooo0o != null) {
            o0ooo0o.OooO0O0();
        }
        if (this.f13610OooO00o != null) {
            this.f13609OooO00o.getDecorView().removeCallbacks(this.f13624OooO00o);
            if (this.f13610OooO00o.isShowing()) {
                try {
                    this.f13610OooO00o.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f13610OooO00o = null;
        }
        OooO0oo();
        PanelFeatureState OooO00o2 = OooO00o(0, false);
        if (OooO00o2 != null && (oooo00o = OooO00o2.f13639OooO00o) != null) {
            oooo00o.close();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    private boolean OooO0o() {
        if (this.OooOOO) {
            Context context = this.f13603OooO00o;
            if (context instanceof Activity) {
                try {
                    if ((context.getPackageManager().getActivityInfo(new ComponentName(this.f13603OooO00o, this.f13603OooO00o.getClass()), 0).configChanges & 512) == 0) {
                        return true;
                    }
                    return false;
                } catch (PackageManager.NameNotFoundException unused) {
                    return true;
                }
            }
        }
        return false;
    }

    public void OooO0Oo(int i) {
        OooO00o(OooO00o(i, true), true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO0O0  reason: collision with other method in class */
    private ViewGroup m14360OooO0O0() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f13603OooO00o.obtainStyledAttributes(C0033R.styleable.OooOOOO);
        if (obtainStyledAttributes.hasValue(C0033R.styleable.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C0033R.styleable.AppCompatTheme_windowNoTitle, false)) {
                m14378OooO0O0(1);
            } else if (obtainStyledAttributes.getBoolean(C0033R.styleable.AppCompatTheme_windowActionBar, false)) {
                m14378OooO0O0(108);
            }
            if (obtainStyledAttributes.getBoolean(C0033R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                m14378OooO0O0(109);
            }
            if (obtainStyledAttributes.getBoolean(C0033R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                m14378OooO0O0(10);
            }
            this.OooO = obtainStyledAttributes.getBoolean(C0033R.styleable.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            this.f13609OooO00o.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f13603OooO00o);
            if (this.OooOO0) {
                if (this.OooO0oo) {
                    viewGroup = (ViewGroup) from.inflate(C0033R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
                } else {
                    viewGroup = (ViewGroup) from.inflate(C0033R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    ViewCompat.OooO00o(viewGroup, new OooO0OO());
                } else {
                    ((AbstractC7286o0O0O00) viewGroup).setOnFitSystemWindowsListener(new C4999OooO0Oo());
                }
            } else if (this.OooO) {
                viewGroup = (ViewGroup) from.inflate(C0033R.layout.abc_dialog_title_material, (ViewGroup) null);
                this.OooO0oO = false;
                this.OooO0o = false;
            } else if (this.OooO0o) {
                TypedValue typedValue = new TypedValue();
                this.f13603OooO00o.getTheme().resolveAttribute(C0033R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new C5952OooOo0O(this.f13603OooO00o, typedValue.resourceId);
                } else {
                    context = this.f13603OooO00o;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C0033R.layout.abc_screen_toolbar, (ViewGroup) null);
                AbstractC7385o0OOO0o o0ooo0o = (AbstractC7385o0OOO0o) viewGroup.findViewById(C0033R.C0036id.decor_content_parent);
                this.f13622OooO00o = o0ooo0o;
                o0ooo0o.setWindowCallback(m14365OooO00o());
                if (this.OooO0oO) {
                    this.f13622OooO00o.OooO00o(109);
                }
                if (this.OooO0Oo) {
                    this.f13622OooO00o.OooO00o(2);
                }
                if (this.OooO0o0) {
                    this.f13622OooO00o.OooO00o(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f13622OooO00o == null) {
                    this.f13611OooO00o = (TextView) viewGroup.findViewById(C0033R.C0036id.title);
                }
                C6954o0000OO.OooO00o((View) viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0033R.C0036id.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f13609OooO00o.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f13609OooO00o.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C5000OooO0o0());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.OooO0o + ", windowActionBarOverlay: " + this.OooO0oO + ", android:windowIsFloating: " + this.OooO + ", windowActionModeOverlay: " + this.OooO0oo + ", windowNoTitle: " + this.OooOO0 + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private boolean OooO0Oo(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState OooO00o2 = OooO00o(i, true);
        if (!OooO00o2.f13644OooO0OO) {
            return m14359OooO00o(OooO00o2, keyEvent);
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ActionBar m14366OooO00o() {
        OooOO0o();
        return this.f13612OooO00o;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Window.Callback m14365OooO00o() {
        return this.f13609OooO00o.getCallback();
    }

    public boolean OooO0OO(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.OooOO0o;
            this.OooOO0o = false;
            PanelFeatureState OooO00o2 = OooO00o(0, false);
            if (OooO00o2 != null && OooO00o2.f13644OooO0OO) {
                if (!z) {
                    OooO00o(OooO00o2, true);
                }
                return true;
            } else if (m14379OooO0Oo()) {
                return true;
            }
        } else if (i == 82) {
            OooO0o0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void OooO00o(Toolbar toolbar) {
        if (this.f13608OooO00o instanceof Activity) {
            ActionBar OooO00o2 = m14366OooO00o();
            if (!(OooO00o2 instanceof C5939OooOO0o)) {
                this.f13605OooO00o = null;
                if (OooO00o2 != null) {
                    OooO00o2.m14332OooO0o();
                }
                if (toolbar != null) {
                    C5926OooO oooO = new C5926OooO(toolbar, ((Activity) this.f13608OooO00o).getTitle(), this.f13626OooO0O0);
                    this.f13612OooO00o = oooO;
                    this.f13609OooO00o.setCallback(oooO.m16644OooO00o());
                } else {
                    this.f13612OooO00o = null;
                    this.f13609OooO00o.setCallback(this.f13626OooO0O0);
                }
                m14375OooO0O0();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    private boolean OooO0OO(PanelFeatureState panelFeatureState) {
        Context context = this.f13603OooO00o;
        int i = panelFeatureState.OooO00o;
        if ((i == 0 || i == 108) && this.f13622OooO00o != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C0033R.attr.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0033R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0033R.attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C5952OooOo0O oooOo0O = new C5952OooOo0O(context, 0);
                oooOo0O.getTheme().setTo(theme2);
                context = oooOo0O;
            }
        }
        C5965Oooo00o oooo00o = new C5965Oooo00o(context);
        oooo00o.OooO00o(this);
        panelFeatureState.OooO00o(oooo00o);
        return true;
    }

    public void OooO0o0(int i) {
        PanelFeatureState OooO00o2;
        PanelFeatureState OooO00o3 = OooO00o(i, true);
        if (OooO00o3.f13639OooO00o != null) {
            Bundle bundle = new Bundle();
            OooO00o3.f13639OooO00o.OooO0OO(bundle);
            if (bundle.size() > 0) {
                OooO00o3.f13641OooO0O0 = bundle;
            }
            OooO00o3.f13639OooO00o.OooO0o0();
            OooO00o3.f13639OooO00o.clear();
        }
        OooO00o3.f13646OooO0o = true;
        OooO00o3.f13647OooO0o0 = true;
        if ((i == 108 || i == 0) && this.f13622OooO00o != null && (OooO00o2 = OooO00o(0, false)) != null) {
            OooO00o2.f13640OooO00o = false;
            m14359OooO00o(OooO00o2, (KeyEvent) null);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    public final Context OooO00o() {
        ActionBar OooO00o2 = m14366OooO00o();
        Context OooO00o3 = OooO00o2 != null ? OooO00o2.m14322OooO00o() : null;
        return OooO00o3 == null ? this.f13603OooO00o : OooO00o3;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO00o  reason: collision with other method in class */
    public MenuInflater m14362OooO00o() {
        if (this.f13605OooO00o == null) {
            OooOO0o();
            ActionBar actionBar = this.f13612OooO00o;
            this.f13605OooO00o = new C5955OooOoO0(actionBar != null ? actionBar.m14322OooO00o() : this.f13603OooO00o);
        }
        return this.f13605OooO00o;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public <T extends View> T m14363OooO00o(@IdRes int i) {
        OooOO0O();
        return (T) this.f13609OooO00o.findViewById(i);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void OooO00o(Configuration configuration) {
        ActionBar OooO00o2;
        if (this.OooO0o && this.OooO0OO && (OooO00o2 = m14366OooO00o()) != null) {
            OooO00o2.OooO00o(configuration);
        }
        C5994Oooooo0.OooO00o().m16834OooO00o(this.f13603OooO00o);
        m14372OooO00o();
    }

    private int OooO0OO(int i) {
        if (i == 8) {
            Log.i(AppCompatDelegate.f13602o0ooOOo, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i(AppCompatDelegate.f13602o0ooOOo, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    private boolean m14361OooO0OO(int i) {
        Resources resources = this.f13603OooO00o.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (OooO0o()) {
            ((Activity) this.f13603OooO00o).recreate();
            return true;
        }
        Configuration configuration2 = new Configuration(configuration);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        resources.updateConfiguration(configuration2, displayMetrics);
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        C5936OooO0oo.OooO00o(resources);
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void OooO00o(View view) {
        OooOO0O();
        ViewGroup viewGroup = (ViewGroup) this.f13607OooO00o.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f13608OooO00o.onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14371OooO00o(int i) {
        OooOO0O();
        ViewGroup viewGroup = (ViewGroup) this.f13607OooO00o.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f13603OooO00o).inflate(i, viewGroup);
        this.f13608OooO00o.onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void OooO00o(View view, ViewGroup.LayoutParams layoutParams) {
        OooOO0O();
        ((ViewGroup) this.f13607OooO00o.findViewById(16908290)).addView(view, layoutParams);
        this.f13608OooO00o.onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14373OooO00o(int i) {
        boolean z;
        int OooO0OO2 = OooO0OO(i);
        if (OooO0OO2 == 1) {
            z = this.OooOO0;
        } else if (OooO0OO2 == 2) {
            z = this.OooO0Oo;
        } else if (OooO0OO2 == 5) {
            z = this.OooO0o0;
        } else if (OooO0OO2 == 10) {
            z = this.OooO0oo;
        } else if (OooO0OO2 == 108) {
            z = this.OooO0o;
        } else if (OooO0OO2 != 109) {
            z = false;
        } else {
            z = this.OooO0oO;
        }
        if (z || this.f13609OooO00o.hasFeature(i)) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooO00o(CharSequence charSequence) {
        this.f13623OooO00o = charSequence;
        AbstractC7385o0OOO0o o0ooo0o = this.f13622OooO00o;
        if (o0ooo0o != null) {
            o0ooo0o.setWindowTitle(charSequence);
        } else if (m14374OooO0O0() != null) {
            m14374OooO0O0().OooO0Oo(charSequence);
        } else {
            TextView textView = this.f13611OooO00o;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m14378OooO0O0(int i) {
        int OooO0OO2 = OooO0OO(i);
        if (this.OooOO0 && OooO0OO2 == 108) {
            return false;
        }
        if (this.OooO0o && OooO0OO2 == 1) {
            this.OooO0o = false;
        }
        if (OooO0OO2 == 1) {
            OooOOO0();
            this.OooOO0 = true;
            return true;
        } else if (OooO0OO2 == 2) {
            OooOOO0();
            this.OooO0Oo = true;
            return true;
        } else if (OooO0OO2 == 5) {
            OooOOO0();
            this.OooO0o0 = true;
            return true;
        } else if (OooO0OO2 == 10) {
            OooOOO0();
            this.OooO0oo = true;
            return true;
        } else if (OooO0OO2 == 108) {
            OooOOO0();
            this.OooO0o = true;
            return true;
        } else if (OooO0OO2 != 109) {
            return this.f13609OooO00o.requestFeature(OooO0OO2);
        } else {
            OooOOO0();
            this.OooO0oO = true;
            return true;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final CharSequence m14369OooO00o() {
        Window.Callback callback = this.f13608OooO00o;
        if (callback instanceof Activity) {
            return ((Activity) callback).getTitle();
        }
        return this.f13623OooO00o;
    }

    @Override // com.p118pd.sdk.C5965Oooo00o.OooO00o
    public boolean OooO00o(C5965Oooo00o oooo00o, MenuItem menuItem) {
        PanelFeatureState OooO00o2;
        Window.Callback OooO00o3 = m14365OooO00o();
        if (OooO00o3 == null || this.OooOOO0 || (OooO00o2 = OooO00o((Menu) oooo00o.m16773OooO00o())) == null) {
            return false;
        }
        return OooO00o3.onMenuItemSelected(OooO00o2.OooO00o, menuItem);
    }

    @Override // com.p118pd.sdk.C5965Oooo00o.OooO00o
    public void OooO00o(C5965Oooo00o oooo00o) {
        OooO00o(oooo00o, true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public AbstractC5951OooOo00 OooO00o(@NonNull AbstractC5951OooOo00.OooO00o oooO00o) {
        AbstractC5932OooO0Oo oooO0Oo;
        if (oooO00o != null) {
            AbstractC5951OooOo00 oooOo00 = this.f13620OooO00o;
            if (oooOo00 != null) {
                oooOo00.m16745OooO00o();
            }
            OooOO0 oooOO0 = new OooOO0(oooO00o);
            ActionBar OooO00o2 = m14366OooO00o();
            if (OooO00o2 != null) {
                AbstractC5951OooOo00 OooO00o3 = OooO00o2.OooO00o(oooOO0);
                this.f13620OooO00o = OooO00o3;
                if (!(OooO00o3 == null || (oooO0Oo = this.f13619OooO00o) == null)) {
                    oooO0Oo.onSupportActionModeStarted(OooO00o3);
                }
            }
            if (this.f13620OooO00o == null) {
                this.f13620OooO00o = OooO0O0(oooOO0);
            }
            return this.f13620OooO00o;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m14375OooO0O0() {
        ActionBar OooO00o2 = m14366OooO00o();
        if (OooO00o2 == null || !OooO00o2.m14330OooO0OO()) {
            OooO0oo(0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void OooO00o(boolean z) {
        this.f13628OooO0O0 = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p118pd.sdk.AbstractC5951OooOo00 OooO0O0(@androidx.annotation.NonNull com.p118pd.sdk.AbstractC5951OooOo00.OooO00o r8) {
        /*
        // Method dump skipped, instructions count: 368
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.OooO0O0(com.pd.sdk.OooOo00$OooO00o):com.pd.sdk.OooOo00");
    }

    public boolean OooO00o(KeyEvent keyEvent) {
        View decorView;
        Window.Callback callback = this.f13608OooO00o;
        boolean z = true;
        if (((callback instanceof C7600o0o0Oo.OooO00o) || (callback instanceof DialogC5934OooO0o0)) && (decorView = this.f13609OooO00o.getDecorView()) != null && C7600o0o0Oo.OooO00o(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f13608OooO00o.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? OooO00o(keyCode, keyEvent) : OooO0OO(keyCode, keyEvent);
    }

    public boolean OooO00o(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.OooOO0o = z;
        } else if (i == 82) {
            OooO0Oo(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public View OooO00o(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f13617OooO00o == null) {
            String string = this.f13603OooO00o.obtainStyledAttributes(C0033R.styleable.OooOOOO).getString(C0033R.styleable.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.f13617OooO00o = new AppCompatViewInflater();
            } else {
                try {
                    this.f13617OooO00o = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i(AppCompatDelegate.f13602o0ooOOo, "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f13617OooO00o = new AppCompatViewInflater();
                }
            }
        }
        if (OooOOo) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = OooO00o((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f13617OooO00o.OooO00o(view, str, context, attributeSet, z, OooOOo, true, C6955o0000OO0.OooO0O0());
    }

    private boolean OooO00o(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f13609OooO00o.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ViewCompat.m14604OooO0oo((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14370OooO00o() {
        LayoutInflater from = LayoutInflater.from(this.f13603OooO00o);
        if (from.getFactory() == null) {
            C7091o00OOO.OooO0O0(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i(AppCompatDelegate.f13602o0ooOOo, "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    private void OooO00o(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!panelFeatureState.f13644OooO0OO && !this.OooOOO0) {
            if (panelFeatureState.OooO00o == 0) {
                if ((this.f13603OooO00o.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback OooO00o2 = m14365OooO00o();
            if (OooO00o2 == null || OooO00o2.onMenuOpened(panelFeatureState.OooO00o, panelFeatureState.f13639OooO00o)) {
                WindowManager windowManager = (WindowManager) this.f13603OooO00o.getSystemService("window");
                if (windowManager != null && m14359OooO00o(panelFeatureState, keyEvent)) {
                    if (panelFeatureState.f13637OooO00o == null || panelFeatureState.f13647OooO0o0) {
                        ViewGroup viewGroup = panelFeatureState.f13637OooO00o;
                        if (viewGroup == null) {
                            if (!OooO0O0(panelFeatureState) || panelFeatureState.f13637OooO00o == null) {
                                return;
                            }
                        } else if (panelFeatureState.f13647OooO0o0 && viewGroup.getChildCount() > 0) {
                            panelFeatureState.f13637OooO00o.removeAllViews();
                        }
                        if (OooO00o(panelFeatureState) && panelFeatureState.m14386OooO00o()) {
                            ViewGroup.LayoutParams layoutParams2 = panelFeatureState.f13636OooO00o.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            panelFeatureState.f13637OooO00o.setBackgroundResource(panelFeatureState.OooO0O0);
                            ViewParent parent = panelFeatureState.f13636OooO00o.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(panelFeatureState.f13636OooO00o);
                            }
                            panelFeatureState.f13637OooO00o.addView(panelFeatureState.f13636OooO00o, layoutParams2);
                            if (!panelFeatureState.f13636OooO00o.hasFocus()) {
                                panelFeatureState.f13636OooO00o.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = panelFeatureState.f13642OooO0O0;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            panelFeatureState.f13643OooO0O0 = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.OooO0Oo, panelFeatureState.OooO0o0, 1002, 8519680, -3);
                            layoutParams3.gravity = panelFeatureState.OooO0OO;
                            layoutParams3.windowAnimations = panelFeatureState.OooO0o;
                            windowManager.addView(panelFeatureState.f13637OooO00o, layoutParams3);
                            panelFeatureState.f13644OooO0OO = true;
                            return;
                        }
                    }
                    i = -2;
                    panelFeatureState.f13643OooO0O0 = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.OooO0Oo, panelFeatureState.OooO0o0, 1002, 8519680, -3);
                    layoutParams32.gravity = panelFeatureState.OooO0OO;
                    layoutParams32.windowAnimations = panelFeatureState.OooO0o;
                    windowManager.addView(panelFeatureState.f13637OooO00o, layoutParams32);
                    panelFeatureState.f13644OooO0OO = true;
                    return;
                }
                return;
            }
            OooO00o(panelFeatureState, true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m14377OooO0O0() {
        return this.f13628OooO0O0;
    }

    public boolean OooO0O0(int i, KeyEvent keyEvent) {
        ActionBar OooO00o2 = m14366OooO00o();
        if (OooO00o2 != null && OooO00o2.OooO00o(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f13616OooO00o;
        if (panelFeatureState == null || !OooO00o(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f13616OooO00o == null) {
                PanelFeatureState OooO00o3 = OooO00o(0, true);
                m14359OooO00o(OooO00o3, keyEvent);
                boolean OooO00o4 = OooO00o(OooO00o3, keyEvent.getKeyCode(), keyEvent, 1);
                OooO00o3.f13640OooO00o = false;
                if (OooO00o4) {
                    return true;
                }
            }
            return false;
        }
        PanelFeatureState panelFeatureState2 = this.f13616OooO00o;
        if (panelFeatureState2 != null) {
            panelFeatureState2.f13643OooO0O0 = true;
        }
        return true;
    }

    private boolean OooO0O0(PanelFeatureState panelFeatureState) {
        panelFeatureState.OooO00o(OooO00o());
        panelFeatureState.f13637OooO00o = new OooOOO0(panelFeatureState.f13634OooO00o);
        panelFeatureState.OooO0OO = 81;
        return true;
    }

    private void OooO00o(C5965Oooo00o oooo00o, boolean z) {
        AbstractC7385o0OOO0o o0ooo0o = this.f13622OooO00o;
        if (o0ooo0o == null || !o0ooo0o.OooO0OO() || (ViewConfiguration.get(this.f13603OooO00o).hasPermanentMenuKey() && !this.f13622OooO00o.OooO0o0())) {
            PanelFeatureState OooO00o2 = OooO00o(0, true);
            OooO00o2.f13647OooO0o0 = true;
            OooO00o(OooO00o2, false);
            OooO00o(OooO00o2, (KeyEvent) null);
            return;
        }
        Window.Callback OooO00o3 = m14365OooO00o();
        if (this.f13622OooO00o.OooO0o() && z) {
            this.f13622OooO00o.OooO0oO();
            if (!this.OooOOO0) {
                OooO00o3.onPanelClosed(108, OooO00o(0, true).f13639OooO00o);
            }
        } else if (OooO00o3 != null && !this.OooOOO0) {
            if (this.OooOOOO && (this.o000000 & 1) != 0) {
                this.f13609OooO00o.getDecorView().removeCallbacks(this.f13627OooO0O0);
                this.f13627OooO0O0.run();
            }
            PanelFeatureState OooO00o4 = OooO00o(0, true);
            C5965Oooo00o oooo00o2 = OooO00o4.f13639OooO00o;
            if (oooo00o2 != null && !OooO00o4.f13646OooO0o && OooO00o3.onPreparePanel(0, OooO00o4.f13642OooO0O0, oooo00o2)) {
                OooO00o3.onMenuOpened(108, OooO00o4.f13639OooO00o);
                this.f13622OooO00o.OooO0Oo();
            }
        }
    }

    public void OooO0O0(C5965Oooo00o oooo00o) {
        if (!this.OooOO0O) {
            this.OooOO0O = true;
            this.f13622OooO00o.OooO0O0();
            Window.Callback OooO00o2 = m14365OooO00o();
            if (OooO00o2 != null && !this.OooOOO0) {
                OooO00o2.onPanelClosed(108, oooo00o);
            }
            this.OooOO0O = false;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    public int OooO0O0(int i) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.f13618OooO00o;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13618OooO00o.getLayoutParams();
            boolean z3 = true;
            if (this.f13618OooO00o.isShown()) {
                if (this.f13604OooO00o == null) {
                    this.f13604OooO00o = new Rect();
                    this.OooO0O0 = new Rect();
                }
                Rect rect = this.f13604OooO00o;
                Rect rect2 = this.OooO0O0;
                rect.set(0, i, 0, 0);
                C6954o0000OO.OooO00o(this.f13607OooO00o, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f13606OooO00o;
                    if (view == null) {
                        View view2 = new View(this.f13603OooO00o);
                        this.f13606OooO00o = view2;
                        view2.setBackgroundColor(this.f13603OooO00o.getResources().getColor(C0033R.C0034color.abc_input_method_navigation_guard));
                        this.f13607OooO00o.addView(this.f13606OooO00o, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f13606OooO00o.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f13606OooO00o == null) {
                    z3 = false;
                }
                if (!this.OooO0oo && z3) {
                    i = 0;
                }
                z3 = z2;
                z = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f13618OooO00o.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.f13606OooO00o;
        if (view3 != null) {
            if (!z) {
                i2 = 8;
            }
            view3.setVisibility(i2);
        }
        return i;
    }

    private boolean OooO00o(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f13642OooO0O0;
        if (view != null) {
            panelFeatureState.f13636OooO00o = view;
            return true;
        } else if (panelFeatureState.f13639OooO00o == null) {
            return false;
        } else {
            if (this.f13615OooO00o == null) {
                this.f13615OooO00o = new OooOOO();
            }
            View view2 = (View) panelFeatureState.OooO00o(this.f13615OooO00o);
            panelFeatureState.f13636OooO00o = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m14359OooO00o(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        AbstractC7385o0OOO0o o0ooo0o;
        AbstractC7385o0OOO0o o0ooo0o2;
        AbstractC7385o0OOO0o o0ooo0o3;
        if (this.OooOOO0) {
            return false;
        }
        if (panelFeatureState.f13640OooO00o) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f13616OooO00o;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            OooO00o(panelFeatureState2, false);
        }
        Window.Callback OooO00o2 = m14365OooO00o();
        if (OooO00o2 != null) {
            panelFeatureState.f13642OooO0O0 = OooO00o2.onCreatePanelView(panelFeatureState.OooO00o);
        }
        int i = panelFeatureState.OooO00o;
        boolean z = i == 0 || i == 108;
        if (z && (o0ooo0o3 = this.f13622OooO00o) != null) {
            o0ooo0o3.OooO00o();
        }
        if (panelFeatureState.f13642OooO0O0 == null && (!z || !(m14374OooO0O0() instanceof C5926OooO))) {
            if (panelFeatureState.f13639OooO00o == null || panelFeatureState.f13646OooO0o) {
                if (panelFeatureState.f13639OooO00o == null && (!OooO0OO(panelFeatureState) || panelFeatureState.f13639OooO00o == null)) {
                    return false;
                }
                if (z && this.f13622OooO00o != null) {
                    if (this.f13613OooO00o == null) {
                        this.f13613OooO00o = new OooO();
                    }
                    this.f13622OooO00o.OooO00o(panelFeatureState.f13639OooO00o, this.f13613OooO00o);
                }
                panelFeatureState.f13639OooO00o.OooO0o0();
                if (!OooO00o2.onCreatePanelMenu(panelFeatureState.OooO00o, panelFeatureState.f13639OooO00o)) {
                    panelFeatureState.OooO00o((C5965Oooo00o) null);
                    if (z && (o0ooo0o2 = this.f13622OooO00o) != null) {
                        o0ooo0o2.OooO00o(null, this.f13613OooO00o);
                    }
                    return false;
                }
                panelFeatureState.f13646OooO0o = false;
            }
            panelFeatureState.f13639OooO00o.OooO0o0();
            Bundle bundle = panelFeatureState.f13641OooO0O0;
            if (bundle != null) {
                panelFeatureState.f13639OooO00o.OooO00o(bundle);
                panelFeatureState.f13641OooO0O0 = null;
            }
            if (!OooO00o2.onPreparePanel(0, panelFeatureState.f13642OooO0O0, panelFeatureState.f13639OooO00o)) {
                if (z && (o0ooo0o = this.f13622OooO00o) != null) {
                    o0ooo0o.OooO00o(null, this.f13613OooO00o);
                }
                panelFeatureState.f13639OooO00o.OooO0Oo();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f13645OooO0Oo = z2;
            panelFeatureState.f13639OooO00o.setQwertyMode(z2);
            panelFeatureState.f13639OooO00o.OooO0Oo();
        }
        panelFeatureState.f13640OooO00o = true;
        panelFeatureState.f13643OooO0O0 = false;
        this.f13616OooO00o = panelFeatureState;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m14376OooO0O0(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2) {
            Log.i(AppCompatDelegate.f13602o0ooOOo, "setLocalNightMode() called with an unknown mode");
        } else if (this.o000OOo != i) {
            this.o000OOo = i;
            if (this.OooOOO) {
                m14372OooO00o();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    private int OooO0O0() {
        int i = this.o000OOo;
        return i != -100 ? i : AppCompatDelegate.OooO00o();
    }

    public void OooO00o(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        AbstractC7385o0OOO0o o0ooo0o;
        if (!z || panelFeatureState.OooO00o != 0 || (o0ooo0o = this.f13622OooO00o) == null || !o0ooo0o.OooO0o()) {
            WindowManager windowManager = (WindowManager) this.f13603OooO00o.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f13644OooO0OO || (viewGroup = panelFeatureState.f13637OooO00o) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    OooO00o(panelFeatureState.OooO00o, panelFeatureState, (Menu) null);
                }
            }
            panelFeatureState.f13640OooO00o = false;
            panelFeatureState.f13643OooO0O0 = false;
            panelFeatureState.f13644OooO0OO = false;
            panelFeatureState.f13636OooO00o = null;
            panelFeatureState.f13647OooO0o0 = true;
            if (this.f13616OooO00o == panelFeatureState) {
                this.f13616OooO00o = null;
                return;
            }
            return;
        }
        OooO0O0(panelFeatureState.f13639OooO00o);
    }

    public void OooO00o(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f13625OooO00o;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f13639OooO00o;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f13644OooO0OO) && !this.OooOOO0) {
            this.f13608OooO00o.onPanelClosed(i, menu);
        }
    }

    public PanelFeatureState OooO00o(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f13625OooO00o;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f13639OooO00o == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    public PanelFeatureState OooO00o(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f13625OooO00o;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f13625OooO00o = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    private boolean OooO00o(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        C5965Oooo00o oooo00o;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f13640OooO00o || m14359OooO00o(panelFeatureState, keyEvent)) && (oooo00o = panelFeatureState.f13639OooO00o) != null) {
            z = oooo00o.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f13622OooO00o == null) {
            OooO00o(panelFeatureState, true);
        }
        return z;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ViewGroup m14364OooO00o() {
        return this.f13607OooO00o;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14372OooO00o() {
        int OooO0O02 = OooO0O0();
        int OooO00o2 = OooO00o(OooO0O02);
        boolean OooO0OO2 = OooO00o2 != -1 ? m14361OooO0OO(OooO00o2) : false;
        if (OooO0O02 == 0) {
            OooOO0();
            this.f13614OooO00o.OooO0OO();
        }
        this.OooOOO = true;
        return OooO0OO2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    public int OooO00o(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f13603OooO00o.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        OooOO0();
        return this.f13614OooO00o.OooO00o();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    @VisibleForTesting
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C5003OooOO0o m14367OooO00o() {
        OooOO0();
        return this.f13614OooO00o;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate, androidx.appcompat.app.AppCompatDelegate
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final OooO00o.OooO0O0 m14368OooO00o() {
        return new C5002OooO0oo();
    }
}
