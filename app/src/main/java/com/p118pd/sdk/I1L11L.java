package com.p118pd.sdk;

import java.io.InputStream;

/* renamed from: com.pd.sdk.I1L丨11L  reason: invalid class name */
public class I1L11L extends InputStream {
    public final C9727l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public InputStream f15351OooO00o;
    public boolean OooO0O0 = true;

    public I1L11L(C9727l r2) {
        this.OooO00o = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022  */
    @Override // java.io.InputStream
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read() throws java.io.IOException {
        /*
            r3 = this;
            java.io.InputStream r0 = r3.f15351OooO00o
            r1 = -1
            if (r0 != 0) goto L_0x0019
            boolean r0 = r3.OooO0O0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            com.pd.sdk.丨l丨 r0 = r3.OooO00o
            com.pd.sdk.l丨Li1LL r0 = r0.m21778OooO00o()
            com.pd.sdk.lI丨lii r0 = (com.p118pd.sdk.AbstractC6541lIlii) r0
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            r2 = 0
            r3.OooO0O0 = r2
            goto L_0x0030
        L_0x0019:
            java.io.InputStream r0 = r3.f15351OooO00o
            int r0 = r0.read()
            if (r0 < 0) goto L_0x0022
            return r0
        L_0x0022:
            com.pd.sdk.丨l丨 r0 = r3.OooO00o
            com.pd.sdk.l丨Li1LL r0 = r0.m21778OooO00o()
            com.pd.sdk.lI丨lii r0 = (com.p118pd.sdk.AbstractC6541lIlii) r0
            if (r0 != 0) goto L_0x0030
            r0 = 0
            r3.f15351OooO00o = r0
            return r1
        L_0x0030:
            java.io.InputStream r0 = r0.OooO00o()
            r3.f15351OooO00o = r0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.I1L11L.read():int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002e A[EDGE_INSN: B:20:0x002e->B:15:0x002e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002d A[SYNTHETIC] */
    @Override // java.io.InputStream
    public int read(byte[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            java.io.InputStream r0 = r5.f15351OooO00o
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x001e
            boolean r0 = r5.OooO0O0
            if (r0 != 0) goto L_0x000b
            return r2
        L_0x000b:
            com.pd.sdk.丨l丨 r0 = r5.OooO00o
            com.pd.sdk.l丨Li1LL r0 = r0.m21778OooO00o()
            com.pd.sdk.lI丨lii r0 = (com.p118pd.sdk.AbstractC6541lIlii) r0
            if (r0 != 0) goto L_0x0016
            return r2
        L_0x0016:
            r5.OooO0O0 = r1
        L_0x0018:
            java.io.InputStream r0 = r0.OooO00o()
            r5.f15351OooO00o = r0
        L_0x001e:
            java.io.InputStream r0 = r5.f15351OooO00o
            int r3 = r7 + r1
            int r4 = r8 - r1
            int r0 = r0.read(r6, r3, r4)
            if (r0 < 0) goto L_0x002e
            int r1 = r1 + r0
            if (r1 != r8) goto L_0x001e
            return r1
        L_0x002e:
            com.pd.sdk.丨l丨 r0 = r5.OooO00o
            com.pd.sdk.l丨Li1LL r0 = r0.m21778OooO00o()
            com.pd.sdk.lI丨lii r0 = (com.p118pd.sdk.AbstractC6541lIlii) r0
            if (r0 != 0) goto L_0x0018
            r6 = 0
            r5.f15351OooO00o = r6
            r6 = 1
            if (r1 >= r6) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r2 = r1
        L_0x0040:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.I1L11L.read(byte[], int, int):int");
    }
}
