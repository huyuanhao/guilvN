package org.bouncycastle.pqc.crypto.xmss;

import com.p118pd.sdk.C5558Il1l;
import com.p118pd.sdk.C9694lL1;
import com.p118pd.sdk.I1111L;
import com.p118pd.sdk.LIii1i1;
import com.p118pd.sdk.iL1iI1L;
import java.io.Serializable;
import java.util.Stack;

public class BDSTreeHash implements Serializable {
    public static final long serialVersionUID = 1;
    public boolean finished = false;
    public int height;
    public final int initialHeight;
    public boolean initialized = false;
    public int nextIndex;
    public XMSSNode tailNode;

    public BDSTreeHash(int i) {
        this.initialHeight = i;
    }

    public int getHeight() {
        if (!this.initialized || this.finished) {
            return Integer.MAX_VALUE;
        }
        return this.height;
    }

    public int getIndexLeaf() {
        return this.nextIndex;
    }

    public XMSSNode getTailNode() {
        return this.tailNode.clone();
    }

    public void initialize(int i) {
        this.tailNode = null;
        this.height = this.initialHeight;
        this.nextIndex = i;
        this.initialized = true;
        this.finished = false;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public void setNode(XMSSNode xMSSNode) {
        this.tailNode = xMSSNode;
        int height2 = xMSSNode.getHeight();
        this.height = height2;
        if (height2 == this.initialHeight) {
            this.finished = true;
        }
    }

    public void update(Stack<XMSSNode> stack, C5558Il1l r6, byte[] bArr, byte[] bArr2, iL1iI1L il1ii1l) {
        if (il1ii1l == null) {
            throw new NullPointerException("otsHashAddress == null");
        } else if (this.finished || !this.initialized) {
            throw new IllegalStateException("finished or not initialized");
        } else {
            iL1iI1L il1ii1l2 = (iL1iI1L) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) new iL1iI1L.OooO0O0().OooO0O0(il1ii1l.OooO0O0())).OooO00o(il1ii1l.m15365OooO00o())).OooO0OO(this.nextIndex).OooO00o(il1ii1l.OooO0Oo()).OooO0O0(il1ii1l.OooO0o0()).OooO00o(il1ii1l.OooO00o())).OooO00o();
            I1111L r1 = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) new I1111L.OooO0O0().OooO0O0(il1ii1l2.OooO0O0())).OooO00o(il1ii1l2.m15365OooO00o())).OooO0O0(this.nextIndex).m15212OooO00o();
            r6.OooO00o(r6.m15841OooO00o(bArr2, il1ii1l2), bArr);
            XMSSNode OooO00o = LIii1i1.OooO00o(r6, r6.OooO00o(il1ii1l2), (C9694lL1) ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) new C9694lL1.OooO0O0().OooO0O0(il1ii1l2.OooO0O0())).OooO00o(il1ii1l2.m15365OooO00o())).OooO00o(this.nextIndex).OooO00o());
            while (!stack.isEmpty() && stack.peek().getHeight() == OooO00o.getHeight() && stack.peek().getHeight() != this.initialHeight) {
                I1111L r8 = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) ((I1111L.OooO0O0) new I1111L.OooO0O0().OooO0O0(r1.OooO0O0())).OooO00o(r1.m15365OooO00o())).OooO00o(r1.OooO0o0()).OooO0O0((r1.OooO0o() - 1) / 2).OooO00o(r1.OooO00o())).m15212OooO00o();
                XMSSNode OooO00o2 = LIii1i1.OooO00o(r6, stack.pop(), OooO00o, r8);
                XMSSNode xMSSNode = new XMSSNode(OooO00o2.getHeight() + 1, OooO00o2.getValue());
                r1 = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) ((I1111L.OooO0O0) new I1111L.OooO0O0().OooO0O0(r8.OooO0O0())).OooO00o(r8.m15365OooO00o())).OooO00o(r8.OooO0o0() + 1).OooO0O0(r8.OooO0o()).OooO00o(r8.OooO00o())).m15212OooO00o();
                OooO00o = xMSSNode;
            }
            XMSSNode xMSSNode2 = this.tailNode;
            if (xMSSNode2 == null) {
                this.tailNode = OooO00o;
            } else if (xMSSNode2.getHeight() == OooO00o.getHeight()) {
                I1111L r5 = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) ((I1111L.OooO0O0) new I1111L.OooO0O0().OooO0O0(r1.OooO0O0())).OooO00o(r1.m15365OooO00o())).OooO00o(r1.OooO0o0()).OooO0O0((r1.OooO0o() - 1) / 2).OooO00o(r1.OooO00o())).m15212OooO00o();
                OooO00o = new XMSSNode(this.tailNode.getHeight() + 1, LIii1i1.OooO00o(r6, this.tailNode, OooO00o, r5).getValue());
                this.tailNode = OooO00o;
                I1111L r52 = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) ((I1111L.OooO0O0) new I1111L.OooO0O0().OooO0O0(r5.OooO0O0())).OooO00o(r5.m15365OooO00o())).OooO00o(r5.OooO0o0() + 1).OooO0O0(r5.OooO0o()).OooO00o(r5.OooO00o())).m15212OooO00o();
            } else {
                stack.push(OooO00o);
            }
            if (this.tailNode.getHeight() == this.initialHeight) {
                this.finished = true;
                return;
            }
            this.height = OooO00o.getHeight();
            this.nextIndex++;
        }
    }
}
