package aurora.cesium.agi.foundation.compatibility;

import aurora.cesium.agi.foundation.compatibility.annotations.Internal;

import javax.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.UncheckedIOException;

/**
 * Helper methods to safely dispose various types.
 *
 * @deprecated Internal use only.
 */
@Internal
@Deprecated
public final class DisposeHelper {
    private DisposeHelper() {}

    /**
     * Dispose the given object if not null.
     *
     * @param closeable
     *            the object to dispose.
     */
    public static void dispose(@Nullable Closeable closeable) {
        try {
            if (closeable != null)
                closeable.close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /**
     * Dispose the given object if not null.
     *
     * @param disposable
     *            the object to dispose.
     */
    public static void dispose(@Nullable IDisposable disposable) {
        if (disposable != null)
            disposable.dispose();
    }

    /**
     * Dispose the given object if not null.
     *
     * @param memoryStream
     *            the object to dispose.
     */
    public static void dispose(@Nullable MemoryStream memoryStream) {
        if (memoryStream != null)
            memoryStream.dispose();
    }
}
