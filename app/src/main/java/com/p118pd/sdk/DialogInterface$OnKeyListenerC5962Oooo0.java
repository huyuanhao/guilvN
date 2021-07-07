package com.p118pd.sdk;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.C0033R;
import com.p118pd.sdk.AbstractC5961Oooo;
import com.p118pd.sdk.OooO0OO;

/* renamed from: com.pd.sdk.Oooo0  reason: case insensitive filesystem */
public class DialogInterface$OnKeyListenerC5962Oooo0 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, AbstractC5961Oooo.OooO00o {
    public OooO0OO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5961Oooo.OooO00o f17187OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5963Oooo000 f17188OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5965Oooo00o f17189OooO00o;

    public DialogInterface$OnKeyListenerC5962Oooo0(C5965Oooo00o oooo00o) {
        this.f17189OooO00o = oooo00o;
    }

    public void OooO00o(IBinder iBinder) {
        C5965Oooo00o oooo00o = this.f17189OooO00o;
        OooO0OO.OooO00o oooO00o = new OooO0OO.OooO00o(oooo00o.OooO00o());
        C5963Oooo000 oooo000 = new C5963Oooo000(oooO00o.OooO00o(), C0033R.layout.abc_list_menu_item_layout);
        this.f17188OooO00o = oooo000;
        oooo000.OooO00o(this);
        this.f17189OooO00o.OooO00o(this.f17188OooO00o);
        oooO00o.OooO00o(this.f17188OooO00o.m16766OooO00o(), this);
        View OooO00o2 = oooo00o.m16772OooO00o();
        if (OooO00o2 != null) {
            oooO00o.OooO00o(OooO00o2);
        } else {
            oooO00o.OooO00o(oooo00o.m16771OooO00o()).OooO0O0(oooo00o.m16776OooO00o());
        }
        oooO00o.OooO00o((DialogInterface.OnKeyListener) this);
        OooO0OO OooO00o3 = oooO00o.m16670OooO00o();
        this.OooO00o = OooO00o3;
        OooO00o3.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.OooO00o.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.OooO00o.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f17189OooO00o.OooO00o((C5967Oooo0OO) this.f17188OooO00o.m16766OooO00o().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f17188OooO00o.OooO00o(this.f17189OooO00o, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.OooO00o.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.OooO00o.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f17189OooO00o.OooO00o(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f17189OooO00o.performShortcut(i, keyEvent, 0);
    }

    public void OooO00o(AbstractC5961Oooo.OooO00o oooO00o) {
        this.f17187OooO00o = oooO00o;
    }

    public void OooO00o() {
        OooO0OO oooO0OO = this.OooO00o;
        if (oooO0OO != null) {
            oooO0OO.dismiss();
        }
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo.OooO00o
    public void OooO00o(C5965Oooo00o oooo00o, boolean z) {
        if (z || oooo00o == this.f17189OooO00o) {
            OooO00o();
        }
        AbstractC5961Oooo.OooO00o oooO00o = this.f17187OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO00o(oooo00o, z);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5961Oooo.OooO00o
    public boolean OooO00o(C5965Oooo00o oooo00o) {
        AbstractC5961Oooo.OooO00o oooO00o = this.f17187OooO00o;
        if (oooO00o != null) {
            return oooO00o.OooO00o(oooo00o);
        }
        return false;
    }
}
