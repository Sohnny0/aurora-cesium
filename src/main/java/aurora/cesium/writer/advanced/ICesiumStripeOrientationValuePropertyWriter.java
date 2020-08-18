package aurora.cesium.writer.advanced;


import aurora.cesium.writer.CesiumStripeOrientation;

import javax.annotation.Nonnull;

/**
 * A writer that can write a value as a stripe orientation.
 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public interface ICesiumStripeOrientationValuePropertyWriter extends ICesiumPropertyWriter {
    /**
    * Writes the value as a stripe orientation.
    * @param value The orientation.
    */
    void writeStripeOrientation(@Nonnull CesiumStripeOrientation value);
}
