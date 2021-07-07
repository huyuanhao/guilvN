package com.drew.imaging.jpeg;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.Nullable;
import com.umeng.commonsdk.proguard.C3571am;
import java.util.ArrayList;
import java.util.Collection;

public enum JpegSegmentType {
    APP0(C3571am.f9205k, true),
    APP1(ExifInterface.OooOOo, true),
    APP2((byte) -30, true),
    APP3((byte) -29, true),
    APP4((byte) -28, true),
    APP5((byte) -27, true),
    APP6((byte) -26, true),
    APP7((byte) -25, true),
    APP8((byte) -24, true),
    APP9((byte) -23, true),
    APPA((byte) -22, true),
    APPB((byte) -21, true),
    APPC((byte) -20, true),
    APPD((byte) -19, true),
    APPE((byte) -18, true),
    APPF((byte) -17, true),
    SOI(ExifInterface.OooO0OO, false),
    DQT((byte) -37, false),
    DNL((byte) -36, false),
    DRI((byte) -35, false),
    DHP((byte) -34, false),
    EXP((byte) -33, false),
    DHT((byte) -60, false),
    DAC((byte) -52, false),
    SOF0(ExifInterface.OooO0Oo, true),
    SOF1(ExifInterface.OooO0o0, true),
    SOF2(ExifInterface.OooO0o, true),
    SOF3(ExifInterface.OooO0oO, true),
    SOF5(ExifInterface.OooO0oo, true),
    SOF6(ExifInterface.OooO, true),
    SOF7(ExifInterface.OooOO0, true),
    JPG((byte) -56, true),
    SOF9(ExifInterface.OooOO0O, true),
    SOF10(ExifInterface.OooOO0o, true),
    SOF11(ExifInterface.OooOOO0, true),
    SOF13(ExifInterface.OooOOO, true),
    SOF14(ExifInterface.OooOOOO, true),
    SOF15(ExifInterface.OooOOOo, true),
    COM((byte) -2, true);
    
    public static final Collection<JpegSegmentType> canContainMetadataTypes;
    public final byte byteValue;
    public final boolean canContainMetadata;

    /* access modifiers changed from: public */
    static {
        ArrayList arrayList = new ArrayList();
        JpegSegmentType[] jpegSegmentTypeArr = (JpegSegmentType[]) JpegSegmentType.class.getEnumConstants();
        for (JpegSegmentType jpegSegmentType : jpegSegmentTypeArr) {
            if (jpegSegmentType.canContainMetadata) {
                arrayList.add(jpegSegmentType);
            }
        }
        canContainMetadataTypes = arrayList;
    }

    /* access modifiers changed from: public */
    JpegSegmentType(byte b, boolean z) {
        this.byteValue = b;
        this.canContainMetadata = z;
    }

    @Nullable
    public static JpegSegmentType fromByte(byte b) {
        JpegSegmentType[] jpegSegmentTypeArr = (JpegSegmentType[]) JpegSegmentType.class.getEnumConstants();
        for (JpegSegmentType jpegSegmentType : jpegSegmentTypeArr) {
            if (jpegSegmentType.byteValue == b) {
                return jpegSegmentType;
            }
        }
        return null;
    }
}
