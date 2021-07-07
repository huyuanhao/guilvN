package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.p118pd.sdk.C7995oO0ooO0o;
import com.p118pd.sdk.C7997oO0ooOO0;
import com.p118pd.sdk.C8027oOO00oo;
import com.p118pd.sdk.C8294oOo00OoO;
import com.p118pd.sdk.C8932ooOOO0o;
import com.p118pd.sdk.oO0oO000;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExifInterface {
    public static final byte OooO = -58;

    /* renamed from: OooO  reason: collision with other field name */
    public static final String f14098OooO = "SamplesPerPixel";

    /* renamed from: OooO  reason: collision with other field name */
    public static final short f14099OooO = 2;

    /* renamed from: OooO  reason: collision with other field name */
    public static final C5044OooO0Oo[] f14100OooO;
    public static final byte OooO00o = 42;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C5044OooO0Oo f14101OooO00o = new C5044OooO0Oo(f14169OooOOOo, 273, 3);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Charset f14102OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static SimpleDateFormat f14103OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, Integer> f14104OooO00o = new HashMap<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashSet<String> f14105OooO00o = new HashSet<>(Arrays.asList(f14239OoooOOo, o00000O, f14237OoooOOO, f14302o00Ooo, o0000o0O));

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final List<Integer> f14106OooO00o = Arrays.asList(1, 6, 3, 8);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Pattern f14107OooO00o = Pattern.compile(".*[1-9].*");

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final short f14108OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f14109OooO00o = {8, 8, 8};

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C5044OooO0Oo[] f14110OooO00o = {new C5044OooO0Oo(o000o000, 254, 4), new C5044OooO0Oo(o000o00, 255, 4), new C5044OooO0Oo(f14123OooO0OO, 256, 3, 4), new C5044OooO0Oo(f14130OooO0Oo, 257, 3, 4), new C5044OooO0Oo(f14139OooO0o0, 258, 3), new C5044OooO0Oo(f14135OooO0o, 259, 3), new C5044OooO0Oo(f14143OooO0oO, 262, 3), new C5044OooO0Oo(f14195OooOoOO, 270, 2), new C5044OooO0Oo(f14199OooOoo0, 271, 2), new C5044OooO0Oo(f14197OooOoo, 272, 2), new C5044OooO0Oo(f14169OooOOOo, 273, 3, 4), new C5044OooO0Oo(f14146OooO0oo, 274, 3), new C5044OooO0Oo(f14098OooO, 277, 3), new C5044OooO0Oo(f14175OooOOo0, 278, 3, 4), new C5044OooO0Oo(f14172OooOOo, 279, 3, 4), new C5044OooO0Oo(f14163OooOOO0, 282, 5), new C5044OooO0Oo(f14160OooOOO, 283, 5), new C5044OooO0Oo(f14150OooOO0, 284, 3), new C5044OooO0Oo(f14166OooOOOO, 296, 3), new C5044OooO0Oo(f14182OooOo0, 301, 3), new C5044OooO0Oo(f14201OooOooO, 305, 2), new C5044OooO0Oo(f14191OooOoO, 306, 2), new C5044OooO0Oo(f14203OooOooo, 315, 2), new C5044OooO0Oo(f14187OooOo0O, oO0oO000.Oooo0, 5), new C5044OooO0Oo(f14189OooOo0o, oO0oO000.Oooo0O0, 5), new C5044OooO0Oo(o000o0O0, 330, 4), new C5044OooO0Oo(f14178OooOOoo, 513, 4), new C5044OooO0Oo(f14185OooOo00, 514, 4), new C5044OooO0Oo(f14180OooOo, 529, 5), new C5044OooO0Oo(f14154OooOO0O, 530, 3), new C5044OooO0Oo(f14157OooOO0o, 531, 3), new C5044OooO0Oo(f14193OooOoO0, 532, 5), new C5044OooO0Oo(f14209Oooo000, oO0oO000.ooOO, 2), new C5044OooO0Oo(o000o00O, 34665, 4), new C5044OooO0Oo(o000o00o, 34853, 4), new C5044OooO0Oo(o000Ooo0, 4, 4), new C5044OooO0Oo(o000OoOO, 5, 4), new C5044OooO0Oo(o000Oo, 6, 4), new C5044OooO0Oo(o000OoOo, 7, 4), new C5044OooO0Oo(o000OooO, 23, 3), new C5044OooO0Oo(o000Oooo, 46, 7)};

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String[] f14111OooO00o = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C5044OooO0Oo[][] f14112OooO00o;
    public static final byte OooO0O0 = -1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final C5044OooO0Oo f14113OooO0O0 = new C5044OooO0Oo(f14178OooOOoo, 513, 4);

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f14114OooO0O0 = "ExifInterface";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final List<Integer> f14115OooO0O0 = Arrays.asList(2, 7, 4, 5);

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Pattern f14116OooO0O0 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final short f14117OooO0O0 = 2;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final byte[] f14118OooO0O0 = {-1, OooO0OO, -1};

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f14119OooO0O0 = {4};

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final C5044OooO0Oo[] f14120OooO0O0 = {new C5044OooO0Oo(f14237OoooOOO, oO0oO000.o00O0O, 5), new C5044OooO0Oo(f14239OoooOOo, oO0oO000.o00Oo0, 5), new C5044OooO0Oo(f14241OoooOo0, oO0oO000.o00ooo, 3), new C5044OooO0Oo(f14243OoooOoO, oO0oO000.oo000o, 2), new C5044OooO0Oo(f14247Ooooo00, oO0oO000.o00oO0o, 3), new C5044OooO0Oo(f14249Ooooo0o, oO0oO000.o00oO0O, 7), new C5044OooO0Oo(f14211Oooo00O, 36864, 2), new C5044OooO0Oo(f14229OoooO0, oO0oO000.o000000, 2), new C5044OooO0Oo(f14233OoooO0O, oO0oO000.o000000O, 2), new C5044OooO0Oo(f14219Oooo0o, oO0oO000.o000000o, 7), new C5044OooO0Oo(f14223Oooo0oO, oO0oO000.o00000, 5), new C5044OooO0Oo(f14263Ooooooo, oO0oO000.o00000O0, 10), new C5044OooO0Oo(f14319o0OoOo0, oO0oO000.o00000O, 5), new C5044OooO0Oo(f14331ooOO, oO0oO000.o00000OO, 10), new C5044OooO0Oo(f14298o00O0O, oO0oO000.o00000Oo, 10), new C5044OooO0Oo(f14300o00Oo0, oO0oO000.o00000o0, 5), new C5044OooO0Oo(f14302o00Ooo, oO0oO000.o0000Ooo, 5), new C5044OooO0Oo(f14304o00o0O, oO0oO000.o00000oO, 3), new C5044OooO0Oo(f14310o00ooo, 37384, 3), new C5044OooO0Oo(f14327oo000o, oO0oO000.o0000O00, 3), new C5044OooO0Oo(f14306o00oO0O, oO0oO000.o0000oo, 5), new C5044OooO0Oo(f14308o00oO0o, oO0oO000.o0000OOo, 3), new C5044OooO0Oo(f14225Oooo0oo, oO0oO000.o0000OoO, 7), new C5044OooO0Oo(f14205Oooo, oO0oO000.o0000o0, 7), new C5044OooO0Oo(f14227OoooO, oO0oO000.o0000o0O, 2), new C5044OooO0Oo(f14235OoooOO0, oO0oO000.o0000o0o, 2), new C5044OooO0Oo(f14296o000oOoO, oO0oO000.o0000o, 2), new C5044OooO0Oo(f14213Oooo00o, oO0oO000.o000, 7), new C5044OooO0Oo(f14207Oooo0, 40961, 3), new C5044OooO0Oo(f14217Oooo0OO, oO0oO000.o000OoO, 3, 4), new C5044OooO0Oo(f14221Oooo0o0, oO0oO000.o000O0o, 3, 4), new C5044OooO0Oo(f14231OoooO00, oO0oO000.o000Ooo, 2), new C5044OooO0Oo(oooo00o, C8294oOo00OoO.o000o0o0, 4), new C5044OooO0Oo(f14321o0ooOO0, oO0oO000.o000O0O, 5), new C5044OooO0Oo(f14323o0ooOOo, oO0oO000.o000Oo0, 7), new C5044OooO0Oo(f14325o0ooOoO, oO0oO000.o000O00, 5), new C5044OooO0Oo(f14315o0OOO0o, oO0oO000.o000O00O, 5), new C5044OooO0Oo(f14317o0Oo0oo, oO0oO000.o000O0, 3), new C5044OooO0Oo(f14313o0OO00O, oO0oO000.o000O0Oo, 3), new C5044OooO0Oo(f14329oo0o0Oo, oO0oO000.o000OO0O, 5), new C5044OooO0Oo(o0O0O00, oO0oO000.o000O0O0, 3), new C5044OooO0Oo(o000OOo, oO0oO000.o000O0o0, 7), new C5044OooO0Oo(o000000, oO0oO000.o000O0oO, 7), new C5044OooO0Oo(o000000O, oO0oO000.o000O0oo, 7), new C5044OooO0Oo(o000000o, oO0oO000.o000O, 3), new C5044OooO0Oo(o00000, oO0oO000.o000OO00, 3), new C5044OooO0Oo(o00000O0, oO0oO000.o0OoO0o, 3), new C5044OooO0Oo(o00000O, oO0oO000.o000OO0o, 5), new C5044OooO0Oo(o00000OO, oO0oO000.o000OOO, 3), new C5044OooO0Oo(o00000Oo, oO0oO000.o000OOo0, 3), new C5044OooO0Oo(o00000o0, oO0oO000.o000OOoO, 3), new C5044OooO0Oo(o0000Ooo, oO0oO000.o000Oo00, 3), new C5044OooO0Oo(o00000oO, oO0oO000.o000Oo0O, 3), new C5044OooO0Oo(o00000oo, oO0oO000.o000Oo0o, 3), new C5044OooO0Oo(o0000, oO0oO000.o000Oo, 7), new C5044OooO0Oo(o0000O00, oO0oO000.o000OoOO, 3), new C5044OooO0Oo(o0000oo, oO0oO000.o000OoOo, 2), new C5044OooO0Oo(o000OOO, 50706, 1), new C5044OooO0Oo(o000OOo0, 50720, 3, 4)};

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final HashMap<Integer, C5044OooO0Oo>[] f14121OooO0O0;
    public static final byte OooO0OO = -40;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final C5044OooO0Oo f14122OooO0OO = new C5044OooO0Oo(f14185OooOo00, 514, 4);

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f14123OooO0OO = "ImageWidth";

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final short f14124OooO0OO = 1;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final boolean f14125OooO0OO = false;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final byte[] f14126OooO0OO = {79, 76, 89, 77, 80, 0};

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final int[] f14127OooO0OO = {8};

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final C5044OooO0Oo[] f14128OooO0OO = {new C5044OooO0Oo(o0000OO, 0, 1), new C5044OooO0Oo(o0000OOO, 1, 2), new C5044OooO0Oo(o0000OOo, 2, 5), new C5044OooO0Oo(o0000Oo0, 3, 2), new C5044OooO0Oo(o0000Oo, 4, 5), new C5044OooO0Oo(o0000OoO, 5, 1), new C5044OooO0Oo(o0000o0, 6, 5), new C5044OooO0Oo(o0000o0O, 7, 5), new C5044OooO0Oo(o0000o0o, 8, 2), new C5044OooO0Oo(o0000o, 9, 2), new C5044OooO0Oo(o0000oO0, 10, 2), new C5044OooO0Oo(o0000oOO, 11, 5), new C5044OooO0Oo(o0000oOo, 12, 2), new C5044OooO0Oo(o0000oo0, 13, 5), new C5044OooO0Oo(o0000ooO, 14, 2), new C5044OooO0Oo(o000, 15, 5), new C5044OooO0Oo(o000O000, 16, 2), new C5044OooO0Oo(o000OoO, 17, 5), new C5044OooO0Oo(o000O0o, 18, 2), new C5044OooO0Oo(o000Ooo, 19, 2), new C5044OooO0Oo(o000O0O, 20, 5), new C5044OooO0Oo(o000Oo0, 21, 2), new C5044OooO0Oo(o000O00, 22, 5), new C5044OooO0Oo(o000O00O, 23, 2), new C5044OooO0Oo(o000O0, 24, 5), new C5044OooO0Oo(o000O0Oo, 25, 2), new C5044OooO0Oo(o000OO0O, 26, 5), new C5044OooO0Oo(o000O0O0, 27, 7), new C5044OooO0Oo(o000O0o0, 28, 7), new C5044OooO0Oo(o000O0oO, 29, 2), new C5044OooO0Oo(o000O0oo, 30, 3)};

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final HashMap<String, C5044OooO0Oo>[] f14129OooO0OO;
    public static final byte OooO0Oo = -64;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f14130OooO0Oo = "ImageLength";

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final short f14131OooO0Oo = 2;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final byte[] f14132OooO0Oo = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final int[] f14133OooO0Oo = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final C5044OooO0Oo[] f14134OooO0Oo = {new C5044OooO0Oo(o000OO00, 1, 2)};
    public static final byte OooO0o = -62;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final String f14135OooO0o = "Compression";

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final short f14136OooO0o = 3;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final byte[] f14137OooO0o;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final C5044OooO0Oo[] f14138OooO0o = {new C5044OooO0Oo(o000OOoO, 256, 7), new C5044OooO0Oo(o000o0O, 8224, 4), new C5044OooO0Oo(o000o0OO, C7997oO0ooOO0.o0000OOO, 4)};
    public static final byte OooO0o0 = -63;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final String f14139OooO0o0 = "BitsPerSample";

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final short f14140OooO0o0 = 2;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final byte[] f14141OooO0o0 = {C8027oOO00oo.OooO00o, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final C5044OooO0Oo[] f14142OooO0o0 = {new C5044OooO0Oo(o000o000, 254, 4), new C5044OooO0Oo(o000o00, 255, 4), new C5044OooO0Oo(o000OO0o, 256, 3, 4), new C5044OooO0Oo(o0OoO0o, 257, 3, 4), new C5044OooO0Oo(f14139OooO0o0, 258, 3), new C5044OooO0Oo(f14135OooO0o, 259, 3), new C5044OooO0Oo(f14143OooO0oO, 262, 3), new C5044OooO0Oo(f14195OooOoOO, 270, 2), new C5044OooO0Oo(f14199OooOoo0, 271, 2), new C5044OooO0Oo(f14197OooOoo, 272, 2), new C5044OooO0Oo(f14169OooOOOo, 273, 3, 4), new C5044OooO0Oo(f14146OooO0oo, 274, 3), new C5044OooO0Oo(f14098OooO, 277, 3), new C5044OooO0Oo(f14175OooOOo0, 278, 3, 4), new C5044OooO0Oo(f14172OooOOo, 279, 3, 4), new C5044OooO0Oo(f14163OooOOO0, 282, 5), new C5044OooO0Oo(f14160OooOOO, 283, 5), new C5044OooO0Oo(f14150OooOO0, 284, 3), new C5044OooO0Oo(f14166OooOOOO, 296, 3), new C5044OooO0Oo(f14182OooOo0, 301, 3), new C5044OooO0Oo(f14201OooOooO, 305, 2), new C5044OooO0Oo(f14191OooOoO, 306, 2), new C5044OooO0Oo(f14203OooOooo, 315, 2), new C5044OooO0Oo(f14187OooOo0O, oO0oO000.Oooo0, 5), new C5044OooO0Oo(f14189OooOo0o, oO0oO000.Oooo0O0, 5), new C5044OooO0Oo(o000o0O0, 330, 4), new C5044OooO0Oo(f14178OooOOoo, 513, 4), new C5044OooO0Oo(f14185OooOo00, 514, 4), new C5044OooO0Oo(f14180OooOo, 529, 5), new C5044OooO0Oo(f14154OooOO0O, 530, 3), new C5044OooO0Oo(f14157OooOO0o, 531, 3), new C5044OooO0Oo(f14193OooOoO0, 532, 5), new C5044OooO0Oo(f14209Oooo000, oO0oO000.ooOO, 2), new C5044OooO0Oo(o000o00O, 34665, 4), new C5044OooO0Oo(o000o00o, 34853, 4), new C5044OooO0Oo(o000OOO, 50706, 1), new C5044OooO0Oo(o000OOo0, 50720, 3, 4)};
    public static final byte OooO0oO = -61;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static final String f14143OooO0oO = "PhotometricInterpretation";

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static final short f14144OooO0oO = 0;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static final C5044OooO0Oo[] f14145OooO0oO = {new C5044OooO0Oo(o000Oo00, 257, 4), new C5044OooO0Oo(o000Oo0O, 258, 4)};
    public static final byte OooO0oo = -59;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public static final String f14146OooO0oo = "Orientation";

    /* renamed from: OooO0oo  reason: collision with other field name */
    public static final short f14147OooO0oo = 1;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public static final C5044OooO0Oo[] f14148OooO0oo = {new C5044OooO0Oo(o000Oo0o, C7995oO0ooO0o.Ooooo00, 3)};
    public static final byte OooOO0 = -57;

    /* renamed from: OooOO0  reason: collision with other field name */
    public static final int f14149OooOO0 = 512;

    /* renamed from: OooOO0  reason: collision with other field name */
    public static final String f14150OooOO0 = "PlanarConfiguration";

    /* renamed from: OooOO0  reason: collision with other field name */
    public static final short f14151OooOO0 = 3;

    /* renamed from: OooOO0  reason: collision with other field name */
    public static final C5044OooO0Oo[] f14152OooOO0 = {new C5044OooO0Oo(o000o0O0, 330, 4), new C5044OooO0Oo(o000o00O, 34665, 4), new C5044OooO0Oo(o000o00o, 34853, 4), new C5044OooO0Oo(oooo00o, C8294oOo00OoO.o000o0o0, 4), new C5044OooO0Oo(o000o0O, 8224, 1), new C5044OooO0Oo(o000o0OO, C7997oO0ooOO0.o0000OOO, 1)};
    public static final byte OooOO0O = -55;

    /* renamed from: OooOO0O  reason: collision with other field name */
    public static final int f14153OooOO0O = 0;

    /* renamed from: OooOO0O  reason: collision with other field name */
    public static final String f14154OooOO0O = "YCbCrSubSampling";

    /* renamed from: OooOO0O  reason: collision with other field name */
    public static final short f14155OooOO0O = 4;
    public static final byte OooOO0o = -54;

    /* renamed from: OooOO0o  reason: collision with other field name */
    public static final int f14156OooOO0o = 1;

    /* renamed from: OooOO0o  reason: collision with other field name */
    public static final String f14157OooOO0o = "YCbCrPositioning";

    /* renamed from: OooOO0o  reason: collision with other field name */
    public static final short f14158OooOO0o = 5;
    public static final byte OooOOO = -51;

    /* renamed from: OooOOO  reason: collision with other field name */
    public static final int f14159OooOOO = 3;

    /* renamed from: OooOOO  reason: collision with other field name */
    public static final String f14160OooOOO = "YResolution";

    /* renamed from: OooOOO  reason: collision with other field name */
    public static final short f14161OooOOO = 7;
    public static final byte OooOOO0 = -53;

    /* renamed from: OooOOO0  reason: collision with other field name */
    public static final int f14162OooOOO0 = 2;

    /* renamed from: OooOOO0  reason: collision with other field name */
    public static final String f14163OooOOO0 = "XResolution";

    /* renamed from: OooOOO0  reason: collision with other field name */
    public static final short f14164OooOOO0 = 6;
    public static final byte OooOOOO = -50;

    /* renamed from: OooOOOO  reason: collision with other field name */
    public static final int f14165OooOOOO = 4;

    /* renamed from: OooOOOO  reason: collision with other field name */
    public static final String f14166OooOOOO = "ResolutionUnit";

    /* renamed from: OooOOOO  reason: collision with other field name */
    public static final short f14167OooOOOO = 8;
    public static final byte OooOOOo = -49;

    /* renamed from: OooOOOo  reason: collision with other field name */
    public static final int f14168OooOOOo = 5;

    /* renamed from: OooOOOo  reason: collision with other field name */
    public static final String f14169OooOOOo = "StripOffsets";

    /* renamed from: OooOOOo  reason: collision with other field name */
    public static final short f14170OooOOOo = 0;
    public static final byte OooOOo = -31;

    /* renamed from: OooOOo  reason: collision with other field name */
    public static final int f14171OooOOo = 7;

    /* renamed from: OooOOo  reason: collision with other field name */
    public static final String f14172OooOOo = "StripByteCounts";

    /* renamed from: OooOOo  reason: collision with other field name */
    public static final short f14173OooOOo = 2;
    public static final byte OooOOo0 = -38;

    /* renamed from: OooOOo0  reason: collision with other field name */
    public static final int f14174OooOOo0 = 6;

    /* renamed from: OooOOo0  reason: collision with other field name */
    public static final String f14175OooOOo0 = "RowsPerStrip";

    /* renamed from: OooOOo0  reason: collision with other field name */
    public static final short f14176OooOOo0 = 1;
    public static final byte OooOOoo = -2;

    /* renamed from: OooOOoo  reason: collision with other field name */
    public static final int f14177OooOOoo = 8;

    /* renamed from: OooOOoo  reason: collision with other field name */
    public static final String f14178OooOOoo = "JPEGInterchangeFormat";

    /* renamed from: OooOOoo  reason: collision with other field name */
    public static final short f14179OooOOoo = 3;
    public static final int OooOo = 1;

    /* renamed from: OooOo  reason: collision with other field name */
    public static final String f14180OooOo = "YCbCrCoefficients";

    /* renamed from: OooOo  reason: collision with other field name */
    public static final short f14181OooOo = 0;
    public static final int OooOo0 = 65535;

    /* renamed from: OooOo0  reason: collision with other field name */
    public static final String f14182OooOo0 = "TransferFunction";

    /* renamed from: OooOo0  reason: collision with other field name */
    public static final short f14183OooOo0 = 5;
    public static final byte OooOo00 = -39;

    /* renamed from: OooOo00  reason: collision with other field name */
    public static final int f14184OooOo00 = 1;

    /* renamed from: OooOo00  reason: collision with other field name */
    public static final String f14185OooOo00 = "JPEGInterchangeFormatLength";

    /* renamed from: OooOo00  reason: collision with other field name */
    public static final short f14186OooOo00 = 4;
    @Deprecated
    public static final int OooOo0O = 0;

    /* renamed from: OooOo0O  reason: collision with other field name */
    public static final String f14187OooOo0O = "WhitePoint";

    /* renamed from: OooOo0O  reason: collision with other field name */
    public static final short f14188OooOo0O = 6;
    @Deprecated
    public static final int OooOo0o = 1;

    /* renamed from: OooOo0o  reason: collision with other field name */
    public static final String f14189OooOo0o = "PrimaryChromaticities";

    /* renamed from: OooOo0o  reason: collision with other field name */
    public static final short f14190OooOo0o = 7;
    public static final int OooOoO = 6;

    /* renamed from: OooOoO  reason: collision with other field name */
    public static final String f14191OooOoO = "DateTime";

    /* renamed from: OooOoO  reason: collision with other field name */
    public static final short f14192OooOoO = 2;
    public static final int OooOoO0 = 2;

    /* renamed from: OooOoO0  reason: collision with other field name */
    public static final String f14193OooOoO0 = "ReferenceBlackWhite";

    /* renamed from: OooOoO0  reason: collision with other field name */
    public static final short f14194OooOoO0 = 1;
    public static final int OooOoOO = 7;

    /* renamed from: OooOoOO  reason: collision with other field name */
    public static final String f14195OooOoOO = "ImageDescription";

    /* renamed from: OooOoOO  reason: collision with other field name */
    public static final short f14196OooOoOO = 3;
    public static final int OooOoo = 32773;

    /* renamed from: OooOoo  reason: collision with other field name */
    public static final String f14197OooOoo = "Model";

    /* renamed from: OooOoo  reason: collision with other field name */
    public static final short f14198OooOoo = 5;
    public static final int OooOoo0 = 8;

    /* renamed from: OooOoo0  reason: collision with other field name */
    public static final String f14199OooOoo0 = "Make";

    /* renamed from: OooOoo0  reason: collision with other field name */
    public static final short f14200OooOoo0 = 4;
    public static final int OooOooO = 34892;

    /* renamed from: OooOooO  reason: collision with other field name */
    public static final String f14201OooOooO = "Software";

    /* renamed from: OooOooO  reason: collision with other field name */
    public static final short f14202OooOooO = 6;
    public static final int OooOooo = 0;

    /* renamed from: OooOooo  reason: collision with other field name */
    public static final String f14203OooOooo = "Artist";

    /* renamed from: OooOooo  reason: collision with other field name */
    public static final short f14204OooOooo = 255;
    public static final int Oooo = 12;

    /* renamed from: Oooo  reason: collision with other field name */
    public static final String f14205Oooo = "UserComment";

    /* renamed from: Oooo  reason: collision with other field name */
    public static final short f14206Oooo = 14;
    public static final int Oooo0 = 0;

    /* renamed from: Oooo0  reason: collision with other field name */
    public static final String f14207Oooo0 = "ColorSpace";

    /* renamed from: Oooo0  reason: collision with other field name */
    public static final short f14208Oooo0 = 3;
    public static final int Oooo000 = 1;

    /* renamed from: Oooo000  reason: collision with other field name */
    public static final String f14209Oooo000 = "Copyright";

    /* renamed from: Oooo000  reason: collision with other field name */
    public static final short f14210Oooo000 = 0;
    public static final int Oooo00O = 2;

    /* renamed from: Oooo00O  reason: collision with other field name */
    public static final String f14211Oooo00O = "ExifVersion";

    /* renamed from: Oooo00O  reason: collision with other field name */
    public static final short f14212Oooo00O = 1;
    public static final int Oooo00o = 6;

    /* renamed from: Oooo00o  reason: collision with other field name */
    public static final String f14213Oooo00o = "FlashpixVersion";

    /* renamed from: Oooo00o  reason: collision with other field name */
    public static final short f14214Oooo00o = 2;
    public static final int Oooo0O0 = 1;

    /* renamed from: Oooo0O0  reason: collision with other field name */
    public static final String f14215Oooo0O0 = "Gamma";

    /* renamed from: Oooo0O0  reason: collision with other field name */
    public static final short f14216Oooo0O0 = 4;
    public static final int Oooo0OO = 5000;

    /* renamed from: Oooo0OO  reason: collision with other field name */
    public static final String f14217Oooo0OO = "PixelXDimension";

    /* renamed from: Oooo0OO  reason: collision with other field name */
    public static final short f14218Oooo0OO = 9;
    public static final int Oooo0o = 160;

    /* renamed from: Oooo0o  reason: collision with other field name */
    public static final String f14219Oooo0o = "ComponentsConfiguration";

    /* renamed from: Oooo0o  reason: collision with other field name */
    public static final short f14220Oooo0o = 11;
    public static final int Oooo0o0 = 84;

    /* renamed from: Oooo0o0  reason: collision with other field name */
    public static final String f14221Oooo0o0 = "PixelYDimension";

    /* renamed from: Oooo0o0  reason: collision with other field name */
    public static final short f14222Oooo0o0 = 10;
    public static final int Oooo0oO = 4;

    /* renamed from: Oooo0oO  reason: collision with other field name */
    public static final String f14223Oooo0oO = "CompressedBitsPerPixel";

    /* renamed from: Oooo0oO  reason: collision with other field name */
    public static final short f14224Oooo0oO = 12;
    public static final int Oooo0oo = 8;

    /* renamed from: Oooo0oo  reason: collision with other field name */
    public static final String f14225Oooo0oo = "MakerNote";

    /* renamed from: Oooo0oo  reason: collision with other field name */
    public static final short f14226Oooo0oo = 13;
    public static final int OoooO = 2;

    /* renamed from: OoooO  reason: collision with other field name */
    public static final String f14227OoooO = "SubSecTime";

    /* renamed from: OoooO  reason: collision with other field name */
    public static final short f14228OoooO = 18;
    public static final int OoooO0 = 8;

    /* renamed from: OoooO0  reason: collision with other field name */
    public static final String f14229OoooO0 = "DateTimeOriginal";

    /* renamed from: OoooO0  reason: collision with other field name */
    public static final short f14230OoooO0 = 16;
    public static final int OoooO00 = 6;

    /* renamed from: OoooO00  reason: collision with other field name */
    public static final String f14231OoooO00 = "RelatedSoundFile";

    /* renamed from: OoooO00  reason: collision with other field name */
    public static final short f14232OoooO00 = 15;
    public static final int OoooO0O = 1;

    /* renamed from: OoooO0O  reason: collision with other field name */
    public static final String f14233OoooO0O = "DateTimeDigitized";

    /* renamed from: OoooO0O  reason: collision with other field name */
    public static final short f14234OoooO0O = 17;
    public static final int OoooOO0 = 3;

    /* renamed from: OoooOO0  reason: collision with other field name */
    public static final String f14235OoooOO0 = "SubSecTimeOriginal";

    /* renamed from: OoooOO0  reason: collision with other field name */
    public static final short f14236OoooOO0 = 19;
    public static final int OoooOOO = 5;

    /* renamed from: OoooOOO  reason: collision with other field name */
    public static final String f14237OoooOOO = "ExposureTime";

    /* renamed from: OoooOOO  reason: collision with other field name */
    public static final short f14238OoooOOO = 21;
    public static final int OoooOOo = 6;

    /* renamed from: OoooOOo  reason: collision with other field name */
    public static final String f14239OoooOOo = "FNumber";

    /* renamed from: OoooOOo  reason: collision with other field name */
    public static final short f14240OoooOOo = 22;
    public static final int OoooOo0 = 7;

    /* renamed from: OoooOo0  reason: collision with other field name */
    public static final String f14241OoooOo0 = "ExposureProgram";

    /* renamed from: OoooOo0  reason: collision with other field name */
    public static final short f14242OoooOo0 = 23;
    public static final int OoooOoO = 8;

    /* renamed from: OoooOoO  reason: collision with other field name */
    public static final String f14243OoooOoO = "SpectralSensitivity";

    /* renamed from: OoooOoO  reason: collision with other field name */
    public static final short f14244OoooOoO = 24;
    public static final int OoooOoo = 9;
    @Deprecated

    /* renamed from: OoooOoo  reason: collision with other field name */
    public static final String f14245OoooOoo = "ISOSpeedRatings";

    /* renamed from: OoooOoo  reason: collision with other field name */
    public static final short f14246OoooOoo = 255;
    public static final int Ooooo00 = 10;

    /* renamed from: Ooooo00  reason: collision with other field name */
    public static final String f14247Ooooo00 = "PhotographicSensitivity";

    /* renamed from: Ooooo00  reason: collision with other field name */
    public static final short f14248Ooooo00 = 1;
    public static final int Ooooo0o = 11;

    /* renamed from: Ooooo0o  reason: collision with other field name */
    public static final String f14249Ooooo0o = "OECF";

    /* renamed from: Ooooo0o  reason: collision with other field name */
    public static final short f14250Ooooo0o = 4;
    public static final int OooooO0 = 12;

    /* renamed from: OooooO0  reason: collision with other field name */
    public static final String f14251OooooO0 = "SensitivityType";

    /* renamed from: OooooO0  reason: collision with other field name */
    public static final short f14252OooooO0 = 6;
    public static final int OooooOO = 13;

    /* renamed from: OooooOO  reason: collision with other field name */
    public static final String f14253OooooOO = "StandardOutputSensitivity";

    /* renamed from: OooooOO  reason: collision with other field name */
    public static final short f14254OooooOO = 8;
    public static final int OooooOo = 0;

    /* renamed from: OooooOo  reason: collision with other field name */
    public static final String f14255OooooOo = "RecommendedExposureIndex";

    /* renamed from: OooooOo  reason: collision with other field name */
    public static final short f14256OooooOo = 16;
    public static final int Oooooo = 2;

    /* renamed from: Oooooo  reason: collision with other field name */
    public static final String f14257Oooooo = "ISOSpeedLatitudeyyy";

    /* renamed from: Oooooo  reason: collision with other field name */
    public static final short f14258Oooooo = 32;
    public static final int Oooooo0 = 1;

    /* renamed from: Oooooo0  reason: collision with other field name */
    public static final String f14259Oooooo0 = "ISOSpeed";

    /* renamed from: Oooooo0  reason: collision with other field name */
    public static final short f14260Oooooo0 = 24;
    public static final int OoooooO = 3;

    /* renamed from: OoooooO  reason: collision with other field name */
    public static final String f14261OoooooO = "ISOSpeedLatitudezzz";

    /* renamed from: OoooooO  reason: collision with other field name */
    public static final short f14262OoooooO = 64;
    public static final int Ooooooo = 4;

    /* renamed from: Ooooooo  reason: collision with other field name */
    public static final String f14263Ooooooo = "ShutterSpeedValue";

    /* renamed from: Ooooooo  reason: collision with other field name */
    public static final short f14264Ooooooo = 1;
    public static final String o00 = "M";
    public static final String o000 = "GPSTrack";
    public static final String o0000 = "DeviceSettingDescription";

    /* renamed from: o0000  reason: collision with other field name */
    public static final short f14265o0000 = 0;
    public static final String o00000 = "ExposureMode";

    /* renamed from: o00000  reason: collision with other field name */
    public static final short f14266o00000 = 0;
    public static final String o000000 = "SceneType";

    /* renamed from: o000000  reason: collision with other field name */
    public static final short f14267o000000 = 1;
    public static final String o000000O = "CFAPattern";

    /* renamed from: o000000O  reason: collision with other field name */
    public static final short f14268o000000O = 2;
    public static final String o000000o = "CustomRendered";

    /* renamed from: o000000o  reason: collision with other field name */
    public static final short f14269o000000o = 3;
    public static final String o00000O = "DigitalZoomRatio";

    /* renamed from: o00000O  reason: collision with other field name */
    public static final short f14270o00000O = 2;
    public static final String o00000O0 = "WhiteBalance";

    /* renamed from: o00000O0  reason: collision with other field name */
    public static final short f14271o00000O0 = 1;
    public static final String o00000OO = "FocalLengthIn35mmFilm";

    /* renamed from: o00000OO  reason: collision with other field name */
    public static final short f14272o00000OO = 3;
    public static final String o00000Oo = "SceneCaptureType";

    /* renamed from: o00000Oo  reason: collision with other field name */
    public static final short f14273o00000Oo = 4;
    public static final String o00000o0 = "GainControl";

    /* renamed from: o00000o0  reason: collision with other field name */
    public static final short f14274o00000o0 = 0;
    public static final String o00000oO = "Saturation";

    /* renamed from: o00000oO  reason: collision with other field name */
    public static final short f14275o00000oO = 2;
    public static final String o00000oo = "Sharpness";

    /* renamed from: o00000oo  reason: collision with other field name */
    public static final short f14276o00000oo = 0;
    public static final String o0000O = "LensModel";

    /* renamed from: o0000O  reason: collision with other field name */
    public static final short f14277o0000O = 2;
    public static final String o0000O0 = "BodySerialNumber";

    /* renamed from: o0000O0  reason: collision with other field name */
    public static final short f14278o0000O0 = 2;
    public static final String o0000O00 = "SubjectDistanceRange";

    /* renamed from: o0000O00  reason: collision with other field name */
    public static final short f14279o0000O00 = 0;
    public static final String o0000O0O = "LensSpecification";

    /* renamed from: o0000O0O  reason: collision with other field name */
    public static final short f14280o0000O0O = 0;
    public static final String o0000OO = "GPSVersionID";

    /* renamed from: o0000OO  reason: collision with other field name */
    public static final short f14281o0000OO = 0;
    public static final String o0000OO0 = "LensSerialNumber";

    /* renamed from: o0000OO0  reason: collision with other field name */
    public static final short f14282o0000OO0 = 3;
    public static final String o0000OOO = "GPSLatitudeRef";

    /* renamed from: o0000OOO  reason: collision with other field name */
    public static final short f14283o0000OOO = 1;
    public static final String o0000OOo = "GPSLatitude";

    /* renamed from: o0000OOo  reason: collision with other field name */
    public static final short f14284o0000OOo = 0;
    public static final String o0000Oo = "GPSLongitude";

    /* renamed from: o0000Oo  reason: collision with other field name */
    public static final short f14285o0000Oo = 20306;
    public static final String o0000Oo0 = "GPSLongitudeRef";

    /* renamed from: o0000Oo0  reason: collision with other field name */
    public static final short f14286o0000Oo0 = 1;
    public static final String o0000OoO = "GPSAltitudeRef";

    /* renamed from: o0000OoO  reason: collision with other field name */
    public static final short f14287o0000OoO = 21330;
    public static final String o0000Ooo = "Contrast";

    /* renamed from: o0000Ooo  reason: collision with other field name */
    public static final short f14288o0000Ooo = 1;
    public static final String o0000o = "GPSStatus";
    public static final String o0000o0 = "GPSAltitude";

    /* renamed from: o0000o0  reason: collision with other field name */
    public static final short f14289o0000o0 = 85;
    public static final String o0000o0O = "GPSTimeStamp";

    /* renamed from: o0000o0O  reason: collision with other field name */
    public static final short f14290o0000o0O = 18761;
    public static final String o0000o0o = "GPSSatellites";

    /* renamed from: o0000o0o  reason: collision with other field name */
    public static final short f14291o0000o0o = 19789;
    public static final String o0000oO = "CameraOwnerName";

    /* renamed from: o0000oO  reason: collision with other field name */
    public static final short f14292o0000oO = 1;
    public static final String o0000oO0 = "GPSMeasureMode";
    public static final String o0000oOO = "GPSDOP";
    public static final String o0000oOo = "GPSSpeedRef";
    public static final String o0000oo = "ImageUniqueID";

    /* renamed from: o0000oo  reason: collision with other field name */
    public static final short f14293o0000oo = 0;
    public static final String o0000oo0 = "GPSSpeed";
    public static final String o0000ooO = "GPSTrackRef";
    public static final String o000O = "GPSHPositioningError";
    public static final String o000O0 = "GPSDestBearing";
    public static final String o000O00 = "GPSDestLongitude";
    public static final String o000O000 = "GPSImgDirectionRef";
    public static final String o000O00O = "GPSDestBearingRef";
    public static final String o000O0O = "GPSDestLatitude";
    public static final String o000O0O0 = "GPSProcessingMethod";
    public static final String o000O0Oo = "GPSDestDistanceRef";
    public static final String o000O0o = "GPSMapDatum";
    public static final String o000O0o0 = "GPSAreaInformation";
    public static final String o000O0oO = "GPSDateStamp";
    public static final String o000O0oo = "GPSDifferential";
    public static final String o000OO = "LensMake";

    /* renamed from: o000OO  reason: collision with other field name */
    public static final short f14294o000OO = 1;
    public static final String o000OO00 = "InteroperabilityIndex";
    public static final String o000OO0O = "GPSDestDistance";
    public static final String o000OO0o = "ThumbnailImageWidth";
    public static final String o000OOO = "DNGVersion";
    public static final String o000OOo = "FileSource";

    /* renamed from: o000OOo  reason: collision with other field name */
    public static final short f14295o000OOo = 0;
    public static final String o000OOo0 = "DefaultCropSize";
    public static final String o000OOoO = "ThumbnailImage";
    public static final String o000Oo = "SensorBottomBorder";
    public static final String o000Oo0 = "GPSDestLongitudeRef";
    public static final String o000Oo00 = "PreviewImageStart";
    public static final String o000Oo0O = "PreviewImageLength";
    public static final String o000Oo0o = "AspectFrame";
    public static final String o000OoO = "GPSImgDirection";
    public static final String o000OoOO = "SensorLeftBorder";
    public static final String o000OoOo = "SensorRightBorder";
    public static final String o000Ooo = "GPSDestLatitudeRef";
    public static final String o000Ooo0 = "SensorTopBorder";
    public static final String o000OooO = "ISO";
    public static final String o000Oooo = "JpgFromRaw";
    public static final String o000o00 = "SubfileType";
    public static final String o000o000 = "NewSubfileType";
    public static final String o000o00O = "ExifIFDPointer";
    public static final String o000o00o = "GPSInfoIFDPointer";
    public static final String o000o0O = "CameraSettingsIFDPointer";
    public static final String o000o0O0 = "SubIFDPointer";
    public static final String o000o0OO = "ImageProcessingIFDPointer";
    public static final String o000o0Oo = "HasThumbnail";
    public static final String o000o0o = "ThumbnailLength";
    public static final String o000o0o0 = "ThumbnailOffset";
    public static final String o000o0oO = "ThumbnailData";
    public static final String o000o0oo = "N";
    public static final int o000oOoO = 4;

    /* renamed from: o000oOoO  reason: collision with other field name */
    public static final String f14296o000oOoO = "SubSecTimeDigitized";

    /* renamed from: o000oOoO  reason: collision with other field name */
    public static final short f14297o000oOoO = 20;
    public static final String o000oOoo = "S";
    public static final String o000oo = "2";
    public static final String o000oo0 = "W";
    public static final String o000oo00 = "E";
    public static final String o000oo0O = "A";
    public static final String o000oo0o = "V";
    public static final String o000ooO = "K";
    public static final String o000ooO0 = "3";
    public static final String o000ooOO = "M";
    public static final String o000ooo = "T";
    public static final String o000ooo0 = "N";
    public static final String o000oooO = "M";
    public static final String o000oooo = "K";
    public static final String o00O0000 = "N";
    public static final int o00O0O = 7;

    /* renamed from: o00O0O  reason: collision with other field name */
    public static final String f14298o00O0O = "ExposureBiasValue";

    /* renamed from: o00O0O  reason: collision with other field name */
    public static final short f14299o00O0O = 4;
    public static final int o00Oo0 = 8;

    /* renamed from: o00Oo0  reason: collision with other field name */
    public static final String f14300o00Oo0 = "MaxApertureValue";

    /* renamed from: o00Oo0  reason: collision with other field name */
    public static final short f14301o00Oo0 = 5;
    public static final int o00Ooo = 9;

    /* renamed from: o00Ooo  reason: collision with other field name */
    public static final String f14302o00Ooo = "SubjectDistance";

    /* renamed from: o00Ooo  reason: collision with other field name */
    public static final short f14303o00Ooo = 7;
    public static final int o00o0O = 0;

    /* renamed from: o00o0O  reason: collision with other field name */
    public static final String f14304o00o0O = "MeteringMode";

    /* renamed from: o00o0O  reason: collision with other field name */
    public static final short f14305o00o0O = 8;
    public static final int o00oO0O = 4;

    /* renamed from: o00oO0O  reason: collision with other field name */
    public static final String f14306o00oO0O = "FocalLength";

    /* renamed from: o00oO0O  reason: collision with other field name */
    public static final short f14307o00oO0O = 3;
    public static final int o00oO0o = 3;

    /* renamed from: o00oO0o  reason: collision with other field name */
    public static final String f14308o00oO0o = "SubjectArea";

    /* renamed from: o00oO0o  reason: collision with other field name */
    public static final short f14309o00oO0o = 2;
    public static final String o00oOoo = "PENTAX";
    public static final int o00ooo = 1;

    /* renamed from: o00ooo  reason: collision with other field name */
    public static final String f14310o00ooo = "LightSource";

    /* renamed from: o00ooo  reason: collision with other field name */
    public static final short f14311o00ooo = 0;
    public static final String o0O0O00 = "SensingMethod";

    /* renamed from: o0O0O00  reason: collision with other field name */
    public static final short f14312o0O0O00 = 1;
    public static final String o0O0ooO = "FUJIFILMCCD-RAW";
    public static final int o0OO00O = 10;

    /* renamed from: o0OO00O  reason: collision with other field name */
    public static final String f14313o0OO00O = "SubjectLocation";

    /* renamed from: o0OO00O  reason: collision with other field name */
    public static final short f14314o0OO00O = 2;
    public static final int o0OOO0o = 8;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public static final String f14315o0OOO0o = "FocalPlaneYResolution";

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public static final short f14316o0OOO0o = 0;
    public static final int o0Oo0oo = 9;

    /* renamed from: o0Oo0oo  reason: collision with other field name */
    public static final String f14317o0Oo0oo = "FocalPlaneResolutionUnit";

    /* renamed from: o0Oo0oo  reason: collision with other field name */
    public static final short f14318o0Oo0oo = 1;
    public static final String o0OoO0o = "ThumbnailImageLength";
    public static final int o0OoOo0 = 5;

    /* renamed from: o0OoOo0  reason: collision with other field name */
    public static final String f14319o0OoOo0 = "ApertureValue";

    /* renamed from: o0OoOo0  reason: collision with other field name */
    public static final short f14320o0OoOo0 = 2;
    public static final int o0ooOO0 = 5;

    /* renamed from: o0ooOO0  reason: collision with other field name */
    public static final String f14321o0ooOO0 = "FlashEnergy";

    /* renamed from: o0ooOO0  reason: collision with other field name */
    public static final short f14322o0ooOO0 = 1;
    public static final int o0ooOOo = 6;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f14323o0ooOOo = "SpatialFrequencyResponse";

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final short f14324o0ooOOo = 0;
    public static final int o0ooOoO = 7;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public static final String f14325o0ooOoO = "FocalPlaneXResolution";

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public static final short f14326o0ooOoO = 1;
    public static final int oo000o = 2;

    /* renamed from: oo000o  reason: collision with other field name */
    public static final String f14327oo000o = "Flash";

    /* renamed from: oo000o  reason: collision with other field name */
    public static final short f14328oo000o = 1;
    public static final int oo0o0Oo = 11;

    /* renamed from: oo0o0Oo  reason: collision with other field name */
    public static final String f14329oo0o0Oo = "ExposureIndex";

    /* renamed from: oo0o0Oo  reason: collision with other field name */
    public static final short f14330oo0o0Oo = 0;
    public static final int ooOO = 6;

    /* renamed from: ooOO  reason: collision with other field name */
    public static final String f14331ooOO = "BrightnessValue";

    /* renamed from: ooOO  reason: collision with other field name */
    public static final short f14332ooOO = 3;
    public static final String oooo00o = "InteroperabilityIFDPointer";

    /* renamed from: OooO  reason: collision with other field name */
    public int f14333OooO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f14334OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AssetManager.AssetInputStream f14335OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f14336OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ByteOrder f14337OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Set<Integer> f14338OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f14339OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f14340OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final HashMap<String, OooO0OO>[] f14341OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f14342OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f14343OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f14344OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public int f14345OooO0Oo;

    /* renamed from: OooO0o  reason: collision with other field name */
    public int f14346OooO0o;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public int f14347OooO0o0;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public int f14348OooO0oO;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public int f14349OooO0oo;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface IfdType {
    }

    public static class OooO0O0 extends FilterOutputStream {
        public final OutputStream OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ByteOrder f14351OooO00o;

        public OooO0O0(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.OooO00o = outputStream;
            this.f14351OooO00o = byteOrder;
        }

        public void OooO00o(ByteOrder byteOrder) {
            this.f14351OooO00o = byteOrder;
        }

        public void OooO0O0(int i) throws IOException {
            ByteOrder byteOrder = this.f14351OooO00o;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.OooO00o.write((i >>> 0) & 255);
                this.OooO00o.write((i >>> 8) & 255);
                this.OooO00o.write((i >>> 16) & 255);
                this.OooO00o.write((i >>> 24) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.OooO00o.write((i >>> 24) & 255);
                this.OooO00o.write((i >>> 16) & 255);
                this.OooO00o.write((i >>> 8) & 255);
                this.OooO00o.write((i >>> 0) & 255);
            }
        }

        public void OooO0OO(int i) throws IOException {
            OooO00o((short) i);
        }

        @Override // java.io.OutputStream, java.io.FilterOutputStream
        public void write(byte[] bArr) throws IOException {
            this.OooO00o.write(bArr);
        }

        public void OooO00o(int i) throws IOException {
            this.OooO00o.write(i);
        }

        public void OooO0OO(long j) throws IOException {
            OooO0O0((int) j);
        }

        @Override // java.io.OutputStream, java.io.FilterOutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.OooO00o.write(bArr, i, i2);
        }

        public void OooO00o(short s) throws IOException {
            ByteOrder byteOrder = this.f14351OooO00o;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.OooO00o.write((s >>> 0) & 255);
                this.OooO00o.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.OooO00o.write((s >>> 8) & 255);
                this.OooO00o.write((s >>> 0) & 255);
            }
        }
    }

    /* renamed from: androidx.exifinterface.media.ExifInterface$OooO0o0  reason: case insensitive filesystem */
    public static class C5045OooO0o0 {
        public final long OooO00o;
        public final long OooO0O0;

        public C5045OooO0o0(double d) {
            this((long) (d * 10000.0d), TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
        }

        public double OooO00o() {
            double d = (double) this.OooO00o;
            double d2 = (double) this.OooO0O0;
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        }

        public String toString() {
            return this.OooO00o + C8932ooOOO0o.OooO0OO + this.OooO0O0;
        }

        public C5045OooO0o0(long j, long j2) {
            if (j2 == 0) {
                this.OooO00o = 0;
                this.OooO0O0 = 1;
                return;
            }
            this.OooO00o = j;
            this.OooO0O0 = j2;
        }
    }

    static {
        C5044OooO0Oo[] oooO0OoArr = {new C5044OooO0Oo(f14207Oooo0, 55, 3)};
        f14100OooO = oooO0OoArr;
        C5044OooO0Oo[] oooO0OoArr2 = f14110OooO00o;
        f14112OooO00o = new C5044OooO0Oo[][]{oooO0OoArr2, f14120OooO0O0, f14128OooO0OO, f14134OooO0Oo, f14142OooO0o0, oooO0OoArr2, f14138OooO0o, f14145OooO0oO, f14148OooO0oo, oooO0OoArr};
        C5044OooO0Oo[][] oooO0OoArr3 = f14112OooO00o;
        f14121OooO0O0 = new HashMap[oooO0OoArr3.length];
        f14129OooO0OO = new HashMap[oooO0OoArr3.length];
        Charset forName = Charset.forName("US-ASCII");
        f14102OooO00o = forName;
        f14137OooO0o = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f14103OooO00o = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(ISO8601Utils.UTC_ID));
        for (int i = 0; i < f14112OooO00o.length; i++) {
            f14121OooO0O0[i] = new HashMap<>();
            f14129OooO0OO[i] = new HashMap<>();
            C5044OooO0Oo[] oooO0OoArr4 = f14112OooO00o[i];
            for (C5044OooO0Oo oooO0Oo : oooO0OoArr4) {
                f14121OooO0O0[i].put(Integer.valueOf(oooO0Oo.OooO00o), oooO0Oo);
                f14129OooO0OO[i].put(oooO0Oo.f14353OooO00o, oooO0Oo);
            }
        }
        f14104OooO00o.put(Integer.valueOf(f14152OooOO0[0].OooO00o), 5);
        f14104OooO00o.put(Integer.valueOf(f14152OooOO0[1].OooO00o), 1);
        f14104OooO00o.put(Integer.valueOf(f14152OooOO0[2].OooO00o), 2);
        f14104OooO00o.put(Integer.valueOf(f14152OooOO0[3].OooO00o), 3);
        f14104OooO00o.put(Integer.valueOf(f14152OooOO0[4].OooO00o), 7);
        f14104OooO00o.put(Integer.valueOf(f14152OooOO0[5].OooO00o), 8);
    }

    public ExifInterface(@NonNull String str) throws IOException {
        Throwable th;
        this.f14341OooO00o = new HashMap[f14112OooO00o.length];
        this.f14338OooO00o = new HashSet(f14112OooO00o.length);
        this.f14337OooO00o = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f14335OooO00o = null;
            this.f14336OooO00o = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    OooO00o((InputStream) fileInputStream2);
                    OooO00o((Closeable) fileInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    OooO00o((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                OooO00o((Closeable) fileInputStream);
                throw th;
            }
        } else {
            throw new IllegalArgumentException("filename cannot be null");
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    private OooO0OO m14641OooO00o(@NonNull String str) {
        if (f14245OoooOoo.equals(str)) {
            str = f14247Ooooo00;
        }
        for (int i = 0; i < f14112OooO00o.length; i++) {
            OooO0OO oooO0OO = this.f14341OooO00o[i].get(str);
            if (oooO0OO != null) {
                return oooO0OO;
            }
        }
        return null;
    }

    private void OooO0o() {
        for (int i = 0; i < this.f14341OooO00o.length; i++) {
            String str = "The size of tag group[" + i + "]: " + this.f14341OooO00o[i].size();
            for (Map.Entry<String, OooO0OO> entry : this.f14341OooO00o[i].entrySet()) {
                OooO0OO value = entry.getValue();
                String str2 = "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.m14662OooO00o(this.f14337OooO00o) + "'";
            }
        }
    }

    private void OooO0o0() {
        String OooO00o2 = m14648OooO00o(f14229OoooO0);
        if (OooO00o2 != null && m14648OooO00o(f14191OooOoO) == null) {
            this.f14341OooO00o[0].put(f14191OooOoO, OooO0OO.OooO0O0(OooO00o2));
        }
        if (m14648OooO00o(f14123OooO0OO) == null) {
            this.f14341OooO00o[0].put(f14123OooO0OO, OooO0OO.OooO00o(0L, this.f14337OooO00o));
        }
        if (m14648OooO00o(f14130OooO0Oo) == null) {
            this.f14341OooO00o[0].put(f14130OooO0Oo, OooO0OO.OooO00o(0L, this.f14337OooO00o));
        }
        if (m14648OooO00o(f14146OooO0oo) == null) {
            this.f14341OooO00o[0].put(f14146OooO0oo, OooO0OO.OooO00o(0L, this.f14337OooO00o));
        }
        if (m14648OooO00o(f14310o00ooo) == null) {
            this.f14341OooO00o[1].put(f14310o00ooo, OooO0OO.OooO00o(0L, this.f14337OooO00o));
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m14656OooO0O0() {
        int i = 1;
        switch (OooO00o(f14146OooO0oo, 1)) {
            case 1:
                i = 4;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 0;
                break;
        }
        m14651OooO00o(f14146OooO0oo, Integer.toString(i));
    }

    public void OooO0OO() {
        m14651OooO00o(f14146OooO0oo, Integer.toString(1));
    }

    public void OooO0Oo() throws IOException {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        Throwable th;
        if (!this.f14343OooO0O0 || this.f14334OooO00o != 4) {
            throw new IOException("ExifInterface only supports saving attributes on JPEG formats.");
        } else if (this.f14336OooO00o != null) {
            this.f14340OooO00o = m14653OooO00o();
            File file = new File(this.f14336OooO00o + ".tmp");
            if (new File(this.f14336OooO00o).renameTo(file)) {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(this.f14336OooO00o);
                    } catch (Throwable th2) {
                        fileOutputStream = null;
                        th = th2;
                        OooO00o((Closeable) fileInputStream);
                        OooO00o((Closeable) fileOutputStream);
                        file.delete();
                        throw th;
                    }
                    try {
                        m14643OooO00o((InputStream) fileInputStream, (OutputStream) fileOutputStream);
                        OooO00o((Closeable) fileInputStream);
                        OooO00o((Closeable) fileOutputStream);
                        file.delete();
                        this.f14340OooO00o = null;
                    } catch (Throwable th3) {
                        th = th3;
                        OooO00o((Closeable) fileInputStream);
                        OooO00o((Closeable) fileOutputStream);
                        file.delete();
                        throw th;
                    }
                } catch (Throwable th4) {
                    fileOutputStream = null;
                    th = th4;
                    fileInputStream = null;
                    OooO00o((Closeable) fileInputStream);
                    OooO00o((Closeable) fileOutputStream);
                    file.delete();
                    throw th;
                }
            } else {
                throw new IOException("Could not rename to " + file.getAbsolutePath());
            }
        } else {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
    }

    public static class OooO00o extends InputStream implements DataInput {
        public static final ByteOrder OooO0O0 = ByteOrder.LITTLE_ENDIAN;
        public static final ByteOrder OooO0OO = ByteOrder.BIG_ENDIAN;
        public DataInputStream OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ByteOrder f14350OooO00o;
        public final int o00oO0O;
        public int o0ooOO0;

        public OooO00o(InputStream inputStream) throws IOException {
            this.f14350OooO00o = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.OooO00o = dataInputStream;
            int available = dataInputStream.available();
            this.o00oO0O = available;
            this.o0ooOO0 = 0;
            this.OooO00o.mark(available);
        }

        public void OooO00o(ByteOrder byteOrder) {
            this.f14350OooO00o = byteOrder;
        }

        public int OooO0O0() {
            return this.o0ooOO0;
        }

        public void OooO0OO(long j) throws IOException {
            int i = this.o0ooOO0;
            if (((long) i) > j) {
                this.o0ooOO0 = 0;
                this.OooO00o.reset();
                this.OooO00o.mark(this.o00oO0O);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public long OooO0Oo() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.OooO00o.available();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.o0ooOO0++;
            return this.OooO00o.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.o0ooOO0++;
            return this.OooO00o.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            int i = this.o0ooOO0 + 1;
            this.o0ooOO0 = i;
            if (i <= this.o00oO0O) {
                int read = this.OooO00o.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.o0ooOO0 += 2;
            return this.OooO00o.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.o0ooOO0 + i2;
            this.o0ooOO0 = i3;
            if (i3 > this.o00oO0O) {
                throw new EOFException();
            } else if (this.OooO00o.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i = this.o0ooOO0 + 4;
            this.o0ooOO0 = i;
            if (i <= this.o00oO0O) {
                int read = this.OooO00o.read();
                int read2 = this.OooO00o.read();
                int read3 = this.OooO00o.read();
                int read4 = this.OooO00o.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f14350OooO00o;
                    if (byteOrder == OooO0O0) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == OooO0OO) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f14350OooO00o);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i = this.o0ooOO0 + 8;
            this.o0ooOO0 = i;
            if (i <= this.o00oO0O) {
                int read = this.OooO00o.read();
                int read2 = this.OooO00o.read();
                int read3 = this.OooO00o.read();
                int read4 = this.OooO00o.read();
                int read5 = this.OooO00o.read();
                int read6 = this.OooO00o.read();
                int read7 = this.OooO00o.read();
                int read8 = this.OooO00o.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f14350OooO00o;
                    if (byteOrder == OooO0O0) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    if (byteOrder == OooO0OO) {
                        return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.f14350OooO00o);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i = this.o0ooOO0 + 2;
            this.o0ooOO0 = i;
            if (i <= this.o00oO0O) {
                int read = this.OooO00o.read();
                int read2 = this.OooO00o.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f14350OooO00o;
                    if (byteOrder == OooO0O0) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == OooO0OO) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f14350OooO00o);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.o0ooOO0 += 2;
            return this.OooO00o.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.o0ooOO0++;
            return this.OooO00o.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i = this.o0ooOO0 + 2;
            this.o0ooOO0 = i;
            if (i <= this.o00oO0O) {
                int read = this.OooO00o.read();
                int read2 = this.OooO00o.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f14350OooO00o;
                    if (byteOrder == OooO0O0) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == OooO0OO) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f14350OooO00o);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.o00oO0O - this.o0ooOO0);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.OooO00o.skipBytes(min - i2);
            }
            this.o0ooOO0 += i2;
            return i2;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.OooO00o.read(bArr, i, i2);
            this.o0ooOO0 += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.o0ooOO0 + bArr.length;
            this.o0ooOO0 = length;
            if (length > this.o00oO0O) {
                throw new EOFException();
            } else if (this.OooO00o.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public OooO00o(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m14659OooO0OO() {
        int i = this.f14345OooO0Oo;
        return i == 6 || i == 7;
    }

    private boolean OooO0OO(byte[] bArr) throws IOException {
        byte[] bytes = o0O0ooO.getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m14657OooO0O0() {
        int OooO00o2 = OooO00o(f14146OooO0oo, 1);
        return OooO00o2 == 2 || OooO00o2 == 7 || OooO00o2 == 4 || OooO00o2 == 5;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m14648OooO00o(@NonNull String str) {
        OooO0OO OooO00o2 = m14641OooO00o(str);
        if (OooO00o2 != null) {
            if (!f14105OooO00o.contains(str)) {
                return OooO00o2.m14662OooO00o(this.f14337OooO00o);
            }
            if (str.equals(o0000o0O)) {
                int i = OooO00o2.OooO00o;
                if (i == 5 || i == 10) {
                    C5045OooO0o0[] oooO0o0Arr = (C5045OooO0o0[]) OooO00o2.m14661OooO00o(this.f14337OooO00o);
                    if (oooO0o0Arr == null || oooO0o0Arr.length != 3) {
                        String str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(oooO0o0Arr);
                        return null;
                    }
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) oooO0o0Arr[0].OooO00o) / ((float) oooO0o0Arr[0].OooO0O0))), Integer.valueOf((int) (((float) oooO0o0Arr[1].OooO00o) / ((float) oooO0o0Arr[1].OooO0O0))), Integer.valueOf((int) (((float) oooO0o0Arr[2].OooO00o) / ((float) oooO0o0Arr[2].OooO0O0))));
                }
                String str3 = "GPS Timestamp format is not rational. format=" + OooO00o2.OooO00o;
                return null;
            }
            try {
                return Double.toString(OooO00o2.OooO00o(this.f14337OooO00o));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m14658OooO0O0() {
        InputStream inputStream;
        Throwable th;
        if (!this.f14339OooO00o) {
            return null;
        }
        byte[] bArr = this.f14340OooO00o;
        if (bArr != null) {
            return bArr;
        }
        try {
            if (this.f14335OooO00o != null) {
                inputStream = this.f14335OooO00o;
                try {
                    if (inputStream.markSupported()) {
                        inputStream.reset();
                    } else {
                        OooO00o((Closeable) inputStream);
                        return null;
                    }
                } catch (IOException unused) {
                    OooO00o((Closeable) inputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    OooO00o((Closeable) inputStream);
                    throw th;
                }
            } else {
                inputStream = this.f14336OooO00o != null ? new FileInputStream(this.f14336OooO00o) : null;
            }
            if (inputStream == null) {
                throw new FileNotFoundException();
            } else if (inputStream.skip((long) this.f14342OooO0O0) == ((long) this.f14342OooO0O0)) {
                byte[] bArr2 = new byte[this.f14344OooO0OO];
                if (inputStream.read(bArr2) == this.f14344OooO0OO) {
                    this.f14340OooO00o = bArr2;
                    OooO00o((Closeable) inputStream);
                    return bArr2;
                }
                throw new IOException("Corrupted image");
            } else {
                throw new IOException("Corrupted image");
            }
        } catch (IOException unused2) {
            inputStream = null;
            OooO00o((Closeable) inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            OooO00o((Closeable) inputStream);
            throw th;
        }
    }

    public static class OooO0OO {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final byte[] f14352OooO00o;
        public final int OooO0O0;

        public OooO0OO(int i, int i2, byte[] bArr) {
            this.OooO00o = i;
            this.OooO0O0 = i2;
            this.f14352OooO00o = bArr;
        }

        public static OooO0OO OooO00o(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.f14133OooO0Oo[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new OooO0OO(4, jArr.length, wrap.array());
        }

        public static OooO0OO OooO0O0(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.f14133OooO0Oo[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new OooO0OO(3, iArr.length, wrap.array());
        }

        public String toString() {
            return C3848l.f10401s + ExifInterface.f14111OooO00o[this.OooO00o] + ", data length:" + this.f14352OooO00o.length + C3848l.f10402t;
        }

        public static OooO0OO OooO00o(long j, ByteOrder byteOrder) {
            return OooO00o(new long[]{j}, byteOrder);
        }

        public static OooO0OO OooO0O0(int i, ByteOrder byteOrder) {
            return OooO0O0(new int[]{i}, byteOrder);
        }

        public static OooO0OO OooO00o(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.f14133OooO0Oo[9] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putInt(i);
            }
            return new OooO0OO(9, iArr.length, wrap.array());
        }

        public static OooO0OO OooO0O0(String str) {
            byte[] bytes = (str + (char) 0).getBytes(ExifInterface.f14102OooO00o);
            return new OooO0OO(2, bytes.length, bytes);
        }

        public static OooO0OO OooO0O0(C5045OooO0o0[] oooO0o0Arr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.f14133OooO0Oo[5] * oooO0o0Arr.length)]);
            wrap.order(byteOrder);
            for (C5045OooO0o0 oooO0o0 : oooO0o0Arr) {
                wrap.putInt((int) oooO0o0.OooO00o);
                wrap.putInt((int) oooO0o0.OooO0O0);
            }
            return new OooO0OO(5, oooO0o0Arr.length, wrap.array());
        }

        public static OooO0OO OooO00o(int i, ByteOrder byteOrder) {
            return OooO00o(new int[]{i}, byteOrder);
        }

        public static OooO0OO OooO00o(String str) {
            if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
                byte[] bytes = str.getBytes(ExifInterface.f14102OooO00o);
                return new OooO0OO(1, bytes.length, bytes);
            }
            return new OooO0OO(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }

        public static OooO0OO OooO0O0(C5045OooO0o0 oooO0o0, ByteOrder byteOrder) {
            return OooO0O0(new C5045OooO0o0[]{oooO0o0}, byteOrder);
        }

        public static OooO0OO OooO00o(C5045OooO0o0[] oooO0o0Arr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.f14133OooO0Oo[10] * oooO0o0Arr.length)]);
            wrap.order(byteOrder);
            for (C5045OooO0o0 oooO0o0 : oooO0o0Arr) {
                wrap.putInt((int) oooO0o0.OooO00o);
                wrap.putInt((int) oooO0o0.OooO0O0);
            }
            return new OooO0OO(10, oooO0o0Arr.length, wrap.array());
        }

        public static OooO0OO OooO00o(C5045OooO0o0 oooO0o0, ByteOrder byteOrder) {
            return OooO00o(new C5045OooO0o0[]{oooO0o0}, byteOrder);
        }

        public static OooO0OO OooO00o(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.f14133OooO0Oo[12] * dArr.length)]);
            wrap.order(byteOrder);
            for (double d : dArr) {
                wrap.putDouble(d);
            }
            return new OooO0OO(12, dArr.length, wrap.array());
        }

        public static OooO0OO OooO00o(double d, ByteOrder byteOrder) {
            return OooO00o(new double[]{d}, byteOrder);
        }

        /* JADX WARNING: Removed duplicated region for block: B:122:0x0157 A[SYNTHETIC, Splitter:B:122:0x0157] */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x015e A[SYNTHETIC, Splitter:B:130:0x015e] */
        /* renamed from: OooO00o  reason: collision with other method in class */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object m14661OooO00o(java.nio.ByteOrder r9) {
            /*
            // Method dump skipped, instructions count: 382
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.OooO0OO.m14661OooO00o(java.nio.ByteOrder):java.lang.Object");
        }

        public double OooO00o(ByteOrder byteOrder) {
            Object OooO00o2 = m14661OooO00o(byteOrder);
            if (OooO00o2 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (OooO00o2 instanceof String) {
                return Double.parseDouble((String) OooO00o2);
            } else {
                if (OooO00o2 instanceof long[]) {
                    long[] jArr = (long[]) OooO00o2;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (OooO00o2 instanceof int[]) {
                    int[] iArr = (int[]) OooO00o2;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (OooO00o2 instanceof double[]) {
                    double[] dArr = (double[]) OooO00o2;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (OooO00o2 instanceof C5045OooO0o0[]) {
                    C5045OooO0o0[] oooO0o0Arr = (C5045OooO0o0[]) OooO00o2;
                    if (oooO0o0Arr.length == 1) {
                        return oooO0o0Arr[0].OooO00o();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public int m14660OooO00o(ByteOrder byteOrder) {
            Object OooO00o2 = m14661OooO00o(byteOrder);
            if (OooO00o2 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (OooO00o2 instanceof String) {
                return Integer.parseInt((String) OooO00o2);
            } else {
                if (OooO00o2 instanceof long[]) {
                    long[] jArr = (long[]) OooO00o2;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (OooO00o2 instanceof int[]) {
                    int[] iArr = (int[]) OooO00o2;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m14662OooO00o(ByteOrder byteOrder) {
            Object OooO00o2 = m14661OooO00o(byteOrder);
            if (OooO00o2 == null) {
                return null;
            }
            if (OooO00o2 instanceof String) {
                return (String) OooO00o2;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (OooO00o2 instanceof long[]) {
                long[] jArr = (long[]) OooO00o2;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
                return sb.toString();
            } else if (OooO00o2 instanceof int[]) {
                int[] iArr = (int[]) OooO00o2;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
                return sb.toString();
            } else if (OooO00o2 instanceof double[]) {
                double[] dArr = (double[]) OooO00o2;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
                return sb.toString();
            } else if (!(OooO00o2 instanceof C5045OooO0o0[])) {
                return null;
            } else {
                C5045OooO0o0[] oooO0o0Arr = (C5045OooO0o0[]) OooO00o2;
                while (i < oooO0o0Arr.length) {
                    sb.append(oooO0o0Arr[i].OooO00o);
                    sb.append('/');
                    sb.append(oooO0o0Arr[i].OooO0O0);
                    i++;
                    if (i != oooO0o0Arr.length) {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
                return sb.toString();
            }
        }

        public int OooO00o() {
            return ExifInterface.f14133OooO0Oo[this.OooO00o] * this.OooO0O0;
        }
    }

    /* renamed from: androidx.exifinterface.media.ExifInterface$OooO0Oo  reason: case insensitive filesystem */
    public static class C5044OooO0Oo {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f14353OooO00o;
        public final int OooO0O0;
        public final int OooO0OO;

        public C5044OooO0Oo(String str, int i, int i2) {
            this.f14353OooO00o = str;
            this.OooO00o = i;
            this.OooO0O0 = i2;
            this.OooO0OO = -1;
        }

        public boolean OooO00o(int i) {
            int i2;
            int i3 = this.OooO0O0;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.OooO0OO) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((this.OooO0O0 == 9 || this.OooO0OO == 9) && i == 8) {
                return true;
            }
            if ((this.OooO0O0 == 12 || this.OooO0OO == 12) && i == 11) {
                return true;
            }
            return false;
        }

        public C5044OooO0Oo(String str, int i, int i2, int i3) {
            this.f14353OooO00o = str;
            this.OooO00o = i;
            this.OooO0O0 = i2;
            this.OooO0OO = i3;
        }
    }

    private void OooO0OO(OooO00o oooO00o) throws IOException {
        OooO0OO oooO0OO;
        OooO00o(oooO00o, oooO00o.available());
        OooO0O0(oooO00o, 0);
        OooO0Oo(oooO00o, 0);
        OooO0Oo(oooO00o, 5);
        OooO0Oo(oooO00o, 4);
        OooO0O0((InputStream) oooO00o);
        if (this.f14334OooO00o == 8 && (oooO0OO = this.f14341OooO00o[1].get(f14225Oooo0oo)) != null) {
            OooO00o oooO00o2 = new OooO00o(oooO0OO.f14352OooO00o);
            oooO00o2.OooO00o(this.f14337OooO00o);
            oooO00o2.OooO0OO(6);
            OooO0O0(oooO00o2, 9);
            OooO0OO oooO0OO2 = this.f14341OooO00o[9].get(f14207Oooo0);
            if (oooO0OO2 != null) {
                this.f14341OooO00o[1].put(f14207Oooo0, oooO0OO2);
            }
        }
    }

    public ExifInterface(@NonNull InputStream inputStream) throws IOException {
        this.f14341OooO00o = new HashMap[f14112OooO00o.length];
        this.f14338OooO00o = new HashSet(f14112OooO00o.length);
        this.f14337OooO00o = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f14336OooO00o = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f14335OooO00o = (AssetManager.AssetInputStream) inputStream;
            } else {
                this.f14335OooO00o = null;
            }
            OooO00o(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }

    public int OooO00o(@NonNull String str, int i) {
        OooO0OO OooO00o2 = m14641OooO00o(str);
        if (OooO00o2 == null) {
            return i;
        }
        try {
            return OooO00o2.m14660OooO00o(this.f14337OooO00o);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    private boolean OooO0Oo(byte[] bArr) throws IOException {
        OooO00o oooO00o = new OooO00o(bArr);
        ByteOrder OooO00o2 = OooO00o(oooO00o);
        this.f14337OooO00o = OooO00o2;
        oooO00o.OooO00o(OooO00o2);
        short readShort = oooO00o.readShort();
        oooO00o.close();
        return readShort == 85;
    }

    public double OooO00o(@NonNull String str, double d) {
        OooO0OO OooO00o2 = m14641OooO00o(str);
        if (OooO00o2 == null) {
            return d;
        }
        try {
            return OooO00o2.OooO00o(this.f14337OooO00o);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    private void OooO0OO(OooO00o oooO00o, int i) throws IOException {
        OooO0OO oooO0OO;
        OooO0OO oooO0OO2 = this.f14341OooO00o[i].get(f14130OooO0Oo);
        OooO0OO oooO0OO3 = this.f14341OooO00o[i].get(f14123OooO0OO);
        if ((oooO0OO2 == null || oooO0OO3 == null) && (oooO0OO = this.f14341OooO00o[i].get(f14178OooOOoo)) != null) {
            OooO00o(oooO00o, oooO0OO.m14660OooO00o(this.f14337OooO00o), i);
        }
    }

    private void OooO0o0(OooO00o oooO00o) throws IOException {
        HashMap<String, OooO0OO> hashMap = this.f14341OooO00o[4];
        OooO0OO oooO0OO = hashMap.get(f14135OooO0o);
        if (oooO0OO != null) {
            int OooO00o2 = oooO0OO.m14660OooO00o(this.f14337OooO00o);
            this.f14345OooO0Oo = OooO00o2;
            if (OooO00o2 != 1) {
                if (OooO00o2 == 6) {
                    OooO00o(oooO00o, hashMap);
                    return;
                } else if (OooO00o2 != 7) {
                    return;
                }
            }
            if (OooO00o((HashMap) hashMap)) {
                OooO0O0(oooO00o, hashMap);
                return;
            }
            return;
        }
        this.f14345OooO0Oo = 6;
        OooO00o(oooO00o, hashMap);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public long OooO0O0() {
        String OooO00o2 = m14648OooO00o(o000O0oO);
        String OooO00o3 = m14648OooO00o(o0000o0O);
        if (!(OooO00o2 == null || OooO00o3 == null || (!f14107OooO00o.matcher(OooO00o2).matches() && !f14107OooO00o.matcher(OooO00o3).matches()))) {
            try {
                Date parse = f14103OooO00o.parse(OooO00o2 + ' ' + OooO00o3, new ParsePosition(0));
                if (parse == null) {
                    return -1;
                }
                return parse.getTime();
            } catch (IllegalArgumentException unused) {
            }
        }
        return -1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14651OooO00o(@NonNull String str, @Nullable String str2) {
        C5044OooO0Oo oooO0Oo;
        int i;
        String str3 = str2;
        String str4 = f14245OoooOoo.equals(str) ? f14247Ooooo00 : str;
        int i2 = 2;
        int i3 = 1;
        if (str3 != null && f14105OooO00o.contains(str4)) {
            if (str4.equals(o0000o0O)) {
                Matcher matcher = f14116OooO0O0.matcher(str3);
                if (!matcher.find()) {
                    String str5 = "Invalid value for " + str4 + " : " + str3;
                    return;
                }
                str3 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str3 = new C5045OooO0o0(Double.parseDouble(str2)).toString();
                } catch (NumberFormatException unused) {
                    String str6 = "Invalid value for " + str4 + " : " + str3;
                    return;
                }
            }
        }
        int i4 = 0;
        while (i4 < f14112OooO00o.length) {
            if ((i4 != 4 || this.f14339OooO00o) && (oooO0Oo = f14129OooO0OO[i4].get(str4)) != null) {
                if (str3 == null) {
                    this.f14341OooO00o[i4].remove(str4);
                } else {
                    Pair<Integer, Integer> OooO00o2 = OooO00o(str3);
                    if (oooO0Oo.OooO0O0 == ((Integer) OooO00o2.first).intValue() || oooO0Oo.OooO0O0 == ((Integer) OooO00o2.second).intValue()) {
                        i = oooO0Oo.OooO0O0;
                    } else {
                        int i5 = oooO0Oo.OooO0OO;
                        if (i5 == -1 || !(i5 == ((Integer) OooO00o2.first).intValue() || oooO0Oo.OooO0OO == ((Integer) OooO00o2.second).intValue())) {
                            int i6 = oooO0Oo.OooO0O0;
                            if (i6 == i3 || i6 == 7 || i6 == i2) {
                                i = oooO0Oo.OooO0O0;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Given tag (");
                                sb.append(str4);
                                sb.append(") value didn't match with one of expected ");
                                sb.append("formats: ");
                                sb.append(f14111OooO00o[oooO0Oo.OooO0O0]);
                                String str7 = "";
                                sb.append(oooO0Oo.OooO0OO == -1 ? str7 : ", " + f14111OooO00o[oooO0Oo.OooO0OO]);
                                sb.append(" (guess: ");
                                sb.append(f14111OooO00o[((Integer) OooO00o2.first).intValue()]);
                                if (((Integer) OooO00o2.second).intValue() != -1) {
                                    str7 = ", " + f14111OooO00o[((Integer) OooO00o2.second).intValue()];
                                }
                                sb.append(str7);
                                sb.append(C3848l.f10402t);
                                sb.toString();
                            }
                        } else {
                            i = oooO0Oo.OooO0OO;
                        }
                    }
                    switch (i) {
                        case 1:
                            this.f14341OooO00o[i4].put(str4, OooO0OO.OooO00o(str3));
                            continue;
                        case 2:
                        case 7:
                            this.f14341OooO00o[i4].put(str4, OooO0OO.OooO0O0(str3));
                            continue;
                        case 3:
                            String[] split = str3.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            int[] iArr = new int[split.length];
                            for (int i7 = 0; i7 < split.length; i7++) {
                                iArr[i7] = Integer.parseInt(split[i7]);
                            }
                            this.f14341OooO00o[i4].put(str4, OooO0OO.OooO0O0(iArr, this.f14337OooO00o));
                            continue;
                        case 4:
                            String[] split2 = str3.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            long[] jArr = new long[split2.length];
                            for (int i8 = 0; i8 < split2.length; i8++) {
                                jArr[i8] = Long.parseLong(split2[i8]);
                            }
                            this.f14341OooO00o[i4].put(str4, OooO0OO.OooO00o(jArr, this.f14337OooO00o));
                            continue;
                        case 5:
                            String[] split3 = str3.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            C5045OooO0o0[] oooO0o0Arr = new C5045OooO0o0[split3.length];
                            for (int i9 = 0; i9 < split3.length; i9++) {
                                String[] split4 = split3[i9].split(C8932ooOOO0o.OooO0OO, -1);
                                oooO0o0Arr[i9] = new C5045OooO0o0((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                            }
                            this.f14341OooO00o[i4].put(str4, OooO0OO.OooO0O0(oooO0o0Arr, this.f14337OooO00o));
                            continue;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            String str8 = "Data format isn't one of expected formats: " + i;
                            continue;
                        case 9:
                            String[] split5 = str3.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i10 = 0; i10 < split5.length; i10++) {
                                iArr2[i10] = Integer.parseInt(split5[i10]);
                            }
                            this.f14341OooO00o[i4].put(str4, OooO0OO.OooO00o(iArr2, this.f14337OooO00o));
                            continue;
                        case 10:
                            String[] split6 = str3.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            C5045OooO0o0[] oooO0o0Arr2 = new C5045OooO0o0[split6.length];
                            int i11 = 0;
                            while (i11 < split6.length) {
                                String[] split7 = split6[i11].split(C8932ooOOO0o.OooO0OO, -1);
                                oooO0o0Arr2[i11] = new C5045OooO0o0((long) Double.parseDouble(split7[0]), (long) Double.parseDouble(split7[i3]));
                                i11++;
                                i3 = 1;
                            }
                            this.f14341OooO00o[i4].put(str4, OooO0OO.OooO00o(oooO0o0Arr2, this.f14337OooO00o));
                            continue;
                        case 12:
                            String[] split8 = str3.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
                            double[] dArr = new double[split8.length];
                            for (int i12 = 0; i12 < split8.length; i12++) {
                                dArr[i12] = Double.parseDouble(split8[i12]);
                            }
                            this.f14341OooO00o[i4].put(str4, OooO0OO.OooO00o(dArr, this.f14337OooO00o));
                            continue;
                    }
                }
            }
            i4++;
            i2 = 2;
            i3 = 1;
        }
    }

    private void OooO0Oo(OooO00o oooO00o) throws IOException {
        OooO0OO(oooO00o);
        if (this.f14341OooO00o[0].get(o000Oooo) != null) {
            OooO00o(oooO00o, this.f14333OooO, 5);
        }
        OooO0OO oooO0OO = this.f14341OooO00o[0].get(o000OooO);
        OooO0OO oooO0OO2 = this.f14341OooO00o[1].get(f14247Ooooo00);
        if (oooO0OO != null && oooO0OO2 == null) {
            this.f14341OooO00o[1].put(f14247Ooooo00, oooO0OO);
        }
    }

    private boolean OooO0O0(byte[] bArr) throws IOException {
        OooO00o oooO00o = new OooO00o(bArr);
        ByteOrder OooO00o2 = OooO00o(oooO00o);
        this.f14337OooO00o = OooO00o2;
        oooO00o.OooO00o(OooO00o2);
        short readShort = oooO00o.readShort();
        oooO00o.close();
        return readShort == 20306 || readShort == 21330;
    }

    private void OooO0Oo(OooO00o oooO00o, int i) throws IOException {
        OooO0OO oooO0OO;
        OooO0OO oooO0OO2;
        OooO0OO oooO0OO3 = this.f14341OooO00o[i].get(o000OOo0);
        OooO0OO oooO0OO4 = this.f14341OooO00o[i].get(o000Ooo0);
        OooO0OO oooO0OO5 = this.f14341OooO00o[i].get(o000OoOO);
        OooO0OO oooO0OO6 = this.f14341OooO00o[i].get(o000Oo);
        OooO0OO oooO0OO7 = this.f14341OooO00o[i].get(o000OoOo);
        if (oooO0OO3 != null) {
            if (oooO0OO3.OooO00o == 5) {
                C5045OooO0o0[] oooO0o0Arr = (C5045OooO0o0[]) oooO0OO3.m14661OooO00o(this.f14337OooO00o);
                if (oooO0o0Arr == null || oooO0o0Arr.length != 2) {
                    String str = "Invalid crop size values. cropSize=" + Arrays.toString(oooO0o0Arr);
                    return;
                }
                oooO0OO2 = OooO0OO.OooO0O0(oooO0o0Arr[0], this.f14337OooO00o);
                oooO0OO = OooO0OO.OooO0O0(oooO0o0Arr[1], this.f14337OooO00o);
            } else {
                int[] iArr = (int[]) oooO0OO3.m14661OooO00o(this.f14337OooO00o);
                if (iArr == null || iArr.length != 2) {
                    String str2 = "Invalid crop size values. cropSize=" + Arrays.toString(iArr);
                    return;
                }
                oooO0OO2 = OooO0OO.OooO0O0(iArr[0], this.f14337OooO00o);
                oooO0OO = OooO0OO.OooO0O0(iArr[1], this.f14337OooO00o);
            }
            this.f14341OooO00o[i].put(f14123OooO0OO, oooO0OO2);
            this.f14341OooO00o[i].put(f14130OooO0Oo, oooO0OO);
        } else if (oooO0OO4 == null || oooO0OO5 == null || oooO0OO6 == null || oooO0OO7 == null) {
            OooO0OO(oooO00o, i);
        } else {
            int OooO00o2 = oooO0OO4.m14660OooO00o(this.f14337OooO00o);
            int OooO00o3 = oooO0OO6.m14660OooO00o(this.f14337OooO00o);
            int OooO00o4 = oooO0OO7.m14660OooO00o(this.f14337OooO00o);
            int OooO00o5 = oooO0OO5.m14660OooO00o(this.f14337OooO00o);
            if (OooO00o3 > OooO00o2 && OooO00o4 > OooO00o5) {
                OooO0OO OooO0O02 = OooO0OO.OooO0O0(OooO00o3 - OooO00o2, this.f14337OooO00o);
                OooO0OO OooO0O03 = OooO0OO.OooO0O0(OooO00o4 - OooO00o5, this.f14337OooO00o);
                this.f14341OooO00o[i].put(f14130OooO0Oo, OooO0O02);
                this.f14341OooO00o[i].put(f14123OooO0OO, OooO0O03);
            }
        }
    }

    private void OooO0O0(OooO00o oooO00o) throws IOException {
        oooO00o.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        oooO00o.read(bArr);
        oooO00o.skipBytes(4);
        oooO00o.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        OooO00o(oooO00o, i, 5);
        oooO00o.OooO0OO((long) i2);
        oooO00o.OooO00o(ByteOrder.BIG_ENDIAN);
        int readInt = oooO00o.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = oooO00o.readUnsignedShort();
            int readUnsignedShort2 = oooO00o.readUnsignedShort();
            if (readUnsignedShort == f14101OooO00o.OooO00o) {
                short readShort = oooO00o.readShort();
                short readShort2 = oooO00o.readShort();
                OooO0OO OooO0O02 = OooO0OO.OooO0O0(readShort, this.f14337OooO00o);
                OooO0OO OooO0O03 = OooO0OO.OooO0O0(readShort2, this.f14337OooO00o);
                this.f14341OooO00o[0].put(f14130OooO0Oo, OooO0O02);
                this.f14341OooO00o[0].put(f14123OooO0OO, OooO0O03);
                return;
            }
            oooO00o.skipBytes(readUnsignedShort2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO0O0(androidx.exifinterface.media.ExifInterface.OooO00o r25, int r26) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 760
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.OooO0O0(androidx.exifinterface.media.ExifInterface$OooO00o, int):void");
    }

    public void OooO00o(int i) {
        if (i % 90 == 0) {
            int OooO00o2 = OooO00o(f14146OooO0oo, 1);
            int i2 = 0;
            if (f14106OooO00o.contains(Integer.valueOf(OooO00o2))) {
                int indexOf = (f14106OooO00o.indexOf(Integer.valueOf(OooO00o2)) + (i / 90)) % 4;
                if (indexOf < 0) {
                    i2 = 4;
                }
                i2 = f14106OooO00o.get(indexOf + i2).intValue();
            } else if (f14115OooO0O0.contains(Integer.valueOf(OooO00o2))) {
                int indexOf2 = (f14115OooO0O0.indexOf(Integer.valueOf(OooO00o2)) + (i / 90)) % 4;
                if (indexOf2 < 0) {
                    i2 = 4;
                }
                i2 = f14115OooO0O0.get(indexOf2 + i2).intValue();
            }
            m14651OooO00o(f14146OooO0oo, Integer.toString(i2));
            return;
        }
        throw new IllegalArgumentException("degree should be a multiple of 90");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14649OooO00o() {
        int i = 1;
        switch (OooO00o(f14146OooO0oo, 1)) {
            case 1:
                i = 2;
                break;
            case 2:
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        m14651OooO00o(f14146OooO0oo, Integer.toString(i));
    }

    public int OooO00o() {
        switch (OooO00o(f14146OooO0oo, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    private boolean OooO00o(String str, OooO0OO oooO0OO) {
        boolean z = false;
        for (int i = 0; i < f14112OooO00o.length; i++) {
            if (this.f14341OooO00o[i].containsKey(str)) {
                this.f14341OooO00o[i].put(str, oooO0OO);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m14644OooO00o(String str) {
        for (int i = 0; i < f14112OooO00o.length; i++) {
            this.f14341OooO00o[i].remove(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.f14343OooO0O0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        OooO0o0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        throw r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO00o(@androidx.annotation.NonNull java.io.InputStream r5) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.OooO00o(java.io.InputStream):void");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14652OooO00o() {
        return this.f14339OooO00o;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m14653OooO00o() {
        int i = this.f14345OooO0Oo;
        if (i == 6 || i == 7) {
            return m14658OooO0O0();
        }
        return null;
    }

    private void OooO0O0(OooO00o oooO00o, HashMap hashMap) throws IOException {
        OooO0OO oooO0OO = (OooO0OO) hashMap.get(f14169OooOOOo);
        OooO0OO oooO0OO2 = (OooO0OO) hashMap.get(f14172OooOOo);
        if (!(oooO0OO == null || oooO0OO2 == null)) {
            long[] OooO00o2 = OooO00o(oooO0OO.m14661OooO00o(this.f14337OooO00o));
            long[] OooO00o3 = OooO00o(oooO0OO2.m14661OooO00o(this.f14337OooO00o));
            if (!(OooO00o2 == null || OooO00o3 == null)) {
                long j = 0;
                for (long j2 : OooO00o3) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < OooO00o2.length; i4++) {
                    int i5 = (int) OooO00o2[i4];
                    int i6 = (int) OooO00o3[i4];
                    int i7 = i5 - i2;
                    oooO00o.OooO0OO((long) i7);
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    oooO00o.read(bArr2);
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, i6);
                    i3 += i6;
                }
                this.f14339OooO00o = true;
                this.f14340OooO00o = bArr;
                this.f14344OooO0OO = i;
            }
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Bitmap m14647OooO00o() {
        if (!this.f14339OooO00o) {
            return null;
        }
        if (this.f14340OooO00o == null) {
            this.f14340OooO00o = m14658OooO0O0();
        }
        int i = this.f14345OooO0Oo;
        if (i == 6 || i == 7) {
            return BitmapFactory.decodeByteArray(this.f14340OooO00o, 0, this.f14344OooO0OO);
        }
        if (i == 1) {
            int length = this.f14340OooO00o.length / 3;
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                byte[] bArr = this.f14340OooO00o;
                int i3 = i2 * 3;
                iArr[i2] = (bArr[i3] << 16) + 0 + (bArr[i3 + 1] << 8) + bArr[i3 + 2];
            }
            OooO0OO oooO0OO = this.f14341OooO00o[4].get(f14130OooO0Oo);
            OooO0OO oooO0OO2 = this.f14341OooO00o[4].get(f14123OooO0OO);
            if (!(oooO0OO == null || oooO0OO2 == null)) {
                return Bitmap.createBitmap(iArr, oooO0OO2.m14660OooO00o(this.f14337OooO00o), oooO0OO.m14660OooO00o(this.f14337OooO00o), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public long[] m14655OooO00o() {
        if (!this.f14339OooO00o) {
            return null;
        }
        return new long[]{(long) this.f14342OooO0O0, (long) this.f14344OooO0OO};
    }

    private boolean OooO0O0(HashMap hashMap) throws IOException {
        OooO0OO oooO0OO = (OooO0OO) hashMap.get(f14130OooO0Oo);
        OooO0OO oooO0OO2 = (OooO0OO) hashMap.get(f14123OooO0OO);
        if (oooO0OO == null || oooO0OO2 == null) {
            return false;
        }
        return oooO0OO.m14660OooO00o(this.f14337OooO00o) <= 512 && oooO0OO2.m14660OooO00o(this.f14337OooO00o) <= 512;
    }

    @Deprecated
    public boolean OooO00o(float[] fArr) {
        double[] OooO00o2 = m14654OooO00o();
        if (OooO00o2 == null) {
            return false;
        }
        fArr[0] = (float) OooO00o2[0];
        fArr[1] = (float) OooO00o2[1];
        return true;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public double[] m14654OooO00o() {
        String OooO00o2 = m14648OooO00o(o0000OOo);
        String OooO00o3 = m14648OooO00o(o0000OOO);
        String OooO00o4 = m14648OooO00o(o0000Oo);
        String OooO00o5 = m14648OooO00o(o0000Oo0);
        if (OooO00o2 == null || OooO00o3 == null || OooO00o4 == null || OooO00o5 == null) {
            return null;
        }
        try {
            return new double[]{OooO00o(OooO00o2, OooO00o3), OooO00o(OooO00o4, OooO00o5)};
        } catch (IllegalArgumentException unused) {
            String str = "Latitude/longitude values are not parseable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", OooO00o2, OooO00o3, OooO00o4, OooO00o5);
            return null;
        }
    }

    private void OooO0O0(InputStream inputStream) throws IOException {
        OooO00o(0, 5);
        OooO00o(0, 4);
        OooO00o(5, 4);
        OooO0OO oooO0OO = this.f14341OooO00o[1].get(f14217Oooo0OO);
        OooO0OO oooO0OO2 = this.f14341OooO00o[1].get(f14221Oooo0o0);
        if (!(oooO0OO == null || oooO0OO2 == null)) {
            this.f14341OooO00o[0].put(f14123OooO0OO, oooO0OO);
            this.f14341OooO00o[0].put(f14130OooO0Oo, oooO0OO2);
        }
        if (this.f14341OooO00o[4].isEmpty() && OooO0O0(this.f14341OooO00o[5])) {
            HashMap<String, OooO0OO>[] hashMapArr = this.f14341OooO00o;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        OooO0O0(this.f14341OooO00o[4]);
    }

    public void OooO00o(Location location) {
        if (location != null) {
            m14651OooO00o(o000O0O0, location.getProvider());
            OooO00o(location.getLatitude(), location.getLongitude());
            m14650OooO00o(location.getAltitude());
            m14651OooO00o(o0000oOo, "K");
            m14651OooO00o(o0000oo0, new C5045OooO0o0((double) ((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1))) / 1000.0f)).toString());
            String[] split = f14103OooO00o.format(new Date(location.getTime())).split("\\s+", -1);
            m14651OooO00o(o000O0oO, split[0]);
            m14651OooO00o(o0000o0O, split[1]);
        }
    }

    public void OooO00o(double d, double d2) {
        if (d < -90.0d || d > 90.0d || Double.isNaN(d)) {
            throw new IllegalArgumentException("Latitude value " + d + " is not valid.");
        } else if (d2 < -180.0d || d2 > 180.0d || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Longitude value " + d2 + " is not valid.");
        } else {
            m14651OooO00o(o0000OOO, d >= AbstractC8352oOoOOoO0.OooO0O0 ? "N" : o000oOoo);
            m14651OooO00o(o0000OOo, OooO00o(Math.abs(d)));
            m14651OooO00o(o0000Oo0, d2 >= AbstractC8352oOoOOoO0.OooO0O0 ? o000oo00 : o000oo0);
            m14651OooO00o(o0000Oo, OooO00o(Math.abs(d2)));
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public double m14645OooO00o(double d) {
        double OooO00o2 = OooO00o(o0000o0, -1.0d);
        int i = -1;
        int OooO00o3 = OooO00o(o0000OoO, -1);
        if (OooO00o2 < AbstractC8352oOoOOoO0.OooO0O0 || OooO00o3 < 0) {
            return d;
        }
        if (OooO00o3 != 1) {
            i = 1;
        }
        double d2 = (double) i;
        Double.isNaN(d2);
        return OooO00o2 * d2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14650OooO00o(double d) {
        String str = d >= AbstractC8352oOoOOoO0.OooO0O0 ? "0" : "1";
        m14651OooO00o(o0000o0, new C5045OooO0o0(Math.abs(d)).toString());
        m14651OooO00o(o0000OoO, str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void OooO00o(long j) {
        m14651OooO00o(f14191OooOoO, f14103OooO00o.format(new Date(j)));
        m14651OooO00o(f14227OoooO, Long.toString(j % 1000));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m14646OooO00o() {
        String OooO00o2 = m14648OooO00o(f14191OooOoO);
        if (OooO00o2 != null && f14107OooO00o.matcher(OooO00o2).matches()) {
            try {
                Date parse = f14103OooO00o.parse(OooO00o2, new ParsePosition(0));
                if (parse == null) {
                    return -1;
                }
                long time = parse.getTime();
                String OooO00o3 = m14648OooO00o(f14227OoooO);
                if (OooO00o3 == null) {
                    return time;
                }
                try {
                    long parseLong = Long.parseLong(OooO00o3);
                    while (parseLong > 1000) {
                        parseLong /= 10;
                    }
                    return time + parseLong;
                } catch (NumberFormatException unused) {
                    return time;
                }
            } catch (IllegalArgumentException unused2) {
            }
        }
        return -1;
    }

    public static double OooO00o(String str, String str2) {
        try {
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1);
            String[] split2 = split[0].split(C8932ooOOO0o.OooO0OO, -1);
            String[] split3 = split[1].split(C8932ooOOO0o.OooO0OO, -1);
            String[] split4 = split[2].split(C8932ooOOO0o.OooO0OO, -1);
            double parseDouble = (Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim())) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals(o000oOoo)) {
                if (!str2.equals(o000oo0)) {
                    if (!str2.equals("N")) {
                        if (!str2.equals(o000oo00)) {
                            throw new IllegalArgumentException();
                        }
                    }
                    return parseDouble;
                }
            }
            return -parseDouble;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private String OooO00o(double d) {
        long j = (long) d;
        double d2 = (double) j;
        Double.isNaN(d2);
        double d3 = d - d2;
        long j2 = (long) (d3 * 60.0d);
        double d4 = (double) j2;
        Double.isNaN(d4);
        long round = Math.round((d3 - (d4 / 60.0d)) * 3600.0d * 1.0E7d);
        return j + "/1," + j2 + "/1," + round + "/10000000";
    }

    private int OooO00o(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (OooO00o(bArr)) {
            return 4;
        }
        if (OooO0OO(bArr)) {
            return 9;
        }
        if (OooO0O0(bArr)) {
            return 7;
        }
        return OooO0Oo(bArr) ? 10 : 0;
    }

    public static boolean OooO00o(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f14118OooO0O0;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO00o(androidx.exifinterface.media.ExifInterface.OooO00o r10, int r11, int r12) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 410
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.OooO00o(androidx.exifinterface.media.ExifInterface$OooO00o, int, int):void");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m14642OooO00o(OooO00o oooO00o) throws IOException {
        OooO0OO(oooO00o);
        OooO0OO oooO0OO = this.f14341OooO00o[1].get(f14225Oooo0oo);
        if (oooO0OO != null) {
            OooO00o oooO00o2 = new OooO00o(oooO0OO.f14352OooO00o);
            oooO00o2.OooO00o(this.f14337OooO00o);
            byte[] bArr = new byte[f14126OooO0OO.length];
            oooO00o2.readFully(bArr);
            oooO00o2.OooO0OO(0);
            byte[] bArr2 = new byte[f14132OooO0Oo.length];
            oooO00o2.readFully(bArr2);
            if (Arrays.equals(bArr, f14126OooO0OO)) {
                oooO00o2.OooO0OO(8);
            } else if (Arrays.equals(bArr2, f14132OooO0Oo)) {
                oooO00o2.OooO0OO(12);
            }
            OooO0O0(oooO00o2, 6);
            OooO0OO oooO0OO2 = this.f14341OooO00o[7].get(o000Oo00);
            OooO0OO oooO0OO3 = this.f14341OooO00o[7].get(o000Oo0O);
            if (!(oooO0OO2 == null || oooO0OO3 == null)) {
                this.f14341OooO00o[5].put(f14178OooOOoo, oooO0OO2);
                this.f14341OooO00o[5].put(f14185OooOo00, oooO0OO3);
            }
            OooO0OO oooO0OO4 = this.f14341OooO00o[8].get(o000Oo0o);
            if (oooO0OO4 != null) {
                int[] iArr = (int[]) oooO0OO4.m14661OooO00o(this.f14337OooO00o);
                if (iArr == null || iArr.length != 4) {
                    String str = "Invalid aspect frame values. frame=" + Arrays.toString(iArr);
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i = (iArr[2] - iArr[0]) + 1;
                    int i2 = (iArr[3] - iArr[1]) + 1;
                    if (i < i2) {
                        int i3 = i + i2;
                        i2 = i3 - i2;
                        i = i3 - i2;
                    }
                    OooO0OO OooO0O02 = OooO0OO.OooO0O0(i, this.f14337OooO00o);
                    OooO0OO OooO0O03 = OooO0OO.OooO0O0(i2, this.f14337OooO00o);
                    this.f14341OooO00o[0].put(f14123OooO0OO, OooO0O02);
                    this.f14341OooO00o[0].put(f14130OooO0Oo, OooO0O03);
                }
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m14643OooO00o(InputStream inputStream, OutputStream outputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        OooO0O0 oooO0O0 = new OooO0O0(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() == -1) {
            oooO0O0.OooO00o(-1);
            if (dataInputStream.readByte() == -40) {
                oooO0O0.OooO00o(-40);
                oooO0O0.OooO00o(-1);
                oooO0O0.OooO00o(-31);
                OooO00o(oooO0O0, 6);
                byte[] bArr = new byte[4096];
                while (dataInputStream.readByte() == -1) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte == -39 || readByte == -38) {
                        oooO0O0.OooO00o(-1);
                        oooO0O0.OooO00o((int) readByte);
                        OooO00o((InputStream) dataInputStream, (OutputStream) oooO0O0);
                        return;
                    } else if (readByte != -31) {
                        oooO0O0.OooO00o(-1);
                        oooO0O0.OooO00o((int) readByte);
                        int readUnsignedShort = dataInputStream.readUnsignedShort();
                        oooO0O0.OooO0OO(readUnsignedShort);
                        int i = readUnsignedShort - 2;
                        if (i >= 0) {
                            while (i > 0) {
                                int read = dataInputStream.read(bArr, 0, Math.min(i, 4096));
                                if (read < 0) {
                                    break;
                                }
                                oooO0O0.write(bArr, 0, read);
                                i -= read;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                        if (readUnsignedShort2 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (readUnsignedShort2 >= 6) {
                                if (dataInputStream.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, f14137OooO0o)) {
                                    int i2 = readUnsignedShort2 - 6;
                                    if (dataInputStream.skipBytes(i2) != i2) {
                                        throw new IOException("Invalid length");
                                    }
                                }
                            }
                            oooO0O0.OooO00o(-1);
                            oooO0O0.OooO00o((int) readByte);
                            oooO0O0.OooO0OO(readUnsignedShort2 + 2);
                            if (readUnsignedShort2 >= 6) {
                                readUnsignedShort2 -= 6;
                                oooO0O0.write(bArr2);
                            }
                            while (readUnsignedShort2 > 0) {
                                int read2 = dataInputStream.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                if (read2 < 0) {
                                    break;
                                }
                                oooO0O0.write(bArr, 0, read2);
                                readUnsignedShort2 -= read2;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    private void OooO00o(byte[] bArr, int i) throws IOException {
        OooO00o oooO00o = new OooO00o(bArr);
        OooO00o(oooO00o, bArr.length);
        OooO0O0(oooO00o, i);
    }

    private ByteOrder OooO00o(OooO00o oooO00o) throws IOException {
        short readShort = oooO00o.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void OooO00o(OooO00o oooO00o, int i) throws IOException {
        ByteOrder OooO00o2 = OooO00o(oooO00o);
        this.f14337OooO00o = OooO00o2;
        oooO00o.OooO00o(OooO00o2);
        int readUnsignedShort = oooO00o.readUnsignedShort();
        int i2 = this.f14334OooO00o;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = oooO00o.readInt();
            if (readInt < 8 || readInt >= i) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i3 = readInt - 8;
            if (i3 > 0 && oooO00o.skipBytes(i3) != i3) {
                throw new IOException("Couldn't jump to first Ifd: " + i3);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    private void OooO00o(OooO00o oooO00o, HashMap hashMap) throws IOException {
        int i;
        OooO0OO oooO0OO = (OooO0OO) hashMap.get(f14178OooOOoo);
        OooO0OO oooO0OO2 = (OooO0OO) hashMap.get(f14185OooOo00);
        if (oooO0OO != null && oooO0OO2 != null) {
            int OooO00o2 = oooO0OO.m14660OooO00o(this.f14337OooO00o);
            int min = Math.min(oooO0OO2.m14660OooO00o(this.f14337OooO00o), oooO00o.available() - OooO00o2);
            int i2 = this.f14334OooO00o;
            if (i2 == 4 || i2 == 9 || i2 == 10) {
                i = this.f14347OooO0o0;
            } else {
                if (i2 == 7) {
                    i = this.f14346OooO0o;
                }
                if (OooO00o2 > 0 && min > 0) {
                    this.f14339OooO00o = true;
                    this.f14342OooO0O0 = OooO00o2;
                    this.f14344OooO0OO = min;
                    if (this.f14336OooO00o == null && this.f14335OooO00o == null) {
                        byte[] bArr = new byte[min];
                        oooO00o.OooO0OO((long) OooO00o2);
                        oooO00o.readFully(bArr);
                        this.f14340OooO00o = bArr;
                        return;
                    }
                    return;
                }
            }
            OooO00o2 += i;
            if (OooO00o2 > 0) {
            }
        }
    }

    private boolean OooO00o(HashMap hashMap) throws IOException {
        OooO0OO oooO0OO;
        OooO0OO oooO0OO2 = (OooO0OO) hashMap.get(f14139OooO0o0);
        if (oooO0OO2 == null) {
            return false;
        }
        int[] iArr = (int[]) oooO0OO2.m14661OooO00o(this.f14337OooO00o);
        if (Arrays.equals(f14109OooO00o, iArr)) {
            return true;
        }
        if (this.f14334OooO00o != 3 || (oooO0OO = (OooO0OO) hashMap.get(f14143OooO0oO)) == null) {
            return false;
        }
        int OooO00o2 = oooO0OO.m14660OooO00o(this.f14337OooO00o);
        if ((OooO00o2 != 1 || !Arrays.equals(iArr, f14127OooO0OO)) && (OooO00o2 != 6 || !Arrays.equals(iArr, f14109OooO00o))) {
            return false;
        }
        return true;
    }

    private int OooO00o(OooO0O0 oooO0O0, int i) throws IOException {
        C5044OooO0Oo[][] oooO0OoArr = f14112OooO00o;
        int[] iArr = new int[oooO0OoArr.length];
        int[] iArr2 = new int[oooO0OoArr.length];
        for (C5044OooO0Oo oooO0Oo : f14152OooOO0) {
            m14644OooO00o(oooO0Oo.f14353OooO00o);
        }
        m14644OooO00o(f14113OooO0O0.f14353OooO00o);
        m14644OooO00o(f14122OooO0OO.f14353OooO00o);
        for (int i2 = 0; i2 < f14112OooO00o.length; i2++) {
            for (Object obj : this.f14341OooO00o[i2].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f14341OooO00o[i2].remove(entry.getKey());
                }
            }
        }
        if (!this.f14341OooO00o[1].isEmpty()) {
            this.f14341OooO00o[0].put(f14152OooOO0[1].f14353OooO00o, OooO0OO.OooO00o(0L, this.f14337OooO00o));
        }
        if (!this.f14341OooO00o[2].isEmpty()) {
            this.f14341OooO00o[0].put(f14152OooOO0[2].f14353OooO00o, OooO0OO.OooO00o(0L, this.f14337OooO00o));
        }
        if (!this.f14341OooO00o[3].isEmpty()) {
            this.f14341OooO00o[1].put(f14152OooOO0[3].f14353OooO00o, OooO0OO.OooO00o(0L, this.f14337OooO00o));
        }
        if (this.f14339OooO00o) {
            this.f14341OooO00o[4].put(f14113OooO0O0.f14353OooO00o, OooO0OO.OooO00o(0L, this.f14337OooO00o));
            this.f14341OooO00o[4].put(f14122OooO0OO.f14353OooO00o, OooO0OO.OooO00o((long) this.f14344OooO0OO, this.f14337OooO00o));
        }
        for (int i3 = 0; i3 < f14112OooO00o.length; i3++) {
            int i4 = 0;
            for (Map.Entry<String, OooO0OO> entry2 : this.f14341OooO00o[i3].entrySet()) {
                int OooO00o2 = entry2.getValue().OooO00o();
                if (OooO00o2 > 4) {
                    i4 += OooO00o2;
                }
            }
            iArr2[i3] = iArr2[i3] + i4;
        }
        int i5 = 8;
        for (int i6 = 0; i6 < f14112OooO00o.length; i6++) {
            if (!this.f14341OooO00o[i6].isEmpty()) {
                iArr[i6] = i5;
                i5 += (this.f14341OooO00o[i6].size() * 12) + 2 + 4 + iArr2[i6];
            }
        }
        if (this.f14339OooO00o) {
            this.f14341OooO00o[4].put(f14113OooO0O0.f14353OooO00o, OooO0OO.OooO00o((long) i5, this.f14337OooO00o));
            this.f14342OooO0O0 = i + i5;
            i5 += this.f14344OooO0OO;
        }
        int i7 = i5 + 8;
        if (!this.f14341OooO00o[1].isEmpty()) {
            this.f14341OooO00o[0].put(f14152OooOO0[1].f14353OooO00o, OooO0OO.OooO00o((long) iArr[1], this.f14337OooO00o));
        }
        if (!this.f14341OooO00o[2].isEmpty()) {
            this.f14341OooO00o[0].put(f14152OooOO0[2].f14353OooO00o, OooO0OO.OooO00o((long) iArr[2], this.f14337OooO00o));
        }
        if (!this.f14341OooO00o[3].isEmpty()) {
            this.f14341OooO00o[1].put(f14152OooOO0[3].f14353OooO00o, OooO0OO.OooO00o((long) iArr[3], this.f14337OooO00o));
        }
        oooO0O0.OooO0OO(i7);
        oooO0O0.write(f14137OooO0o);
        oooO0O0.OooO00o(this.f14337OooO00o == ByteOrder.BIG_ENDIAN ? f14291o0000o0o : f14290o0000o0O);
        oooO0O0.OooO00o(this.f14337OooO00o);
        oooO0O0.OooO0OO(42);
        oooO0O0.OooO0OO(8L);
        for (int i8 = 0; i8 < f14112OooO00o.length; i8++) {
            if (!this.f14341OooO00o[i8].isEmpty()) {
                oooO0O0.OooO0OO(this.f14341OooO00o[i8].size());
                int size = iArr[i8] + 2 + (this.f14341OooO00o[i8].size() * 12) + 4;
                for (Map.Entry<String, OooO0OO> entry3 : this.f14341OooO00o[i8].entrySet()) {
                    int i9 = f14129OooO0OO[i8].get(entry3.getKey()).OooO00o;
                    OooO0OO value = entry3.getValue();
                    int OooO00o3 = value.OooO00o();
                    oooO0O0.OooO0OO(i9);
                    oooO0O0.OooO0OO(value.OooO00o);
                    oooO0O0.OooO0O0(value.OooO0O0);
                    if (OooO00o3 > 4) {
                        oooO0O0.OooO0OO((long) size);
                        size += OooO00o3;
                    } else {
                        oooO0O0.write(value.f14352OooO00o);
                        if (OooO00o3 < 4) {
                            while (OooO00o3 < 4) {
                                oooO0O0.OooO00o(0);
                                OooO00o3++;
                            }
                        }
                    }
                }
                if (i8 != 0 || this.f14341OooO00o[4].isEmpty()) {
                    oooO0O0.OooO0OO(0L);
                } else {
                    oooO0O0.OooO0OO((long) iArr[4]);
                }
                for (Map.Entry<String, OooO0OO> entry4 : this.f14341OooO00o[i8].entrySet()) {
                    byte[] bArr = entry4.getValue().f14352OooO00o;
                    if (bArr.length > 4) {
                        oooO0O0.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f14339OooO00o) {
            oooO0O0.write(m14658OooO0O0());
        }
        oooO0O0.OooO00o(ByteOrder.BIG_ENDIAN);
        return i7;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:68|69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        java.lang.Double.parseDouble(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        return new android.util.Pair<>(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0162, code lost:
        return new android.util.Pair<>(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x014e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> OooO00o(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 355
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.OooO00o(java.lang.String):android.util.Pair");
    }

    private void OooO00o(int i, int i2) throws IOException {
        if (!this.f14341OooO00o[i].isEmpty() && !this.f14341OooO00o[i2].isEmpty()) {
            OooO0OO oooO0OO = this.f14341OooO00o[i].get(f14130OooO0Oo);
            OooO0OO oooO0OO2 = this.f14341OooO00o[i].get(f14123OooO0OO);
            OooO0OO oooO0OO3 = this.f14341OooO00o[i2].get(f14130OooO0Oo);
            OooO0OO oooO0OO4 = this.f14341OooO00o[i2].get(f14123OooO0OO);
            if (oooO0OO != null && oooO0OO2 != null && oooO0OO3 != null && oooO0OO4 != null) {
                int OooO00o2 = oooO0OO.m14660OooO00o(this.f14337OooO00o);
                int OooO00o3 = oooO0OO2.m14660OooO00o(this.f14337OooO00o);
                int OooO00o4 = oooO0OO3.m14660OooO00o(this.f14337OooO00o);
                int OooO00o5 = oooO0OO4.m14660OooO00o(this.f14337OooO00o);
                if (OooO00o2 < OooO00o4 && OooO00o3 < OooO00o5) {
                    HashMap<String, OooO0OO>[] hashMapArr = this.f14341OooO00o;
                    HashMap<String, OooO0OO> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    public static void OooO00o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static int OooO00o(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i;
            }
            i += read;
            outputStream.write(bArr, 0, read);
        }
    }

    public static long[] OooO00o(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }
}
