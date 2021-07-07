package com.p118pd.sdk;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TimeZone;
import org.bouncycastle.i18n.MissingEntryException;

/* renamed from: com.pd.sdk.I1L1 */
public class I1L1 {
    public static final String OooO0Oo = "ISO-8859-1";
    public OooO00o OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6704lill1 f15321OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ClassLoader f15322OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f15323OooO00o;
    public OooO00o OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final String f15324OooO0O0;
    public String OooO0OO = "ISO-8859-1";

    /* renamed from: com.pd.sdk.I1L1$OooO00o */
    public class OooO00o {
        public static final int OooO00o = 0;
        public static final int OooO0O0 = 1;
        public static final int OooO0OO = 2;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC6704lill1 f15326OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f15327OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Object[] f15328OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean[] f15329OooO00o;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public Object[] f15330OooO0O0;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public Object[] f15331OooO0OO;

        public OooO00o(I1L1 i1l1) {
            this(new Object[0]);
        }

        public OooO00o(Object[] objArr) {
            this.f15326OooO00o = null;
            this.f15328OooO00o = objArr;
            this.f15330OooO0O0 = new Object[objArr.length];
            this.f15331OooO0OO = new Object[objArr.length];
            this.f15329OooO00o = new boolean[objArr.length];
            this.f15327OooO00o = new int[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                if (objArr[i] instanceof IIi1L) {
                    this.f15330OooO0O0[i] = ((IIi1L) objArr[i]).OooO00o();
                    this.f15327OooO00o[i] = 0;
                } else if (objArr[i] instanceof C6467l1Ii) {
                    this.f15330OooO0O0[i] = ((C6467l1Ii) objArr[i]).OooO00o();
                    if (objArr[i] instanceof C9532LliILl) {
                        this.f15327OooO00o[i] = 2;
                    } else {
                        this.f15327OooO00o[i] = 1;
                    }
                } else {
                    this.f15330OooO0O0[i] = objArr[i];
                    this.f15327OooO00o[i] = 1;
                }
                this.f15329OooO00o[i] = this.f15330OooO0O0[i] instanceof C9612iLlLL;
            }
        }

        private Object OooO00o(int i, Object obj) {
            if (this.f15326OooO00o != null) {
                if (obj == null) {
                    obj = "null";
                }
                if (i != 0) {
                    if (i == 1) {
                        return this.f15326OooO00o.OooO00o(obj.toString());
                    }
                    if (i != 2) {
                        return null;
                    }
                    return this.f15326OooO00o.OooO0O0(obj.toString());
                }
            }
            return obj;
        }

        public AbstractC6704lill1 OooO00o() {
            return this.f15326OooO00o;
        }

        public void OooO00o(AbstractC6704lill1 lill1) {
            if (lill1 != this.f15326OooO00o) {
                for (int i = 0; i < this.f15330OooO0O0.length; i++) {
                    this.f15331OooO0OO[i] = null;
                }
            }
            this.f15326OooO00o = lill1;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m15278OooO00o() {
            return this.f15330OooO0O0.length == 0;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Object[] m15279OooO00o() {
            return this.f15328OooO00o;
        }

        public Object[] OooO00o(Locale locale) {
            Object obj;
            Object[] objArr = new Object[this.f15330OooO0O0.length];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.f15330OooO0O0;
                if (i >= objArr2.length) {
                    return objArr;
                }
                Object[] objArr3 = this.f15331OooO0OO;
                if (objArr3[i] != null) {
                    obj = objArr3[i];
                } else {
                    Object obj2 = objArr2[i];
                    if (this.f15329OooO00o[i]) {
                        obj = OooO00o(this.f15327OooO00o[i], ((C9612iLlLL) obj2).OooO00o(locale));
                    } else {
                        obj = OooO00o(this.f15327OooO00o[i], obj2);
                        this.f15331OooO0OO[i] = obj;
                    }
                }
                objArr[i] = obj;
                i++;
            }
        }
    }

    public I1L1(String str, String str2) throws NullPointerException {
        if (str == null || str2 == null) {
            throw null;
        }
        this.f15323OooO00o = str2;
        this.f15324OooO0O0 = str;
        this.OooO00o = new OooO00o(this);
    }

    public I1L1(String str, String str2, String str3) throws NullPointerException, UnsupportedEncodingException {
        if (str == null || str2 == null) {
            throw null;
        }
        this.f15323OooO00o = str2;
        this.f15324OooO0O0 = str;
        this.OooO00o = new OooO00o(this);
        if (Charset.isSupported(str3)) {
            this.OooO0OO = str3;
            return;
        }
        throw new UnsupportedEncodingException("The encoding \"" + str3 + "\" is not supported.");
    }

    public I1L1(String str, String str2, String str3, Object[] objArr) throws NullPointerException, UnsupportedEncodingException {
        if (str == null || str2 == null || objArr == null) {
            throw null;
        }
        this.f15323OooO00o = str2;
        this.f15324OooO0O0 = str;
        this.OooO00o = new OooO00o(objArr);
        if (Charset.isSupported(str3)) {
            this.OooO0OO = str3;
            return;
        }
        throw new UnsupportedEncodingException("The encoding \"" + str3 + "\" is not supported.");
    }

    public I1L1(String str, String str2, Object[] objArr) throws NullPointerException {
        if (str == null || str2 == null || objArr == null) {
            throw null;
        }
        this.f15323OooO00o = str2;
        this.f15324OooO0O0 = str;
        this.OooO00o = new OooO00o(objArr);
    }

    public AbstractC6704lill1 OooO00o() {
        return this.f15321OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ClassLoader m15274OooO00o() {
        return this.f15322OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15275OooO00o() {
        return this.f15323OooO00o;
    }

    public String OooO00o(String str, Locale locale) {
        if (this.OooO0O0 == null) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        Object[] OooO00o2 = this.OooO0O0.OooO00o(locale);
        for (Object obj : OooO00o2) {
            stringBuffer.append(obj);
        }
        return stringBuffer.toString();
    }

    public String OooO00o(String str, Locale locale, TimeZone timeZone) throws MissingEntryException {
        String str2 = this.f15323OooO00o;
        if (str != null) {
            str2 = str2 + C9058ooOoOoOO.OooOO0 + str;
        }
        try {
            String string = (this.f15322OooO00o == null ? ResourceBundle.getBundle(this.f15324OooO0O0, locale) : ResourceBundle.getBundle(this.f15324OooO0O0, locale, this.f15322OooO00o)).getString(str2);
            if (!this.OooO0OO.equals("ISO-8859-1")) {
                string = new String(string.getBytes("ISO-8859-1"), this.OooO0OO);
            }
            if (!this.OooO00o.m15278OooO00o()) {
                string = OooO00o(string, this.OooO00o.OooO00o(locale), locale, timeZone);
            }
            return OooO00o(string, locale);
        } catch (MissingResourceException unused) {
            String str3 = "Can't find entry " + str2 + " in resource file " + this.f15324OooO0O0 + C9058ooOoOoOO.OooOO0;
            String str4 = this.f15324OooO0O0;
            ClassLoader classLoader = this.f15322OooO00o;
            if (classLoader == null) {
                classLoader = m15274OooO00o();
            }
            throw new MissingEntryException(str3, str4, str2, locale, classLoader);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public String OooO00o(String str, Object[] objArr, Locale locale, TimeZone timeZone) {
        MessageFormat messageFormat = new MessageFormat(" ");
        messageFormat.setLocale(locale);
        messageFormat.applyPattern(str);
        if (!timeZone.equals(TimeZone.getDefault())) {
            Format[] formats = messageFormat.getFormats();
            for (int i = 0; i < formats.length; i++) {
                if (formats[i] instanceof DateFormat) {
                    DateFormat dateFormat = (DateFormat) formats[i];
                    dateFormat.setTimeZone(timeZone);
                    messageFormat.setFormat(i, dateFormat);
                }
            }
        }
        return messageFormat.format(objArr);
    }

    public void OooO00o(AbstractC6704lill1 lill1) {
        this.OooO00o.OooO00o(lill1);
        OooO00o oooO00o = this.OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO00o(lill1);
        }
        this.f15321OooO00o = lill1;
    }

    public void OooO00o(ClassLoader classLoader) {
        this.f15322OooO00o = classLoader;
    }

    public void OooO00o(Object obj) {
        OooO00o(new Object[]{obj});
    }

    public void OooO00o(Object[] objArr) {
        if (objArr != null) {
            OooO00o oooO00o = new OooO00o(objArr);
            this.OooO0O0 = oooO00o;
            oooO00o.OooO00o(this.f15321OooO00o);
            return;
        }
        this.OooO0O0 = null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object[] m15276OooO00o() {
        return this.OooO00o.m15279OooO00o();
    }

    public String OooO0O0() {
        return this.f15324OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Object[] m15277OooO0O0() {
        OooO00o oooO00o = this.OooO0O0;
        if (oooO00o == null) {
            return null;
        }
        return oooO00o.m15279OooO00o();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Resource: \"");
        stringBuffer.append(this.f15324OooO0O0);
        stringBuffer.append("\" Id: \"");
        stringBuffer.append(this.f15323OooO00o);
        stringBuffer.append("\"");
        stringBuffer.append(" Arguments: ");
        stringBuffer.append(this.OooO00o.m15279OooO00o().length);
        stringBuffer.append(" normal");
        OooO00o oooO00o = this.OooO0O0;
        if (oooO00o != null && oooO00o.m15279OooO00o().length > 0) {
            stringBuffer.append(", ");
            stringBuffer.append(this.OooO0O0.m15279OooO00o().length);
            stringBuffer.append(" extra");
        }
        stringBuffer.append(" Encoding: ");
        stringBuffer.append(this.OooO0OO);
        stringBuffer.append(" ClassLoader: ");
        stringBuffer.append(this.f15322OooO00o);
        return stringBuffer.toString();
    }
}
