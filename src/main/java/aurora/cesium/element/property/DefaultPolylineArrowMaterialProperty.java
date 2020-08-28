package aurora.cesium.element.property;

import aurora.cesium.language.writer.PolylineArrowMaterialCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public class DefaultPolylineArrowMaterialProperty extends PropertyAdapter<PolylineArrowMaterialProperty> implements PolylineArrowMaterialProperty {

    private ColorProperty color;

    @Override
    public void dispatch(PolylineArrowMaterialCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getColor()).ifPresent(colorProperty -> colorProperty.dispatch(writer.openColorProperty()));
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
        }
    }

    @Override
    public ColorProperty getColor() {
        return color;
    }

    public void setColor(ColorProperty color) {
        this.color = color;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<PolylineArrowMaterialProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<PolylineArrowMaterialProperty> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        private ColorProperty color;

        protected TimeInterval interval;
        protected List<PolylineArrowMaterialProperty> intervals;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withColor(ColorProperty color) {
            this.color = color;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<PolylineArrowMaterialProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public DefaultPolylineArrowMaterialProperty build() {
            DefaultPolylineArrowMaterialProperty defaultPolylineMaterialArrowProperty = new DefaultPolylineArrowMaterialProperty();
            defaultPolylineMaterialArrowProperty.setColor(color);
            defaultPolylineMaterialArrowProperty.setInterval(interval);
            defaultPolylineMaterialArrowProperty.setIntervals(intervals);
            return defaultPolylineMaterialArrowProperty;
        }
    }
}
