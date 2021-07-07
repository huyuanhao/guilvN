package com.beefe.picker.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.beefe.picker.C0435R;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.p118pd.sdk.AbstractC7589o0o0OO;
import com.p118pd.sdk.AbstractC7593o0o0OOO;
import com.p118pd.sdk.C7595o0o0OOOO;
import java.util.ArrayList;
import java.util.Arrays;

public class PickerViewLinkage extends LinearLayout {
    public LoopView OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7593o0o0OOO f14794OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7595o0o0OOOO f14795OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<String> f14796OooO00o = new ArrayList<>();
    public LoopView OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C7595o0o0OOOO f14797OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public ArrayList<String> f14798OooO0O0 = new ArrayList<>();
    public LoopView OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public C7595o0o0OOOO f14799OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public ArrayList<String> f14800OooO0OO = new ArrayList<>();
    public ArrayList<ReadableMap> OooO0Oo = new ArrayList<>();
    public ArrayList<C7595o0o0OOOO> OooO0o0;
    public int o00oO0O;
    public int o0ooOO0;
    public int o0ooOOo;

    public class OooO00o implements AbstractC7589o0o0OO {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC7589o0o0OO
        public void OooO00o(String str, int i) {
            PickerViewLinkage.this.o0ooOO0 = i;
            PickerViewLinkage.this.f14795OooO00o = new C7595o0o0OOOO();
            PickerViewLinkage.this.f14795OooO00o.OooO00o(i);
            PickerViewLinkage.this.f14795OooO00o.OooO00o(str);
            PickerViewLinkage.this.OooO0o0.set(0, PickerViewLinkage.this.f14795OooO00o);
            PickerViewLinkage.this.f14798OooO0O0.clear();
            ReadableArray array = ((ReadableMap) PickerViewLinkage.this.OooO0Oo.get(i)).getArray(str);
            for (int i2 = 0; i2 < array.size(); i2++) {
                ReadableMapKeySetIterator keySetIterator = array.getMap(i2).keySetIterator();
                if (keySetIterator.hasNextKey()) {
                    PickerViewLinkage.this.f14798OooO0O0.add(keySetIterator.nextKey());
                }
            }
            PickerViewLinkage pickerViewLinkage = PickerViewLinkage.this;
            pickerViewLinkage.OooO00o((PickerViewLinkage) pickerViewLinkage.OooO0O0, (LoopView) PickerViewLinkage.this.f14798OooO0O0);
            PickerViewLinkage.this.f14797OooO0O0 = new C7595o0o0OOOO();
            PickerViewLinkage.this.f14797OooO0O0.OooO00o((String) PickerViewLinkage.this.f14798OooO0O0.get(0));
            PickerViewLinkage.this.f14797OooO0O0.OooO00o(PickerViewLinkage.this.OooO0O0.getSelectedIndex());
            PickerViewLinkage.this.OooO0o0.set(1, PickerViewLinkage.this.f14797OooO0O0);
            ReadableMap map = ((ReadableMap) PickerViewLinkage.this.OooO0Oo.get(i)).getArray(str).getMap(0);
            ReadableArray array2 = map.getArray(map.keySetIterator().nextKey());
            PickerViewLinkage.this.f14800OooO0OO.clear();
            PickerViewLinkage pickerViewLinkage2 = PickerViewLinkage.this;
            pickerViewLinkage2.f14800OooO0OO = pickerViewLinkage2.OooO00o((PickerViewLinkage) array2);
            PickerViewLinkage pickerViewLinkage3 = PickerViewLinkage.this;
            pickerViewLinkage3.OooO00o((PickerViewLinkage) pickerViewLinkage3.OooO0OO, (LoopView) PickerViewLinkage.this.f14800OooO0OO);
            PickerViewLinkage.this.f14799OooO0OO = new C7595o0o0OOOO();
            if (PickerViewLinkage.this.f14800OooO0OO != null && PickerViewLinkage.this.f14800OooO0OO.size() > 0) {
                PickerViewLinkage.this.f14799OooO0OO.OooO00o((String) PickerViewLinkage.this.f14800OooO0OO.get(0));
                PickerViewLinkage.this.f14799OooO0OO.OooO00o(PickerViewLinkage.this.OooO0OO.getSelectedIndex());
                PickerViewLinkage.this.OooO0o0.set(2, PickerViewLinkage.this.f14799OooO0OO);
                if (PickerViewLinkage.this.f14794OooO00o != null) {
                    PickerViewLinkage.this.f14794OooO00o.OooO00o(PickerViewLinkage.this.OooO0o0);
                }
            }
        }
    }

    public class OooO0O0 implements AbstractC7589o0o0OO {
        public OooO0O0() {
        }

        @Override // com.p118pd.sdk.AbstractC7589o0o0OO
        public void OooO00o(String str, int i) {
            PickerViewLinkage.this.o0ooOOo = i;
            ReadableArray array = ((ReadableMap) PickerViewLinkage.this.OooO0Oo.get(PickerViewLinkage.this.o0ooOO0)).getArray((String) PickerViewLinkage.this.f14796OooO00o.get(PickerViewLinkage.this.o0ooOO0));
            int size = array.size();
            if (i > size) {
                i = size - 1;
            }
            ReadableMap map = array.getMap(i);
            ReadableArray array2 = map.getArray(map.keySetIterator().nextKey());
            PickerViewLinkage.this.f14800OooO0OO.clear();
            PickerViewLinkage pickerViewLinkage = PickerViewLinkage.this;
            pickerViewLinkage.f14800OooO0OO = pickerViewLinkage.OooO00o((PickerViewLinkage) array2);
            PickerViewLinkage pickerViewLinkage2 = PickerViewLinkage.this;
            pickerViewLinkage2.OooO00o((PickerViewLinkage) pickerViewLinkage2.OooO0OO, (LoopView) PickerViewLinkage.this.f14800OooO0OO);
            PickerViewLinkage.this.f14795OooO00o = new C7595o0o0OOOO();
            PickerViewLinkage.this.f14795OooO00o.OooO00o((String) PickerViewLinkage.this.f14796OooO00o.get(PickerViewLinkage.this.o0ooOO0));
            PickerViewLinkage.this.f14795OooO00o.OooO00o(PickerViewLinkage.this.OooO00o.getSelectedIndex());
            PickerViewLinkage.this.OooO0o0.set(0, PickerViewLinkage.this.f14795OooO00o);
            PickerViewLinkage.this.f14797OooO0O0 = new C7595o0o0OOOO();
            PickerViewLinkage.this.f14797OooO0O0.OooO00o(str);
            PickerViewLinkage.this.f14797OooO0O0.OooO00o(i);
            PickerViewLinkage.this.OooO0o0.set(1, PickerViewLinkage.this.f14797OooO0O0);
            PickerViewLinkage.this.f14799OooO0OO = new C7595o0o0OOOO();
            if (PickerViewLinkage.this.f14800OooO0OO != null && PickerViewLinkage.this.f14800OooO0OO.size() > 0) {
                PickerViewLinkage.this.f14799OooO0OO.OooO00o((String) PickerViewLinkage.this.f14800OooO0OO.get(0));
                PickerViewLinkage.this.f14799OooO0OO.OooO00o(PickerViewLinkage.this.OooO0OO.getSelectedIndex());
                PickerViewLinkage.this.OooO0o0.set(2, PickerViewLinkage.this.f14799OooO0OO);
                if (PickerViewLinkage.this.f14794OooO00o != null) {
                    PickerViewLinkage.this.f14794OooO00o.OooO00o(PickerViewLinkage.this.OooO0o0);
                }
            }
        }
    }

    public class OooO0OO implements AbstractC7589o0o0OO {
        public OooO0OO() {
        }

        @Override // com.p118pd.sdk.AbstractC7589o0o0OO
        public void OooO00o(String str, int i) {
            int size = PickerViewLinkage.this.f14796OooO00o.size();
            if (PickerViewLinkage.this.o0ooOO0 >= size) {
                PickerViewLinkage.this.o0ooOO0 = size - 1;
            }
            int size2 = PickerViewLinkage.this.f14798OooO0O0.size();
            if (PickerViewLinkage.this.o0ooOOo >= size2) {
                PickerViewLinkage.this.o0ooOOo = size2 - 1;
            }
            PickerViewLinkage.this.f14795OooO00o = new C7595o0o0OOOO();
            PickerViewLinkage.this.f14795OooO00o.OooO00o((String) PickerViewLinkage.this.f14796OooO00o.get(PickerViewLinkage.this.o0ooOO0));
            PickerViewLinkage.this.f14795OooO00o.OooO00o(PickerViewLinkage.this.OooO00o.getSelectedIndex());
            PickerViewLinkage.this.OooO0o0.set(0, PickerViewLinkage.this.f14795OooO00o);
            PickerViewLinkage.this.f14797OooO0O0 = new C7595o0o0OOOO();
            PickerViewLinkage.this.f14797OooO0O0.OooO00o((String) PickerViewLinkage.this.f14798OooO0O0.get(PickerViewLinkage.this.o0ooOOo));
            PickerViewLinkage.this.f14797OooO0O0.OooO00o(PickerViewLinkage.this.OooO0O0.getSelectedIndex());
            PickerViewLinkage.this.OooO0o0.set(1, PickerViewLinkage.this.f14797OooO0O0);
            PickerViewLinkage.this.f14799OooO0OO = new C7595o0o0OOOO();
            PickerViewLinkage.this.f14799OooO0OO.OooO00o(str);
            PickerViewLinkage.this.f14799OooO0OO.OooO00o(i);
            PickerViewLinkage.this.OooO0o0.set(2, PickerViewLinkage.this.f14799OooO0OO);
            if (PickerViewLinkage.this.f14794OooO00o != null) {
                PickerViewLinkage.this.f14794OooO00o.OooO00o(PickerViewLinkage.this.OooO0o0);
            }
        }
    }

    /* renamed from: com.beefe.picker.view.PickerViewLinkage$OooO0Oo  reason: case insensitive filesystem */
    public class C5095OooO0Oo implements AbstractC7589o0o0OO {
        public C5095OooO0Oo() {
        }

        @Override // com.p118pd.sdk.AbstractC7589o0o0OO
        public void OooO00o(String str, int i) {
            PickerViewLinkage.this.o0ooOO0 = i;
            ReadableArray array = ((ReadableMap) PickerViewLinkage.this.OooO0Oo.get(i)).getArray(str);
            PickerViewLinkage.this.f14798OooO0O0.clear();
            PickerViewLinkage pickerViewLinkage = PickerViewLinkage.this;
            pickerViewLinkage.f14798OooO0O0 = pickerViewLinkage.OooO00o((PickerViewLinkage) array);
            PickerViewLinkage pickerViewLinkage2 = PickerViewLinkage.this;
            pickerViewLinkage2.OooO00o((PickerViewLinkage) pickerViewLinkage2.OooO0O0, (LoopView) PickerViewLinkage.this.f14798OooO0O0);
            PickerViewLinkage.this.f14795OooO00o = new C7595o0o0OOOO();
            PickerViewLinkage.this.f14795OooO00o.OooO00o(str);
            PickerViewLinkage.this.f14795OooO00o.OooO00o(i);
            PickerViewLinkage.this.OooO0o0.set(0, PickerViewLinkage.this.f14795OooO00o);
            PickerViewLinkage.this.f14797OooO0O0 = new C7595o0o0OOOO();
            PickerViewLinkage.this.f14797OooO0O0.OooO00o((String) PickerViewLinkage.this.f14798OooO0O0.get(0));
            PickerViewLinkage.this.f14797OooO0O0.OooO00o(PickerViewLinkage.this.OooO0O0.getSelectedIndex());
            PickerViewLinkage.this.OooO0o0.set(1, PickerViewLinkage.this.f14797OooO0O0);
            if (PickerViewLinkage.this.f14794OooO00o != null) {
                PickerViewLinkage.this.f14794OooO00o.OooO00o(PickerViewLinkage.this.OooO0o0);
            }
        }
    }

    /* renamed from: com.beefe.picker.view.PickerViewLinkage$OooO0o0  reason: case insensitive filesystem */
    public class C5096OooO0o0 implements AbstractC7589o0o0OO {
        public C5096OooO0o0() {
        }

        @Override // com.p118pd.sdk.AbstractC7589o0o0OO
        public void OooO00o(String str, int i) {
            PickerViewLinkage.this.f14795OooO00o = new C7595o0o0OOOO();
            PickerViewLinkage.this.f14795OooO00o.OooO00o((String) PickerViewLinkage.this.f14796OooO00o.get(PickerViewLinkage.this.o0ooOO0));
            PickerViewLinkage.this.f14795OooO00o.OooO00o(PickerViewLinkage.this.OooO00o.getSelectedIndex());
            PickerViewLinkage.this.OooO0o0.set(0, PickerViewLinkage.this.f14795OooO00o);
            PickerViewLinkage.this.f14797OooO0O0 = new C7595o0o0OOOO();
            PickerViewLinkage.this.f14797OooO0O0.OooO00o(i);
            PickerViewLinkage.this.f14797OooO0O0.OooO00o(str);
            PickerViewLinkage.this.OooO0o0.set(1, PickerViewLinkage.this.f14797OooO0O0);
            if (PickerViewLinkage.this.f14794OooO00o != null) {
                PickerViewLinkage.this.f14794OooO00o.OooO00o(PickerViewLinkage.this.OooO0o0);
            }
        }
    }

    public PickerViewLinkage(Context context) {
        super(context);
        OooO00o(context);
    }

    private void getAllTwoListData() {
        this.f14798OooO0O0 = OooO00o(this.OooO0Oo.get(this.o0ooOO0).getArray(this.f14796OooO00o.get(this.o0ooOO0)));
    }

    private void getThreeListData() {
        ReadableMap map = this.OooO0Oo.get(this.o0ooOO0).getArray(this.f14796OooO00o.get(this.o0ooOO0)).getMap(this.o0ooOOo);
        this.f14800OooO0OO = OooO00o(map.getArray(map.keySetIterator().nextKey()));
    }

    private void getTwoListData() {
        ReadableArray array = this.OooO0Oo.get(this.o0ooOO0).getArray(this.f14796OooO00o.get(this.o0ooOO0));
        for (int i = 0; i < array.size(); i++) {
            ReadableMapKeySetIterator keySetIterator = array.getMap(i).keySetIterator();
            if (keySetIterator.hasNextKey()) {
                this.f14798OooO0O0.add(keySetIterator.nextKey());
            }
        }
    }

    private void setRow(int i) {
        if (i == 2) {
            this.o00oO0O = 2;
            this.OooO0O0.setVisibility(0);
            this.OooO00o.setVisibility(0);
            this.OooO0OO.setVisibility(8);
        } else if (i == 3) {
            this.o00oO0O = 3;
            this.OooO00o.setVisibility(0);
            this.OooO0O0.setVisibility(0);
            this.OooO0OO.setVisibility(0);
        }
    }

    private void setWeights(double[] dArr) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -1);
        int i = this.o00oO0O;
        if (i == 2) {
            if (dArr.length != 1) {
                layoutParams.weight = (float) dArr[0];
                layoutParams2.weight = (float) dArr[1];
            } else {
                layoutParams.weight = (float) dArr[0];
                layoutParams2.weight = 1.0f;
            }
            this.OooO00o.setLayoutParams(layoutParams);
            this.OooO0O0.setLayoutParams(layoutParams2);
        } else if (i == 3) {
            int length = dArr.length;
            if (length == 1) {
                layoutParams.weight = (float) dArr[0];
                layoutParams2.weight = 1.0f;
                layoutParams3.weight = 1.0f;
            } else if (length != 2) {
                layoutParams.weight = (float) dArr[0];
                layoutParams2.weight = (float) dArr[1];
                layoutParams3.weight = (float) dArr[2];
            } else {
                layoutParams.weight = (float) dArr[0];
                layoutParams2.weight = (float) dArr[1];
                layoutParams3.weight = 1.0f;
            }
            this.OooO00o.setLayoutParams(layoutParams);
            this.OooO0O0.setLayoutParams(layoutParams2);
            this.OooO0OO.setLayoutParams(layoutParams3);
        }
    }

    public ArrayList<C7595o0o0OOOO> getSelectedData() {
        return this.OooO0o0;
    }

    public int getViewHeight() {
        return this.OooO00o.getViewHeight();
    }

    public void setIsLoop(boolean z) {
        if (!z) {
            int i = this.o00oO0O;
            if (i == 2) {
                this.OooO00o.OooO0OO();
                this.OooO0O0.OooO0OO();
            } else if (i == 3) {
                this.OooO00o.OooO0OO();
                this.OooO0O0.OooO0OO();
                this.OooO0OO.OooO0OO();
            }
        }
    }

    public void setOnSelectListener(AbstractC7593o0o0OOO o0o0ooo) {
        this.f14794OooO00o = o0o0ooo;
    }

    public void setSelectValue(String[] strArr) {
        int i = this.o00oO0O;
        if (i <= strArr.length) {
            OooO0Oo((String[]) Arrays.copyOf(strArr, i), this.OooO0o0);
            return;
        }
        int length = strArr.length;
        if (length == 1) {
            OooO00o(strArr, this.OooO0o0);
            int i2 = this.o00oO0O;
            if (i2 == 2) {
                this.f14798OooO0O0.clear();
                getAllTwoListData();
                this.OooO0O0.setItems(this.f14798OooO0O0);
                this.OooO0O0.setSelectedPosition(0);
                C7595o0o0OOOO o0o0oooo = new C7595o0o0OOOO();
                this.f14797OooO0O0 = o0o0oooo;
                o0o0oooo.OooO00o(this.OooO0O0.OooO00o(0));
                this.f14797OooO0O0.OooO00o(this.OooO0O0.getSelectedIndex());
                this.OooO0o0.set(1, this.f14797OooO0O0);
            } else if (i2 == 3) {
                this.f14798OooO0O0.clear();
                getTwoListData();
                this.OooO0O0.setItems(this.f14798OooO0O0);
                this.OooO0O0.setSelectedPosition(0);
                C7595o0o0OOOO o0o0oooo2 = new C7595o0o0OOOO();
                this.f14797OooO0O0 = o0o0oooo2;
                o0o0oooo2.OooO00o(this.OooO0O0.OooO00o(0));
                this.f14797OooO0O0.OooO00o(this.OooO0O0.getSelectedIndex());
                this.OooO0o0.set(1, this.f14797OooO0O0);
                this.f14800OooO0OO.clear();
                getThreeListData();
                this.OooO0OO.setItems(this.f14800OooO0OO);
                this.OooO0OO.setSelectedPosition(0);
                C7595o0o0OOOO o0o0oooo3 = new C7595o0o0OOOO();
                this.f14799OooO0OO = o0o0oooo3;
                o0o0oooo3.OooO00o(this.OooO0OO.OooO00o(0));
                this.f14799OooO0OO.OooO00o(this.OooO0OO.getSelectedIndex());
                this.OooO0o0.set(2, this.f14799OooO0OO);
            }
        } else if (length == 2 && i == 3) {
            OooO00o(strArr, this.OooO0o0);
            this.f14798OooO0O0.clear();
            getTwoListData();
            OooO0OO(strArr, this.OooO0o0);
            this.f14800OooO0OO.clear();
            getThreeListData();
            this.OooO0OO.setItems(this.f14800OooO0OO);
            this.OooO0OO.setSelectedPosition(0);
            C7595o0o0OOOO o0o0oooo4 = new C7595o0o0OOOO();
            this.f14799OooO0OO = o0o0oooo4;
            o0o0oooo4.OooO00o(this.OooO0OO.OooO00o(0));
            this.f14799OooO0OO.OooO00o(this.OooO0OO.getSelectedIndex());
            this.OooO0o0.set(2, this.f14799OooO0OO);
        }
    }

    public void setTextColor(int i) {
        int i2 = this.o00oO0O;
        if (i2 == 2) {
            this.OooO00o.setTextColor(i);
            this.OooO0O0.setTextColor(i);
        } else if (i2 == 3) {
            this.OooO00o.setTextColor(i);
            this.OooO0O0.setTextColor(i);
            this.OooO0OO.setTextColor(i);
        }
    }

    public void setTextEllipsisLen(int i) {
        int i2 = this.o00oO0O;
        if (i2 == 2) {
            this.OooO00o.setTextEllipsisLen(i);
            this.OooO0O0.setTextEllipsisLen(i);
        } else if (i2 == 3) {
            this.OooO00o.setTextEllipsisLen(i);
            this.OooO0O0.setTextEllipsisLen(i);
            this.OooO0OO.setTextEllipsisLen(i);
        }
    }

    public void setTextSize(float f) {
        int i = this.o00oO0O;
        if (i == 2) {
            this.OooO00o.setTextSize(f);
            this.OooO0O0.setTextSize(f);
        } else if (i == 3) {
            this.OooO00o.setTextSize(f);
            this.OooO0O0.setTextSize(f);
            this.OooO0OO.setTextSize(f);
        }
    }

    public void setTypeface(Typeface typeface) {
        int i = this.o00oO0O;
        if (i == 2) {
            this.OooO00o.setTypeface(typeface);
            this.OooO0O0.setTypeface(typeface);
        } else if (i == 3) {
            this.OooO00o.setTypeface(typeface);
            this.OooO0O0.setTypeface(typeface);
            this.OooO0OO.setTypeface(typeface);
        }
    }

    private void OooO0Oo(String[] strArr, ArrayList<C7595o0o0OOOO> arrayList) {
        int length = strArr.length;
        if (length == 2) {
            OooO00o(strArr, arrayList);
            this.f14798OooO0O0.clear();
            getAllTwoListData();
            OooO0OO(strArr, arrayList);
        } else if (length == 3) {
            OooO00o(strArr, arrayList);
            this.f14798OooO0O0.clear();
            getTwoListData();
            OooO0OO(strArr, arrayList);
            this.f14800OooO0OO.clear();
            getThreeListData();
            OooO0O0(strArr, arrayList);
        }
    }

    private void OooO0OO(String[] strArr, ArrayList<C7595o0o0OOOO> arrayList) {
        this.OooO0O0.setItems(this.f14798OooO0O0);
        if (this.OooO0O0.m14981OooO00o(strArr[1])) {
            this.o0ooOOo = this.OooO0O0.OooO00o(strArr[1]);
        } else {
            this.o0ooOOo = 0;
        }
        this.f14797OooO0O0 = new C7595o0o0OOOO();
        this.OooO0O0.setSelectedPosition(this.o0ooOOo);
        this.f14797OooO0O0.OooO00o(this.OooO0O0.OooO00o(this.o0ooOOo));
        this.f14797OooO0O0.OooO00o(this.OooO0O0.getSelectedIndex());
        arrayList.set(1, this.f14797OooO0O0);
    }

    public PickerViewLinkage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO00o(context);
    }

    private void OooO0O0(String[] strArr, ArrayList<C7595o0o0OOOO> arrayList) {
        this.OooO0OO.setItems(this.f14800OooO0OO);
        int OooO00o2 = this.OooO0OO.m14981OooO00o(strArr[2]) ? this.OooO0OO.OooO00o(strArr[2]) : 0;
        this.f14799OooO0OO = new C7595o0o0OOOO();
        this.OooO0OO.setSelectedPosition(OooO00o2);
        this.f14799OooO0OO.OooO00o(this.OooO0OO.OooO00o(OooO00o2));
        this.f14799OooO0OO.OooO00o(this.OooO0OO.getSelectedIndex());
        arrayList.set(2, this.f14799OooO0OO);
    }

    private void OooO00o(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C0435R.layout.picker_view_linkage, this);
        this.OooO00o = (LoopView) inflate.findViewById(C0435R.C0438id.loopViewOne);
        this.OooO0O0 = (LoopView) inflate.findViewById(C0435R.C0438id.loopViewTwo);
        this.OooO0OO = (LoopView) inflate.findViewById(C0435R.C0438id.loopViewThree);
    }

    public PickerViewLinkage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooO00o(context);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(LoopView loopView, ArrayList<String> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            loopView.setItems(arrayList);
            loopView.setSelectedPosition(0);
        }
    }

    public void OooO00o(ReadableArray readableArray, double[] dArr) {
        this.OooO0o0 = new ArrayList<>();
        this.f14795OooO00o = new C7595o0o0OOOO();
        this.f14797OooO0O0 = new C7595o0o0OOOO();
        this.f14799OooO0OO = new C7595o0o0OOOO();
        this.f14796OooO00o.clear();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            this.OooO0Oo.add(map);
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            if (keySetIterator.hasNextKey()) {
                this.f14796OooO00o.add(keySetIterator.nextKey());
            }
        }
        OooO00o(this.OooO00o, this.f14796OooO00o);
        this.f14795OooO00o.OooO00o(this.f14796OooO00o.get(0));
        this.f14795OooO00o.OooO00o(this.OooO00o.getSelectedIndex());
        if (this.OooO0o0.size() > 0) {
            this.OooO0o0.set(0, this.f14795OooO00o);
        } else {
            this.OooO0o0.add(0, this.f14795OooO00o);
        }
        ReadableArray array = this.OooO0Oo.get(0).getArray(this.f14796OooO00o.get(0));
        if (array.getType(0).name().equals("Map")) {
            setRow(3);
            this.f14798OooO0O0.clear();
            getTwoListData();
            OooO00o(this.OooO0O0, this.f14798OooO0O0);
            this.f14797OooO0O0.OooO00o(this.f14798OooO0O0.get(0));
            this.f14797OooO0O0.OooO00o(this.OooO0O0.getSelectedIndex());
            if (this.OooO0o0.size() > 1) {
                this.OooO0o0.set(1, this.f14797OooO0O0);
            } else {
                this.OooO0o0.add(1, this.f14797OooO0O0);
            }
            ReadableMap map2 = this.OooO0Oo.get(0).getArray(this.f14796OooO00o.get(0)).getMap(0);
            ReadableArray array2 = map2.getArray(map2.keySetIterator().nextKey());
            this.f14800OooO0OO.clear();
            ArrayList<String> OooO00o2 = OooO00o(array2);
            this.f14800OooO0OO = OooO00o2;
            OooO00o(this.OooO0OO, OooO00o2);
            ArrayList<String> arrayList = this.f14800OooO0OO;
            if (arrayList != null && arrayList.size() > 0) {
                this.f14799OooO0OO.OooO00o(this.f14800OooO0OO.get(0));
                this.f14799OooO0OO.OooO00o(this.OooO0OO.getSelectedIndex());
                if (this.OooO0o0.size() > 2) {
                    this.OooO0o0.set(2, this.f14799OooO0OO);
                } else {
                    this.OooO0o0.add(2, this.f14799OooO0OO);
                }
            }
            this.OooO00o.setListener(new OooO00o());
            this.OooO0O0.setListener(new OooO0O0());
            this.OooO0OO.setListener(new OooO0OO());
        } else {
            setRow(2);
            this.OooO00o.setListener(new C5095OooO0Oo());
            this.f14798OooO0O0.clear();
            ArrayList<String> OooO00o3 = OooO00o(array);
            this.f14798OooO0O0 = OooO00o3;
            OooO00o(this.OooO0O0, OooO00o3);
            C7595o0o0OOOO o0o0oooo = new C7595o0o0OOOO();
            this.f14797OooO0O0 = o0o0oooo;
            o0o0oooo.OooO00o(this.f14798OooO0O0.get(0));
            this.f14797OooO0O0.OooO00o(this.OooO0O0.getSelectedIndex());
            if (this.OooO0o0.size() > 1) {
                this.OooO0o0.set(1, this.f14797OooO0O0);
            } else {
                this.OooO0o0.add(1, this.f14797OooO0O0);
            }
            this.OooO0O0.setListener(new C5096OooO0o0());
        }
        if (dArr != null) {
            setWeights(dArr);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private ArrayList<String> OooO00o(ReadableArray readableArray) {
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < readableArray.size(); i++) {
                String str = "";
                String name = readableArray.getType(i).name();
                char c = 65535;
                int hashCode = name.hashCode();
                if (hashCode != -1950496919) {
                    if (hashCode != -1808118735) {
                        if (hashCode == 1729365000) {
                            if (name.equals("Boolean")) {
                                c = 0;
                            }
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
                } else if (c == 2) {
                    str = readableArray.getString(i);
                }
                arrayList.add(str);
            }
            return arrayList;
        } catch (Exception unused2) {
            return null;
        }
    }

    private void OooO00o(String[] strArr, ArrayList<C7595o0o0OOOO> arrayList) {
        if (this.OooO00o.m14981OooO00o(strArr[0])) {
            this.o0ooOO0 = this.OooO00o.OooO00o(strArr[0]);
        } else {
            this.o0ooOO0 = 0;
        }
        this.OooO00o.setSelectedPosition(this.o0ooOO0);
        C7595o0o0OOOO o0o0oooo = new C7595o0o0OOOO();
        this.f14795OooO00o = o0o0oooo;
        o0o0oooo.OooO00o(this.OooO00o.OooO00o(this.o0ooOO0));
        this.f14795OooO00o.OooO00o(this.OooO00o.getSelectedIndex());
        arrayList.set(0, this.f14795OooO00o);
    }
}
