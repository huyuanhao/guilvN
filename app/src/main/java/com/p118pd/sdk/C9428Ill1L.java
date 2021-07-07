package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.丨Ill1L  reason: invalid class name and case insensitive filesystem */
public class C9428Ill1L extends BufferedReader {
    public static final String o0ooOOo = "-----BEGIN ";
    public static final String o0ooOoO = "-----END ";

    public C9428Ill1L(Reader reader) {
        super(reader);
    }

    private C11L1L OooO00o(String str) throws IOException {
        String readLine;
        String str2 = o0ooOoO + str;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (true) {
            readLine = readLine();
            if (readLine == null) {
                break;
            } else if (readLine.indexOf(Constants.COLON_SEPARATOR) >= 0) {
                int indexOf = readLine.indexOf(58);
                arrayList.add(new i11I1(readLine.substring(0, indexOf), readLine.substring(indexOf + 1).trim()));
            } else if (readLine.indexOf(str2) != -1) {
                break;
            } else {
                stringBuffer.append(readLine.trim());
            }
        }
        if (readLine != null) {
            return new C11L1L(str, arrayList, C6808lllI.OooO00o(stringBuffer.toString()));
        }
        throw new IOException(str2 + " not found");
    }

    public C11L1L OooO00o() throws IOException {
        String readLine;
        do {
            readLine = readLine();
            if (readLine == null) {
                break;
            }
        } while (!readLine.startsWith(o0ooOOo));
        if (readLine == null) {
            return null;
        }
        String substring = readLine.substring(11);
        int indexOf = substring.indexOf(45);
        String substring2 = substring.substring(0, indexOf);
        if (indexOf > 0) {
            return OooO00o(substring2);
        }
        return null;
    }
}
