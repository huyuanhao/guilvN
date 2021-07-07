package com.p118pd.sdk;

import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.google.gson.Gson;
import com.p118pd.sdk.C8179oOOo00Oo;
import java.io.File;

/* renamed from: com.pd.sdk.IiIL1l  reason: case insensitive filesystem */
public class C5348IiIL1l extends PDFView implements AbstractC8163oOOOoo0o, AbstractC8160oOOOoo0, AbstractC8158oOOOoOoO, AbstractC8166oOOOooOO, AbstractC8156oOOOoOo, AbstractC8165oOOOooO0 {
    public static C5348IiIL1l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ThemedReactContext f15683OooO00o;
    public FitPolicy OooO0O0 = FitPolicy.WIDTH;
    public float OooOOO = 1.0f;
    public float OooOOO0 = 1.0f;
    public float OooOOOO = 3.0f;
    public float OooOOOo = 0.0f;

    /* renamed from: OooOOOo  reason: collision with other field name */
    public boolean f15684OooOOOo = false;
    public boolean OooOOo = true;
    public float OooOOo0 = 0.0f;

    /* renamed from: OooOOo0  reason: collision with other field name */
    public boolean f15685OooOOo0 = true;
    public boolean OooOOoo = false;
    public boolean OooOo0 = false;
    public boolean OooOo00 = false;
    public boolean OooOo0O = false;
    public int o0OOO0o = 10;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public String f15686o0OOO0o;
    public String o0Oo0oo = "";
    public int o0ooOoO = 1;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public String f15687o0ooOoO;

    public C5348IiIL1l(ThemedReactContext themedReactContext, AttributeSet attributeSet) {
        super(themedReactContext, attributeSet);
        this.f15683OooO00o = themedReactContext;
        OooO00o = this;
    }

    @Override // com.github.barteksc.pdfviewer.PDFView
    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m15563OooO00o(String str) {
    }

    @Override // com.github.barteksc.pdfviewer.PDFView
    public void OooO() {
        m15563OooO00o(String.format("drawPdf path:%s %s", this.f15686o0OOO0o, Integer.valueOf(this.o0ooOoO)));
        if (this.f15686o0OOO0o != null) {
            setMinZoom(this.OooOOO);
            setMaxZoom(this.OooOOOO);
            setMidZoom((this.OooOOOO + this.OooOOO) / 2.0f);
            C8179oOOo00Oo.OooO0O0.OooO0O0 = this.OooOOO;
            C8179oOOo00Oo.OooO0O0.OooO00o = this.OooOOOO;
            OooO00o(OooO00o(this.f15686o0OOO0o)).OooO00o(this.o0ooOoO - 1).OooO(this.f15684OooOOOo).OooO00o((AbstractC8163oOOOoo0o) this).OooO00o((AbstractC8160oOOOoo0) this).OooO00o((AbstractC8158oOOOoOoO) this).OooO00o((AbstractC8166oOOOooOO) this).OooO00o((AbstractC8156oOOOoOo) this).OooO00o((AbstractC8165oOOOooO0) this).OooO0O0(this.o0OOO0o).OooO00o(this.o0Oo0oo).OooO0OO(this.f15685OooOOo0).OooO00o(this.OooO0O0).OooO0oo(this.OooOo0O).OooO00o(this.OooOo00).OooO0oO(this.OooOo0).OooO0O0(this.OooOOo).OooO00o();
        }
    }

    @Override // com.p118pd.sdk.AbstractC8163oOOOoo0o
    public void OooO00o(int i, int i2) {
        int i3 = i + 1;
        this.o0ooOoO = i3;
        m15563OooO00o(String.format("%s %s / %s", this.f15686o0OOO0o, Integer.valueOf(i3), Integer.valueOf(i2)));
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", "pageChanged|" + i3 + "|" + i2);
        ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "topChange", createMap);
    }

    @Override // com.p118pd.sdk.AbstractC8158oOOOoOoO
    public void onError(Throwable th) {
        WritableMap createMap = Arguments.createMap();
        if (th.getMessage().contains("Password required or incorrect password")) {
            createMap.putString("message", "error|Password required or incorrect password.");
        } else {
            createMap.putString("message", "error|" + th.getMessage());
        }
        ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "topChange", createMap);
    }

    public void setEnableAnnotationRendering(boolean z) {
        this.OooOOo = z;
    }

    public void setEnableAntialiasing(boolean z) {
        this.f15685OooOOo0 = z;
    }

    public void setEnablePaging(boolean z) {
        this.OooOOoo = z;
        if (z) {
            this.OooOo00 = true;
            this.OooOo0 = true;
            this.OooOo0O = true;
            return;
        }
        this.OooOo00 = false;
        this.OooOo0 = false;
        this.OooOo0O = false;
    }

    public void setFitPolicy(int i) {
        if (i == 0) {
            this.OooO0O0 = FitPolicy.WIDTH;
        } else if (i != 1) {
            this.OooO0O0 = FitPolicy.BOTH;
        } else {
            this.OooO0O0 = FitPolicy.HEIGHT;
        }
    }

    public void setHorizontal(boolean z) {
        this.f15684OooOOOo = z;
    }

    public void setMaxScale(float f) {
        this.OooOOOO = f;
    }

    public void setMinScale(float f) {
        this.OooOOO = f;
    }

    public void setPage(int i) {
        if (i <= 1) {
            i = 1;
        }
        this.o0ooOoO = i;
    }

    public void setPassword(String str) {
        this.o0Oo0oo = str;
    }

    public void setPath(String str) {
        this.f15686o0OOO0o = str;
    }

    public void setScale(float f) {
        this.OooOOO0 = f;
    }

    public void setSpacing(int i) {
        this.o0OOO0o = i;
    }

    @Override // com.github.barteksc.pdfviewer.PDFView, com.github.barteksc.pdfviewer.PDFView, com.github.barteksc.pdfviewer.PDFView, com.p118pd.sdk.AbstractC8160oOOOoo0
    public void OooO00o(int i) {
        m15043OooO00o(this.OooOOO0);
        WritableMap createMap = Arguments.createMap();
        Gson gson = new Gson();
        createMap.putString("message", "loadComplete|" + i + "|" + ((float) getWidth()) + "|" + ((float) getHeight()) + "|" + gson.toJson(getTableOfContents()));
        ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "topChange", createMap);
    }

    @Override // com.p118pd.sdk.AbstractC8165oOOOooO0
    public void OooO00o(int i, float f) {
        C8179oOOo00Oo.OooO0O0.OooO0O0 = this.OooOOO;
        C8179oOOo00Oo.OooO0O0.OooO00o = this.OooOOOO;
    }

    @Override // com.p118pd.sdk.AbstractC8166oOOOooOO
    public boolean OooO00o(MotionEvent motionEvent) {
        C8179oOOo00Oo.OooO0O0.OooO0O0 = this.OooOOO;
        C8179oOOo00Oo.OooO0O0.OooO00o = this.OooOOOO;
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", "pageSingleTap|" + this.o0ooOoO);
        ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "topChange", createMap);
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC8156oOOOoOo
    public void OooO00o(Canvas canvas, float f, float f2, int i) {
        float f3 = this.OooOOOo;
        if (f3 > 0.0f) {
            float f4 = this.OooOOo0;
            if (f4 > 0.0f && !(f == f3 && f2 == f4)) {
                C8179oOOo00Oo.OooO0O0.OooO0O0 = this.OooOOO;
                C8179oOOo00Oo.OooO0O0.OooO00o = this.OooOOOO;
                WritableMap createMap = Arguments.createMap();
                createMap.putString("message", "scaleChanged|" + (f / this.OooOOOo));
                ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "topChange", createMap);
            }
        }
        this.OooOOOo = f;
        this.OooOOo0 = f2;
    }

    @Override // com.github.barteksc.pdfviewer.PDFView
    private Uri OooO00o(String str) {
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null || parse.getScheme().isEmpty()) {
            return Uri.fromFile(new File(str));
        }
        return parse;
    }
}
