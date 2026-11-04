package com.zentraedi.reader.readium;

import android.content.ContentResolver;
import android.content.Context;
import fo.k;
import fo.l;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import org.readium.r2.shared.publication.Publication;
import org.readium.r2.shared.util.Try;
import org.readium.r2.shared.util.asset.Asset;
import org.readium.r2.shared.util.asset.AssetRetriever;
import org.readium.r2.shared.util.format.FormatHints;
import org.readium.r2.shared.util.http.DefaultHttpClient;
import org.readium.r2.shared.util.logging.WarningLogger;
import org.readium.r2.shared.util.pdf.PdfDocumentFactory;
import org.readium.r2.streamer.PublicationOpener;
import org.readium.r2.streamer.parser.DefaultPublicationParser;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
@SourceDebugExtension({"SMAP\nReadium.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Readium.kt\ncom/zentraedi/reader/readium/Readium\n+ 2 Try.kt\norg/readium/r2/shared/util/TryKt\n*L\n1#1,55:1\n122#2,4:56\n122#2,4:60\n*S KotlinDebug\n*F\n+ 1 Readium.kt\ncom/zentraedi/reader/readium/Readium\n*L\n38#1:56,4\n49#1:60,4\n*E\n"})
public final class d {

    @k
    public static final a d = new a(null);

    @k
    private final DefaultHttpClient a;

    @k
    private final AssetRetriever b;

    @k
    private final PublicationOpener c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k
        public final d a(@k Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new d(context);
        }

        private a() {
        }
    }

    @DebugMetadata(c = "com.zentraedi.reader.readium.Readium", f = "Readium.kt", i = {0}, l = {48}, m = "openAsset", n = {"asset"}, s = {"L$0"}, v = 1)
    static final class b extends ContinuationImpl {
        Object a;
        /* synthetic */ Object b;
        int d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.b = obj;
            this.d |= IntCompanionObject.MIN_VALUE;
            return d.this.d(null, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.reader.readium.Readium", f = "Readium.kt", i = {0}, l = {37}, m = "retrieveFile", n = {"file"}, s = {"L$0"}, v = 1)
    static final class c extends ContinuationImpl {
        Object a;
        /* synthetic */ Object b;
        int d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.b = obj;
            this.d |= IntCompanionObject.MIN_VALUE;
            return d.this.e(null, this);
        }
    }

    public d(@k Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient((String) null, (Duration) null, (Duration) null, (DefaultHttpClient.Callback) null, 15, (DefaultConstructorMarker) null);
        this.a = defaultHttpClient;
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        AssetRetriever assetRetriever = new AssetRetriever(contentResolver, defaultHttpClient);
        this.b = assetRetriever;
        this.c = new PublicationOpener(new DefaultPublicationParser(context, defaultHttpClient, assetRetriever, (PdfDocumentFactory) null, (List) null, 16, (DefaultConstructorMarker) null), (List) null, (Function1) null, 6, (DefaultConstructorMarker) null);
    }

    @k
    public final AssetRetriever a() {
        return this.b;
    }

    @k
    public final DefaultHttpClient b() {
        return this.a;
    }

    @k
    public final PublicationOpener c() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @l
    public final Object d(@k Asset asset, @k Continuation<? super Publication> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.d;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                bVar.d = i - IntCompanionObject.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object objOpen$default = bVar2.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar2.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOpen$default);
            PublicationOpener publicationOpener = this.c;
            bVar2.a = SpillingKt.nullOutSpilledVariable(asset);
            bVar2.d = 1;
            objOpen$default = PublicationOpener.open$default(publicationOpener, asset, (String) null, false, (Function1) null, (WarningLogger) null, bVar2, 26, (Object) null);
            if (objOpen$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOpen$default);
        }
        Try.Success success = (Try) objOpen$default;
        if (success instanceof Try.Success) {
            return success.getValue();
        }
        if (!(success instanceof Try.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        nd.a.c("ReadiumZReader", "ReadiumZReader->openAsset error=" + ((PublicationOpener.OpenError) ((Try.Failure) success).getValue()).getMessage());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @l
    public final Object e(@k File file, @k Continuation<? super Asset> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.d;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                cVar.d = i - IntCompanionObject.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objRetrieve = cVar.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cVar.d;
        Object value = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRetrieve);
            AssetRetriever assetRetriever = this.b;
            FormatHints formatHints = new FormatHints((List) null, (List) null, 3, (DefaultConstructorMarker) null);
            cVar.a = SpillingKt.nullOutSpilledVariable(file);
            cVar.d = 1;
            objRetrieve = assetRetriever.retrieve(file, formatHints, cVar);
            if (objRetrieve == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRetrieve);
        }
        Try.Success success = (Try) objRetrieve;
        if (success instanceof Try.Success) {
            value = success.getValue();
        } else {
            if (!(success instanceof Try.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            nd.a.c("ReadiumZReader", "ReadiumZReader->retrieveFile error=" + ((AssetRetriever.RetrieveError) ((Try.Failure) success).getValue()).getMessage());
        }
        return (Asset) value;
    }
}
