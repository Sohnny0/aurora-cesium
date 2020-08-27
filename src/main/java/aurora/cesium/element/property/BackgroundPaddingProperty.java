package aurora.cesium.element.property;

import aurora.cesium.language.writer.BackgroundPaddingCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface BackgroundPaddingProperty extends MultiIntervalProperty<BackgroundPaddingCesiumWriter, BackgroundPaddingProperty>, ReferenceProperty {

    RectangularProperty getRectangular();

    @Override
    TimeInterval getInterval();

    @Override
    List<BackgroundPaddingProperty> getIntervals();

    @Override
    Reference getReference();

    @Override
    void dispatch(BackgroundPaddingCesiumWriter writer);
}
