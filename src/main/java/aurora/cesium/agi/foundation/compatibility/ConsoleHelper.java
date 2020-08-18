package aurora.cesium.agi.foundation.compatibility;

import aurora.cesium.agi.foundation.compatibility.annotations.Internal;

/**
 * @deprecated Internal use only.
 */
@Internal
@Deprecated
public final class ConsoleHelper {
    private ConsoleHelper() {}

    /**
     * Writes the specified string value, followed by the current line terminator, to the
     * standard output stream.
     *
     * @param value
     *            The value to write.
     */
    public static void writeLine(String value) {
        if (value == null)
            return;
        System.out.println(value);
    }
}
