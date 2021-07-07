package com.xiaomi.push;

import java.io.IOException;

/* renamed from: com.xiaomi.push.d */
public class C4340d extends IOException {
    public C4340d(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C4340d m12019a() {
        return new C4340d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    public static C4340d m12020b() {
        return new C4340d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    public static C4340d m12021c() {
        return new C4340d("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    public static C4340d m12022d() {
        return new C4340d("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    public static C4340d m12023e() {
        return new C4340d("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    public static C4340d m12024f() {
        return new C4340d("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    public static C4340d m12025g() {
        return new C4340d("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: h */
    public static C4340d m12026h() {
        return new C4340d("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }
}
