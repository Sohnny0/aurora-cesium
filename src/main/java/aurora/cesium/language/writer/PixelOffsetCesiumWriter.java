package aurora.cesium.language.writer;


import aurora.agi.foundation.compatibility.Func1;
import aurora.agi.foundation.compatibility.Lazy;
import aurora.cesium.language.writer.advanced.*;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * Writes a {@code PixelOffset} to a {@link CesiumOutputStream}. A {@code PixelOffset} is a pixel offset in viewport coordinates. A pixel offset is the number of pixels up and to the right to place an element relative to an origin.
 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public class PixelOffsetCesiumWriter extends CesiumInterpolatablePropertyWriter<PixelOffsetCesiumWriter> implements ICesiumDeletablePropertyWriter, ICesiumCartesian2ValuePropertyWriter,
        ICesiumReferenceValuePropertyWriter {
    /**
    * The name of the {@code cartesian2} property.
    */
    public static final String Cartesian2PropertyName = "cartesian2";
    /**
    * The name of the {@code reference} property.
    */
    public static final String ReferencePropertyName = "reference";
    /**
    * The name of the {@code delete} property.
    */
    public static final String DeletePropertyName = "delete";
    private Lazy<CesiumCartesian2ValuePropertyAdaptor<PixelOffsetCesiumWriter>> m_asCartesian2;
    private Lazy<CesiumReferenceValuePropertyAdaptor<PixelOffsetCesiumWriter>> m_asReference;

    /**
    * Initializes a new instance.
    * @param propertyName The name of the property.
    */
    public PixelOffsetCesiumWriter(@Nonnull String propertyName) {
        super(propertyName);
        m_asCartesian2 = createAsCartesian2();
        m_asReference = createAsReference();
    }

    /**
    * Initializes a new instance as a copy of an existing instance.
    * @param existingInstance The existing instance to copy.
    */
    protected PixelOffsetCesiumWriter(@Nonnull PixelOffsetCesiumWriter existingInstance) {
        super(existingInstance);
        m_asCartesian2 = createAsCartesian2();
        m_asReference = createAsReference();
    }

    /**
    * Copies this instance and returns the copy.
    * @return The copy.
    */
    @Override
    public PixelOffsetCesiumWriter clone() {
        return new PixelOffsetCesiumWriter(this);
    }

    /**
    * Writes the value expressed as a {@code cartesian2}, which is the pixel offset specified as a two-dimensional Cartesian value {@code [X, Y]}, in viewport coordinates in pixels, where X is pixels to the right and Y is pixels up.
    * @param value The value.
    */
    public final void writeCartesian2(@Nonnull Rectangular value) {
        final String PropertyName = Cartesian2PropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeCartesian2(getOutput(), value);
    }

    /**
    * Writes the value expressed as a {@code cartesian2}, which is the pixel offset specified as a two-dimensional Cartesian value {@code [X, Y]}, in viewport coordinates in pixels, where X is pixels to the right and Y is pixels up.
    * @param x The X component.
    * @param y The Y component.
    */
    public final void writeCartesian2(double x, double y) {
        writeCartesian2(new Rectangular(x, y));
    }

    /**
    * Writes the value expressed as a {@code cartesian2}, which is the pixel offset specified as a two-dimensional Cartesian value {@code [X, Y]}, in viewport coordinates in pixels, where X is pixels to the right and Y is pixels up.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeCartesian2(List<JulianDate> dates, List<Rectangular> values) {
        writeCartesian2(dates, values, 0, dates.size());
    }

    /**
    * Writes the value expressed as a {@code cartesian2}, which is the pixel offset specified as a two-dimensional Cartesian value {@code [X, Y]}, in viewport coordinates in pixels, where X is pixels to the right and Y is pixels up.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeCartesian2(List<JulianDate> dates, List<Rectangular> values, int startIndex, int length) {
        final String PropertyName = Cartesian2PropertyName;
        openIntervalIfNecessary();
        CesiumWritingHelper.writeCartesian2(getOutput(), PropertyName, dates, values, startIndex, length);
    }

    /**
    * Writes the value expressed as a {@code reference}, which is the pixel offset specified as a reference to another property.
    * @param value The reference.
    */
    public final void writeReference(Reference value) {
        final String PropertyName = ReferencePropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeReference(getOutput(), value);
    }

    /**
    * Writes the value expressed as a {@code reference}, which is the pixel offset specified as a reference to another property.
    * @param value The reference.
    */
    public final void writeReference(String value) {
        final String PropertyName = ReferencePropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeReference(getOutput(), value);
    }

    /**
    * Writes the value expressed as a {@code reference}, which is the pixel offset specified as a reference to another property.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeReference(String identifier, String propertyName) {
        final String PropertyName = ReferencePropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeReference(getOutput(), identifier, propertyName);
    }

    /**
    * Writes the value expressed as a {@code reference}, which is the pixel offset specified as a reference to another property.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeReference(String identifier, String[] propertyNames) {
        final String PropertyName = ReferencePropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeReference(getOutput(), identifier, propertyNames);
    }

    /**
    * Writes the value expressed as a {@code delete}, which is whether the client should delete existing samples or interval data for this property. Data will be deleted for the containing interval, or if there is no containing interval, then all data. If true, all other properties in this property will be ignored.
    * @param value The value.
    */
    public final void writeDelete(boolean value) {
        final String PropertyName = DeletePropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        getOutput().writeValue(value);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumCartesian2ValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumCartesian2ValuePropertyAdaptor<PixelOffsetCesiumWriter> asCartesian2() {
        return m_asCartesian2.getValue();
    }

    private final Lazy<CesiumCartesian2ValuePropertyAdaptor<PixelOffsetCesiumWriter>> createAsCartesian2() {
        return new Lazy<CesiumCartesian2ValuePropertyAdaptor<PixelOffsetCesiumWriter>>(
                new Func1<CesiumCartesian2ValuePropertyAdaptor<PixelOffsetCesiumWriter>>(this, "createCartesian2") {
                    public CesiumCartesian2ValuePropertyAdaptor<PixelOffsetCesiumWriter> invoke() {
                        return createCartesian2();
                    }
                }, false);
    }

    private final CesiumCartesian2ValuePropertyAdaptor<PixelOffsetCesiumWriter> createCartesian2() {
        return CesiumValuePropertyAdaptors.<PixelOffsetCesiumWriter> createCartesian2(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumReferenceValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumReferenceValuePropertyAdaptor<PixelOffsetCesiumWriter> asReference() {
        return m_asReference.getValue();
    }

    private final Lazy<CesiumReferenceValuePropertyAdaptor<PixelOffsetCesiumWriter>> createAsReference() {
        return new Lazy<CesiumReferenceValuePropertyAdaptor<PixelOffsetCesiumWriter>>(
                new Func1<CesiumReferenceValuePropertyAdaptor<PixelOffsetCesiumWriter>>(this, "createReference") {
                    public CesiumReferenceValuePropertyAdaptor<PixelOffsetCesiumWriter> invoke() {
                        return createReference();
                    }
                }, false);
    }

    private final CesiumReferenceValuePropertyAdaptor<PixelOffsetCesiumWriter> createReference() {
        return CesiumValuePropertyAdaptors.<PixelOffsetCesiumWriter> createReference(this);
    }
}