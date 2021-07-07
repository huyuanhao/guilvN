package com.p118pd.sdk;

import com.p118pd.sdk.C6222ii1l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p293rx.Emitter;
import p293rx.Notification;
import p293rx.annotations.Beta;
import p293rx.exceptions.OnErrorFailedException;
import p293rx.functions.Actions;
import p293rx.internal.operators.CachedObservable;
import p293rx.internal.operators.EmptyObservableHolder;
import p293rx.internal.operators.NeverObservableHolder;
import p293rx.internal.operators.OnSubscribeAmb;
import p293rx.internal.operators.OnSubscribeCombineLatest;
import p293rx.internal.operators.OnSubscribeCreate;
import p293rx.internal.operators.OnSubscribeDetach;
import p293rx.internal.operators.OnSubscribeFlatMapCompletable;
import p293rx.internal.operators.OnSubscribeFlatMapSingle;
import p293rx.internal.operators.OnSubscribeFromArray;
import p293rx.internal.operators.OnSubscribeFromIterable;
import p293rx.internal.operators.OnSubscribeGroupJoin;
import p293rx.internal.operators.OnSubscribeJoin;
import p293rx.internal.operators.OnSubscribeRange;
import p293rx.internal.operators.OnSubscribeUsing;
import p293rx.internal.operators.OperatorBufferWithSize;
import p293rx.internal.operators.OperatorEagerConcatMap;
import p293rx.internal.operators.OperatorElementAt;
import p293rx.internal.operators.OperatorGroupBy;
import p293rx.internal.operators.OperatorMerge;
import p293rx.internal.operators.OperatorOnBackpressureLatest;
import p293rx.internal.operators.OperatorPublish;
import p293rx.internal.operators.OperatorReplay;
import p293rx.internal.operators.OperatorWindowWithSize;
import p293rx.internal.operators.OperatorZip;
import p293rx.internal.util.InternalObservableUtils;
import p293rx.internal.util.ScalarSynchronousObservable;
import p293rx.internal.util.UtilityFunctions;
import p293rx.observables.SyncOnSubscribe;

/* renamed from: com.pd.sdk.丨III  reason: invalid class name and case insensitive filesystem */
public class C9349III<T> {
    public final OooO00o<T> OooO00o;

    /* renamed from: com.pd.sdk.丨III$OooO00o */
    public interface OooO00o<T> extends AbstractC6153iL1l<AbstractC9508LiLi<? super T>> {
    }

    /* renamed from: com.pd.sdk.丨III$OooO0O0 */
    public interface OooO0O0<R, T> extends AbstractC9847l1<AbstractC9508LiLi<? super R>, AbstractC9508LiLi<? super T>> {
    }

    /* renamed from: com.pd.sdk.丨III$OooO0OO */
    public interface OooO0OO<T, R> extends AbstractC9847l1<C9349III<T>, C9349III<R>> {
    }

    public C9349III(OooO00o<T> oooO00o) {
        this.OooO00o = oooO00o;
    }

    @Deprecated
    public static <T> C9349III<T> OooO00o(OooO00o<T> oooO00o) {
        return new C9349III<>(C9714lli.OooO00o((OooO00o) oooO00o));
    }

    public static <T> C9349III<T> OooO0O0(OooO00o<T> oooO00o) {
        return new C9349III<>(C9714lli.OooO00o((OooO00o) oooO00o));
    }

    public static <T, R> C9349III<R> OooO0OO(Iterable<? extends C9349III<? extends T>> iterable, AbstractC6021i1L<? extends R> i1l) {
        return OooO0O0((OooO00o) new OnSubscribeCombineLatest(null, iterable, i1l, ll1i1l.o0ooOO0, true));
    }

    public static <T> C9349III<T> OooO0Oo(Iterable<? extends C9349III<? extends T>> iterable) {
        return OooOOOO(OooO0o((Iterable) iterable));
    }

    public static <T> C9349III<T> OooO0o(Iterable<? extends T> iterable) {
        return OooO0O0((OooO00o) new OnSubscribeFromIterable(iterable));
    }

    public static <T> C9349III<T> OooO0o0(C9349III<? extends T> r2, C9349III<? extends T> r3) {
        return OooO00o(new C9349III[]{r2, r3});
    }

    public static <T> C9349III<T> OooO0oO(T t) {
        return ScalarSynchronousObservable.OooO00o((Object) t);
    }

    public static <T> C9349III<T> OooO0oo(Iterable<? extends C9349III<? extends T>> iterable) {
        return OooOOo(OooO0o((Iterable) iterable));
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public static <T> C9349III<T> OooOOO(C9349III<? extends C9349III<? extends T>> r1) {
        return (C9349III<R>) r1.OooO0O0(UtilityFunctions.OooO0OO());
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public static <T> C9349III<T> OooOOOO(C9349III<? extends C9349III<? extends T>> r1) {
        return (C9349III<R>) r1.OooO0OO(UtilityFunctions.OooO0OO());
    }

    public static C9349III<Long> OooOOOo(long j, TimeUnit timeUnit) {
        return OooO0OO(j, j, timeUnit, C6261iii1I1.OooO00o());
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public static <T> C9349III<T> OooOOo(C9349III<? extends C9349III<? extends T>> r1) {
        return (C9349III<R>) r1.OooO00o((OooO0O0<? extends R, ? super Object>) OperatorMerge.OooO00o(true));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public static <T> C9349III<T> OooOOo0(C9349III<? extends C9349III<? extends T>> r2) {
        return r2.getClass() == ScalarSynchronousObservable.class ? ((ScalarSynchronousObservable) r2).Oooo0O0(UtilityFunctions.OooO0OO()) : (C9349III<R>) r2.OooO00o((OooO0O0<? extends R, ? super Object>) OperatorMerge.OooO00o(false));
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public static <T> C9349III<T> OooOOoo(C9349III<? extends C9349III<? extends T>> r1) {
        return (C9349III<R>) r1.OooO00o((OooO0O0<? extends R, ? super Object>) ILIL1l.OooO00o(false));
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public static <T> C9349III<T> OooOo00(C9349III<? extends C9349III<? extends T>> r1) {
        return (C9349III<R>) r1.OooO00o((OooO0O0<? extends R, ? super Object>) ILIL1l.OooO00o(true));
    }

    public static <T> C9349III<T> OooOoo() {
        return NeverObservableHolder.instance();
    }

    public static <T> C9349III<T> OooOoo0() {
        return EmptyObservableHolder.instance();
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final <U> C9349III<T> OooO(AbstractC9847l1<? super T, ? extends U> r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new IIL1l(r2));
    }

    public final C9349III<Boolean> OooOO0(AbstractC9847l1<? super T, Boolean> r3) {
        return OooO00o((OooO0O0) new C6086iIIllI(r3, false));
    }

    public final C9349III<T> OooOO0O(C9349III<? extends T> r2) {
        if (r2 != null) {
            return OooO0O0((OooO00o) new C6046i1lIlll(this, r2));
        }
        throw new NullPointerException("alternate is null");
    }

    public final C9349III<T> OooOO0o(AbstractC9847l1<? super T, Boolean> r1) {
        return OooOooO(r1).OooOo0O();
    }

    public final C9349III<C9349III<T>> OooOOO0() {
        return OooO0oO((Object) this);
    }

    public final <R> C9349III<R> OooOo(AbstractC9847l1<? super C9349III<T>, ? extends C9349III<R>> r2) {
        return OperatorReplay.OooO0OO(InternalObservableUtils.createReplaySupplier(this), (AbstractC9847l1) r2);
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooOo0(AbstractC9847l1<? super Throwable, ? extends T> r1) {
        return (C9349III<R>) OooO00o((OooO0O0) C6850lLLL1l.OooO00o(r1));
    }

    public final <R> C9349III<R> OooOo0O(AbstractC9847l1<? super C9349III<T>, ? extends C9349III<R>> r1) {
        return OperatorPublish.OooO0OO((C9349III) this, (AbstractC9847l1) r1);
    }

    public final C9349III<T> OooOo0o(AbstractC9847l1<? super C9349III<? extends Void>, ? extends C9349III<?>> r1) {
        return C5389Ii1L.OooO00o(this, InternalObservableUtils.createRepeatDematerializer(r1));
    }

    public final C9349III<T> OooOoO(AbstractC9847l1<? super T, Boolean> r1) {
        return OooOO0O(r1).OooOo0O();
    }

    public final C9349III<T> OooOoO0(AbstractC9847l1<? super C9349III<? extends Throwable>, ? extends C9349III<?>> r1) {
        return C5389Ii1L.OooO0O0(this, InternalObservableUtils.createRetryDematerializer(r1));
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooOoOO(AbstractC9847l1<? super T, Boolean> r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new ILiliiI(ILiliiI.OooO00o(r2)));
    }

    public final C9349III<T> OooOooO(AbstractC9847l1<? super T, Boolean> r2) {
        return OooOO0O(r2).OooO(1);
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooOooo(AbstractC9847l1<? super T, Boolean> r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new i1I1II(r2));
    }

    public final <K> C9349III<Map<K, Collection<T>>> Oooo0(AbstractC9847l1<? super T, ? extends K> r3) {
        return OooO0O0((OooO00o) new LLilIL1(this, r3, UtilityFunctions.OooO0OO()));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> Oooo000(AbstractC9847l1<? super T, Boolean> r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new C5819Lllii(r2));
    }

    public final <V> C9349III<T> Oooo00O(AbstractC9847l1<? super T, ? extends C9349III<V>> r2) {
        return OooO00o((LiLIll) null, (AbstractC9847l1) r2, (C9349III) null);
    }

    public final <K> C9349III<Map<K, T>> Oooo00o(AbstractC9847l1<? super T, ? extends K> r3) {
        return OooO0O0((OooO00o) new C5573IiI(this, r3, UtilityFunctions.OooO0OO()));
    }

    public static <T> C9349III<T> OooO00o(AbstractC6153iL1l<Emitter<T>> il1l, Emitter.BackpressureMode backpressureMode) {
        return OooO0O0((OooO00o) new OnSubscribeCreate(il1l, backpressureMode));
    }

    public static <T> C9349III<T> OooO0O0(Iterable<? extends C9349III<? extends T>> iterable) {
        return OooO0O0(OnSubscribeAmb.OooO00o(iterable));
    }

    public static <T> C9349III<T> OooO0OO(Iterable<? extends C9349III<? extends T>> iterable) {
        return OooOOO(OooO0o((Iterable) iterable));
    }

    public static <T> C9349III<T> OooO0Oo(LiLIll<C9349III<T>> r1) {
        return OooO0O0((OooO00o) new C6826lII(r1));
    }

    public static <T> C9349III<T> OooO0o(C9349III<? extends T> r0, C9349III<? extends T> r1) {
        return OooOOo(OooO0O0((Object) r0, (Object) r1));
    }

    public static <T> C9349III<T> OooO0o0(C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4) {
        return OooO00o(new C9349III[]{r2, r3, r4});
    }

    public static <T> C9349III<T> OooO0oO(Iterable<? extends C9349III<? extends T>> iterable) {
        return OooOOo0(OooO0o((Iterable) iterable));
    }

    public static C9349III<Long> OooOOOo(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO0OO(j, j, timeUnit, ll1ll);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    /* renamed from: OooO  reason: collision with other method in class */
    public final C9349III<T> m21390OooO() {
        return (C9349III<R>) OooO00o((OooO0O0) C6024i1L.OooO00o());
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final <U> C9349III<T> OooO0oo(AbstractC9847l1<? super T, ? extends U> r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new Ii1L11(r2));
    }

    public final C9349III<Boolean> OooOO0() {
        return OooO00o((OooO0O0) InternalObservableUtils.IS_EMPTY);
    }

    public final C9349III<Notification<T>> OooOO0o() {
        return OooO00o((OooO0O0) IlIiL.OooO00o());
    }

    public final C9349III<T> OooOOO(AbstractC9847l1<? super T, ? extends C5876LlIl> r3) {
        return OooO00o((AbstractC9847l1) r3, false, Integer.MAX_VALUE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.丨丨l1<? super T, ? extends com.pd.sdk.丨III<? extends R>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C9349III<R> OooOOO0(AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r3) {
        if (getClass() == ScalarSynchronousObservable.class) {
            return ((ScalarSynchronousObservable) this).Oooo0O0(r3);
        }
        return OooOOo0(OooOOoo(r3));
    }

    public final <R> C9349III<R> OooOOOO(AbstractC9847l1<? super T, ? extends Iterable<? extends R>> r2) {
        return OooO0OO(r2, ll1i1l.o0ooOO0);
    }

    public final C9349III<T> OooOOo(AbstractC9847l1<? super T, Boolean> r2) {
        return OooOO0O(r2).OooOO0(1).OooOo0O();
    }

    public final <R> C9349III<R> OooOOoo(AbstractC9847l1<? super T, ? extends R> r2) {
        return OooO0O0((OooO00o) new C9496LLL1(this, r2));
    }

    public final C9349III<C6090iIIliL<T>> OooOo() {
        return OooO0Oo(C6261iii1I1.OooO00o());
    }

    public final C9349III<T> OooOo0() {
        return m21393OooO00o().OooOooo();
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooOo00(AbstractC9847l1<? super Throwable, ? extends C9349III<? extends T>> r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new C6850lLLL1l(r2));
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooOo0O() {
        return (C9349III<R>) OooO00o((OooO0O0) C6204iLIli1.OooO00o());
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooOo0o() {
        return (C9349III<R>) OooOoOO().OooOOOO(UtilityFunctions.OooO0OO());
    }

    public final C9349III<List<T>> OooOoO() {
        return OooO00o((OooO0O0) C6788llil.OooO00o());
    }

    public final C9349III<Ili11<T>> OooOoO0() {
        return OooO0o0(C6261iii1I1.OooO00o());
    }

    public final C9349III<List<T>> OooOoOO() {
        return OooO00o((OooO0O0) new LLLII11(10));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.pd.sdk.丨丨l1<? super T, ? extends com.pd.sdk.丨III<? extends R>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C9349III<R> OooOoo(AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r1) {
        return OooOo00(OooOOoo(r1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.pd.sdk.丨丨l1<? super T, ? extends com.pd.sdk.丨III<? extends R>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C9349III<R> OooOoo0(AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r1) {
        return OooOOoo(OooOOoo(r1));
    }

    public static <S, T> C9349III<T> OooO00o(SyncOnSubscribe<S, T> syncOnSubscribe) {
        return OooO0O0((OooO00o) syncOnSubscribe);
    }

    public static <T, R> C9349III<R> OooO0O0(Iterable<? extends C9349III<? extends T>> iterable, AbstractC6021i1L<? extends R> i1l) {
        return OooO0O0((OooO00o) new OnSubscribeCombineLatest(iterable, i1l));
    }

    public static <T> C9349III<T> OooO0OO(C9349III<? extends T> r0, C9349III<? extends T> r1) {
        return OooOOOO(OooO0O0((Object) r0, (Object) r1));
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public static <T> C9349III<T> OooO0Oo(C9349III<? extends C9349III<? extends T>> r1, int i) {
        return (C9349III<R>) r1.OooO00o((OooO0O0<? extends R, ? super Object>) OperatorMerge.OooO00o(true, i));
    }

    public static <T> C9349III<T> OooO0o(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2) {
        return OooOOo(OooO0O0((Object) r0, (Object) r1, (Object) r2));
    }

    public static <T> C9349III<T> OooO0o0(C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5) {
        return OooO00o(new C9349III[]{r2, r3, r4, r5});
    }

    public static <T> C9349III<Boolean> OooO0oO(C9349III<? extends T> r1, C9349III<? extends T> r2) {
        return OooO0O0((C9349III) r1, (C9349III) r2, (AbstractC5189I1l1l) InternalObservableUtils.OBJECT_EQUALS);
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public static <T> C9349III<T> OooOOOo(C9349III<? extends C9349III<? extends T>> r1) {
        return (C9349III<R>) r1.OooO0Oo(UtilityFunctions.OooO0OO());
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final <U> C9349III<T> OooO(C9349III<U> r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new I1LllL(r2));
    }

    public final C9349III<T> OooO0oo() {
        return OooO(1).OooOo0O();
    }

    public final C9349III<T> OooOO0(C9349III<T> r1) {
        return OooO0O0((C9349III) r1, (C9349III) this);
    }

    public final C9349III<T> OooOO0O(AbstractC9847l1<? super T, Boolean> r2) {
        return OooO0O0((OooO00o) new C5431IlIl1l(this, r2));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final <E> C9349III<T> OooOO0o(C9349III<? extends E> r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new L1ill1i(r2));
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooOOO() {
        return (C9349III<R>) OooO00o((OooO0O0) C9435I1IiI.OooO00o());
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooOOOO() {
        return (C9349III<R>) OooO00o((OooO0O0) IL11i.OooO00o());
    }

    public final C9349III<T> OooOOo() {
        return C5389Ii1L.OooO00o(this);
    }

    public final C9349III<T> OooOOoo() {
        return C5389Ii1L.OooO0O0(this);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooOo00() {
        return (C9349III<R>) OooO00o((OooO0O0) C6814l11L.OooO00o());
    }

    @Beta
    public static <S, T> C9349III<T> OooO00o(L1Lii1<S, T> r0) {
        return OooO0O0((OooO00o) r0);
    }

    public static <T> C9349III<T> OooO0O0(C9349III<? extends T> r0, C9349III<? extends T> r1) {
        return OooOOO(OooO0O0((Object) r0, (Object) r1));
    }

    public static <T> C9349III<T> OooO0OO(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2) {
        return OooOOOO(OooO0O0((Object) r0, (Object) r1, (Object) r2));
    }

    @Deprecated
    public static C9349III<Long> OooO0Oo(long j, long j2, TimeUnit timeUnit) {
        return OooO0OO(j, j2, timeUnit, C6261iii1I1.OooO00o());
    }

    public static <T> C9349III<T> OooO0o(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3) {
        return OooOOo(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3));
    }

    public static <T> C9349III<T> OooO0o0(C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6) {
        return OooO00o(new C9349III[]{r2, r3, r4, r5, r6});
    }

    public static C9349III<Long> OooOOo0(long j, TimeUnit timeUnit) {
        return OooOOo0(j, timeUnit, C6261iii1I1.OooO00o());
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO(int i) {
        return (C9349III<R>) OooO00o((OooO0O0) new C5632LIi(i));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final <U> C9349III<T> OooO0oO(AbstractC9847l1<? super T, ? extends C9349III<U>> r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new C6000i111(this, r2));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final <U> C9349III<T> OooO0oo(C9349III<U> r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new C5647LIi(r2));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooOO0(int i) {
        if (i == 0) {
            return m21390OooO();
        }
        return i == 1 ? OooO0O0((OooO00o) new C5901LlIi(this)) : (C9349III<R>) OooO00o((OooO0O0) new LLiiil(i));
    }

    public final C9349III<T> OooOO0O() {
        return OooOO0(1).OooOo0O();
    }

    public final C9349III<T> OooOO0o(long j, TimeUnit timeUnit) {
        return OooO0o0(j, timeUnit);
    }

    public final C9349III<T> OooOOO(long j, TimeUnit timeUnit) {
        return OooO00o(j, timeUnit, (C9349III) null, C6261iii1I1.OooO00o());
    }

    public final C9349III<C9349III<T>> OooOOOO(long j, TimeUnit timeUnit) {
        return OooO0O0(j, j, timeUnit, C6261iii1I1.OooO00o());
    }

    public final <R> C9349III<R> OooOOOo(AbstractC9847l1<? super T, ? extends LLil11<? extends R>> r3) {
        return OooO0O0((AbstractC9847l1) r3, false, Integer.MAX_VALUE);
    }

    public static <T> C9349III<T> OooO0O0(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2) {
        return OooOOO(OooO0O0((Object) r0, (Object) r1, (Object) r2));
    }

    public static <T> C9349III<T> OooO0OO(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3) {
        return OooOOOO(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3));
    }

    @Deprecated
    public static C9349III<Long> OooO0Oo(long j, long j2, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO0OO(j, j2, timeUnit, ll1ll);
    }

    public static <T> C9349III<T> OooO0o(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4) {
        return OooOOo(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3, (Object) r4));
    }

    public static <T> C9349III<T> OooO0o0(C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7) {
        return OooO00o(new C9349III[]{r2, r3, r4, r5, r6, r7});
    }

    public static C9349III<Long> OooOOo0(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO0O0((OooO00o) new C1ilLi(j, timeUnit, ll1ll));
    }

    public final C9349III<T> OooO(long j, TimeUnit timeUnit) {
        return OooO(j, timeUnit, C6261iii1I1.OooO00o());
    }

    public final <R> C9349III<R> OooO00o(OooO0O0<? extends R, ? super T> oooO0O0) {
        return OooO0O0((OooO00o) new iILiI1li(this.OooO00o, oooO0O0));
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0oO() {
        return (C9349III<R>) OooO00o((OooO0O0) IIL1l.OooO00o());
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0oo(int i) {
        return (C9349III<R>) OooO00o((OooO0O0) new IlIIIi1(i));
    }

    public final C9349III<List<T>> OooOO0O(int i) {
        return OooOO0(i).OooOoO();
    }

    public final C9349III<T> OooOO0o(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO0o0(j, timeUnit, ll1ll);
    }

    public final C9349III<T> OooOOO(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO00o(j, timeUnit, (C9349III) null, ll1ll);
    }

    public final C9349III<T> OooOOO0(long j, TimeUnit timeUnit) {
        return OooO0O0(j, timeUnit);
    }

    public final C9349III<C9349III<T>> OooOOOO(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO0O0(j, timeUnit, Integer.MAX_VALUE, ll1ll);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooOOOo() {
        return (C9349III<R>) OooO00o((OooO0O0) OperatorOnBackpressureLatest.OooO00o());
    }

    public static <T> C9349III<T> OooO0O0(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3) {
        return OooOOO(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3));
    }

    public static <T> C9349III<T> OooO0OO(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4) {
        return OooOOOO(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3, (Object) r4));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    public static <R> C9349III<R> OooO0Oo(Iterable<? extends C9349III<?>> iterable, AbstractC6021i1L<? extends R> i1l) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends C9349III<?>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((C9349III) it.next());
        }
        return OooO0oO(arrayList.toArray(new C9349III[arrayList.size()])).OooO00o((OooO0O0) new OperatorZip(i1l));
    }

    public static <T> C9349III<T> OooO0o(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5) {
        return OooOOo(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3, (Object) r4, (Object) r5));
    }

    public static <T> C9349III<T> OooO0o0(C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7, C9349III<? extends T> r8) {
        return OooO00o(new C9349III[]{r2, r3, r4, r5, r6, r7, r8});
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return (C9349III<R>) OooO00o((OooO0O0) new LLi1L(j, timeUnit, ll1ll));
    }

    public <R> C9349III<R> OooO00o(OooO0OO<? super T, ? extends R> oooO0OO) {
        return (C9349III) oooO0OO.call(this);
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0oO(C9349III<? extends T> r1) {
        return (C9349III<R>) OooO00o((OooO0O0) C6850lLLL1l.OooO00o(r1));
    }

    public final C9349III<T> OooO0oo(long j, TimeUnit timeUnit) {
        return OooO0oo(j, timeUnit, C6261iii1I1.OooO00o());
    }

    public final C9349III<T> OooOO0O(long j, TimeUnit timeUnit) {
        return OooOO0O(j, timeUnit, C6261iii1I1.OooO00o());
    }

    public final C9349III<List<T>> OooOO0o(int i) {
        return OooO00o((OooO0O0) new LLLII11(i));
    }

    public final C9349III<T> OooOOO0(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO0O0(j, timeUnit, ll1ll);
    }

    public final <K> C9349III<C9814LLIlLL<K, T>> OooOOo0(AbstractC9847l1<? super T, ? extends K> r2) {
        return OooO00o((OooO0O0) new OperatorGroupBy(r2));
    }

    public static <T> C9349III<T> OooO0O0(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4) {
        return OooOOO(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3, (Object) r4));
    }

    public static <T> C9349III<T> OooO0OO(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5) {
        return OooOOOO(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3, (Object) r4, (Object) r5));
    }

    public static <T> C9349III<T> OooO0o(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6) {
        return OooOOo(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3, (Object) r4, (Object) r5, (Object) r6));
    }

    public static <T> C9349III<T> OooO0o0(C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7, C9349III<? extends T> r8, C9349III<? extends T> r9) {
        return OooO00o(new C9349III[]{r2, r3, r4, r5, r6, r7, r8, r9});
    }

    public final C11LlIl1<T> OooO() {
        ili1Il OooO00o2 = ili1Il.OooO00o(Long.MAX_VALUE);
        OooO00o((AbstractC5477Il11) OooO00o2);
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final <R> R m21404OooO00o(AbstractC9847l1<? super C9349III<T>, R> r1) {
        return r1.call(this);
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0oO(int i) {
        return (C9349III<R>) OooO00o((OooO0O0) new I1iLL1(i));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0oo(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return (C9349III<R>) OooO00o((OooO0O0) new C6382iLl(j, timeUnit, ll1ll));
    }

    public final C9349III<List<T>> OooOO0(long j, TimeUnit timeUnit) {
        return OooO(j, timeUnit).OooOoO();
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooOO0O(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return (C9349III<R>) OooO00o((OooO0O0) new C6628lLILI(j, timeUnit, ll1ll));
    }

    public final C9349III<C9349III<T>> OooOOO0(int i) {
        return OooO0O0(i, i);
    }

    public final C9349III<T> OooOOo0() {
        return OooO0O0((OooO00o) new OnSubscribeDetach(this));
    }

    public static <T> C9349III<T> OooO0O0(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5) {
        return OooOOO(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3, (Object) r4, (Object) r5));
    }

    public static <T> C9349III<T> OooO0OO(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6) {
        return OooOOOO(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3, (Object) r4, (Object) r5, (Object) r6));
    }

    public static <T> C9349III<T> OooO0o(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7) {
        return OooOOo(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3, (Object) r4, (Object) r5, (Object) r6, (Object) r7));
    }

    public static <T> C9349III<T> OooO0o0(C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7, C9349III<? extends T> r8, C9349III<? extends T> r9, C9349III<? extends T> r10) {
        return OooO00o(new C9349III[]{r2, r3, r4, r5, r6, r7, r8, r9, r10});
    }

    public LLil11<T> OooO00o() {
        return new LLil11<>(C5180I1ii.OooO00o(this));
    }

    public final C9349III<T> OooO0oO(long j, TimeUnit timeUnit) {
        return OooO0oO(j, timeUnit, C6261iii1I1.OooO00o());
    }

    public final C9349III<List<T>> OooOO0(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO(j, timeUnit, ll1ll).OooOoO();
    }

    public final <U> C9349III<C9349III<T>> OooOOO0(C9349III<U> r2) {
        return OooO00o((OooO0O0) new C6451l1Ll(r2));
    }

    public static <T> C9349III<T> OooO0O0(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6) {
        return OooOOO(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3, (Object) r4, (Object) r5, (Object) r6));
    }

    public static <T> C9349III<T> OooO0OO(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7) {
        return OooOOOO(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3, (Object) r4, (Object) r5, (Object) r6, (Object) r7));
    }

    public static <T> C9349III<T> OooO0o(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7, C9349III<? extends T> r8) {
        return OooOOo(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3, (Object) r4, (Object) r5, (Object) r6, (Object) r7, (Object) r8));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5876LlIl m21392OooO00o() {
        return C5876LlIl.OooO0O0((C9349III<?>) this);
    }

    public final <R> C9349III<R> OooO0o0(AbstractC9847l1<? super T, ? extends Iterable<? extends R>> r2) {
        return IL11i1I.OooO00o(this, r2, ll1i1l.o0ooOO0);
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0oO(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return (C9349III<R>) OooO00o((OooO0O0) new I1I11(j, timeUnit, ll1ll));
    }

    public static <T> C9349III<T> OooO00o(C9349III<? extends T> r0, C9349III<? extends T> r1) {
        return OooO0O0(OnSubscribeAmb.OooO00o(r0, r1));
    }

    public static <T> C9349III<T> OooO0O0(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7) {
        return OooOOO(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3, (Object) r4, (Object) r5, (Object) r6, (Object) r7));
    }

    public static <T> C9349III<T> OooO0OO(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7, C9349III<? extends T> r8) {
        return OooOOOO(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3, (Object) r4, (Object) r5, (Object) r6, (Object) r7, (Object) r8));
    }

    public final C9349III<Long> OooO0Oo() {
        return OooO00o((Object) 0L, (AbstractC5189I1l1l) InternalObservableUtils.LONG_COUNTER);
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final <U> C9349III<T> OooO0o(AbstractC9847l1<? super T, ? extends C9349III<U>> r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new C9555LiILL(r2));
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T2> */
    public final <T2> C9349III<T2> OooO0o0() {
        return (C9349III<R>) OooO00o((OooO0O0) C9692lLlL.OooO00o());
    }

    public static <T> C9349III<T> OooO00o(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2) {
        return OooO0O0(OnSubscribeAmb.OooO00o(r0, r1, r2));
    }

    public static <T> C9349III<T> OooO0O0(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7, C9349III<? extends T> r8) {
        return OooOOO(OooO0O0((Object) r0, (Object) r1, (Object) r2, (Object) r3, (Object) r4, (Object) r5, (Object) r6, (Object) r7, (Object) r8));
    }

    public static C9349III<Long> OooO0OO(long j, long j2, TimeUnit timeUnit) {
        return OooO0OO(j, j2, timeUnit, C6261iii1I1.OooO00o());
    }

    public final C9349III<T> OooO0Oo(long j, TimeUnit timeUnit) {
        return OooO0Oo(j, timeUnit, C6261iii1I1.OooO00o());
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0o() {
        return (C9349III<R>) OooO00o((OooO0O0) Ii1L11.OooO00o());
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0o0(liii1l r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new C5637LIl1(r2));
    }

    public static <T> C9349III<T> OooO00o(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3) {
        return OooO0O0(OnSubscribeAmb.OooO00o(r0, r1, r2, r3));
    }

    public static <T> C9349III<T> OooO0O0(T t, T t2) {
        return OooO00o(new Object[]{t, t2});
    }

    public static C9349III<Long> OooO0OO(long j, long j2, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO0O0((OooO00o) new C5500I1L1l(j, j2, timeUnit, ll1ll));
    }

    public static <T> C9349III<T> OooO0o0(Iterable<? extends C9349III<? extends T>> iterable) {
        return OooO0o((Iterable) iterable).OooO0Oo(UtilityFunctions.OooO0OO());
    }

    public final C9349III<T> OooO0Oo(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO0O0((OooO00o) new C974811(this, j, timeUnit, ll1ll));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    @Deprecated
    public final C9349III<T> OooO0o(liii1l r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new C6539lIiiL(r2));
    }

    public static <T> C9349III<T> OooO00o(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4) {
        return OooO0O0(OnSubscribeAmb.OooO00o(r0, r1, r2, r3, r4));
    }

    public static <T> C9349III<T> OooO0O0(T t, T t2, T t3) {
        return OooO00o(new Object[]{t, t2, t3});
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public static <T> C9349III<T> OooO0OO(C9349III<? extends C9349III<? extends T>> r2, int i) {
        return r2.getClass() == ScalarSynchronousObservable.class ? ((ScalarSynchronousObservable) r2).Oooo0O0(UtilityFunctions.OooO0OO()) : (C9349III<R>) r2.OooO00o((OooO0O0<? extends R, ? super Object>) OperatorMerge.OooO00o(false, i));
    }

    public final <U> C9349III<T> OooO0Oo(C9349III<U> r2) {
        if (r2 != null) {
            return OooO0O0((OooO00o) new C6812l11(this, r2));
        }
        throw null;
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0o(C9349III<? extends T> r1) {
        return (C9349III<R>) OooO00o((OooO0O0) C6850lLLL1l.OooO0O0(r1));
    }

    public final C9349III<T> OooO0o0(int i) {
        return OooO(i);
    }

    public static <T> C9349III<T> OooO00o(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5) {
        return OooO0O0(OnSubscribeAmb.OooO00o(r0, r1, r2, r3, r4, r5));
    }

    public static <T> C9349III<T> OooO0O0(T t, T t2, T t3, T t4) {
        return OooO00o(new Object[]{t, t2, t3, t4});
    }

    /* JADX DEBUG: Type inference failed for r4v3. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0o(int i) {
        if (i > 0) {
            return (C9349III<R>) OooO00o((OooO0O0) C6543lL11.OooO00o(i));
        }
        throw new IllegalArgumentException("n > 0 required but it was " + i);
    }

    public final C9349III<T> OooO0o0(C9349III<? extends T> r1) {
        return OooO0o0(this, r1);
    }

    public static <T> C9349III<T> OooO00o(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6) {
        return OooO0O0(OnSubscribeAmb.OooO00o(r0, r1, r2, r3, r4, r5, r6));
    }

    public static <T> C9349III<T> OooO0O0(T t, T t2, T t3, T t4, T t5) {
        return OooO00o(new Object[]{t, t2, t3, t4, t5});
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0Oo(AbstractC6153iL1l<? super Long> il1l) {
        return (C9349III<R>) OooO00o((OooO0O0) new C9377IiL(il1l));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0o0(AbstractC6153iL1l<? super T> il1l) {
        return (C9349III<R>) OooO00o((OooO0O0) new IL11i(il1l));
    }

    public static <T> C9349III<T> OooO00o(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7) {
        return OooO0O0(OnSubscribeAmb.OooO00o(r0, r1, r2, r3, r4, r5, r6, r7));
    }

    public static <T> C9349III<T> OooO0O0(T t, T t2, T t3, T t4, T t5, T t6) {
        return OooO00o(new Object[]{t, t2, t3, t4, t5, t6});
    }

    public static <T> C9349III<T> OooO0OO(Iterable<? extends C9349III<? extends T>> iterable, int i) {
        return OooO0Oo(OooO0o((Iterable) iterable), i);
    }

    public final C9349III<T> OooO0Oo(liii1l r4) {
        return OooO0O0((OooO00o) new iiILii1I(this, new C6256iiL1il(Actions.m22996OooO00o(), Actions.m22995OooO00o(r4), r4)));
    }

    public final C9349III<T> OooO0o(long j, TimeUnit timeUnit) {
        return OooO0o(j, timeUnit, C6261iii1I1.OooO00o());
    }

    public final C9349III<T> OooO0o0(long j, TimeUnit timeUnit) {
        return OooO0o0(j, timeUnit, C6261iii1I1.OooO00o());
    }

    public static <T> C9349III<T> OooO00o(C9349III<? extends T> r0, C9349III<? extends T> r1, C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7, C9349III<? extends T> r8) {
        return OooO0O0(OnSubscribeAmb.OooO00o(r0, r1, r2, r3, r4, r5, r6, r7, r8));
    }

    public static <T> C9349III<T> OooO0O0(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        return OooO00o(new Object[]{t, t2, t3, t4, t5, t6, t7});
    }

    public static C9349III<Integer> OooO0OO(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Count can not be negative");
        } else if (i2 == 0) {
            return OooOoo0();
        } else {
            if (i > (Integer.MAX_VALUE - i2) + 1) {
                throw new IllegalArgumentException("start + count can not exceed Integer.MAX_VALUE");
            } else if (i2 == 1) {
                return OooO0oO(Integer.valueOf(i));
            } else {
                return OooO0O0((OooO00o) new OnSubscribeRange(i, (i2 - 1) + i));
            }
        }
    }

    public final C9349III<T> OooO0o(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO0O0((OooO00o) new LiLl11L(this, j, timeUnit, ll1ll));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0o0(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return (C9349III<R>) OooO00o((OooO0O0) new C6328iliiii(j, timeUnit, ll1ll));
    }

    public static <T1, T2, R> C9349III<R> OooO00o(C9349III<? extends T1> r2, C9349III<? extends T2> r3, AbstractC5189I1l1l<? super T1, ? super T2, ? extends R> r4) {
        return OooO00o(Arrays.asList(r2, r3), iiL1ll.OooO00o(r4));
    }

    public static <T> C9349III<T> OooO0O0(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        return OooO00o(new Object[]{t, t2, t3, t4, t5, t6, t7, t8});
    }

    public final C9349III<T> OooO0o(T t) {
        return OooO0O0(OooO0oO((Object) t), (C9349III) this);
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0o0(T t) {
        return (C9349III<R>) OooO00o((OooO0O0) new C6204iLIli1(t));
    }

    public static <T1, T2, T3, R> C9349III<R> OooO00o(C9349III<? extends T1> r2, C9349III<? extends T2> r3, C9349III<? extends T3> r4, AbstractC9359IIIi<? super T1, ? super T2, ? super T3, ? extends R> r5) {
        return OooO00o(Arrays.asList(r2, r3, r4), iiL1ll.OooO00o(r5));
    }

    public static <T> C9349III<T> OooO0O0(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        return OooO00o(new Object[]{t, t2, t3, t4, t5, t6, t7, t8, t9});
    }

    public final C9349III<List<T>> OooO0o(AbstractC5189I1l1l<? super T, ? super T, Integer> r3) {
        return OooO00o((OooO0O0) new LLLII11(r3, 10));
    }

    public final C9349III<Ili11<T>> OooO0o0(LL1LL ll1ll) {
        return OooO00o((OooO0O0) new C6205iLIlL1(ll1ll));
    }

    public static <T1, T2, T3, T4, R> C9349III<R> OooO00o(C9349III<? extends T1> r2, C9349III<? extends T2> r3, C9349III<? extends T3> r4, C9349III<? extends T4> r5, i1li1ii1<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> i1li1ii1) {
        return OooO00o(Arrays.asList(r2, r3, r4, r5), iiL1ll.OooO00o(i1li1ii1));
    }

    public static <T> C9349III<T> OooO0O0(Iterable<? extends C9349III<? extends T>> iterable, int i) {
        return OooO0OO(OooO0o((Iterable) iterable), i);
    }

    public static <T> C9349III<T> OooO0Oo(C9349III<? extends T> r2, C9349III<? extends T> r3) {
        return OooO0o0((Iterable) Arrays.asList(r2, r3));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0o(LL1LL ll1ll) {
        return (C9349III<R>) OooO00o((OooO0O0) new Iili1l(ll1ll));
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0o0(AbstractC5189I1l1l<? super T, ? super T, Integer> r2) {
        return (C9349III<R>) OooO0o((AbstractC5189I1l1l) r2).OooOOOO(UtilityFunctions.OooO0OO());
    }

    public static <T1, T2, T3, T4, T5, R> C9349III<R> OooO00o(C9349III<? extends T1> r2, C9349III<? extends T2> r3, C9349III<? extends T3> r4, C9349III<? extends T4> r5, C9349III<? extends T5> r6, Il1lLL11<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> il1lLL11) {
        return OooO00o(Arrays.asList(r2, r3, r4, r5, r6), iiL1ll.OooO00o(il1lLL11));
    }

    public static <T> C9349III<Boolean> OooO0O0(C9349III<? extends T> r0, C9349III<? extends T> r1, AbstractC5189I1l1l<? super T, ? super T, Boolean> r2) {
        return ILlL1li.OooO00o(r0, r1, r2);
    }

    public static <T> C9349III<T> OooO0Oo(C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4) {
        return OooO0o0((Iterable) Arrays.asList(r2, r3, r4));
    }

    public static <T1, T2, T3, T4, T5, T6, R> C9349III<R> OooO00o(C9349III<? extends T1> r2, C9349III<? extends T2> r3, C9349III<? extends T3> r4, C9349III<? extends T4> r5, C9349III<? extends T5> r6, C9349III<? extends T6> r7, AbstractC9474LI1lil<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> r8) {
        return OooO00o(Arrays.asList(r2, r3, r4, r5, r6, r7), iiL1ll.OooO00o(r8));
    }

    public static <R> C9349III<R> OooO0O0(C9349III<?>[] r1, AbstractC6021i1L<? extends R> i1l) {
        return OooO0oO(r1).OooO00o((OooO0O0) new OperatorZip(i1l));
    }

    public static <T1, T2, R> C9349III<R> OooO0OO(C9349III<? extends T1> r2, C9349III<? extends T2> r3, AbstractC5189I1l1l<? super T1, ? super T2, ? extends R> r4) {
        return OooO0oO(new C9349III[]{r2, r3}).OooO00o((OooO0O0) new OperatorZip(r4));
    }

    public static <T> C9349III<T> OooO0Oo(C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5) {
        return OooO0o0((Iterable) Arrays.asList(r2, r3, r4, r5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> C9349III<R> OooO00o(C9349III<? extends T1> r2, C9349III<? extends T2> r3, C9349III<? extends T3> r4, C9349III<? extends T4> r5, C9349III<? extends T5> r6, C9349III<? extends T6> r7, C9349III<? extends T7> r8, AbstractC5351IiIi<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> iiIi) {
        return OooO00o(Arrays.asList(r2, r3, r4, r5, r6, r7, r8), iiL1ll.OooO00o(iiIi));
    }

    public static <T1, T2, T3, R> C9349III<R> OooO0O0(C9349III<? extends T1> r2, C9349III<? extends T2> r3, C9349III<? extends T3> r4, AbstractC9359IIIi<? super T1, ? super T2, ? super T3, ? extends R> r5) {
        return OooO0oO(new C9349III[]{r2, r3, r4}).OooO00o((OooO0O0) new OperatorZip(r5));
    }

    public static <T> C9349III<T> OooO0Oo(C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6) {
        return OooO0o0((Iterable) Arrays.asList(r2, r3, r4, r5, r6));
    }

    public final C9349III<T> OooO0OO(int i) {
        return CachedObservable.OooO00o((C9349III) this, i);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C9349III<R> OooO00o(C9349III<? extends T1> r2, C9349III<? extends T2> r3, C9349III<? extends T3> r4, C9349III<? extends T4> r5, C9349III<? extends T5> r6, C9349III<? extends T6> r7, C9349III<? extends T7> r8, C9349III<? extends T8> r9, AbstractC5634LIiL<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> r10) {
        return OooO00o(Arrays.asList(r2, r3, r4, r5, r6, r7, r8, r9), iiL1ll.OooO00o(r10));
    }

    public static <T1, T2, T3, T4, R> C9349III<R> OooO0O0(C9349III<? extends T1> r2, C9349III<? extends T2> r3, C9349III<? extends T3> r4, C9349III<? extends T4> r5, i1li1ii1<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> i1li1ii1) {
        return OooO0oO(new C9349III[]{r2, r3, r4, r5}).OooO00o((OooO0O0) new OperatorZip(i1li1ii1));
    }

    public static <T> C9349III<T> OooO0Oo(C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7) {
        return OooO0o0((Iterable) Arrays.asList(r2, r3, r4, r5, r6, r7));
    }

    public final <R> C9349III<R> OooO0OO(AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r3) {
        if (this instanceof ScalarSynchronousObservable) {
            return ((ScalarSynchronousObservable) this).Oooo0O0(r3);
        }
        return OooO0O0((OooO00o) new C6873ll1lli(this, r3, 2, 2));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C9349III<R> OooO00o(C9349III<? extends T1> r2, C9349III<? extends T2> r3, C9349III<? extends T3> r4, C9349III<? extends T4> r5, C9349III<? extends T5> r6, C9349III<? extends T6> r7, C9349III<? extends T7> r8, C9349III<? extends T8> r9, C9349III<? extends T9> r10, C1i1li<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> r11) {
        return OooO00o(Arrays.asList(r2, r3, r4, r5, r6, r7, r8, r9, r10), iiL1ll.OooO00o(r11));
    }

    public static <T1, T2, T3, T4, T5, R> C9349III<R> OooO0O0(C9349III<? extends T1> r2, C9349III<? extends T2> r3, C9349III<? extends T3> r4, C9349III<? extends T4> r5, C9349III<? extends T5> r6, Il1lLL11<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> il1lLL11) {
        return OooO0oO(new C9349III[]{r2, r3, r4, r5, r6}).OooO00o((OooO0O0) new OperatorZip(il1lLL11));
    }

    public static <T> C9349III<T> OooO0Oo(C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7, C9349III<? extends T> r8) {
        return OooO0o0((Iterable) Arrays.asList(r2, r3, r4, r5, r6, r7, r8));
    }

    public static <T, R> C9349III<R> OooO00o(List<? extends C9349III<? extends T>> list, AbstractC6021i1L<? extends R> i1l) {
        return OooO0O0((OooO00o) new OnSubscribeCombineLatest(list, i1l));
    }

    public static <T1, T2, T3, T4, T5, T6, R> C9349III<R> OooO0O0(C9349III<? extends T1> r2, C9349III<? extends T2> r3, C9349III<? extends T3> r4, C9349III<? extends T4> r5, C9349III<? extends T5> r6, C9349III<? extends T6> r7, AbstractC9474LI1lil<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> r8) {
        return OooO0oO(new C9349III[]{r2, r3, r4, r5, r6, r7}).OooO00o((OooO0O0) new OperatorZip(r8));
    }

    public static <T> C9349III<T> OooO0Oo(C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7, C9349III<? extends T> r8, C9349III<? extends T> r9) {
        return OooO0o0((Iterable) Arrays.asList(r2, r3, r4, r5, r6, r7, r8, r9));
    }

    public static <T> C9349III<T> OooO00o(Throwable th) {
        return OooO0O0((OooO00o) new C6388iLli1(th));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> C9349III<R> OooO0O0(C9349III<? extends T1> r2, C9349III<? extends T2> r3, C9349III<? extends T3> r4, C9349III<? extends T4> r5, C9349III<? extends T5> r6, C9349III<? extends T6> r7, C9349III<? extends T7> r8, AbstractC5351IiIi<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> iiIi) {
        return OooO0oO(new C9349III[]{r2, r3, r4, r5, r6, r7, r8}).OooO00o((OooO0O0) new OperatorZip(iiIi));
    }

    public static <T> C9349III<T> OooO0Oo(C9349III<? extends T> r2, C9349III<? extends T> r3, C9349III<? extends T> r4, C9349III<? extends T> r5, C9349III<? extends T> r6, C9349III<? extends T> r7, C9349III<? extends T> r8, C9349III<? extends T> r9, C9349III<? extends T> r10) {
        return OooO0o0((Iterable) Arrays.asList(r2, r3, r4, r5, r6, r7, r8, r9, r10));
    }

    public static <T> C9349III<T> OooO00o(Future<? extends T> future) {
        return OooO0O0(LLL11L1.OooO00o(future));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C9349III<R> OooO0O0(C9349III<? extends T1> r2, C9349III<? extends T2> r3, C9349III<? extends T3> r4, C9349III<? extends T4> r5, C9349III<? extends T5> r6, C9349III<? extends T6> r7, C9349III<? extends T7> r8, C9349III<? extends T8> r9, AbstractC5634LIiL<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> r10) {
        return OooO0oO(new C9349III[]{r2, r3, r4, r5, r6, r7, r8, r9}).OooO00o((OooO0O0) new OperatorZip(r10));
    }

    public final C9349III<T> OooO0OO(C9349III<? extends T> r1) {
        return OooO0O0((C9349III) this, (C9349III) r1);
    }

    public final <R> C9349III<R> OooO0Oo(AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r2) {
        return OooO00o(r2, ll1i1l.o0ooOO0);
    }

    public static <T> C9349III<T> OooO00o(Future<? extends T> future, long j, TimeUnit timeUnit) {
        return OooO0O0(LLL11L1.OooO00o(future, j, timeUnit));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C9349III<R> OooO0O0(C9349III<? extends T1> r2, C9349III<? extends T2> r3, C9349III<? extends T3> r4, C9349III<? extends T4> r5, C9349III<? extends T5> r6, C9349III<? extends T6> r7, C9349III<? extends T7> r8, C9349III<? extends T8> r9, C9349III<? extends T9> r10, C1i1li<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> r11) {
        return OooO0oO(new C9349III[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}).OooO00o((OooO0O0) new OperatorZip(r11));
    }

    public final C9349III<Integer> OooO0OO() {
        return OooO00o((Object) 0, (AbstractC5189I1l1l) InternalObservableUtils.COUNTER);
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0Oo(int i) {
        return (C9349III<R>) OooO00o((OooO0O0) new OperatorElementAt(i));
    }

    public static <T> C9349III<T> OooO00o(Future<? extends T> future, LL1LL ll1ll) {
        return OooO0O0(LLL11L1.OooO00o(future)).OooO0OO(ll1ll);
    }

    public final <B> C9349III<List<T>> OooO0O0(C9349III<B> r2) {
        return OooO00o(r2, 16);
    }

    public final C9349III<T> OooO0OO(long j, TimeUnit timeUnit) {
        return OooO0OO(j, timeUnit, C6261iii1I1.OooO00o());
    }

    public final C9349III<T> OooO0Oo(T t) {
        return OooOO0(1).OooO0o0((Object) t);
    }

    private <R> C9349III<R> OooO0Oo(AbstractC9847l1<? super T, ? extends R> r2, AbstractC9847l1<? super Throwable, ? extends R> r3, LiLIll<? extends R> r4) {
        return OooO00o((OooO0O0) new C6587lLLLIl(r2, r3, r4));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final C9349III<T> m21408OooO0O0() {
        return CachedObservable.OooO00o((C9349III) this);
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0OO(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return (C9349III<R>) OooO00o((OooO0O0) new iili11i1(j, timeUnit, ll1ll));
    }

    public static <T> C9349III<T> OooO00o(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return OooOoo0();
        }
        if (length == 1) {
            return OooO0oO((Object) tArr[0]);
        }
        return OooO0O0((OooO00o) new OnSubscribeFromArray(tArr));
    }

    @Deprecated
    public final C9349III<T> OooO0O0(int i) {
        return OooO0OO(i);
    }

    public final C9349III<T> OooO0OO(AbstractC6153iL1l<? super T> il1l) {
        return OooO0O0((OooO00o) new iiILii1I(this, new C6256iiL1il(il1l, Actions.m22996OooO00o(), Actions.m22996OooO00o())));
    }

    public final <R> C9349III<R> OooO0Oo(AbstractC9847l1<? super C9349III<T>, ? extends C9349III<R>> r1, int i) {
        return OperatorReplay.OooO0OO(InternalObservableUtils.createReplaySupplier(this, i), (AbstractC9847l1) r1);
    }

    public final <R> C9349III<R> OooO0O0(AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r4) {
        if (this instanceof ScalarSynchronousObservable) {
            return ((ScalarSynchronousObservable) this).Oooo0O0(r4);
        }
        return OooO0O0((OooO00o) new C6873ll1lli(this, r4, 2, 0));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0Oo(AbstractC5189I1l1l<T, T, T> r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new C6497lIIl(r2));
    }

    public final C9349III<C6090iIIliL<T>> OooO0Oo(LL1LL ll1ll) {
        return OooO00o((OooO0O0) new C5757Lii1li(ll1ll));
    }

    public static <T> C9349III<T> OooO00o(Callable<? extends T> callable) {
        return OooO0O0((OooO00o) new C11ll(callable));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0OO(liii1l r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new C6562lL1lI(r2));
    }

    public static <T> C9349III<T> OooO00o(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        return OooO00o(new Object[]{t, t2, t3, t4, t5, t6, t7, t8, t9, t10});
    }

    public final C9349III<T> OooO0O0(long j, TimeUnit timeUnit) {
        return OooO0O0(j, timeUnit, C6261iii1I1.OooO00o());
    }

    public final C9349III<T> OooO0OO(T t) {
        return OooO(1).OooO0o0((Object) t);
    }

    public static <T> C9349III<T> OooO00o(C9349III<? extends T>[] r0) {
        return OooOOo0(OooO00o((Object[]) r0));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0O0(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return (C9349III<R>) OooO00o((OooO0O0) new C6402iiIL(j, timeUnit, ll1ll));
    }

    public final <R> C9349III<R> OooO0OO(AbstractC9847l1<? super T, ? extends Iterable<? extends R>> r1, int i) {
        return IL11i1I.OooO00o(this, r1, i);
    }

    public static <T> C9349III<T> OooO00o(C9349III<? extends T>[] r0, int i) {
        return OooO0OO(OooO00o((Object[]) r0), i);
    }

    public final C9349III<T> OooO0O0(T t) {
        return OooOO0O(OooO0oO((Object) t));
    }

    public final C9349III<T> OooO0OO(long j) {
        return C5389Ii1L.OooO0O0(this, j);
    }

    public static C9349III<Integer> OooO00o(int i, int i2, LL1LL ll1ll) {
        return OooO0OO(i, i2).OooO0OO(ll1ll);
    }

    public final <U> C9349III<T> OooO0O0(LiLIll<? extends C9349III<U>> r2) {
        return OooO0O0((OooO00o) new C9620iiii(this, r2));
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO0OO(AbstractC5189I1l1l<Integer, Throwable, Boolean> r3) {
        return (C9349III<R>) OooOOO0().OooO00o((OooO0O0<? extends R, ? super C9349III<T>>) new C6273iilL(r3));
    }

    public static <T, Resource> C9349III<T> OooO00o(LiLIll<Resource> r1, AbstractC9847l1<? super Resource, ? extends C9349III<? extends T>> r2, AbstractC6153iL1l<? super Resource> il1l) {
        return OooO00o((LiLIll) r1, (AbstractC9847l1) r2, (AbstractC6153iL1l) il1l, false);
    }

    public final C9349III<T> OooO0O0(liii1l r4) {
        return OooO0O0((OooO00o) new iiILii1I(this, new C6256iiL1il(Actions.m22996OooO00o(), Actions.m22996OooO00o(), r4)));
    }

    public final C9349III<T> OooO0OO(AbstractC9847l1<? super C9349III<? extends Throwable>, ? extends C9349III<?>> r1, LL1LL ll1ll) {
        return C5389Ii1L.OooO0OO(this, InternalObservableUtils.createRetryDematerializer(r1), ll1ll);
    }

    public static <T, Resource> C9349III<T> OooO00o(LiLIll<Resource> r1, AbstractC9847l1<? super Resource, ? extends C9349III<? extends T>> r2, AbstractC6153iL1l<? super Resource> il1l, boolean z) {
        return OooO0O0((OooO00o) new OnSubscribeUsing(r1, r2, il1l, z));
    }

    public final C9349III<T> OooO0OO(T t, AbstractC9847l1<? super T, Boolean> r2) {
        return OooOO0O(r2).OooO0o0((Object) t);
    }

    public static <R> C9349III<R> OooO00o(C9349III<? extends C9349III<?>> r1, AbstractC6021i1L<? extends R> i1l) {
        return r1.OooOoO().OooOOoo(InternalObservableUtils.TO_ARRAY).OooO00o((OooO0O0<? extends R, ? super R>) new OperatorZip(i1l));
    }

    public final C9349III<T> OooO0OO(LL1LL ll1ll) {
        return OooO0O0(ll1ll, !(this.OooO00o instanceof OnSubscribeCreate));
    }

    public final C9349III<Boolean> OooO00o(AbstractC9847l1<? super T, Boolean> r2) {
        return OooO00o((OooO0O0) new LLIL(r2));
    }

    public final <K, V> C9349III<Map<K, Collection<V>>> OooO0OO(AbstractC9847l1<? super T, ? extends K> r2, AbstractC9847l1<? super T, ? extends V> r3) {
        return OooO0O0((OooO00o) new LLilIL1(this, r2, r3));
    }

    public final C9349III<T> OooO00o(C9349III<? extends T> r1) {
        return OooO00o((C9349III) this, (C9349III) r1);
    }

    public final C9349III<T> OooO0O0(AbstractC6153iL1l<? super Throwable> il1l) {
        return OooO0O0((OooO00o) new iiILii1I(this, new C6256iiL1il(Actions.m22996OooO00o(), il1l, Actions.m22996OooO00o())));
    }

    public final <K, V> C9349III<Map<K, Collection<V>>> OooO0OO(AbstractC9847l1<? super T, ? extends K> r2, AbstractC9847l1<? super T, ? extends V> r3, LiLIll<? extends Map<K, Collection<V>>> r4) {
        return OooO0O0((OooO00o) new LLilIL1(this, r2, r3, r4));
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C9349III<T> m21395OooO00o() {
        return (C9349III<R>) OooO00o((OooO0O0) C9656l11i.OooO00o());
    }

    public final <TClosing> C9349III<C9349III<T>> OooO0OO(LiLIll<? extends C9349III<? extends TClosing>> r2) {
        return OooO00o((OooO0O0) new C6151iL1L(r2));
    }

    public final <TClosing> C9349III<List<T>> OooO00o(LiLIll<? extends C9349III<? extends TClosing>> r3) {
        return OooO00o((OooO0O0) new C5358IiLiiii1(r3, 16));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C9349III<List<T>> m21396OooO00o(int i) {
        return OooO00o(i, i);
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public static <T> C9349III<T> OooO0O0(C9349III<? extends C9349III<? extends T>> r1, int i) {
        return (C9349III<R>) r1.OooO00o(UtilityFunctions.OooO0OO(), i);
    }

    public final C9349III<List<T>> OooO00o(int i, int i2) {
        return OooO00o((OooO0O0) new OperatorBufferWithSize(i, i2));
    }

    public final C9349III<List<T>> OooO00o(long j, long j2, TimeUnit timeUnit) {
        return OooO00o(j, j2, timeUnit, C6261iii1I1.OooO00o());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.丨丨l1<? super T, ? extends com.pd.sdk.丨III<? extends R>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C9349III<R> OooO0O0(AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r3, int i) {
        if (getClass() == ScalarSynchronousObservable.class) {
            return ((ScalarSynchronousObservable) this).Oooo0O0(r3);
        }
        return OooO0OO(OooOOoo(r3), i);
    }

    public final C9349III<List<T>> OooO00o(long j, long j2, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO00o((OooO0O0) new IL1L1(j, j2, timeUnit, Integer.MAX_VALUE, ll1ll));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C9349III<List<T>> m21399OooO00o(long j, TimeUnit timeUnit) {
        return OooO00o(j, timeUnit, Integer.MAX_VALUE, C6261iii1I1.OooO00o());
    }

    public final C9349III<List<T>> OooO00o(long j, TimeUnit timeUnit, int i) {
        return OooO00o((OooO0O0) new IL1L1(j, j, timeUnit, i, C6261iii1I1.OooO00o()));
    }

    public final <U, R> C9349III<R> OooO0O0(AbstractC9847l1<? super T, ? extends Iterable<? extends U>> r1, AbstractC5189I1l1l<? super T, ? super U, ? extends R> r2) {
        return OooO00o((AbstractC9847l1) C9815LLLIL.OooO00o(r1), (AbstractC5189I1l1l) r2);
    }

    public final C9349III<List<T>> OooO00o(long j, TimeUnit timeUnit, int i, LL1LL ll1ll) {
        return OooO00o((OooO0O0) new IL1L1(j, j, timeUnit, i, ll1ll));
    }

    public final <U, R> C9349III<R> OooO0O0(AbstractC9847l1<? super T, ? extends Iterable<? extends U>> r1, AbstractC5189I1l1l<? super T, ? super U, ? extends R> r2, int i) {
        return OooO00o(C9815LLLIL.OooO00o(r1), r2, i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C9349III<List<T>> m21400OooO00o(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO00o(j, j, timeUnit, ll1ll);
    }

    public final <R> C9349III<R> OooO0O0(AbstractC9847l1<? super T, ? extends LLil11<? extends R>> r2, boolean z) {
        return OooO0O0(r2, z, Integer.MAX_VALUE);
    }

    public final <TOpening, TClosing> C9349III<List<T>> OooO00o(C9349III<? extends TOpening> r2, AbstractC9847l1<? super TOpening, ? extends C9349III<? extends TClosing>> r3) {
        return OooO00o((OooO0O0) new C5305ILL(r2, r3));
    }

    public final <R> C9349III<R> OooO0O0(AbstractC9847l1<? super T, ? extends LLil11<? extends R>> r2, boolean z, int i) {
        return OooO0O0((OooO00o) new OnSubscribeFlatMapSingle(this, r2, z, i));
    }

    public final <B> C9349III<List<T>> OooO00o(C9349III<B> r2, int i) {
        return OooO00o((OooO0O0) new C5358IiLiiii1(r2, i));
    }

    public final <TRight, TLeftDuration, TRightDuration, R> C9349III<R> OooO0O0(C9349III<TRight> r8, AbstractC9847l1<T, C9349III<TLeftDuration>> r9, AbstractC9847l1<TRight, C9349III<TRightDuration>> r10, AbstractC5189I1l1l<T, TRight, R> r11) {
        return OooO0O0((OooO00o) new OnSubscribeJoin(this, r8, r9, r10, r11));
    }

    public final <R> C9349III<R> OooO00o(Class<R> cls) {
        return OooO00o((OooO0O0) new C5785LlII(cls));
    }

    public final C9349III<T> OooO0O0(T t, AbstractC9847l1<? super T, Boolean> r3) {
        return OooOO0O(r3).OooOO0(1).OooO0o0((Object) t);
    }

    public final <R> C9349III<R> OooO00o(LiLIll<R> r2, AbstractC9583iI1Il<R, ? super T> r3) {
        return OooO0O0((OooO00o) new C9874ii(this, r2, r3));
    }

    public final <R> C9349III<R> OooO0O0(Class<R> cls) {
        return OooOO0O(InternalObservableUtils.isInstanceOf(cls)).OooO00o((Class) cls);
    }

    public final C9349III<Boolean> OooO00o(Object obj) {
        return OooOO0(InternalObservableUtils.equalsWith(obj));
    }

    public final C9349III<T> OooO0O0(AbstractC5189I1l1l<T, T, T> r2) {
        return OooO0O0((OooO00o) new C5811LlLIL(this, r2));
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final <U, V> C9349III<T> OooO00o(LiLIll<? extends C9349III<U>> r2, AbstractC9847l1<? super T, ? extends C9349III<V>> r3) {
        return (C9349III<R>) OooO0O0((LiLIll) r2).OooO00o((OooO0O0) new C6000i111(this, r3));
    }

    public final C9349III<T> OooO0O0(LL1LL ll1ll) {
        return C5389Ii1L.OooO00o(this, ll1ll);
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO00o(AbstractC5189I1l1l<? super T, ? super T, Boolean> r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new IIL1l(r2));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final C9349III<T> m21409OooO0O0(long j) {
        return C5389Ii1L.OooO00o(this, j);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C9349III<T> m21403OooO00o(AbstractC6153iL1l<Notification<? super T>> il1l) {
        return OooO0O0((OooO00o) new iiILii1I(this, new C9336I1IL(il1l)));
    }

    public final i11iiILl<T> OooO0O0() {
        return OperatorReplay.OooO00o((C9349III) this);
    }

    public final <R> C9349III<R> OooO0O0(AbstractC9847l1<? super C9349III<T>, ? extends C9349III<R>> r2, LL1LL ll1ll) {
        return OperatorReplay.OooO0OO(InternalObservableUtils.createReplaySupplier(this), InternalObservableUtils.createReplaySelectorAndObserveOn(r2, ll1ll));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C9349III<T> m21401OooO00o(AbstractC5477Il11<? super T> r2) {
        return OooO0O0((OooO00o) new iiILii1I(this, r2));
    }

    public final <R> C9349III<R> OooO0O0(R r, AbstractC5189I1l1l<R, ? super T, R> r3) {
        return OooO00o((OooO0O0) new C6497lIIl((Object) r, (AbstractC5189I1l1l) r3));
    }

    public static <T> C9349III<T> OooO00o(Iterable<? extends C9349III<? extends T>> iterable, int i) {
        return OooO0o((Iterable) iterable).OooO00o(UtilityFunctions.OooO0OO(), i);
    }

    public final LlIiLii OooO0O0(AbstractC9508LiLi<? super T> r5) {
        try {
            r5.onStart();
            C9714lli.OooO00o(this, this.OooO00o).call(r5);
            return C9714lli.OooO00o(r5);
        } catch (Throwable th) {
            IIl11.m15447OooO00o(th);
            OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th);
            C9714lli.OooO0O0((Throwable) onErrorFailedException);
            throw onErrorFailedException;
        }
    }

    public final <R> C9349III<R> OooO00o(AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r3, int i) {
        if (i >= 1) {
            return OooO00o((OooO0O0) new OperatorEagerConcatMap(r3, i, Integer.MAX_VALUE));
        }
        throw new IllegalArgumentException("capacityHint > 0 required but it was " + i);
    }

    public final <R> C9349III<R> OooO00o(AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r2, int i, int i2) {
        if (i < 1) {
            throw new IllegalArgumentException("capacityHint > 0 required but it was " + i);
        } else if (i2 >= 1) {
            return OooO00o((OooO0O0) new OperatorEagerConcatMap(r2, i, i2));
        } else {
            throw new IllegalArgumentException("maxConcurrent > 0 required but it was " + i);
        }
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO00o(int i, T t) {
        return (C9349III<R>) OooO00o((OooO0O0) new OperatorElementAt(i, t));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO00o(liii1l r2) {
        return (C9349III<R>) OooO00o((OooO0O0) new C6539lIiiL(r2));
    }

    public final C9349III<T> OooO00o(T t, AbstractC9847l1<? super T, Boolean> r2) {
        return OooOooO(r2).OooO0o0((Object) t);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.pd.sdk.丨丨l1<? super T, ? extends com.pd.sdk.丨III<? extends R>> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.丨丨l1<? super java.lang.Throwable, ? extends com.pd.sdk.丨III<? extends R>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.LiLIll丨丨<? extends com.pd.sdk.丨III<? extends R>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C9349III<R> OooO00o(AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r1, AbstractC9847l1<? super Throwable, ? extends C9349III<? extends R>> r2, LiLIll<? extends C9349III<? extends R>> r3) {
        return OooOOo0(OooO0Oo(r1, r2, r3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.pd.sdk.丨丨l1<? super T, ? extends com.pd.sdk.丨III<? extends R>> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.丨丨l1<? super java.lang.Throwable, ? extends com.pd.sdk.丨III<? extends R>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.LiLIll丨丨<? extends com.pd.sdk.丨III<? extends R>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> C9349III<R> OooO00o(AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r1, AbstractC9847l1<? super Throwable, ? extends C9349III<? extends R>> r2, LiLIll<? extends C9349III<? extends R>> r3, int i) {
        return OooO0OO(OooO0Oo(r1, r2, r3), i);
    }

    public final C9349III<T> OooO0O0(LL1LL ll1ll, boolean z) {
        if (this instanceof ScalarSynchronousObservable) {
            return ((ScalarSynchronousObservable) this).OooO0oO(ll1ll);
        }
        return OooO0O0((OooO00o) new C6278iiliI(this, ll1ll, z));
    }

    public final <U, R> C9349III<R> OooO00o(AbstractC9847l1<? super T, ? extends C9349III<? extends U>> r2, AbstractC5189I1l1l<? super T, ? super U, ? extends R> r3) {
        return OooOOo0(OooO00o((OooO0O0) new C9815LLLIL(r2, r3)));
    }

    public final <U, R> C9349III<R> OooO00o(AbstractC9847l1<? super T, ? extends C9349III<? extends U>> r2, AbstractC5189I1l1l<? super T, ? super U, ? extends R> r3, int i) {
        return OooO0OO(OooO00o((OooO0O0) new C9815LLLIL(r2, r3)), i);
    }

    public final C9349III<T> OooO00o(AbstractC9847l1<? super T, ? extends C5876LlIl> r2, boolean z) {
        return OooO00o(r2, z, Integer.MAX_VALUE);
    }

    public final C9349III<List<T>> OooO0O0(int i, long j, TimeUnit timeUnit) {
        return m21397OooO00o(i, j, timeUnit).OooOoO();
    }

    public final C9349III<T> OooO00o(AbstractC9847l1<? super T, ? extends C5876LlIl> r2, boolean z, int i) {
        return OooO0O0((OooO00o) new OnSubscribeFlatMapCompletable(this, r2, z, i));
    }

    public final C9349III<List<T>> OooO0O0(int i, long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return m21398OooO00o(i, j, timeUnit, ll1ll).OooOoO();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m21405OooO00o(AbstractC6153iL1l<? super T> il1l) {
        OooO00o((AbstractC6153iL1l) il1l);
    }

    public final <U, V> C9349III<T> OooO0O0(LiLIll<? extends C9349III<U>> r2, AbstractC9847l1<? super T, ? extends C9349III<V>> r3) {
        return OooO00o((LiLIll) r2, (AbstractC9847l1) r3, (C9349III) null);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m21406OooO00o(AbstractC6153iL1l<? super T> il1l, AbstractC6153iL1l<Throwable> il1l2) {
        OooO00o((AbstractC6153iL1l) il1l, il1l2);
    }

    public final <K, V> C9349III<Map<K, V>> OooO0O0(AbstractC9847l1<? super T, ? extends K> r2, AbstractC9847l1<? super T, ? extends V> r3) {
        return OooO0O0((OooO00o) new C5573IiI(this, r2, r3));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m21407OooO00o(AbstractC6153iL1l<? super T> il1l, AbstractC6153iL1l<Throwable> il1l2, liii1l r3) {
        OooO00o((AbstractC6153iL1l) il1l, il1l2, r3);
    }

    public final <K, V> C9349III<Map<K, V>> OooO0O0(AbstractC9847l1<? super T, ? extends K> r2, AbstractC9847l1<? super T, ? extends V> r3, LiLIll<? extends Map<K, V>> r4) {
        return OooO0O0((OooO00o) new C5573IiI(this, r2, r3, r4));
    }

    public final <K, R> C9349III<C9814LLIlLL<K, R>> OooO00o(AbstractC9847l1<? super T, ? extends K> r2, AbstractC9847l1<? super T, ? extends R> r3) {
        return OooO00o((OooO0O0) new OperatorGroupBy(r2, r3));
    }

    public final C9349III<C9349III<T>> OooO0O0(int i, int i2) {
        if (i <= 0) {
            throw new IllegalArgumentException("count > 0 required but it was " + i);
        } else if (i2 > 0) {
            return OooO00o((OooO0O0) new OperatorWindowWithSize(i, i2));
        } else {
            throw new IllegalArgumentException("skip > 0 required but it was " + i2);
        }
    }

    public final <K, R> C9349III<C9814LLIlLL<K, R>> OooO00o(AbstractC9847l1<? super T, ? extends K> r2, AbstractC9847l1<? super T, ? extends R> r3, AbstractC9847l1<AbstractC6153iL1l<K>, Map<K, Object>> r4) {
        if (r4 != null) {
            return OooO00o((OooO0O0) new OperatorGroupBy(r2, r3, r4));
        }
        throw new NullPointerException("evictingMapFactory cannot be null");
    }

    public final <T2, D1, D2, R> C9349III<R> OooO00o(C9349III<T2> r8, AbstractC9847l1<? super T, ? extends C9349III<D1>> r9, AbstractC9847l1<? super T2, ? extends C9349III<D2>> r10, AbstractC5189I1l1l<? super T, ? super C9349III<T2>, ? extends R> r11) {
        return OooO0O0((OooO00o) new OnSubscribeGroupJoin(this, r8, r9, r10, r11));
    }

    public final C9349III<C9349III<T>> OooO0O0(long j, long j2, TimeUnit timeUnit) {
        return OooO00o(j, j2, timeUnit, Integer.MAX_VALUE, C6261iii1I1.OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C9349III<T> m21402OooO00o(LL1LL ll1ll) {
        return OooO00o(ll1ll, ll1i1l.o0ooOO0);
    }

    public final C9349III<C9349III<T>> OooO0O0(long j, long j2, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO00o(j, j2, timeUnit, Integer.MAX_VALUE, ll1ll);
    }

    public final C9349III<T> OooO00o(LL1LL ll1ll, int i) {
        return OooO00o(ll1ll, false, i);
    }

    public final C9349III<C9349III<T>> OooO0O0(long j, TimeUnit timeUnit, int i) {
        return OooO0O0(j, timeUnit, i, C6261iii1I1.OooO00o());
    }

    public final C9349III<T> OooO00o(LL1LL ll1ll, boolean z) {
        return OooO00o(ll1ll, z, ll1i1l.o0ooOO0);
    }

    public final C9349III<C9349III<T>> OooO0O0(long j, TimeUnit timeUnit, int i, LL1LL ll1ll) {
        return OooO00o(j, j, timeUnit, i, ll1ll);
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO00o(LL1LL ll1ll, boolean z, int i) {
        return this instanceof ScalarSynchronousObservable ? ((ScalarSynchronousObservable) this).OooO0oO(ll1ll) : (C9349III<R>) OooO00o((OooO0O0) new C6543lL11(ll1ll, z, i));
    }

    public final <TOpening, TClosing> C9349III<C9349III<T>> OooO0O0(C9349III<? extends TOpening> r2, AbstractC9847l1<? super TOpening, ? extends C9349III<? extends TClosing>> r3) {
        return OooO00o((OooO0O0) new Il11ii(r2, r3));
    }

    public final <T2, R> C9349III<R> OooO0O0(C9349III<? extends T2> r1, AbstractC5189I1l1l<? super T, ? super T2, ? extends R> r2) {
        return OooO0OO(this, r1, r2);
    }

    public final C11LlIl1<T> OooO0O0(long j) {
        ili1Il OooO00o2 = ili1Il.OooO00o(j);
        OooO00o((AbstractC5477Il11) OooO00o2);
        return OooO00o2;
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO00o(long j) {
        return (C9349III<R>) OooO00o((OooO0O0) new C9435I1IiI(j));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO00o(long j, liii1l r4) {
        return (C9349III<R>) OooO00o((OooO0O0) new C9435I1IiI(j, r4));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO00o(long j, liii1l r4, C6222ii1l.AbstractC6223OooO0Oo oooO0Oo) {
        return (C9349III<R>) OooO00o((OooO0O0) new C9435I1IiI(j, r4, oooO0Oo));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final i11iiILl<T> m21393OooO00o() {
        return OperatorPublish.OooO00o((C9349III) this);
    }

    public final <R> C9349III<R> OooO00o(R r, AbstractC5189I1l1l<R, ? super T, R> r3) {
        return OooO0O0((OooO00o) new C6852lLLl1(this, r, r3));
    }

    public final C9349III<T> OooO00o(long j, LL1LL ll1ll) {
        return C5389Ii1L.OooO00o(this, j, ll1ll);
    }

    public final C9349III<T> OooO00o(AbstractC9847l1<? super C9349III<? extends Void>, ? extends C9349III<?>> r1, LL1LL ll1ll) {
        return C5389Ii1L.OooO0O0(this, InternalObservableUtils.createRepeatDematerializer(r1), ll1ll);
    }

    public final <R> C9349III<R> OooO00o(AbstractC9847l1<? super C9349III<T>, ? extends C9349III<R>> r8, int i, long j, TimeUnit timeUnit) {
        return OooO00o(r8, i, j, timeUnit, C6261iii1I1.OooO00o());
    }

    public final <R> C9349III<R> OooO00o(AbstractC9847l1<? super C9349III<T>, ? extends C9349III<R>> r7, int i, long j, TimeUnit timeUnit, LL1LL ll1ll) {
        if (i >= 0) {
            return OperatorReplay.OooO0OO(InternalObservableUtils.createReplaySupplier(this, i, j, timeUnit, ll1ll), (AbstractC9847l1) r7);
        }
        throw new IllegalArgumentException("bufferSize < 0");
    }

    public final <R> C9349III<R> OooO00o(AbstractC9847l1<? super C9349III<T>, ? extends C9349III<R>> r1, int i, LL1LL ll1ll) {
        return OperatorReplay.OooO0OO(InternalObservableUtils.createReplaySupplier(this, i), InternalObservableUtils.createReplaySelectorAndObserveOn(r1, ll1ll));
    }

    public final <R> C9349III<R> OooO00o(AbstractC9847l1<? super C9349III<T>, ? extends C9349III<R>> r7, long j, TimeUnit timeUnit) {
        return OooO00o(r7, j, timeUnit, C6261iii1I1.OooO00o());
    }

    public final <R> C9349III<R> OooO00o(AbstractC9847l1<? super C9349III<T>, ? extends C9349III<R>> r1, long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OperatorReplay.OooO0OO(InternalObservableUtils.createReplaySupplier(this, j, timeUnit, ll1ll), (AbstractC9847l1) r1);
    }

    public final i11iiILl<T> OooO00o(int i) {
        return OperatorReplay.OooO00o((C9349III) this, i);
    }

    public final i11iiILl<T> OooO00o(int i, long j, TimeUnit timeUnit) {
        return OooO00o(i, j, timeUnit, C6261iii1I1.OooO00o());
    }

    public final i11iiILl<T> OooO00o(int i, long j, TimeUnit timeUnit, LL1LL ll1ll) {
        if (i >= 0) {
            return OperatorReplay.OooO00o(this, j, timeUnit, ll1ll, i);
        }
        throw new IllegalArgumentException("bufferSize < 0");
    }

    public final i11iiILl<T> OooO00o(int i, LL1LL ll1ll) {
        return OperatorReplay.OooO00o((i11iiILl) OooO00o(i), ll1ll);
    }

    public final i11iiILl<T> OooO00o(long j, TimeUnit timeUnit) {
        return OooO00o(j, timeUnit, C6261iii1I1.OooO00o());
    }

    public final i11iiILl<T> OooO00o(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OperatorReplay.OooO00o(this, j, timeUnit, ll1ll);
    }

    public final i11iiILl<T> OooO00o(LL1LL ll1ll) {
        return OperatorReplay.OooO00o((i11iiILl) OooO0O0(), ll1ll);
    }

    public final C9349III<T> OooO00o(Iterable<T> iterable) {
        return OooO0O0(OooO0o((Iterable) iterable), (C9349III) this);
    }

    public final C9349III<T> OooO00o(T t, T t2) {
        return OooO0O0(OooO0O0((Object) t, (Object) t2), (C9349III) this);
    }

    public final C9349III<T> OooO00o(T t, T t2, T t3) {
        return OooO0O0(OooO0O0((Object) t, (Object) t2, (Object) t3), (C9349III) this);
    }

    public final C9349III<T> OooO00o(T t, T t2, T t3, T t4) {
        return OooO0O0(OooO0O0((Object) t, (Object) t2, (Object) t3, (Object) t4), (C9349III) this);
    }

    public final C9349III<T> OooO00o(T t, T t2, T t3, T t4, T t5) {
        return OooO0O0(OooO0O0((Object) t, (Object) t2, (Object) t3, (Object) t4, (Object) t5), (C9349III) this);
    }

    public final C9349III<T> OooO00o(T t, T t2, T t3, T t4, T t5, T t6) {
        return OooO0O0(OooO0O0((Object) t, (Object) t2, (Object) t3, (Object) t4, (Object) t5, (Object) t6), (C9349III) this);
    }

    public final C9349III<T> OooO00o(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        return OooO0O0(OooO0O0((Object) t, (Object) t2, (Object) t3, (Object) t4, (Object) t5, (Object) t6, (Object) t7), (C9349III) this);
    }

    public final C9349III<T> OooO00o(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        return OooO0O0(OooO0O0((Object) t, (Object) t2, (Object) t3, (Object) t4, (Object) t5, (Object) t6, (Object) t7, (Object) t8), (C9349III) this);
    }

    public final C9349III<T> OooO00o(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        return OooO0O0(OooO0O0((Object) t, (Object) t2, (Object) t3, (Object) t4, (Object) t5, (Object) t6, (Object) t7, (Object) t8, (Object) t9), (C9349III) this);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final LlIiLii m21391OooO00o() {
        return OooO00o((AbstractC9508LiLi) new C1i1(Actions.m22996OooO00o(), InternalObservableUtils.ERROR_NOT_IMPLEMENTED, Actions.m22996OooO00o()));
    }

    public final LlIiLii OooO00o(AbstractC6153iL1l<? super T> il1l) {
        if (il1l != null) {
            return OooO00o((AbstractC9508LiLi) new C1i1(il1l, InternalObservableUtils.ERROR_NOT_IMPLEMENTED, Actions.m22996OooO00o()));
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public final LlIiLii OooO00o(AbstractC6153iL1l<? super T> il1l, AbstractC6153iL1l<Throwable> il1l2) {
        if (il1l == null) {
            throw new IllegalArgumentException("onNext can not be null");
        } else if (il1l2 != null) {
            return OooO00o((AbstractC9508LiLi) new C1i1(il1l, il1l2, Actions.m22996OooO00o()));
        } else {
            throw new IllegalArgumentException("onError can not be null");
        }
    }

    public final LlIiLii OooO00o(AbstractC6153iL1l<? super T> il1l, AbstractC6153iL1l<Throwable> il1l2, liii1l r4) {
        if (il1l == null) {
            throw new IllegalArgumentException("onNext can not be null");
        } else if (il1l2 == null) {
            throw new IllegalArgumentException("onError can not be null");
        } else if (r4 != null) {
            return OooO00o((AbstractC9508LiLi) new C1i1(il1l, il1l2, r4));
        } else {
            throw new IllegalArgumentException("onComplete can not be null");
        }
    }

    public final LlIiLii OooO00o(AbstractC5477Il11<? super T> r2) {
        if (r2 instanceof AbstractC9508LiLi) {
            return OooO00o((AbstractC9508LiLi) ((AbstractC9508LiLi) r2));
        }
        if (r2 != null) {
            return OooO00o((AbstractC9508LiLi) new C6282ii1i(r2));
        }
        throw new NullPointerException("observer is null");
    }

    public final LlIiLii OooO00o(AbstractC9508LiLi<? super T> r1) {
        return OooO00o((AbstractC9508LiLi) r1, (C9349III) this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: com.pd.sdk.丨III$OooO00o */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> LlIiLii OooO00o(AbstractC9508LiLi<? super T> r3, C9349III<T> r4) {
        if (r3 == null) {
            throw new IllegalArgumentException("subscriber can not be null");
        } else if (r4.OooO00o != null) {
            r3.onStart();
            if (!(r3 instanceof C6158iLI)) {
                r3 = new C6158iLI(r3);
            }
            try {
                C9714lli.OooO00o(r4, r4.OooO00o).call(r3);
                return C9714lli.OooO00o(r3);
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th);
                C9714lli.OooO0O0((Throwable) onErrorFailedException);
                throw onErrorFailedException;
            }
        } else {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C9349III<T> m21397OooO00o(int i, long j, TimeUnit timeUnit) {
        return m21398OooO00o(i, j, timeUnit, C6261iii1I1.OooO00o());
    }

    /* JADX DEBUG: Type inference failed for r8v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C9349III<T> m21398OooO00o(int i, long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return (C9349III<R>) OooO00o((OooO0O0) new LLi1L(i, j, timeUnit, ll1ll));
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final <U, V> C9349III<T> OooO00o(LiLIll<? extends C9349III<U>> r2, AbstractC9847l1<? super T, ? extends C9349III<V>> r3, C9349III<? extends T> r4) {
        if (r3 != null) {
            return (C9349III<R>) OooO00o((OooO0O0) new C9679lII1I(r2, r3, r4));
        }
        throw new NullPointerException("timeoutSelector is null");
    }

    public final <V> C9349III<T> OooO00o(AbstractC9847l1<? super T, ? extends C9349III<V>> r2, C9349III<? extends T> r3) {
        return OooO00o((LiLIll) null, (AbstractC9847l1) r2, (C9349III) r3);
    }

    public final C9349III<T> OooO00o(long j, TimeUnit timeUnit, C9349III<? extends T> r10) {
        return OooO00o(j, timeUnit, r10, C6261iii1I1.OooO00o());
    }

    /* JADX DEBUG: Type inference failed for r8v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public final C9349III<T> OooO00o(long j, TimeUnit timeUnit, C9349III<? extends T> r11, LL1LL ll1ll) {
        return (C9349III<R>) OooO00o((OooO0O0) new C5664LLilL(j, timeUnit, r11, ll1ll));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C6753llII1<T> m21394OooO00o() {
        return C6753llII1.OooO00o((C9349III) this);
    }

    public final <K, V> C9349III<Map<K, Collection<V>>> OooO00o(AbstractC9847l1<? super T, ? extends K> r8, AbstractC9847l1<? super T, ? extends V> r9, LiLIll<? extends Map<K, Collection<V>>> r10, AbstractC9847l1<? super K, ? extends Collection<V>> r11) {
        return OooO0O0((OooO00o) new LLilIL1(this, r8, r9, r10, r11));
    }

    public final C9349III<List<T>> OooO00o(AbstractC5189I1l1l<? super T, ? super T, Integer> r2, int i) {
        return OooO00o((OooO0O0) new LLLII11(r2, i));
    }

    public final <U, R> C9349III<R> OooO00o(C9349III<? extends U> r2, AbstractC5189I1l1l<? super T, ? super U, ? extends R> r3) {
        return OooO00o((OooO0O0) new C1li(r2, r3));
    }

    public final <T1, T2, R> C9349III<R> OooO00o(C9349III<T1> r4, C9349III<T2> r5, AbstractC9359IIIi<? super T, ? super T1, ? super T2, R> r6) {
        return OooO0O0((OooO00o) new Il1iIili(this, new C9349III[]{r4, r5}, null, iiL1ll.OooO00o(r6)));
    }

    public final <T1, T2, T3, R> C9349III<R> OooO00o(C9349III<T1> r4, C9349III<T2> r5, C9349III<T3> r6, i1li1ii1<? super T, ? super T1, ? super T2, ? super T3, R> i1li1ii1) {
        return OooO0O0((OooO00o) new Il1iIili(this, new C9349III[]{r4, r5, r6}, null, iiL1ll.OooO00o(i1li1ii1)));
    }

    public final <T1, T2, T3, T4, R> C9349III<R> OooO00o(C9349III<T1> r4, C9349III<T2> r5, C9349III<T3> r6, C9349III<T4> r7, Il1lLL11<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> il1lLL11) {
        return OooO0O0((OooO00o) new Il1iIili(this, new C9349III[]{r4, r5, r6, r7}, null, iiL1ll.OooO00o(il1lLL11)));
    }

    public final <T1, T2, T3, T4, T5, R> C9349III<R> OooO00o(C9349III<T1> r4, C9349III<T2> r5, C9349III<T3> r6, C9349III<T4> r7, C9349III<T5> r8, AbstractC9474LI1lil<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, R> r9) {
        return OooO0O0((OooO00o) new Il1iIili(this, new C9349III[]{r4, r5, r6, r7, r8}, null, iiL1ll.OooO00o(r9)));
    }

    public final <T1, T2, T3, T4, T5, T6, R> C9349III<R> OooO00o(C9349III<T1> r4, C9349III<T2> r5, C9349III<T3> r6, C9349III<T4> r7, C9349III<T5> r8, C9349III<T6> r9, AbstractC5351IiIi<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, R> iiIi) {
        return OooO0O0((OooO00o) new Il1iIili(this, new C9349III[]{r4, r5, r6, r7, r8, r9}, null, iiL1ll.OooO00o(iiIi)));
    }

    public final <T1, T2, T3, T4, T5, T6, T7, R> C9349III<R> OooO00o(C9349III<T1> r4, C9349III<T2> r5, C9349III<T3> r6, C9349III<T4> r7, C9349III<T5> r8, C9349III<T6> r9, C9349III<T7> r10, AbstractC5634LIiL<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, R> r11) {
        return OooO0O0((OooO00o) new Il1iIili(this, new C9349III[]{r4, r5, r6, r7, r8, r9, r10}, null, iiL1ll.OooO00o(r11)));
    }

    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> C9349III<R> OooO00o(C9349III<T1> r4, C9349III<T2> r5, C9349III<T3> r6, C9349III<T4> r7, C9349III<T5> r8, C9349III<T6> r9, C9349III<T7> r10, C9349III<T8> r11, C1i1li<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, R> r12) {
        return OooO0O0((OooO00o) new Il1iIili(this, new C9349III[]{r4, r5, r6, r7, r8, r9, r10, r11}, null, iiL1ll.OooO00o(r12)));
    }

    public final <R> C9349III<R> OooO00o(C9349III<?>[] r3, AbstractC6021i1L<R> i1l) {
        return OooO0O0((OooO00o) new Il1iIili(this, r3, null, i1l));
    }

    public final <R> C9349III<R> OooO00o(Iterable<C9349III<?>> iterable, AbstractC6021i1L<R> i1l) {
        return OooO0O0((OooO00o) new Il1iIili(this, null, iterable, i1l));
    }

    public final C9349III<C9349III<T>> OooO00o(long j, long j2, TimeUnit timeUnit, int i, LL1LL ll1ll) {
        return OooO00o((OooO0O0) new lI1LiL(j, j2, timeUnit, i, ll1ll));
    }

    public final <T2, R> C9349III<R> OooO00o(Iterable<? extends T2> iterable, AbstractC5189I1l1l<? super T, ? super T2, ? extends R> r3) {
        return OooO00o((OooO0O0) new Ll1LLlI(iterable, r3));
    }
}
