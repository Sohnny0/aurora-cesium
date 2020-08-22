package aurora.cesium.element;

import aurora.cesium.element.graphics.*;
import aurora.cesium.element.property.*;
import aurora.cesium.language.writer.PacketCesiumWriter;

/**
 * @author hanhaoran
 * @date 2020/8/21
 */
public interface Entity extends Element {

    static EntityAdapter.Builder newBuilder() {
        return EntityAdapter.Builder.newBuilder();
    }

    @Override
    String getId();

    @Override
    String getName();

    Entity getParent();

    StringProperty getDescription();

    AvailabilityProperty getAvailability();

    OrientationProperty getOrientation();

    PositionProperty getPosition();

    ViewFromProperty getViewFrom();

    BillboardGraphics getBillboard();

    BoxGraphics getBox();

    CorridorGraphics getCorridor();

    CylinderGraphics getCylinder();

    EllipseGraphics getEllipse();

    EllipsoidGraphics getEllipsoid();

    LabelGraphics getLabel();

    ModelGraphics getModel();

    PathGraphics getPath();

    PointGraphics getPoint();

    PolygonGraphics getPolygon();

    PolylineGraphics getPolyline();

    RectangleGraphics getRectangle();

    TilesetGraphics getTileset();

    WallGraphics getWall();

    void dispatch(PacketCesiumWriter writer);
}