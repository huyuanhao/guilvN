package exocr.bankcard;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

public final class EXBankCardInfo implements Parcelable {
    public static final Parcelable.Creator<EXBankCardInfo> CREATOR = new Parcelable.Creator<EXBankCardInfo>() {
        /* class exocr.bankcard.EXBankCardInfo.C47151 */

        /* renamed from: OooO00o */
        public EXBankCardInfo createFromParcel(Parcel parcel) {
            return new EXBankCardInfo(parcel);
        }

        /* renamed from: OooO00o */
        public EXBankCardInfo[] newArray(int i) {
            return new EXBankCardInfo[i];
        }
    };
    public static boolean OooO0O0 = true;
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bitmap f23661OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public char[] f23662OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Rect[] f23663OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f23664OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Bitmap f23665OooO0O0;
    public float OooO0Oo;
    public int o00oO0O;
    public String o0OO00O;
    public int o0OOO0o;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public String f23666o0OOO0o;
    public int o0Oo0oo;

    /* renamed from: o0Oo0oo  reason: collision with other field name */
    public String f23667o0Oo0oo;
    public int o0ooOO0;
    public int o0ooOOo;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public String f23668o0ooOOo;
    public int o0ooOoO;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public String f23669o0ooOoO;
    public String oo0o0Oo;

    public String OooO00o() {
        return ("CardNumber:" + this.f23669o0ooOoO) + "\nRecoTime=" + (this.f23664OooO0O0 - this.OooO00o);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f23668o0ooOOo + "\n" + this.f23666o0OOO0o + "\n" + this.f23667o0Oo0oo + "\n" + this.o0OO00O + "\n" + this.f23669o0ooOoO;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.o0ooOO0);
        parcel.writeInt(this.o0ooOOo);
        parcel.writeInt(this.o00oO0O);
        parcel.writeCharArray(this.f23662OooO00o);
        for (int i2 = 0; i2 < this.o00oO0O; i2++) {
            parcel.writeInt(this.f23663OooO00o[i2].left);
            parcel.writeInt(this.f23663OooO00o[i2].top);
            parcel.writeInt(this.f23663OooO00o[i2].right);
            parcel.writeInt(this.f23663OooO00o[i2].bottom);
        }
        parcel.writeString(this.f23669o0ooOoO);
        parcel.writeString(this.f23668o0ooOOo);
        parcel.writeString(this.f23666o0OOO0o);
        parcel.writeString(this.f23667o0Oo0oo);
        parcel.writeString(this.o0OO00O);
        parcel.writeString(this.oo0o0Oo);
    }

    public EXBankCardInfo() {
        this.f23662OooO00o = new char[32];
        this.f23663OooO00o = new Rect[32];
        this.o00oO0O = 0;
        this.f23661OooO00o = null;
        this.f23665OooO0O0 = null;
        this.f23668o0ooOOo = null;
        this.OooO0Oo = 0.0f;
        this.f23666o0OOO0o = null;
        this.f23667o0Oo0oo = null;
        this.o0OO00O = null;
        this.o0ooOO0 = 0;
        this.o0ooOOo = 0;
        this.o0ooOoO = 0;
        this.o0OOO0o = 0;
        this.o0Oo0oo = 0;
        this.oo0o0Oo = UUID.randomUUID().toString();
    }

    public EXBankCardInfo(Parcel parcel) {
        this.f23662OooO00o = new char[32];
        this.f23663OooO00o = new Rect[32];
        this.o00oO0O = 0;
        this.f23661OooO00o = null;
        this.f23665OooO0O0 = null;
        this.f23668o0ooOOo = null;
        this.OooO0Oo = 0.0f;
        this.f23666o0OOO0o = null;
        this.f23667o0Oo0oo = null;
        this.o0OO00O = null;
        this.o0ooOO0 = 0;
        this.o0ooOOo = 0;
        this.o0ooOoO = 0;
        this.o0OOO0o = 0;
        this.o0Oo0oo = 0;
        this.o0ooOO0 = parcel.readInt();
        this.o0ooOOo = parcel.readInt();
        this.o00oO0O = parcel.readInt();
        parcel.readCharArray(this.f23662OooO00o);
        for (int i = 0; i < this.o00oO0O; i++) {
            this.f23663OooO00o[i] = new Rect(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
        this.f23669o0ooOoO = parcel.readString();
        this.f23668o0ooOOo = parcel.readString();
        this.f23666o0OOO0o = parcel.readString();
        this.f23667o0Oo0oo = parcel.readString();
        this.o0OO00O = parcel.readString();
        this.oo0o0Oo = parcel.readString();
    }
}
