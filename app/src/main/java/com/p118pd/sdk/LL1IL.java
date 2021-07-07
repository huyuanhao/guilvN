package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.LL1IL */
public class LL1IL extends AbstractC6122iIlLiL {
    public byte[] OooO00o;

    public LL1IL(String str) {
        this.OooO00o = Strings.m22985OooO00o(str);
        try {
            m16170OooO0O0();
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: " + e.getMessage());
        }
    }

    public LL1IL(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.OooO00o = Strings.m22985OooO00o(simpleDateFormat.format(date));
    }

    public LL1IL(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.OooO00o = Strings.m22985OooO00o(simpleDateFormat.format(date));
    }

    public LL1IL(byte[] bArr) {
        this.OooO00o = bArr;
    }

    public static LL1IL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        AbstractC6122iIlLiL OooO0o = r0.OooO0o();
        return (z || (OooO0o instanceof LL1IL)) ? OooO00o((Object) OooO0o) : new LL1IL(((AbstractC6804llL1ii) OooO0o).m17938OooO00o());
    }

    public static LL1IL OooO00o(Object obj) {
        if (obj == null || (obj instanceof LL1IL)) {
            return (LL1IL) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (LL1IL) AbstractC6122iIlLiL.OooO00o((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public Date OooO00o() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat.parse(m16169OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        iii1.OooO00o(23);
        int length = this.OooO00o.length;
        iii1.OooO0O0(length);
        for (int i = 0; i != length; i++) {
            iii1.OooO00o(this.OooO00o[i]);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16168OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        if (!(iillil instanceof LL1IL)) {
            return false;
        }
        return C9586iIILl.m21627OooO00o(this.OooO00o, ((LL1IL) iillil).OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        int length = this.OooO00o.length;
        return L1li1.OooO00o(length) + 1 + length;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m16169OooO0O0() {
        StringBuilder sb;
        String str;
        String OooO0OO = OooO0OO();
        if (OooO0OO.charAt(0) < '5') {
            sb = new StringBuilder();
            str = "20";
        } else {
            sb = new StringBuilder();
            str = "19";
        }
        sb.append(str);
        sb.append(OooO0OO);
        return sb.toString();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Date m16170OooO0O0() throws ParseException {
        return new SimpleDateFormat("yyMMddHHmmssz").parse(OooO0OO());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public String OooO0OO() {
        StringBuilder sb;
        String substring;
        String OooO00o2 = Strings.OooO00o(this.OooO00o);
        if (OooO00o2.indexOf(45) >= 0 || OooO00o2.indexOf(43) >= 0) {
            int indexOf = OooO00o2.indexOf(45);
            if (indexOf < 0) {
                indexOf = OooO00o2.indexOf(43);
            }
            if (indexOf == OooO00o2.length() - 3) {
                OooO00o2 = OooO00o2 + "00";
            }
            if (indexOf == 10) {
                sb = new StringBuilder();
                sb.append(OooO00o2.substring(0, 10));
                sb.append("00GMT");
                sb.append(OooO00o2.substring(10, 13));
                sb.append(Constants.COLON_SEPARATOR);
                substring = OooO00o2.substring(13, 15);
            } else {
                sb = new StringBuilder();
                sb.append(OooO00o2.substring(0, 12));
                sb.append("GMT");
                sb.append(OooO00o2.substring(12, 15));
                sb.append(Constants.COLON_SEPARATOR);
                substring = OooO00o2.substring(15, 17);
            }
        } else if (OooO00o2.length() == 11) {
            sb = new StringBuilder();
            sb.append(OooO00o2.substring(0, 10));
            substring = "00GMT+00:00";
        } else {
            sb = new StringBuilder();
            sb.append(OooO00o2.substring(0, 12));
            substring = "GMT+00:00";
        }
        sb.append(substring);
        return sb.toString();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        return C9586iIILl.OooO00o(this.OooO00o);
    }

    public String toString() {
        return Strings.OooO00o(this.OooO00o);
    }
}
