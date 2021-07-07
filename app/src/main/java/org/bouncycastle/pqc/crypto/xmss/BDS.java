package org.bouncycastle.pqc.crypto.xmss;

import com.p118pd.sdk.C5532IiIllL;
import com.p118pd.sdk.C5558Il1l;
import com.p118pd.sdk.C6880lli;
import com.p118pd.sdk.C9341I1iilI1;
import com.p118pd.sdk.C9694lL1;
import com.p118pd.sdk.I1111L;
import com.p118pd.sdk.LIii1i1;
import com.p118pd.sdk.iL1iI1L;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public final class BDS implements Serializable {
    public static final long serialVersionUID = 1;
    public transient C5558Il1l OooO00o;
    public List<XMSSNode> authenticationPath;
    public int index;

    /* renamed from: k */
    public int f13504k;
    public Map<Integer, XMSSNode> keep;
    public Map<Integer, LinkedList<XMSSNode>> retain;
    public XMSSNode root;
    public Stack<XMSSNode> stack;
    public final List<BDSTreeHash> treeHashInstances;
    public final int treeHeight;
    public boolean used;

    public BDS(C5558Il1l r3, int i, int i2) {
        this.OooO00o = r3;
        this.treeHeight = i;
        this.f13504k = i2;
        if (i2 <= i && i2 >= 2) {
            int i3 = i - i2;
            if (i3 % 2 == 0) {
                this.authenticationPath = new ArrayList();
                this.retain = new TreeMap();
                this.stack = new Stack<>();
                this.treeHashInstances = new ArrayList();
                for (int i4 = 0; i4 < i3; i4++) {
                    this.treeHashInstances.add(new BDSTreeHash(i4));
                }
                this.keep = new TreeMap();
                this.index = 0;
                this.used = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    public BDS(C9341I1iilI1 r3, int i) {
        this(r3.m21385OooO00o(), r3.OooO0O0(), r3.OooO0OO());
        this.index = i;
        this.used = true;
    }

    public BDS(C9341I1iilI1 r3, byte[] bArr, byte[] bArr2, iL1iI1L il1ii1l) {
        this(r3.m21385OooO00o(), r3.OooO0O0(), r3.OooO0OO());
        OooO00o(bArr, bArr2, il1ii1l);
    }

    public BDS(C9341I1iilI1 r3, byte[] bArr, byte[] bArr2, iL1iI1L il1ii1l, int i) {
        this(r3.m21385OooO00o(), r3.OooO0O0(), r3.OooO0OO());
        OooO00o(bArr, bArr2, il1ii1l);
        while (this.index < i) {
            OooO0O0(bArr, bArr2, il1ii1l);
            this.used = false;
        }
    }

    public BDS(BDS bds, byte[] bArr, byte[] bArr2, iL1iI1L il1ii1l) {
        this.OooO00o = bds.OooO00o;
        this.treeHeight = bds.treeHeight;
        this.f13504k = bds.f13504k;
        this.root = bds.root;
        this.authenticationPath = new ArrayList(bds.authenticationPath);
        this.retain = bds.retain;
        this.stack = (Stack) bds.stack.clone();
        this.treeHashInstances = bds.treeHashInstances;
        this.keep = new TreeMap(bds.keep);
        this.index = bds.index;
        OooO0O0(bArr, bArr2, il1ii1l);
        bds.used = true;
    }

    private BDSTreeHash OooO00o() {
        BDSTreeHash bDSTreeHash = null;
        for (BDSTreeHash bDSTreeHash2 : this.treeHashInstances) {
            if (!bDSTreeHash2.isFinished() && bDSTreeHash2.isInitialized()) {
                if (bDSTreeHash == null || bDSTreeHash2.getHeight() < bDSTreeHash.getHeight() || (bDSTreeHash2.getHeight() == bDSTreeHash.getHeight() && bDSTreeHash2.getIndexLeaf() < bDSTreeHash.getIndexLeaf())) {
                    bDSTreeHash = bDSTreeHash2;
                }
            }
        }
        return bDSTreeHash;
    }

    private void OooO00o(byte[] bArr, byte[] bArr2, iL1iI1L il1ii1l) {
        if (il1ii1l != null) {
            C9694lL1 r0 = (C9694lL1) ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) new C9694lL1.OooO0O0().OooO0O0(il1ii1l.OooO0O0())).OooO00o(il1ii1l.m15365OooO00o())).OooO00o();
            I1111L r1 = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) new I1111L.OooO0O0().OooO0O0(il1ii1l.OooO0O0())).OooO00o(il1ii1l.m15365OooO00o())).m15212OooO00o();
            for (int i = 0; i < (1 << this.treeHeight); i++) {
                il1ii1l = (iL1iI1L) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) new iL1iI1L.OooO0O0().OooO0O0(il1ii1l.OooO0O0())).OooO00o(il1ii1l.m15365OooO00o())).OooO0OO(i).OooO00o(il1ii1l.OooO0Oo()).OooO0O0(il1ii1l.OooO0o0()).OooO00o(il1ii1l.OooO00o())).OooO00o();
                C5558Il1l r3 = this.OooO00o;
                r3.OooO00o(r3.m15841OooO00o(bArr2, il1ii1l), bArr);
                C6880lli OooO00o2 = this.OooO00o.OooO00o(il1ii1l);
                r0 = (C9694lL1) ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) new C9694lL1.OooO0O0().OooO0O0(r0.OooO0O0())).OooO00o(r0.m15365OooO00o())).OooO00o(i).OooO0O0(r0.OooO0o0()).OooO0OO(r0.OooO0o()).OooO00o(r0.OooO00o())).OooO00o();
                XMSSNode OooO00o3 = LIii1i1.OooO00o(this.OooO00o, OooO00o2, r0);
                r1 = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) ((I1111L.OooO0O0) new I1111L.OooO0O0().OooO0O0(r1.OooO0O0())).OooO00o(r1.m15365OooO00o())).OooO0O0(i).OooO00o(r1.OooO00o())).m15212OooO00o();
                while (!this.stack.isEmpty() && this.stack.peek().getHeight() == OooO00o3.getHeight()) {
                    int floor = (int) Math.floor((double) (i / (1 << OooO00o3.getHeight())));
                    if (floor == 1) {
                        this.authenticationPath.add(OooO00o3.clone());
                    }
                    if (floor == 3 && OooO00o3.getHeight() < this.treeHeight - this.f13504k) {
                        this.treeHashInstances.get(OooO00o3.getHeight()).setNode(OooO00o3.clone());
                    }
                    if (floor >= 3 && (floor & 1) == 1 && OooO00o3.getHeight() >= this.treeHeight - this.f13504k && OooO00o3.getHeight() <= this.treeHeight - 2) {
                        if (this.retain.get(Integer.valueOf(OooO00o3.getHeight())) == null) {
                            LinkedList<XMSSNode> linkedList = new LinkedList<>();
                            linkedList.add(OooO00o3.clone());
                            this.retain.put(Integer.valueOf(OooO00o3.getHeight()), linkedList);
                        } else {
                            this.retain.get(Integer.valueOf(OooO00o3.getHeight())).add(OooO00o3.clone());
                        }
                    }
                    I1111L r12 = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) ((I1111L.OooO0O0) new I1111L.OooO0O0().OooO0O0(r1.OooO0O0())).OooO00o(r1.m15365OooO00o())).OooO00o(r1.OooO0o0()).OooO0O0((r1.OooO0o() - 1) / 2).OooO00o(r1.OooO00o())).m15212OooO00o();
                    XMSSNode OooO00o4 = LIii1i1.OooO00o(this.OooO00o, this.stack.pop(), OooO00o3, r12);
                    XMSSNode xMSSNode = new XMSSNode(OooO00o4.getHeight() + 1, OooO00o4.getValue());
                    r1 = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) ((I1111L.OooO0O0) new I1111L.OooO0O0().OooO0O0(r12.OooO0O0())).OooO00o(r12.m15365OooO00o())).OooO00o(r12.OooO0o0() + 1).OooO0O0(r12.OooO0o()).OooO00o(r12.OooO00o())).m15212OooO00o();
                    OooO00o3 = xMSSNode;
                }
                this.stack.push(OooO00o3);
            }
            this.root = this.stack.pop();
            return;
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    private void OooO0O0(byte[] bArr, byte[] bArr2, iL1iI1L il1ii1l) {
        XMSSNode xMSSNode;
        List<XMSSNode> list;
        if (il1ii1l == null) {
            throw new NullPointerException("otsHashAddress == null");
        } else if (this.used) {
            throw new IllegalStateException("index already used");
        } else if (this.index <= (1 << this.treeHeight) - 2) {
            C9694lL1 r0 = (C9694lL1) ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) new C9694lL1.OooO0O0().OooO0O0(il1ii1l.OooO0O0())).OooO00o(il1ii1l.m15365OooO00o())).OooO00o();
            I1111L r1 = (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) new I1111L.OooO0O0().OooO0O0(il1ii1l.OooO0O0())).OooO00o(il1ii1l.m15365OooO00o())).m15212OooO00o();
            int OooO00o2 = C5532IiIllL.OooO00o(this.index, this.treeHeight);
            if (((this.index >> (OooO00o2 + 1)) & 1) == 0 && OooO00o2 < this.treeHeight - 1) {
                this.keep.put(Integer.valueOf(OooO00o2), this.authenticationPath.get(OooO00o2).clone());
            }
            if (OooO00o2 == 0) {
                il1ii1l = (iL1iI1L) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) new iL1iI1L.OooO0O0().OooO0O0(il1ii1l.OooO0O0())).OooO00o(il1ii1l.m15365OooO00o())).OooO0OO(this.index).OooO00o(il1ii1l.OooO0Oo()).OooO0O0(il1ii1l.OooO0o0()).OooO00o(il1ii1l.OooO00o())).OooO00o();
                C5558Il1l r12 = this.OooO00o;
                r12.OooO00o(r12.m15841OooO00o(bArr2, il1ii1l), bArr);
                this.authenticationPath.set(0, LIii1i1.OooO00o(this.OooO00o, this.OooO00o.OooO00o(il1ii1l), (C9694lL1) ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) ((C9694lL1.OooO0O0) new C9694lL1.OooO0O0().OooO0O0(r0.OooO0O0())).OooO00o(r0.m15365OooO00o())).OooO00o(this.index).OooO0O0(r0.OooO0o0()).OooO0OO(r0.OooO0o()).OooO00o(r0.OooO00o())).OooO00o()));
            } else {
                int i = OooO00o2 - 1;
                XMSSNode OooO00o3 = LIii1i1.OooO00o(this.OooO00o, this.authenticationPath.get(i), this.keep.get(Integer.valueOf(i)), (I1111L) ((I1111L.OooO0O0) ((I1111L.OooO0O0) ((I1111L.OooO0O0) new I1111L.OooO0O0().OooO0O0(r1.OooO0O0())).OooO00o(r1.m15365OooO00o())).OooO00o(i).OooO0O0(this.index >> OooO00o2).OooO00o(r1.OooO00o())).m15212OooO00o());
                this.authenticationPath.set(OooO00o2, new XMSSNode(OooO00o3.getHeight() + 1, OooO00o3.getValue()));
                this.keep.remove(Integer.valueOf(i));
                for (int i2 = 0; i2 < OooO00o2; i2++) {
                    if (i2 < this.treeHeight - this.f13504k) {
                        list = this.authenticationPath;
                        xMSSNode = this.treeHashInstances.get(i2).getTailNode();
                    } else {
                        list = this.authenticationPath;
                        xMSSNode = this.retain.get(Integer.valueOf(i2)).removeFirst();
                    }
                    list.set(i2, xMSSNode);
                }
                int min = Math.min(OooO00o2, this.treeHeight - this.f13504k);
                for (int i3 = 0; i3 < min; i3++) {
                    int i4 = this.index + 1 + ((1 << i3) * 3);
                    if (i4 < (1 << this.treeHeight)) {
                        this.treeHashInstances.get(i3).initialize(i4);
                    }
                }
            }
            for (int i5 = 0; i5 < ((this.treeHeight - this.f13504k) >> 1); i5++) {
                BDSTreeHash OooO00o4 = OooO00o();
                if (OooO00o4 != null) {
                    OooO00o4.update(this.stack, this.OooO00o, bArr, bArr2, il1ii1l);
                }
            }
            this.index++;
        } else {
            throw new IllegalStateException("index out of bounds");
        }
    }

    public List<XMSSNode> getAuthenticationPath() {
        ArrayList arrayList = new ArrayList();
        for (XMSSNode xMSSNode : this.authenticationPath) {
            arrayList.add(xMSSNode.clone());
        }
        return arrayList;
    }

    public int getIndex() {
        return this.index;
    }

    public BDS getNextState(byte[] bArr, byte[] bArr2, iL1iI1L il1ii1l) {
        return new BDS(this, bArr, bArr2, il1ii1l);
    }

    public XMSSNode getRoot() {
        return this.root.clone();
    }

    public int getTreeHeight() {
        return this.treeHeight;
    }

    public boolean isUsed() {
        return this.used;
    }

    public void setXMSS(C9341I1iilI1 r3) {
        if (this.treeHeight == r3.OooO0O0()) {
            this.OooO00o = r3.m21385OooO00o();
            return;
        }
        throw new IllegalStateException("wrong height");
    }

    public void validate() {
        if (this.authenticationPath == null) {
            throw new IllegalStateException("authenticationPath == null");
        } else if (this.retain == null) {
            throw new IllegalStateException("retain == null");
        } else if (this.stack == null) {
            throw new IllegalStateException("stack == null");
        } else if (this.treeHashInstances == null) {
            throw new IllegalStateException("treeHashInstances == null");
        } else if (this.keep == null) {
            throw new IllegalStateException("keep == null");
        } else if (!C5532IiIllL.OooO00o(this.treeHeight, (long) this.index)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }
}
