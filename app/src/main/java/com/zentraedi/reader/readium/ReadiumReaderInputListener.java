package com.zentraedi.reader.readium;

import fo.k;
import fo.l;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import org.readium.r2.navigator.OverflowableNavigator;
import org.readium.r2.navigator.input.DragEvent;
import org.readium.r2.navigator.input.InputListener;
import org.readium.r2.navigator.input.Key;
import org.readium.r2.navigator.input.KeyEvent;
import org.readium.r2.navigator.input.TapEvent;
import org.readium.r2.navigator.preferences.ReadingProgression;
import org.readium.r2.shared.ExperimentalReadiumApi;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
@ExperimentalReadiumApi
public final class ReadiumReaderInputListener implements InputListener {

    @k
    private final OverflowableNavigator a;

    @k
    private final Set<TapEdge> b;
    private final boolean c;
    private final double d;

    @l
    private final Double e;
    private final double f;

    @l
    private final Double g;
    private final boolean h;
    private boolean i;

    public enum TapEdge {
        Horizontal,
        Vertical;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @k
        public static EnumEntries<TapEdge> getEntries() {
            return $ENTRIES;
        }
    }

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadingProgression.values().length];
            try {
                iArr[ReadingProgression.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadingProgression.RTL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReadiumReaderInputListener(@k OverflowableNavigator navigator, @k Set<? extends TapEdge> tapEdges, boolean z, double d, @l Double d2, double d3, @l Double d4, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(tapEdges, "tapEdges");
        this.a = navigator;
        this.b = tapEdges;
        this.c = z;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = z2;
        this.i = z3;
    }

    private final boolean b(OverflowableNavigator overflowableNavigator, boolean z) {
        int i = a.$EnumSwitchMapping$0[((OverflowableNavigator.Overflow) overflowableNavigator.getOverflow().getValue()).getReadingProgression().ordinal()];
        if (i == 1) {
            return this.i ? overflowableNavigator.goForward(z) : overflowableNavigator.goBackward(z);
        }
        if (i == 2) {
            return overflowableNavigator.goForward(z);
        }
        throw new NoWhenBranchMatchedException();
    }

    static /* synthetic */ boolean c(ReadiumReaderInputListener readiumReaderInputListener, OverflowableNavigator overflowableNavigator, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return readiumReaderInputListener.b(overflowableNavigator, z);
    }

    private final boolean d(OverflowableNavigator overflowableNavigator, boolean z) {
        int i = a.$EnumSwitchMapping$0[((OverflowableNavigator.Overflow) overflowableNavigator.getOverflow().getValue()).getReadingProgression().ordinal()];
        if (i == 1) {
            return overflowableNavigator.goForward(z);
        }
        if (i == 2) {
            return overflowableNavigator.goBackward(z);
        }
        throw new NoWhenBranchMatchedException();
    }

    static /* synthetic */ boolean e(ReadiumReaderInputListener readiumReaderInputListener, OverflowableNavigator overflowableNavigator, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return readiumReaderInputListener.d(overflowableNavigator, z);
    }

    public final boolean a() {
        return this.i;
    }

    public final void f(boolean z) {
        this.i = z;
    }

    public /* bridge */ boolean onDrag(@k DragEvent dragEvent) {
        return InputListener.DefaultImpls.onDrag(this, dragEvent);
    }

    public boolean onKey(@k KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getType() != KeyEvent.Type.Down || !event.getModifiers().isEmpty()) {
            return false;
        }
        String str = event.getKey-_1iCzBc();
        Key.Companion companion = Key.Companion;
        if (Key.equals-impl0(str, companion.getArrowUp-_1iCzBc())) {
            return this.a.goBackward(this.h);
        }
        if (Key.equals-impl0(str, companion.getArrowDown-_1iCzBc()) || Key.equals-impl0(str, companion.getSpace-_1iCzBc())) {
            return this.a.goForward(this.h);
        }
        if (Key.equals-impl0(str, companion.getArrowLeft-_1iCzBc())) {
            return b(this.a, this.h);
        }
        if (Key.equals-impl0(str, companion.getArrowRight-_1iCzBc())) {
            return d(this.a, this.h);
        }
        return false;
    }

    public boolean onTap(@k TapEvent event) {
        double dMax;
        double dMax2;
        Intrinsics.checkNotNullParameter(event, "event");
        if (((OverflowableNavigator.Overflow) this.a.getOverflow().getValue()).getScroll() && !this.c) {
            return false;
        }
        if (this.b.contains(TapEdge.Horizontal)) {
            double width = this.a.getPublicationView().getWidth();
            Double d = this.e;
            if (d != null) {
                dMax2 = Math.max(this.d, d.doubleValue() * width);
            } else {
                dMax2 = this.d;
            }
            ClosedFloatingPointRange<Double> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0d, dMax2);
            if (RangesKt.doubleRangeContains(RangesKt.rangeTo(width - dMax2, width), event.getPoint().x)) {
                return d(this.a, this.h);
            }
            if (RangesKt.doubleRangeContains(closedFloatingPointRangeRangeTo, event.getPoint().x)) {
                return b(this.a, this.h);
            }
        }
        if (this.b.contains(TapEdge.Vertical)) {
            double height = this.a.getPublicationView().getHeight();
            Double d2 = this.g;
            if (d2 != null) {
                dMax = Math.max(this.f, d2.doubleValue() * height);
            } else {
                dMax = this.f;
            }
            ClosedFloatingPointRange<Double> closedFloatingPointRangeRangeTo2 = RangesKt.rangeTo(0.0d, dMax);
            if (RangesKt.doubleRangeContains(RangesKt.rangeTo(height - dMax, height), event.getPoint().y)) {
                return this.a.goForward(this.h);
            }
            if (RangesKt.doubleRangeContains(closedFloatingPointRangeRangeTo2, event.getPoint().y)) {
                return this.a.goBackward(this.h);
            }
        }
        return false;
    }

    public /* synthetic */ ReadiumReaderInputListener(OverflowableNavigator overflowableNavigator, Set set, boolean z, double d, Double d2, double d3, Double d4, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(overflowableNavigator, (i & 2) != 0 ? SetsKt.setOf(TapEdge.Horizontal) : set, (i & 4) != 0 ? false : z, (i & 8) != 0 ? 80.0d : d, (i & 16) != 0 ? Double.valueOf(0.3d) : d2, (i & 32) == 0 ? d3 : 80.0d, (i & 64) != 0 ? Double.valueOf(0.3d) : d4, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3);
    }
}
