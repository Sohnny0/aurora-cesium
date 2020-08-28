package aurora.cesium.element.property;

import aurora.cesium.language.writer.*;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/27
 */
public interface PositionListProperty extends MultiIntervalProperty<PositionListProperty>, ReferencesProperty {

    static DefaultPositionListProperty.Builder newBuilder() {
        return DefaultPositionListProperty.Builder.newBuilder();
    }

    Iterable<Cartesian> getCartesians();

    Iterable<Cartographic> getCartographicDegrees();

    Iterable<Cartographic> getCartographicRadians();

    @Override
    TimeInterval getInterval();

    @Override
    List<PositionListProperty> getIntervals();

    @Override
    Iterable<Reference> getReferences();

    void dispatch(PositionListCesiumWriter writer);
}
