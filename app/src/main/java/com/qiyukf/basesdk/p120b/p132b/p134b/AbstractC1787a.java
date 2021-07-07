package com.qiyukf.basesdk.p120b.p132b.p134b;

import com.qiyukf.basesdk.p120b.p132b.p135c.C1791a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.basesdk.b.b.b.a */
public abstract class AbstractC1787a extends C1791a {

    /* renamed from: b */
    public ByteBuffer f3302b;

    /* renamed from: b */
    private void m3331b(ByteBuffer byteBuffer, List<Object> list) {
        while (byteBuffer.remaining() > 0) {
            try {
                int size = list.size();
                int remaining = byteBuffer.remaining();
                mo34042a(byteBuffer, list);
                if (size == list.size()) {
                    if (remaining == byteBuffer.remaining()) {
                        return;
                    }
                } else if (remaining == byteBuffer.remaining()) {
                    throw new C1788b(getClass().getSimpleName() + ".decode() did not read anything but decoded a message.");
                }
            } catch (C1788b e) {
                throw e;
            } catch (Throwable th) {
                throw new C1788b(th);
            }
        }
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.C1791a, com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1794d
    /* renamed from: a */
    public final void mo34039a(Object obj) {
        if (obj instanceof ByteBuffer) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            try {
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                byteBuffer.flip();
                if (this.f3302b == null) {
                    this.f3302b = byteBuffer;
                } else {
                    if (this.f3302b.capacity() - this.f3302b.limit() < byteBuffer.remaining()) {
                        int remaining = byteBuffer.remaining();
                        ByteBuffer byteBuffer2 = this.f3302b;
                        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer2.remaining() + remaining);
                        this.f3302b = allocate;
                        allocate.put(byteBuffer2);
                        this.f3302b.flip();
                    }
                    this.f3302b.position(this.f3302b.limit()).limit(this.f3302b.capacity());
                    this.f3302b.put(byteBuffer);
                    this.f3302b.flip();
                }
                m3331b(this.f3302b, arrayList);
                ByteBuffer byteBuffer3 = this.f3302b;
                if (byteBuffer3 != null && byteBuffer3.remaining() <= 0) {
                    this.f3302b = null;
                }
                int size = arrayList.size();
                while (i < size) {
                    super.mo34039a(arrayList.get(i));
                    i++;
                }
            } catch (C1788b e) {
                throw e;
            } catch (Throwable th) {
                ByteBuffer byteBuffer4 = this.f3302b;
                if (byteBuffer4 != null && byteBuffer4.remaining() <= 0) {
                    this.f3302b = null;
                }
                int size2 = arrayList.size();
                while (i < size2) {
                    super.mo34039a(arrayList.get(i));
                    i++;
                }
                throw th;
            }
        } else {
            super.mo34039a(obj);
        }
    }

    /* renamed from: a */
    public abstract void mo34042a(ByteBuffer byteBuffer, List<Object> list);

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.C1791a, com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1794d
    /* renamed from: h */
    public void mo34040h() {
        ByteBuffer allocate;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        try {
            if (this.f3302b != null) {
                m3331b(this.f3302b, arrayList);
                allocate = this.f3302b;
            } else {
                allocate = ByteBuffer.allocate(0);
            }
            mo34042a(allocate, arrayList);
            if (this.f3302b != null) {
                this.f3302b = null;
            }
            int size = arrayList.size();
            while (i < size) {
                super.mo34039a(arrayList.get(i));
                i++;
            }
            super.mo34040h();
        } catch (C1788b e) {
            throw e;
        } catch (Exception e2) {
            throw new C1788b(e2);
        } catch (Throwable th) {
            if (this.f3302b != null) {
                this.f3302b = null;
            }
            int size2 = arrayList.size();
            while (i < size2) {
                super.mo34039a(arrayList.get(i));
                i++;
            }
            super.mo34040h();
            throw th;
        }
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.C1791a, com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1794d
    /* renamed from: i */
    public final void mo34041i() {
        super.mo34041i();
    }
}
