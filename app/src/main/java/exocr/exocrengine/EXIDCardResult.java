package exocr.exocrengine;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public final class EXIDCardResult implements Parcelable {
    public static final Parcelable.Creator<EXIDCardResult> CREATOR = new Parcelable.Creator<EXIDCardResult>() {
        /* class exocr.exocrengine.EXIDCardResult.C47211 */

        /* renamed from: OooO00o */
        public EXIDCardResult createFromParcel(Parcel parcel) {
            return new EXIDCardResult(parcel);
        }

        /* renamed from: OooO00o */
        public EXIDCardResult[] newArray(int i) {
            return new EXIDCardResult[i];
        }
    };
    public static boolean OooO0O0;
    public Bitmap OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Rect f23694OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Bitmap f23695OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Rect f23696OooO0O0;
    public Bitmap OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public Rect f23697OooO0OO;
    public Rect OooO0Oo;
    public Rect OooO0o;
    public Rect OooO0o0;
    public Rect OooO0oO;
    public Rect OooO0oo;
    public String o000000;
    public String o000OOo;
    public int o00oO0O;
    public String o0O0O00;
    public String o0OO00O;
    public String o0OOO0o;
    public String o0Oo0oo;
    public int o0ooOO0;
    public int o0ooOOo;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public String f23698o0ooOOo;
    public String o0ooOoO;
    public String oo0o0Oo;

    public Bitmap OooO() {
        Rect rect;
        Bitmap bitmap = this.OooO0OO;
        if (!(bitmap == null || (rect = this.f23697OooO0OO) == null)) {
            try {
                return Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), this.f23697OooO0OO.height());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Bitmap OooO00o() {
        Rect rect;
        Bitmap bitmap = this.OooO0OO;
        if (!(bitmap == null || (rect = this.OooO0o0) == null)) {
            try {
                return Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), this.OooO0o0.height());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Bitmap OooO0O0() {
        Rect rect;
        Bitmap bitmap = this.OooO0OO;
        if (!(bitmap == null || (rect = this.OooO0o) == null)) {
            try {
                return Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), this.OooO0o.height());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Bitmap OooO0OO() {
        Rect rect;
        Bitmap bitmap = this.OooO0OO;
        if (!(bitmap == null || (rect = this.f23694OooO00o) == null)) {
            try {
                return Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), this.f23694OooO00o.height());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Bitmap OooO0Oo() {
        Rect rect;
        Bitmap bitmap = this.OooO0OO;
        if (!(bitmap == null || (rect = this.f23696OooO0O0) == null)) {
            try {
                return Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), this.f23696OooO0O0.height());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Bitmap OooO0o() {
        Rect rect;
        Bitmap bitmap = this.OooO0OO;
        if (!(bitmap == null || (rect = this.OooO0oO) == null)) {
            try {
                return Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), this.OooO0oO.height());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Bitmap OooO0o0() {
        Rect rect;
        Bitmap bitmap = this.OooO0OO;
        if (!(bitmap == null || (rect = this.OooO0Oo) == null)) {
            try {
                return Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), this.OooO0Oo.height());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Bitmap OooO0oO() {
        if (!(this.OooO0OO == null || this.f23694OooO00o == null)) {
            Rect rect = new Rect();
            Rect rect2 = this.f23694OooO00o;
            int i = rect2.bottom;
            int i2 = rect2.top;
            int i3 = (i - i2) / 2;
            rect.set(rect2.left - i3, i2 - i3, rect2.right + i3, i + i3);
            try {
                if (rect.right > this.OooO0OO.getWidth() || rect.left < 0 || rect.top < 0 || rect.bottom > this.OooO0OO.getHeight()) {
                    return Bitmap.createBitmap(this.OooO0OO, this.f23694OooO00o.left, this.f23694OooO00o.top, this.f23694OooO00o.width(), this.f23694OooO00o.height());
                }
                return Bitmap.createBitmap(this.OooO0OO, rect.left, rect.top, rect.width(), rect.height());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Bitmap OooO0oo() {
        if (!(this.OooO0OO == null || this.f23696OooO0O0 == null)) {
            Rect rect = new Rect();
            Rect rect2 = this.f23696OooO0O0;
            int i = rect2.bottom;
            int i2 = rect2.top;
            int i3 = (i - i2) / 2;
            rect.set(rect2.left - i3, i2 - i3, rect2.right + i3, i + i3);
            try {
                if (rect.right > this.OooO0OO.getWidth() || rect.left < 0 || rect.top < 0 || rect.bottom > this.f23697OooO0OO.top) {
                    return Bitmap.createBitmap(this.OooO0OO, this.f23696OooO0O0.left, this.f23696OooO0O0.top, this.f23696OooO0O0.width(), this.f23696OooO0O0.height());
                }
                Bitmap createBitmap = Bitmap.createBitmap(this.OooO0OO, rect.left, rect.top, rect.width(), rect.height());
                Log.i("TAG", rect.left + "+" + rect.right + "+" + rect.top + "+" + rect.width());
                return createBitmap;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Bitmap OooOO0() {
        Rect rect;
        Bitmap bitmap = this.OooO0OO;
        if (!(bitmap == null || (rect = this.OooO0oo) == null)) {
            try {
                return Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), this.OooO0oo.height());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.o0OOO0o + "\t" + this.o0Oo0oo + "\t" + this.oo0o0Oo + "\t" + this.o0O0O00 + "\n" + this.o0OO00O + "\t" + this.o0ooOoO + "\n" + this.o000OOo + "\t" + this.o000000;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.o0ooOO0);
        parcel.writeString(this.o0ooOoO);
        parcel.writeString(this.o0O0O00);
        parcel.writeString(this.o0OOO0o);
        parcel.writeString(this.o0Oo0oo);
        parcel.writeString(this.o0OO00O);
        parcel.writeString(this.oo0o0Oo);
        parcel.writeString(this.o000OOo);
        parcel.writeString(this.o000000);
        parcel.writeInt(this.o0ooOOo);
    }

    public EXIDCardResult() {
        this.OooO00o = null;
        this.f23695OooO0O0 = null;
        this.o0ooOO0 = 0;
        this.f23698o0ooOOo = "Preview";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r12[r8] == 32) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static exocr.exocrengine.EXIDCardResult OooO00o(byte[] r12, int r13) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: exocr.exocrengine.EXIDCardResult.OooO00o(byte[], int):exocr.exocrengine.EXIDCardResult");
    }

    public void OooO0O0(int i) {
        this.o0ooOOo = i;
    }

    public EXIDCardResult(Parcel parcel) {
        this.OooO00o = null;
        this.f23695OooO0O0 = null;
        this.o0ooOO0 = parcel.readInt();
        this.o0ooOoO = parcel.readString();
        this.o0O0O00 = parcel.readString();
        this.o0OOO0o = parcel.readString();
        this.o0Oo0oo = parcel.readString();
        this.o0OO00O = parcel.readString();
        this.oo0o0Oo = parcel.readString();
        this.o000OOo = parcel.readString();
        this.o000000 = parcel.readString();
        this.o0ooOOo = parcel.readInt();
    }

    public void OooO00o(int[] iArr) {
        int i = this.o0ooOO0;
        if (i == 1) {
            this.f23694OooO00o = new Rect(iArr[0], iArr[1], iArr[2], iArr[3]);
            this.f23696OooO0O0 = new Rect(iArr[4], iArr[5], iArr[6], iArr[7]);
            this.f23697OooO0OO = new Rect(iArr[8], iArr[9], iArr[10], iArr[11]);
            this.OooO0Oo = new Rect(iArr[12], iArr[13], iArr[14], iArr[15]);
            this.OooO0o0 = new Rect(iArr[16], iArr[17], iArr[18], iArr[19]);
            this.OooO0o = new Rect(iArr[20], iArr[21], iArr[22], iArr[23]);
        } else if (i == 2) {
            this.OooO0oO = new Rect(iArr[0], iArr[1], iArr[2], iArr[3]);
            this.OooO0oo = new Rect(iArr[4], iArr[5], iArr[6], iArr[7]);
        }
    }

    public void OooO00o(String str) {
        this.f23698o0ooOOo = str;
    }

    public void OooO00o(int i) {
        this.o00oO0O = i;
    }

    public void OooO00o(Bitmap bitmap, Bitmap bitmap2) {
        if (this.OooO00o != null) {
            this.OooO00o = null;
        }
        this.OooO00o = bitmap;
        if (this.OooO0OO != null) {
            this.OooO0OO = null;
        }
        this.OooO0OO = bitmap2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m22030OooO00o() {
        String str;
        String str2 = "\nVeiwType = " + this.f23698o0ooOOo;
        if (this.o00oO0O == 1) {
            str = str2 + "  类型:  彩色";
        } else {
            str = str2 + "  类型:  扫描";
        }
        int i = this.o0ooOO0;
        if (i == 1) {
            return ((((str + "\nname:" + this.o0OOO0o) + "\nnumber:" + this.o0ooOoO) + "\nsex:" + this.o0Oo0oo) + "\nnation:" + this.oo0o0Oo) + "\naddress:" + this.o0OO00O;
        } else if (i != 2) {
            return str;
        } else {
            return (str + "\noffice:" + this.o000OOo) + "\nValDate:" + this.o000000;
        }
    }
}
