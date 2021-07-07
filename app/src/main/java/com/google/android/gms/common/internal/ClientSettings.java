package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.p118pd.sdk.C6972o0000oOO;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@VisibleForTesting
@KeepForSdk
public final class ClientSettings {
    public static final String KEY_CLIENT_SESSION_ID = "com.google.android.gms.common.internal.ClientSettings.sessionId";
    public final Set<Scope> zabr;
    public final int zabt;
    public final View zabu;
    public final String zabv;
    public final String zabw;
    public final Set<Scope> zaoa;
    public final Map<Api<?>, OptionalApiSettings> zaob;
    public final SignInOptions zaoc;
    public Integer zaod;
    public final Account zax;

    @KeepForSdk
    public static final class Builder {
        public int zabt = 0;
        public View zabu;
        public String zabv;
        public String zabw;
        public Map<Api<?>, OptionalApiSettings> zaob;
        public SignInOptions zaoc = SignInOptions.DEFAULT;
        public C6972o0000oOO<Scope> zaoe;
        public Account zax;

        public final Builder addAllRequiredScopes(Collection<Scope> collection) {
            if (this.zaoe == null) {
                this.zaoe = new C6972o0000oOO<>();
            }
            this.zaoe.addAll(collection);
            return this;
        }

        public final Builder addRequiredScope(Scope scope) {
            if (this.zaoe == null) {
                this.zaoe = new C6972o0000oOO<>();
            }
            this.zaoe.add(scope);
            return this;
        }

        @KeepForSdk
        public final ClientSettings build() {
            return new ClientSettings(this.zax, this.zaoe, this.zaob, this.zabt, this.zabu, this.zabv, this.zabw, this.zaoc);
        }

        public final Builder setAccount(Account account) {
            this.zax = account;
            return this;
        }

        public final Builder setGravityForPopups(int i) {
            this.zabt = i;
            return this;
        }

        public final Builder setOptionalApiSettingsMap(Map<Api<?>, OptionalApiSettings> map) {
            this.zaob = map;
            return this;
        }

        public final Builder setRealClientClassName(String str) {
            this.zabw = str;
            return this;
        }

        @KeepForSdk
        public final Builder setRealClientPackageName(String str) {
            this.zabv = str;
            return this;
        }

        public final Builder setSignInOptions(SignInOptions signInOptions) {
            this.zaoc = signInOptions;
            return this;
        }

        public final Builder setViewForPopups(View view) {
            this.zabu = view;
            return this;
        }
    }

    public static final class OptionalApiSettings {
        public final Set<Scope> mScopes;

        public OptionalApiSettings(Set<Scope> set) {
            Preconditions.checkNotNull(set);
            this.mScopes = Collections.unmodifiableSet(set);
        }
    }

    public ClientSettings(Account account, Set<Scope> set, Map<Api<?>, OptionalApiSettings> map, int i, View view, String str, String str2, SignInOptions signInOptions) {
        this.zax = account;
        this.zabr = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.zaob = map == null ? Collections.EMPTY_MAP : map;
        this.zabu = view;
        this.zabt = i;
        this.zabv = str;
        this.zabw = str2;
        this.zaoc = signInOptions;
        HashSet hashSet = new HashSet(this.zabr);
        for (OptionalApiSettings optionalApiSettings : this.zaob.values()) {
            hashSet.addAll(optionalApiSettings.mScopes);
        }
        this.zaoa = Collections.unmodifiableSet(hashSet);
    }

    @KeepForSdk
    public static ClientSettings createDefault(Context context) {
        return new GoogleApiClient.Builder(context).buildClientSettings();
    }

    @KeepForSdk
    @Nullable
    public final Account getAccount() {
        return this.zax;
    }

    @KeepForSdk
    @Nullable
    @Deprecated
    public final String getAccountName() {
        Account account = this.zax;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @KeepForSdk
    public final Account getAccountOrDefault() {
        Account account = this.zax;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    @KeepForSdk
    public final Set<Scope> getAllRequestedScopes() {
        return this.zaoa;
    }

    @KeepForSdk
    public final Set<Scope> getApplicableScopes(Api<?> api) {
        OptionalApiSettings optionalApiSettings = this.zaob.get(api);
        if (optionalApiSettings == null || optionalApiSettings.mScopes.isEmpty()) {
            return this.zabr;
        }
        HashSet hashSet = new HashSet(this.zabr);
        hashSet.addAll(optionalApiSettings.mScopes);
        return hashSet;
    }

    @Nullable
    public final Integer getClientSessionId() {
        return this.zaod;
    }

    @KeepForSdk
    public final int getGravityForPopups() {
        return this.zabt;
    }

    public final Map<Api<?>, OptionalApiSettings> getOptionalApiSettings() {
        return this.zaob;
    }

    @Nullable
    public final String getRealClientClassName() {
        return this.zabw;
    }

    @KeepForSdk
    @Nullable
    public final String getRealClientPackageName() {
        return this.zabv;
    }

    @KeepForSdk
    public final Set<Scope> getRequiredScopes() {
        return this.zabr;
    }

    @Nullable
    public final SignInOptions getSignInOptions() {
        return this.zaoc;
    }

    @KeepForSdk
    @Nullable
    public final View getViewForPopups() {
        return this.zabu;
    }

    public final void setClientSessionId(Integer num) {
        this.zaod = num;
    }
}
