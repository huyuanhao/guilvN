package com.google.android.gms.internal.firebase_ml;

import com.p118pd.sdk.C7522o0Ooo0o;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class zzgq extends zzgi {
    public final zzgn zzxb;
    public final zzqn zzxc;
    public List<String> zzxd = new ArrayList();
    public zzgm zzxe;
    public String zzxf;

    public zzgq(zzgn zzgn, zzqn zzqn) {
        this.zzxb = zzgn;
        this.zzxc = zzqn;
        zzqn.setLenient(true);
    }

    private final void zzgy() {
        zzgm zzgm = this.zzxe;
        zzks.checkArgument(zzgm == zzgm.VALUE_NUMBER_INT || zzgm == zzgm.VALUE_NUMBER_FLOAT);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgi
    public final void close() throws IOException {
        this.zzxc.close();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgi
    public final int getIntValue() {
        zzgy();
        return Integer.parseInt(this.zzxf);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgi
    public final String getText() {
        return this.zzxf;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgi
    public final zzge zzgg() {
        return this.zzxb;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgi
    public final zzgm zzgh() throws IOException {
        zzqp zzqp;
        zzgm zzgm = this.zzxe;
        if (zzgm != null) {
            int i = zzgr.zzwl[zzgm.ordinal()];
            if (i == 1) {
                this.zzxc.beginArray();
                this.zzxd.add(null);
            } else if (i == 2) {
                this.zzxc.beginObject();
                this.zzxd.add(null);
            }
        }
        try {
            zzqp = this.zzxc.zznq();
        } catch (EOFException unused) {
            zzqp = zzqp.END_DOCUMENT;
        }
        switch (zzgr.zzxg[zzqp.ordinal()]) {
            case 1:
                this.zzxf = "[";
                this.zzxe = zzgm.START_ARRAY;
                break;
            case 2:
                this.zzxf = "]";
                this.zzxe = zzgm.END_ARRAY;
                List<String> list = this.zzxd;
                list.remove(list.size() - 1);
                this.zzxc.endArray();
                break;
            case 3:
                this.zzxf = "{";
                this.zzxe = zzgm.START_OBJECT;
                break;
            case 4:
                this.zzxf = C7522o0Ooo0o.OooO0Oo;
                this.zzxe = zzgm.END_OBJECT;
                List<String> list2 = this.zzxd;
                list2.remove(list2.size() - 1);
                this.zzxc.endObject();
                break;
            case 5:
                if (!this.zzxc.nextBoolean()) {
                    this.zzxf = "false";
                    this.zzxe = zzgm.VALUE_FALSE;
                    break;
                } else {
                    this.zzxf = "true";
                    this.zzxe = zzgm.VALUE_TRUE;
                    break;
                }
            case 6:
                this.zzxf = "null";
                this.zzxe = zzgm.VALUE_NULL;
                this.zzxc.nextNull();
                break;
            case 7:
                this.zzxf = this.zzxc.nextString();
                this.zzxe = zzgm.VALUE_STRING;
                break;
            case 8:
                String nextString = this.zzxc.nextString();
                this.zzxf = nextString;
                this.zzxe = nextString.indexOf(46) == -1 ? zzgm.VALUE_NUMBER_INT : zzgm.VALUE_NUMBER_FLOAT;
                break;
            case 9:
                this.zzxf = this.zzxc.nextName();
                this.zzxe = zzgm.FIELD_NAME;
                List<String> list3 = this.zzxd;
                list3.set(list3.size() - 1, this.zzxf);
                break;
            default:
                this.zzxf = null;
                this.zzxe = null;
                break;
        }
        return this.zzxe;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgi
    public final zzgm zzgi() {
        return this.zzxe;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgi
    public final String zzgj() {
        if (this.zzxd.isEmpty()) {
            return null;
        }
        List<String> list = this.zzxd;
        return list.get(list.size() - 1);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgi
    public final zzgi zzgk() throws IOException {
        zzgm zzgm = this.zzxe;
        if (zzgm != null) {
            int i = zzgr.zzwl[zzgm.ordinal()];
            if (i == 1) {
                this.zzxc.skipValue();
                this.zzxf = "]";
                this.zzxe = zzgm.END_ARRAY;
            } else if (i == 2) {
                this.zzxc.skipValue();
                this.zzxf = C7522o0Ooo0o.OooO0Oo;
                this.zzxe = zzgm.END_OBJECT;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgi
    public final byte zzgl() {
        zzgy();
        return Byte.parseByte(this.zzxf);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgi
    public final short zzgm() {
        zzgy();
        return Short.parseShort(this.zzxf);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgi
    public final float zzgn() {
        zzgy();
        return Float.parseFloat(this.zzxf);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgi
    public final long zzgo() {
        zzgy();
        return Long.parseLong(this.zzxf);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgi
    public final double zzgp() {
        zzgy();
        return Double.parseDouble(this.zzxf);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgi
    public final BigInteger zzgq() {
        zzgy();
        return new BigInteger(this.zzxf);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgi
    public final BigDecimal zzgr() {
        zzgy();
        return new BigDecimal(this.zzxf);
    }
}
