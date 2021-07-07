package org.bouncycastle.crypto;

import com.google.zxing.common.StringUtils;
import com.p118pd.sdk.AbstractC6385iL;
import com.p118pd.sdk.lLLL1iL;

public enum PasswordConverter implements AbstractC6385iL {
    ASCII {
        @Override // com.p118pd.sdk.AbstractC6385iL
        public byte[] convert(char[] cArr) {
            return lLLL1iL.OooO0O0(cArr);
        }

        @Override // com.p118pd.sdk.AbstractC6385iL
        public String getType() {
            return "ASCII";
        }
    },
    UTF8 {
        @Override // com.p118pd.sdk.AbstractC6385iL
        public byte[] convert(char[] cArr) {
            return lLLL1iL.OooO0OO(cArr);
        }

        @Override // com.p118pd.sdk.AbstractC6385iL
        public String getType() {
            return StringUtils.UTF8;
        }
    },
    PKCS12 {
        @Override // com.p118pd.sdk.AbstractC6385iL
        public byte[] convert(char[] cArr) {
            return lLLL1iL.OooO00o(cArr);
        }

        @Override // com.p118pd.sdk.AbstractC6385iL
        public String getType() {
            return "PKCS12";
        }
    }
}
