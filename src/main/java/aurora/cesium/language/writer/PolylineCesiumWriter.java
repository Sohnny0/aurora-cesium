package aurora.cesium.language.writer;


import aurora.agi.foundation.compatibility.DisposeHelper;
import aurora.agi.foundation.compatibility.Func1;
import aurora.agi.foundation.compatibility.Lazy;
import aurora.cesium.language.writer.advanced.CesiumElementWriter;
import aurora.cesium.language.writer.advanced.CesiumPropertyWriter;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * Writes a {@code Polyline} to a {@link CesiumOutputStream}. A {@code Polyline} is a polyline, which is a line in the scene composed of multiple segments.
 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public class PolylineCesiumWriter extends CesiumPropertyWriter<PolylineCesiumWriter> {
    /**
    * The name of the {@code show} property.
    */
    public static final String ShowPropertyName = "show";
    /**
    * The name of the {@code positions} property.
    */
    public static final String PositionsPropertyName = "positions";
    /**
    * The name of the {@code arcType} property.
    */
    public static final String ArcTypePropertyName = "arcType";
    /**
    * The name of the {@code width} property.
    */
    public static final String WidthPropertyName = "width";
    /**
    * The name of the {@code granularity} property.
    */
    public static final String GranularityPropertyName = "granularity";
    /**
    * The name of the {@code material} property.
    */
    public static final String MaterialPropertyName = "material";
    /**
    * The name of the {@code followSurface} property.
    */
    public static final String FollowSurfacePropertyName = "followSurface";
    /**
    * The name of the {@code shadows} property.
    */
    public static final String ShadowsPropertyName = "shadows";
    /**
    * The name of the {@code depthFailMaterial} property.
    */
    public static final String DepthFailMaterialPropertyName = "depthFailMaterial";
    /**
    * The name of the {@code distanceDisplayCondition} property.
    */
    public static final String DistanceDisplayConditionPropertyName = "distanceDisplayCondition";
    /**
    * The name of the {@code clampToGround} property.
    */
    public static final String ClampToGroundPropertyName = "clampToGround";
    /**
    * The name of the {@code classificationType} property.
    */
    public static final String ClassificationTypePropertyName = "classificationType";
    /**
    * The name of the {@code zIndex} property.
    */
    public static final String ZIndexPropertyName = "zIndex";
    private Lazy<BooleanCesiumWriter> m_show = new Lazy<BooleanCesiumWriter>(new Func1<BooleanCesiumWriter>() {
        public BooleanCesiumWriter invoke() {
            return new BooleanCesiumWriter(ShowPropertyName);
        }
    }, false);
    private Lazy<PositionListCesiumWriter> m_positions = new Lazy<PositionListCesiumWriter>(new Func1<PositionListCesiumWriter>() {
        public PositionListCesiumWriter invoke() {
            return new PositionListCesiumWriter(PositionsPropertyName);
        }
    }, false);
    private Lazy<ArcTypeCesiumWriter> m_arcType = new Lazy<ArcTypeCesiumWriter>(new Func1<ArcTypeCesiumWriter>() {
        public ArcTypeCesiumWriter invoke() {
            return new ArcTypeCesiumWriter(ArcTypePropertyName);
        }
    }, false);
    private Lazy<DoubleCesiumWriter> m_width = new Lazy<DoubleCesiumWriter>(new Func1<DoubleCesiumWriter>() {
        public DoubleCesiumWriter invoke() {
            return new DoubleCesiumWriter(WidthPropertyName);
        }
    }, false);
    private Lazy<DoubleCesiumWriter> m_granularity = new Lazy<DoubleCesiumWriter>(new Func1<DoubleCesiumWriter>() {
        public DoubleCesiumWriter invoke() {
            return new DoubleCesiumWriter(GranularityPropertyName);
        }
    }, false);
    private Lazy<PolylineMaterialCesiumWriter> m_material = new Lazy<PolylineMaterialCesiumWriter>(new Func1<PolylineMaterialCesiumWriter>() {
        public PolylineMaterialCesiumWriter invoke() {
            return new PolylineMaterialCesiumWriter(MaterialPropertyName);
        }
    }, false);
    private Lazy<BooleanCesiumWriter> m_followSurface = new Lazy<BooleanCesiumWriter>(new Func1<BooleanCesiumWriter>() {
        public BooleanCesiumWriter invoke() {
            return new BooleanCesiumWriter(FollowSurfacePropertyName);
        }
    }, false);
    private Lazy<ShadowModeCesiumWriter> m_shadows = new Lazy<ShadowModeCesiumWriter>(new Func1<ShadowModeCesiumWriter>() {
        public ShadowModeCesiumWriter invoke() {
            return new ShadowModeCesiumWriter(ShadowsPropertyName);
        }
    }, false);
    private Lazy<PolylineMaterialCesiumWriter> m_depthFailMaterial = new Lazy<PolylineMaterialCesiumWriter>(new Func1<PolylineMaterialCesiumWriter>() {
        public PolylineMaterialCesiumWriter invoke() {
            return new PolylineMaterialCesiumWriter(DepthFailMaterialPropertyName);
        }
    }, false);
    private Lazy<DistanceDisplayConditionCesiumWriter> m_distanceDisplayCondition = new Lazy<DistanceDisplayConditionCesiumWriter>(
            new Func1<DistanceDisplayConditionCesiumWriter>() {
                public DistanceDisplayConditionCesiumWriter invoke() {
                    return new DistanceDisplayConditionCesiumWriter(DistanceDisplayConditionPropertyName);
                }
            }, false);
    private Lazy<BooleanCesiumWriter> m_clampToGround = new Lazy<BooleanCesiumWriter>(new Func1<BooleanCesiumWriter>() {
        public BooleanCesiumWriter invoke() {
            return new BooleanCesiumWriter(ClampToGroundPropertyName);
        }
    }, false);
    private Lazy<ClassificationTypeCesiumWriter> m_classificationType = new Lazy<ClassificationTypeCesiumWriter>(new Func1<ClassificationTypeCesiumWriter>() {
        public ClassificationTypeCesiumWriter invoke() {
            return new ClassificationTypeCesiumWriter(ClassificationTypePropertyName);
        }
    }, false);
    private Lazy<IntegerCesiumWriter> m_zIndex = new Lazy<IntegerCesiumWriter>(new Func1<IntegerCesiumWriter>() {
        public IntegerCesiumWriter invoke() {
            return new IntegerCesiumWriter(ZIndexPropertyName);
        }
    }, false);

    /**
    * Initializes a new instance.
    * @param propertyName The name of the property.
    */
    public PolylineCesiumWriter(@Nonnull String propertyName) {
        super(propertyName);
    }

    /**
    * Initializes a new instance as a copy of an existing instance.
    * @param existingInstance The existing instance to copy.
    */
    protected PolylineCesiumWriter(@Nonnull PolylineCesiumWriter existingInstance) {
        super(existingInstance);
    }

    /**
    * Copies this instance and returns the copy.
    * @return The copy.
    */
    @Override
    public PolylineCesiumWriter clone() {
        return new PolylineCesiumWriter(this);
    }

    /**
    * Gets the writer for the {@code show} property. The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing. The {@code show} property defines whether or not the polyline is shown. If not specified, the default value is {@code true}.
    */
    @Nonnull
    public final BooleanCesiumWriter getShowWriter() {
        return m_show.getValue();
    }

    /**
    * Opens and returns the writer for the {@code show} property. The {@code show} property defines whether or not the polyline is shown. If not specified, the default value is {@code true}.
    */
    @Nonnull
    public final BooleanCesiumWriter openShowProperty() {
        openIntervalIfNecessary();
        return this.<BooleanCesiumWriter> openAndReturn(getShowWriter());
    }

    /**
    * Writes a value for the {@code show} property as a {@code boolean} value. The {@code show} property specifies whether or not the polyline is shown. If not specified, the default value is {@code true}.
    * @param value The value.
    */
    public final void writeShowProperty(boolean value) {
        {
            BooleanCesiumWriter writer = openShowProperty();
            try {
                writer.writeBoolean(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code show} property as a {@code reference} value. The {@code show} property specifies whether or not the polyline is shown. If not specified, the default value is {@code true}.
    * @param value The reference.
    */
    public final void writeShowPropertyReference(Reference value) {
        {
            BooleanCesiumWriter writer = openShowProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code show} property as a {@code reference} value. The {@code show} property specifies whether or not the polyline is shown. If not specified, the default value is {@code true}.
    * @param value The reference.
    */
    public final void writeShowPropertyReference(String value) {
        {
            BooleanCesiumWriter writer = openShowProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code show} property as a {@code reference} value. The {@code show} property specifies whether or not the polyline is shown. If not specified, the default value is {@code true}.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeShowPropertyReference(String identifier, String propertyName) {
        {
            BooleanCesiumWriter writer = openShowProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code show} property as a {@code reference} value. The {@code show} property specifies whether or not the polyline is shown. If not specified, the default value is {@code true}.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeShowPropertyReference(String identifier, String[] propertyNames) {
        {
            BooleanCesiumWriter writer = openShowProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Gets the writer for the {@code positions} property. The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing. The {@code positions} property defines the array of positions defining the polyline as a line strip. This value must be specified in order for the client to display graphics.
    */
    @Nonnull
    public final PositionListCesiumWriter getPositionsWriter() {
        return m_positions.getValue();
    }

    /**
    * Opens and returns the writer for the {@code positions} property. The {@code positions} property defines the array of positions defining the polyline as a line strip. This value must be specified in order for the client to display graphics.
    */
    @Nonnull
    public final PositionListCesiumWriter openPositionsProperty() {
        openIntervalIfNecessary();
        return this.<PositionListCesiumWriter> openAndReturn(getPositionsWriter());
    }

    /**
    * Writes a value for the {@code positions} property as a {@code cartesian} value. The {@code positions} property specifies the array of positions defining the polyline as a line strip. This value must be specified in order for the client to display graphics.
    * @param values The values.
    */
    public final void writePositionsProperty(Iterable<Cartesian> values) {
        {
            PositionListCesiumWriter writer = openPositionsProperty();
            try {
                writer.writeCartesian(values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code positions} property as a {@code cartographicRadians} value. The {@code positions} property specifies the array of positions defining the polyline as a line strip. This value must be specified in order for the client to display graphics.
    * @param values The values.
    */
    public final void writePositionsPropertyCartographicRadians(Iterable<Cartographic> values) {
        {
            PositionListCesiumWriter writer = openPositionsProperty();
            try {
                writer.writeCartographicRadians(values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code positions} property as a {@code cartographicDegrees} value. The {@code positions} property specifies the array of positions defining the polyline as a line strip. This value must be specified in order for the client to display graphics.
    * @param values The values.
    */
    public final void writePositionsPropertyCartographicDegrees(Iterable<Cartographic> values) {
        {
            PositionListCesiumWriter writer = openPositionsProperty();
            try {
                writer.writeCartographicDegrees(values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code positions} property as a {@code references} value. The {@code positions} property specifies the array of positions defining the polyline as a line strip. This value must be specified in order for the client to display graphics.
    * @param references The list of references.
    */
    public final void writePositionsPropertyReferences(Iterable<Reference> references) {
        {
            PositionListCesiumWriter writer = openPositionsProperty();
            try {
                writer.writeReferences(references);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Gets the writer for the {@code arcType} property. The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing. The {@code arcType} property defines the type of arc that should connect the positions of the polyline. If not specified, the default value is GEODESIC.
    */
    @Nonnull
    public final ArcTypeCesiumWriter getArcTypeWriter() {
        return m_arcType.getValue();
    }

    /**
    * Opens and returns the writer for the {@code arcType} property. The {@code arcType} property defines the type of arc that should connect the positions of the polyline. If not specified, the default value is GEODESIC.
    */
    @Nonnull
    public final ArcTypeCesiumWriter openArcTypeProperty() {
        openIntervalIfNecessary();
        return this.<ArcTypeCesiumWriter> openAndReturn(getArcTypeWriter());
    }

    /**
    * Writes a value for the {@code arcType} property as a {@code arcType} value. The {@code arcType} property specifies the type of arc that should connect the positions of the polyline. If not specified, the default value is GEODESIC.
    * @param value The type of an arc.
    */
    public final void writeArcTypeProperty(@Nonnull CesiumArcType value) {
        {
            ArcTypeCesiumWriter writer = openArcTypeProperty();
            try {
                writer.writeArcType(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code arcType} property as a {@code reference} value. The {@code arcType} property specifies the type of arc that should connect the positions of the polyline. If not specified, the default value is GEODESIC.
    * @param value The reference.
    */
    public final void writeArcTypePropertyReference(Reference value) {
        {
            ArcTypeCesiumWriter writer = openArcTypeProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code arcType} property as a {@code reference} value. The {@code arcType} property specifies the type of arc that should connect the positions of the polyline. If not specified, the default value is GEODESIC.
    * @param value The reference.
    */
    public final void writeArcTypePropertyReference(String value) {
        {
            ArcTypeCesiumWriter writer = openArcTypeProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code arcType} property as a {@code reference} value. The {@code arcType} property specifies the type of arc that should connect the positions of the polyline. If not specified, the default value is GEODESIC.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeArcTypePropertyReference(String identifier, String propertyName) {
        {
            ArcTypeCesiumWriter writer = openArcTypeProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code arcType} property as a {@code reference} value. The {@code arcType} property specifies the type of arc that should connect the positions of the polyline. If not specified, the default value is GEODESIC.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeArcTypePropertyReference(String identifier, String[] propertyNames) {
        {
            ArcTypeCesiumWriter writer = openArcTypeProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Gets the writer for the {@code width} property. The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing. The {@code width} property defines the width of the polyline. If not specified, the default value is 1.0.
    */
    @Nonnull
    public final DoubleCesiumWriter getWidthWriter() {
        return m_width.getValue();
    }

    /**
    * Opens and returns the writer for the {@code width} property. The {@code width} property defines the width of the polyline. If not specified, the default value is 1.0.
    */
    @Nonnull
    public final DoubleCesiumWriter openWidthProperty() {
        openIntervalIfNecessary();
        return this.<DoubleCesiumWriter> openAndReturn(getWidthWriter());
    }

    /**
    * Writes a value for the {@code width} property as a {@code number} value. The {@code width} property specifies the width of the polyline. If not specified, the default value is 1.0.
    * @param value The value.
    */
    public final void writeWidthProperty(double value) {
        {
            DoubleCesiumWriter writer = openWidthProperty();
            try {
                writer.writeNumber(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code width} property as a {@code number} value. The {@code width} property specifies the width of the polyline. If not specified, the default value is 1.0.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeWidthProperty(List<JulianDate> dates, List<Double> values) {
        {
            DoubleCesiumWriter writer = openWidthProperty();
            try {
                writer.writeNumber(dates, values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code width} property as a {@code number} value. The {@code width} property specifies the width of the polyline. If not specified, the default value is 1.0.
    * @param dates The dates at which the value is specified.
    * @param values The value corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeWidthProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
        {
            DoubleCesiumWriter writer = openWidthProperty();
            try {
                writer.writeNumber(dates, values, startIndex, length);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code width} property as a {@code reference} value. The {@code width} property specifies the width of the polyline. If not specified, the default value is 1.0.
    * @param value The reference.
    */
    public final void writeWidthPropertyReference(Reference value) {
        {
            DoubleCesiumWriter writer = openWidthProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code width} property as a {@code reference} value. The {@code width} property specifies the width of the polyline. If not specified, the default value is 1.0.
    * @param value The reference.
    */
    public final void writeWidthPropertyReference(String value) {
        {
            DoubleCesiumWriter writer = openWidthProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code width} property as a {@code reference} value. The {@code width} property specifies the width of the polyline. If not specified, the default value is 1.0.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeWidthPropertyReference(String identifier, String propertyName) {
        {
            DoubleCesiumWriter writer = openWidthProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code width} property as a {@code reference} value. The {@code width} property specifies the width of the polyline. If not specified, the default value is 1.0.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeWidthPropertyReference(String identifier, String[] propertyNames) {
        {
            DoubleCesiumWriter writer = openWidthProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Gets the writer for the {@code granularity} property. The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing. The {@code granularity} property defines the sampling distance, in radians. If not specified, the default value is π / 180.0.
    */
    @Nonnull
    public final DoubleCesiumWriter getGranularityWriter() {
        return m_granularity.getValue();
    }

    /**
    * Opens and returns the writer for the {@code granularity} property. The {@code granularity} property defines the sampling distance, in radians. If not specified, the default value is π / 180.0.
    */
    @Nonnull
    public final DoubleCesiumWriter openGranularityProperty() {
        openIntervalIfNecessary();
        return this.<DoubleCesiumWriter> openAndReturn(getGranularityWriter());
    }

    /**
    * Writes a value for the {@code granularity} property as a {@code number} value. The {@code granularity} property specifies the sampling distance, in radians. If not specified, the default value is π / 180.0.
    * @param value The value.
    */
    public final void writeGranularityProperty(double value) {
        {
            DoubleCesiumWriter writer = openGranularityProperty();
            try {
                writer.writeNumber(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code granularity} property as a {@code number} value. The {@code granularity} property specifies the sampling distance, in radians. If not specified, the default value is π / 180.0.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeGranularityProperty(List<JulianDate> dates, List<Double> values) {
        {
            DoubleCesiumWriter writer = openGranularityProperty();
            try {
                writer.writeNumber(dates, values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code granularity} property as a {@code number} value. The {@code granularity} property specifies the sampling distance, in radians. If not specified, the default value is π / 180.0.
    * @param dates The dates at which the value is specified.
    * @param values The value corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeGranularityProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
        {
            DoubleCesiumWriter writer = openGranularityProperty();
            try {
                writer.writeNumber(dates, values, startIndex, length);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code granularity} property as a {@code reference} value. The {@code granularity} property specifies the sampling distance, in radians. If not specified, the default value is π / 180.0.
    * @param value The reference.
    */
    public final void writeGranularityPropertyReference(Reference value) {
        {
            DoubleCesiumWriter writer = openGranularityProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code granularity} property as a {@code reference} value. The {@code granularity} property specifies the sampling distance, in radians. If not specified, the default value is π / 180.0.
    * @param value The reference.
    */
    public final void writeGranularityPropertyReference(String value) {
        {
            DoubleCesiumWriter writer = openGranularityProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code granularity} property as a {@code reference} value. The {@code granularity} property specifies the sampling distance, in radians. If not specified, the default value is π / 180.0.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeGranularityPropertyReference(String identifier, String propertyName) {
        {
            DoubleCesiumWriter writer = openGranularityProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code granularity} property as a {@code reference} value. The {@code granularity} property specifies the sampling distance, in radians. If not specified, the default value is π / 180.0.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeGranularityPropertyReference(String identifier, String[] propertyNames) {
        {
            DoubleCesiumWriter writer = openGranularityProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Gets the writer for the {@code material} property. The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing. The {@code material} property defines the material to use to draw the polyline. If not specified, the default value is solid white.
    */
    @Nonnull
    public final PolylineMaterialCesiumWriter getMaterialWriter() {
        return m_material.getValue();
    }

    /**
    * Opens and returns the writer for the {@code material} property. The {@code material} property defines the material to use to draw the polyline. If not specified, the default value is solid white.
    */
    @Nonnull
    public final PolylineMaterialCesiumWriter openMaterialProperty() {
        openIntervalIfNecessary();
        return this.<PolylineMaterialCesiumWriter> openAndReturn(getMaterialWriter());
    }

    /**
    * Gets the writer for the {@code followSurface} property. The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing. The {@code followSurface} property defines whether or not the positions are connected as great arcs (the default) or as straight lines. This property has been superseded by {@code arcType}, which should be used instead. If not specified, the default value is {@code true}.
    */
    @Nonnull
    public final BooleanCesiumWriter getFollowSurfaceWriter() {
        return m_followSurface.getValue();
    }

    /**
    * Opens and returns the writer for the {@code followSurface} property. The {@code followSurface} property defines whether or not the positions are connected as great arcs (the default) or as straight lines. This property has been superseded by {@code arcType}, which should be used instead. If not specified, the default value is {@code true}.
    */
    @Nonnull
    public final BooleanCesiumWriter openFollowSurfaceProperty() {
        openIntervalIfNecessary();
        return this.<BooleanCesiumWriter> openAndReturn(getFollowSurfaceWriter());
    }

    /**
    * Writes a value for the {@code followSurface} property as a {@code boolean} value. The {@code followSurface} property specifies whether or not the positions are connected as great arcs (the default) or as straight lines. This property has been superseded by {@code arcType}, which should be used instead. If not specified, the default value is {@code true}.
    * @param value The value.
    */
    public final void writeFollowSurfaceProperty(boolean value) {
        {
            BooleanCesiumWriter writer = openFollowSurfaceProperty();
            try {
                writer.writeBoolean(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code followSurface} property as a {@code reference} value. The {@code followSurface} property specifies whether or not the positions are connected as great arcs (the default) or as straight lines. This property has been superseded by {@code arcType}, which should be used instead. If not specified, the default value is {@code true}.
    * @param value The reference.
    */
    public final void writeFollowSurfacePropertyReference(Reference value) {
        {
            BooleanCesiumWriter writer = openFollowSurfaceProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code followSurface} property as a {@code reference} value. The {@code followSurface} property specifies whether or not the positions are connected as great arcs (the default) or as straight lines. This property has been superseded by {@code arcType}, which should be used instead. If not specified, the default value is {@code true}.
    * @param value The reference.
    */
    public final void writeFollowSurfacePropertyReference(String value) {
        {
            BooleanCesiumWriter writer = openFollowSurfaceProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code followSurface} property as a {@code reference} value. The {@code followSurface} property specifies whether or not the positions are connected as great arcs (the default) or as straight lines. This property has been superseded by {@code arcType}, which should be used instead. If not specified, the default value is {@code true}.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeFollowSurfacePropertyReference(String identifier, String propertyName) {
        {
            BooleanCesiumWriter writer = openFollowSurfaceProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code followSurface} property as a {@code reference} value. The {@code followSurface} property specifies whether or not the positions are connected as great arcs (the default) or as straight lines. This property has been superseded by {@code arcType}, which should be used instead. If not specified, the default value is {@code true}.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeFollowSurfacePropertyReference(String identifier, String[] propertyNames) {
        {
            BooleanCesiumWriter writer = openFollowSurfaceProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Gets the writer for the {@code shadows} property. The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing. The {@code shadows} property defines whether or not the polyline casts or receives shadows. If not specified, the default value is DISABLED.
    */
    @Nonnull
    public final ShadowModeCesiumWriter getShadowsWriter() {
        return m_shadows.getValue();
    }

    /**
    * Opens and returns the writer for the {@code shadows} property. The {@code shadows} property defines whether or not the polyline casts or receives shadows. If not specified, the default value is DISABLED.
    */
    @Nonnull
    public final ShadowModeCesiumWriter openShadowsProperty() {
        openIntervalIfNecessary();
        return this.<ShadowModeCesiumWriter> openAndReturn(getShadowsWriter());
    }

    /**
    * Writes a value for the {@code shadows} property as a {@code shadowMode} value. The {@code shadows} property specifies whether or not the polyline casts or receives shadows. If not specified, the default value is DISABLED.
    * @param value The shadow mode.
    */
    public final void writeShadowsProperty(@Nonnull CesiumShadowMode value) {
        {
            ShadowModeCesiumWriter writer = openShadowsProperty();
            try {
                writer.writeShadowMode(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code shadows} property as a {@code reference} value. The {@code shadows} property specifies whether or not the polyline casts or receives shadows. If not specified, the default value is DISABLED.
    * @param value The reference.
    */
    public final void writeShadowsPropertyReference(Reference value) {
        {
            ShadowModeCesiumWriter writer = openShadowsProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code shadows} property as a {@code reference} value. The {@code shadows} property specifies whether or not the polyline casts or receives shadows. If not specified, the default value is DISABLED.
    * @param value The reference.
    */
    public final void writeShadowsPropertyReference(String value) {
        {
            ShadowModeCesiumWriter writer = openShadowsProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code shadows} property as a {@code reference} value. The {@code shadows} property specifies whether or not the polyline casts or receives shadows. If not specified, the default value is DISABLED.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeShadowsPropertyReference(String identifier, String propertyName) {
        {
            ShadowModeCesiumWriter writer = openShadowsProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code shadows} property as a {@code reference} value. The {@code shadows} property specifies whether or not the polyline casts or receives shadows. If not specified, the default value is DISABLED.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeShadowsPropertyReference(String identifier, String[] propertyNames) {
        {
            ShadowModeCesiumWriter writer = openShadowsProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Gets the writer for the {@code depthFailMaterial} property. The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing. The {@code depthFailMaterial} property defines the material to use to draw the polyline when it is below the terrain.
    */
    @Nonnull
    public final PolylineMaterialCesiumWriter getDepthFailMaterialWriter() {
        return m_depthFailMaterial.getValue();
    }

    /**
    * Opens and returns the writer for the {@code depthFailMaterial} property. The {@code depthFailMaterial} property defines the material to use to draw the polyline when it is below the terrain.
    */
    @Nonnull
    public final PolylineMaterialCesiumWriter openDepthFailMaterialProperty() {
        openIntervalIfNecessary();
        return this.<PolylineMaterialCesiumWriter> openAndReturn(getDepthFailMaterialWriter());
    }

    /**
    * Gets the writer for the {@code distanceDisplayCondition} property. The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing. The {@code distanceDisplayCondition} property defines the display condition specifying at what distance from the camera this polyline will be displayed.
    */
    @Nonnull
    public final DistanceDisplayConditionCesiumWriter getDistanceDisplayConditionWriter() {
        return m_distanceDisplayCondition.getValue();
    }

    /**
    * Opens and returns the writer for the {@code distanceDisplayCondition} property. The {@code distanceDisplayCondition} property defines the display condition specifying at what distance from the camera this polyline will be displayed.
    */
    @Nonnull
    public final DistanceDisplayConditionCesiumWriter openDistanceDisplayConditionProperty() {
        openIntervalIfNecessary();
        return this.<DistanceDisplayConditionCesiumWriter> openAndReturn(getDistanceDisplayConditionWriter());
    }

    /**
    * Writes a value for the {@code distanceDisplayCondition} property as a {@code distanceDisplayCondition} value. The {@code distanceDisplayCondition} property specifies the display condition specifying at what distance from the camera this polyline will be displayed.
    * @param value The value.
    */
    public final void writeDistanceDisplayConditionProperty(@Nonnull Bounds value) {
        {
            DistanceDisplayConditionCesiumWriter writer = openDistanceDisplayConditionProperty();
            try {
                writer.writeDistanceDisplayCondition(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code distanceDisplayCondition} property as a {@code distanceDisplayCondition} value. The {@code distanceDisplayCondition} property specifies the display condition specifying at what distance from the camera this polyline will be displayed.
    * @param lowerBound The lower bound.
    * @param upperBound The upper bound.
    */
    public final void writeDistanceDisplayConditionProperty(double lowerBound, double upperBound) {
        {
            DistanceDisplayConditionCesiumWriter writer = openDistanceDisplayConditionProperty();
            try {
                writer.writeDistanceDisplayCondition(lowerBound, upperBound);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code distanceDisplayCondition} property as a {@code distanceDisplayCondition} value. The {@code distanceDisplayCondition} property specifies the display condition specifying at what distance from the camera this polyline will be displayed.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeDistanceDisplayConditionProperty(List<JulianDate> dates, List<Bounds> values) {
        {
            DistanceDisplayConditionCesiumWriter writer = openDistanceDisplayConditionProperty();
            try {
                writer.writeDistanceDisplayCondition(dates, values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code distanceDisplayCondition} property as a {@code distanceDisplayCondition} value. The {@code distanceDisplayCondition} property specifies the display condition specifying at what distance from the camera this polyline will be displayed.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeDistanceDisplayConditionProperty(List<JulianDate> dates, List<Bounds> values, int startIndex, int length) {
        {
            DistanceDisplayConditionCesiumWriter writer = openDistanceDisplayConditionProperty();
            try {
                writer.writeDistanceDisplayCondition(dates, values, startIndex, length);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code distanceDisplayCondition} property as a {@code reference} value. The {@code distanceDisplayCondition} property specifies the display condition specifying at what distance from the camera this polyline will be displayed.
    * @param value The reference.
    */
    public final void writeDistanceDisplayConditionPropertyReference(Reference value) {
        {
            DistanceDisplayConditionCesiumWriter writer = openDistanceDisplayConditionProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code distanceDisplayCondition} property as a {@code reference} value. The {@code distanceDisplayCondition} property specifies the display condition specifying at what distance from the camera this polyline will be displayed.
    * @param value The reference.
    */
    public final void writeDistanceDisplayConditionPropertyReference(String value) {
        {
            DistanceDisplayConditionCesiumWriter writer = openDistanceDisplayConditionProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code distanceDisplayCondition} property as a {@code reference} value. The {@code distanceDisplayCondition} property specifies the display condition specifying at what distance from the camera this polyline will be displayed.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeDistanceDisplayConditionPropertyReference(String identifier, String propertyName) {
        {
            DistanceDisplayConditionCesiumWriter writer = openDistanceDisplayConditionProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code distanceDisplayCondition} property as a {@code reference} value. The {@code distanceDisplayCondition} property specifies the display condition specifying at what distance from the camera this polyline will be displayed.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeDistanceDisplayConditionPropertyReference(String identifier, String[] propertyNames) {
        {
            DistanceDisplayConditionCesiumWriter writer = openDistanceDisplayConditionProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Gets the writer for the {@code clampToGround} property. The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing. The {@code clampToGround} property defines whether or not the polyline should be clamped to the ground. If not specified, the default value is {@code false}.
    */
    @Nonnull
    public final BooleanCesiumWriter getClampToGroundWriter() {
        return m_clampToGround.getValue();
    }

    /**
    * Opens and returns the writer for the {@code clampToGround} property. The {@code clampToGround} property defines whether or not the polyline should be clamped to the ground. If not specified, the default value is {@code false}.
    */
    @Nonnull
    public final BooleanCesiumWriter openClampToGroundProperty() {
        openIntervalIfNecessary();
        return this.<BooleanCesiumWriter> openAndReturn(getClampToGroundWriter());
    }

    /**
    * Writes a value for the {@code clampToGround} property as a {@code boolean} value. The {@code clampToGround} property specifies whether or not the polyline should be clamped to the ground. If not specified, the default value is {@code false}.
    * @param value The value.
    */
    public final void writeClampToGroundProperty(boolean value) {
        {
            BooleanCesiumWriter writer = openClampToGroundProperty();
            try {
                writer.writeBoolean(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code clampToGround} property as a {@code reference} value. The {@code clampToGround} property specifies whether or not the polyline should be clamped to the ground. If not specified, the default value is {@code false}.
    * @param value The reference.
    */
    public final void writeClampToGroundPropertyReference(Reference value) {
        {
            BooleanCesiumWriter writer = openClampToGroundProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code clampToGround} property as a {@code reference} value. The {@code clampToGround} property specifies whether or not the polyline should be clamped to the ground. If not specified, the default value is {@code false}.
    * @param value The reference.
    */
    public final void writeClampToGroundPropertyReference(String value) {
        {
            BooleanCesiumWriter writer = openClampToGroundProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code clampToGround} property as a {@code reference} value. The {@code clampToGround} property specifies whether or not the polyline should be clamped to the ground. If not specified, the default value is {@code false}.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeClampToGroundPropertyReference(String identifier, String propertyName) {
        {
            BooleanCesiumWriter writer = openClampToGroundProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code clampToGround} property as a {@code reference} value. The {@code clampToGround} property specifies whether or not the polyline should be clamped to the ground. If not specified, the default value is {@code false}.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeClampToGroundPropertyReference(String identifier, String[] propertyNames) {
        {
            BooleanCesiumWriter writer = openClampToGroundProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Gets the writer for the {@code classificationType} property. The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing. The {@code classificationType} property defines whether a classification affects terrain, 3D Tiles, or both. If not specified, the default value is BOTH.
    */
    @Nonnull
    public final ClassificationTypeCesiumWriter getClassificationTypeWriter() {
        return m_classificationType.getValue();
    }

    /**
    * Opens and returns the writer for the {@code classificationType} property. The {@code classificationType} property defines whether a classification affects terrain, 3D Tiles, or both. If not specified, the default value is BOTH.
    */
    @Nonnull
    public final ClassificationTypeCesiumWriter openClassificationTypeProperty() {
        openIntervalIfNecessary();
        return this.<ClassificationTypeCesiumWriter> openAndReturn(getClassificationTypeWriter());
    }

    /**
    * Writes a value for the {@code classificationType} property as a {@code classificationType} value. The {@code classificationType} property specifies whether a classification affects terrain, 3D Tiles, or both. If not specified, the default value is BOTH.
    * @param value The classification type.
    */
    public final void writeClassificationTypeProperty(@Nonnull CesiumClassificationType value) {
        {
            ClassificationTypeCesiumWriter writer = openClassificationTypeProperty();
            try {
                writer.writeClassificationType(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code classificationType} property as a {@code reference} value. The {@code classificationType} property specifies whether a classification affects terrain, 3D Tiles, or both. If not specified, the default value is BOTH.
    * @param value The reference.
    */
    public final void writeClassificationTypePropertyReference(Reference value) {
        {
            ClassificationTypeCesiumWriter writer = openClassificationTypeProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code classificationType} property as a {@code reference} value. The {@code classificationType} property specifies whether a classification affects terrain, 3D Tiles, or both. If not specified, the default value is BOTH.
    * @param value The reference.
    */
    public final void writeClassificationTypePropertyReference(String value) {
        {
            ClassificationTypeCesiumWriter writer = openClassificationTypeProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code classificationType} property as a {@code reference} value. The {@code classificationType} property specifies whether a classification affects terrain, 3D Tiles, or both. If not specified, the default value is BOTH.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeClassificationTypePropertyReference(String identifier, String propertyName) {
        {
            ClassificationTypeCesiumWriter writer = openClassificationTypeProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code classificationType} property as a {@code reference} value. The {@code classificationType} property specifies whether a classification affects terrain, 3D Tiles, or both. If not specified, the default value is BOTH.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeClassificationTypePropertyReference(String identifier, String[] propertyNames) {
        {
            ClassificationTypeCesiumWriter writer = openClassificationTypeProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Gets the writer for the {@code zIndex} property. The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing. The {@code zIndex} property defines the z-index of the polyline, used for ordering ground geometry. Only has an effect if the polyline is constant, and {@code clampToGround} is true. If not specified, the default value is 0.
    */
    @Nonnull
    public final IntegerCesiumWriter getZIndexWriter() {
        return m_zIndex.getValue();
    }

    /**
    * Opens and returns the writer for the {@code zIndex} property. The {@code zIndex} property defines the z-index of the polyline, used for ordering ground geometry. Only has an effect if the polyline is constant, and {@code clampToGround} is true. If not specified, the default value is 0.
    */
    @Nonnull
    public final IntegerCesiumWriter openZIndexProperty() {
        openIntervalIfNecessary();
        return this.<IntegerCesiumWriter> openAndReturn(getZIndexWriter());
    }

    /**
    * Writes a value for the {@code zIndex} property as a {@code number} value. The {@code zIndex} property specifies the z-index of the polyline, used for ordering ground geometry. Only has an effect if the polyline is constant, and {@code clampToGround} is true. If not specified, the default value is 0.
    * @param value The value.
    */
    public final void writeZIndexProperty(int value) {
        {
            IntegerCesiumWriter writer = openZIndexProperty();
            try {
                writer.writeNumber(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code zIndex} property as a {@code number} value. The {@code zIndex} property specifies the z-index of the polyline, used for ordering ground geometry. Only has an effect if the polyline is constant, and {@code clampToGround} is true. If not specified, the default value is 0.
    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeZIndexProperty(List<JulianDate> dates, List<Integer> values) {
        {
            IntegerCesiumWriter writer = openZIndexProperty();
            try {
                writer.writeNumber(dates, values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code zIndex} property as a {@code number} value. The {@code zIndex} property specifies the z-index of the polyline, used for ordering ground geometry. Only has an effect if the polyline is constant, and {@code clampToGround} is true. If not specified, the default value is 0.
    * @param dates The dates at which the value is specified.
    * @param values The value corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeZIndexProperty(List<JulianDate> dates, List<Integer> values, int startIndex, int length) {
        {
            IntegerCesiumWriter writer = openZIndexProperty();
            try {
                writer.writeNumber(dates, values, startIndex, length);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code zIndex} property as a {@code reference} value. The {@code zIndex} property specifies the z-index of the polyline, used for ordering ground geometry. Only has an effect if the polyline is constant, and {@code clampToGround} is true. If not specified, the default value is 0.
    * @param value The reference.
    */
    public final void writeZIndexPropertyReference(Reference value) {
        {
            IntegerCesiumWriter writer = openZIndexProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code zIndex} property as a {@code reference} value. The {@code zIndex} property specifies the z-index of the polyline, used for ordering ground geometry. Only has an effect if the polyline is constant, and {@code clampToGround} is true. If not specified, the default value is 0.
    * @param value The reference.
    */
    public final void writeZIndexPropertyReference(String value) {
        {
            IntegerCesiumWriter writer = openZIndexProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code zIndex} property as a {@code reference} value. The {@code zIndex} property specifies the z-index of the polyline, used for ordering ground geometry. Only has an effect if the polyline is constant, and {@code clampToGround} is true. If not specified, the default value is 0.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeZIndexPropertyReference(String identifier, String propertyName) {
        {
            IntegerCesiumWriter writer = openZIndexProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    * Writes a value for the {@code zIndex} property as a {@code reference} value. The {@code zIndex} property specifies the z-index of the polyline, used for ordering ground geometry. Only has an effect if the polyline is constant, and {@code clampToGround} is true. If not specified, the default value is 0.
    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeZIndexPropertyReference(String identifier, String[] propertyNames) {
        {
            IntegerCesiumWriter writer = openZIndexProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }
}