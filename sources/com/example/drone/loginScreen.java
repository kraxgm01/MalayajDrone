package com.example.drone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.ktx.AuthKt;
import com.google.firebase.ktx.Firebase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\n"}, d2 = {"Lcom/example/drone/loginScreen;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "updateUI", "user", "Lcom/google/firebase/auth/FirebaseUser;", "app_debug"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: loginScreen.kt */
public final class loginScreen extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        setContentView((int) R.layout.activity_login_screen);
        FirebaseAuth auth = AuthKt.getAuth(Firebase.INSTANCE);
        View findViewById = findViewById(R.id.email);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.email)");
        View findViewById2 = findViewById(R.id.password);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.password)");
        View findViewById3 = findViewById(R.id.login_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.login_button)");
        ((Button) findViewById3).setOnClickListener(new loginScreen$$ExternalSyntheticLambda0(auth, (TextInputEditText) findViewById, (TextInputEditText) findViewById2, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m1onCreate$lambda1(FirebaseAuth $auth, TextInputEditText $email, TextInputEditText $pass, loginScreen this$0, View it) {
        Intrinsics.checkNotNullParameter($auth, "$auth");
        Intrinsics.checkNotNullParameter($email, "$email");
        Intrinsics.checkNotNullParameter($pass, "$pass");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        $auth.signInWithEmailAndPassword(String.valueOf($email.getText()), String.valueOf($pass.getText())).addOnCompleteListener((Activity) this$0, new loginScreen$$ExternalSyntheticLambda1(this$0, $auth));
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1$lambda-0  reason: not valid java name */
    public static final void m2onCreate$lambda1$lambda0(loginScreen this$0, FirebaseAuth $auth, Task task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter($auth, "$auth");
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            Toast.makeText(this$0.getBaseContext(), "Authentication PASSED.", 0).show();
            Log.d("ContentValues", "signInWithEmail:success");
            this$0.updateUI($auth.getCurrentUser());
            return;
        }
        Log.w("ContentValues", "signInWithEmail:failure", task.getException());
        Toast.makeText(this$0.getBaseContext(), "Authentication failed.", 0).show();
    }

    private final void updateUI(FirebaseUser user) {
        startActivity(new Intent(this, Dashboard.class));
    }
}
