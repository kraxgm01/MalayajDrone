package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzack  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzack extends AbstractList implements RandomAccess, zzaak {
    /* access modifiers changed from: private */
    public final zzaak zza;

    public zzack(zzaak zzaak) {
        this.zza = zzaak;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzaaj) this.zza).get(i);
    }

    public final Iterator iterator() {
        return new zzacj(this);
    }

    public final ListIterator listIterator(int i) {
        return new zzaci(this, i);
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzaak zze() {
        return this;
    }

    public final Object zzf(int i) {
        return this.zza.zzf(i);
    }

    public final List zzh() {
        return this.zza.zzh();
    }

    public final void zzi(zzyu zzyu) {
        throw new UnsupportedOperationException();
    }
}
