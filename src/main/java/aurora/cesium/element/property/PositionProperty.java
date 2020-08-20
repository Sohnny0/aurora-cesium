package aurora.cesium.element.property;

import aurora.cesium.language.writer.CesiumInterpolationAlgorithm;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public interface PositionProperty extends IntervalProperty {

    CesiumInterpolationAlgorithm getInterpolationAlgorithm();

    Integer getInterpolationDegree();

    CoordinateProperty getCoordinate();
}