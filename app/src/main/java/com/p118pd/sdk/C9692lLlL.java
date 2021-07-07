package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import p293rx.Notification;

/* renamed from: com.pd.sdk.丨lLlL  reason: invalid class name and case insensitive filesystem */
public final class C9692lLlL<T> implements C9349III.OooO0O0<T, Notification<T>> {

    /* renamed from: com.pd.sdk.丨lLlL$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<Notification<T>> {
        public final /* synthetic */ AbstractC9508LiLi OooO00o;
        public boolean OooO0O0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, AbstractC9508LiLi r3) {
            super(r2);
            this.OooO00o = r3;
        }

        /* renamed from: OooO00o */
        public void onNext(Notification<T> notification) {
            int i = OooO0O0.OooO00o[notification.m22992OooO00o().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    onError(notification.m22991OooO00o());
                } else if (i != 3) {
                    onError(new IllegalArgumentException("Unsupported notification type: " + notification));
                } else {
                    onCompleted();
                }
            } else if (!this.OooO0O0) {
                this.OooO00o.onNext(notification.m22990OooO00o());
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.OooO00o.onError(th);
            }
        }
    }

    /* renamed from: com.pd.sdk.丨lLlL$OooO0O0 */
    public static /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                rx.Notification$Kind[] r0 = p293rx.Notification.Kind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.p118pd.sdk.C9692lLlL.OooO0O0.OooO00o = r0
                rx.Notification$Kind r1 = p293rx.Notification.Kind.OnNext     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.p118pd.sdk.C9692lLlL.OooO0O0.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                rx.Notification$Kind r1 = p293rx.Notification.Kind.OnError     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.p118pd.sdk.C9692lLlL.OooO0O0.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                rx.Notification$Kind r1 = p293rx.Notification.Kind.OnCompleted     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9692lLlL.OooO0O0.<clinit>():void");
        }
    }

    /* renamed from: com.pd.sdk.丨lLlL$OooO0OO */
    public static final class OooO0OO {
        public static final C9692lLlL<Object> OooO00o = new C9692lLlL<>();
    }

    public static C9692lLlL OooO00o() {
        return OooO0OO.OooO00o;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super Notification<T>> call(AbstractC9508LiLi<? super T> r2) {
        return new OooO00o(r2, r2);
    }
}
