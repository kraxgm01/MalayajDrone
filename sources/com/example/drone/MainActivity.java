package com.example.drone;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/example/drone/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "SPLASH_SCREEN", "", "bottomAnim", "Landroid/view/animation/Animation;", "companyName", "Landroid/widget/TextView;", "logo", "Landroid/widget/ImageView;", "slogan", "topAnim", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: MainActivity.kt */
public final class MainActivity extends AppCompatActivity {
    private final long SPLASH_SCREEN = 5000;
    private Animation bottomAnim;
    private TextView companyName;
    private ImageView logo;
    private TextView slogan;
    private Animation topAnim;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        setContentView((int) R.layout.activity_main);
        View findViewById = findViewById(R.id.logo);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.logo)");
        this.logo = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.companyName);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.companyName)");
        this.companyName = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.slogan);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.slogan)");
        this.slogan = (TextView) findViewById3;
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(this,R.anim.top_animation)");
        this.topAnim = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        Intrinsics.checkNotNullExpressionValue(loadAnimation2, "loadAnimation(this,R.anim.bottom_animation)");
        this.bottomAnim = loadAnimation2;
        ImageView imageView = this.logo;
        Animation animation = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logo");
            imageView = null;
        }
        Animation animation2 = this.topAnim;
        if (animation2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topAnim");
            animation2 = null;
        }
        imageView.setAnimation(animation2);
        TextView textView = this.companyName;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("companyName");
            textView = null;
        }
        Animation animation3 = this.bottomAnim;
        if (animation3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomAnim");
            animation3 = null;
        }
        textView.setAnimation(animation3);
        TextView textView2 = this.slogan;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("slogan");
            textView2 = null;
        }
        Animation animation4 = this.bottomAnim;
        if (animation4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomAnim");
        } else {
            animation = animation4;
        }
        textView2.setAnimation(animation);
        new Handler(Looper.getMainLooper()).postDelayed(new MainActivity$$ExternalSyntheticLambda0(this), this.SPLASH_SCREEN);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m0onCreate$lambda0(MainActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, loginScreen.class);
        Activity activity = this$0;
        Pair[] pairArr = new Pair[2];
        ImageView imageView = this$0.logo;
        TextView textView = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logo");
            imageView = null;
        }
        pairArr[0] = Pair.create(imageView, "logo_image");
        TextView textView2 = this$0.companyName;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("companyName");
        } else {
            textView = textView2;
        }
        pairArr[1] = Pair.create(textView, "logo_text");
        this$0.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(activity, pairArr).toBundle());
    }
}
