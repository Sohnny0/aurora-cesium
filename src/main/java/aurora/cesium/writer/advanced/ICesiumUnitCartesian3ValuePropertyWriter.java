package aurora.cesium.writer.advanced;


import aurora.cesium.writer.JulianDate;
import aurora.cesium.writer.UnitCartesian;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * A writer that can write a value as a three-dimensional unit magnitude Cartesian.
 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public interface ICesiumUnitCartesian3ValuePropertyWriter extends ICesiumInterpolatablePropertyWriter {
    /**
    * Writes the value expressed as a three-dimensional unit magnitude Cartesian value.
    * @param value The value.
    */
    void writeUnitCartesian(@Nonnull UnitCartesian value);

    /**
    * Writes the value expressed as a three-dimensional unit magnitude Cartesian value.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    void writeUnitCartesian(List<JulianDate> dates, List<UnitCartesian> values);

    /**
    * Writes the value expressed as a three-dimensional unit magnitude Cartesian value.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    void writeUnitCartesian(List<JulianDate> dates, List<UnitCartesian> values, int startIndex, int length);
}
