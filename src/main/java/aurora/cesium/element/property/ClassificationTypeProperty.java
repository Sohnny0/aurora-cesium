package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumClassificationType;
import aurora.cesium.language.writer.ClassificationTypeCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/23
 */
public interface ClassificationTypeProperty extends IntervalProperty<ClassificationTypeProperty>, ReferenceProperty {

    CesiumClassificationType getClassificationType();

    @Override
    TimeInterval getInterval();

    @Override
    List<ClassificationTypeProperty> getIntervals();

    @Override
    Reference getReference();

    void dispatch(ClassificationTypeCesiumWriter writer);
}