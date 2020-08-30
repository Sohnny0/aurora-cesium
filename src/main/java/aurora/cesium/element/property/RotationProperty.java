package aurora.cesium.element.property;

import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.RotationCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;
import aurora.cesium.language.writer.UnitQuaternion;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public interface RotationProperty extends InterpolatableProperty, IntervalProperty<RotationProperty>, ReferenceProperty {

    static RotationProperty from(UnitQuaternion unitQuaternion) {
        return from(UnitQuaternionProperty.from(unitQuaternion));
    }

    static RotationProperty from(UnitQuaternionProperty unitQuaternionProperty) {
        return newBuilder().withUnitQuaternion(unitQuaternionProperty).build();
    }

    static RotationProperty from(Reference reference) {
        return newBuilder().withReference(reference).build();
    }

    static RotationPropertyImpl.Builder newBuilder() {
        return RotationPropertyImpl.Builder.newBuilder();
    }

    UnitQuaternionProperty getUnitQuaternion();

    @Override
    Interpolations getInterpolations();

    @Override
    TimeInterval getInterval();

    @Override
    List<RotationProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(RotationCesiumWriter writer);
}