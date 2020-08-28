package aurora.cesium.element.graphics;

import aurora.cesium.element.property.BooleanProperty;
import aurora.cesium.element.property.DoubleProperty;
import aurora.cesium.element.property.UriProperty;
import aurora.cesium.language.writer.TilesetCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface TilesetGraphics extends Graphics<TilesetGraphics, TilesetCesiumWriter> {

    static TilesetGraphicsAdapter.Builder newBuilder() {
        return TilesetGraphicsAdapter.Builder.newBuilder();
    }

    DoubleProperty getMaximumScreenSpaceError();

    @Override
    BooleanProperty getShow();

    UriProperty getUri();

    @Override
    TimeInterval getInterval();

    @Override
    List<TilesetGraphics> getIntervals();

    @Override
    void dispatch(TilesetCesiumWriter writer);
}
