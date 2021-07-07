package org.bouncycastle.pqc.crypto.xmss;

import com.p118pd.sdk.C5532IiIllL;
import java.io.Serializable;

public final class XMSSNode implements Serializable {
    public static final long serialVersionUID = 1;
    public final int height;
    public final byte[] value;

    public XMSSNode(int i, byte[] bArr) {
        this.height = i;
        this.value = bArr;
    }

    @Override // java.lang.Object
    public XMSSNode clone() {
        return new XMSSNode(getHeight(), getValue());
    }

    public int getHeight() {
        return this.height;
    }

    public byte[] getValue() {
        return C5532IiIllL.OooO00o(this.value);
    }
}
