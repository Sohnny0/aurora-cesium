package aurora.cesium.element.property;

import aurora.cesium.language.writer.BooleanCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface BooleanProperty extends IntervalProperty<BooleanProperty>, ReferenceProperty {

    static BooleanProperty from(Boolean value) {
        return newBuilder().withValue(value).build();
    }

    static DefaultBooleanProperty.Builder newBuilder() {
        return DefaultBooleanProperty.Builder.newBuilder();
    }

    @Override
    TimeInterval getInterval();

    @Override
    List<BooleanProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(BooleanCesiumWriter writer);
}
