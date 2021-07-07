package com.beefe.picker;

import android.app.Dialog;
import android.view.View;
import androidx.annotation.Nullable;
import com.beefe.picker.view.PickerViewAlone;
import com.beefe.picker.view.PickerViewLinkage;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.p118pd.sdk.AbstractC7593o0o0OOO;
import com.p118pd.sdk.C7595o0o0OOOO;
import java.util.ArrayList;
import java.util.Iterator;

public class Ilil1111 extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String ERROR_NOT_INIT = "please initialize the component first";
    public static final String EVENT_KEY_CANCEL = "cancel";
    public static final String EVENT_KEY_CONFIRM = "confirm";
    public static final String EVENT_KEY_SELECTED = "select";
    public static final String FONTS = "fonts/";
    public static final String IS_LOOP = "isLoop";
    public static final String OTF = ".otf";
    public static final String PICKER_BG_COLOR = "pickerBg";
    public static final String PICKER_CANCEL_BTN_COLOR = "pickerCancelBtnColor";
    public static final String PICKER_CANCEL_BTN_TEXT = "pickerCancelBtnText";
    public static final String PICKER_CONFIRM_BTN_COLOR = "pickerConfirmBtnColor";
    public static final String PICKER_CONFIRM_BTN_TEXT = "pickerConfirmBtnText";
    public static final String PICKER_DATA = "pickerData";
    public static final String PICKER_EVENT_NAME = "pickerEvent";
    public static final String PICKER_FONT_FAMILY = "pickerFontFamily";
    public static final String PICKER_TEXT_COLOR = "pickerFontColor";
    public static final String PICKER_TEXT_ELLIPSIS_LEN = "pickerTextEllipsisLen";
    public static final String PICKER_TEXT_SIZE = "pickerFontSize";
    public static final String PICKER_TITLE_TEXT = "pickerTitleText";
    public static final String PICKER_TITLE_TEXT_COLOR = "pickerTitleColor";
    public static final String PICKER_TOOL_BAR_BG = "pickerToolBarBg";
    public static final String PICKER_TOOL_BAR_HEIGHT = "pickerToolBarHeight";
    public static final String PICKER_TOOL_BAR_TEXT_SIZE = "pickerToolBarFontSize";
    public static final String REACT_CLASS = "BEEPickerManager";
    public static final String SELECTED_VALUE = "selectedValue";
    public static final String TTF = ".ttf";
    public static final String WEIGHTS = "wheelFlex";
    public String cancelText;
    public String confirmText;
    public int curStatus;
    public Dialog dialog = null;
    public boolean isLoop = true;
    public int pickerTextEllipsisLen;
    public PickerViewAlone pickerViewAlone;
    public PickerViewLinkage pickerViewLinkage;
    public ArrayList<C7595o0o0OOOO> returnData;
    public String titleText;
    public double[] weights;

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        public void onClick(View view) {
            int i = Ilil1111.this.curStatus;
            if (i == 0) {
                Ilil1111 ilil1111 = Ilil1111.this;
                ilil1111.returnData = ilil1111.pickerViewAlone.getSelectedData();
            } else if (i == 1) {
                Ilil1111 ilil11112 = Ilil1111.this;
                ilil11112.returnData = ilil11112.pickerViewLinkage.getSelectedData();
            }
            Ilil1111.this.commonEvent(Ilil1111.EVENT_KEY_CONFIRM);
            Ilil1111.this.hide();
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        public void onClick(View view) {
            int i = Ilil1111.this.curStatus;
            if (i == 0) {
                Ilil1111 ilil1111 = Ilil1111.this;
                ilil1111.returnData = ilil1111.pickerViewAlone.getSelectedData();
            } else if (i == 1) {
                Ilil1111 ilil11112 = Ilil1111.this;
                ilil11112.returnData = ilil11112.pickerViewLinkage.getSelectedData();
            }
            Ilil1111.this.commonEvent("cancel");
            Ilil1111.this.hide();
        }
    }

    public class OooO0OO implements AbstractC7593o0o0OOO {
        public OooO0OO() {
        }

        @Override // com.p118pd.sdk.AbstractC7593o0o0OOO
        public void OooO00o(ArrayList<C7595o0o0OOOO> arrayList) {
            Ilil1111.this.returnData = arrayList;
            Ilil1111.this.commonEvent(Ilil1111.EVENT_KEY_SELECTED);
        }
    }

    /* renamed from: com.beefe.picker.Ilil1111$OooO0Oo  reason: case insensitive filesystem */
    public class C5094OooO0Oo implements AbstractC7593o0o0OOO {
        public C5094OooO0Oo() {
        }

        @Override // com.p118pd.sdk.AbstractC7593o0o0OOO
        public void OooO00o(ArrayList<C7595o0o0OOOO> arrayList) {
            Ilil1111.this.returnData = arrayList;
            Ilil1111.this.commonEvent(Ilil1111.EVENT_KEY_SELECTED);
        }
    }

    public Ilil1111(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void commonEvent(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", str);
        WritableArray createArray = Arguments.createArray();
        WritableArray createArray2 = Arguments.createArray();
        Iterator<C7595o0o0OOOO> it = this.returnData.iterator();
        while (it.hasNext()) {
            C7595o0o0OOOO next = it.next();
            createArray.pushInt(next.OooO00o());
            createArray2.pushString(next.m19227OooO00o());
        }
        createMap.putArray(SELECTED_VALUE, createArray2);
        createMap.putArray("selectedIndex", createArray);
        sendEvent(getReactApplicationContext(), PICKER_EVENT_NAME, createMap);
    }

    private int[] getColor(ReadableArray readableArray) {
        int[] iArr = new int[4];
        for (int i = 0; i < readableArray.size(); i++) {
            if (i == 0 || i == 1 || i == 2) {
                iArr[i] = readableArray.getInt(i);
            } else if (i == 3) {
                iArr[i] = (int) (readableArray.getDouble(i) * 255.0d);
            }
        }
        return iArr;
    }

    private String[] getSelectedValue(ReadableArray readableArray) {
        String[] strArr = new String[readableArray.size()];
        String str = "";
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
            } else if (c == 2) {
                str = readableArray.getString(i);
            }
            strArr[i] = str;
        }
        return strArr;
    }

    private void sendEvent(ReactContext reactContext, String str, @Nullable WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:102:0x0312 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v19, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r12v13, resolved type: java.lang.StringBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v24, types: [android.graphics.Typeface] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x032d */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x020f A[SYNTHETIC, Splitter:B:75:0x020f] */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _init(com.facebook.react.bridge.ReadableMap r18) {
        /*
        // Method dump skipped, instructions count: 1005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beefe.picker.Ilil1111._init(com.facebook.react.bridge.ReadableMap):void");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public void hide() {
        Dialog dialog2 = this.dialog;
        if (dialog2 != null && dialog2.isShowing()) {
            this.dialog.dismiss();
        }
    }

    @ReactMethod
    public void isPickerShow(Callback callback) {
        if (callback != null) {
            Dialog dialog2 = this.dialog;
            if (dialog2 == null) {
                callback.invoke(ERROR_NOT_INIT);
                return;
            }
            callback.invoke(null, Boolean.valueOf(dialog2.isShowing()));
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        hide();
        this.dialog = null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        hide();
        this.dialog = null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @ReactMethod
    public void select(ReadableArray readableArray, Callback callback) {
        if (this.dialog != null) {
            select(getSelectedValue(readableArray));
        } else if (callback != null) {
            callback.invoke(ERROR_NOT_INIT);
        }
    }

    @ReactMethod
    public void show() {
        Dialog dialog2 = this.dialog;
        if (dialog2 != null && !dialog2.isShowing()) {
            this.dialog.show();
        }
    }

    private void select(String[] strArr) {
        int i = this.curStatus;
        if (i == 0) {
            this.pickerViewAlone.setSelectValue(strArr);
        } else if (i == 1) {
            this.pickerViewLinkage.setSelectValue(strArr);
        }
    }
}
