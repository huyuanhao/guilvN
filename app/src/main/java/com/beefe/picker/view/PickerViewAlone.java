package com.beefe.picker.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.beefe.picker.C0435R;
import com.facebook.react.bridge.ReadableArray;
import com.p118pd.sdk.AbstractC7589o0o0OO;
import com.p118pd.sdk.AbstractC7593o0o0OOO;
import com.p118pd.sdk.C7595o0o0OOOO;
import java.util.ArrayList;
import java.util.Arrays;

public class PickerViewAlone extends LinearLayout {
    public LinearLayout OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7593o0o0OOO f14790OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<C7595o0o0OOOO> f14791OooO00o;

    public class OooO00o implements AbstractC7589o0o0OO {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC7589o0o0OO
        public void OooO00o(String str, int i) {
            if (PickerViewAlone.this.f14790OooO00o != null) {
                C7595o0o0OOOO o0o0oooo = new C7595o0o0OOOO();
                o0o0oooo.OooO00o(str);
                o0o0oooo.OooO00o(i);
                PickerViewAlone.this.f14791OooO00o.set(0, o0o0oooo);
                PickerViewAlone.this.f14790OooO00o.OooO00o(PickerViewAlone.this.f14791OooO00o);
            }
        }
    }

    public class OooO0O0 implements AbstractC7589o0o0OO {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ int[] f14792OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String[] f14793OooO00o;

        public OooO0O0(String[] strArr, int[] iArr) {
            this.f14793OooO00o = strArr;
            this.f14792OooO00o = iArr;
        }

        @Override // com.p118pd.sdk.AbstractC7589o0o0OO
        public void OooO00o(String str, int i) {
            int childCount = PickerViewAlone.this.OooO00o.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = PickerViewAlone.this.OooO00o.getChildAt(i2);
                if (childAt instanceof LoopView) {
                    LoopView loopView = (LoopView) childAt;
                    this.f14793OooO00o[i2] = loopView.getSelectedItem();
                    this.f14792OooO00o[i2] = loopView.getSelectedIndex();
                }
            }
            if (PickerViewAlone.this.f14790OooO00o != null) {
                for (int i3 = 0; i3 < this.f14793OooO00o.length; i3++) {
                    C7595o0o0OOOO o0o0oooo = new C7595o0o0OOOO();
                    o0o0oooo.OooO00o(this.f14793OooO00o[i3]);
                    o0o0oooo.OooO00o(this.f14792OooO00o[i3]);
                    PickerViewAlone.this.f14791OooO00o.set(i3, o0o0oooo);
                }
                PickerViewAlone.this.f14790OooO00o.OooO00o(PickerViewAlone.this.f14791OooO00o);
            }
        }
    }

    public PickerViewAlone(Context context) {
        super(context);
        OooO00o(context);
    }

    private void OooO0O0(ReadableArray readableArray, double[] dArr) {
        String[] strArr = new String[readableArray.size()];
        int[] iArr = new int[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            String name = readableArray.getType(i).name();
            if (((name.hashCode() == 63537721 && name.equals("Array")) ? (char) 0 : 65535) == 0) {
                ArrayList<String> OooO00o2 = OooO00o(readableArray.getArray(i));
                LoopView loopView = new LoopView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                if (dArr == null) {
                    layoutParams.weight = 1.0f;
                } else if (i < dArr.length) {
                    layoutParams.weight = (float) dArr[i];
                } else {
                    layoutParams.weight = 1.0f;
                }
                loopView.setLayoutParams(layoutParams);
                loopView.setItems(OooO00o2);
                loopView.setTag(Integer.valueOf(i));
                loopView.setSelectedPosition(0);
                C7595o0o0OOOO o0o0oooo = new C7595o0o0OOOO();
                o0o0oooo.OooO00o(OooO00o2.get(0));
                o0o0oooo.OooO00o(loopView.getSelectedIndex());
                if (this.f14791OooO00o.size() > i) {
                    this.f14791OooO00o.set(i, o0o0oooo);
                } else {
                    this.f14791OooO00o.add(i, o0o0oooo);
                }
                strArr[i] = OooO00o2.get(0);
                loopView.setListener(new OooO0O0(strArr, iArr));
                this.OooO00o.addView(loopView);
            }
        }
    }

    private void setAloneData(ReadableArray readableArray) {
        ArrayList<String> OooO00o2 = OooO00o(readableArray);
        LoopView loopView = new LoopView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        loopView.setLayoutParams(layoutParams);
        loopView.setItems(OooO00o2);
        loopView.setSelectedPosition(0);
        C7595o0o0OOOO o0o0oooo = new C7595o0o0OOOO();
        o0o0oooo.OooO00o(OooO00o2.get(0));
        o0o0oooo.OooO00o(loopView.getSelectedIndex());
        if (this.f14791OooO00o.size() > 0) {
            this.f14791OooO00o.set(0, o0o0oooo);
        } else {
            this.f14791OooO00o.add(0, o0o0oooo);
        }
        loopView.setListener(new OooO00o());
        this.OooO00o.addView(loopView);
    }

    public ArrayList<C7595o0o0OOOO> getSelectedData() {
        return this.f14791OooO00o;
    }

    public int getViewHeight() {
        View childAt = this.OooO00o.getChildAt(0);
        if (childAt instanceof LoopView) {
            return ((LoopView) childAt).getViewHeight();
        }
        return 0;
    }

    public void setIsLoop(boolean z) {
        if (!z) {
            int childCount = this.OooO00o.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.OooO00o.getChildAt(i);
                if (childAt instanceof LoopView) {
                    ((LoopView) childAt).OooO0OO();
                }
            }
        }
    }

    public void setOnSelectedListener(AbstractC7593o0o0OOO o0o0ooo) {
        this.f14790OooO00o = o0o0ooo;
    }

    public void setSelectValue(String[] strArr) {
        int childCount = this.OooO00o.getChildCount();
        int length = strArr.length;
        if (length <= childCount) {
            OooO00o(length, strArr, this.f14791OooO00o);
        } else {
            OooO00o(childCount, (String[]) Arrays.copyOf(strArr, childCount), this.f14791OooO00o);
        }
    }

    public void setTextColor(int i) {
        int childCount = this.OooO00o.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.OooO00o.getChildAt(i2);
            if (childAt instanceof LoopView) {
                ((LoopView) childAt).setTextColor(i);
            }
        }
    }

    public void setTextEllipsisLen(int i) {
        int childCount = this.OooO00o.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.OooO00o.getChildAt(i2);
            if (childAt instanceof LoopView) {
                ((LoopView) childAt).setTextEllipsisLen(i);
            }
        }
    }

    public void setTextSize(float f) {
        int childCount = this.OooO00o.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.OooO00o.getChildAt(i);
            if (childAt instanceof LoopView) {
                ((LoopView) childAt).setTextSize(f);
            }
        }
    }

    public void setTypeface(Typeface typeface) {
        int childCount = this.OooO00o.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.OooO00o.getChildAt(i);
            if (childAt instanceof LoopView) {
                ((LoopView) childAt).setTypeface(typeface);
            }
        }
    }

    public PickerViewAlone(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO00o(context);
    }

    private void OooO00o(Context context) {
        this.OooO00o = (LinearLayout) LayoutInflater.from(context).inflate(C0435R.layout.picker_view_alone, this).findViewById(C0435R.C0438id.pickerViewAloneLayout);
    }

    public void OooO00o(ReadableArray readableArray, double[] dArr) {
        this.f14791OooO00o = new ArrayList<>();
        char c = 0;
        String name = readableArray.getType(0).name();
        if (name.hashCode() != 63537721 || !name.equals("Array")) {
            c = 65535;
        }
        if (c != 0) {
            setAloneData(readableArray);
        } else {
            OooO0O0(readableArray, dArr);
        }
    }

    private void OooO00o(int i, String[] strArr, ArrayList<C7595o0o0OOOO> arrayList) {
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = this.OooO00o.getChildAt(i2);
            if (childAt instanceof LoopView) {
                LoopView loopView = (LoopView) childAt;
                if (loopView.m14981OooO00o(strArr[i2])) {
                    loopView.setSelectedItem(strArr[i2]);
                    C7595o0o0OOOO o0o0oooo = new C7595o0o0OOOO();
                    o0o0oooo.OooO00o(strArr[i2]);
                    o0o0oooo.OooO00o(loopView.getSelectedIndex());
                    arrayList.set(i2, o0o0oooo);
                }
            }
        }
    }

    private ArrayList<String> OooO00o(ReadableArray readableArray) {
        String str;
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < readableArray.size(); i++) {
            String name = readableArray.getType(i).name();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != -1950496919) {
                if (hashCode != -1808118735) {
                    if (hashCode == 1729365000 && name.equals("Boolean")) {
                        c = 0;
                    }
                } else if (name.equals("String")) {
                    c = 2;
                }
            } else if (name.equals("Number")) {
                c = 1;
            }
            if (c == 0) {
                str = String.valueOf(readableArray.getBoolean(i));
            } else if (c == 1) {
                try {
                    str = String.valueOf(readableArray.getInt(i));
                } catch (Exception unused) {
                    str = String.valueOf(readableArray.getDouble(i));
                }
            } else if (c != 2) {
                str = "";
            } else {
                str = readableArray.getString(i);
            }
            arrayList.add(str);
        }
        return arrayList;
    }
}
