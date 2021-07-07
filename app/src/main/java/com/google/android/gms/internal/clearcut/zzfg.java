package com.google.android.gms.internal.clearcut;

import com.p118pd.sdk.C7967oO0oOo00;
import java.nio.ByteBuffer;

public abstract class zzfg {
    public static void zzc(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                char charAt = charSequence.charAt(i);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i, (byte) charAt);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                char charAt2 = charSequence.charAt(i);
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(byteBuffer.position() + Math.max(i, (position - byteBuffer.position()) + 1));
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
        }
        if (i == length) {
            byteBuffer.position(position + i);
            return;
        }
        position += i;
        while (i < length) {
            char charAt3 = charSequence.charAt(i);
            if (charAt3 < 128) {
                byteBuffer.put(position, (byte) charAt3);
            } else if (charAt3 < 2048) {
                int i2 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt3 >>> 6) | 192));
                    byteBuffer.put(i2, (byte) ((charAt3 & '?') | 128));
                    position = i2;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i2;
                    char charAt22 = charSequence.charAt(i);
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Failed writing ");
                    sb2.append(charAt22);
                    sb2.append(" at index ");
                    sb2.append(byteBuffer.position() + Math.max(i, (position - byteBuffer.position()) + 1));
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
            } else if (charAt3 < 55296 || 57343 < charAt3) {
                int i3 = position + 1;
                byteBuffer.put(position, (byte) ((charAt3 >>> '\f') | C7967oO0oOo00.Ooooo0o));
                position = i3 + 1;
                byteBuffer.put(i3, (byte) (((charAt3 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt3 & '?') | 128));
            } else {
                int i4 = i + 1;
                if (i4 != length) {
                    try {
                        char charAt4 = charSequence.charAt(i4);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            int i5 = position + 1;
                            try {
                                byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                int i6 = i5 + 1;
                                byteBuffer.put(i5, (byte) (((codePoint >>> 12) & 63) | 128));
                                int i7 = i6 + 1;
                                byteBuffer.put(i6, (byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put(i7, (byte) ((codePoint & 63) | 128));
                                position = i7;
                                i = i4;
                            } catch (IndexOutOfBoundsException unused3) {
                                position = i5;
                                i = i4;
                                char charAt222 = charSequence.charAt(i);
                                StringBuilder sb22 = new StringBuilder(37);
                                sb22.append("Failed writing ");
                                sb22.append(charAt222);
                                sb22.append(" at index ");
                                sb22.append(byteBuffer.position() + Math.max(i, (position - byteBuffer.position()) + 1));
                                throw new ArrayIndexOutOfBoundsException(sb22.toString());
                            }
                        } else {
                            i = i4;
                        }
                    } catch (IndexOutOfBoundsException unused4) {
                        i = i4;
                        char charAt2222 = charSequence.charAt(i);
                        StringBuilder sb222 = new StringBuilder(37);
                        sb222.append("Failed writing ");
                        sb222.append(charAt2222);
                        sb222.append(" at index ");
                        sb222.append(byteBuffer.position() + Math.max(i, (position - byteBuffer.position()) + 1));
                        throw new ArrayIndexOutOfBoundsException(sb222.toString());
                    }
                }
                throw new zzfi(i, length);
            }
            i++;
            position++;
        }
        byteBuffer.position(position);
    }

    public abstract int zzb(int i, byte[] bArr, int i2, int i3);

    public abstract int zzb(CharSequence charSequence, byte[] bArr, int i, int i2);

    public abstract void zzb(CharSequence charSequence, ByteBuffer byteBuffer);

    public final boolean zze(byte[] bArr, int i, int i2) {
        return zzb(0, bArr, i, i2) == 0;
    }
}
