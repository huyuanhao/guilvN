package com.megvii.meglive_sdk.detect.action;

import android.hardware.Camera;
import com.facebook.react.uimanager.ViewProps;
import com.megvii.action.fmp.liveness.lib.p091c.C1462a;
import com.megvii.apo.PhoneFingerManager;
import com.megvii.meglive_sdk.base.DetectBasePresenter;
import com.megvii.meglive_sdk.detect.C1526a;
import com.megvii.meglive_sdk.detect.p099a.C1529a;
import com.megvii.meglive_sdk.p096b.C1512a;
import com.megvii.meglive_sdk.p106f.C1566h;
import com.megvii.meglive_sdk.p106f.C1571m;
import com.megvii.meglive_sdk.p106f.C1583x;
import com.megvii.meglive_sdk.p106f.C1584y;
import com.p118pd.sdk.C7265o0O000oo;

/* renamed from: com.megvii.meglive_sdk.detect.action.a */
public final class C1530a extends DetectBasePresenter<C1526a.AbstractC1527a, ActionDetectModeImpl> implements Camera.PreviewCallback {

    /* renamed from: a */
    public int f2211a = -1;

    /* renamed from: b */
    public int f2212b = -1;

    /* renamed from: c */
    public int f2213c = -1;

    /* renamed from: d */
    public int f2214d = -1;

    /* renamed from: e */
    public C1529a f2215e;

    /* renamed from: f */
    public int f2216f = -1;

    /* renamed from: g */
    public int f2217g = 10;

    /* renamed from: h */
    public OooO00o f2218h;

    /* renamed from: i */
    public Camera.Size f2219i;

    /* renamed from: j */
    public int f2220j;

    /* renamed from: k */
    public int f2221k = 0;

    /* renamed from: l */
    public C1584y f2222l;

    /* renamed from: m */
    public long f2223m = 0;

    /* renamed from: n */
    public long f2224n = 0;

    /* renamed from: o */
    public String f2225o = "";

    /* renamed from: com.megvii.meglive_sdk.detect.action.a$OooO00o */
    public class OooO00o extends Thread {
        public boolean OooO0O0 = false;

        public OooO00o() {
        }

        public final void run() {
            while (this.OooO0O0) {
                try {
                    byte[] bArr = (byte[]) C1530a.this.mFrameDataQueue.take();
                    if (!C1530a.m2374b(C1530a.this)) {
                        C1530a.m2375c(C1530a.this);
                    } else if (C1530a.this.f2219i != null) {
                        C1530a.this.getModel();
                        C1462a a = ActionDetectModeImpl.m2335a(bArr, C1530a.this.f2219i.width, C1530a.this.f2219i.height, C1530a.this.f2220j);
                        C1571m.m2655a("ActionDetect", "result=" + a.toString());
                        C1530a.m2373a(C1530a.this, a);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo17036b() {
        try {
            if (this.mICamera != null) {
                C1571m.m2655a("ActionDetect", "stopPreview...");
                this.mICamera.mo17185a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public final void mo17037c() {
        try {
            C1571m.m2655a("ActionDetect", "startDetect...");
            this.f2218h = new OooO00o();
            this.f2223m = System.currentTimeMillis();
            this.f2224n = System.currentTimeMillis();
            int i = this.mICamera.f2606e;
            this.f2220j = i;
            if (this.mICamera.f2605d == 0) {
                this.f2220j = i - 180;
            }
            if (this.f2218h != null) {
                C1512a.m2287a(this.f2225o);
                C1583x.m2690a(C1512a.m2289a("enter_liveness", this.f2215e.f2170b, this.f2215e.f2169a));
                this.f2218h.start();
                this.f2218h.OooO0O0 = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.megvii.meglive_sdk.base.DetectBasePresenter
    public final void detach() {
        C1571m.m2655a("ActionDetect", "ActionDetectPresenterImpl detach ...");
        C1584y yVar = this.f2222l;
        if (yVar != null) {
            yVar.mo17204a();
        }
        if (getModel() != null) {
            getModel();
            ActionDetectModeImpl.m2337a();
        }
        closeCamera();
        super.detach();
    }

    @Override // com.megvii.meglive_sdk.base.DetectBasePresenter
    public final void init() {
        super.init();
        C1529a b = ((C1526a.AbstractC1527a) getView()).mo17010b();
        this.f2215e = b;
        this.f2217g = b.f2171c;
        this.f2225o = b.f2179k == 1 ? "liveness-sdk" : "FaceIDZFAC";
        getModel();
        C1529a aVar = this.f2215e;
        ActionDetectModeImpl.m2339a(aVar.f2170b, this.f2217g, aVar.f2172d, aVar.f2173e, aVar.f2175g, aVar.f2176h, aVar.f2177i);
        this.f2221k = this.f2215e.f2178j;
        this.f2222l = new C1584y(((C1526a.AbstractC1527a) getView()).getContext());
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        if (this.cameraData == null) {
            this.cameraData = bArr;
        }
        this.mFrameDataQueue.offer(bArr);
        if (this.f2219i == null) {
            this.f2219i = camera.getParameters().getPreviewSize();
        }
    }

    /* renamed from: a */
    public final boolean mo17035a() {
        try {
            if (this.mICamera == null || ((C1526a.AbstractC1527a) getView()).mo17006a() == null) {
                return false;
            }
            C1571m.m2655a("ActionDetect", "startPreview...");
            this.mICamera.mo17187a(this);
            this.mICamera.mo17186a(((C1526a.AbstractC1527a) getView()).mo17006a());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    public final void mo17038d() {
        try {
            if (this.f2218h != null) {
                C1571m.m2655a("ActionDetect", "stopDetect...");
                this.f2218h.OooO0O0 = false;
                this.f2218h.interrupt();
                this.f2218h = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public final boolean mo17039e() {
        return this.cameraData != null;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m2374b(C1530a aVar) {
        if (aVar.f2211a == 0) {
            int i = aVar.f2221k;
            if (i == 1) {
                return aVar.f2222l.mo17205b();
            }
            if (i == 0 && System.currentTimeMillis() - aVar.f2224n <= C7265o0O000oo.OooO0o.OooO00o) {
                return aVar.f2222l.mo17205b();
            }
        }
        return true;
    }

    /* renamed from: a */
    public final String mo17034a(int i) {
        int i2;
        try {
            boolean z = true;
            if (i == C1512a.EnumC1513a.f2095a - 1) {
                i2 = 0;
            } else {
                i2 = 3003;
                if (i == C1512a.EnumC1513a.f2098d - 1) {
                    i2 = 3002;
                }
            }
            String a = C1566h.m2642a(i, i2, this.f2215e.f2173e, ((C1526a.AbstractC1527a) getView()).mo17014e());
            String xx = PhoneFingerManager.getInstance(((C1526a.AbstractC1527a) getView()).getContext()).mo16944xx();
            getModel();
            if (i != C1512a.EnumC1513a.f2095a - 1) {
                z = false;
            }
            return ActionDetectModeImpl.m2336a(a, z, C1583x.m2689a(), xx);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m2373a(C1530a aVar, C1462a aVar2) {
        if (aVar2 != null) {
            int i = aVar2.f1918a;
            aVar.f2211a = i;
            if (i != aVar.f2212b) {
                if (i == 0) {
                    ((C1526a.AbstractC1527a) aVar.getView()).mo17012c();
                    ((C1526a.AbstractC1527a) aVar.getView()).mo17009a(aVar.f2211a, -1, -1);
                    C1512a.m2287a(aVar.f2225o);
                    C1529a aVar3 = aVar.f2215e;
                    C1583x.m2690a(C1512a.m2289a("enter_mirror", aVar3.f2170b, aVar3.f2169a));
                } else if (i == 1) {
                    C1512a.m2287a(aVar.f2225o);
                    C1529a aVar4 = aVar.f2215e;
                    C1583x.m2690a(C1512a.m2289a("pass_mirror", aVar4.f2170b, aVar4.f2169a));
                } else {
                    ((C1526a.AbstractC1527a) aVar.getView()).mo17009a(aVar.f2211a, -1, aVar2.f1925h);
                    ((C1526a.AbstractC1527a) aVar.getView()).mo17013d();
                    int i2 = aVar2.f1925h;
                    if (i2 == C1512a.EnumC1513a.f2095a - 1) {
                        C1512a.m2287a(aVar.f2225o);
                        C1583x.m2690a(C1512a.m2288a("pass", aVar.f2213c, aVar.f2214d, aVar.f2215e.f2170b));
                        C1512a.m2287a(aVar.f2225o);
                        C1529a aVar5 = aVar.f2215e;
                        C1583x.m2690a(C1512a.m2289a("pass_liveness", aVar5.f2170b, aVar5.f2169a));
                    } else {
                        C1512a.m2287a(aVar.f2225o);
                        C1583x.m2690a(C1512a.m2288a("fail", aVar.f2213c, aVar.f2214d, aVar.f2215e.f2170b));
                        C1512a.m2287a(aVar.f2225o);
                        C1529a aVar6 = aVar.f2215e;
                        C1583x.m2690a(C1512a.m2289a("fail_liveness:" + C1512a.f2091e[i2], aVar6.f2170b, aVar6.f2169a));
                    }
                    ((C1526a.AbstractC1527a) aVar.getView()).mo17007a(i2);
                }
            }
            int i3 = aVar.f2211a;
            aVar.f2212b = i3;
            if (i3 == 2) {
                aVar.mo17038d();
                ((C1526a.AbstractC1527a) aVar.getView()).mo17008a(4, 0);
            } else if (i3 == 1) {
                int i4 = aVar2.f1920c;
                int i5 = aVar2.f1921d;
                int i6 = aVar.f2213c;
                if (i5 != i6) {
                    if (i6 != -1) {
                        C1512a.m2287a(aVar.f2225o);
                        C1583x.m2690a(C1512a.m2288a("pass", aVar.f2213c, aVar.f2214d, aVar.f2215e.f2170b));
                    }
                    ((C1526a.AbstractC1527a) aVar.getView()).mo17011b(i4, i5);
                    ((C1526a.AbstractC1527a) aVar.getView()).mo17009a(aVar.f2211a, i4, -1);
                    C1512a.m2287a(aVar.f2225o);
                    C1583x.m2690a(C1512a.m2288a(ViewProps.START, i5, i4, aVar.f2215e.f2170b));
                    aVar.f2213c = i5;
                    aVar.f2214d = i4;
                }
            } else if (i3 == 0) {
                int i7 = aVar2.f1919b;
                ((C1526a.AbstractC1527a) aVar.getView()).mo17008a(2, i7);
                if (i7 > 0 && i7 < 13 && aVar.f2216f != i7) {
                    aVar.f2216f = i7;
                    C1512a.m2287a(aVar.f2225o);
                    C1529a aVar7 = aVar.f2215e;
                    C1583x.m2690a(C1512a.m2290a("fail_mirror", aVar7.f2170b, aVar7.f2169a, i7));
                }
            }
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m2375c(C1530a aVar) {
        ((C1526a.AbstractC1527a) aVar.getView()).mo17008a(1, 0);
    }
}
