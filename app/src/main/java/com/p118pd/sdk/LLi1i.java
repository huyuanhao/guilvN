package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: com.pd.sdk.L丨Li1i  reason: invalid class name */
public class LLi1i implements AbstractC6786llil {
    public Hashtable OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector f16820OooO00o;

    public LLi1i() {
        this(new Hashtable(), new Vector());
    }

    public LLi1i(Hashtable hashtable, Vector vector) {
        this.OooO00o = hashtable;
        this.f16820OooO00o = vector;
    }

    public int OooO00o() {
        return this.f16820OooO00o.size();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Hashtable m16432OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Vector m16433OooO00o() {
        return this.f16820OooO00o;
    }

    public void OooO00o(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Object readObject = objectInputStream.readObject();
        if (readObject instanceof Hashtable) {
            this.OooO00o = (Hashtable) readObject;
            this.f16820OooO00o = (Vector) objectInputStream.readObject();
            return;
        }
        C5805Ll1 r3 = new C5805Ll1((byte[]) readObject);
        while (true) {
            LlLI1 llLI1 = (LlLI1) r3.OooO00o();
            if (llLI1 != null) {
                setBagAttribute(llLI1, r3.OooO00o());
            } else {
                return;
            }
        }
    }

    public void OooO00o(ObjectOutputStream objectOutputStream) throws IOException {
        if (this.f16820OooO00o.size() == 0) {
            objectOutputStream.writeObject(new Hashtable());
            objectOutputStream.writeObject(new Vector());
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C6103iIi1 iii1 = new C6103iIi1(byteArrayOutputStream);
        Enumeration bagAttributeKeys = getBagAttributeKeys();
        while (bagAttributeKeys.hasMoreElements()) {
            LlLI1 llLI1 = (LlLI1) bagAttributeKeys.nextElement();
            iii1.OooO00o((AbstractC6854lLi1LL) llLI1);
            iii1.OooO00o((AbstractC6854lLi1LL) this.OooO00o.get(llLI1));
        }
        objectOutputStream.writeObject(byteArrayOutputStream.toByteArray());
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public AbstractC6854lLi1LL getBagAttribute(LlLI1 llLI1) {
        return (AbstractC6854lLi1LL) this.OooO00o.get(llLI1);
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public Enumeration getBagAttributeKeys() {
        return this.f16820OooO00o.elements();
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public void setBagAttribute(LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        if (this.OooO00o.containsKey(llLI1)) {
            this.OooO00o.put(llLI1, r3);
            return;
        }
        this.OooO00o.put(llLI1, r3);
        this.f16820OooO00o.addElement(llLI1);
    }
}
