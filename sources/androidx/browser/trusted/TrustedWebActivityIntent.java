package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import java.util.List;

public final class TrustedWebActivityIntent {
    private final Intent mIntent;
    private final List<Uri> mSharedFileUris;

    TrustedWebActivityIntent(Intent intent, List<Uri> sharedFileUris) {
        this.mIntent = intent;
        this.mSharedFileUris = sharedFileUris;
    }

    public void launchTrustedWebActivity(Context context) {
        grantUriPermissionToProvider(context);
        ContextCompat.startActivity(context, this.mIntent, (Bundle) null);
    }

    private void grantUriPermissionToProvider(Context context) {
        for (Uri uri : this.mSharedFileUris) {
            context.grantUriPermission(this.mIntent.getPackage(), uri, 1);
        }
    }

    public Intent getIntent() {
        return this.mIntent;
    }
}
