package com.megvii.meglive_sdk.detect.fmp;

import android.hardware.Camera;
import com.megvii.action.fmp.liveness.lib.p091c.C1463b;
import com.megvii.apo.PhoneFingerManager;
import com.megvii.meglive_sdk.base.DetectBasePresenter;
import com.megvii.meglive_sdk.detect.C1526a;
import com.megvii.meglive_sdk.detect.p099a.C1529a;
import com.megvii.meglive_sdk.p096b.C1512a;
import com.megvii.meglive_sdk.p100e.p101a.AbstractRunnableC1539b;
import com.megvii.meglive_sdk.p100e.p101a.C1533a;
import com.megvii.meglive_sdk.p100e.p101a.C1541c;
import com.megvii.meglive_sdk.p100e.p101a.C1542d;
import com.megvii.meglive_sdk.p106f.C1565g;
import com.megvii.meglive_sdk.p106f.C1566h;
import com.megvii.meglive_sdk.p106f.C1569k;
import com.megvii.meglive_sdk.p106f.C1571m;
import com.megvii.meglive_sdk.p106f.C1577r;
import com.megvii.meglive_sdk.p106f.C1581v;
import com.megvii.meglive_sdk.p106f.C1583x;
import com.megvii.meglive_sdk.p106f.C1584y;
import com.p118pd.sdk.C7265o0O000oo;
import java.io.File;

/* renamed from: com.megvii.meglive_sdk.detect.fmp.a */
public final class C1531a extends DetectBasePresenter<C1526a.AbstractC1528b, FmpDetectModelImpl> implements Camera.PreviewCallback {

    /* renamed from: a */
    public int f2361a = -1;

    /* renamed from: b */
    public int f2362b = -1;

    /* renamed from: c */
    public OooO0O0 f2363c;

    /* renamed from: d */
    public Camera.Size f2364d;

    /* renamed from: e */
    public int f2365e;

    /* renamed from: f */
    public int f2366f = 0;

    /* renamed from: g */
    public long f2367g = 0;

    /* renamed from: h */
    public long f2368h = 0;

    /* renamed from: i */
    public int f2369i = 10;

    /* renamed from: j */
    public C1584y f2370j;

    /* renamed from: k */
    public C1541c f2371k;

    /* renamed from: l */
    public boolean f2372l = true;

    /* renamed from: m */
    public boolean f2373m = false;

    /* renamed from: n */
    public String f2374n = "";

    /* renamed from: o */
    public int f2375o = -1;

    /* renamed from: p */
    public int f2376p = -1;

    /* renamed from: q */
    public C1529a f2377q;

    /* renamed from: r */
    public String f2378r = "";

    /* renamed from: s */
    public final AbstractRunnableC1539b.AbstractC1540a f2379s = new OooO00o();

    /* renamed from: com.megvii.meglive_sdk.detect.fmp.a$OooO00o */
    public class OooO00o implements AbstractRunnableC1539b.AbstractC1540a {
        public OooO00o() {
        }

        @Override // com.megvii.meglive_sdk.p100e.p101a.AbstractRunnableC1539b.AbstractC1540a
        /* renamed from: a */
        public final void mo17111a(AbstractRunnableC1539b bVar) {
            if ((bVar instanceof C1542d) && C1531a.this.f2361a == 2) {
                ((C1526a.AbstractC1528b) C1531a.this.getView()).mo17022c(C1531a.this.f2375o);
                C1531a.this.f2361a = -1;
            }
        }
    }

    /* renamed from: com.megvii.meglive_sdk.detect.fmp.a$OooO0O0 */
    public class OooO0O0 extends Thread {
        public boolean OooO0O0 = false;

        public OooO0O0() {
        }

        public final void run() {
            while (this.OooO0O0) {
                try {
                    byte[] bArr = (byte[]) C1531a.this.mFrameDataQueue.take();
                    if (C1531a.m2514b(C1531a.this)) {
                        C1531a.m2515c(C1531a.this);
                        return;
                    } else if (!C1531a.m2516d(C1531a.this)) {
                        C1531a.m2517e(C1531a.this);
                    } else if (C1531a.this.f2364d != null) {
                        C1531a.this.getModel();
                        C1531a.this.m2512a(FmpDetectModelImpl.m2465a(bArr, C1531a.this.f2364d.width, C1531a.this.f2364d.height, C1531a.this.f2365e), bArr);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo17106b() {
        try {
            if (this.mICamera != null) {
                C1571m.m2655a("FMPDetect", "stopPreview...");
                this.mICamera.mo17185a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    public final void mo17107c() {
        try {
            C1571m.m2655a("FMPDetect", "startDetect...");
            this.f2363c = new OooO0O0();
            this.f2367g = System.currentTimeMillis();
            this.f2368h = System.currentTimeMillis();
            int i = this.mICamera.f2606e;
            this.f2365e = i;
            if (this.mICamera.f2605d == 0) {
                this.f2365e = i - 180;
            }
            if (this.f2363c != null) {
                getModel();
                FmpDetectModelImpl.m2469b();
                C1512a.m2287a(this.f2378r);
                C1583x.m2690a(C1512a.m2289a("enter_stableliveness", C1565g.m2630a(((C1526a.AbstractC1528b) getView()).getContext()), this.f2377q.f2169a));
                this.f2363c.start();
                this.f2363c.OooO0O0 = true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: d */
    public final void mo17108d() {
        try {
            if (this.f2363c != null) {
                C1571m.m2655a("FMPDetect", "stopDetect...");
                this.f2363c.OooO0O0 = false;
                getModel();
                FmpDetectModelImpl.m2470c();
                this.f2363c.interrupt();
                this.f2363c = null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.megvii.meglive_sdk.base.DetectBasePresenter
    public final void detach() {
        try {
            C1571m.m2655a("FMPDetect", "FmpDetectPresenterImpl detach ...");
            if (this.f2370j != null) {
                this.f2370j.mo17204a();
            }
            if (getModel() != null) {
                getModel();
                FmpDetectModelImpl.m2467a();
            }
            closeCamera();
            m2519f();
            super.detach();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: e */
    public final boolean mo17109e() {
        return this.cameraData != null;
    }

    @Override // com.megvii.meglive_sdk.base.DetectBasePresenter
    public final void init() {
        super.init();
        C1571m.m2655a("FMPDetect", "FmpDetectPresenterImpl init ...");
        C1529a b = ((C1526a.AbstractC1528b) getView()).mo17019b();
        this.f2377q = b;
        this.f2369i = b.f2171c;
        this.f2366f = b.f2178j;
        this.f2378r = b.f2179k == 1 ? "liveness-sdk" : "FaceIDZFAC";
        getModel();
        C1529a aVar = this.f2377q;
        FmpDetectModelImpl.m2468a(aVar.f2170b, this.f2369i, aVar.f2174f, aVar.f2175g, aVar.f2176h, aVar.f2177i);
        this.f2370j = new C1584y(((C1526a.AbstractC1528b) getView()).getContext());
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        try {
            if (this.cameraData == null) {
                this.cameraData = bArr;
            }
            this.mFrameDataQueue.offer(bArr);
            if (this.f2364d == null) {
                this.f2364d = camera.getParameters().getPreviewSize();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m2517e(C1531a aVar) {
        ((C1526a.AbstractC1528b) aVar.getView()).mo17017a(1, 0);
    }

    /* renamed from: f */
    private void m2519f() {
        try {
            if (this.f2371k != null) {
                C1571m.m2655a("FMPDetect", "stopRecording...");
                this.f2371k.mo17151a();
                this.f2374n = this.f2371k.f2452a;
                this.f2371k = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    private boolean m2521g() {
        boolean z = false;
        int i = 40;
        int i2 = 0;
        while (true) {
            if (i <= 0) {
                break;
            }
            i2++;
            try {
                if (C1577r.m2669a(this.f2374n)) {
                    z = true;
                    break;
                }
                Thread.sleep(50);
                i--;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        C1571m.m2655a("check", "检查完毕，result = " + z + ",count=" + i2);
        return z;
    }

    /* renamed from: a */
    public final boolean mo17105a() {
        try {
            if (this.mICamera == null || ((C1526a.AbstractC1528b) getView()).mo17015a() == null) {
                return false;
            }
            C1571m.m2655a("FMPDetect", "startPreview...");
            this.mICamera.mo17187a(this);
            this.mICamera.mo17186a(((C1526a.AbstractC1528b) getView()).mo17015a());
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m2514b(C1531a aVar) {
        if (aVar.f2366f != 1 || System.currentTimeMillis() - aVar.f2367g < ((long) (aVar.f2369i * 1000))) {
            return false;
        }
        C1571m.m2655a("FMPDetect", "time out ...");
        return true;
    }

    /* renamed from: a */
    public final String mo17104a(int i) {
        int i2;
        try {
            boolean z = true;
            byte[] bArr = null;
            File file = (i != C1512a.EnumC1514b.f2107a - 1 || !m2521g()) ? null : new File(this.f2374n);
            if (this.f2375o == C1512a.EnumC1514b.f2107a - 1) {
                i2 = 0;
            } else {
                i2 = 3003;
                if (this.f2375o == C1512a.EnumC1514b.f2108b - 1) {
                    i2 = 3002;
                }
            }
            String a = C1566h.m2642a(this.f2375o, i2, null, -1);
            if (file != null) {
                bArr = C1569k.m2646a(file);
                file.delete();
            }
            String xx = PhoneFingerManager.getInstance(((C1526a.AbstractC1528b) getView()).getContext()).mo16944xx();
            getModel();
            if (this.f2375o != C1512a.EnumC1514b.f2107a - 1) {
                z = false;
            }
            return FmpDetectModelImpl.m2466a(a, z, C1583x.m2689a(), xx, bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m2516d(C1531a aVar) {
        if (aVar.f2361a == 0) {
            int i = aVar.f2366f;
            if (i == 1) {
                return aVar.f2370j.mo17205b();
            }
            if (i == 0 && System.currentTimeMillis() - aVar.f2368h <= C7265o0O000oo.OooO0o.OooO00o) {
                return aVar.f2370j.mo17205b();
            }
        }
        return true;
    }

    /* renamed from: c */
    public static /* synthetic */ void m2515c(C1531a aVar) {
        C1571m.m2655a("FMPDetect", "handle time out...");
        C1463b bVar = new C1463b();
        bVar.f1926a = 2;
        bVar.f1928c = C1512a.EnumC1514b.f2108b - 1;
        aVar.m2512a(bVar, null);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m2512a(C1463b bVar, byte[] bArr) {
        if (bVar != null) {
            int i = bVar.f1926a;
            this.f2361a = i;
            if (i != this.f2362b) {
                if (i == 0) {
                    ((C1526a.AbstractC1528b) getView()).mo17016a(0);
                    if (this.f2362b == 1) {
                        m2519f();
                        this.f2368h = System.currentTimeMillis();
                        ((C1526a.AbstractC1528b) getView()).mo17021c();
                        ((C1526a.AbstractC1528b) getView()).mo17020b(this.f2361a);
                        C1512a.m2287a(this.f2378r);
                        C1583x.m2690a(C1512a.m2290a("fail_still_video", C1565g.m2630a(((C1526a.AbstractC1528b) getView()).getContext()), this.f2377q.f2169a, bVar.f1927b));
                    }
                    C1512a.m2287a(this.f2378r);
                    C1583x.m2690a(C1512a.m2289a("enter_mirror", C1565g.m2630a(((C1526a.AbstractC1528b) getView()).getContext()), this.f2377q.f2169a));
                } else if (i == 1) {
                    C1512a.m2287a(this.f2378r);
                    C1583x.m2690a(C1512a.m2289a("pass_mirror", C1565g.m2630a(((C1526a.AbstractC1528b) getView()).getContext()), this.f2377q.f2169a));
                    C1512a.m2287a(this.f2378r);
                    C1583x.m2690a(C1512a.m2289a("still_start_video", C1565g.m2630a(((C1526a.AbstractC1528b) getView()).getContext()), this.f2377q.f2169a));
                    try {
                        C1571m.m2655a("FMPDetect", "startRecording...");
                        this.f2371k = new C1541c(((C1526a.AbstractC1528b) getView()).getContext());
                        if (this.f2372l) {
                            new C1542d(this.f2371k, this.f2379s, this.mICamera.f2604c, this.mICamera.f2603b);
                        }
                        if (this.f2373m) {
                            new C1533a(this.f2371k, this.f2379s);
                        }
                        C1541c cVar = this.f2371k;
                        if (cVar.f2454c != null) {
                            cVar.f2454c.mo17125a();
                        }
                        if (cVar.f2455d != null) {
                            cVar.f2455d.mo17125a();
                        }
                        C1541c cVar2 = this.f2371k;
                        if (cVar2.f2454c != null) {
                            cVar2.f2454c.mo17126b();
                        }
                        if (cVar2.f2455d != null) {
                            cVar2.f2455d.mo17126b();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    ((C1526a.AbstractC1528b) getView()).mo17016a(1);
                    ((C1526a.AbstractC1528b) getView()).mo17020b(this.f2361a);
                } else {
                    this.f2375o = bVar.f1928c;
                    ((C1526a.AbstractC1528b) getView()).mo17023d();
                    ((C1526a.AbstractC1528b) getView()).mo17021c();
                    ((C1526a.AbstractC1528b) getView()).mo17018a(this.f2361a, -1, bVar.f1928c);
                    if (this.f2375o == C1512a.EnumC1514b.f2108b - 1) {
                        ((C1526a.AbstractC1528b) getView()).mo17022c(this.f2375o);
                        C1512a.m2287a(this.f2378r);
                        C1583x.m2690a(C1512a.m2289a("fail_liveness:time_out", C1565g.m2630a(((C1526a.AbstractC1528b) getView()).getContext()), this.f2377q.f2169a));
                        this.f2361a = -1;
                    } else {
                        C1512a.m2287a(this.f2378r);
                        C1583x.m2690a(C1512a.m2289a("still_stop_video", C1565g.m2630a(((C1526a.AbstractC1528b) getView()).getContext()), this.f2377q.f2169a));
                        C1512a.m2287a(this.f2378r);
                        C1583x.m2690a(C1512a.m2289a("pass_stableliveness", C1565g.m2630a(((C1526a.AbstractC1528b) getView()).getContext()), this.f2377q.f2169a));
                        m2519f();
                    }
                }
            }
            int i2 = this.f2361a;
            this.f2362b = i2;
            if (i2 == 2) {
                mo17108d();
                ((C1526a.AbstractC1528b) getView()).mo17017a(4, 0);
            } else if (i2 == 0) {
                int i3 = bVar.f1927b;
                ((C1526a.AbstractC1528b) getView()).mo17017a(2, i3);
                ((C1526a.AbstractC1528b) getView()).mo17018a(this.f2361a, i3, -1);
                if (i3 > 0 && i3 < 13 && this.f2376p != i3) {
                    this.f2376p = i3;
                    C1512a.m2287a(this.f2378r);
                    C1583x.m2690a(C1512a.m2290a("fail_mirror", C1565g.m2630a(((C1526a.AbstractC1528b) getView()).getContext()), this.f2377q.f2169a, i3));
                }
            } else if (i2 == 1) {
                ((C1526a.AbstractC1528b) getView()).mo17017a(3, 0);
                C1541c cVar3 = this.f2371k;
                if (cVar3 != null) {
                    byte[] a = C1581v.m2684a(bArr, getCameraWidth(), getCameraHeight(), (360 - this.f2365e) % 360);
                    AbstractRunnableC1539b bVar2 = cVar3.f2454c;
                    if (bVar2 != null) {
                        bVar2.mo17145a(a);
                    }
                }
            }
        }
    }
}
