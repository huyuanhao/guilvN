package kotlin.text;

import androidx.exifinterface.media.ExifInterface;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.p118pd.sdk.AbstractC7873oO0OOo00;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.p118pd.sdk.AbstractC9214oooo00Oo;
import com.p118pd.sdk.C8316oOo0oo0o;
import com.p118pd.sdk.C8412oOoo0OoO;
import com.p118pd.sdk.C9163oooOOO0O;
import com.p118pd.sdk.C9174oooOOooO;
import com.p118pd.sdk.C9201oooOooOo;
import com.p118pd.sdk.C9202oooOooo;
import com.p118pd.sdk.C9210oooo000O;
import com.p118pd.sdk.C9219oooo0O0;
import com.p118pd.sdk.C9221oooo0O0O;
import com.p118pd.sdk.C9232oooo0o00;
import com.p118pd.sdk.C9237oooo0oo;
import com.p118pd.sdk.C9239oooo0ooO;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.O00Oo00O;
import com.p118pd.sdk.O0OO0o;
import com.p118pd.sdk.o0O0OO00;
import com.p118pd.sdk.oO00O000;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.internal.InlineOnly;
import kotlin.random.Random;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000Ü\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u001f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a!\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b*\u00020\u0002\u001a\u0010\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n*\u00020\u0002\u001aE\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\f\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u00020\u00022\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\u00100\u0004H\b\u001a3\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00050\f\"\u0004\b\u0000\u0010\r*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u0004H\b\u001aM\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\f\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\b\u001aN\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\r\"\u0018\b\u0001\u0010\u0015*\u0012\u0012\u0006\b\u0000\u0012\u0002H\r\u0012\u0006\b\u0000\u0012\u00020\u00050\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u0004H\b¢\u0006\u0002\u0010\u0018\u001ah\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0018\b\u0002\u0010\u0015*\u0012\u0012\u0006\b\u0000\u0012\u0002H\r\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\b¢\u0006\u0002\u0010\u0019\u001a`\u0010\u001a\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0018\b\u0002\u0010\u0015*\u0012\u0012\u0006\b\u0000\u0012\u0002H\r\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\u00100\u0004H\b¢\u0006\u0002\u0010\u0018\u001a3\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\f\"\u0004\b\u0000\u0010\u000e*\u00020\u00022\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\b\u001aN\u0010\u001d\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u000e\"\u0018\b\u0001\u0010\u0015*\u0012\u0012\u0006\b\u0000\u0012\u00020\u0005\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\b¢\u0006\u0002\u0010\u0018\u001a\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\u00020\u00022\u0006\u0010!\u001a\u00020\"H\u0007\u001a4\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H#0\u0004H\u0007\u001a\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\n*\u00020\u00022\u0006\u0010!\u001a\u00020\"H\u0007\u001a4\u0010$\u001a\b\u0012\u0004\u0012\u0002H#0\n\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H#0\u0004H\u0007\u001a\r\u0010%\u001a\u00020\"*\u00020\u0002H\b\u001a!\u0010%\u001a\u00020\"*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010'\u001a\u00020\"\u001a\u0012\u0010&\u001a\u00020 *\u00020 2\u0006\u0010'\u001a\u00020\"\u001a\u0012\u0010(\u001a\u00020\u0002*\u00020\u00022\u0006\u0010'\u001a\u00020\"\u001a\u0012\u0010(\u001a\u00020 *\u00020 2\u0006\u0010'\u001a\u00020\"\u001a!\u0010)\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a!\u0010)\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a!\u0010*\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a!\u0010*\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\u0015\u0010+\u001a\u00020\u0005*\u00020\u00022\u0006\u0010,\u001a\u00020\"H\b\u001a)\u0010-\u001a\u00020\u0005*\u00020\u00022\u0006\u0010,\u001a\u00020\"2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050\u0004H\b\u001a\u001c\u0010/\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010,\u001a\u00020\"H\b¢\u0006\u0002\u00100\u001a!\u00101\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a!\u00101\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a6\u00102\u001a\u00020\u0002*\u00020\u00022'\u0010\u0003\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000103H\b\u001a6\u00102\u001a\u00020 *\u00020 2'\u0010\u0003\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000103H\b\u001aQ\u00106\u001a\u0002H7\"\f\b\u0000\u00107*\u000608j\u0002`9*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H72'\u0010\u0003\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000103H\b¢\u0006\u0002\u0010:\u001a!\u0010;\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a!\u0010;\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a<\u0010<\u001a\u0002H7\"\f\b\u0000\u00107*\u000608j\u0002`9*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H72\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b¢\u0006\u0002\u0010=\u001a<\u0010>\u001a\u0002H7\"\f\b\u0000\u00107*\u000608j\u0002`9*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H72\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b¢\u0006\u0002\u0010=\u001a(\u0010?\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b¢\u0006\u0002\u0010@\u001a(\u0010A\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b¢\u0006\u0002\u0010@\u001a\n\u0010B\u001a\u00020\u0005*\u00020\u0002\u001a!\u0010B\u001a\u00020\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\u0011\u0010C\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010D\u001a(\u0010C\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b¢\u0006\u0002\u0010@\u001a3\u0010E\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H#0\b0\u0004H\b\u001aL\u0010F\u001a\u0002H7\"\u0004\b\u0000\u0010#\"\u0010\b\u0001\u00107*\n\u0012\u0006\b\u0000\u0012\u0002H#0G*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H72\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H#0\b0\u0004H\b¢\u0006\u0002\u0010H\u001aI\u0010I\u001a\u0002H#\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010J\u001a\u0002H#2'\u0010K\u001a#\u0012\u0013\u0012\u0011H#¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#03H\b¢\u0006\u0002\u0010M\u001a^\u0010N\u001a\u0002H#\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010J\u001a\u0002H#2<\u0010K\u001a8\u0012\u0013\u0012\u00110\"¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H#¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#0OH\b¢\u0006\u0002\u0010P\u001aI\u0010Q\u001a\u0002H#\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010J\u001a\u0002H#2'\u0010K\u001a#\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u0011H#¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(L\u0012\u0004\u0012\u0002H#03H\b¢\u0006\u0002\u0010M\u001a^\u0010R\u001a\u0002H#\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010J\u001a\u0002H#2<\u0010K\u001a8\u0012\u0013\u0012\u00110\"¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u0011H#¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(L\u0012\u0004\u0012\u0002H#0OH\b¢\u0006\u0002\u0010P\u001a!\u0010S\u001a\u00020T*\u00020\u00022\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020T0\u0004H\b\u001a6\u0010V\u001a\u00020T*\u00020\u00022'\u0010U\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020T03H\b\u001a)\u0010W\u001a\u00020\u0005*\u00020\u00022\u0006\u0010,\u001a\u00020\"2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050\u0004H\b\u001a\u0019\u0010X\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010,\u001a\u00020\"¢\u0006\u0002\u00100\u001a9\u0010Y\u001a\u0014\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f0\f\"\u0004\b\u0000\u0010\r*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u0004H\b\u001aS\u0010Y\u001a\u0014\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u001f0\f\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\b\u001aR\u0010Z\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\r\"\u001c\b\u0001\u0010\u0015*\u0016\u0012\u0006\b\u0000\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050[0\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u0004H\b¢\u0006\u0002\u0010\u0018\u001al\u0010Z\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u001c\b\u0002\u0010\u0015*\u0016\u0012\u0006\b\u0000\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0[0\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\b¢\u0006\u0002\u0010\u0019\u001a5\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0]\"\u0004\b\u0000\u0010\r*\u00020\u00022\u0014\b\u0004\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u0004H\b\u001a!\u0010^\u001a\u00020\"*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a!\u0010_\u001a\u00020\"*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\n\u0010`\u001a\u00020\u0005*\u00020\u0002\u001a!\u0010`\u001a\u00020\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\u0011\u0010a\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010D\u001a(\u0010a\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b¢\u0006\u0002\u0010@\u001a-\u0010b\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#0\u0004H\b\u001aB\u0010c\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022'\u0010\u000f\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#03H\b\u001aH\u0010d\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\b\b\u0000\u0010#*\u00020e*\u00020\u00022)\u0010\u000f\u001a%\u0012\u0013\u0012\u00110\"¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u0001H#03H\b\u001aa\u0010f\u001a\u0002H7\"\b\b\u0000\u0010#*\u00020e\"\u0010\b\u0001\u00107*\n\u0012\u0006\b\u0000\u0012\u0002H#0G*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H72)\u0010\u000f\u001a%\u0012\u0013\u0012\u00110\"¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u0001H#03H\b¢\u0006\u0002\u0010g\u001a[\u0010h\u001a\u0002H7\"\u0004\b\u0000\u0010#\"\u0010\b\u0001\u00107*\n\u0012\u0006\b\u0000\u0012\u0002H#0G*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H72'\u0010\u000f\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#03H\b¢\u0006\u0002\u0010g\u001a3\u0010i\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\b\b\u0000\u0010#*\u00020e*\u00020\u00022\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u0001H#0\u0004H\b\u001aL\u0010j\u001a\u0002H7\"\b\b\u0000\u0010#*\u00020e\"\u0010\b\u0001\u00107*\n\u0012\u0006\b\u0000\u0012\u0002H#0G*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H72\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u0001H#0\u0004H\b¢\u0006\u0002\u0010H\u001aF\u0010k\u001a\u0002H7\"\u0004\b\u0000\u0010#\"\u0010\b\u0001\u00107*\n\u0012\u0006\b\u0000\u0012\u0002H#0G*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H72\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#0\u0004H\b¢\u0006\u0002\u0010H\u001a\u0011\u0010l\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010D\u001a8\u0010m\u001a\u0004\u0018\u00010\u0005\"\u000e\b\u0000\u0010#*\b\u0012\u0004\u0012\u0002H#0n*\u00020\u00022\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#0\u0004H\b¢\u0006\u0002\u0010@\u001a-\u0010p\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u001a\u0010q\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00050rj\n\u0012\u0006\b\u0000\u0012\u00020\u0005`s¢\u0006\u0002\u0010t\u001a\u0011\u0010u\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010D\u001a8\u0010v\u001a\u0004\u0018\u00010\u0005\"\u000e\b\u0000\u0010#*\b\u0012\u0004\u0012\u0002H#0n*\u00020\u00022\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#0\u0004H\b¢\u0006\u0002\u0010@\u001a-\u0010w\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u001a\u0010q\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00050rj\n\u0012\u0006\b\u0000\u0012\u00020\u0005`s¢\u0006\u0002\u0010t\u001a\n\u0010x\u001a\u00020\u0001*\u00020\u0002\u001a!\u0010x\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a0\u0010y\u001a\u0002Hz\"\b\b\u0000\u0010z*\u00020\u0002*\u0002Hz2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020T0\u0004H\b¢\u0006\u0002\u0010{\u001a-\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a-\u0010|\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0\u0010*\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\r\u0010}\u001a\u00020\u0005*\u00020\u0002H\b\u001a\u0014\u0010}\u001a\u00020\u0005*\u00020\u00022\u0006\u0010}\u001a\u00020~H\u0007\u001a6\u0010\u001a\u00020\u0005*\u00020\u00022'\u0010K\u001a#\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000503H\b\u001aL\u0010\u0001\u001a\u00020\u0005*\u00020\u00022<\u0010K\u001a8\u0012\u0013\u0012\u00110\"¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050OH\b\u001a7\u0010\u0001\u001a\u00020\u0005*\u00020\u00022'\u0010K\u001a#\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020\u000503H\b\u001aL\u0010\u0001\u001a\u00020\u0005*\u00020\u00022<\u0010K\u001a8\u0012\u0013\u0012\u00110\"¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020\u00050OH\b\u001a\u000b\u0010\u0001\u001a\u00020\u0002*\u00020\u0002\u001a\u000e\u0010\u0001\u001a\u00020 *\u00020 H\b\u001a\u000b\u0010\u0001\u001a\u00020\u0005*\u00020\u0002\u001a\"\u0010\u0001\u001a\u00020\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\u0012\u0010\u0001\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010D\u001a)\u0010\u0001\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b¢\u0006\u0002\u0010@\u001a\u001a\u0010\u0001\u001a\u00020\u0002*\u00020\u00022\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\b\u001a\u0015\u0010\u0001\u001a\u00020\u0002*\u00020\u00022\b\u0010\u0001\u001a\u00030\u0001\u001a\u001d\u0010\u0001\u001a\u00020 *\u00020 2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\bH\b\u001a\u0015\u0010\u0001\u001a\u00020 *\u00020 2\b\u0010\u0001\u001a\u00030\u0001\u001a\"\u0010\u0001\u001a\u00020\"*\u00020\u00022\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"0\u0004H\b\u001a$\u0010\u0001\u001a\u00030\u0001*\u00020\u00022\u0013\u0010o\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0012\u0005\u0012\u00030\u00010\u0004H\b\u001a\u0013\u0010\u0001\u001a\u00020\u0002*\u00020\u00022\u0006\u0010'\u001a\u00020\"\u001a\u0013\u0010\u0001\u001a\u00020 *\u00020 2\u0006\u0010'\u001a\u00020\"\u001a\u0013\u0010\u0001\u001a\u00020\u0002*\u00020\u00022\u0006\u0010'\u001a\u00020\"\u001a\u0013\u0010\u0001\u001a\u00020 *\u00020 2\u0006\u0010'\u001a\u00020\"\u001a\"\u0010\u0001\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\"\u0010\u0001\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\"\u0010\u0001\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\"\u0010\u0001\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a+\u0010\u0001\u001a\u0002H7\"\u0010\b\u0000\u00107*\n\u0012\u0006\b\u0000\u0012\u00020\u00050G*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H7¢\u0006\u0003\u0010\u0001\u001a\u001d\u0010\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00050\u0001j\t\u0012\u0004\u0012\u00020\u0005`\u0001*\u00020\u0002\u001a\u0011\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u001f*\u00020\u0002\u001a\u0011\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050[*\u00020\u0002\u001a\u0012\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u0002\u001a1\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\t\b\u0002\u0010\u0001\u001a\u00020\"2\t\b\u0002\u0010\u0001\u001a\u00020\u0001H\u0007\u001aK\u0010\u0001\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\t\b\u0002\u0010\u0001\u001a\u00020\"2\t\b\u0002\u0010\u0001\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H#0\u0004H\u0007\u001a1\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020 0\n*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\t\b\u0002\u0010\u0001\u001a\u00020\"2\t\b\u0002\u0010\u0001\u001a\u00020\u0001H\u0007\u001aK\u0010\u0001\u001a\b\u0012\u0004\u0012\u0002H#0\n\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\t\b\u0002\u0010\u0001\u001a\u00020\"2\t\b\u0002\u0010\u0001\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H#0\u0004H\u0007\u001a\u0018\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00050\u00010\b*\u00020\u0002\u001a)\u0010\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00100\u001f*\u00020\u00022\u0007\u0010 \u0001\u001a\u00020\u0002H\u0004\u001a]\u0010\u0001\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u001f\"\u0004\b\u0000\u0010\u000e*\u00020\u00022\u0007\u0010 \u0001\u001a\u00020\u000228\u0010\u000f\u001a4\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b4\u0012\t\b5\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b4\u0012\t\b5\u0012\u0005\b\b(¢\u0001\u0012\u0004\u0012\u0002H\u000e03H\b\u001a\u001f\u0010£\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00100\u001f*\u00020\u0002H\u0007\u001aT\u0010£\u0001\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u000228\u0010\u000f\u001a4\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b4\u0012\t\b5\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b4\u0012\t\b5\u0012\u0005\b\b(¢\u0001\u0012\u0004\u0012\u0002H#03H\b¨\u0006¤\u0001"}, mo43195d2 = {"all", "", "", "predicate", "Lkotlin/Function1;", "", "any", "asIterable", "", "asSequence", "Lkotlin/sequences/Sequence;", "associate", "", "K", ExifInterface.o000oo0o, BaseViewManager.PROP_TRANSFORM, "Lkotlin/Pair;", "associateBy", "keySelector", "valueTransform", "associateByTo", "M", "", "destination", "(Ljava/lang/CharSequence;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "(Ljava/lang/CharSequence;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "associateTo", "associateWith", "valueSelector", "associateWithTo", "chunked", "", "", FileAttachment.KEY_SIZE, "", "R", "chunkedSequence", C8412oOoo0OoO.OooO0O0, "drop", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "dropLast", "dropLastWhile", "dropWhile", "elementAt", "index", "elementAtOrElse", "defaultValue", "elementAtOrNull", "(Ljava/lang/CharSequence;I)Ljava/lang/Character;", "filter", "filterIndexed", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "filterIndexedTo", "C", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "(Ljava/lang/CharSequence;Ljava/lang/Appendable;Lkotlin/jvm/functions/Function2;)Ljava/lang/Appendable;", "filterNot", "filterNotTo", "(Ljava/lang/CharSequence;Ljava/lang/Appendable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "filterTo", "find", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Character;", "findLast", "first", "firstOrNull", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "flatMap", "flatMapTo", "", "(Ljava/lang/CharSequence;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "fold", "initial", "operation", "acc", "(Ljava/lang/CharSequence;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/CharSequence;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "", "action", "forEachIndexed", "getOrElse", "getOrNull", "groupBy", "groupByTo", "", "groupingBy", "Lkotlin/collections/Grouping;", "indexOfFirst", "indexOfLast", "last", "lastOrNull", "map", "mapIndexed", "mapIndexedNotNull", "", "mapIndexedNotNullTo", "(Ljava/lang/CharSequence;Ljava/util/Collection;Lkotlin/jvm/functions/Function2;)Ljava/util/Collection;", "mapIndexedTo", "mapNotNull", "mapNotNullTo", "mapTo", "max", "maxBy", "", "selector", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/CharSequence;Ljava/util/Comparator;)Ljava/lang/Character;", "min", "minBy", "minWith", "none", "onEach", ExifInterface.o000oOoo, "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;", "partition", "random", "Lkotlin/random/Random;", "reduce", "reduceIndexed", "reduceRight", "reduceRightIndexed", "reversed", "single", "singleOrNull", "slice", "indices", "Lkotlin/ranges/IntRange;", "sumBy", "sumByDouble", "", "take", "takeLast", "takeLastWhile", "takeWhile", "toCollection", "(Ljava/lang/CharSequence;Ljava/util/Collection;)Ljava/util/Collection;", "toHashSet", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "toList", "toMutableList", "toSet", "", "windowed", "step", "partialWindows", "windowedSequence", "withIndex", "Lkotlin/collections/IndexedValue;", "zip", DispatchConstants.OTHER, "a", "b", "zipWithNext", "kotlin-stdlib"}, mo43196k = 5, mo43197mv = {1, 1, 13}, mo43199xi = 1, mo43200xs = "kotlin/text/StringsKt")
public class StringsKt___StringsKt extends C8316oOo0oo0o {

    public static final class OooO00o implements Iterable<Character>, O0OO0o {
        public final /* synthetic */ CharSequence OooO00o;

        public OooO00o(CharSequence charSequence) {
            this.OooO00o = charSequence;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<Character> iterator() {
            return StringsKt__StringsKt.m22894OooO00o(this.OooO00o);
        }
    }

    public static final class OooO0O0 implements AbstractC7873oO0OOo00<Character> {
        public final /* synthetic */ CharSequence OooO00o;

        public OooO0O0(CharSequence charSequence) {
            this.OooO00o = charSequence;
        }

        @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
        @NotNull
        public Iterator<Character> iterator() {
            return StringsKt__StringsKt.m22894OooO00o(this.OooO00o);
        }
    }

    public static final class OooO0OO implements AbstractC9214oooo00Oo<Character, K> {
        public final /* synthetic */ O00O0OOO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ CharSequence f23880OooO00o;

        public OooO0OO(CharSequence charSequence, O00O0OOO o00o0ooo) {
            this.f23880OooO00o = charSequence;
            this.OooO00o = o00o0ooo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p118pd.sdk.AbstractC9214oooo00Oo
        public /* bridge */ /* synthetic */ Object OooO00o(Character ch) {
            return OooO00o(ch.charValue());
        }

        @Override // com.p118pd.sdk.AbstractC9214oooo00Oo
        @NotNull
        public Iterator<Character> OooO00o() {
            return StringsKt__StringsKt.m22894OooO00o(this.f23880OooO00o);
        }

        public K OooO00o(char c) {
            return (K) this.OooO00o.invoke(Character.valueOf(c));
        }
    }

    @NotNull
    public static final CharSequence OooO(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        for (int OooO00o2 = StringsKt__StringsKt.OooO00o(charSequence); OooO00o2 >= 0; OooO00o2--) {
            if (!o00o0ooo.invoke(Character.valueOf(charSequence.charAt(OooO00o2))).booleanValue()) {
                return charSequence.subSequence(OooO00o2 + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @InlineOnly
    public static final char OooO00o(@NotNull CharSequence charSequence, int i) {
        return charSequence.charAt(i);
    }

    @InlineOnly
    public static final char OooO0O0(@NotNull CharSequence charSequence, int i, O00O0OOO<? super Integer, Character> o00o0ooo) {
        return (i < 0 || i > StringsKt__StringsKt.OooO00o(charSequence)) ? o00o0ooo.invoke(Integer.valueOf(i)).charValue() : charSequence.charAt(i);
    }

    @Nullable
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static final Character m22945OooO0OO(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (o00o0ooo.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static final Character m22953OooO0Oo(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        char charAt;
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return null;
            }
            charAt = charSequence.charAt(length);
        } while (!o00o0ooo.invoke(Character.valueOf(charAt)).booleanValue());
        return Character.valueOf(charAt);
    }

    @NotNull
    public static final CharSequence OooO0o(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (o00o0ooo.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    @Nullable
    public static final Character OooO0o0(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @Nullable
    /* renamed from: OooO0oO  reason: collision with other method in class */
    public static final Character m22958OooO0oO(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        Character ch = null;
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (o00o0ooo.invoke(Character.valueOf(charAt)).booleanValue()) {
                if (z) {
                    return null;
                }
                ch = Character.valueOf(charAt);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return ch;
    }

    @NotNull
    public static final String OooO0oo(@NotNull String str, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        for (int OooO00o2 = StringsKt__StringsKt.OooO00o((CharSequence) str); OooO00o2 >= 0; OooO00o2--) {
            if (!o00o0ooo.invoke(Character.valueOf(str.charAt(OooO00o2))).booleanValue()) {
                String substring = str.substring(OooO00o2 + 1);
                o0O0OO00.OooO00o((Object) substring, "(this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return str;
    }

    @NotNull
    public static final CharSequence OooOO0(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(0, i);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @InlineOnly
    public static final String OooOO0O(@NotNull String str) {
        if (str != null) {
            return m22950OooO0Oo((CharSequence) str).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @InlineOnly
    public static final char OooO00o(@NotNull CharSequence charSequence, int i, O00O0OOO<? super Integer, Character> o00o0ooo) {
        return (i < 0 || i > StringsKt__StringsKt.OooO00o(charSequence)) ? o00o0ooo.invoke(Integer.valueOf(i)).charValue() : charSequence.charAt(i);
    }

    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final Character m22935OooO0O0(@NotNull CharSequence charSequence, int i) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (i < 0 || i > StringsKt__StringsKt.OooO00o(charSequence)) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static final int m22943OooO0OO(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (o00o0ooo.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                return length;
            }
        }
        return -1;
    }

    @NotNull
    public static final CharSequence OooO0o0(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Character m22915OooO00o(@NotNull CharSequence charSequence, int i) {
        return m22935OooO0O0(charSequence, i);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final int m22932OooO0O0(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final char OooO00o(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final char OooO0OO(@NotNull CharSequence charSequence) {
        return OooO00o(charSequence, Random.f16961OooO00o);
    }

    public static final char OooO0Oo(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        } else if (length == 1) {
            return charSequence.charAt(0);
        } else {
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
    }

    @NotNull
    public static final CharSequence OooO0oO(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!o00o0ooo.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    public static final boolean OooO0oo(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return charSequence.length() == 0;
    }

    @NotNull
    public static final String OooO(@NotNull String str, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!o00o0ooo.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                String substring = str.substring(0, i);
                o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return str;
    }

    public static final char OooO0O0(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(StringsKt__StringsKt.OooO00o(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final char OooO0OO(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        Character ch = null;
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (o00o0ooo.invoke(Character.valueOf(charAt)).booleanValue()) {
                if (!z) {
                    ch = Character.valueOf(charAt);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
            }
        }
        if (!z) {
            throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
        } else if (ch != null) {
            return ch.charValue();
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Char");
        }
    }

    @NotNull
    public static final String OooO0o(@NotNull String str, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (o00o0ooo.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        o0O0OO00.OooO00o((Object) sb2, "filterTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    @NotNull
    public static final String OooO0o0(@NotNull String str, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!o00o0ooo.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                String substring = str.substring(i);
                o0O0OO00.OooO00o((Object) substring, "(this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return "";
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <S extends CharSequence> S OooO0oo(@NotNull S s, @NotNull O00O0OOO<? super Character, C9174oooOOooO> o00o0ooo) {
        o0O0OO00.OooO0o(s, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "action");
        for (int i = 0; i < s.length(); i++) {
            o00o0ooo.invoke(Character.valueOf(s.charAt(i)));
        }
        return s;
    }

    @NotNull
    public static final String OooO0oO(@NotNull String str, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!o00o0ooo.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        o0O0OO00.OooO00o((Object) sb2, "filterNotTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    public static final char OooO00o(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (o00o0ooo.invoke(Character.valueOf(charAt)).booleanValue()) {
                return charAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final char OooO0O0(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        char charAt;
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        int length = charSequence.length();
        do {
            length--;
            if (length >= 0) {
                charAt = charSequence.charAt(length);
            } else {
                throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
            }
        } while (!o00o0ooo.invoke(Character.valueOf(charAt)).booleanValue());
        return charAt;
    }

    @NotNull
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static final CharSequence m22951OooO0Oo(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        for (int OooO00o2 = StringsKt__StringsKt.OooO00o(charSequence); OooO00o2 >= 0; OooO00o2--) {
            if (!o00o0ooo.invoke(Character.valueOf(charSequence.charAt(OooO00o2))).booleanValue()) {
                return charSequence.subSequence(0, OooO00o2 + 1);
            }
        }
        return "";
    }

    @NotNull
    public static final String OooO0o0(@NotNull String str, int i) {
        o0O0OO00.OooO0o(str, "receiver$0");
        if (i >= 0) {
            int length = str.length();
            String substring = str.substring(length - oO00O000.OooO0O0(i, length));
            o0O0OO00.OooO00o((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Character m22914OooO00o(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static final boolean OooO0oO(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return !(charSequence.length() == 0);
    }

    @SinceKotlin(version = "1.3")
    public static final char OooO00o(@NotNull CharSequence charSequence, @NotNull Random oo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(oo, "random");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(oo.OooO0O0(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @Nullable
    /* renamed from: OooO0o  reason: collision with other method in class */
    public static final <R extends Comparable<? super R>> Character m22956OooO0o(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "selector");
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        Comparable comparable = (Comparable) o00o0ooo.invoke(Character.valueOf(charAt));
        int OooO00o2 = StringsKt__StringsKt.OooO00o(charSequence);
        if (1 <= OooO00o2) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                Comparable comparable2 = (Comparable) o00o0ooo.invoke(Character.valueOf(charAt2));
                if (comparable.compareTo(comparable2) > 0) {
                    charAt = charAt2;
                    comparable = comparable2;
                }
                if (i == OooO00o2) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    @NotNull
    public static final String OooO0OO(@NotNull String str, int i) {
        o0O0OO00.OooO0o(str, "receiver$0");
        if (i >= 0) {
            return OooO0Oo(str, oO00O000.OooO00o(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final String OooO0Oo(@NotNull String str, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        for (int OooO00o2 = StringsKt__StringsKt.OooO00o((CharSequence) str); OooO00o2 >= 0; OooO00o2--) {
            if (!o00o0ooo.invoke(Character.valueOf(str.charAt(OooO00o2))).booleanValue()) {
                String substring = str.substring(0, OooO00o2 + 1);
                o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return "";
    }

    @Nullable
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public static final <R extends Comparable<? super R>> Character m22957OooO0o0(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "selector");
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        Comparable comparable = (Comparable) o00o0ooo.invoke(Character.valueOf(charAt));
        int OooO00o2 = StringsKt__StringsKt.OooO00o(charSequence);
        if (1 <= OooO00o2) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                Comparable comparable2 = (Comparable) o00o0ooo.invoke(Character.valueOf(charAt2));
                if (comparable.compareTo(comparable2) < 0) {
                    charAt = charAt2;
                    comparable = comparable2;
                }
                if (i == OooO00o2) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final Character m22934OooO0O0(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final CharSequence m22912OooO00o(@NotNull CharSequence charSequence, int i) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (i >= 0) {
            return charSequence.subSequence(oO00O000.OooO0O0(i, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str, int i) {
        o0O0OO00.OooO0o(str, "receiver$0");
        if (i >= 0) {
            String substring = str.substring(oO00O000.OooO0O0(i, str.length()));
            o0O0OO00.OooO00o((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final CharSequence OooO0OO(@NotNull CharSequence charSequence, @NotNull IntRange oo000o0o) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(oo000o0o, "indices");
        if (oo000o0o.isEmpty()) {
            return "";
        }
        return StringsKt__StringsKt.OooO0O0(charSequence, oo000o0o);
    }

    @NotNull
    public static final String OooO0Oo(@NotNull String str, int i) {
        o0O0OO00.OooO0o(str, "receiver$0");
        if (i >= 0) {
            String substring = str.substring(0, oO00O000.OooO0O0(i, str.length()));
            o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final CharSequence m22913OooO00o(@NotNull CharSequence charSequence, @NotNull O00Oo000<? super Integer, ? super Character, Boolean> o00Oo000) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, "predicate");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            int i3 = i2 + 1;
            if (o00Oo000.invoke(Integer.valueOf(i2), Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
            i++;
            i2 = i3;
        }
        return sb;
    }

    @NotNull
    public static final CharSequence OooO0O0(@NotNull CharSequence charSequence, int i) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (i >= 0) {
            return OooO0OO(charSequence, oO00O000.OooO00o(charSequence.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final String OooO0OO(@NotNull String str, @NotNull IntRange oo000o0o) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(oo000o0o, "indices");
        if (oo000o0o.isEmpty()) {
            return "";
        }
        return StringsKt__StringsKt.OooO0O0(str, oo000o0o);
    }

    @NotNull
    public static final CharSequence OooO0Oo(@NotNull CharSequence charSequence, int i) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (i >= 0) {
            int length = charSequence.length();
            return charSequence.subSequence(length - oO00O000.OooO0O0(i, length), length);
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final <C extends Appendable> C OooO0O0(@NotNull CharSequence charSequence, @NotNull C c, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (o00o0ooo.invoke(Character.valueOf(charAt)).booleanValue()) {
                c.append(charAt);
            }
        }
        return c;
    }

    @NotNull
    public static final CharSequence OooO0OO(@NotNull CharSequence charSequence, int i) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (i >= 0) {
            return charSequence.subSequence(0, oO00O000.OooO0O0(i, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    public static final String OooO00o(@NotNull String str, @NotNull O00Oo000<? super Integer, ? super Character, Boolean> o00Oo000) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, "predicate");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            int i3 = i2 + 1;
            if (o00Oo000.invoke(Integer.valueOf(i2), Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
            i++;
            i2 = i3;
        }
        String sb2 = sb.toString();
        o0O0OO00.OooO00o((Object) sb2, "filterIndexedTo(StringBu…(), predicate).toString()");
        return sb2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @NotNull
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static final <V> Map<Character, V> m22948OooO0OO(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, ? extends V> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(oO00O000.OooO00o(C9232oooo0o00.OooO00o(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            linkedHashMap.put(Character.valueOf(charAt), o00o0ooo.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @NotNull
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static final CharSequence m22950OooO0Oo(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        o0O0OO00.OooO00o((Object) reverse, "StringBuilder(this).reverse()");
        return reverse;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final <K> Map<K, Character> m22941OooO0O0(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, ? extends K> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(oO00O000.OooO00o(C9232oooo0o00.OooO00o(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            linkedHashMap.put(o00o0ooo.invoke(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static final <K> Map<K, List<Character>> m22955OooO0Oo(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, ? extends K> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Object invoke = o00o0ooo.invoke(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <C extends Appendable> C OooO00o(@NotNull CharSequence charSequence, @NotNull C c, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!o00o0ooo.invoke(Character.valueOf(charAt)).booleanValue()) {
                c.append(charAt);
            }
        }
        return c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: M extends java.util.Map<? super java.lang.Character, ? super V> */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <V, M extends Map<? super Character, ? super V>> M OooO0OO(@NotNull CharSequence charSequence, @NotNull M m, @NotNull O00O0OOO<? super Character, ? extends V> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00o0ooo, "valueSelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            m.put(Character.valueOf(charAt), o00o0ooo.invoke(Character.valueOf(charAt)));
        }
        return m;
    }

    @NotNull
    public static final CharSequence OooO00o(@NotNull CharSequence charSequence, @NotNull Iterable<Integer> iterable) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(iterable, "indices");
        int OooO00o2 = C9202oooOooo.OooO00o(iterable, 10);
        if (OooO00o2 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(OooO00o2);
        for (Integer num : iterable) {
            sb.append(charSequence.charAt(num.intValue()));
        }
        return sb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: M extends java.util.Map<? super K, ? super V> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M OooO0O0(@NotNull CharSequence charSequence, @NotNull M m, @NotNull O00O0OOO<? super Character, ? extends Pair<? extends K, ? extends V>> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        for (int i = 0; i < charSequence.length(); i++) {
            Pair pair = (Pair) o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i)));
            m.put(pair.getFirst(), pair.getSecond());
        }
        return m;
    }

    @NotNull
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static final List<Character> m22946OooO0OO(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return (List) OooO00o(charSequence, (Collection) new ArrayList(charSequence.length()));
    }

    @NotNull
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static final <R> List<R> m22947OooO0OO(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < charSequence.length(); i++) {
            Object invoke = o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i)));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final List<Character> m22938OooO0O0(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        int length = charSequence.length();
        if (length == 0) {
            return CollectionsKt__CollectionsKt.m22696OooO00o();
        }
        if (length != 1) {
            return m22946OooO0OO(charSequence);
        }
        return C9201oooOooOo.OooO00o(Character.valueOf(charSequence.charAt(0)));
    }

    @InlineOnly
    public static final String OooO00o(@NotNull String str, Iterable<Integer> iterable) {
        if (str != null) {
            return OooO00o((CharSequence) str, iterable).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K, V> Map<K, V> m22925OooO00o(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, ? extends Pair<? extends K, ? extends V>> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        LinkedHashMap linkedHashMap = new LinkedHashMap(oO00O000.OooO00o(C9232oooo0o00.OooO00o(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            Pair pair = (Pair) o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i)));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C OooO0OO(@NotNull CharSequence charSequence, @NotNull C c, @NotNull O00O0OOO<? super Character, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        for (int i = 0; i < charSequence.length(); i++) {
            c.add(o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: M extends java.util.Map<? super K, java.util.List<java.lang.Character>> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M OooO0Oo(@NotNull CharSequence charSequence, @NotNull M m, @NotNull O00O0OOO<? super Character, ? extends K> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Object invoke = o00o0ooo.invoke(Character.valueOf(charAt));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, List<V>> OooO0O0(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, ? extends K> o00o0ooo, @NotNull O00O0OOO<? super Character, ? extends V> o00o0ooo2) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        o0O0OO00.OooO0o(o00o0ooo2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Object invoke = o00o0ooo.invoke(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(o00o0ooo2.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @Nullable
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static final Character m22944OooO0OO(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int OooO00o2 = StringsKt__StringsKt.OooO00o(charSequence);
        if (1 <= OooO00o2) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                if (charAt < charAt2) {
                    charAt = charAt2;
                }
                if (i == OooO00o2) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> OooO00o(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, ? extends K> o00o0ooo, @NotNull O00O0OOO<? super Character, ? extends V> o00o0ooo2) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        o0O0OO00.OooO0o(o00o0ooo2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(oO00O000.OooO00o(C9232oooo0o00.OooO00o(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            linkedHashMap.put(o00o0ooo.invoke(Character.valueOf(charAt)), o00o0ooo2.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static final boolean m22949OooO0OO(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static final Character m22952OooO0Oo(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int OooO00o2 = StringsKt__StringsKt.OooO00o(charSequence);
        if (1 <= OooO00o2) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                if (charAt > charAt2) {
                    charAt = charAt2;
                }
                if (i == OooO00o2) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: M extends java.util.Map<? super K, ? super java.lang.Character> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M OooO00o(@NotNull CharSequence charSequence, @NotNull M m, @NotNull O00O0OOO<? super Character, ? extends K> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            m.put(o00o0ooo.invoke(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return m;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> List<R> OooO0OO(@NotNull CharSequence charSequence, @NotNull O00Oo000<? super Character, ? super Character, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, BaseViewManager.PROP_TRANSFORM);
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt__CollectionsKt.m22696OooO00o();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            i++;
            arrayList.add(o00Oo000.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: M extends java.util.Map<? super K, ? super V> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M OooO00o(@NotNull CharSequence charSequence, @NotNull M m, @NotNull O00O0OOO<? super Character, ? extends K> o00o0ooo, @NotNull O00O0OOO<? super Character, ? extends V> o00o0ooo2) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        o0O0OO00.OooO0o(o00o0ooo2, "valueTransform");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            m.put(o00o0ooo.invoke(Character.valueOf(charAt)), o00o0ooo2.invoke(Character.valueOf(charAt)));
        }
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: M extends java.util.Map<? super K, java.util.List<V>> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M OooO0O0(@NotNull CharSequence charSequence, @NotNull M m, @NotNull O00O0OOO<? super Character, ? extends K> o00o0ooo, @NotNull O00O0OOO<? super Character, ? extends V> o00o0ooo2) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        o0O0OO00.OooO0o(o00o0ooo2, "valueTransform");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Object invoke = o00o0ooo.invoke(Character.valueOf(charAt));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(o00o0ooo2.invoke(Character.valueOf(charAt)));
        }
        return m;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C OooO00o(@NotNull CharSequence charSequence, @NotNull C c) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        for (int i = 0; i < charSequence.length(); i++) {
            c.add(Character.valueOf(charSequence.charAt(i)));
        }
        return c;
    }

    public static final int OooO0Oo(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Integer> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "selector");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            i += o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i2))).intValue();
        }
        return i;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final HashSet<Character> m22918OooO00o(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return (HashSet) OooO00o(charSequence, (Collection) new HashSet(C9232oooo0o00.OooO00o(charSequence.length())));
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static final List<Pair<Character, Character>> m22954OooO0Oo(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt__CollectionsKt.m22696OooO00o();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            i++;
            arrayList.add(C9163oooOOO0O.OooO00o(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Set<Character> m22926OooO00o(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        int length = charSequence.length();
        if (length == 0) {
            return C9239oooo0ooO.m21126OooO00o();
        }
        if (length != 1) {
            return (Set) OooO00o(charSequence, (Collection) new LinkedHashSet(C9232oooo0o00.OooO00o(charSequence.length())));
        }
        return C9237oooo0oo.OooO00o(Character.valueOf(charSequence.charAt(0)));
    }

    @NotNull
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final <R> List<R> m22939OooO0O0(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            arrayList.add(o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <R> List<R> m22923OooO00o(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, ? extends Iterable<? extends R>> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < charSequence.length(); i++) {
            C9210oooo000O.m21074OooO00o((Collection) arrayList, (Iterable) o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final <R> List<R> m22940OooO0O0(@NotNull CharSequence charSequence, @NotNull O00Oo000<? super Integer, ? super Character, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, BaseViewManager.PROP_TRANSFORM);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i2 + 1;
            Object invoke = o00Oo000.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C OooO00o(@NotNull CharSequence charSequence, @NotNull C c, @NotNull O00O0OOO<? super Character, ? extends Iterable<? extends R>> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        for (int i = 0; i < charSequence.length(); i++) {
            C9210oooo000O.m21074OooO00o((Collection) c, (Iterable) o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C OooO0O0(@NotNull CharSequence charSequence, @NotNull C c, @NotNull O00Oo000<? super Integer, ? super Character, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00Oo000, BaseViewManager.PROP_TRANSFORM);
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            Integer valueOf = Integer.valueOf(i);
            i++;
            c.add(o00Oo000.invoke(valueOf, Character.valueOf(charAt)));
        }
        return c;
    }

    @NotNull
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final Iterable<C9219oooo0O0<Character>> m22937OooO0O0(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return new C9221oooo0O0O(new StringsKt___StringsKt$withIndex$1(charSequence));
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <K> AbstractC9214oooo00Oo<Character, K> m22911OooO00o(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, ? extends K> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        return new OooO0OO(charSequence, o00o0ooo);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final boolean m22942OooO0O0(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <R> List<R> m22924OooO00o(@NotNull CharSequence charSequence, @NotNull O00Oo000<? super Integer, ? super Character, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, BaseViewManager.PROP_TRANSFORM);
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            Integer valueOf = Integer.valueOf(i);
            i++;
            arrayList.add(o00Oo000.invoke(valueOf, Character.valueOf(charAt)));
        }
        return arrayList;
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final int m22931OooO0O0(@NotNull CharSequence charSequence) {
        return charSequence.length();
    }

    public static final <R> R OooO0O0(@NotNull CharSequence charSequence, R r, @NotNull O00Oo000<? super Character, ? super R, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, "operation");
        for (int OooO00o2 = StringsKt__StringsKt.OooO00o(charSequence); OooO00o2 >= 0; OooO00o2--) {
            r = (R) o00Oo000.invoke(Character.valueOf(charSequence.charAt(OooO00o2)), r);
        }
        return r;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m22930OooO00o(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <R> R OooO0O0(@NotNull CharSequence charSequence, R r, @NotNull O00Oo00O<? super Integer, ? super Character, ? super R, ? extends R> o00Oo00O) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00Oo00O, "operation");
        for (int OooO00o2 = StringsKt__StringsKt.OooO00o(charSequence); OooO00o2 >= 0; OooO00o2--) {
            r = (R) o00Oo00O.invoke(Integer.valueOf(OooO00o2), Character.valueOf(charSequence.charAt(OooO00o2)), r);
        }
        return r;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final int m22908OooO00o(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    public static final <R> R OooO00o(@NotNull CharSequence charSequence, R r, @NotNull O00Oo000<? super R, ? super Character, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, "operation");
        for (int i = 0; i < charSequence.length(); i++) {
            r = (R) o00Oo000.invoke(r, Character.valueOf(charSequence.charAt(i)));
        }
        return r;
    }

    @Nullable
    public static final Character OooO0O0(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(comparator, "comparator");
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int OooO00o2 = StringsKt__StringsKt.OooO00o(charSequence);
        if (1 <= OooO00o2) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                    charAt = charAt2;
                }
                if (i == OooO00o2) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    public static final <R> R OooO00o(@NotNull CharSequence charSequence, R r, @NotNull O00Oo00O<? super Integer, ? super R, ? super Character, ? extends R> o00Oo00O) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00Oo00O, "operation");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            Integer valueOf = Integer.valueOf(i);
            i++;
            r = (R) o00Oo00O.invoke(valueOf, r, Character.valueOf(charAt));
        }
        return r;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final void m22928OooO00o(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, C9174oooOOooO> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "action");
        for (int i = 0; i < charSequence.length(); i++) {
            o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i)));
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final void m22929OooO00o(@NotNull CharSequence charSequence, @NotNull O00Oo000<? super Integer, ? super Character, C9174oooOOooO> o00Oo000) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, "action");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            Integer valueOf = Integer.valueOf(i);
            i++;
            o00Oo000.invoke(valueOf, Character.valueOf(charAt));
        }
    }

    @Nullable
    public static final Character OooO00o(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(comparator, "comparator");
        int i = 1;
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int OooO00o2 = StringsKt__StringsKt.OooO00o(charSequence);
        if (1 <= OooO00o2) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                    charAt = charAt2;
                }
                if (i == OooO00o2) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    public static final char OooO0O0(@NotNull CharSequence charSequence, @NotNull O00Oo000<? super Character, ? super Character, Character> o00Oo000) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, "operation");
        int OooO00o2 = StringsKt__StringsKt.OooO00o(charSequence);
        if (OooO00o2 >= 0) {
            char charAt = charSequence.charAt(OooO00o2);
            for (int i = OooO00o2 - 1; i >= 0; i--) {
                charAt = o00Oo000.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charAt)).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    public static final char OooO00o(@NotNull CharSequence charSequence, @NotNull O00Oo000<? super Character, ? super Character, Character> o00Oo000) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, "operation");
        int i = 1;
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            int OooO00o2 = StringsKt__StringsKt.OooO00o(charSequence);
            if (1 <= OooO00o2) {
                while (true) {
                    charAt = o00Oo000.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))).charValue();
                    if (i == OooO00o2) {
                        break;
                    }
                    i++;
                }
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    public static final char OooO0O0(@NotNull CharSequence charSequence, @NotNull O00Oo00O<? super Integer, ? super Character, ? super Character, Character> o00Oo00O) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00Oo00O, "operation");
        int OooO00o2 = StringsKt__StringsKt.OooO00o(charSequence);
        if (OooO00o2 >= 0) {
            char charAt = charSequence.charAt(OooO00o2);
            for (int i = OooO00o2 - 1; i >= 0; i--) {
                charAt = o00Oo00O.invoke(Integer.valueOf(i), Character.valueOf(charSequence.charAt(i)), Character.valueOf(charAt)).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    @NotNull
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final AbstractC7873oO0OOo00<Character> m22933OooO0O0(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                return SequencesKt__SequencesKt.OooO00o();
            }
        }
        return new OooO0O0(charSequence);
    }

    public static final char OooO00o(@NotNull CharSequence charSequence, @NotNull O00Oo00O<? super Integer, ? super Character, ? super Character, Character> o00Oo00O) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00Oo00O, "operation");
        int i = 1;
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            int OooO00o2 = StringsKt__StringsKt.OooO00o(charSequence);
            if (1 <= OooO00o2) {
                while (true) {
                    charAt = o00Oo00O.invoke(Integer.valueOf(i), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))).charValue();
                    if (i == OooO00o2) {
                        break;
                    }
                    i++;
                }
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final Character m22936OooO0O0(@NotNull CharSequence charSequence, O00O0OOO<? super Character, Boolean> o00o0ooo) {
        char charAt;
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return null;
            }
            charAt = charSequence.charAt(length);
        } while (!o00o0ooo.invoke(Character.valueOf(charAt)).booleanValue());
        return Character.valueOf(charAt);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C OooO0O0(@NotNull CharSequence charSequence, @NotNull C c, @NotNull O00O0OOO<? super Character, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        for (int i = 0; i < charSequence.length(); i++) {
            Object invoke = o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i)));
            if (invoke != null) {
                c.add(invoke);
            }
        }
        return c;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final double m22907OooO00o(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Double> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "selector");
        double d = AbstractC8352oOoOOoO0.OooO0O0;
        for (int i = 0; i < charSequence.length(); i++) {
            d += o00o0ooo.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue();
        }
        return d;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final List<String> m22919OooO00o(@NotNull CharSequence charSequence, int i) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return m22920OooO00o(charSequence, i, i, true);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <R> List<R> m22922OooO00o(@NotNull CharSequence charSequence, int i, @NotNull O00O0OOO<? super CharSequence, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        return m22921OooO00o(charSequence, i, i, true, (O00O0OOO) o00o0ooo);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final AbstractC7873oO0OOo00<String> m22909OooO00o(@NotNull CharSequence charSequence, int i) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return m22910OooO00o(charSequence, i, (O00O0OOO) StringsKt___StringsKt$chunkedSequence$1.INSTANCE);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <R> AbstractC7873oO0OOo00<R> m22910OooO00o(@NotNull CharSequence charSequence, int i, @NotNull O00O0OOO<? super CharSequence, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        return OooO00o(charSequence, i, i, true, (O00O0OOO) o00o0ooo);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Pair<CharSequence, CharSequence> m22927OooO00o(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (o00o0ooo.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        return new Pair<>(sb, sb2);
    }

    @NotNull
    public static final Pair<String, String> OooO00o(@NotNull String str, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (o00o0ooo.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        return new Pair<>(sb.toString(), sb2.toString());
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final List<String> m22920OooO00o(@NotNull CharSequence charSequence, int i, int i2, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return m22921OooO00o(charSequence, i, i2, z, (O00O0OOO) StringsKt___StringsKt$windowed$1.INSTANCE);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <R> List<R> m22921OooO00o(@NotNull CharSequence charSequence, int i, int i2, boolean z, @NotNull O00O0OOO<? super CharSequence, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        SlidingWindowKt.OooO00o(i, i2);
        int length = charSequence.length();
        ArrayList arrayList = new ArrayList(((length + i2) - 1) / i2);
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + i;
            if (i4 > length) {
                if (!z) {
                    break;
                }
                i4 = length;
            }
            arrayList.add(o00o0ooo.invoke(charSequence.subSequence(i3, i4)));
            i3 += i2;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final AbstractC7873oO0OOo00<String> OooO00o(@NotNull CharSequence charSequence, int i, int i2, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return OooO00o(charSequence, i, i2, z, (O00O0OOO) StringsKt___StringsKt$windowedSequence$1.INSTANCE);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <R> AbstractC7873oO0OOo00<R> OooO00o(@NotNull CharSequence charSequence, int i, int i2, boolean z, @NotNull O00O0OOO<? super CharSequence, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        SlidingWindowKt.OooO00o(i, i2);
        return SequencesKt___SequencesKt.OooO0oO(CollectionsKt___CollectionsKt.m22707OooO00o((Iterable) oO00O000.OooO00o((IntProgression) (z ? StringsKt__StringsKt.m22892OooO00o(charSequence) : oO00O000.m19458OooO00o(0, (charSequence.length() - i) + 1)), i2)), (O00O0OOO) new StringsKt___StringsKt$windowedSequence$2(charSequence, o00o0ooo, i));
    }

    @NotNull
    public static final <V> List<V> OooO00o(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull O00Oo000<? super Character, ? super Character, ? extends V> o00Oo000) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(charSequence2, DispatchConstants.OTHER);
        o0O0OO00.OooO0o(o00Oo000, BaseViewManager.PROP_TRANSFORM);
        int min = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o00Oo000.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence2.charAt(i))));
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Iterable<Character> m22917OooO00o(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                return CollectionsKt__CollectionsKt.m22696OooO00o();
            }
        }
        return new OooO00o(charSequence);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Character m22916OooO00o(@NotNull CharSequence charSequence, O00O0OOO<? super Character, Boolean> o00o0ooo) {
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (o00o0ooo.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @NotNull
    public static final <C extends Appendable> C OooO00o(@NotNull CharSequence charSequence, @NotNull C c, @NotNull O00Oo000<? super Integer, ? super Character, Boolean> o00Oo000) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00Oo000, "predicate");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            int i3 = i2 + 1;
            if (o00Oo000.invoke(Integer.valueOf(i2), Character.valueOf(charAt)).booleanValue()) {
                c.append(charAt);
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C OooO00o(@NotNull CharSequence charSequence, @NotNull C c, @NotNull O00Oo000<? super Integer, ? super Character, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00Oo000, BaseViewManager.PROP_TRANSFORM);
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i2 + 1;
            Object invoke = o00Oo000.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            if (invoke != null) {
                c.add(invoke);
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @NotNull
    public static final List<Pair<Character, Character>> OooO00o(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(charSequence2, DispatchConstants.OTHER);
        int min = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(C9163oooOOO0O.OooO00o(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence2.charAt(i))));
        }
        return arrayList;
    }
}
