package com.p118pd.sdk;

import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.text.FontMetricsUtil;
import com.google.android.gms.vision.text.Line;
import com.google.android.gms.vision.text.Text;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;

/* renamed from: com.pd.sdk.丨i1ill  reason: invalid class name and case insensitive filesystem */
public class AsyncTaskC9575i1ill extends AsyncTask<Void, Void, SparseArray<TextBlock>> {
    public double OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f23145OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ThemedReactContext f23146OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextRecognizer f23147OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I1iI1 f23148OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9644iIi1 f23149OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23150OooO00o;
    public double OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f23151OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o0;

    public AsyncTaskC9575i1ill(AbstractC9644iIi1 r1, ThemedReactContext themedReactContext, byte[] bArr, int i, int i2, int i3, float f, int i4, int i5, int i6, int i7, int i8) {
        this.f23149OooO00o = r1;
        this.f23146OooO00o = themedReactContext;
        this.f23150OooO00o = bArr;
        this.f23145OooO00o = i;
        this.f23151OooO0O0 = i2;
        this.OooO0OO = i3;
        I1iI1 r12 = new I1iI1(i, i2, i3, i4);
        this.f23148OooO00o = r12;
        double d = (double) i5;
        double OooO0Oo2 = (double) (((float) r12.OooO0Oo()) * f);
        Double.isNaN(d);
        Double.isNaN(OooO0Oo2);
        this.OooO00o = d / OooO0Oo2;
        double d2 = (double) i6;
        double OooO0O02 = (double) (((float) this.f23148OooO00o.OooO0O0()) * f);
        Double.isNaN(d2);
        Double.isNaN(OooO0O02);
        this.OooO0O0 = d2 / OooO0O02;
        this.OooO0Oo = i7;
        this.OooO0o0 = i8;
    }

    /* renamed from: OooO00o */
    public SparseArray<TextBlock> doInBackground(Void... voidArr) {
        if (isCancelled() || this.f23149OooO00o == null) {
            return null;
        }
        this.f23147OooO00o = new TextRecognizer.Builder(this.f23146OooO00o).build();
        return this.f23147OooO00o.detect(C5606L11l.OooO00o(this.f23150OooO00o, this.f23145OooO00o, this.f23151OooO0O0, this.OooO0OO).OooO00o());
    }

    /* renamed from: OooO00o */
    public void onPostExecute(SparseArray<TextBlock> sparseArray) {
        super.onPostExecute(sparseArray);
        TextRecognizer textRecognizer = this.f23147OooO00o;
        if (textRecognizer != null) {
            textRecognizer.release();
        }
        if (sparseArray != null) {
            WritableArray createArray = Arguments.createArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                WritableMap OooO00o2 = OooO00o(sparseArray.valueAt(i));
                if (this.f23148OooO00o.OooO00o() == 1) {
                    OooO00o2 = OooO00o(OooO00o2);
                }
                createArray.pushMap(OooO00o2);
            }
            this.f23149OooO00o.OooO0OO(createArray);
        }
        this.f23149OooO00o.OooO0O0();
    }

    private WritableMap OooO00o(Text text) {
        String str;
        WritableMap createMap = Arguments.createMap();
        WritableArray createArray = Arguments.createArray();
        for (Text text2 : text.getComponents()) {
            createArray.pushMap(OooO00o(text2));
        }
        createMap.putArray("components", createArray);
        createMap.putString("value", text.getValue());
        int i = text.getBoundingBox().left;
        int i2 = text.getBoundingBox().top;
        if (text.getBoundingBox().left < this.f23145OooO00o / 2) {
            i += this.OooO0Oo / 2;
        } else if (text.getBoundingBox().left > this.f23145OooO00o / 2) {
            i -= this.OooO0Oo / 2;
        }
        if (text.getBoundingBox().height() < this.f23151OooO0O0 / 2) {
            i2 += this.OooO0o0 / 2;
        } else if (text.getBoundingBox().height() > this.f23151OooO0O0 / 2) {
            i2 -= this.OooO0o0 / 2;
        }
        WritableMap createMap2 = Arguments.createMap();
        double d = (double) i;
        double d2 = this.OooO00o;
        Double.isNaN(d);
        createMap2.putDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, d * d2);
        double d3 = (double) i2;
        double d4 = this.OooO0O0;
        Double.isNaN(d3);
        createMap2.putDouble("y", d3 * d4);
        WritableMap createMap3 = Arguments.createMap();
        double width = (double) text.getBoundingBox().width();
        double d5 = this.OooO00o;
        Double.isNaN(width);
        createMap3.putDouble("width", width * d5);
        double height = (double) text.getBoundingBox().height();
        double d6 = this.OooO0O0;
        Double.isNaN(height);
        createMap3.putDouble("height", height * d6);
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putMap("origin", createMap2);
        createMap4.putMap(FileAttachment.KEY_SIZE, createMap3);
        createMap.putMap("bounds", createMap4);
        if (text instanceof TextBlock) {
            str = "block";
        } else {
            str = text instanceof Line ? "line" : "element";
        }
        createMap.putString("type", str);
        return createMap;
    }

    private WritableMap OooO00o(WritableMap writableMap) {
        ReadableMap map = writableMap.getMap("bounds");
        WritableMap OooO00o2 = liIli11.OooO00o(liIli11.OooO00o(map.getMap("origin"), this.f23148OooO00o.OooO0Oo(), this.OooO00o), -map.getMap(FileAttachment.KEY_SIZE).getDouble("width"));
        WritableMap createMap = Arguments.createMap();
        createMap.merge(map);
        createMap.putMap("origin", OooO00o2);
        writableMap.putMap("bounds", createMap);
        ReadableArray array = writableMap.getArray("components");
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < array.size(); i++) {
            WritableMap createMap2 = Arguments.createMap();
            createMap2.merge(array.getMap(i));
            OooO00o(createMap2);
            createArray.pushMap(createMap2);
        }
        writableMap.putArray("components", createArray);
        return writableMap;
    }
}
