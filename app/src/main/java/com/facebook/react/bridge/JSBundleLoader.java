package com.facebook.react.bridge;

import android.content.Context;
import com.facebook.react.common.DebugServerException;

public abstract class JSBundleLoader {
    public static JSBundleLoader createAssetLoader(final Context context, final String str, final boolean z) {
        return new JSBundleLoader() {
            /* class com.facebook.react.bridge.JSBundleLoader.C06411 */

            @Override // com.facebook.react.bridge.JSBundleLoader
            public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
                jSBundleLoaderDelegate.loadScriptFromAssets(context.getAssets(), str, z);
                return str;
            }
        };
    }

    public static JSBundleLoader createCachedBundleFromNetworkLoader(final String str, final String str2) {
        return new JSBundleLoader() {
            /* class com.facebook.react.bridge.JSBundleLoader.C06433 */

            @Override // com.facebook.react.bridge.JSBundleLoader
            public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
                try {
                    jSBundleLoaderDelegate.loadScriptFromFile(str2, str, false);
                    return str;
                } catch (Exception e) {
                    throw DebugServerException.makeGeneric(e.getMessage(), e);
                }
            }
        };
    }

    public static JSBundleLoader createDeltaFromNetworkLoader(final String str, final NativeDeltaClient nativeDeltaClient) {
        return new JSBundleLoader() {
            /* class com.facebook.react.bridge.JSBundleLoader.C06444 */

            @Override // com.facebook.react.bridge.JSBundleLoader
            public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
                try {
                    jSBundleLoaderDelegate.loadScriptFromDeltaBundle(str, nativeDeltaClient, false);
                    return str;
                } catch (Exception e) {
                    throw DebugServerException.makeGeneric(e.getMessage(), e);
                }
            }
        };
    }

    public static JSBundleLoader createFileLoader(String str) {
        return createFileLoader(str, str, false);
    }

    public static JSBundleLoader createRemoteDebuggerBundleLoader(final String str, final String str2) {
        return new JSBundleLoader() {
            /* class com.facebook.react.bridge.JSBundleLoader.C06455 */

            @Override // com.facebook.react.bridge.JSBundleLoader
            public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
                jSBundleLoaderDelegate.setSourceURLs(str2, str);
                return str2;
            }
        };
    }

    public abstract String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate);

    public static JSBundleLoader createFileLoader(final String str, final String str2, final boolean z) {
        return new JSBundleLoader() {
            /* class com.facebook.react.bridge.JSBundleLoader.C06422 */

            @Override // com.facebook.react.bridge.JSBundleLoader
            public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
                jSBundleLoaderDelegate.loadScriptFromFile(str, str2, z);
                return str;
            }
        };
    }
}
