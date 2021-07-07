package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.丨il  reason: invalid class name and case insensitive filesystem */
public class C9623il extends AbstractC6122iIlLiL {
    public byte[] OooO00o;

    public C9623il(String str) {
        this.OooO00o = Strings.m22985OooO00o(str);
        try {
            OooO00o();
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: " + e.getMessage());
        }
    }

    public C9623il(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.OooO00o = Strings.m22985OooO00o(simpleDateFormat.format(date));
    }

    public C9623il(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.OooO00o = Strings.m22985OooO00o(simpleDateFormat.format(date));
    }

    public C9623il(byte[] bArr) {
        this.OooO00o = bArr;
    }

    public static C9623il OooO00o(AbstractC5903LlLLL r0, boolean z) {
        AbstractC6122iIlLiL OooO0o = r0.OooO0o();
        return (z || (OooO0o instanceof C9623il)) ? OooO00o((Object) OooO0o) : new C9623il(((AbstractC6804llL1ii) OooO0o).m17938OooO00o());
    }

    public static C9623il OooO00o(Object obj) {
        if (obj == null || (obj instanceof C9623il)) {
            return (C9623il) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C9623il) AbstractC6122iIlLiL.OooO00o((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    private String OooO00o(int i) {
        if (i >= 10) {
            return Integer.toString(i);
        }
        return "0" + i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m21684OooO00o(int i) {
        byte[] bArr = this.OooO00o;
        return bArr.length > i && bArr[i] >= 48 && bArr[i] <= 57;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    private String OooO0Oo() {
        String str;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        } else {
            str = "+";
        }
        int i = rawOffset / 3600000;
        int i2 = (rawOffset - (((i * 60) * 60) * 1000)) / 60000;
        try {
            if (timeZone.useDaylightTime() && timeZone.inDaylightTime(OooO00o())) {
                i += str.equals("+") ? 1 : -1;
            }
        } catch (ParseException unused) {
        }
        return "GMT" + str + OooO00o(i) + Constants.COLON_SEPARATOR + OooO00o(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e1  */
    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Date OooO00o() throws java.text.ParseException {
        /*
        // Method dump skipped, instructions count: 382
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9623il.OooO00o():java.util.Date");
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        iii1.OooO00o(24, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21685OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        if (!(iillil instanceof C9623il)) {
            return false;
        }
        return C9586iIILl.m21627OooO00o(this.OooO00o, ((C9623il) iillil).OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        int length = this.OooO00o.length;
        return L1li1.OooO00o(length) + 1 + length;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m21686OooO0O0() {
        String OooO00o2 = Strings.OooO00o(this.OooO00o);
        if (OooO00o2.charAt(OooO00o2.length() - 1) == 'Z') {
            return OooO00o2.substring(0, OooO00o2.length() - 1) + "GMT+00:00";
        }
        int length = OooO00o2.length() - 5;
        char charAt = OooO00o2.charAt(length);
        if (charAt == '-' || charAt == '+') {
            StringBuilder sb = new StringBuilder();
            sb.append(OooO00o2.substring(0, length));
            sb.append("GMT");
            int i = length + 3;
            sb.append(OooO00o2.substring(length, i));
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(OooO00o2.substring(i));
            return sb.toString();
        }
        int length2 = OooO00o2.length() - 3;
        char charAt2 = OooO00o2.charAt(length2);
        if (charAt2 == '-' || charAt2 == '+') {
            return OooO00o2.substring(0, length2) + "GMT" + OooO00o2.substring(length2) + ":00";
        }
        return OooO00o2 + OooO0Oo();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21687OooO0O0() {
        int i = 0;
        while (true) {
            byte[] bArr = this.OooO00o;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public String OooO0OO() {
        return Strings.OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m21688OooO0OO() {
        return m21684OooO00o(10) && m21684OooO00o(11);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public AbstractC6122iIlLiL m21689OooO0Oo() {
        return new C6139iILilI(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m21690OooO0Oo() {
        return m21684OooO00o(12) && m21684OooO00o(13);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        return C9586iIILl.OooO00o(this.OooO00o);
    }
}
