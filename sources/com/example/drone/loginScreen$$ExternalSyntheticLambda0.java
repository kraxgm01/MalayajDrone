package com.example.drone;

import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class loginScreen$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ FirebaseAuth f$0;
    public final /* synthetic */ TextInputEditText f$1;
    public final /* synthetic */ TextInputEditText f$2;
    public final /* synthetic */ loginScreen f$3;

    public /* synthetic */ loginScreen$$ExternalSyntheticLambda0(FirebaseAuth firebaseAuth, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, loginScreen loginscreen) {
        this.f$0 = firebaseAuth;
        this.f$1 = textInputEditText;
        this.f$2 = textInputEditText2;
        this.f$3 = loginscreen;
    }

    public final void onClick(View view) {
        loginScreen.m1onCreate$lambda1(this.f$0, this.f$1, this.f$2, this.f$3, view);
    }
}
