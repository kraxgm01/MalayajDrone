package com.google.firebase.database.ktx;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.MutableData;
import com.google.firebase.ktx.Firebase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0001\u001a\u001c\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\fH\b¢\u0006\u0002\u0010\r\u001a\u001c\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u000eH\b¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"LIBRARY_NAME", "", "database", "Lcom/google/firebase/database/FirebaseDatabase;", "Lcom/google/firebase/ktx/Firebase;", "getDatabase", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/database/FirebaseDatabase;", "app", "Lcom/google/firebase/FirebaseApp;", "url", "getValue", "T", "Lcom/google/firebase/database/DataSnapshot;", "(Lcom/google/firebase/database/DataSnapshot;)Ljava/lang/Object;", "Lcom/google/firebase/database/MutableData;", "(Lcom/google/firebase/database/MutableData;)Ljava/lang/Object;", "com.google.firebase-firebase-database-ktx"}, k = 2, mv = {1, 1, 16})
/* compiled from: Database.kt */
public final class DatabaseKt {
    public static final String LIBRARY_NAME = "fire-db-ktx";

    public static final FirebaseDatabase getDatabase(Firebase $this$database) {
        Intrinsics.checkParameterIsNotNull($this$database, "$this$database");
        FirebaseDatabase instance = FirebaseDatabase.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "FirebaseDatabase.getInstance()");
        return instance;
    }

    public static final FirebaseDatabase database(Firebase $this$database, String url) {
        Intrinsics.checkParameterIsNotNull($this$database, "$this$database");
        Intrinsics.checkParameterIsNotNull(url, ImagesContract.URL);
        FirebaseDatabase instance = FirebaseDatabase.getInstance(url);
        Intrinsics.checkExpressionValueIsNotNull(instance, "FirebaseDatabase.getInstance(url)");
        return instance;
    }

    public static final FirebaseDatabase database(Firebase $this$database, FirebaseApp app) {
        Intrinsics.checkParameterIsNotNull($this$database, "$this$database");
        Intrinsics.checkParameterIsNotNull(app, "app");
        FirebaseDatabase instance = FirebaseDatabase.getInstance(app);
        Intrinsics.checkExpressionValueIsNotNull(instance, "FirebaseDatabase.getInstance(app)");
        return instance;
    }

    public static final FirebaseDatabase database(Firebase $this$database, FirebaseApp app, String url) {
        Intrinsics.checkParameterIsNotNull($this$database, "$this$database");
        Intrinsics.checkParameterIsNotNull(app, "app");
        Intrinsics.checkParameterIsNotNull(url, ImagesContract.URL);
        FirebaseDatabase instance = FirebaseDatabase.getInstance(app, url);
        Intrinsics.checkExpressionValueIsNotNull(instance, "FirebaseDatabase.getInstance(app, url)");
        return instance;
    }

    public static final /* synthetic */ <T> T getValue(DataSnapshot $this$getValue) {
        Intrinsics.checkParameterIsNotNull($this$getValue, "$this$getValue");
        Intrinsics.needClassReification();
        return $this$getValue.getValue(new DatabaseKt$getValue$1());
    }

    public static final /* synthetic */ <T> T getValue(MutableData $this$getValue) {
        Intrinsics.checkParameterIsNotNull($this$getValue, "$this$getValue");
        Intrinsics.needClassReification();
        return $this$getValue.getValue(new DatabaseKt$getValue$2());
    }
}
