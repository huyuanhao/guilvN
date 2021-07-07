package com.megvii.meglive_sdk.base;

import com.megvii.meglive_sdk.base.BaseModel;
import com.megvii.meglive_sdk.base.BaseView;
import com.megvii.meglive_sdk.p106f.C1570l;
import com.megvii.meglive_sdk.p106f.C1571m;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class DetectBasePresenter<V extends BaseView, M extends BaseModel> {
    public static final int DEFAULT_VALUE = -1;
    public static final int LIVENESS_FAILURE = 3003;
    public static final int LIVENESS_SUCCESS = 0;
    public static final int LIVENESS_TIMEOUT = 3002;
    public static final String LOGTAG = "Detect";
    public byte[] cameraData = null;
    public BlockingQueue<byte[]> mFrameDataQueue;
    public C1570l mICamera;
    public M mModel;
    public V mView;

    public class OooO00o implements InvocationHandler {
        public final /* synthetic */ BaseView OooO00o;

        public OooO00o(BaseView baseView) {
            this.OooO00o = baseView;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (DetectBasePresenter.this.mView == null) {
                return null;
            }
            return method.invoke(this.OooO00o, objArr);
        }
    }

    public boolean attach(V v) {
        C1571m.m2654a("DetectBasePresenter attach view ....");
        this.mView = (V) ((BaseView) Proxy.newProxyInstance(v.getClass().getClassLoader(), v.getClass().getInterfaces(), new OooO00o(v)));
        try {
            this.mModel = (M) ((BaseModel) ((Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1]).newInstance());
            return true;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void closeCamera() {
        try {
            if (this.mICamera != null) {
                C1571m.m2655a(LOGTAG, "closeCamera...");
                this.mICamera.mo17188b();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void detach() {
        C1571m.m2654a("DetectBasePresenter detach.....");
        this.mView = null;
        this.mModel = null;
    }

    public int getCameraHeight() {
        C1570l lVar = this.mICamera;
        if (lVar != null) {
            return lVar.f2604c;
        }
        return 0;
    }

    public int getCameraWidth() {
        C1570l lVar = this.mICamera;
        if (lVar != null) {
            return lVar.f2603b;
        }
        return 0;
    }

    public M getModel() {
        return this.mModel;
    }

    public V getView() {
        return this.mView;
    }

    public void init() {
        this.mICamera = new C1570l();
        this.mFrameDataQueue = new LinkedBlockingDeque(1);
    }

    public boolean openCamera() {
        try {
            if (this.mICamera != null) {
                C1571m.m2655a(LOGTAG, "openCamera...");
                if (this.mICamera.mo17184a(getView().getActivity(), C1570l.m2648c() ? 1 : 0) != null) {
                    return true;
                }
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
