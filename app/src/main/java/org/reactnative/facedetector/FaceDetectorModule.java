package org.reactnative.facedetector;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.p118pd.sdk.AsyncTaskC6647liII1;
import com.p118pd.sdk.I1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class FaceDetectorModule extends ReactContextBaseJavaModule {
    public static final String TAG = "RNFaceDetector";
    public static ReactApplicationContext mScopedContext;

    public FaceDetectorModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        mScopedContext = reactApplicationContext;
    }

    @ReactMethod
    public void detectFaces(ReadableMap readableMap, Promise promise) {
        new AsyncTaskC6647liII1(mScopedContext, readableMap, promise).execute(new Void[0]);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        return Collections.unmodifiableMap(new HashMap<String, Object>() {
            /* class org.reactnative.facedetector.FaceDetectorModule.C48621 */

            {
                put("Mode", OooO0Oo());
                put("Landmarks", OooO0OO());
                put("Classifications", OooO0O0());
            }

            private Map<String, Object> OooO0O0() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class org.reactnative.facedetector.FaceDetectorModule.C48621.C48642 */

                    {
                        put("all", Integer.valueOf(I1.OooO0Oo));
                        put("none", Integer.valueOf(I1.OooO0o0));
                    }
                });
            }

            private Map<String, Object> OooO0OO() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class org.reactnative.facedetector.FaceDetectorModule.C48621.C48653 */

                    {
                        put("all", Integer.valueOf(I1.OooO0o));
                        put("none", Integer.valueOf(I1.OooO0oO));
                    }
                });
            }

            private Map<String, Object> OooO0Oo() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class org.reactnative.facedetector.FaceDetectorModule.C48621.C48631 */

                    {
                        put("fast", Integer.valueOf(I1.OooO));
                        put("accurate", Integer.valueOf(I1.OooO0oo));
                    }
                });
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }
}
