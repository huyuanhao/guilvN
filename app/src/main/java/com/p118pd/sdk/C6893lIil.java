package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.CamcorderProfile;
import android.os.Build;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.zxing.Result;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: com.pd.sdk.l丨丨Iil  reason: invalid class name and case insensitive filesystem */
public class C6893lIil {
    public static final String[][] OooO00o = {new String[]{"string", ExifInterface.f14203OooOooo}, new String[]{"int", ExifInterface.f14139OooO0o0}, new String[]{"int", ExifInterface.f14135OooO0o}, new String[]{"string", ExifInterface.f14209Oooo000}, new String[]{"string", ExifInterface.f14191OooOoO}, new String[]{"string", ExifInterface.f14195OooOoOO}, new String[]{"int", ExifInterface.f14130OooO0Oo}, new String[]{"int", ExifInterface.f14123OooO0OO}, new String[]{"int", ExifInterface.f14178OooOOoo}, new String[]{"int", ExifInterface.f14185OooOo00}, new String[]{"string", ExifInterface.f14199OooOoo0}, new String[]{"string", ExifInterface.f14197OooOoo}, new String[]{"int", ExifInterface.f14146OooO0oo}, new String[]{"int", ExifInterface.f14143OooO0oO}, new String[]{"int", ExifInterface.f14150OooOO0}, new String[]{"double", ExifInterface.f14189OooOo0o}, new String[]{"double", ExifInterface.f14193OooOoO0}, new String[]{"int", ExifInterface.f14166OooOOOO}, new String[]{"int", ExifInterface.f14175OooOOo0}, new String[]{"int", ExifInterface.f14098OooO}, new String[]{"string", ExifInterface.f14201OooOooO}, new String[]{"int", ExifInterface.f14172OooOOo}, new String[]{"int", ExifInterface.f14169OooOOOo}, new String[]{"int", ExifInterface.f14182OooOo0}, new String[]{"double", ExifInterface.f14187OooOo0O}, new String[]{"double", ExifInterface.f14163OooOOO0}, new String[]{"double", ExifInterface.f14180OooOo}, new String[]{"int", ExifInterface.f14157OooOO0o}, new String[]{"int", ExifInterface.f14154OooOO0O}, new String[]{"double", ExifInterface.f14160OooOOO}, new String[]{"double", ExifInterface.f14319o0OoOo0}, new String[]{"double", ExifInterface.f14331ooOO}, new String[]{"string", ExifInterface.o000000O}, new String[]{"int", ExifInterface.f14207Oooo0}, new String[]{"string", ExifInterface.f14219Oooo0o}, new String[]{"double", ExifInterface.f14223Oooo0oO}, new String[]{"int", ExifInterface.o0000Ooo}, new String[]{"int", ExifInterface.o000000o}, new String[]{"string", ExifInterface.f14233OoooO0O}, new String[]{"string", ExifInterface.f14229OoooO0}, new String[]{"string", ExifInterface.o0000}, new String[]{"double", ExifInterface.o00000O}, new String[]{"string", ExifInterface.f14211Oooo00O}, new String[]{"double", ExifInterface.f14298o00O0O}, new String[]{"double", ExifInterface.f14329oo0o0Oo}, new String[]{"int", ExifInterface.o00000}, new String[]{"int", ExifInterface.f14241OoooOo0}, new String[]{"double", ExifInterface.f14237OoooOOO}, new String[]{"double", ExifInterface.f14239OoooOOo}, new String[]{"string", ExifInterface.o000OOo}, new String[]{"int", ExifInterface.f14327oo000o}, new String[]{"double", ExifInterface.f14321o0ooOO0}, new String[]{"string", ExifInterface.f14213Oooo00o}, new String[]{"double", ExifInterface.f14306o00oO0O}, new String[]{"int", ExifInterface.o00000OO}, new String[]{"int", ExifInterface.f14317o0Oo0oo}, new String[]{"double", ExifInterface.f14325o0ooOoO}, new String[]{"double", ExifInterface.f14315o0OOO0o}, new String[]{"int", ExifInterface.o00000o0}, new String[]{"int", ExifInterface.f14245OoooOoo}, new String[]{"string", ExifInterface.o0000oo}, new String[]{"int", ExifInterface.f14310o00ooo}, new String[]{"string", ExifInterface.f14225Oooo0oo}, new String[]{"double", ExifInterface.f14300o00Oo0}, new String[]{"int", ExifInterface.f14304o00o0O}, new String[]{"int", ExifInterface.o000o000}, new String[]{"string", ExifInterface.f14249Ooooo0o}, new String[]{"int", ExifInterface.f14217Oooo0OO}, new String[]{"int", ExifInterface.f14221Oooo0o0}, new String[]{"string", ExifInterface.f14231OoooO00}, new String[]{"int", ExifInterface.o00000oO}, new String[]{"int", ExifInterface.o00000Oo}, new String[]{"string", ExifInterface.o000000}, new String[]{"int", ExifInterface.o0O0O00}, new String[]{"int", ExifInterface.o00000oo}, new String[]{"double", ExifInterface.f14263Ooooooo}, new String[]{"string", ExifInterface.f14323o0ooOOo}, new String[]{"string", ExifInterface.f14243OoooOoO}, new String[]{"int", ExifInterface.o000o00}, new String[]{"string", ExifInterface.f14227OoooO}, new String[]{"string", ExifInterface.f14296o000oOoO}, new String[]{"string", ExifInterface.f14235OoooOO0}, new String[]{"int", ExifInterface.f14308o00oO0o}, new String[]{"double", ExifInterface.f14302o00Ooo}, new String[]{"int", ExifInterface.o0000O00}, new String[]{"int", ExifInterface.f14313o0OO00O}, new String[]{"string", ExifInterface.f14205Oooo}, new String[]{"int", ExifInterface.o00000O0}, new String[]{"int", ExifInterface.o0000OoO}, new String[]{"string", ExifInterface.o000O0o0}, new String[]{"double", ExifInterface.o0000oOO}, new String[]{"string", ExifInterface.o000O0oO}, new String[]{"double", ExifInterface.o000O0}, new String[]{"string", ExifInterface.o000O00O}, new String[]{"double", ExifInterface.o000OO0O}, new String[]{"string", ExifInterface.o000O0Oo}, new String[]{"double", ExifInterface.o000O0O}, new String[]{"string", ExifInterface.o000Ooo}, new String[]{"double", ExifInterface.o000O00}, new String[]{"string", ExifInterface.o000Oo0}, new String[]{"int", ExifInterface.o000O0oo}, new String[]{"double", ExifInterface.o000OoO}, new String[]{"string", ExifInterface.o000O000}, new String[]{"string", ExifInterface.o0000OOO}, new String[]{"string", ExifInterface.o0000Oo0}, new String[]{"string", ExifInterface.o000O0o}, new String[]{"string", ExifInterface.o0000oO0}, new String[]{"string", ExifInterface.o000O0O0}, new String[]{"string", ExifInterface.o0000o0o}, new String[]{"double", ExifInterface.o0000oo0}, new String[]{"string", ExifInterface.o0000oOo}, new String[]{"string", ExifInterface.o0000o}, new String[]{"string", ExifInterface.o0000o0O}, new String[]{"double", ExifInterface.o000}, new String[]{"string", ExifInterface.o0000ooO}, new String[]{"string", ExifInterface.o0000OO}, new String[]{"string", ExifInterface.o000OO00}, new String[]{"int", ExifInterface.o0OoO0o}, new String[]{"int", ExifInterface.o000OO0o}, new String[]{"int", ExifInterface.o000OOO}, new String[]{"int", ExifInterface.o000OOo0}, new String[]{"int", ExifInterface.o000Oo00}, new String[]{"int", ExifInterface.o000Oo0O}, new String[]{"int", ExifInterface.o000Oo0o}, new String[]{"int", ExifInterface.o000Oo}, new String[]{"int", ExifInterface.o000OoOO}, new String[]{"int", ExifInterface.o000OoOo}, new String[]{"int", ExifInterface.o000Ooo0}, new String[]{"int", ExifInterface.o000OooO}};

    /* renamed from: com.pd.sdk.l丨丨Iil$OooO */
    public static class OooO implements Runnable {
        public final /* synthetic */ ViewGroup OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReactContext f19018OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ WritableMap f19019OooO00o;

        public OooO(ViewGroup viewGroup, WritableMap writableMap, ReactContext reactContext) {
            this.OooO00o = viewGroup;
            this.f19019OooO00o = writableMap;
            this.f19018OooO00o = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f19018OooO00o.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(l1lI1i1.OooO00o(this.OooO00o.getId(), this.f19019OooO00o));
        }
    }

    /* renamed from: com.pd.sdk.l丨丨Iil$OooO00o */
    public static class OooO00o implements Runnable {
        public final /* synthetic */ ViewGroup OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReactContext f19020OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ WritableArray f19021OooO00o;

        public OooO00o(ViewGroup viewGroup, WritableArray writableArray, ReactContext reactContext) {
            this.OooO00o = viewGroup;
            this.f19021OooO00o = writableArray;
            this.f19020OooO00o = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f19020OooO00o.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(C5709LiLiIilL.OooO00o(this.OooO00o.getId(), this.f19021OooO00o));
        }
    }

    /* renamed from: com.pd.sdk.l丨丨Iil$OooO0O0 */
    public static class OooO0O0 implements Runnable {
        public final /* synthetic */ ViewGroup OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReactContext f19022OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6321ilLLl f19023OooO00o;

        public OooO0O0(ViewGroup viewGroup, C6321ilLLl r2, ReactContext reactContext) {
            this.OooO00o = viewGroup;
            this.f19023OooO00o = r2;
            this.f19022OooO00o = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f19022OooO00o.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(I1Lil.OooO00o(this.OooO00o.getId(), this.f19023OooO00o));
        }
    }

    /* renamed from: com.pd.sdk.l丨丨Iil$OooO0OO */
    public static class OooO0OO implements Runnable {
        public final /* synthetic */ ViewGroup OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReactContext f19024OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Result f19025OooO00o;
        public final /* synthetic */ int o00oO0O;
        public final /* synthetic */ int o0ooOO0;

        public OooO0OO(ViewGroup viewGroup, Result result, int i, int i2, ReactContext reactContext) {
            this.OooO00o = viewGroup;
            this.f19025OooO00o = result;
            this.o00oO0O = i;
            this.o0ooOO0 = i2;
            this.f19024OooO00o = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f19024OooO00o.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(C9619iiiIIi.OooO00o(this.OooO00o.getId(), this.f19025OooO00o, this.o00oO0O, this.o0ooOO0));
        }
    }

    /* renamed from: com.pd.sdk.l丨丨Iil$OooO0Oo  reason: case insensitive filesystem */
    public static class RunnableC6894OooO0Oo implements Runnable {
        public final /* synthetic */ ViewGroup OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReactContext f19026OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ WritableArray f19027OooO00o;

        public RunnableC6894OooO0Oo(ViewGroup viewGroup, WritableArray writableArray, ReactContext reactContext) {
            this.OooO00o = viewGroup;
            this.f19027OooO00o = writableArray;
            this.f19026OooO00o = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f19026OooO00o.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(l1LLiLl.OooO00o(this.OooO00o.getId(), this.f19027OooO00o));
        }
    }

    /* renamed from: com.pd.sdk.l丨丨Iil$OooO0o */
    public static class OooO0o implements Runnable {
        public final /* synthetic */ ViewGroup OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReactContext f19028OooO00o;

        public OooO0o(ViewGroup viewGroup, ReactContext reactContext) {
            this.OooO00o = viewGroup;
            this.f19028OooO00o = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f19028OooO00o.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(LLI11ILL.OooO00o(this.OooO00o.getId()));
        }
    }

    /* renamed from: com.pd.sdk.l丨丨Iil$OooO0o0  reason: case insensitive filesystem */
    public static class RunnableC6895OooO0o0 implements Runnable {
        public final /* synthetic */ ViewGroup OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReactContext f19029OooO00o;
        public final /* synthetic */ String o0ooOOo;

        public RunnableC6895OooO0o0(ViewGroup viewGroup, String str, ReactContext reactContext) {
            this.OooO00o = viewGroup;
            this.o0ooOOo = str;
            this.f19029OooO00o = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f19029OooO00o.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(ILLiIi.OooO00o(this.OooO00o.getId(), this.o0ooOOo));
        }
    }

    /* renamed from: com.pd.sdk.l丨丨Iil$OooO0oO  reason: case insensitive filesystem */
    public static class RunnableC6896OooO0oO implements Runnable {
        public final /* synthetic */ ViewGroup OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReactContext f19030OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ WritableMap f19031OooO00o;

        public RunnableC6896OooO0oO(ViewGroup viewGroup, WritableMap writableMap, ReactContext reactContext) {
            this.OooO00o = viewGroup;
            this.f19031OooO00o = writableMap;
            this.f19030OooO00o = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f19030OooO00o.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(C6545lL1Illl.OooO00o(this.OooO00o.getId(), this.f19031OooO00o));
        }
    }

    /* renamed from: com.pd.sdk.l丨丨Iil$OooO0oo  reason: case insensitive filesystem */
    public static class RunnableC6897OooO0oo implements Runnable {
        public final /* synthetic */ ViewGroup OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReactContext f19032OooO00o;

        public RunnableC6897OooO0oo(ViewGroup viewGroup, ReactContext reactContext) {
            this.OooO00o = viewGroup;
            this.f19032OooO00o = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f19032OooO00o.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(L1L1IiI.OooO00o(this.OooO00o.getId()));
        }
    }

    /* renamed from: com.pd.sdk.l丨丨Iil$OooOO0 */
    public static class OooOO0 implements Runnable {
        public final /* synthetic */ ViewGroup OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReactContext f19033OooO00o;

        public OooOO0(ViewGroup viewGroup, ReactContext reactContext) {
            this.OooO00o = viewGroup;
            this.f19033OooO00o = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f19033OooO00o.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(C6813l111.OooO00o(this.OooO00o.getId()));
        }
    }

    /* renamed from: com.pd.sdk.l丨丨Iil$OooOO0O */
    public static class OooOO0O implements Runnable {
        public final /* synthetic */ ViewGroup OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReactContext f19034OooO00o;
        public final /* synthetic */ boolean OooO0O0;
        public final /* synthetic */ int o00oO0O;
        public final /* synthetic */ int o0ooOO0;

        public OooOO0O(ViewGroup viewGroup, boolean z, int i, int i2, ReactContext reactContext) {
            this.OooO00o = viewGroup;
            this.OooO0O0 = z;
            this.o00oO0O = i;
            this.o0ooOO0 = i2;
            this.f19034OooO00o = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f19034OooO00o.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(C9835iI.OooO00o(this.OooO00o.getId(), this.OooO0O0, this.o00oO0O, this.o0ooOO0));
        }
    }

    /* renamed from: com.pd.sdk.l丨丨Iil$OooOO0o  reason: case insensitive filesystem */
    public static class RunnableC6898OooOO0o implements Runnable {
        public final /* synthetic */ ViewGroup OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReactContext f19035OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ WritableArray f19036OooO00o;

        public RunnableC6898OooOO0o(ViewGroup viewGroup, WritableArray writableArray, ReactContext reactContext) {
            this.OooO00o = viewGroup;
            this.f19036OooO00o = writableArray;
            this.f19035OooO00o = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f19035OooO00o.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(C6315ilLLL.OooO00o(this.OooO00o.getId(), this.f19036OooO00o));
        }
    }

    /* renamed from: com.pd.sdk.l丨丨Iil$OooOOO0 */
    public static class OooOOO0 implements Runnable {
        public final /* synthetic */ ViewGroup OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReactContext f19037OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ I1 f19038OooO00o;

        public OooOOO0(ViewGroup viewGroup, I1 r2, ReactContext reactContext) {
            this.OooO00o = viewGroup;
            this.f19038OooO00o = r2;
            this.f19037OooO00o = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f19037OooO00o.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(C9353IIl.OooO00o(this.OooO00o.getId(), this.f19038OooO00o));
        }
    }

    public static void OooO00o(ViewGroup viewGroup, String str) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new RunnableC6895OooO0o0(viewGroup, str, reactContext));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18063OooO00o(int i) {
        return i == 90 || i == 270;
    }

    public static void OooO0O0(ViewGroup viewGroup) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new RunnableC6897OooO0oo(viewGroup, reactContext));
    }

    public static void OooO0OO(ViewGroup viewGroup) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new OooOO0(viewGroup, reactContext));
    }

    public static void OooO00o(ViewGroup viewGroup) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new OooO0o(viewGroup, reactContext));
    }

    public static void OooO0O0(ViewGroup viewGroup, WritableMap writableMap) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new OooO(viewGroup, writableMap, reactContext));
    }

    public static void OooO0OO(ViewGroup viewGroup, WritableArray writableArray) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new RunnableC6894OooO0Oo(viewGroup, writableArray, reactContext));
    }

    public static void OooO00o(ViewGroup viewGroup, WritableMap writableMap) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new RunnableC6896OooO0oO(viewGroup, writableMap, reactContext));
    }

    public static void OooO0O0(ViewGroup viewGroup, WritableArray writableArray) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new RunnableC6898OooOO0o(viewGroup, writableArray, reactContext));
    }

    public static void OooO00o(ViewGroup viewGroup, boolean z, int i, int i2) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new OooOO0O(viewGroup, z, i, i2, reactContext));
    }

    public static void OooO00o(ViewGroup viewGroup, I1 r3) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new OooOOO0(viewGroup, r3, reactContext));
    }

    public static void OooO00o(ViewGroup viewGroup, WritableArray writableArray) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new OooO00o(viewGroup, writableArray, reactContext));
    }

    public static void OooO00o(ViewGroup viewGroup, C6321ilLLl r3) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new OooO0O0(viewGroup, r3, reactContext));
    }

    public static void OooO00o(ViewGroup viewGroup, Result result, int i, int i2) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new OooO0OO(viewGroup, result, i, i2, reactContext));
    }

    public static int OooO00o(int i, int i2, int i3) {
        if (i2 == 1) {
            return (i3 + i) % 360;
        }
        return ((i3 - i) + (m18063OooO00o(i) ? 180 : 0)) % 360;
    }

    public static int OooO00o(int i) {
        if (i == 0) {
            return Build.VERSION.SDK_INT >= 21 ? 8 : 6;
        }
        if (i == 1) {
            return 6;
        }
        if (i != 2) {
            return (i == 3 || i == 4) ? 4 : 1;
        }
        return 5;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static CamcorderProfile m18061OooO00o(int i) {
        CamcorderProfile camcorderProfile = CamcorderProfile.get(1);
        int OooO00o2 = OooO00o(i);
        if (CamcorderProfile.hasProfile(OooO00o2)) {
            camcorderProfile = CamcorderProfile.get(OooO00o2);
            if (i == 4) {
                camcorderProfile.videoFrameWidth = C7997oO0ooOO0.OooOoO;
            }
        }
        return camcorderProfile;
    }

    public static WritableMap OooO00o(android.media.ExifInterface exifInterface) {
        WritableMap createMap = Arguments.createMap();
        String[][] strArr = OooO00o;
        for (String[] strArr2 : strArr) {
            String str = strArr2[1];
            if (exifInterface.getAttribute(str) != null) {
                String str2 = strArr2[0];
                char c = 65535;
                int hashCode = str2.hashCode();
                if (hashCode != -1325958191) {
                    if (hashCode != -891985903) {
                        if (hashCode == 104431 && str2.equals("int")) {
                            c = 1;
                        }
                    } else if (str2.equals("string")) {
                        c = 0;
                    }
                } else if (str2.equals("double")) {
                    c = 2;
                }
                if (c == 0) {
                    createMap.putString(str, exifInterface.getAttribute(str));
                } else if (c == 1) {
                    createMap.putInt(str, exifInterface.getAttributeInt(str, 0));
                } else if (c == 2) {
                    createMap.putDouble(str, exifInterface.getAttributeDouble(str, AbstractC8352oOoOOoO0.OooO0O0));
                }
            }
        }
        float[] fArr = null;
        if (exifInterface.getLatLong(null)) {
            createMap.putDouble(ExifInterface.o0000OOo, (double) fArr[0]);
            createMap.putDouble(ExifInterface.o0000Oo, (double) fArr[1]);
            createMap.putDouble(ExifInterface.o0000o0, exifInterface.getAltitude(AbstractC8352oOoOOoO0.OooO0O0));
        }
        return createMap;
    }

    public static void OooO00o(android.media.ExifInterface exifInterface, ReadableMap readableMap) {
        String[][] strArr = OooO00o;
        for (String[] strArr2 : strArr) {
            String str = strArr2[1];
            if (readableMap.hasKey(str)) {
                String str2 = strArr2[0];
                char c = 65535;
                int hashCode = str2.hashCode();
                if (hashCode != -1325958191) {
                    if (hashCode != -891985903) {
                        if (hashCode == 104431 && str2.equals("int")) {
                            c = 1;
                        }
                    } else if (str2.equals("string")) {
                        c = 0;
                    }
                } else if (str2.equals("double")) {
                    c = 2;
                }
                if (c == 0) {
                    exifInterface.setAttribute(str, readableMap.getString(str));
                } else if (c == 1) {
                    exifInterface.setAttribute(str, Integer.toString(readableMap.getInt(str)));
                    readableMap.getInt(str);
                } else if (c == 2) {
                    exifInterface.setAttribute(str, Double.toString(readableMap.getDouble(str)));
                    readableMap.getDouble(str);
                }
            }
        }
        if (readableMap.hasKey(ExifInterface.o0000OOo) && readableMap.hasKey(ExifInterface.o0000Oo) && readableMap.hasKey(ExifInterface.o0000o0)) {
            exifInterface.setAttribute(readableMap.getString(ExifInterface.o0000OOo), readableMap.getString(ExifInterface.o0000Oo));
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m18062OooO00o(android.media.ExifInterface exifInterface) {
        for (String[] strArr : OooO00o) {
            exifInterface.setAttribute(strArr[1], null);
        }
        exifInterface.setAttribute(ExifInterface.o0000OOo, null);
        exifInterface.setAttribute(ExifInterface.o0000Oo, null);
        exifInterface.setAttribute(ExifInterface.o0000o0, null);
    }

    public static Bitmap OooO00o(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(-16777216);
        float f = (float) i;
        float f2 = (float) i2;
        canvas.drawRect(0.0f, 0.0f, f, f2, paint);
        Paint paint2 = new Paint();
        paint2.setColor(-256);
        paint2.setTextSize(35.0f);
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd G '->' HH:mm:ss z");
        canvas.drawText(simpleDateFormat.format(instance.getTime()), 0.1f * f, f2 * 0.2f, paint2);
        canvas.drawText(simpleDateFormat.format(instance.getTime()), 0.2f * f, f2 * 0.4f, paint2);
        canvas.drawText(simpleDateFormat.format(instance.getTime()), 0.3f * f, 0.6f * f2, paint2);
        canvas.drawText(simpleDateFormat.format(instance.getTime()), f * 0.4f, f2 * 0.8f, paint2);
        return createBitmap;
    }
}
