package com.facebook.react.bridge;

import com.facebook.common.logging.FLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public final class FallbackJSBundleLoader extends JSBundleLoader {
    public static final String RECOVERABLE = "facebook::react::Recoverable";
    public static final String TAG = "FallbackJSBundleLoader";
    public Stack<JSBundleLoader> mLoaders = new Stack<>();
    public final ArrayList<Exception> mRecoveredErrors = new ArrayList<>();

    public FallbackJSBundleLoader(List<JSBundleLoader> list) {
        ListIterator<JSBundleLoader> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            this.mLoaders.push(listIterator.previous());
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:13:0x001f */
    private JSBundleLoader getDelegateLoader() {
        if (!this.mLoaders.empty()) {
            return this.mLoaders.peek();
        }
        RuntimeException runtimeException = new RuntimeException("No fallback options available");
        Iterator<Exception> it = this.mRecoveredErrors.iterator();
        Throwable th = runtimeException;
        while (it.hasNext()) {
            th.initCause(it.next());
            th = th;
            while (th.getCause() != null) {
                th = th.getCause();
            }
        }
        throw runtimeException;
    }

    @Override // com.facebook.react.bridge.JSBundleLoader
    public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
        while (true) {
            try {
                return getDelegateLoader().loadScript(jSBundleLoaderDelegate);
            } catch (Exception e) {
                if (e.getMessage() == null || !e.getMessage().startsWith(RECOVERABLE)) {
                    throw e;
                }
                this.mLoaders.pop();
                this.mRecoveredErrors.add(e);
                FLog.wtf(TAG, "Falling back from recoverable error", e);
            }
        }
        throw e;
    }
}
