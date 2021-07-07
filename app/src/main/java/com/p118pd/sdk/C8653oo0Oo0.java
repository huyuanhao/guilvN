package com.p118pd.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import androidx.multidex.MultiDexExtractor;
import com.jinhui365.hotsources.bean.HotSourceVO;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.rxhui.httpclient.response.HttpStatus;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.oo0Oo0  reason: case insensitive filesystem */
public class C8653oo0Oo0 implements AbstractC8665oo0OoO {
    public static final String OooO = "riskquestions";
    public static final int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Context f21786OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C8653oo0Oo0 f21787OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21788OooO00o = "HotUpdateTaskDispatch";
    public static final int OooO0O0 = 1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f21789OooO0O0 = "hotupdate";
    public static final String OooO0OO = "all";
    public static final String OooO0Oo = "startup";
    public static final String OooO0o = "tabicon";
    public static final String OooO0o0 = "gotoPage";
    public static final String OooO0oO = "reactnative";
    public static final String OooO0oo = "hotupdatestrformat";
    public static final String OooOO0 = "appconfig";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f21790OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public IIlIIiI1 f21791OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8944ooOOOOOO f21792OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<AbstractC8626oo0OO000> f21793OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, AbstractC9096ooo0000O> f21794OooO00o = new HashMap();

    /* renamed from: com.pd.sdk.oo0Oo0$OooO00o */
    public class OooO00o extends Handler {
        public OooO00o() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            String str = (String) message.obj;
            C8653oo0Oo0.this.OooO00o((C8653oo0Oo0) str);
            C8653oo0Oo0.this.OooO00o(str, message.arg1 == 0);
        }
    }

    /* renamed from: com.pd.sdk.oo0Oo0$OooO0O0 */
    public class OooO0O0 extends AbstractC8629oo0OO0O0<HttpStatus<List<HotSourceVO>>> {
        public final /* synthetic */ boolean OooO0O0;
        public final /* synthetic */ String o0ooOoO;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context, String str, boolean z) {
            super(context);
            this.o0ooOoO = str;
            this.OooO0O0 = z;
        }

        /* renamed from: OooO00o */
        public void onNext(HttpStatus<List<HotSourceVO>> httpStatus) {
            if (httpStatus == null || C9044ooOoOO0O.OooO00o(httpStatus.getData())) {
                C8643oo0OOo00.m20264OooO00o(C8653oo0Oo0.f21786OooO00o, C8653oo0Oo0.f21789OooO0O0, this.o0ooOoO, "");
                C8653oo0Oo0.this.OooO00o((C8653oo0Oo0) this.o0ooOoO, "no available data");
                return;
            }
            List<HotSourceVO> data = httpStatus.getData();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < data.size(); i++) {
                HotSourceVO hotSourceVO = data.get(i);
                if (C8653oo0Oo0.this.m20272OooO00o(hotSourceVO) || C8653oo0Oo0.this.OooO0O0(hotSourceVO)) {
                    arrayList.add(hotSourceVO);
                } else if (C8653oo0Oo0.this.m20273OooO00o(hotSourceVO.getUrl())) {
                    C8640oo0OOOoo.OooO00o(new File(C8653oo0Oo0.this.OooO00o(hotSourceVO)));
                    if (hotSourceVO.getUrl().endsWith(".mp4")) {
                        C8640oo0OOOoo.OooO00o(new File(C9095ooo00000.OooO00o(C8653oo0Oo0.f21786OooO00o, hotSourceVO)));
                    }
                }
            }
            if ("all".equals(this.o0ooOoO) && !this.OooO0O0) {
                C8643oo0OOo00.m20264OooO00o(C8653oo0Oo0.f21786OooO00o, C8653oo0Oo0.f21789OooO0O0, this.o0ooOoO, C9041ooOoOO0.OooO00o(arrayList));
                C8653oo0Oo0.this.OooO00o((C8653oo0Oo0) this.o0ooOoO, (String) arrayList);
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C8653oo0Oo0.this.OooO0O0((HotSourceVO) arrayList.get(i2), this.OooO0O0);
            }
        }

        @Override // com.p118pd.sdk.AbstractC8629oo0OO0O0
        public void OooO0OO() {
        }

        @Override // com.p118pd.sdk.AbstractC8629oo0OO0O0, com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            super.onError(th);
            C8653oo0Oo0.this.OooO00o((C8653oo0Oo0) this.o0ooOoO, th.getMessage());
        }
    }

    /* renamed from: com.pd.sdk.oo0Oo0$OooO0OO */
    public class OooO0OO extends AbstractC8969ooOOo0Oo<C8964ooOOo000> {
        public final /* synthetic */ HotSourceVO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ boolean f21796OooO00o;

        public OooO0OO(boolean z, HotSourceVO hotSourceVO) {
            this.f21796OooO00o = z;
            this.OooO00o = hotSourceVO;
        }

        @Override // com.p118pd.sdk.AbstractC8969ooOOo0Oo
        public void OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC8969ooOOo0Oo
        public void OooO0OO() {
            if (C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
                String str = "开始下载资源" + this.OooO00o.getUrl();
            }
        }

        public void OooO00o(C8964ooOOo000 ooooo000) {
            if (this.f21796OooO00o) {
                if (C8653oo0Oo0.this.m20272OooO00o(this.OooO00o)) {
                    C8653oo0Oo0.this.OooO00o((C8653oo0Oo0) this.OooO00o.getCategory(), "is only save source");
                }
                HashMap hashMap = new HashMap();
                hashMap.put("desc", "downLoadNewResource");
                hashMap.put("isOnlyDown", "true");
                hashMap.put("url", "" + ooooo000.m20633OooO0O0());
                hashMap.put("savePath", ooooo000.m20631OooO00o());
                LogCollectorManager.sharedInstance().recordInfo(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.toString(), hashMap);
                return;
            }
            if (C8653oo0Oo0.this.m20272OooO00o(this.OooO00o)) {
                C8653oo0Oo0.this.OooO0O0((C8653oo0Oo0) this.OooO00o.getCategory(), (String) 100);
            }
            C8653oo0Oo0.this.OooO0OO(this.OooO00o, true);
        }

        @Override // com.p118pd.sdk.AbstractC8969ooOOo0Oo
        public void OooO00o(Throwable th) {
            super.OooO00o(th);
            if (C8653oo0Oo0.this.m20272OooO00o(this.OooO00o)) {
                C8653oo0Oo0.this.OooO0O0((C8653oo0Oo0) this.OooO00o.getCategory(), (String) 100);
                C8653oo0Oo0.this.OooO00o((C8653oo0Oo0) this.OooO00o.getCategory(), "download error");
            }
        }

        @Override // com.p118pd.sdk.AbstractC8969ooOOo0Oo
        public void OooO00o(long j, long j2) {
            String category = this.OooO00o.getCategory();
            if (C8908ooOO0OoO.OooO00o().m20550OooO00o() && j2 > 0) {
                String str = category + this.OooO00o.getUrl() + "下载进度：" + ((int) ((j * 100) / j2));
            }
            int i = j2 > 0 ? (int) ((j * 100) / j2) : 100;
            if (C8653oo0Oo0.this.m20272OooO00o(this.OooO00o)) {
                C8653oo0Oo0.this.OooO0O0((C8653oo0Oo0) category, (String) i);
            }
        }
    }

    public C8653oo0Oo0(Context context) {
        this.f21792OooO00o = new C8944ooOOOOOO(context, f21789OooO0O0, 209715200);
    }

    private void OooO0Oo(HotSourceVO hotSourceVO, boolean z) {
        if (m20273OooO00o(hotSourceVO.getUrl())) {
            OooO0OO(hotSourceVO, false);
        } else {
            OooO00o(hotSourceVO, z);
        }
    }

    public void OooO0O0(HotSourceVO hotSourceVO, boolean z) {
        if (z) {
            if (hotSourceVO != null && !m20273OooO00o(hotSourceVO.getUrl())) {
                OooO00o(hotSourceVO, true);
            }
        } else if (hotSourceVO == null && !z) {
            OooO00o(hotSourceVO.getCategory(), "source  null");
        } else if (m20272OooO00o(hotSourceVO)) {
            OooO0Oo(hotSourceVO, z);
        } else if (OooO0O0(hotSourceVO) && !m20273OooO00o(hotSourceVO.getUrl())) {
            OooO00o(hotSourceVO, true);
        }
    }

    public void OooO0OO(HotSourceVO hotSourceVO, boolean z) {
        if (hotSourceVO == null) {
            OooO00o(hotSourceVO.getCategory(), "updateVo is null");
        } else if (!m20273OooO00o(hotSourceVO.getUrl())) {
            OooO00o(hotSourceVO.getCategory(), "RetrofitCache File is not exists");
        } else {
            String url = hotSourceVO.getUrl();
            File file = null;
            if (url.endsWith(MultiDexExtractor.o0OO00O)) {
                if (hotSourceVO.getCategory().equals(OooO0oO)) {
                    file = new File(C9095ooo00000.OooO0O0(f21786OooO00o, hotSourceVO));
                } else {
                    file = new File(C9095ooo00000.OooO0OO(f21786OooO00o, hotSourceVO));
                }
            } else if (url.endsWith(".mp4")) {
                file = new File(C9095ooo00000.OooO00o(f21786OooO00o, hotSourceVO));
            }
            if (file == null) {
                if (z) {
                    OooO0O0(OooO00o(hotSourceVO), hotSourceVO);
                } else {
                    OooO00o(OooO00o(hotSourceVO), hotSourceVO);
                }
            } else if (file.exists()) {
                OooO00o(file.getAbsolutePath(), hotSourceVO);
            } else {
                OooO0Oo(hotSourceVO, OooO00o(hotSourceVO));
            }
        }
    }

    private void OooO0Oo(HotSourceVO hotSourceVO, String str) {
        for (int i = 0; i < this.f21793OooO00o.size(); i++) {
            this.f21793OooO00o.get(i).OooO00o(hotSourceVO, str);
        }
    }

    public void OooO00o(String str, AbstractC9096ooo0000O ooo0000o) {
        this.f21794OooO00o.put(str, ooo0000o);
    }

    public static C8653oo0Oo0 OooO00o(Context context) {
        f21786OooO00o = context;
        if (f21787OooO00o == null) {
            synchronized (C8653oo0Oo0.class) {
                f21787OooO00o = new C8653oo0Oo0(f21786OooO00o);
            }
        }
        return f21787OooO00o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean OooO0O0(com.jinhui365.hotsources.bean.HotSourceVO r10) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8653oo0Oo0.OooO0O0(com.jinhui365.hotsources.bean.HotSourceVO):boolean");
    }

    public void OooO00o(String str, int i) {
        Message message = new Message();
        message.obj = str;
        message.arg1 = i;
        this.f21790OooO00o.sendMessage(message);
    }

    public void OooO0OO(HotSourceVO hotSourceVO, String str) {
        String str2;
        if (OooO0oO.equals(hotSourceVO.getCategory())) {
            str2 = C9095ooo00000.OooO0O0(f21786OooO00o, hotSourceVO);
        } else {
            str2 = C9095ooo00000.OooO0OO(f21786OooO00o, hotSourceVO);
        }
        new AsyncTaskC8636oo0OOO00(hotSourceVO.getMd5(), this.f21794OooO00o.get(hotSourceVO.getCategory()), str, str2).executeOnExecutor(Executors.newCachedThreadPool(), new String[0]);
    }

    public void OooO00o(String str, boolean z) {
        LlIiLii OooO00o2 = ((AbstractC8633oo0OO0o0) C8635oo0OO0oo.OooO00o().OooO00o(f21786OooO00o, 2, TimeUnit.SECONDS).OooO00o(AbstractC8633oo0OO0o0.class)).OooO00o(str).OooO00o((AbstractC9508LiLi<? super HttpStatus<List<HotSourceVO>>>) new OooO0O0(f21786OooO00o, str, z));
        if (this.f21791OooO00o == null) {
            this.f21791OooO00o = new IIlIIiI1();
        }
        this.f21791OooO00o.OooO00o(OooO00o2);
    }

    public void OooO0O0(HotSourceVO hotSourceVO, String str) {
        String str2;
        if (OooO0oO.equals(hotSourceVO.getCategory())) {
            str2 = C9095ooo00000.OooO0O0(f21786OooO00o, hotSourceVO);
        } else {
            str2 = C9095ooo00000.OooO0OO(f21786OooO00o, hotSourceVO);
        }
        new AsyncTaskC8623oo0OO(hotSourceVO.getMd5(), this.f21794OooO00o.get(hotSourceVO.getCategory()), str, str2).executeOnExecutor(Executors.newCachedThreadPool(), new String[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m20272OooO00o(com.jinhui365.hotsources.bean.HotSourceVO r10) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8653oo0Oo0.m20272OooO00o(com.jinhui365.hotsources.bean.HotSourceVO):boolean");
    }

    public void OooO0O0(AbstractC8626oo0OO000 oo0oo000) {
        if (this.f21793OooO00o.indexOf(oo0oo000) >= 0) {
            this.f21793OooO00o.remove(oo0oo000);
        }
    }

    public void OooO0O0() {
        this.f21794OooO00o.clear();
    }

    private void OooO0O0(String str, HotSourceVO hotSourceVO) {
        for (int i = 0; i < this.f21793OooO00o.size(); i++) {
            this.f21793OooO00o.get(i).OooO0O0(hotSourceVO.getCategory(), str, hotSourceVO);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0O0(String str, int i) {
        for (int i2 = 0; i2 < this.f21793OooO00o.size(); i2++) {
            this.f21793OooO00o.get(i2).OooO00o(str, i);
        }
    }

    public String OooO00o(HotSourceVO hotSourceVO) {
        if (hotSourceVO == null || this.f21792OooO00o == null) {
            return "";
        }
        return this.f21792OooO00o.m20610OooO00o() + File.separator + C9045ooOoOO0o.OooO0O0(hotSourceVO.getUrl()) + ".0";
    }

    public void OooO00o(HotSourceVO hotSourceVO, boolean z) {
        C8964ooOOo000 ooooo000 = new C8964ooOOo000();
        ooooo000.OooO00o(10);
        ooooo000.OooO00o(this.f21792OooO00o);
        ooooo000.OooO0O0(hotSourceVO.getUrl());
        ooooo000.OooO00o(new OooO0OO(z, hotSourceVO));
        C8950ooOOOo.OooO00o().OooO0OO(ooooo000);
    }

    public void OooO00o(HotSourceVO hotSourceVO, String str) {
        new AsyncTaskC8639oo0OOOoO(hotSourceVO.getMd5(), this, str, C9095ooo00000.OooO00o(f21786OooO00o, hotSourceVO), hotSourceVO).executeOnExecutor(Executors.newCachedThreadPool(), new String[0]);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20273OooO00o(String str) {
        if (C9054ooOoOo0.OooO0OO(str) || this.f21792OooO00o.m20610OooO00o() == null) {
            return false;
        }
        return new File(this.f21792OooO00o.m20610OooO00o() + File.separator + C9045ooOoOO0o.OooO0O0(str) + ".0").exists();
    }

    public void OooO00o(AbstractC8626oo0OO000 oo0oo000) {
        if (this.f21793OooO00o.indexOf(oo0oo000) < 0) {
            this.f21793OooO00o.add(oo0oo000);
        }
    }

    public void OooO00o() {
        IIlIIiI1 iIlIIiI1 = this.f21791OooO00o;
        if (iIlIIiI1 != null && iIlIIiI1.isUnsubscribed()) {
            this.f21791OooO00o.unsubscribe();
        }
        if (C9044ooOoOO0O.OooO0O0(this.f21793OooO00o)) {
            this.f21793OooO00o.clear();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(String str) {
        for (int i = 0; i < this.f21793OooO00o.size(); i++) {
            AbstractC8626oo0OO000 oo0oo000 = this.f21793OooO00o.get(i);
            if (oo0oo000.OooO00o().equals(str)) {
                oo0oo000.OooO00o(str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(String str, List<HotSourceVO> list) {
        for (int i = 0; i < this.f21793OooO00o.size(); i++) {
            AbstractC8626oo0OO000 oo0oo000 = this.f21793OooO00o.get(i);
            if (oo0oo000.OooO00o().equals(str)) {
                oo0oo000.OooO00o(list);
            }
        }
    }

    private void OooO00o(String str, HotSourceVO hotSourceVO) {
        for (int i = 0; i < this.f21793OooO00o.size(); i++) {
            this.f21793OooO00o.get(i).OooO00o(hotSourceVO.getCategory(), str, hotSourceVO);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(String str, String str2) {
        for (int i = 0; i < this.f21793OooO00o.size(); i++) {
            this.f21793OooO00o.get(i).onFailure(str, str2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8665oo0OoO
    public void OooO00o(boolean z, HotSourceVO hotSourceVO) {
        if (z) {
            OooO0O0(C9095ooo00000.OooO00o(f21786OooO00o, hotSourceVO), hotSourceVO);
        } else {
            OooO00o(hotSourceVO.getCategory(), "asynctask fail");
        }
    }
}
