package aurora.agi.foundation.compatibility;

import aurora.agi.foundation.compatibility.annotations.Internal;

import javax.annotation.Nullable;
import java.util.Locale;

/**
 * Helper methods related to Longs.
 *
 * @deprecated Internal use only.
 */
@Internal
@Deprecated
public final class LongHelper {
    private LongHelper() {}

    /**
     * Converts the numeric value of this instance to its equivalent string representation
     * using the specified culture-specific format information.
     *
     * @param value
     *            The value to convert.
     * @param locale
     *            An object that supplies culture-specific formatting information.
     * @return The string representation of value as specified by locale.
     */
    public static String toString(long value, @Nullable Locale locale) {
        return toString(value, null, locale);
    }

    /**
     * Converts the numeric value of an integer to its equivalent string representation
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
    public static String toString(long value, @Nullable String format, @Nullable Locale locale) {
        return FormatHelper.buildFormat(locale, format).format(value);
    }
}
