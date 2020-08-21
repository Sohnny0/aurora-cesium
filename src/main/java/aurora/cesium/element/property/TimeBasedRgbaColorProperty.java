package aurora.cesium.element.property;

import aurora.cesium.language.writer.ColorCesiumWriter;
import aurora.cesium.language.writer.JulianDate;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.awt.*;
import java.util.List;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class TimeBasedRgbaColorProperty extends SingleTimeBasedPropertyAdapter<Color> implements ColorProperty {

    public TimeBasedRgbaColorProperty() {
        super();
    }

    public TimeBasedRgbaColorProperty(List<JulianDate> dates, List<Color> instance) {
        super(dates, instance);
    }

    public TimeBasedRgbaColorProperty(List<JulianDate> dates, List<Color> instance, Interpolations interpolations) {
        super(dates, instance, interpolations);
    }

    public TimeBasedRgbaColorProperty(List<JulianDate> dates, List<Color> instance, TimeInterval interval) {
        super(dates, instance, interval);
    }

    public TimeBasedRgbaColorProperty(List<JulianDate> dates, List<Color> instance, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, interpolations, interval);
    }

    public TimeBasedRgbaColorProperty(List<JulianDate> dates, List<Color> instance, Integer startIndex, Integer length) {
        super(dates, instance, startIndex, length);
    }

    public TimeBasedRgbaColorProperty(List<JulianDate> dates, List<Color> instance, Integer startIndex, Integer length, Interpolations interpolations) {
        super(dates, instance, startIndex, length, interpolations);
    }

    public TimeBasedRgbaColorProperty(List<JulianDate> dates, List<Color> instance, Integer startIndex, Integer length, TimeInterval interval) {
        super(dates, instance, startIndex, length, interval);
    }

    public TimeBasedRgbaColorProperty(List<JulianDate> dates, List<Color> instance, Integer startIndex, Integer length, Interpolations interpolations, TimeInterval interval) {
        super(dates, instance, startIndex, length, interpolations, interval);
    }

    public TimeBasedRgbaColorProperty(Reference reference) {
        super(reference);
    }

    @Override
    public void dispatchColor(ColorCesiumWriter writer) {
        try (writer) {
            dispatchConsumer(writer::writeRgba, writer::writeRgba);
            dispatchInterpolations(writer);
            dispatchInterval(writer);
            dispatchReference(writer);
        }
    }

    public List<Color> getColors() {
        return instance;
    }

    public void setColors(List<Color> colors) {
        this.instance = colors;
    }

    @Override
    public Interpolations getInterpolations() {
        return interpolations;
    }

    public void setInterpolations(Interpolations interpolations) {
        this.interpolations = interpolations;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}
