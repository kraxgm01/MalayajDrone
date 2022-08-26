package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.zac;
import com.google.android.gms.dynamic.LifecycleDelegate;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    /* access modifiers changed from: private */
    public T zaa;
    /* access modifiers changed from: private */
    public Bundle zab;
    /* access modifiers changed from: private */
    public LinkedList<zah> zac;
    private final OnDelegateCreatedListener<T> zad = new zaa(this);

    public static void showGooglePlayUnavailableMessage(FrameLayout parent) {
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        Context context = parent.getContext();
        int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context);
        String zad2 = zac.zad(context, isGooglePlayServicesAvailable);
        String zac2 = zac.zac(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(parent.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        parent.addView(linearLayout);
        TextView textView = new TextView(parent.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(zad2);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = instance.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, (String) null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(zac2);
            linearLayout.addView(button);
            button.setOnClickListener(new zae(context, errorResolutionIntent));
        }
    }

    private final void zae(int i) {
        while (!this.zac.isEmpty() && this.zac.getLast().zaa() >= i) {
            this.zac.removeLast();
        }
    }

    private final void zaf(Bundle bundle, zah zah) {
        T t = this.zaa;
        if (t != null) {
            zah.zab(t);
            return;
        }
        if (this.zac == null) {
            this.zac = new LinkedList<>();
        }
        this.zac.add(zah);
        if (bundle != null) {
            Bundle bundle2 = this.zab;
            if (bundle2 == null) {
                this.zab = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.zad);
    }

    /* access modifiers changed from: protected */
    public abstract void createDelegate(OnDelegateCreatedListener<T> onDelegateCreatedListener);

    public T getDelegate() {
        return this.zaa;
    }

    /* access modifiers changed from: protected */
    public void handleGooglePlayUnavailable(FrameLayout parent) {
        showGooglePlayUnavailableMessage(parent);
    }

    public void onCreate(Bundle savedInstanceState) {
        zaf(savedInstanceState, new zac(this, savedInstanceState));
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FrameLayout frameLayout = new FrameLayout(inflater.getContext());
        zaf(savedInstanceState, new zad(this, frameLayout, inflater, container, savedInstanceState));
        if (this.zaa == null) {
            handleGooglePlayUnavailable(frameLayout);
        }
        return frameLayout;
    }

    public void onDestroy() {
        T t = this.zaa;
        if (t != null) {
            t.onDestroy();
        } else {
            zae(1);
        }
    }

    public void onDestroyView() {
        T t = this.zaa;
        if (t != null) {
            t.onDestroyView();
        } else {
            zae(2);
        }
    }

    public void onInflate(Activity activity, Bundle attrs, Bundle savedInstanceState) {
        zaf(savedInstanceState, new zab(this, activity, attrs, savedInstanceState));
    }

    public void onLowMemory() {
        T t = this.zaa;
        if (t != null) {
            t.onLowMemory();
        }
    }

    public void onPause() {
        T t = this.zaa;
        if (t != null) {
            t.onPause();
        } else {
            zae(5);
        }
    }

    public void onResume() {
        zaf((Bundle) null, new zag(this));
    }

    public void onSaveInstanceState(Bundle outState) {
        T t = this.zaa;
        if (t != null) {
            t.onSaveInstanceState(outState);
            return;
        }
        Bundle bundle = this.zab;
        if (bundle != null) {
            outState.putAll(bundle);
        }
    }

    public void onStart() {
        zaf((Bundle) null, new zaf(this));
    }

    public void onStop() {
        T t = this.zaa;
        if (t != null) {
            t.onStop();
        } else {
            zae(4);
        }
    }
}
