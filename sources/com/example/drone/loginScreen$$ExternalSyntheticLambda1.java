package com.example.drone;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class loginScreen$$ExternalSyntheticLambda1 implements OnCompleteListener {
    public final /* synthetic */ loginScreen f$0;
    public final /* synthetic */ FirebaseAuth f$1;

    public /* synthetic */ loginScreen$$ExternalSyntheticLambda1(loginScreen loginscreen, FirebaseAuth firebaseAuth) {
        this.f$0 = loginscreen;
        this.f$1 = firebaseAuth;
    }

    public final void onComplete(Task task) {
        loginScreen.m2onCreate$lambda1$lambda0(this.f$0, this.f$1, task);
    }
}
