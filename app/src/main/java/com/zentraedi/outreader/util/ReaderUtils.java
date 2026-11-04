package com.zentraedi.outreader.util;

import com.zentraedi.basic.function.utils.m0;
import com.zentraedi.business.utils.t7;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class ReaderUtils {
    private static boolean b;

    @fo.k
    public static final a a = new a(null);

    @fo.k
    private static final FontSize c = FontSize.VALUE_5;

    @fo.k
    private static final EnumEntries<FontSize> d = FontSize.getEntries();

    @fo.k
    private static final PageMargin e = PageMargin.VALUE_4;

    @fo.k
    private static final EnumEntries<PageMargin> f = PageMargin.getEntries();

    @fo.k
    private static final LineSpace g = LineSpace.VALUE_3;

    @fo.k
    private static final EnumEntries<LineSpace> h = LineSpace.getEntries();

    @fo.k
    private static final ParagraphSpace i = ParagraphSpace.VALUE_3;

    @fo.k
    private static final EnumEntries<ParagraphSpace> j = ParagraphSpace.getEntries();

    public enum FontSize {
        VALUE_1(16, 0.8f),
        VALUE_2(17, 0.85f),
        VALUE_3(18, 0.9f),
        VALUE_4(19, 0.95f),
        VALUE_5(20, 1.0f),
        VALUE_6(22, 1.1f),
        VALUE_7(24, 1.2f),
        VALUE_8(27, 1.35f),
        VALUE_9(30, 1.5f),
        VALUE_10(33, 1.65f),
        VALUE_11(36, 1.8f),
        VALUE_12(40, 2.0f);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final float epubValue;
        private final int value;

        FontSize(int i, float f) {
            this.value = i;
            this.epubValue = f;
        }

        @fo.k
        public static EnumEntries<FontSize> getEntries() {
            return $ENTRIES;
        }

        public final float getEpubValue() {
            return this.epubValue;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public enum LineSpace {
        VALUE_1(0.8f, 1.2f),
        VALUE_2(1.0f, 1.4f),
        VALUE_3(1.2f, 1.6f),
        VALUE_4(1.4f, 1.8f),
        VALUE_5(1.6f, 2.0f),
        VALUE_6(1.8f, 2.2f),
        VALUE_7(2.0f, 2.4f),
        VALUE_8(2.2f, 2.6f),
        VALUE_9(2.4f, 2.8f);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final float epubValue;
        private final float value;

        LineSpace(float f, float f2) {
            this.value = f;
            this.epubValue = f2;
        }

        @fo.k
        public static EnumEntries<LineSpace> getEntries() {
            return $ENTRIES;
        }

        public final float getEpubValue() {
            return this.epubValue;
        }

        public final float getValue() {
            return this.value;
        }
    }

    public enum PageMargin {
        VALUE_1(0, 0.0f),
        VALUE_2(5, 0.4f),
        VALUE_3(10, 0.8f),
        VALUE_4(15, 1.0f),
        VALUE_5(20, 1.2f),
        VALUE_6(25, 1.4f),
        VALUE_7(30, 1.6f),
        VALUE_8(35, 1.8f),
        VALUE_9(40, 2.0f);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final float epubValue;
        private final int value;

        PageMargin(int i, float f) {
            this.value = i;
            this.epubValue = f;
        }

        @fo.k
        public static EnumEntries<PageMargin> getEntries() {
            return $ENTRIES;
        }

        public final float getEpubValue() {
            return this.epubValue;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public enum ParagraphSpace {
        VALUE_1(0.8f, 0.2f),
        VALUE_2(0.9f, 0.4f),
        VALUE_3(1.1f, 0.6f),
        VALUE_4(1.2f, 1.0f),
        VALUE_5(1.35f, 1.4f),
        VALUE_6(1.5f, 1.8f),
        VALUE_7(1.65f, 2.2f),
        VALUE_8(1.8f, 2.5f),
        VALUE_9(2.0f, 2.8f);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final float epubValue;
        private final float value;

        ParagraphSpace(float f, float f2) {
            this.value = f;
            this.epubValue = f2;
        }

        @fo.k
        public static EnumEntries<ParagraphSpace> getEntries() {
            return $ENTRIES;
        }

        public final float getEpubValue() {
            return this.epubValue;
        }

        public final float getValue() {
            return this.value;
        }
    }

    @SourceDebugExtension({"SMAP\nReaderUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReaderUtils.kt\ncom/zentraedi/outreader/util/ReaderUtils$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,455:1\n295#2,2:456\n295#2,2:458\n295#2,2:460\n295#2,2:462\n*S KotlinDebug\n*F\n+ 1 ReaderUtils.kt\ncom/zentraedi/outreader/util/ReaderUtils$Companion\n*L\n131#1:456,2\n149#1:458,2\n174#1:460,2\n201#1:462,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void A(@fo.l String str, int i) {
            t7.j(gh.b.O + str, Integer.valueOf(i));
        }

        public final void B(@fo.l String str, int i) {
            t7.j(gh.b.z, Integer.valueOf(i));
        }

        public final void C(@fo.l String str, int i) {
            t7.j(gh.b.y, Integer.valueOf(i));
        }

        public final void D(@fo.l String str, @fo.k FontSize fontSize) {
            Intrinsics.checkNotNullParameter(fontSize, "fontSize");
            t7.j(gh.b.r + str, Integer.valueOf(fontSize.getValue()));
        }

        public final void E(@fo.l String str, @fo.k String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            boolean zAreEqual = Intrinsics.areEqual(str, "txt");
            String str2 = gh.b.x;
            if (!zAreEqual) {
                str2 = gh.b.x + str;
            }
            t7.j(str2, value);
        }

        public final void F(@fo.l String str, @fo.k LineSpace lineSpace) {
            Intrinsics.checkNotNullParameter(lineSpace, "lineSpace");
            t7.j(gh.b.t + str, Float.valueOf(lineSpace.getValue()));
        }

        public final void G(boolean z) {
            t7.j(gh.b.i0, Boolean.valueOf(z));
        }

        public final void H(@fo.l String str, @fo.k PageMargin pageMargin) {
            Intrinsics.checkNotNullParameter(pageMargin, "pageMargin");
            t7.j(gh.b.s + str, Integer.valueOf(pageMargin.getValue()));
        }

        public final void I(@fo.l String str, int i) {
            t7.j(gh.b.v + str, Integer.valueOf(i));
        }

        public final void J(@fo.l String str, @fo.k ParagraphSpace paragraphSpace) {
            Intrinsics.checkNotNullParameter(paragraphSpace, "paragraphSpace");
            t7.j(gh.b.u + str, Float.valueOf(paragraphSpace.getValue()));
        }

        public final void K(boolean z) {
            t7.j(gh.b.h0, Boolean.valueOf(z));
        }

        public final void L(boolean z) {
            ReaderUtils.b = z;
        }

        public final int M(@fo.k LineSpace lineSpace) {
            Intrinsics.checkNotNullParameter(lineSpace, "lineSpace");
            return m0.b(lineSpace.getValue() * 10);
        }

        public final int N(@fo.k ParagraphSpace space) {
            Intrinsics.checkNotNullParameter(space, "space");
            return m0.b((space.getValue() - 1.0f) * 10);
        }

        public final int a(@fo.l String str) {
            Object objD = t7.d(gh.b.w + str, 1);
            Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
            return ((Number) objD).intValue();
        }

        public final int b(@fo.l String str) {
            Integer num;
            if (t7.b(gh.b.O + str)) {
                num = (Integer) t7.d(gh.b.O + str, 11);
            } else {
                num = (Integer) t7.d(gh.b.O, 11);
            }
            Intrinsics.checkNotNull(num);
            return num.intValue();
        }

        public final int c(@fo.l String str) {
            Object objD = t7.d(gh.b.z, 2);
            Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
            return ((Number) objD).intValue();
        }

        public final int d(int i) {
            switch (i) {
                case 1:
                    return androidx.core.content.e.g(com.zentraedi.basic.function.utils.a.a(), com.zentraedi.outreader.d.f.yv);
                case 2:
                    return androidx.core.content.e.g(com.zentraedi.basic.function.utils.a.a(), com.zentraedi.outreader.d.f.zv);
                case 3:
                    return androidx.core.content.e.g(com.zentraedi.basic.function.utils.a.a(), com.zentraedi.outreader.d.f.vv);
                case 4:
                    return androidx.core.content.e.g(com.zentraedi.basic.function.utils.a.a(), com.zentraedi.outreader.d.f.xv);
                case 5:
                    return androidx.core.content.e.g(com.zentraedi.basic.function.utils.a.a(), com.zentraedi.outreader.d.f.wv);
                case 6:
                    return androidx.core.content.e.g(com.zentraedi.basic.function.utils.a.a(), com.zentraedi.outreader.d.f.uv);
                default:
                    return androidx.core.content.e.g(com.zentraedi.basic.function.utils.a.a(), com.zentraedi.outreader.d.f.yv);
            }
        }

        public final int e(@fo.l String str) {
            Object objD = t7.d(gh.b.y, 1);
            Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
            return ((Number) objD).intValue();
        }

        public final int f(@fo.l String str) {
            Integer num = (Integer) t7.d(gh.b.y, 1);
            Integer num2 = (Integer) t7.d(gh.b.z, 2);
            if (num != null && num.intValue() == 1) {
                return 0;
            }
            if (num != null && num.intValue() == 2) {
                if (num2 != null && num2.intValue() == 1) {
                    return com.zentraedi.outreader.d.h.VQ;
                }
                if (num2 != null && num2.intValue() == 2) {
                    return com.zentraedi.outreader.d.h.WQ;
                }
                if (num2 != null && num2.intValue() == 3) {
                    return com.zentraedi.outreader.d.h.SQ;
                }
                if (num2 != null && num2.intValue() == 4) {
                    return com.zentraedi.outreader.d.h.UQ;
                }
                if (num2 != null && num2.intValue() == 5) {
                    return com.zentraedi.outreader.d.h.TQ;
                }
                if (num2 != null && num2.intValue() == 6) {
                    return com.zentraedi.outreader.d.h.RQ;
                }
            } else if (num != null && num.intValue() == 3) {
                if (num2 != null && num2.intValue() == 1) {
                    return com.zentraedi.outreader.d.h.dT;
                }
                if (num2 != null && num2.intValue() == 2) {
                    return com.zentraedi.outreader.d.h.eT;
                }
                if (num2 != null && num2.intValue() == 3) {
                    return com.zentraedi.outreader.d.h.aT;
                }
                if (num2 != null && num2.intValue() == 4) {
                    return com.zentraedi.outreader.d.h.cT;
                }
                if (num2 != null && num2.intValue() == 5) {
                    return com.zentraedi.outreader.d.h.bT;
                }
                if (num2 != null && num2.intValue() == 6) {
                    return com.zentraedi.outreader.d.h.ZS;
                }
            }
            return 0;
        }

        @fo.k
        public final FontSize g() {
            return ReaderUtils.c;
        }

        @fo.k
        public final FontSize h(@fo.l String str) {
            FontSize next;
            Integer num = (Integer) t7.d(gh.b.r + str, Integer.valueOf(g().getValue()));
            Iterator<FontSize> it = i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int value = next.getValue();
                if (num != null && value == num.intValue()) {
                    break;
                }
            }
            FontSize fontSize = next;
            return fontSize == null ? g() : fontSize;
        }

        @fo.k
        public final EnumEntries<FontSize> i() {
            return ReaderUtils.d;
        }

        @fo.k
        public final String j(@fo.l String str) {
            String str2 = gh.b.x;
            if (str != null && str.length() != 0 && !Intrinsics.areEqual(str, "txt")) {
                str2 = gh.b.x + str;
            }
            String str3 = (String) t7.d(str2, "NotoSansCJK-Regular.ttc");
            if (Intrinsics.areEqual("1", str3)) {
                return "NotoSansCJK-Regular.ttc";
            }
            Intrinsics.checkNotNull(str3);
            return str3;
        }

        @fo.k
        public final LineSpace k() {
            return ReaderUtils.g;
        }

        @fo.k
        public final EnumEntries<LineSpace> l() {
            return ReaderUtils.h;
        }

        @fo.k
        public final LineSpace m(@fo.l String str) {
            LineSpace next;
            Float f = (Float) t7.d(gh.b.t + str, Float.valueOf(k().getValue()));
            Iterator<LineSpace> it = l().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(next.getValue(), f));
            LineSpace lineSpace = next;
            return lineSpace == null ? k() : lineSpace;
        }

        public final boolean n() {
            Object objD = t7.d(gh.b.i0, Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
            return ((Boolean) objD).booleanValue();
        }

        public final boolean o() {
            return ReaderUtils.b;
        }

        public final boolean p(@fo.l String str) {
            return c(str) == 5;
        }

        @fo.k
        public final PageMargin q() {
            return ReaderUtils.e;
        }

        @fo.k
        public final ParagraphSpace r() {
            return ReaderUtils.i;
        }

        @fo.k
        public final PageMargin s(@fo.l String str) {
            PageMargin next;
            Integer num = (Integer) t7.d(gh.b.s + str, Integer.valueOf(q().getValue()));
            Iterator<PageMargin> it = t().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int value = next.getValue();
                if (num != null && value == num.intValue()) {
                    break;
                }
            }
            PageMargin pageMargin = next;
            return pageMargin == null ? q() : pageMargin;
        }

        @fo.k
        public final EnumEntries<PageMargin> t() {
            return ReaderUtils.f;
        }

        public final int u(@fo.l String str) {
            Integer num;
            if (t7.b(gh.b.v + str)) {
                num = (Integer) t7.d(gh.b.v + str, 1);
            } else {
                num = (Integer) t7.d(gh.b.v, 1);
            }
            Intrinsics.checkNotNull(num);
            return num.intValue();
        }

        @fo.k
        public final String v(int i) {
            if (i == 1) {
                String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.mD2);
                Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
                return strN;
            }
            if (i == 3) {
                String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Fz2);
                Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
                return strN2;
            }
            if (i == 2) {
                String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.LB2);
                Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
                return strN3;
            }
            if (i == 4) {
                String strN4 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.DA2);
                Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
                return strN4;
            }
            String strN5 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.SB2);
            Intrinsics.checkNotNullExpressionValue(strN5, "getString(...)");
            return strN5;
        }

        @fo.k
        public final EnumEntries<ParagraphSpace> w() {
            return ReaderUtils.j;
        }

        @fo.k
        public final ParagraphSpace x(@fo.l String str) {
            ParagraphSpace next;
            Float f = (Float) t7.d(gh.b.u + str, Float.valueOf(r().getValue()));
            Iterator<ParagraphSpace> it = w().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(next.getValue(), f));
            ParagraphSpace paragraphSpace = next;
            return paragraphSpace == null ? r() : paragraphSpace;
        }

        public final boolean y() {
            Object objD = t7.d(gh.b.h0, Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
            return ((Boolean) objD).booleanValue();
        }

        public final void z(@fo.l String str, int i) {
            t7.j(gh.b.w + str, Integer.valueOf(i));
        }

        private a() {
        }
    }
}
