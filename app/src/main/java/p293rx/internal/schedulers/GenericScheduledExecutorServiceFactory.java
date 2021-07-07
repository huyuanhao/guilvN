package p293rx.internal.schedulers;

import com.p118pd.sdk.C9714lli;
import com.p118pd.sdk.LiLIll;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p293rx.internal.util.RxThreadFactory;

/* renamed from: rx.internal.schedulers.GenericScheduledExecutorServiceFactory */
public enum GenericScheduledExecutorServiceFactory {
    ;
    
    public static final RxThreadFactory THREAD_FACTORY = new RxThreadFactory(THREAD_NAME_PREFIX);
    public static final String THREAD_NAME_PREFIX = "RxScheduledExecutorPool-";

    public static ScheduledExecutorService create() {
        LiLIll<? extends ScheduledExecutorService> OooO00o2 = C9714lli.m21752OooO00o();
        if (OooO00o2 == null) {
            return createDefault();
        }
        return (ScheduledExecutorService) OooO00o2.call();
    }

    public static ScheduledExecutorService createDefault() {
        return Executors.newScheduledThreadPool(1, threadFactory());
    }

    public static ThreadFactory threadFactory() {
        return THREAD_FACTORY;
    }
}
