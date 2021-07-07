package com.huawei.hms.update.p058e;

import android.app.AlertDialog;
import com.huawei.hms.p037c.AbstractC1139h;

/* renamed from: com.huawei.hms.update.e.e */
public final class C1236e {

    /* renamed from: com.huawei.hms.update.e.e$a */
    public static abstract class AbstractC1237a extends AbstractC1233b {
        public AbstractC1237a() {
        }

        @Override // com.huawei.hms.update.p058e.AbstractC1233b
        /* renamed from: a */
        public AlertDialog mo15768a() {
            AlertDialog.Builder builder = new AlertDialog.Builder(mo15774f(), mo15775g());
            builder.setMessage(mo15777h());
            builder.setPositiveButton(mo15778i(), new DialogInterface$OnClickListenerC1241g(this));
            builder.setNegativeButton(mo15779j(), new DialogInterface$OnClickListenerC1242h(this));
            return builder.create();
        }

        /* renamed from: h */
        public abstract int mo15777h();

        /* renamed from: i */
        public abstract int mo15778i();

        /* renamed from: j */
        public abstract int mo15779j();
    }

    /* renamed from: com.huawei.hms.update.e.e$b */
    public static class C1238b extends AbstractC1237a {
        public C1238b() {
            super();
        }

        @Override // com.huawei.hms.update.p058e.C1236e.AbstractC1237a, com.huawei.hms.update.p058e.AbstractC1233b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ AlertDialog mo15768a() {
            return super.mo15768a();
        }

        @Override // com.huawei.hms.update.p058e.C1236e.AbstractC1237a
        /* renamed from: h */
        public int mo15777h() {
            return AbstractC1139h.m1085c("hms_download_retry");
        }

        @Override // com.huawei.hms.update.p058e.C1236e.AbstractC1237a
        /* renamed from: i */
        public int mo15778i() {
            return AbstractC1139h.m1085c("hms_retry");
        }

        @Override // com.huawei.hms.update.p058e.C1236e.AbstractC1237a
        /* renamed from: j */
        public int mo15779j() {
            return AbstractC1139h.m1085c("hms_cancel");
        }
    }

    /* renamed from: com.huawei.hms.update.e.e$c */
    public static class C1239c extends AbstractC1237a {
        public C1239c() {
            super();
        }

        @Override // com.huawei.hms.update.p058e.C1236e.AbstractC1237a, com.huawei.hms.update.p058e.AbstractC1233b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ AlertDialog mo15768a() {
            return super.mo15768a();
        }

        @Override // com.huawei.hms.update.p058e.C1236e.AbstractC1237a
        /* renamed from: h */
        public int mo15777h() {
            return AbstractC1139h.m1085c("hms_abort_message");
        }

        @Override // com.huawei.hms.update.p058e.C1236e.AbstractC1237a
        /* renamed from: i */
        public int mo15778i() {
            return AbstractC1139h.m1085c("hms_abort");
        }

        @Override // com.huawei.hms.update.p058e.C1236e.AbstractC1237a
        /* renamed from: j */
        public int mo15779j() {
            return AbstractC1139h.m1085c("hms_cancel");
        }
    }
}
