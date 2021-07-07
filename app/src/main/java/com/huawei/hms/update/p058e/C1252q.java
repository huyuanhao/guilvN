package com.huawei.hms.update.p058e;

import android.app.AlertDialog;
import com.huawei.hms.p037c.AbstractC1139h;

/* renamed from: com.huawei.hms.update.e.q */
public final class C1252q {

    /* renamed from: com.huawei.hms.update.e.q$a */
    public static abstract class AbstractC1253a extends AbstractC1233b {
        public AbstractC1253a() {
        }

        @Override // com.huawei.hms.update.p058e.AbstractC1233b
        /* renamed from: a */
        public AlertDialog mo15768a() {
            AlertDialog.Builder builder = new AlertDialog.Builder(mo15774f(), mo15775g());
            builder.setMessage(mo15794h());
            builder.setPositiveButton(mo15795i(), new DialogInterface$OnClickListenerC1258s(this));
            return builder.create();
        }

        /* renamed from: h */
        public abstract int mo15794h();

        /* renamed from: i */
        public int mo15795i() {
            return AbstractC1139h.m1085c("hms_confirm");
        }
    }

    /* renamed from: com.huawei.hms.update.e.q$b */
    public static class C1254b extends AbstractC1253a {
        public C1254b() {
            super();
        }

        @Override // com.huawei.hms.update.p058e.C1252q.AbstractC1253a, com.huawei.hms.update.p058e.AbstractC1233b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ AlertDialog mo15768a() {
            return super.mo15768a();
        }

        @Override // com.huawei.hms.update.p058e.C1252q.AbstractC1253a
        /* renamed from: h */
        public int mo15794h() {
            return AbstractC1139h.m1085c("hms_check_failure");
        }
    }

    /* renamed from: com.huawei.hms.update.e.q$c */
    public static class C1255c extends AbstractC1253a {
        public C1255c() {
            super();
        }

        @Override // com.huawei.hms.update.p058e.C1252q.AbstractC1253a, com.huawei.hms.update.p058e.AbstractC1233b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ AlertDialog mo15768a() {
            return super.mo15768a();
        }

        @Override // com.huawei.hms.update.p058e.C1252q.AbstractC1253a
        /* renamed from: h */
        public int mo15794h() {
            return AbstractC1139h.m1085c("hms_download_failure");
        }
    }

    /* renamed from: com.huawei.hms.update.e.q$d */
    public static class C1256d extends AbstractC1253a {
        public C1256d() {
            super();
        }

        @Override // com.huawei.hms.update.p058e.C1252q.AbstractC1253a, com.huawei.hms.update.p058e.AbstractC1233b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ AlertDialog mo15768a() {
            return super.mo15768a();
        }

        @Override // com.huawei.hms.update.p058e.C1252q.AbstractC1253a
        /* renamed from: h */
        public int mo15794h() {
            return AbstractC1139h.m1085c("hms_download_no_space");
        }
    }
}
