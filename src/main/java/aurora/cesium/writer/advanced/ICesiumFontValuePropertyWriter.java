package aurora.cesium.writer.advanced;


/**
 * A writer that can write a value as a CSS font.
 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public interface ICesiumFontValuePropertyWriter extends ICesiumPropertyWriter {
    /**
    * Writes the value expressed as a CSS font.
    * @param font The font.
    */
    void writeFont(String font);
}
