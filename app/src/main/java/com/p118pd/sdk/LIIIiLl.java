package com.p118pd.sdk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import javax.naming.Binding;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import org.bouncycastle.cert.dane.DANEException;

/* renamed from: com.pd.sdk.LIIIiLl */
public class LIIIiLl implements LL11Lill {
    public static final String OooO00o = "53";

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f16274OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16275OooO00o;

    /* renamed from: com.pd.sdk.LIIIiLl$OooO00o */
    public class OooO00o implements AbstractC5708LiL1Li {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f16276OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Hashtable f16277OooO00o;

        public OooO00o(Hashtable hashtable, String str) {
            this.f16277OooO00o = hashtable;
            this.f16276OooO00o = str;
        }

        @Override // com.p118pd.sdk.AbstractC5708LiL1Li
        public List OooO00o() throws DANEException {
            ArrayList arrayList = new ArrayList();
            try {
                InitialDirContext initialDirContext = new InitialDirContext(this.f16277OooO00o);
                if (this.f16276OooO00o.indexOf("_smimecert.") > 0) {
                    Attribute attribute = initialDirContext.getAttributes(this.f16276OooO00o, new String[]{LIIIiLl.OooO00o}).get(LIIIiLl.OooO00o);
                    if (attribute != null) {
                        LIIIiLl.this.OooO00o(arrayList, this.f16276OooO00o, attribute);
                    }
                } else {
                    NamingEnumeration listBindings = initialDirContext.listBindings("_smimecert." + this.f16276OooO00o);
                    while (listBindings.hasMore()) {
                        DirContext dirContext = (DirContext) ((Binding) listBindings.next()).getObject();
                        Attribute attribute2 = initialDirContext.getAttributes(dirContext.getNameInNamespace().substring(1, dirContext.getNameInNamespace().length() - 1), new String[]{LIIIiLl.OooO00o}).get(LIIIiLl.OooO00o);
                        if (attribute2 != null) {
                            String nameInNamespace = dirContext.getNameInNamespace();
                            LIIIiLl.this.OooO00o(arrayList, nameInNamespace.substring(1, nameInNamespace.length() - 1), attribute2);
                        }
                    }
                }
                return arrayList;
            } catch (NamingException e) {
                throw new DANEException("Exception dealing with DNS: " + e.getMessage(), e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(List list, String str, Attribute attribute) throws NamingException, DANEException {
        for (int i = 0; i != attribute.size(); i++) {
            byte[] bArr = (byte[]) attribute.get(i);
            if (C9469L11iL.OooO00o(bArr)) {
                try {
                    list.add(new C9469L11iL(str, bArr));
                } catch (IOException e) {
                    throw new DANEException("Exception parsing entry: " + e.getMessage(), e);
                }
            }
        }
    }

    @Override // com.p118pd.sdk.LL11Lill
    public LIIIiLl OooO00o(String str) {
        this.f16274OooO00o.add(str);
        return this;
    }

    public LIIIiLl OooO00o(boolean z) {
        this.f16275OooO00o = z;
        return this;
    }

    @Override // com.p118pd.sdk.LL11Lill
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC5708LiL1Li m16025OooO00o(String str) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
        hashtable.put("java.naming.authoritative", this.f16275OooO00o ? "true" : "false");
        if (this.f16274OooO00o.size() > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator it = this.f16274OooO00o.iterator();
            while (it.hasNext()) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(" ");
                }
                stringBuffer.append("dns://" + it.next());
            }
            hashtable.put("java.naming.provider.url", stringBuffer.toString());
        }
        return new OooO00o(hashtable, str);
    }
}
