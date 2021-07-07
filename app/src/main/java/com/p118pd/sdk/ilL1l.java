package com.p118pd.sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.pd.sdk.ilL丨1l  reason: invalid class name */
public class ilL1l {
    public static final AbstractC5356IiLIll OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ilL1l f18030OooO00o = new ilL1l();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicReference<AbstractC5356IiLIll> f18031OooO00o = new AtomicReference<>();
    public final AtomicReference<iliiILIL> OooO0O0 = new AtomicReference<>();
    public final AtomicReference<IiLl1> OooO0OO = new AtomicReference<>();
    public final AtomicReference<lIL11> OooO0Oo = new AtomicReference<>();
    public final AtomicReference<C6657liILIL> OooO0o0 = new AtomicReference<>();

    /* renamed from: com.pd.sdk.ilL丨1l$OooO00o */
    public static class OooO00o extends AbstractC5356IiLIll {
    }

    /* renamed from: com.pd.sdk.ilL丨1l$OooO0O0 */
    public class OooO0O0 extends lIL11 {
        public OooO0O0() {
        }
    }

    @Deprecated
    public static ilL1l OooO00o() {
        return f18030OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17366OooO00o() {
        f18030OooO00o.f18031OooO00o.set(null);
        f18030OooO00o.OooO0O0.set(null);
        f18030OooO00o.OooO0OO.set(null);
        f18030OooO00o.OooO0Oo.set(null);
        f18030OooO00o.OooO0o0.set(null);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC5356IiLIll m17361OooO00o() {
        if (this.f18031OooO00o.get() == null) {
            Object OooO00o2 = OooO00o(AbstractC5356IiLIll.class, System.getProperties());
            if (OooO00o2 == null) {
                this.f18031OooO00o.compareAndSet(null, OooO00o);
            } else {
                this.f18031OooO00o.compareAndSet(null, (AbstractC5356IiLIll) OooO00o2);
            }
        }
        return this.f18031OooO00o.get();
    }

    public void OooO00o(AbstractC5356IiLIll r3) {
        if (!this.f18031OooO00o.compareAndSet(null, r3)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.f18031OooO00o.get());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iliiILIL m17363OooO00o() {
        if (this.OooO0O0.get() == null) {
            Object OooO00o2 = OooO00o(iliiILIL.class, System.getProperties());
            if (OooO00o2 == null) {
                this.OooO0O0.compareAndSet(null, C6145iI1L.OooO00o());
            } else {
                this.OooO0O0.compareAndSet(null, (iliiILIL) OooO00o2);
            }
        }
        return this.OooO0O0.get();
    }

    public void OooO00o(iliiILIL iliiilil) {
        if (!this.OooO0O0.compareAndSet(null, iliiilil)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.OooO0O0.get());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public IiLl1 m17362OooO00o() {
        if (this.OooO0OO.get() == null) {
            Object OooO00o2 = OooO00o(IiLl1.class, System.getProperties());
            if (OooO00o2 == null) {
                this.OooO0OO.compareAndSet(null, iII1i.OooO00o());
            } else {
                this.OooO0OO.compareAndSet(null, (IiLl1) OooO00o2);
            }
        }
        return this.OooO0OO.get();
    }

    public void OooO00o(IiLl1 iiLl1) {
        if (!this.OooO0OO.compareAndSet(null, iiLl1)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.OooO0OO.get());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public lIL11 m17364OooO00o() {
        if (this.OooO0Oo.get() == null) {
            Object OooO00o2 = OooO00o(lIL11.class, System.getProperties());
            if (OooO00o2 == null) {
                this.OooO0Oo.compareAndSet(null, new OooO0O0());
            } else {
                this.OooO0Oo.compareAndSet(null, (lIL11) OooO00o2);
            }
        }
        return this.OooO0Oo.get();
    }

    public void OooO00o(lIL11 lil11) {
        if (!this.OooO0Oo.compareAndSet(null, lil11)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.OooO0OO.get());
        }
    }

    public static Object OooO00o(Class<?> cls, Properties properties) {
        Properties properties2 = (Properties) properties.clone();
        String simpleName = cls.getSimpleName();
        String property = properties2.getProperty("rxjava.plugin." + simpleName + ".implementation");
        if (property == null) {
            Iterator it = properties2.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String obj = entry.getKey().toString();
                if (obj.startsWith("rxjava.plugin.") && obj.endsWith(".class") && simpleName.equals(entry.getValue().toString())) {
                    String str = "rxjava.plugin." + obj.substring(0, obj.length() - 6).substring(14) + ".impl";
                    String property2 = properties2.getProperty(str);
                    if (property2 != null) {
                        property = property2;
                    } else {
                        throw new IllegalStateException("Implementing class declaration for " + simpleName + " missing: " + str);
                    }
                }
            }
        }
        if (property == null) {
            return null;
        }
        try {
            return Class.forName(property).asSubclass(cls).newInstance();
        } catch (ClassCastException e) {
            throw new IllegalStateException(simpleName + " implementation is not an instance of " + simpleName + ": " + property, e);
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException(simpleName + " implementation class not found: " + property, e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(simpleName + " implementation not able to be instantiated: " + property, e3);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException(simpleName + " implementation not able to be accessed: " + property, e4);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6657liILIL m17365OooO00o() {
        if (this.OooO0o0.get() == null) {
            Object OooO00o2 = OooO00o(C6657liILIL.class, System.getProperties());
            if (OooO00o2 == null) {
                this.OooO0o0.compareAndSet(null, C6657liILIL.OooO00o());
            } else {
                this.OooO0o0.compareAndSet(null, (C6657liILIL) OooO00o2);
            }
        }
        return this.OooO0o0.get();
    }

    public void OooO00o(C6657liILIL r3) {
        if (!this.OooO0o0.compareAndSet(null, r3)) {
            throw new IllegalStateException("Another strategy was already registered: " + this.OooO0o0.get());
        }
    }
}
