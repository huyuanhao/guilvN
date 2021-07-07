package com.p118pd.sdk;

import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oo0oo0OO  reason: case insensitive filesystem */
public class C8757oo0oo0OO {
    public final List<C8758oo0oo0Oo> OooO00o = new ArrayList();

    public final List<C8758oo0oo0Oo> OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(C8758oo0oo0Oo oo0oo0oo) {
        this.OooO00o.add(oo0oo0oo);
    }

    public long OooO00o(DataOutput dataOutput) throws IOException {
        long j = 24;
        for (int i = 0; i < this.OooO00o.size(); i++) {
            j += (long) (this.OooO00o.get(i).m20399OooO00o().length + 12);
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putLong(j);
        allocate.flip();
        dataOutput.write(allocate.array());
        for (int i2 = 0; i2 < this.OooO00o.size(); i2++) {
            C8758oo0oo0Oo oo0oo0oo = this.OooO00o.get(i2);
            byte[] OooO00o2 = oo0oo0oo.m20399OooO00o();
            ByteBuffer allocate2 = ByteBuffer.allocate(8);
            allocate2.order(ByteOrder.LITTLE_ENDIAN);
            allocate2.putLong((long) (OooO00o2.length + 4));
            allocate2.flip();
            dataOutput.write(allocate2.array());
            ByteBuffer allocate3 = ByteBuffer.allocate(4);
            allocate3.order(ByteOrder.LITTLE_ENDIAN);
            allocate3.putInt(oo0oo0oo.OooO00o());
            allocate3.flip();
            dataOutput.write(allocate3.array());
            dataOutput.write(OooO00o2);
        }
        ByteBuffer allocate4 = ByteBuffer.allocate(8);
        allocate4.order(ByteOrder.LITTLE_ENDIAN);
        allocate4.putLong(j);
        allocate4.flip();
        dataOutput.write(allocate4.array());
        ByteBuffer allocate5 = ByteBuffer.allocate(8);
        allocate5.order(ByteOrder.LITTLE_ENDIAN);
        allocate5.putLong(C8765oo0ooO00.f21943OooO0O0);
        allocate5.flip();
        dataOutput.write(allocate5.array());
        ByteBuffer allocate6 = ByteBuffer.allocate(8);
        allocate6.order(ByteOrder.LITTLE_ENDIAN);
        allocate6.putLong(C8765oo0ooO00.f21941OooO00o);
        allocate6.flip();
        dataOutput.write(allocate6.array());
        return j;
    }
}
