package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabp;
import com.google.android.gms.common.api.internal.zace;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
public class GoogleApi<O extends Api.ApiOptions> {
    public final Api<O> mApi;
    public final Context mContext;
    public final int mId;
    public final O zabh;
    public final zai<O> zabi;
    public final Looper zabj;
    public final GoogleApiClient zabk;
    public final StatusExceptionMapper zabl;
    public final GoogleApiManager zabm;

    @KeepForSdk
    public static class Settings {
        @KeepForSdk
        public static final Settings DEFAULT_SETTINGS = new Builder().build();
        public final StatusExceptionMapper zabn;
        public final Looper zabo;

        @KeepForSdk
        public static class Builder {
            public Looper zabj;
            public StatusExceptionMapper zabl;

            @KeepForSdk
            public Settings build() {
                if (this.zabl == null) {
                    this.zabl = new ApiExceptionMapper();
                }
                if (this.zabj == null) {
                    this.zabj = Looper.getMainLooper();
                }
                return new Settings(this.zabl, this.zabj);
            }

            @KeepForSdk
            public Builder setLooper(Looper looper) {
                Preconditions.checkNotNull(looper, "Looper must not be null.");
                this.zabj = looper;
                return this;
            }

            @KeepForSdk
            public Builder setMapper(StatusExceptionMapper statusExceptionMapper) {
                Preconditions.checkNotNull(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.zabl = statusExceptionMapper;
                return this;
            }
        }

        @KeepForSdk
        public Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.zabn = statusExceptionMapper;
            this.zabo = looper;
        }
    }

    @KeepForSdk
    public GoogleApi(@NonNull Context context, Api<O> api, Looper looper) {
        Preconditions.checkNotNull(context, "Null context is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(looper, "Looper must not be null.");
        this.mContext = context.getApplicationContext();
        this.mApi = api;
        this.zabh = null;
        this.zabj = looper;
        this.zabi = zai.zaa(api);
        this.zabk = new zabp(this);
        GoogleApiManager zab = GoogleApiManager.zab(this.mContext);
        this.zabm = zab;
        this.mId = zab.zabd();
        this.zabl = new ApiExceptionMapper();
    }

    private final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zaa(int i, @NonNull T t) {
        t.zau();
        this.zabm.zaa(this, i, t);
        return t;
    }

    @KeepForSdk
    public GoogleApiClient asGoogleApiClient() {
        return this.zabk;
    }

    @KeepForSdk
    public ClientSettings.Builder createClientSettingsBuilder() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount googleSignInAccount;
        GoogleSignInAccount googleSignInAccount2;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        O o = this.zabh;
        if (!(o instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o).getGoogleSignInAccount()) == null) {
            O o2 = this.zabh;
            account = o2 instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) o2).getAccount() : null;
        } else {
            account = googleSignInAccount2.getAccount();
        }
        ClientSettings.Builder account2 = builder.setAccount(account);
        O o3 = this.zabh;
        if (!(o3 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o3).getGoogleSignInAccount()) == null) {
            set = Collections.emptySet();
        } else {
            set = googleSignInAccount.getRequestedScopes();
        }
        return account2.addAllRequiredScopes(set).setRealClientClassName(this.mContext.getClass().getName()).setRealClientPackageName(this.mContext.getPackageName());
    }

    @KeepForSdk
    public Task<Boolean> disconnectService() {
        return this.zabm.zac((GoogleApi<?>) this);
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doBestEffortWrite(@NonNull T t) {
        return (T) zaa(2, t);
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doRead(@NonNull T t) {
        return (T) zaa(0, t);
    }

    @KeepForSdk
    @Deprecated
    public <A extends Api.AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Task<Void> doRegisterEventListener(@NonNull T t, U u) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(u);
        Preconditions.checkNotNull(t.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(u.getListenerKey(), "Listener has already been released.");
        Preconditions.checkArgument(t.getListenerKey().equals(u.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zabm.zaa(this, t, u);
    }

    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(@NonNull ListenerHolder.ListenerKey<?> listenerKey) {
        Preconditions.checkNotNull(listenerKey, "Listener key cannot be null.");
        return this.zabm.zaa(this, listenerKey);
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doWrite(@NonNull T t) {
        return (T) zaa(1, t);
    }

    public final Api<O> getApi() {
        return this.mApi;
    }

    @KeepForSdk
    public O getApiOptions() {
        return this.zabh;
    }

    @KeepForSdk
    public Context getApplicationContext() {
        return this.mContext;
    }

    public final int getInstanceId() {
        return this.mId;
    }

    @KeepForSdk
    public Looper getLooper() {
        return this.zabj;
    }

    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@NonNull L l, String str) {
        return ListenerHolders.createListenerHolder(l, this.zabj, str);
    }

    public final zai<O> zak() {
        return this.zabi;
    }

    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doBestEffortWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zaa(2, taskApiCall);
    }

    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doRead(TaskApiCall<A, TResult> taskApiCall) {
        return zaa(0, taskApiCall);
    }

    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zaa(1, taskApiCall);
    }

    private final <TResult, A extends Api.AnyClient> Task<TResult> zaa(int i, @NonNull TaskApiCall<A, TResult> taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zabm.zaa(this, i, taskApiCall, taskCompletionSource, this.zabl);
        return taskCompletionSource.getTask();
    }

    @WorkerThread
    public Api.Client zaa(Looper looper, GoogleApiManager.zaa<O> zaa) {
        return this.mApi.zai().buildClient(this.mContext, looper, createClientSettingsBuilder().build(), this.zabh, zaa, zaa);
    }

    public zace zaa(Context context, Handler handler) {
        return new zace(context, handler, createClientSettingsBuilder().build());
    }

    @KeepForSdk
    public <A extends Api.AnyClient> Task<Void> doRegisterEventListener(@NonNull RegistrationMethods<A, ?> registrationMethods) {
        Preconditions.checkNotNull(registrationMethods);
        Preconditions.checkNotNull(registrationMethods.zajy.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(registrationMethods.zajz.getListenerKey(), "Listener has already been released.");
        return this.zabm.zaa(this, registrationMethods.zajy, registrationMethods.zajz);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Context context, Api<O> api, O o, Looper looper, StatusExceptionMapper statusExceptionMapper) {
        this(context, api, o, new Settings.Builder().setLooper(looper).setMapper(statusExceptionMapper).build());
    }

    @KeepForSdk
    @MainThread
    public GoogleApi(@NonNull Activity activity, Api<O> api, O o, Settings settings) {
        Preconditions.checkNotNull(activity, "Null activity is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.mContext = activity.getApplicationContext();
        this.mApi = api;
        this.zabh = o;
        this.zabj = settings.zabo;
        this.zabi = zai.zaa(api, o);
        this.zabk = new zabp(this);
        GoogleApiManager zab = GoogleApiManager.zab(this.mContext);
        this.zabm = zab;
        this.mId = zab.zabd();
        this.zabl = settings.zabn;
        if (!(activity instanceof GoogleApiActivity)) {
            zaae.zaa(activity, this.zabm, this.zabi);
        }
        this.zabm.zaa((GoogleApi<?>) this);
    }

    @KeepForSdk
    public GoogleApi(@NonNull Context context, Api<O> api, O o, Settings settings) {
        Preconditions.checkNotNull(context, "Null context is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.mContext = context.getApplicationContext();
        this.mApi = api;
        this.zabh = o;
        this.zabj = settings.zabo;
        this.zabi = zai.zaa(api, o);
        this.zabk = new zabp(this);
        GoogleApiManager zab = GoogleApiManager.zab(this.mContext);
        this.zabm = zab;
        this.mId = zab.zabd();
        this.zabl = settings.zabn;
        this.zabm.zaa((GoogleApi<?>) this);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Activity activity, Api<O> api, O o, StatusExceptionMapper statusExceptionMapper) {
        this(activity, (Api) api, (Api.ApiOptions) o, new Settings.Builder().setMapper(statusExceptionMapper).setLooper(activity.getMainLooper()).build());
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Context context, Api<O> api, O o, StatusExceptionMapper statusExceptionMapper) {
        this(context, api, o, new Settings.Builder().setMapper(statusExceptionMapper).build());
    }
}
