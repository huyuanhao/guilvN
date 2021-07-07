package com.megvii.meglive_sdk.p100e.p103b;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.p118pd.sdk.C7978oO0oOooo;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.megvii.meglive_sdk.e.b.d */
public final class C1548d {

    /* renamed from: g */
    public static final float[] f2511g = {1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, -1.0f, -1.0f};

    /* renamed from: h */
    public static final float[] f2512h = {1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: a */
    public int f2513a;

    /* renamed from: b */
    public int f2514b;

    /* renamed from: c */
    public int f2515c;

    /* renamed from: d */
    public int f2516d;

    /* renamed from: e */
    public int f2517e;

    /* renamed from: f */
    public final float[] f2518f = new float[16];

    /* renamed from: i */
    public final FloatBuffer f2519i;

    /* renamed from: j */
    public final FloatBuffer f2520j;

    public C1548d() {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f2519i = asFloatBuffer;
        asFloatBuffer.put(f2511g);
        this.f2519i.flip();
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f2520j = asFloatBuffer2;
        asFloatBuffer2.put(f2512h);
        this.f2520j.flip();
        int glCreateShader = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(glCreateShader, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute highp vec4 aPosition;\nattribute highp vec4 aTextureCoord;\nvarying highp vec2 vTextureCoord;\n\nvoid main() {\n\tgl_Position = uMVPMatrix * aPosition;\n\tvTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n");
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteShader(glCreateShader);
            glCreateShader = 0;
        }
        int glCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(glCreateShader2, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nvarying highp vec2 vTextureCoord;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}");
        GLES20.glCompileShader(glCreateShader2);
        GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteShader(glCreateShader2);
            glCreateShader2 = 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, glCreateShader);
        GLES20.glAttachShader(glCreateProgram, glCreateShader2);
        GLES20.glLinkProgram(glCreateProgram);
        this.f2513a = glCreateProgram;
        GLES20.glUseProgram(glCreateProgram);
        this.f2514b = GLES20.glGetAttribLocation(this.f2513a, "aPosition");
        this.f2515c = GLES20.glGetAttribLocation(this.f2513a, "aTextureCoord");
        this.f2516d = GLES20.glGetUniformLocation(this.f2513a, "uMVPMatrix");
        this.f2517e = GLES20.glGetUniformLocation(this.f2513a, "uTexMatrix");
        Matrix.setIdentityM(this.f2518f, 0);
        GLES20.glUniformMatrix4fv(this.f2516d, 1, false, this.f2518f, 0);
        GLES20.glUniformMatrix4fv(this.f2517e, 1, false, this.f2518f, 0);
        GLES20.glVertexAttribPointer(this.f2514b, 2, (int) C7978oO0oOooo.Oooo0, false, 8, (Buffer) this.f2519i);
        GLES20.glVertexAttribPointer(this.f2515c, 2, (int) C7978oO0oOooo.Oooo0, false, 8, (Buffer) this.f2520j);
        GLES20.glEnableVertexAttribArray(this.f2514b);
        GLES20.glEnableVertexAttribArray(this.f2515c);
    }

    /* renamed from: a */
    public final void mo17171a() {
        int i = this.f2513a;
        if (i >= 0) {
            GLES20.glDeleteProgram(i);
        }
        this.f2513a = -1;
    }
}
