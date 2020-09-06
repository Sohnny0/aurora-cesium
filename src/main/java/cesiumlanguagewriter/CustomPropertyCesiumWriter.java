package cesiumlanguagewriter;


import agi.foundation.compatibility.Func1;
import agi.foundation.compatibility.Lazy;
import cesiumlanguagewriter.advanced.*;

import javax.annotation.Nonnull;
import java.awt.*;
import java.awt.image.RenderedImage;
import java.net.URI;
import java.util.List;

/**
 * Writes a {@code CustomProperty} to a {@link CesiumOutputStream}. A {@code CustomProperty} is a custom property.
 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public class CustomPropertyCesiumWriter extends CesiumInterpolatablePropertyWriter<CustomPropertyCesiumWriter> implements ICesiumDeletablePropertyWriter, ICesiumBooleanValuePropertyWriter,
        ICesiumBoundingRectangleValuePropertyWriter, ICesiumCartesian3ValuePropertyWriter, ICesiumCartographicDegreesValuePropertyWriter, ICesiumCartographicRadiansValuePropertyWriter,
        ICesiumCartesian2ValuePropertyWriter, ICesiumUnitCartesian3ValuePropertyWriter, ICesiumSphericalValuePropertyWriter, ICesiumUnitSphericalValuePropertyWriter, ICesiumRgbaValuePropertyWriter,
        ICesiumRgbafValuePropertyWriter, ICesiumColorBlendModeValuePropertyWriter, ICesiumCornerTypeValuePropertyWriter, ICesiumHeightReferenceValuePropertyWriter,
        ICesiumHorizontalOriginValuePropertyWriter, ICesiumLabelStyleValuePropertyWriter, ICesiumDoubleValuePropertyWriter, ICesiumNearFarScalarValuePropertyWriter,
        ICesiumUnitQuaternionValuePropertyWriter, ICesiumShadowModeValuePropertyWriter, ICesiumStringValuePropertyWriter, ICesiumStripeOrientationValuePropertyWriter,
        ICesiumCartographicRectangleRadiansValuePropertyWriter, ICesiumCartographicRectangleDegreesValuePropertyWriter, ICesiumUriValuePropertyWriter, ICesiumVerticalOriginValuePropertyWriter {
    /**
    * The name of the {@code boolean} property.
    */
    public static final String BooleanPropertyName = "boolean";
    /**
    * The name of the {@code boundingRectangle} property.
    */
    public static final String BoundingRectanglePropertyName = "boundingRectangle";
    /**
    * The name of the {@code cartesian} property.
    */
    public static final String CartesianPropertyName = "cartesian";
    /**
    * The name of the {@code cartographicRadians} property.
    */
    public static final String CartographicRadiansPropertyName = "cartographicRadians";
    /**
    * The name of the {@code cartographicDegrees} property.
    */
    public static final String CartographicDegreesPropertyName = "cartographicDegrees";
    /**
    * The name of the {@code cartesian2} property.
    */
    public static final String Cartesian2PropertyName = "cartesian2";
    /**
    * The name of the {@code unitCartesian} property.
    */
    public static final String UnitCartesianPropertyName = "unitCartesian";
    /**
    * The name of the {@code spherical} property.
    */
    public static final String SphericalPropertyName = "spherical";
    /**
    * The name of the {@code unitSpherical} property.
    */
    public static final String UnitSphericalPropertyName = "unitSpherical";
    /**
    * The name of the {@code rgba} property.
    */
    public static final String RgbaPropertyName = "rgba";
    /**
    * The name of the {@code rgbaf} property.
    */
    public static final String RgbafPropertyName = "rgbaf";
    /**
    * The name of the {@code colorBlendMode} property.
    */
    public static final String ColorBlendModePropertyName = "colorBlendMode";
    /**
    * The name of the {@code cornerType} property.
    */
    public static final String CornerTypePropertyName = "cornerType";
    /**
    * The name of the {@code heightReference} property.
    */
    public static final String HeightReferencePropertyName = "heightReference";
    /**
    * The name of the {@code horizontalOrigin} property.
    */
    public static final String HorizontalOriginPropertyName = "horizontalOrigin";
    /**
    * The name of the {@code labelStyle} property.
    */
    public static final String LabelStylePropertyName = "labelStyle";
    /**
    * The name of the {@code number} property.
    */
    public static final String NumberPropertyName = "number";
    /**
    * The name of the {@code nearFarScalar} property.
    */
    public static final String NearFarScalarPropertyName = "nearFarScalar";
    /**
    * The name of the {@code unitQuaternion} property.
    */
    public static final String UnitQuaternionPropertyName = "unitQuaternion";
    /**
    * The name of the {@code shadowMode} property.
    */
    public static final String ShadowModePropertyName = "shadowMode";
    /**
    * The name of the {@code string} property.
    */
    public static final String StringPropertyName = "string";
    /**
    * The name of the {@code stripeOrientation} property.
    */
    public static final String StripeOrientationPropertyName = "stripeOrientation";
    /**
    * The name of the {@code wsen} property.
    */
    public static final String WsenPropertyName = "wsen";
    /**
    * The name of the {@code wsenDegrees} property.
    */
    public static final String WsenDegreesPropertyName = "wsenDegrees";
    /**
    * The name of the {@code uri} property.
    */
    public static final String UriPropertyName = "uri";
    /**
    * The name of the {@code verticalOrigin} property.
    */
    public static final String VerticalOriginPropertyName = "verticalOrigin";
    /**
    * The name of the {@code delete} property.
    */
    public static final String DeletePropertyName = "delete";
    private Lazy<CesiumBooleanValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asBoolean;
    private Lazy<CesiumBoundingRectangleValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asBoundingRectangle;
    private Lazy<CesiumCartesian3ValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asCartesian;
    private Lazy<CesiumCartographicRadiansValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asCartographicRadians;
    private Lazy<CesiumCartographicDegreesValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asCartographicDegrees;
    private Lazy<CesiumCartesian2ValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asCartesian2;
    private Lazy<CesiumUnitCartesian3ValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asUnitCartesian;
    private Lazy<CesiumSphericalValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asSpherical;
    private Lazy<CesiumUnitSphericalValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asUnitSpherical;
    private Lazy<CesiumRgbaValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asRgba;
    private Lazy<CesiumRgbafValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asRgbaf;
    private Lazy<CesiumColorBlendModeValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asColorBlendMode;
    private Lazy<CesiumCornerTypeValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asCornerType;
    private Lazy<CesiumHeightReferenceValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asHeightReference;
    private Lazy<CesiumHorizontalOriginValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asHorizontalOrigin;
    private Lazy<CesiumLabelStyleValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asLabelStyle;
    private Lazy<CesiumDoubleValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asNumber;
    private Lazy<CesiumNearFarScalarValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asNearFarScalar;
    private Lazy<CesiumUnitQuaternionValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asUnitQuaternion;
    private Lazy<CesiumShadowModeValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asShadowMode;
    private Lazy<CesiumStringValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asString;
    private Lazy<CesiumStripeOrientationValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asStripeOrientation;
    private Lazy<CesiumCartographicRectangleRadiansValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asWsen;
    private Lazy<CesiumCartographicRectangleDegreesValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asWsenDegrees;
    private Lazy<CesiumUriValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asUri;
    private Lazy<CesiumVerticalOriginValuePropertyAdaptor<CustomPropertyCesiumWriter>> m_asVerticalOrigin;

    /**
    * Initializes a new instance.
    * @param propertyName The name of the property.
    */
    public CustomPropertyCesiumWriter(@Nonnull String propertyName) {
        super(propertyName);
        m_asBoolean = createAsBoolean();
        m_asBoundingRectangle = createAsBoundingRectangle();
        m_asCartesian = createAsCartesian();
        m_asCartographicRadians = createAsCartographicRadians();
        m_asCartographicDegrees = createAsCartographicDegrees();
        m_asCartesian2 = createAsCartesian2();
        m_asUnitCartesian = createAsUnitCartesian();
        m_asSpherical = createAsSpherical();
        m_asUnitSpherical = createAsUnitSpherical();
        m_asRgba = createAsRgba();
        m_asRgbaf = createAsRgbaf();
        m_asColorBlendMode = createAsColorBlendMode();
        m_asCornerType = createAsCornerType();
        m_asHeightReference = createAsHeightReference();
        m_asHorizontalOrigin = createAsHorizontalOrigin();
        m_asLabelStyle = createAsLabelStyle();
        m_asNumber = createAsNumber();
        m_asNearFarScalar = createAsNearFarScalar();
        m_asUnitQuaternion = createAsUnitQuaternion();
        m_asShadowMode = createAsShadowMode();
        m_asString = createAsString();
        m_asStripeOrientation = createAsStripeOrientation();
        m_asWsen = createAsWsen();
        m_asWsenDegrees = createAsWsenDegrees();
        m_asUri = createAsUri();
        m_asVerticalOrigin = createAsVerticalOrigin();
    }

    /**
    * Initializes a new instance as a copy of an existing instance.
    * @param existingInstance The existing instance to copy.
    */
    protected CustomPropertyCesiumWriter(@Nonnull CustomPropertyCesiumWriter existingInstance) {
        super(existingInstance);
        m_asBoolean = createAsBoolean();
        m_asBoundingRectangle = createAsBoundingRectangle();
        m_asCartesian = createAsCartesian();
        m_asCartographicRadians = createAsCartographicRadians();
        m_asCartographicDegrees = createAsCartographicDegrees();
        m_asCartesian2 = createAsCartesian2();
        m_asUnitCartesian = createAsUnitCartesian();
        m_asSpherical = createAsSpherical();
        m_asUnitSpherical = createAsUnitSpherical();
        m_asRgba = createAsRgba();
        m_asRgbaf = createAsRgbaf();
        m_asColorBlendMode = createAsColorBlendMode();
        m_asCornerType = createAsCornerType();
        m_asHeightReference = createAsHeightReference();
        m_asHorizontalOrigin = createAsHorizontalOrigin();
        m_asLabelStyle = createAsLabelStyle();
        m_asNumber = createAsNumber();
        m_asNearFarScalar = createAsNearFarScalar();
        m_asUnitQuaternion = createAsUnitQuaternion();
        m_asShadowMode = createAsShadowMode();
        m_asString = createAsString();
        m_asStripeOrientation = createAsStripeOrientation();
        m_asWsen = createAsWsen();
        m_asWsenDegrees = createAsWsenDegrees();
        m_asUri = createAsUri();
        m_asVerticalOrigin = createAsVerticalOrigin();
    }

    /**
    * Copies this instance and returns the copy.
    * @return The copy.
    */
    @Override
    public CustomPropertyCesiumWriter clone() {
        return new CustomPropertyCesiumWriter(this);
    }

    /**
    * Writes the value expressed as a {@code boolean}, which is the property specified as a boolean value.
    * @param value The value.
    */
    public final void writeBoolean(boolean value) {
        final String PropertyName = BooleanPropertyName;
        if (getForceInterval()) {
            openIntervalIfNecessary();
        }
        if (getIsInterval()) {
            getOutput().writePropertyName(PropertyName);
        }
        getOutput().writeValue(value);
    }

    /**
    * Writes the value expressed as a {@code boundingRectangle}, which is the property specified as {@code [X, Y, Width, Height]}.
    * @param value The value.
    */
    public final void writeBoundingRectangle(@Nonnull BoundingRectangle value) {
        final String PropertyName = BoundingRectanglePropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeBoundingRectangle(getOutput(), value);
    }

    /**
    * Writes the value expressed as a {@code boundingRectangle}, which is the property specified as {@code [X, Y, Width, Height]}.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeBoundingRectangle(List<JulianDate> dates, List<BoundingRectangle> values) {
        writeBoundingRectangle(dates, values, 0, dates.size());
    }

    /**
    * Writes the value expressed as a {@code boundingRectangle}, which is the property specified as {@code [X, Y, Width, Height]}.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeBoundingRectangle(List<JulianDate> dates, List<BoundingRectangle> values, int startIndex, int length) {
        final String PropertyName = BoundingRectanglePropertyName;
        openIntervalIfNecessary();
        CesiumWritingHelper.writeBoundingRectangle(getOutput(), PropertyName, dates, values, startIndex, length);
    }

    /**
    * Writes the value expressed as a {@code cartesian}, which is the property specified as a three-dimensional Cartesian value {@code [X, Y, Z]}.
    * @param value The value.
    */
    public final void writeCartesian(@Nonnull Cartesian value) {
        final String PropertyName = CartesianPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeCartesian3(getOutput(), value);
    }

    /**
    * Writes the value expressed as a {@code cartesian}, which is the property specified as a three-dimensional Cartesian value {@code [X, Y, Z]}.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeCartesian(List<JulianDate> dates, List<Cartesian> values) {
        writeCartesian(dates, values, 0, dates.size());
    }

    /**
    * Writes the value expressed as a {@code cartesian}, which is the property specified as a three-dimensional Cartesian value {@code [X, Y, Z]}.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeCartesian(List<JulianDate> dates, List<Cartesian> values, int startIndex, int length) {
        final String PropertyName = CartesianPropertyName;
        openIntervalIfNecessary();
        CesiumWritingHelper.writeCartesian3(getOutput(), PropertyName, dates, values, startIndex, length);
    }

    /**
    * Writes the value expressed as a {@code cartographicRadians}, which is the property specified in Cartographic WGS84 coordinates, {@code [Longitude, Latitude, Height]}, where Longitude and Latitude are in radians and Height is in meters.
    * @param value The interval.
    */
    public final void writeCartographicRadians(@Nonnull Cartographic value) {
        final String PropertyName = CartographicRadiansPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeCartographic(getOutput(), value);
    }

    /**
    * Writes the value expressed as a {@code cartographicRadians}, which is the property specified in Cartographic WGS84 coordinates, {@code [Longitude, Latitude, Height]}, where Longitude and Latitude are in radians and Height is in meters.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeCartographicRadians(List<JulianDate> dates, List<Cartographic> values) {
        writeCartographicRadians(dates, values, 0, dates.size());
    }

    /**
    * Writes the value expressed as a {@code cartographicRadians}, which is the property specified in Cartographic WGS84 coordinates, {@code [Longitude, Latitude, Height]}, where Longitude and Latitude are in radians and Height is in meters.
    * @param dates The dates at which the value is specified.
    * @param values The position corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeCartographicRadians(List<JulianDate> dates, List<Cartographic> values, int startIndex, int length) {
        final String PropertyName = CartographicRadiansPropertyName;
        openIntervalIfNecessary();
        CesiumWritingHelper.writeCartographic(getOutput(), PropertyName, dates, values, startIndex, length);
    }

    /**
    * Writes the value expressed as a {@code cartographicDegrees}, which is the property specified in Cartographic WGS84 coordinates, {@code [Longitude, Latitude, Height]}, where Longitude and Latitude are in degrees and Height is in meters.
    * @param value The interval.
    */
    public final void writeCartographicDegrees(@Nonnull Cartographic value) {
        final String PropertyName = CartographicDegreesPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeCartographic(getOutput(), value);
    }

    /**
    * Writes the value expressed as a {@code cartographicDegrees}, which is the property specified in Cartographic WGS84 coordinates, {@code [Longitude, Latitude, Height]}, where Longitude and Latitude are in degrees and Height is in meters.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeCartographicDegrees(List<JulianDate> dates, List<Cartographic> values) {
        writeCartographicDegrees(dates, values, 0, dates.size());
    }

    /**
    * Writes the value expressed as a {@code cartographicDegrees}, which is the property specified in Cartographic WGS84 coordinates, {@code [Longitude, Latitude, Height]}, where Longitude and Latitude are in degrees and Height is in meters.
    * @param dates The dates at which the value is specified.
    * @param values The position corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeCartographicDegrees(List<JulianDate> dates, List<Cartographic> values, int startIndex, int length) {
        final String PropertyName = CartographicDegreesPropertyName;
        openIntervalIfNecessary();
        CesiumWritingHelper.writeCartographic(getOutput(), PropertyName, dates, values, startIndex, length);
    }

    /**
    * Writes the value expressed as a {@code cartesian2}, which is the property specified as a two-dimensional Cartesian value {@code [X, Y]}.
    * @param value The value.
    */
    public final void writeCartesian2(@Nonnull Rectangular value) {
        final String PropertyName = Cartesian2PropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeCartesian2(getOutput(), value);
    }

    /**
    * Writes the value expressed as a {@code cartesian2}, which is the property specified as a two-dimensional Cartesian value {@code [X, Y]}.
    * @param x The X component.
    * @param y The Y component.
    */
    public final void writeCartesian2(double x, double y) {
        writeCartesian2(new Rectangular(x, y));
    }

    /**
    * Writes the value expressed as a {@code cartesian2}, which is the property specified as a two-dimensional Cartesian value {@code [X, Y]}.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeCartesian2(List<JulianDate> dates, List<Rectangular> values) {
        writeCartesian2(dates, values, 0, dates.size());
    }

    /**
    * Writes the value expressed as a {@code cartesian2}, which is the property specified as a two-dimensional Cartesian value {@code [X, Y]}.
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
    * Writes the value expressed as a {@code unitCartesian}, which is the property specified as a three-dimensional unit magnitude Cartesian value {@code [X, Y, Z]}.
    * @param value The value.
    */
    public final void writeUnitCartesian(@Nonnull UnitCartesian value) {
        final String PropertyName = UnitCartesianPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeUnitCartesian3(getOutput(), value);
    }

    /**
    * Writes the value expressed as a {@code unitCartesian}, which is the property specified as a three-dimensional unit magnitude Cartesian value {@code [X, Y, Z]}.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeUnitCartesian(List<JulianDate> dates, List<UnitCartesian> values) {
        writeUnitCartesian(dates, values, 0, dates.size());
    }

    /**
    * Writes the value expressed as a {@code unitCartesian}, which is the property specified as a three-dimensional unit magnitude Cartesian value {@code [X, Y, Z]}.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeUnitCartesian(List<JulianDate> dates, List<UnitCartesian> values, int startIndex, int length) {
        final String PropertyName = UnitCartesianPropertyName;
        openIntervalIfNecessary();
        CesiumWritingHelper.writeUnitCartesian3(getOutput(), PropertyName, dates, values, startIndex, length);
    }

    /**
    * Writes the value expressed as a {@code spherical}, which is the property specified as a spherical value {@code [Clock, Cone, Magnitude]}. The clock angle is measured in the XY plane from the positive X axis toward the positive Y axis. The cone angle is the angle from the positive Z axis toward the negative Z axis.
    * @param value The value.
    */
    public final void writeSpherical(@Nonnull Spherical value) {
        final String PropertyName = SphericalPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeSpherical(getOutput(), value);
    }

    /**
    * Writes the value expressed as a {@code spherical}, which is the property specified as a spherical value {@code [Clock, Cone, Magnitude]}. The clock angle is measured in the XY plane from the positive X axis toward the positive Y axis. The cone angle is the angle from the positive Z axis toward the negative Z axis.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeSpherical(List<JulianDate> dates, List<Spherical> values) {
        writeSpherical(dates, values, 0, dates.size());
    }

    /**
    * Writes the value expressed as a {@code spherical}, which is the property specified as a spherical value {@code [Clock, Cone, Magnitude]}. The clock angle is measured in the XY plane from the positive X axis toward the positive Y axis. The cone angle is the angle from the positive Z axis toward the negative Z axis.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeSpherical(List<JulianDate> dates, List<Spherical> values, int startIndex, int length) {
        final String PropertyName = SphericalPropertyName;
        openIntervalIfNecessary();
        CesiumWritingHelper.writeSpherical(getOutput(), PropertyName, dates, values, startIndex, length);
    }

    /**
    * Writes the value expressed as a {@code unitSpherical}, which is the property specified as a unit spherical value {@code [Clock, Cone]}. The clock angle is measured in the XY plane from the positive X axis toward the positive Y axis. The cone angle is the angle from the positive Z axis toward the negative Z axis.
    * @param value The value.
    */
    public final void writeUnitSpherical(@Nonnull UnitSpherical value) {
        final String PropertyName = UnitSphericalPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeUnitSpherical(getOutput(), value);
    }

    /**
    * Writes the value expressed as a {@code unitSpherical}, which is the property specified as a unit spherical value {@code [Clock, Cone]}. The clock angle is measured in the XY plane from the positive X axis toward the positive Y axis. The cone angle is the angle from the positive Z axis toward the negative Z axis.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeUnitSpherical(List<JulianDate> dates, List<UnitSpherical> values) {
        writeUnitSpherical(dates, values, 0, dates.size());
    }

    /**
    * Writes the value expressed as a {@code unitSpherical}, which is the property specified as a unit spherical value {@code [Clock, Cone]}. The clock angle is measured in the XY plane from the positive X axis toward the positive Y axis. The cone angle is the angle from the positive Z axis toward the negative Z axis.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeUnitSpherical(List<JulianDate> dates, List<UnitSpherical> values, int startIndex, int length) {
        final String PropertyName = UnitSphericalPropertyName;
        openIntervalIfNecessary();
        CesiumWritingHelper.writeUnitSpherical(getOutput(), PropertyName, dates, values, startIndex, length);
    }

    /**
    * Writes the value expressed as a {@code rgba}, which is the property specified as an array of color components {@code [Red, Green, Blue, Alpha]} where each component is an integer in the range 0-255.
    * @param color The color.
    */
    public final void writeRgba(@Nonnull Color color) {
        final String PropertyName = RgbaPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeRgba(getOutput(), color);
    }

    /**
    * Writes the value expressed as a {@code rgba}, which is the property specified as an array of color components {@code [Red, Green, Blue, Alpha]} where each component is an integer in the range 0-255.
    * @param red The red component in the range 0 to 255.
    * @param green The green component in the range 0 to 255.
    * @param blue The blue component in the range 0 to 255.
    * @param alpha The alpha component in the range 0 to 255.
    */
    public final void writeRgba(int red, int green, int blue, int alpha) {
        final String PropertyName = RgbaPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeRgba(getOutput(), red, green, blue, alpha);
    }

    /**
    * Writes the value expressed as a {@code rgba}, which is the property specified as an array of color components {@code [Red, Green, Blue, Alpha]} where each component is an integer in the range 0-255.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeRgba(List<JulianDate> dates, List<Color> values) {
        writeRgba(dates, values, 0, dates.size());
    }

    /**
    * Writes the value expressed as a {@code rgba}, which is the property specified as an array of color components {@code [Red, Green, Blue, Alpha]} where each component is an integer in the range 0-255.
    * @param dates The dates at which the value is specified.
    * @param colors The color corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeRgba(List<JulianDate> dates, List<Color> colors, int startIndex, int length) {
        final String PropertyName = RgbaPropertyName;
        openIntervalIfNecessary();
        CesiumWritingHelper.writeRgba(getOutput(), PropertyName, dates, colors, startIndex, length);
    }

    /**
    * Writes the value expressed as a {@code rgbaf}, which is the property specified as an array of color components {@code [Red, Green, Blue, Alpha]} where each component is a double in the range 0.0-1.0.
    * @param color The color.
    */
    public final void writeRgbaf(@Nonnull Color color) {
        final String PropertyName = RgbafPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeRgbaf(getOutput(), color);
    }

    /**
    * Writes the value expressed as a {@code rgbaf}, which is the property specified as an array of color components {@code [Red, Green, Blue, Alpha]} where each component is a double in the range 0.0-1.0.
    * @param red The red component in the range 0 to 1.0.
    * @param green The green component in the range 0 to 1.0.
    * @param blue The blue component in the range 0 to 1.0.
    * @param alpha The alpha component in the range 0 to 1.0.
    */
    public final void writeRgbaf(float red, float green, float blue, float alpha) {
        final String PropertyName = RgbafPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeRgbaf(getOutput(), red, green, blue, alpha);
    }

    /**
    * Writes the value expressed as a {@code rgbaf}, which is the property specified as an array of color components {@code [Red, Green, Blue, Alpha]} where each component is a double in the range 0.0-1.0.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeRgbaf(List<JulianDate> dates, List<Color> values) {
        writeRgbaf(dates, values, 0, dates.size());
    }

    /**
    * Writes the value expressed as a {@code rgbaf}, which is the property specified as an array of color components {@code [Red, Green, Blue, Alpha]} where each component is a double in the range 0.0-1.0.
    * @param dates The dates at which the value is specified.
    * @param colors The color corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeRgbaf(List<JulianDate> dates, List<Color> colors, int startIndex, int length) {
        final String PropertyName = RgbafPropertyName;
        openIntervalIfNecessary();
        CesiumWritingHelper.writeRgbaf(getOutput(), PropertyName, dates, colors, startIndex, length);
    }

    /**
    * Writes the value expressed as a {@code colorBlendMode}, which is the property specified as a color blend mode.
    * @param value The blend mode.
    */
    public final void writeColorBlendMode(@Nonnull CesiumColorBlendMode value) {
        final String PropertyName = ColorBlendModePropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        getOutput().writeValue(CesiumFormattingHelper.colorBlendModeToString(value));
    }

    /**
    * Writes the value expressed as a {@code cornerType}, which is the property specified as a corner style.
    * @param value The style of a corner.
    */
    public final void writeCornerType(@Nonnull CesiumCornerType value) {
        final String PropertyName = CornerTypePropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        getOutput().writeValue(CesiumFormattingHelper.cornerTypeToString(value));
    }

    /**
    * Writes the value expressed as a {@code heightReference}, which is the property specified as a height reference.
    * @param value The height reference.
    */
    public final void writeHeightReference(@Nonnull CesiumHeightReference value) {
        final String PropertyName = HeightReferencePropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        getOutput().writeValue(CesiumFormattingHelper.heightReferenceToString(value));
    }

    /**
    * Writes the value expressed as a {@code horizontalOrigin}, which is the property specified as a horizontal origin.
    * @param value The horizontal origin.
    */
    public final void writeHorizontalOrigin(@Nonnull CesiumHorizontalOrigin value) {
        final String PropertyName = HorizontalOriginPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        getOutput().writeValue(CesiumFormattingHelper.horizontalOriginToString(value));
    }

    /**
    * Writes the value expressed as a {@code labelStyle}, which is the property specified as a label style.
    * @param value The label style.
    */
    public final void writeLabelStyle(@Nonnull CesiumLabelStyle value) {
        final String PropertyName = LabelStylePropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        getOutput().writeValue(CesiumFormattingHelper.labelStyleToString(value));
    }

    /**
    * Writes the value expressed as a {@code number}, which is the property specified as a number.
    * @param value The value.
    */
    public final void writeNumber(double value) {
        final String PropertyName = NumberPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        getOutput().writeValue(value);
    }

    /**
    * Writes the value expressed as a {@code number}, which is the property specified as a number.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeNumber(List<JulianDate> dates, List<Double> values) {
        writeNumber(dates, values, 0, dates.size());
    }

    /**
    * Writes the value expressed as a {@code number}, which is the property specified as a number.
    * @param dates The dates at which the value is specified.
    * @param values The value corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeNumber(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
        final String PropertyName = NumberPropertyName;
        openIntervalIfNecessary();
        CesiumWritingHelper.writeDouble(getOutput(), PropertyName, dates, values, startIndex, length);
    }

    /**
    * Writes the value expressed as a {@code nearFarScalar}, which is the property specified as four values {@code [NearDistance, NearValue, FarDistance, FarValue]}.
    * @param value The value.
    */
    public final void writeNearFarScalar(@Nonnull NearFarScalar value) {
        final String PropertyName = NearFarScalarPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeNearFarScalar(getOutput(), value);
    }

    /**
    * Writes the value expressed as a {@code nearFarScalar}, which is the property specified as four values {@code [NearDistance, NearValue, FarDistance, FarValue]}.
    * @param nearDistance The lower bound of the camera distance range.
    * @param nearValue The value to use at the lower bound of the camera distance range.
    * @param farDistance The upper bound of the camera distance range.
    * @param farValue The value to use at the upper bound of the camera distance range.
    */
    public final void writeNearFarScalar(double nearDistance, double nearValue, double farDistance, double farValue) {
        writeNearFarScalar(new NearFarScalar(nearDistance, nearValue, farDistance, farValue));
    }

    /**
    * Writes the value expressed as a {@code nearFarScalar}, which is the property specified as four values {@code [NearDistance, NearValue, FarDistance, FarValue]}.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeNearFarScalar(List<JulianDate> dates, List<NearFarScalar> values) {
        writeNearFarScalar(dates, values, 0, dates.size());
    }

    /**
    * Writes the value expressed as a {@code nearFarScalar}, which is the property specified as four values {@code [NearDistance, NearValue, FarDistance, FarValue]}.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeNearFarScalar(List<JulianDate> dates, List<NearFarScalar> values, int startIndex, int length) {
        final String PropertyName = NearFarScalarPropertyName;
        openIntervalIfNecessary();
        CesiumWritingHelper.writeNearFarScalar(getOutput(), PropertyName, dates, values, startIndex, length);
    }

    /**
    * Writes the value expressed as a {@code unitQuaternion}, which is the property specified as a 4-dimensional unit magnitude quaternion, specified as {@code [X, Y, Z, W]}.
    * @param value The value.
    */
    public final void writeUnitQuaternion(@Nonnull UnitQuaternion value) {
        final String PropertyName = UnitQuaternionPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeUnitQuaternion(getOutput(), value);
    }

    /**
    * Writes the value expressed as a {@code unitQuaternion}, which is the property specified as a 4-dimensional unit magnitude quaternion, specified as {@code [X, Y, Z, W]}.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeUnitQuaternion(List<JulianDate> dates, List<UnitQuaternion> values) {
        writeUnitQuaternion(dates, values, 0, dates.size());
    }

    /**
    * Writes the value expressed as a {@code unitQuaternion}, which is the property specified as a 4-dimensional unit magnitude quaternion, specified as {@code [X, Y, Z, W]}.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeUnitQuaternion(List<JulianDate> dates, List<UnitQuaternion> values, int startIndex, int length) {
        final String PropertyName = UnitQuaternionPropertyName;
        openIntervalIfNecessary();
        CesiumWritingHelper.writeUnitQuaternion(getOutput(), PropertyName, dates, values, startIndex, length);
    }

    /**
    * Writes the value expressed as a {@code shadowMode}, which is the property specified as a shadow mode.
    * @param value The shadow mode.
    */
    public final void writeShadowMode(@Nonnull CesiumShadowMode value) {
        final String PropertyName = ShadowModePropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        getOutput().writeValue(CesiumFormattingHelper.shadowModeToString(value));
    }

    /**
    * Writes the value expressed as a {@code string}, which is the property specified as a string.
    * @param value The value.
    */
    public final void writeString(String value) {
        final String PropertyName = StringPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        getOutput().writeValue(value);
    }

    /**
    * Writes the value expressed as a {@code stripeOrientation}, which is the property specified as an orientation of stripes in the stripe material.
    * @param value The orientation.
    */
    public final void writeStripeOrientation(@Nonnull CesiumStripeOrientation value) {
        final String PropertyName = StripeOrientationPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        getOutput().writeValue(CesiumFormattingHelper.stripeOrientationToString(value));
    }

    /**
    * Writes the value expressed as a {@code wsen}, which is the property specified as a Cartographic rectangle {@code [WestLongitude, SouthLatitude, EastLongitude, NorthLatitude]}, with values in radians.
    * @param value The value.
    */
    public final void writeWsen(CartographicExtent value) {
        final String PropertyName = WsenPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeCartographicExtent(getOutput(), value);
    }

    /**
    * Writes the value expressed as a {@code wsen}, which is the property specified as a Cartographic rectangle {@code [WestLongitude, SouthLatitude, EastLongitude, NorthLatitude]}, with values in radians.
    * @param west The westernmost longitude.
    * @param south The southernmost latitude.
    * @param east The easternmost longitude.
    * @param north The northernmost latitude.
    */
    public final void writeWsen(double west, double south, double east, double north) {
        writeWsen(new CartographicExtent(west, south, east, north));
    }

    /**
    * Writes the value expressed as a {@code wsen}, which is the property specified as a Cartographic rectangle {@code [WestLongitude, SouthLatitude, EastLongitude, NorthLatitude]}, with values in radians.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeWsen(List<JulianDate> dates, List<CartographicExtent> values) {
        writeWsen(dates, values, 0, dates.size());
    }

    /**
    * Writes the value expressed as a {@code wsen}, which is the property specified as a Cartographic rectangle {@code [WestLongitude, SouthLatitude, EastLongitude, NorthLatitude]}, with values in radians.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeWsen(List<JulianDate> dates, List<CartographicExtent> values, int startIndex, int length) {
        final String PropertyName = WsenPropertyName;
        openIntervalIfNecessary();
        CesiumWritingHelper.writeCartographicExtent(getOutput(), PropertyName, dates, values, startIndex, length);
    }

    /**
    * Writes the value expressed as a {@code wsenDegrees}, which is the property specified as a Cartographic rectangle {@code [WestLongitude, SouthLatitude, EastLongitude, NorthLatitude]}, with values in degrees.
    * @param value The value.
    */
    public final void writeWsenDegrees(CartographicExtent value) {
        final String PropertyName = WsenDegreesPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        CesiumWritingHelper.writeCartographicExtent(getOutput(), value);
    }

    /**
    * Writes the value expressed as a {@code wsenDegrees}, which is the property specified as a Cartographic rectangle {@code [WestLongitude, SouthLatitude, EastLongitude, NorthLatitude]}, with values in degrees.
    * @param west The westernmost longitude.
    * @param south The southernmost latitude.
    * @param east The easternmost longitude.
    * @param north The northernmost latitude.
    */
    public final void writeWsenDegrees(double west, double south, double east, double north) {
        writeWsenDegrees(new CartographicExtent(west, south, east, north));
    }

    /**
    * Writes the value expressed as a {@code wsenDegrees}, which is the property specified as a Cartographic rectangle {@code [WestLongitude, SouthLatitude, EastLongitude, NorthLatitude]}, with values in degrees.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeWsenDegrees(List<JulianDate> dates, List<CartographicExtent> values) {
        writeWsenDegrees(dates, values, 0, dates.size());
    }

    /**
    * Writes the value expressed as a {@code wsenDegrees}, which is the property specified as a Cartographic rectangle {@code [WestLongitude, SouthLatitude, EastLongitude, NorthLatitude]}, with values in degrees.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeWsenDegrees(List<JulianDate> dates, List<CartographicExtent> values, int startIndex, int length) {
        final String PropertyName = WsenDegreesPropertyName;
        openIntervalIfNecessary();
        CesiumWritingHelper.writeCartographicExtent(getOutput(), PropertyName, dates, values, startIndex, length);
    }

    /**
    * Writes the value expressed as a {@code uri}, which is the property specified as a URI.
    * @param resource A resource object describing external data.
    */
    public final void writeUri(CesiumResource resource) {
        writeUri(resource.getUri(), resource.getBehavior());
    }

    /**
    * Writes the value expressed as a {@code uri}, which is the property specified as a URI.
    * @param uri The URI of the data.
    * @param resourceBehavior An enumeration describing how to include the URI in the document. For even more control, use the overload that takes a ICesiumUriResolver.
    */
    public final void writeUri(URI uri, @Nonnull CesiumResourceBehavior resourceBehavior) {
        writeUri(uri.toString(), resourceBehavior);
    }

    /**
    * Writes the value expressed as a {@code uri}, which is the property specified as a URI.
    * @param uri The URI of the data.
    * @param resourceBehavior An enumeration describing how to include the URI in the document. For even more control, use the overload that takes a ICesiumUriResolver.
    */
    public final void writeUri(String uri, @Nonnull CesiumResourceBehavior resourceBehavior) {
        final String PropertyName = UriPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        getOutput().writeValue(CesiumFormattingHelper.getResourceUri(uri, resourceBehavior));
    }

    /**
    * Writes the value expressed as a {@code uri}, which is the property specified as a URI.
    * @param uri The URI of the data. The provided ICesiumUriResolver will be used to build the final URI embedded in the document.
    * @param resolver An ICesiumUriResolver used to build the final URI that will be embedded in the document.
    */
    public final void writeUri(URI uri, ICesiumUriResolver resolver) {
        writeUri(uri.toString(), resolver);
    }

    /**
    * Writes the value expressed as a {@code uri}, which is the property specified as a URI.
    * @param uri The URI of the data. The provided ICesiumUriResolver will be used to build the final URI embedded in the document.
    * @param resolver An ICesiumUriResolver used to build the final URI that will be embedded in the document.
    */
    public final void writeUri(String uri, ICesiumUriResolver resolver) {
        final String PropertyName = UriPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        getOutput().writeValue(resolver.resolveUri(uri));
    }

    /**
    * Writes the value expressed as a {@code uri}, which is the property specified as a URI.
    * @param image The image. A data URI will be created for this image, using PNG encoding.
    */
    public final void writeUri(RenderedImage image) {
        writeUri(image, CesiumImageFormat.PNG);
    }

    /**
    * Writes the value expressed as a {@code uri}, which is the property specified as a URI.
    * @param image The image. A data URI will be created for this image.
    * @param imageFormat The image format to use to encode the image in the data URI.
    */
    public final void writeUri(RenderedImage image, @Nonnull CesiumImageFormat imageFormat) {
        final String PropertyName = UriPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        getOutput().writeValue(CesiumFormattingHelper.imageToDataUri(image, imageFormat));
    }

    /**
    * Writes the value expressed as a {@code verticalOrigin}, which is the property specified as a vertical origin.
    * @param value The vertical origin.
    */
    public final void writeVerticalOrigin(@Nonnull CesiumVerticalOrigin value) {
        final String PropertyName = VerticalOriginPropertyName;
        openIntervalIfNecessary();
        getOutput().writePropertyName(PropertyName);
        getOutput().writeValue(CesiumFormattingHelper.verticalOriginToString(value));
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
    * Returns a wrapper for this instance that implements {@link ICesiumBooleanValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumBooleanValuePropertyAdaptor<CustomPropertyCesiumWriter> asBoolean() {
        return m_asBoolean.getValue();
    }

    private final Lazy<CesiumBooleanValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsBoolean() {
        return new Lazy<CesiumBooleanValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumBooleanValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createBoolean") {
                    public CesiumBooleanValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createBoolean();
                    }
                }, false);
    }

    private final CesiumBooleanValuePropertyAdaptor<CustomPropertyCesiumWriter> createBoolean() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createBoolean(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumBoundingRectangleValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumBoundingRectangleValuePropertyAdaptor<CustomPropertyCesiumWriter> asBoundingRectangle() {
        return m_asBoundingRectangle.getValue();
    }

    private final Lazy<CesiumBoundingRectangleValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsBoundingRectangle() {
        return new Lazy<CesiumBoundingRectangleValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumBoundingRectangleValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createBoundingRectangle") {
                    public CesiumBoundingRectangleValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createBoundingRectangle();
                    }
                }, false);
    }

    private final CesiumBoundingRectangleValuePropertyAdaptor<CustomPropertyCesiumWriter> createBoundingRectangle() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createBoundingRectangle(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumCartesian3ValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumCartesian3ValuePropertyAdaptor<CustomPropertyCesiumWriter> asCartesian() {
        return m_asCartesian.getValue();
    }

    private final Lazy<CesiumCartesian3ValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsCartesian() {
        return new Lazy<CesiumCartesian3ValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumCartesian3ValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createCartesian3") {
                    public CesiumCartesian3ValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createCartesian3();
                    }
                }, false);
    }

    private final CesiumCartesian3ValuePropertyAdaptor<CustomPropertyCesiumWriter> createCartesian3() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createCartesian3(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumCartographicRadiansValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumCartographicRadiansValuePropertyAdaptor<CustomPropertyCesiumWriter> asCartographicRadians() {
        return m_asCartographicRadians.getValue();
    }

    private final Lazy<CesiumCartographicRadiansValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsCartographicRadians() {
        return new Lazy<CesiumCartographicRadiansValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumCartographicRadiansValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createCartographicRadians") {
                    public CesiumCartographicRadiansValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createCartographicRadians();
                    }
                }, false);
    }

    private final CesiumCartographicRadiansValuePropertyAdaptor<CustomPropertyCesiumWriter> createCartographicRadians() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createCartographicRadians(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumCartographicDegreesValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumCartographicDegreesValuePropertyAdaptor<CustomPropertyCesiumWriter> asCartographicDegrees() {
        return m_asCartographicDegrees.getValue();
    }

    private final Lazy<CesiumCartographicDegreesValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsCartographicDegrees() {
        return new Lazy<CesiumCartographicDegreesValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumCartographicDegreesValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createCartographicDegrees") {
                    public CesiumCartographicDegreesValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createCartographicDegrees();
                    }
                }, false);
    }

    private final CesiumCartographicDegreesValuePropertyAdaptor<CustomPropertyCesiumWriter> createCartographicDegrees() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createCartographicDegrees(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumCartesian2ValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumCartesian2ValuePropertyAdaptor<CustomPropertyCesiumWriter> asCartesian2() {
        return m_asCartesian2.getValue();
    }

    private final Lazy<CesiumCartesian2ValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsCartesian2() {
        return new Lazy<CesiumCartesian2ValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumCartesian2ValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createCartesian2") {
                    public CesiumCartesian2ValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createCartesian2();
                    }
                }, false);
    }

    private final CesiumCartesian2ValuePropertyAdaptor<CustomPropertyCesiumWriter> createCartesian2() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createCartesian2(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumUnitCartesian3ValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumUnitCartesian3ValuePropertyAdaptor<CustomPropertyCesiumWriter> asUnitCartesian() {
        return m_asUnitCartesian.getValue();
    }

    private final Lazy<CesiumUnitCartesian3ValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsUnitCartesian() {
        return new Lazy<CesiumUnitCartesian3ValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumUnitCartesian3ValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createUnitCartesian3") {
                    public CesiumUnitCartesian3ValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createUnitCartesian3();
                    }
                }, false);
    }

    private final CesiumUnitCartesian3ValuePropertyAdaptor<CustomPropertyCesiumWriter> createUnitCartesian3() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createUnitCartesian3(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumSphericalValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumSphericalValuePropertyAdaptor<CustomPropertyCesiumWriter> asSpherical() {
        return m_asSpherical.getValue();
    }

    private final Lazy<CesiumSphericalValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsSpherical() {
        return new Lazy<CesiumSphericalValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumSphericalValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createSpherical") {
                    public CesiumSphericalValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createSpherical();
                    }
                }, false);
    }

    private final CesiumSphericalValuePropertyAdaptor<CustomPropertyCesiumWriter> createSpherical() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createSpherical(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumUnitSphericalValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumUnitSphericalValuePropertyAdaptor<CustomPropertyCesiumWriter> asUnitSpherical() {
        return m_asUnitSpherical.getValue();
    }

    private final Lazy<CesiumUnitSphericalValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsUnitSpherical() {
        return new Lazy<CesiumUnitSphericalValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumUnitSphericalValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createUnitSpherical") {
                    public CesiumUnitSphericalValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createUnitSpherical();
                    }
                }, false);
    }

    private final CesiumUnitSphericalValuePropertyAdaptor<CustomPropertyCesiumWriter> createUnitSpherical() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createUnitSpherical(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumRgbaValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumRgbaValuePropertyAdaptor<CustomPropertyCesiumWriter> asRgba() {
        return m_asRgba.getValue();
    }

    private final Lazy<CesiumRgbaValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsRgba() {
        return new Lazy<CesiumRgbaValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumRgbaValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createRgba") {
                    public CesiumRgbaValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createRgba();
                    }
                }, false);
    }

    private final CesiumRgbaValuePropertyAdaptor<CustomPropertyCesiumWriter> createRgba() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createRgba(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumRgbafValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumRgbafValuePropertyAdaptor<CustomPropertyCesiumWriter> asRgbaf() {
        return m_asRgbaf.getValue();
    }

    private final Lazy<CesiumRgbafValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsRgbaf() {
        return new Lazy<CesiumRgbafValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumRgbafValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createRgbaf") {
                    public CesiumRgbafValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createRgbaf();
                    }
                }, false);
    }

    private final CesiumRgbafValuePropertyAdaptor<CustomPropertyCesiumWriter> createRgbaf() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createRgbaf(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumColorBlendModeValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumColorBlendModeValuePropertyAdaptor<CustomPropertyCesiumWriter> asColorBlendMode() {
        return m_asColorBlendMode.getValue();
    }

    private final Lazy<CesiumColorBlendModeValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsColorBlendMode() {
        return new Lazy<CesiumColorBlendModeValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumColorBlendModeValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createColorBlendMode") {
                    public CesiumColorBlendModeValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createColorBlendMode();
                    }
                }, false);
    }

    private final CesiumColorBlendModeValuePropertyAdaptor<CustomPropertyCesiumWriter> createColorBlendMode() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createColorBlendMode(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumCornerTypeValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumCornerTypeValuePropertyAdaptor<CustomPropertyCesiumWriter> asCornerType() {
        return m_asCornerType.getValue();
    }

    private final Lazy<CesiumCornerTypeValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsCornerType() {
        return new Lazy<CesiumCornerTypeValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumCornerTypeValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createCornerType") {
                    public CesiumCornerTypeValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createCornerType();
                    }
                }, false);
    }

    private final CesiumCornerTypeValuePropertyAdaptor<CustomPropertyCesiumWriter> createCornerType() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createCornerType(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumHeightReferenceValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumHeightReferenceValuePropertyAdaptor<CustomPropertyCesiumWriter> asHeightReference() {
        return m_asHeightReference.getValue();
    }

    private final Lazy<CesiumHeightReferenceValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsHeightReference() {
        return new Lazy<CesiumHeightReferenceValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumHeightReferenceValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createHeightReference") {
                    public CesiumHeightReferenceValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createHeightReference();
                    }
                }, false);
    }

    private final CesiumHeightReferenceValuePropertyAdaptor<CustomPropertyCesiumWriter> createHeightReference() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createHeightReference(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumHorizontalOriginValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumHorizontalOriginValuePropertyAdaptor<CustomPropertyCesiumWriter> asHorizontalOrigin() {
        return m_asHorizontalOrigin.getValue();
    }

    private final Lazy<CesiumHorizontalOriginValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsHorizontalOrigin() {
        return new Lazy<CesiumHorizontalOriginValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumHorizontalOriginValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createHorizontalOrigin") {
                    public CesiumHorizontalOriginValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createHorizontalOrigin();
                    }
                }, false);
    }

    private final CesiumHorizontalOriginValuePropertyAdaptor<CustomPropertyCesiumWriter> createHorizontalOrigin() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createHorizontalOrigin(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumLabelStyleValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumLabelStyleValuePropertyAdaptor<CustomPropertyCesiumWriter> asLabelStyle() {
        return m_asLabelStyle.getValue();
    }

    private final Lazy<CesiumLabelStyleValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsLabelStyle() {
        return new Lazy<CesiumLabelStyleValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumLabelStyleValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createLabelStyle") {
                    public CesiumLabelStyleValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createLabelStyle();
                    }
                }, false);
    }

    private final CesiumLabelStyleValuePropertyAdaptor<CustomPropertyCesiumWriter> createLabelStyle() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createLabelStyle(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumDoubleValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumDoubleValuePropertyAdaptor<CustomPropertyCesiumWriter> asNumber() {
        return m_asNumber.getValue();
    }

    private final Lazy<CesiumDoubleValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsNumber() {
        return new Lazy<CesiumDoubleValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumDoubleValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createDouble") {
                    public CesiumDoubleValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createDouble();
                    }
                }, false);
    }

    private final CesiumDoubleValuePropertyAdaptor<CustomPropertyCesiumWriter> createDouble() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createDouble(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumNearFarScalarValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumNearFarScalarValuePropertyAdaptor<CustomPropertyCesiumWriter> asNearFarScalar() {
        return m_asNearFarScalar.getValue();
    }

    private final Lazy<CesiumNearFarScalarValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsNearFarScalar() {
        return new Lazy<CesiumNearFarScalarValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumNearFarScalarValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createNearFarScalar") {
                    public CesiumNearFarScalarValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createNearFarScalar();
                    }
                }, false);
    }

    private final CesiumNearFarScalarValuePropertyAdaptor<CustomPropertyCesiumWriter> createNearFarScalar() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createNearFarScalar(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumUnitQuaternionValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumUnitQuaternionValuePropertyAdaptor<CustomPropertyCesiumWriter> asUnitQuaternion() {
        return m_asUnitQuaternion.getValue();
    }

    private final Lazy<CesiumUnitQuaternionValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsUnitQuaternion() {
        return new Lazy<CesiumUnitQuaternionValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumUnitQuaternionValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createUnitQuaternion") {
                    public CesiumUnitQuaternionValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createUnitQuaternion();
                    }
                }, false);
    }

    private final CesiumUnitQuaternionValuePropertyAdaptor<CustomPropertyCesiumWriter> createUnitQuaternion() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createUnitQuaternion(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumShadowModeValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumShadowModeValuePropertyAdaptor<CustomPropertyCesiumWriter> asShadowMode() {
        return m_asShadowMode.getValue();
    }

    private final Lazy<CesiumShadowModeValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsShadowMode() {
        return new Lazy<CesiumShadowModeValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumShadowModeValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createShadowMode") {
                    public CesiumShadowModeValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createShadowMode();
                    }
                }, false);
    }

    private final CesiumShadowModeValuePropertyAdaptor<CustomPropertyCesiumWriter> createShadowMode() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createShadowMode(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumStringValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumStringValuePropertyAdaptor<CustomPropertyCesiumWriter> asString() {
        return m_asString.getValue();
    }

    private final Lazy<CesiumStringValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsString() {
        return new Lazy<CesiumStringValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumStringValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createString") {
                    public CesiumStringValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createString();
                    }
                }, false);
    }

    private final CesiumStringValuePropertyAdaptor<CustomPropertyCesiumWriter> createString() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createString(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumStripeOrientationValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumStripeOrientationValuePropertyAdaptor<CustomPropertyCesiumWriter> asStripeOrientation() {
        return m_asStripeOrientation.getValue();
    }

    private final Lazy<CesiumStripeOrientationValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsStripeOrientation() {
        return new Lazy<CesiumStripeOrientationValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumStripeOrientationValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createStripeOrientation") {
                    public CesiumStripeOrientationValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createStripeOrientation();
                    }
                }, false);
    }

    private final CesiumStripeOrientationValuePropertyAdaptor<CustomPropertyCesiumWriter> createStripeOrientation() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createStripeOrientation(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumCartographicRectangleRadiansValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumCartographicRectangleRadiansValuePropertyAdaptor<CustomPropertyCesiumWriter> asWsen() {
        return m_asWsen.getValue();
    }

    private final Lazy<CesiumCartographicRectangleRadiansValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsWsen() {
        return new Lazy<CesiumCartographicRectangleRadiansValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumCartographicRectangleRadiansValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createCartographicRectangleRadians") {
                    public CesiumCartographicRectangleRadiansValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createCartographicRectangleRadians();
                    }
                }, false);
    }

    private final CesiumCartographicRectangleRadiansValuePropertyAdaptor<CustomPropertyCesiumWriter> createCartographicRectangleRadians() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createCartographicRectangleRadians(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumCartographicRectangleDegreesValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumCartographicRectangleDegreesValuePropertyAdaptor<CustomPropertyCesiumWriter> asWsenDegrees() {
        return m_asWsenDegrees.getValue();
    }

    private final Lazy<CesiumCartographicRectangleDegreesValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsWsenDegrees() {
        return new Lazy<CesiumCartographicRectangleDegreesValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumCartographicRectangleDegreesValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createCartographicRectangleDegrees") {
                    public CesiumCartographicRectangleDegreesValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createCartographicRectangleDegrees();
                    }
                }, false);
    }

    private final CesiumCartographicRectangleDegreesValuePropertyAdaptor<CustomPropertyCesiumWriter> createCartographicRectangleDegrees() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createCartographicRectangleDegrees(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumUriValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumUriValuePropertyAdaptor<CustomPropertyCesiumWriter> asUri() {
        return m_asUri.getValue();
    }

    private final Lazy<CesiumUriValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsUri() {
        return new Lazy<CesiumUriValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumUriValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createUri") {
                    public CesiumUriValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createUri();
                    }
                }, false);
    }

    private final CesiumUriValuePropertyAdaptor<CustomPropertyCesiumWriter> createUri() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createUri(this);
    }

    /**
    * Returns a wrapper for this instance that implements {@link ICesiumVerticalOriginValuePropertyWriter}. Because the returned instance is a wrapper for this instance, you may call {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
    * @return The wrapper.
    */
    public final CesiumVerticalOriginValuePropertyAdaptor<CustomPropertyCesiumWriter> asVerticalOrigin() {
        return m_asVerticalOrigin.getValue();
    }

    private final Lazy<CesiumVerticalOriginValuePropertyAdaptor<CustomPropertyCesiumWriter>> createAsVerticalOrigin() {
        return new Lazy<CesiumVerticalOriginValuePropertyAdaptor<CustomPropertyCesiumWriter>>(
                new Func1<CesiumVerticalOriginValuePropertyAdaptor<CustomPropertyCesiumWriter>>(this, "createVerticalOrigin") {
                    public CesiumVerticalOriginValuePropertyAdaptor<CustomPropertyCesiumWriter> invoke() {
                        return createVerticalOrigin();
                    }
                }, false);
    }

    private final CesiumVerticalOriginValuePropertyAdaptor<CustomPropertyCesiumWriter> createVerticalOrigin() {
        return CesiumValuePropertyAdaptors.<CustomPropertyCesiumWriter> createVerticalOrigin(this);
    }
}
