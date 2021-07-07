package com.megvii.meglive_sdk.p100e.p103b;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.p118pd.sdk.C7978oO0oOooo;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.megvii.meglive_sdk.e.b.a */
public final class C1543a {

    /* renamed from: a */
    public static float[] f2462a = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};

    /* renamed from: b */
    public static float[] f2463b = {0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: c */
    public static float[] f2464c = {0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* renamed from: d */
    public boolean f2465d = false;

    /* renamed from: e */
    public final String f2466e = "attribute vec4 vPosition;attribute vec2 inputTextureCoordinate;varying vec2 textureCoordinate;void main(){gl_Position = vPosition; gl_PointSize = 10.0;textureCoordinate = inputTextureCoordinate;}";

    /* renamed from: f */
    public final String f2467f = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;varying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}";

    /* renamed from: g */
    public FloatBuffer f2468g;

    /* renamed from: h */
    public FloatBuffer f2469h;

    /* renamed from: i */
    public ShortBuffer f2470i;

    /* renamed from: j */
    public final int f2471j;

    /* renamed from: k */
    public short[] f2472k = {0, 1, 2, 0, 2, 3};

    /* renamed from: l */
    public final int f2473l = 8;

    /* renamed from: m */
    public int f2474m;

    /* renamed from: n */
    public final int f2475n = (f2464c.length / 3);

    public C1543a(int i) {
        this.f2474m = i;
        this.f2468g = m2596b(f2462a);
        short[] sArr = this.f2472k;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect.asShortBuffer();
        asShortBuffer.put(sArr);
        asShortBuffer.position(0);
        this.f2470i = asShortBuffer;
        this.f2469h = m2596b(f2463b);
        this.f2471j = GLES20.glCreateProgram();
        GLES20.glAttachShader(this.f2471j, m2595a(35633, "attribute vec4 vPosition;attribute vec2 inputTextureCoordinate;varying vec2 textureCoordinate;void main(){gl_Position = vPosition; gl_PointSize = 10.0;textureCoordinate = inputTextureCoordinate;}"));
        GLES20.glAttachShader(this.f2471j, m2595a(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;varying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}"));
        GLES20.glLinkProgram(this.f2471j);
    }

    /* renamed from: b */
    public static FloatBuffer m2596b(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    /* renamed from: a */
    public final void mo17156a(float[] fArr) {
        GLES20.glUseProgram(this.f2471j);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f2474m);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f2471j, "vPosition");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(glGetAttribLocation, 2, (int) C7978oO0oOooo.Oooo0, false, 8, (Buffer) this.f2468g);
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f2471j, "inputTextureCoordinate");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        this.f2469h.clear();
        FloatBuffer floatBuffer = this.f2469h;
        float[] fArr2 = f2463b;
        float[] fArr3 = new float[fArr2.length];
        float[] fArr4 = new float[4];
        for (int i = 0; i < fArr2.length; i += 2) {
            int i2 = i + 1;
            Matrix.multiplyMV(fArr4, 0, fArr, 0, new float[]{fArr2[i], fArr2[i2], 0.0f, 1.0f}, 0);
            fArr3[i] = fArr4[0];
            fArr3[i2] = fArr2[i2];
        }
        floatBuffer.put(fArr3);
        this.f2469h.position(0);
        GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, (int) C7978oO0oOooo.Oooo0, false, 8, (Buffer) this.f2469h);
        GLES20.glDrawElements(4, this.f2472k.length, (int) C7978oO0oOooo.Oooo000, this.f2470i);
        GLES20.glDisableVertexAttribArray(glGetAttribLocation);
        GLES20.glDisableVertexAttribArray(glGetAttribLocation2);
    }

    /* renamed from: a */
    public static int m2595a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }
}
