package aurora.cesium.language.writer.advanced;


import aurora.cesium.language.writer.Cartographic;

/**
 * A writer that can write a value as a list of Cartographic WGS84 coordinates, where Longitude and Latitude are in degrees and Height is in meters.
 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public interface ICesiumCartographicDegreesListValuePropertyWriter extends ICesiumPropertyWriter {
    /**
    * Writes the value expressed as a list of Cartographic WGS84 coordinates, where Longitude and Latitude are in degrees and Height is in meters.
    * @param values The values.
    */
    void writeCartographicDegrees(Iterable<Cartographic> values);
}