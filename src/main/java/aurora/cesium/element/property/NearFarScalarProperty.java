package aurora.cesium.element.property;

import aurora.cesium.language.writer.NearFarScalar;
import aurora.cesium.language.writer.NearFarScalarCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface NearFarScalarProperty extends InterpolatableProperty, IntervalProperty<NearFarScalarProperty>, ReferenceProperty {

    static NearFarScalarProperty from(NearFarScalar value) {
        return newBuilder().withValue(value).build();
    }

    static DefaultNearFarScalarProperty.Builder newBuilder() {
        return DefaultNearFarScalarProperty.Builder.newBuilder();
    }

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<NearFarScalarProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(NearFarScalarCesiumWriter writer);
}
