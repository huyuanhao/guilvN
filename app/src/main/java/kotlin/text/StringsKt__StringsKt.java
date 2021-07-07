package kotlin.text;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.art.ARTTextShadowNode;
import com.p118pd.sdk.AbstractC7873oO0OOo00;
import com.p118pd.sdk.AbstractC9197oooOoo0o;
import com.p118pd.sdk.C8282oOo000oO;
import com.p118pd.sdk.C9163oooOOO0O;
import com.p118pd.sdk.C9188oooOoOoo;
import com.p118pd.sdk.C9201oooOooOo;
import com.p118pd.sdk.C9202oooOooo;
import com.p118pd.sdk.O00O0000;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.OOO00O;
import com.p118pd.sdk.o0O0OO00;
import com.p118pd.sdk.oO00O000;
import com.p118pd.sdk.oOO0OO00;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.InlineOnly;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.DelimitedRangesSequence;
import kotlin.text.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u000e\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001f\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\rH\u0002\u001a\u001f\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\rH\u0002\u001a\u0015\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\n\u001a\u001c\u0010\u0014\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u0014\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a:\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001aE\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0002\b\u001c\u001a:\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010\u001e\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0006\u001a4\u0010 \u001a\u0002H!\"\f\b\u0000\u0010\"*\u00020\u0002*\u0002H!\"\u0004\b\u0001\u0010!*\u0002H\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0$H\b¢\u0006\u0002\u0010%\u001a4\u0010&\u001a\u0002H!\"\f\b\u0000\u0010\"*\u00020\u0002*\u0002H!\"\u0004\b\u0001\u0010!*\u0002H\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0$H\b¢\u0006\u0002\u0010%\u001a&\u0010'\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a;\u0010'\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0002\b)\u001a&\u0010'\u001a\u00020\u0006*\u00020\u00022\u0006\u0010*\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u0010+\u001a\u00020\u0006*\u00020\u00022\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a,\u0010+\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\r\u0010.\u001a\u00020\r*\u00020\u0002H\b\u001a\r\u0010/\u001a\u00020\r*\u00020\u0002H\b\u001a\r\u00100\u001a\u00020\r*\u00020\u0002H\b\u001a \u00101\u001a\u00020\r*\u0004\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u00102\u001a\u00020\r*\u0004\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u00103\u001a\u000204*\u00020\u0002H\u0002\u001a&\u00105\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u00105\u001a\u00020\u0006*\u00020\u00022\u0006\u0010*\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u00106\u001a\u00020\u0006*\u00020\u00022\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a,\u00106\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0010\u00107\u001a\b\u0012\u0004\u0012\u00020\n08*\u00020\u0002\u001a\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u0002\u001a\u0015\u0010;\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\f\u001a\u000f\u0010<\u001a\u00020\n*\u0004\u0018\u00010\nH\b\u001a\u001c\u0010=\u001a\u00020\u0002*\u00020\u00022\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011\u001a\u001c\u0010=\u001a\u00020\n*\u00020\n2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011\u001a\u001c\u0010@\u001a\u00020\u0002*\u00020\u00022\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011\u001a\u001c\u0010@\u001a\u00020\n*\u00020\n2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011\u001aG\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000108*\u00020\u00022\u000e\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0C2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0004\bE\u0010F\u001a=\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000108*\u00020\u00022\u0006\u0010B\u001a\u00020-2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0002\bE\u001a4\u0010G\u001a\u00020\r*\u00020\u00022\u0006\u0010H\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0012\u0010J\u001a\u00020\u0002*\u00020\u00022\u0006\u0010K\u001a\u00020\u0002\u001a\u0012\u0010J\u001a\u00020\n*\u00020\n2\u0006\u0010K\u001a\u00020\u0002\u001a\u001a\u0010L\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006\u001a\u0012\u0010L\u001a\u00020\u0002*\u00020\u00022\u0006\u0010M\u001a\u00020\u0001\u001a\u001d\u0010L\u001a\u00020\n*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\b\u001a\u0015\u0010L\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u0001H\b\u001a\u0012\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010N\u001a\u00020\n*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010O\u001a\u00020\u0002*\u00020\u00022\u0006\u0010P\u001a\u00020\u0002\u001a\u001a\u0010O\u001a\u00020\u0002*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u0002\u001a\u001a\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010K\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a+\u0010Q\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0014\b\b\u0010R\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u00020SH\b\u001a\u001d\u0010Q\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\nH\b\u001a$\u0010V\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010V\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010X\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010X\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010Y\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010Y\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010Z\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010Z\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001d\u0010[\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\nH\b\u001a\"\u0010\\\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0002\u001a\u001a\u0010\\\u001a\u00020\u0002*\u00020\u00022\u0006\u0010M\u001a\u00020\u00012\u0006\u0010U\u001a\u00020\u0002\u001a%\u0010\\\u001a\u00020\n*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0002H\b\u001a\u001d\u0010\\\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u00012\u0006\u0010U\u001a\u00020\u0002H\b\u001a=\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\u0012\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0C\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006¢\u0006\u0002\u0010^\u001a0\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\n\u0010B\u001a\u00020-\"\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006\u001a/\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\u0006\u0010P\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0002\b_\u001a%\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010D\u001a\u00020\u0006H\b\u001a=\u0010`\u001a\b\u0012\u0004\u0012\u00020\n08*\u00020\u00022\u0012\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0C\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006¢\u0006\u0002\u0010a\u001a0\u0010`\u001a\b\u0012\u0004\u0012\u00020\n08*\u00020\u00022\n\u0010B\u001a\u00020-\"\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006\u001a\u001c\u0010b\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010b\u001a\u00020\r*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a$\u0010b\u001a\u00020\r*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010M\u001a\u00020\u0001\u001a\u001d\u0010c\u001a\u00020\u0002*\u00020\n2\u0006\u0010d\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u0006H\b\u001a\u001f\u0010f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010(\u001a\u00020\u0006H\b\u001a\u0012\u0010f\u001a\u00020\n*\u00020\u00022\u0006\u0010M\u001a\u00020\u0001\u001a\u0012\u0010f\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u0001\u001a\u001c\u0010g\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010g\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010h\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010h\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010i\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010i\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010j\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010j\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\n\u0010k\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010k\u001a\u00020\u0002*\u00020\u00022\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010k\u001a\u00020\u0002*\u00020\u00022\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\r\u0010k\u001a\u00020\n*\u00020\nH\b\u001a!\u0010k\u001a\u00020\n*\u00020\n2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010k\u001a\u00020\n*\u00020\n2\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\n\u0010m\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010m\u001a\u00020\u0002*\u00020\u00022\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010m\u001a\u00020\u0002*\u00020\u00022\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\r\u0010m\u001a\u00020\n*\u00020\nH\b\u001a!\u0010m\u001a\u00020\n*\u00020\n2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010m\u001a\u00020\n*\u00020\n2\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\n\u0010n\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010n\u001a\u00020\u0002*\u00020\u00022\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010n\u001a\u00020\u0002*\u00020\u00022\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\r\u0010n\u001a\u00020\n*\u00020\nH\b\u001a!\u0010n\u001a\u00020\n*\u00020\n2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010n\u001a\u00020\n*\u00020\n2\n\u0010,\u001a\u00020-\"\u00020\u0011\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006o"}, mo43195d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "commonPrefixWith", "", DispatchConstants.OTHER, "ignoreCase", "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "ifBlank", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", "", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", ARTTextShadowNode.PROP_LINES, "", "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "limit", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", BaseViewManager.PROP_TRANSFORM, "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", ViewProps.START, ViewProps.END, "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, mo43196k = 5, mo43197mv = {1, 1, 13}, mo43199xi = 1, mo43200xs = "kotlin/text/StringsKt")
public class StringsKt__StringsKt extends oOO0OO00 {

    public static final class OooO00o extends AbstractC9197oooOoo0o {
        public final /* synthetic */ CharSequence OooO00o;
        public int o00oO0O;

        public OooO00o(CharSequence charSequence) {
            this.OooO00o = charSequence;
        }

        @Override // com.p118pd.sdk.AbstractC9197oooOoo0o, com.p118pd.sdk.AbstractC9197oooOoo0o
        public char OooO00o() {
            CharSequence charSequence = this.OooO00o;
            int i = this.o00oO0O;
            this.o00oO0O = i + 1;
            return charSequence.charAt(i);
        }

        public boolean hasNext() {
            return this.o00oO0O < this.OooO00o.length();
        }
    }

    @InlineOnly
    public static final String OooO(@NotNull String str) {
        if (str != null) {
            return OooO0O0((CharSequence) str).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @NotNull
    public static final CharSequence OooO0O0(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (o00o0ooo.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue());
        return charSequence.subSequence(0, length + 1);
    }

    @NotNull
    public static final CharSequence OooO0OO(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
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
    public static final boolean OooO0Oo(@NotNull CharSequence charSequence) {
        return charSequence.length() > 0;
    }

    @InlineOnly
    public static final boolean OooO0o(@Nullable CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    @InlineOnly
    public static final boolean OooO0o0(@Nullable CharSequence charSequence) {
        return charSequence == null || oOO0OO00.OooO00o(charSequence);
    }

    @InlineOnly
    public static final String OooO0oO(@Nullable String str) {
        return str != null ? str : "";
    }

    @InlineOnly
    public static final String OooO0oo(@NotNull String str) {
        if (str != null) {
            return m22895OooO00o((CharSequence) str).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @InlineOnly
    public static final String OooOO0(@NotNull String str) {
        if (str != null) {
            return OooO0OO((CharSequence) str).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @NotNull
    public static final CharSequence OooO00o(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean booleanValue = o00o0ooo.invoke(Character.valueOf(charSequence.charAt(!z ? i : length))).booleanValue();
            if (!z) {
                if (!booleanValue) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!booleanValue) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    @NotNull
    public static /* synthetic */ String OooO0Oo(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return OooO0Oo(str, str2, str3);
    }

    @NotNull
    public static /* synthetic */ String OooO0o0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return OooO0o0(str, str2, str3);
    }

    @NotNull
    public static final String OooO0Oo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "delimiter");
        o0O0OO00.OooO0o(str3, "missingDelimiterValue");
        int OooO00o2 = OooO00o((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (OooO00o2 == -1) {
            return str3;
        }
        String substring = str.substring(0, OooO00o2);
        o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String OooO0o0(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "delimiter");
        o0O0OO00.OooO0o(str3, "missingDelimiterValue");
        int OooO0O0 = OooO0O0((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (OooO0O0 == -1) {
            return str3;
        }
        String substring = str.substring(0, OooO0O0);
        o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static /* synthetic */ CharSequence OooO0O0(CharSequence charSequence, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return OooO0O0(charSequence, i, c);
    }

    @InlineOnly
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static final boolean m22906OooO0OO(@NotNull CharSequence charSequence) {
        return !oOO0OO00.OooO00o(charSequence);
    }

    @NotNull
    public static /* synthetic */ CharSequence OooO00o(CharSequence charSequence, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return OooO00o(charSequence, i, c);
    }

    @NotNull
    public static final CharSequence OooO0O0(@NotNull CharSequence charSequence, int i, char c) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - charSequence.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append(charSequence);
            return sb;
        }
    }

    @NotNull
    public static /* synthetic */ String OooO0OO(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return OooO0OO(str, c, str2);
    }

    @NotNull
    public static /* synthetic */ String OooO0Oo(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return OooO0Oo(str, c, str2);
    }

    @NotNull
    public static final CharSequence OooO00o(@NotNull CharSequence charSequence, int i, char c) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append(charSequence);
            int length = i - charSequence.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            return sb;
        }
    }

    @NotNull
    public static final String OooO0OO(@NotNull String str, char c, @NotNull String str2) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "missingDelimiterValue");
        int OooO00o2 = OooO00o((CharSequence) str, c, 0, false, 6, (Object) null);
        if (OooO00o2 == -1) {
            return str2;
        }
        String substring = str.substring(0, OooO00o2);
        o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String OooO0Oo(@NotNull String str, char c, @NotNull String str2) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "missingDelimiterValue");
        int OooO0O0 = OooO0O0((CharSequence) str, c, 0, false, 6, (Object) null);
        if (OooO0O0 == -1) {
            return str2;
        }
        String substring = str.substring(0, OooO0O0);
        o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static /* synthetic */ String OooO0OO(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return OooO0OO(str, str2, str3);
    }

    @NotNull
    public static /* synthetic */ String OooO0Oo(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return OooO0Oo(str, c, str2, str3);
    }

    @NotNull
    public static final String OooO0OO(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "delimiter");
        o0O0OO00.OooO0o(str3, "missingDelimiterValue");
        int OooO0O0 = OooO0O0((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (OooO0O0 == -1) {
            return str3;
        }
        String substring = str.substring(OooO0O0 + str2.length(), str.length());
        o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String OooO0Oo(@NotNull String str, char c, @NotNull String str2, @NotNull String str3) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "replacement");
        o0O0OO00.OooO0o(str3, "missingDelimiterValue");
        int OooO0O0 = OooO0O0((CharSequence) str, c, 0, false, 6, (Object) null);
        return OooO0O0 == -1 ? str3 : OooO00o((CharSequence) str, 0, OooO0O0, (CharSequence) str2).toString();
    }

    @NotNull
    public static final CharSequence OooO0OO(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(charSequence2, "delimiter");
        return OooO00o(charSequence, charSequence2, charSequence2);
    }

    @NotNull
    public static /* synthetic */ String OooO0Oo(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return OooO0Oo(str, str2, str3, str4);
    }

    @NotNull
    public static /* synthetic */ String OooO0O0(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return OooO0O0(str, i, c);
    }

    @NotNull
    public static final String OooO0OO(@NotNull String str, @NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(charSequence, "delimiter");
        return OooO00o(str, charSequence, charSequence);
    }

    @NotNull
    public static final String OooO0Oo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "delimiter");
        o0O0OO00.OooO0o(str3, "replacement");
        o0O0OO00.OooO0o(str4, "missingDelimiterValue");
        int OooO0O0 = OooO0O0((CharSequence) str, str2, 0, false, 6, (Object) null);
        return OooO0O0 == -1 ? str4 : OooO00o((CharSequence) str, 0, OooO0O0, (CharSequence) str3).toString();
    }

    @NotNull
    public static /* synthetic */ String OooO00o(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return OooO00o(str, i, c);
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str, int i, char c) {
        o0O0OO00.OooO0o(str, "receiver$0");
        return OooO0O0((CharSequence) str, i, c).toString();
    }

    @NotNull
    public static /* synthetic */ String OooO0OO(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return OooO0OO(str, c, str2, str3);
    }

    @NotNull
    public static final String OooO00o(@NotNull String str, int i, char c) {
        o0O0OO00.OooO0o(str, "receiver$0");
        return OooO00o((CharSequence) str, i, c).toString();
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final boolean m22904OooO0O0(@NotNull CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @NotNull
    public static final String OooO0OO(@NotNull String str, char c, @NotNull String str2, @NotNull String str3) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "replacement");
        o0O0OO00.OooO0o(str3, "missingDelimiterValue");
        int OooO00o2 = OooO00o((CharSequence) str, c, 0, false, 6, (Object) null);
        return OooO00o2 == -1 ? str3 : OooO00o((CharSequence) str, 0, OooO00o2, (CharSequence) str2).toString();
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final AbstractC9197oooOoo0o m22894OooO00o(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return new OooO00o(charSequence);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: C extends java.lang.CharSequence & R */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <C extends CharSequence & R, R> R OooO0O0(C c, O00O0000<? extends R> o00o0000) {
        return c.length() == 0 ? (R) o00o0000.invoke() : c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: C extends java.lang.CharSequence & R */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <C extends CharSequence & R, R> R OooO00o(C c, O00O0000<? extends R> o00o0000) {
        return oOO0OO00.OooO00o(c) ? (R) o00o0000.invoke() : c;
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str, @NotNull IntRange oo000o0o) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(oo000o0o, "range");
        String substring = str.substring(oo000o0o.OooO00o().intValue(), oo000o0o.OooO0O0().intValue() + 1);
        o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static /* synthetic */ String OooO0OO(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return OooO0OO(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final IntRange m22892OooO00o(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return new IntRange(0, charSequence.length() - 1);
    }

    @NotNull
    public static final CharSequence OooO0O0(@NotNull CharSequence charSequence, @NotNull IntRange oo000o0o) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(oo000o0o, "range");
        return charSequence.subSequence(oo000o0o.OooO00o().intValue(), oo000o0o.OooO0O0().intValue() + 1);
    }

    @NotNull
    public static final String OooO0OO(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "delimiter");
        o0O0OO00.OooO0o(str3, "replacement");
        o0O0OO00.OooO0o(str4, "missingDelimiterValue");
        int OooO00o2 = OooO00o((CharSequence) str, str2, 0, false, 6, (Object) null);
        return OooO00o2 == -1 ? str4 : OooO00o((CharSequence) str, 0, OooO00o2, (CharSequence) str3).toString();
    }

    public static final int OooO00o(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return charSequence.length() - 1;
    }

    @NotNull
    public static /* synthetic */ String OooO0O0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return OooO0O0(str, str2, str3);
    }

    public static final boolean OooO00o(@NotNull CharSequence charSequence, int i) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        int length = charSequence.length() - 2;
        if (i >= 0 && length >= i && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1))) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "delimiter");
        o0O0OO00.OooO0o(str3, "missingDelimiterValue");
        int OooO00o2 = OooO00o((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (OooO00o2 == -1) {
            return str3;
        }
        String substring = str.substring(OooO00o2 + str2.length(), str.length());
        o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ boolean OooO0OO(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return OooO0OO(charSequence, c, z);
    }

    public static final boolean OooO0OO(@NotNull CharSequence charSequence, char c, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return charSequence.length() > 0 && OOO00O.OooO00o(charSequence.charAt(0), c, z);
    }

    @NotNull
    public static /* synthetic */ String OooO0O0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return OooO0O0(str, c, str2);
    }

    public static /* synthetic */ boolean OooO0OO(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return OooO0OO(charSequence, charSequence2, z);
    }

    @Deprecated(message = "Use parameters named startIndex and endIndex.", replaceWith = @ReplaceWith(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @InlineOnly
    public static final CharSequence OooO00o(@NotNull String str, int i, int i2) {
        return str.subSequence(i, i2);
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str, char c, @NotNull String str2) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "missingDelimiterValue");
        int OooO0O0 = OooO0O0((CharSequence) str, c, 0, false, 6, (Object) null);
        if (OooO0O0 == -1) {
            return str2;
        }
        String substring = str.substring(OooO0O0 + 1, str.length());
        o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean OooO0OO(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(charSequence2, "prefix");
        if (z || !(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return OooO0O0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
        }
        return oOO0OO00.OooO0OO((String) charSequence, (String) charSequence2, false, 2, null);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final String m22896OooO00o(@NotNull CharSequence charSequence, int i, int i2) {
        return charSequence.subSequence(i, i2).toString();
    }

    @InlineOnly
    public static /* synthetic */ String OooO00o(CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = charSequence.length();
        }
        return charSequence.subSequence(i, i2).toString();
    }

    @InlineOnly
    public static final String OooO0O0(@NotNull String str, int i, int i2) {
        if (str != null) {
            return OooO00o((CharSequence) str, i, i2).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @NotNull
    public static final CharSequence OooO0O0(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(charSequence2, "suffix");
        if (OooO0O0(charSequence, charSequence2, false, 2, (Object) null)) {
            return charSequence.subSequence(0, charSequence.length() - charSequence2.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final String OooO0OO(@NotNull String str, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        CharSequence charSequence;
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequence = "";
                break;
            } else if (!o00o0ooo.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                charSequence = str.subSequence(i, str.length());
                break;
            } else {
                i++;
            }
        }
        return charSequence.toString();
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final String m22897OooO00o(@NotNull CharSequence charSequence, @NotNull IntRange oo000o0o) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(oo000o0o, "range");
        return charSequence.subSequence(oo000o0o.OooO00o().intValue(), oo000o0o.OooO0O0().intValue() + 1).toString();
    }

    @NotNull
    public static /* synthetic */ String OooO00o(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return OooO00o(str, c, str2);
    }

    @NotNull
    public static final String OooO00o(@NotNull String str, char c, @NotNull String str2) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "missingDelimiterValue");
        int OooO00o2 = OooO00o((CharSequence) str, c, 0, false, 6, (Object) null);
        if (OooO00o2 == -1) {
            return str2;
        }
        String substring = str.substring(OooO00o2 + 1, str.length());
        o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str, @NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(charSequence, "suffix");
        if (!OooO0O0((CharSequence) str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final CharSequence OooO0OO(@NotNull CharSequence charSequence, @NotNull char... cArr) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(cArr, "chars");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!ArraysKt___ArraysKt.m22296OooO00o(cArr, charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @NotNull
    public static final CharSequence OooO00o(@NotNull CharSequence charSequence, int i, int i2, @NotNull CharSequence charSequence2) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    @NotNull
    public static /* synthetic */ String OooO0O0(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return OooO0O0(str, str2, str3, str4);
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "delimiter");
        o0O0OO00.OooO0o(str3, "replacement");
        o0O0OO00.OooO0o(str4, "missingDelimiterValue");
        int OooO0O0 = OooO0O0((CharSequence) str, str2, 0, false, 6, (Object) null);
        return OooO0O0 == -1 ? str4 : OooO00o((CharSequence) str, OooO0O0 + str2.length(), str.length(), (CharSequence) str3).toString();
    }

    @NotNull
    public static /* synthetic */ String OooO0O0(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return OooO0O0(str, c, str2, str3);
    }

    @NotNull
    public static final String OooO0OO(@NotNull String str, @NotNull char... cArr) {
        CharSequence charSequence;
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(cArr, "chars");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequence = "";
                break;
            } else if (!ArraysKt___ArraysKt.m22296OooO00o(cArr, str.charAt(i))) {
                charSequence = str.subSequence(i, str.length());
                break;
            } else {
                i++;
            }
        }
        return charSequence.toString();
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str, char c, @NotNull String str2, @NotNull String str3) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "replacement");
        o0O0OO00.OooO0o(str3, "missingDelimiterValue");
        int OooO0O0 = OooO0O0((CharSequence) str, c, 0, false, 6, (Object) null);
        return OooO0O0 == -1 ? str3 : OooO00o((CharSequence) str, OooO0O0 + 1, str.length(), (CharSequence) str2).toString();
    }

    @InlineOnly
    public static final String OooO00o(@NotNull String str, int i, int i2, CharSequence charSequence) {
        if (str != null) {
            return OooO00o((CharSequence) str, i, i2, charSequence).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @NotNull
    public static final CharSequence OooO00o(@NotNull CharSequence charSequence, @NotNull IntRange oo000o0o, @NotNull CharSequence charSequence2) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(oo000o0o, "range");
        o0O0OO00.OooO0o(charSequence2, "replacement");
        return OooO00o(charSequence, oo000o0o.OooO00o().intValue(), oo000o0o.OooO0O0().intValue() + 1, charSequence2);
    }

    @InlineOnly
    public static final String OooO0O0(@NotNull CharSequence charSequence, Regex regex, String str) {
        return regex.replaceFirst(charSequence, str);
    }

    @InlineOnly
    public static final String OooO00o(@NotNull String str, IntRange oo000o0o, CharSequence charSequence) {
        if (str != null) {
            return OooO00o((CharSequence) str, oo000o0o, charSequence).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @InlineOnly
    public static final boolean OooO0O0(@NotNull CharSequence charSequence, Regex regex) {
        return regex.matches(charSequence);
    }

    @NotNull
    public static final CharSequence OooO00o(@NotNull CharSequence charSequence, int i, int i2) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (i2 < i) {
            throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
        } else if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
            sb.append(charSequence, 0, i);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
    }

    public static final boolean OooO0O0(@NotNull CharSequence charSequence, int i, @NotNull CharSequence charSequence2, int i2, int i3, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(charSequence2, DispatchConstants.OTHER);
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!OOO00O.OooO00o(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final CharSequence OooO0OO(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C8282oOo000oO.OooOOO(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static /* synthetic */ boolean OooO0O0(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return OooO0O0(charSequence, c, z);
    }

    public static final boolean OooO0O0(@NotNull CharSequence charSequence, char c, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return charSequence.length() > 0 && OOO00O.OooO00o(charSequence.charAt(OooO00o(charSequence)), c, z);
    }

    @NotNull
    public static final CharSequence OooO00o(@NotNull CharSequence charSequence, @NotNull IntRange oo000o0o) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(oo000o0o, "range");
        return OooO00o(charSequence, oo000o0o.OooO00o().intValue(), oo000o0o.OooO0O0().intValue() + 1);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final boolean m22905OooO0O0(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(charSequence2, "suffix");
        if (z || !(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return OooO0O0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
        }
        return oOO0OO00.OooO00o((String) charSequence, (String) charSequence2, false, 2, (Object) null);
    }

    @InlineOnly
    public static final String OooO00o(@NotNull String str, IntRange oo000o0o) {
        if (str != null) {
            return OooO00o((CharSequence) str, oo000o0o).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @NotNull
    public static final CharSequence OooO00o(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(charSequence2, "prefix");
        if (OooO0OO(charSequence, charSequence2, false, 2, (Object) null)) {
            return charSequence.subSequence(charSequence2.length(), charSequence.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final String OooO0O0(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(charSequence2, DispatchConstants.OTHER);
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int min = Math.min(length, length2);
        int i = 0;
        while (i < min && OOO00O.OooO00o(charSequence.charAt((length - i) - 1), charSequence2.charAt((length2 - i) - 1), z)) {
            i++;
        }
        if (OooO00o(charSequence, (length - i) - 1) || OooO00o(charSequence2, (length2 - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(length - i, length).toString();
    }

    @NotNull
    public static final String OooO00o(@NotNull String str, @NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(charSequence, "prefix");
        if (!OooO0OO((CharSequence) str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        o0O0OO00.OooO00o((Object) substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @NotNull
    public static final CharSequence OooO00o(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(charSequence2, "prefix");
        o0O0OO00.OooO0o(charSequence3, "suffix");
        if (charSequence.length() < charSequence2.length() + charSequence3.length() || !OooO0OO(charSequence, charSequence2, false, 2, (Object) null) || !OooO0O0(charSequence, charSequence3, false, 2, (Object) null)) {
            return charSequence.subSequence(0, charSequence.length());
        }
        return charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length());
    }

    @NotNull
    public static final String OooO00o(@NotNull String str, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(charSequence, "prefix");
        o0O0OO00.OooO0o(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !OooO0OO((CharSequence) str, charSequence, false, 2, (Object) null) || !OooO0O0((CharSequence) str, charSequence2, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ int OooO0O0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = OooO00o(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return OooO0O0(charSequence, cArr, i, z);
    }

    public static final int OooO0O0(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int OooO0O0 = oO00O000.OooO0O0(i, OooO00o(charSequence)); OooO0O0 >= 0; OooO0O0--) {
                char charAt = charSequence.charAt(OooO0O0);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (OOO00O.OooO00o(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return OooO0O0;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(ArraysKt___ArraysKt.OooO(cArr), i);
    }

    @NotNull
    public static /* synthetic */ String OooO00o(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return OooO00o(str, c, str2, str3);
    }

    @NotNull
    public static final String OooO00o(@NotNull String str, char c, @NotNull String str2, @NotNull String str3) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "replacement");
        o0O0OO00.OooO0o(str3, "missingDelimiterValue");
        int OooO00o2 = OooO00o((CharSequence) str, c, 0, false, 6, (Object) null);
        return OooO00o2 == -1 ? str3 : OooO00o((CharSequence) str, OooO00o2 + 1, str.length(), (CharSequence) str2).toString();
    }

    @NotNull
    public static /* synthetic */ String OooO00o(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return OooO00o(str, str2, str3, str4);
    }

    @NotNull
    public static final String OooO00o(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(str2, "delimiter");
        o0O0OO00.OooO0o(str3, "replacement");
        o0O0OO00.OooO0o(str4, "missingDelimiterValue");
        int OooO00o2 = OooO00o((CharSequence) str, str2, 0, false, 6, (Object) null);
        return OooO00o2 == -1 ? str4 : OooO00o((CharSequence) str, OooO00o2 + str2.length(), str.length(), (CharSequence) str3).toString();
    }

    @InlineOnly
    public static final String OooO00o(@NotNull CharSequence charSequence, Regex regex, String str) {
        return regex.replace(charSequence, str);
    }

    public static final Pair<Integer, String> OooO0O0(@NotNull CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        T t;
        T t2;
        if (z || collection.size() != 1) {
            IntProgression oo000o0o = !z2 ? new IntRange(oO00O000.OooO00o(i, 0), charSequence.length()) : oO00O000.m19451OooO00o(oO00O000.OooO0O0(i, OooO00o(charSequence)), 0);
            if (charSequence instanceof String) {
                int OooO00o2 = oo000o0o.OooO00o();
                int OooO0O0 = oo000o0o.OooO0O0();
                int OooO0OO = oo000o0o.OooO0OO();
                if (OooO0OO <= 0 ? OooO00o2 >= OooO0O0 : OooO00o2 <= OooO0O0) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            T t3 = t2;
                            if (oOO0OO00.OooO00o((String) t3, 0, (String) charSequence, OooO00o2, t3.length(), z)) {
                                break;
                            }
                        }
                        T t4 = t2;
                        if (t4 == null) {
                            if (OooO00o2 == OooO0O0) {
                                break;
                            }
                            OooO00o2 += OooO0OO;
                        } else {
                            return C9163oooOOO0O.OooO00o(Integer.valueOf(OooO00o2), t4);
                        }
                    }
                }
            } else {
                int OooO00o3 = oo000o0o.OooO00o();
                int OooO0O02 = oo000o0o.OooO0O0();
                int OooO0OO2 = oo000o0o.OooO0OO();
                if (OooO0OO2 <= 0 ? OooO00o3 >= OooO0O02 : OooO00o3 <= OooO0O02) {
                    while (true) {
                        Iterator<T> it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            T t5 = t;
                            if (OooO0O0(t5, 0, charSequence, OooO00o3, t5.length(), z)) {
                                break;
                            }
                        }
                        T t6 = t;
                        if (t6 == null) {
                            if (OooO00o3 == OooO0O02) {
                                break;
                            }
                            OooO00o3 += OooO0OO2;
                        } else {
                            return C9163oooOOO0O.OooO00o(Integer.valueOf(OooO00o3), t6);
                        }
                    }
                }
            }
            return null;
        }
        String str = (String) CollectionsKt___CollectionsKt.m22782OooO0o0((Iterable) collection);
        int OooO00o4 = !z2 ? OooO00o(charSequence, str, i, false, 4, (Object) null) : OooO0O0(charSequence, str, i, false, 4, (Object) null);
        if (OooO00o4 < 0) {
            return null;
        }
        return C9163oooOOO0O.OooO00o(Integer.valueOf(OooO00o4), str);
    }

    @InlineOnly
    public static final String OooO00o(@NotNull CharSequence charSequence, Regex regex, O00O0OOO<? super MatchResult, ? extends CharSequence> o00o0ooo) {
        return regex.replace(charSequence, o00o0ooo);
    }

    public static /* synthetic */ boolean OooO00o(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return OooO00o(charSequence, charSequence2, i, z);
    }

    public static final boolean OooO00o(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, int i, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(charSequence2, "prefix");
        if (z || !(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return OooO0O0(charSequence, i, charSequence2, 0, charSequence2.length(), z);
        }
        return oOO0OO00.OooO00o((String) charSequence, (String) charSequence2, i, false, 4, (Object) null);
    }

    @NotNull
    public static final String OooO00o(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(charSequence2, DispatchConstants.OTHER);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && OOO00O.OooO00o(charSequence.charAt(i), charSequence2.charAt(i), z)) {
            i++;
        }
        int i2 = i - 1;
        if (OooO00o(charSequence, i2) || OooO00o(charSequence2, i2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    public static /* synthetic */ int OooO00o(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return OooO00o(charSequence, cArr, i, z);
    }

    public static final int OooO00o(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i, boolean z) {
        boolean z2;
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int OooO00o2 = oO00O000.OooO00o(i, 0);
            int OooO00o3 = OooO00o(charSequence);
            if (OooO00o2 > OooO00o3) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(OooO00o2);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    } else if (OOO00O.OooO00o(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return OooO00o2;
                }
                if (OooO00o2 == OooO00o3) {
                    return -1;
                }
                OooO00o2++;
            }
        } else {
            return ((String) charSequence).indexOf(ArraysKt___ArraysKt.OooO(cArr), i);
        }
    }

    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final Pair<Integer, String> m22903OooO0O0(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(collection, "strings");
        return OooO0O0(charSequence, collection, i, z, true);
    }

    public static final int OooO0O0(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        Integer first;
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(collection, "strings");
        Pair<Integer, String> OooO0O0 = OooO0O0(charSequence, collection, i, z, true);
        if (OooO0O0 == null || (first = OooO0O0.getFirst()) == null) {
            return -1;
        }
        return first.intValue();
    }

    public static /* synthetic */ int OooO0O0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = OooO00o(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return OooO0O0(charSequence, c, i, z);
    }

    public static /* synthetic */ int OooO00o(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return OooO00o(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    public static final int OooO0O0(@NotNull CharSequence charSequence, char c, int i, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return OooO0O0(charSequence, new char[]{c}, i, z);
    }

    public static final int OooO00o(@NotNull CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        IntProgression oo000o0;
        if (!z2) {
            oo000o0 = new IntRange(oO00O000.OooO00o(i, 0), oO00O000.OooO0O0(i2, charSequence.length()));
        } else {
            oo000o0 = oO00O000.m19451OooO00o(oO00O000.OooO0O0(i, OooO00o(charSequence)), oO00O000.OooO00o(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int OooO00o2 = oo000o0.OooO00o();
            int OooO0O0 = oo000o0.OooO0O0();
            int OooO0OO = oo000o0.OooO0OO();
            if (OooO0OO > 0) {
                if (OooO00o2 > OooO0O0) {
                    return -1;
                }
            } else if (OooO00o2 < OooO0O0) {
                return -1;
            }
            while (!OooO0O0(charSequence2, 0, charSequence, OooO00o2, charSequence2.length(), z)) {
                if (OooO00o2 == OooO0O0) {
                    return -1;
                }
                OooO00o2 += OooO0OO;
            }
            return OooO00o2;
        }
        int OooO00o3 = oo000o0.OooO00o();
        int OooO0O02 = oo000o0.OooO0O0();
        int OooO0OO2 = oo000o0.OooO0OO();
        if (OooO0OO2 > 0) {
            if (OooO00o3 > OooO0O02) {
                return -1;
            }
        } else if (OooO00o3 < OooO0O02) {
            return -1;
        }
        while (!oOO0OO00.OooO00o((String) charSequence2, 0, (String) charSequence, OooO00o3, charSequence2.length(), z)) {
            if (OooO00o3 == OooO0O02) {
                return -1;
            }
            OooO00o3 += OooO0OO2;
        }
        return OooO00o3;
    }

    public static /* synthetic */ int OooO0O0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = OooO00o(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return OooO0O0(charSequence, str, i, z);
    }

    public static final int OooO0O0(@NotNull CharSequence charSequence, @NotNull String str, int i, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(str, "string");
        if (z || !(charSequence instanceof String)) {
            return OooO00o(charSequence, (CharSequence) str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        CharSequence charSequence;
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                if (!o00o0ooo.invoke(Character.valueOf(str.charAt(length))).booleanValue()) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final Pair<Integer, String> m22901OooO00o(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(collection, "strings");
        return OooO0O0(charSequence, collection, i, z, false);
    }

    public static final int OooO00o(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        Integer first;
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(collection, "strings");
        Pair<Integer, String> OooO0O0 = OooO0O0(charSequence, collection, i, z, false);
        if (OooO0O0 == null || (first = OooO0O0.getFirst()) == null) {
            return -1;
        }
        return first.intValue();
    }

    @NotNull
    public static final CharSequence OooO0O0(@NotNull CharSequence charSequence, @NotNull char... cArr) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(cArr, "chars");
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (ArraysKt___ArraysKt.m22296OooO00o(cArr, charSequence.charAt(length)));
        return charSequence.subSequence(0, length + 1);
    }

    public static /* synthetic */ int OooO00o(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return OooO00o(charSequence, c, i, z);
    }

    public static final int OooO00o(@NotNull CharSequence charSequence, char c, int i, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return OooO00o(charSequence, new char[]{c}, i, z);
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str, @NotNull char... cArr) {
        CharSequence charSequence;
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(cArr, "chars");
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                if (!ArraysKt___ArraysKt.m22296OooO00o(cArr, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    public static /* synthetic */ int OooO00o(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return OooO00o(charSequence, str, i, z);
    }

    public static final int OooO00o(@NotNull CharSequence charSequence, @NotNull String str, int i, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(str, "string");
        if (z || !(charSequence instanceof String)) {
            return OooO00o(charSequence, (CharSequence) str, i, charSequence.length(), z, false, 16, (Object) null);
        }
        return ((String) charSequence).indexOf(str, i);
    }

    @NotNull
    public static final CharSequence OooO0O0(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (C8282oOo000oO.OooOOO(charSequence.charAt(length)));
        return charSequence.subSequence(0, length + 1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m22902OooO00o(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(charSequence2, DispatchConstants.OTHER);
        if (charSequence2 instanceof String) {
            if (OooO00o(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else if (OooO00o(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean OooO00o(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return OooO00o(charSequence, c, z);
    }

    public static final boolean OooO00o(@NotNull CharSequence charSequence, char c, boolean z) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return OooO00o(charSequence, c, 0, z, 2, null) >= 0;
    }

    @InlineOnly
    public static final boolean OooO00o(@NotNull CharSequence charSequence, Regex regex) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return regex.containsMatchIn(charSequence);
    }

    public static /* synthetic */ AbstractC7873oO0OOo00 OooO00o(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return OooO00o(charSequence, cArr, i, z, i2);
    }

    public static final AbstractC7873oO0OOo00<IntRange> OooO00o(@NotNull CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new DelimitedRangesSequence(charSequence, i, i2, new StringsKt__StringsKt$rangesDelimitedBy$2(cArr, z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }

    public static /* synthetic */ AbstractC7873oO0OOo00 OooO00o(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return OooO00o(charSequence, strArr, i, z, i2);
    }

    public static final AbstractC7873oO0OOo00<IntRange> OooO00o(@NotNull CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new DelimitedRangesSequence(charSequence, i, i2, new StringsKt__StringsKt$rangesDelimitedBy$4(C9188oooOoOoo.OooO00o((Object[]) strArr), z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }

    @NotNull
    public static final AbstractC7873oO0OOo00<String> OooO00o(@NotNull CharSequence charSequence, @NotNull String[] strArr, boolean z, int i) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(strArr, "delimiters");
        return SequencesKt___SequencesKt.OooO0oO(OooO00o(charSequence, strArr, 0, z, i, 2, (Object) null), (O00O0OOO) new StringsKt__StringsKt$splitToSequence$1(charSequence));
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final List<String> m22900OooO00o(@NotNull CharSequence charSequence, @NotNull String[] strArr, boolean z, int i) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(strArr, "delimiters");
        boolean z2 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return OooO00o(charSequence, str, z, i);
            }
        }
        Iterable<IntRange> OooO00o2 = SequencesKt___SequencesKt.m22833OooO00o(OooO00o(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C9202oooOooo.OooO00o(OooO00o2, 10));
        for (IntRange oo000o0o : OooO00o2) {
            arrayList.add(m22897OooO00o(charSequence, oo000o0o));
        }
        return arrayList;
    }

    @NotNull
    public static final AbstractC7873oO0OOo00<String> OooO00o(@NotNull CharSequence charSequence, @NotNull char[] cArr, boolean z, int i) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(cArr, "delimiters");
        return SequencesKt___SequencesKt.OooO0oO(OooO00o(charSequence, cArr, 0, z, i, 2, (Object) null), (O00O0OOO) new StringsKt__StringsKt$splitToSequence$2(charSequence));
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final List<String> m22899OooO00o(@NotNull CharSequence charSequence, @NotNull char[] cArr, boolean z, int i) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(cArr, "delimiters");
        if (cArr.length == 1) {
            return OooO00o(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<IntRange> OooO00o2 = SequencesKt___SequencesKt.m22833OooO00o(OooO00o(charSequence, cArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C9202oooOooo.OooO00o(OooO00o2, 10));
        for (IntRange oo000o0o : OooO00o2) {
            arrayList.add(m22897OooO00o(charSequence, oo000o0o));
        }
        return arrayList;
    }

    public static final List<String> OooO00o(@NotNull CharSequence charSequence, String str, boolean z, int i) {
        int i2 = 0;
        if (i >= 0) {
            int OooO00o2 = OooO00o(charSequence, str, 0, z);
            if (OooO00o2 == -1 || i == 1) {
                return C9201oooOooOo.OooO00o(charSequence.toString());
            }
            boolean z2 = i > 0;
            int i3 = 10;
            if (z2) {
                i3 = oO00O000.OooO0O0(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, OooO00o2).toString());
                i2 = str.length() + OooO00o2;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                OooO00o2 = OooO00o(charSequence, str, i2, z);
            } while (OooO00o2 != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    @InlineOnly
    public static final List<String> OooO00o(@NotNull CharSequence charSequence, Regex regex, int i) {
        return regex.split(charSequence, i);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final AbstractC7873oO0OOo00<String> m22893OooO00o(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return OooO00o(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final List<String> m22898OooO00o(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        return SequencesKt___SequencesKt.m22841OooO00o((AbstractC7873oO0OOo00) m22893OooO00o(charSequence));
    }

    @NotNull
    public static final String OooO00o(@NotNull String str, @NotNull O00O0OOO<? super Character, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean booleanValue = o00o0ooo.invoke(Character.valueOf(str.charAt(!z ? i : length))).booleanValue();
            if (!z) {
                if (!booleanValue) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!booleanValue) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    @NotNull
    public static final CharSequence OooO00o(@NotNull CharSequence charSequence, @NotNull char... cArr) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        o0O0OO00.OooO0o(cArr, "chars");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean OooO00o2 = ArraysKt___ArraysKt.m22296OooO00o(cArr, charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!OooO00o2) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!OooO00o2) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    @NotNull
    public static final String OooO00o(@NotNull String str, @NotNull char... cArr) {
        o0O0OO00.OooO0o(str, "receiver$0");
        o0O0OO00.OooO0o(cArr, "chars");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean OooO00o2 = ArraysKt___ArraysKt.m22296OooO00o(cArr, str.charAt(!z ? i : length));
            if (!z) {
                if (!OooO00o2) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!OooO00o2) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final CharSequence m22895OooO00o(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "receiver$0");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean OooOOO = C8282oOo000oO.OooOOO(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!OooOOO) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!OooOOO) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    @InlineOnly
    public static /* synthetic */ List OooO00o(CharSequence charSequence, Regex regex, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }
}
