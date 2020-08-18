package aurora.cesium.agi.foundation.compatibility;

import aurora.cesium.agi.foundation.compatibility.annotations.Internal;

import javax.annotation.Nullable;
import java.util.Locale;

/**
 * Helper methods related to Doubles.
 *
 * @deprecated Internal use only.
 */
@Internal
@Deprecated
public final class DoubleHelper {
    private DoubleHelper() {}

    /**
     * Returns a value indicating whether the specified number evaluates to positive
     * infinity.
     *
     * @param d
     *            A double-precision floating-point number.
     *
     * @return true if d evaluates to PositiveInfinity; otherwise, false.
     */
    public static boolean isPositiveInfinity(double d) {
        return d == Double.POSITIVE_INFINITY;
    }

    /**
     * Returns a value indicating whether the specified number evaluates to negative
     * infinity.
     *
     * @param d
     *            A double-precision floating-point number.
     *
     * @return true if d evaluates to NegativeInfinity; otherwise, false.
     */
    public static boolean isNegativeInfinity(double d) {
        return d == Double.NEGATIVE_INFINITY;
    }

    /**
     * Converts the numeric value of a double to its equivalent string representation
     * using the specified culture-specific format information.
     *
     * @param value
     *            The value to convert.
     * @param locale
     *            An object that supplies culture-specific formatting information.
     * @return The string representation of value as specified by locale.
     */
    public static String toString(double value, @Nullable Locale locale) {
        return toString(value, null, locale);
    }

    /**
     * Converts the numeric value of a double to its equivalent string representation
     * using the specified format and culture-specific format information.
     *
     * @param value
     *            The value to convert.
     * @param format
     *            A numeric format string.
     * @param locale
     *            An object that supplies culture-specific formatting information.
     * @return The string representation of value as specified by format and locale.
     */
    public static String toString(double value, @Nullable String format, @Nullable Locale locale) {
        return FormatHelper.buildFormat(locale, format).format(value);
    }
}
