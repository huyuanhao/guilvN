package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

@ShowFirstParty
@KeepForSdk
@SafeParcelable.Class(creator = "BitmapTeleporterCreator")
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new zaa();
    @SafeParcelable.Field(mo10865id = 3)
    public final int mType;
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int zale;
    @SafeParcelable.Field(mo10865id = 2)
    public ParcelFileDescriptor zalf;
    public Bitmap zalg;
    public boolean zalh;
    public File zali;

    @SafeParcelable.Constructor
    public BitmapTeleporter(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(mo10868id = 3) int i2) {
        this.zale = i;
        this.zalf = parcelFileDescriptor;
        this.mType = i2;
        this.zalg = null;
        this.zalh = false;
    }

    public static void zaa(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private final FileOutputStream zabz() {
        File file = this.zali;
        if (file != null) {
            try {
                File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    this.zalf = ParcelFileDescriptor.open(createTempFile, CommonNetImpl.FLAG_AUTH);
                    createTempFile.delete();
                    return fileOutputStream;
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e) {
                throw new IllegalStateException("Could not create temporary file", e);
            }
        } else {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
    }

    @KeepForSdk
    public Bitmap get() {
        if (!this.zalh) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zalf));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                Bitmap.Config valueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                dataInputStream.read(bArr);
                zaa(dataInputStream);
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                createBitmap.copyPixelsFromBuffer(wrap);
                this.zalg = createBitmap;
                this.zalh = true;
            } catch (IOException e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                zaa(dataInputStream);
                throw th;
            }
        }
        return this.zalg;
    }

    @KeepForSdk
    public void release() {
        if (!this.zalh) {
            try {
                this.zalf.close();
            } catch (IOException unused) {
            }
        }
    }

    @KeepForSdk
    public void setTempDir(File file) {
        if (file != null) {
            this.zali = file;
            return;
        }
        throw new NullPointerException("Cannot set null temp directory");
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.zalf == null) {
            Bitmap bitmap = this.zalg;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(zabz()));
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                zaa(dataOutputStream);
            } catch (IOException e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                zaa(dataOutputStream);
                throw th;
            }
        }
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zale);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zalf, i | 1, false);
        SafeParcelWriter.writeInt(parcel, 3, this.mType);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        this.zalf = null;
    }

    @KeepForSdk
    public BitmapTeleporter(Bitmap bitmap) {
        this.zale = 1;
        this.zalf = null;
        this.mType = 0;
        this.zalg = bitmap;
        this.zalh = true;
    }
}
