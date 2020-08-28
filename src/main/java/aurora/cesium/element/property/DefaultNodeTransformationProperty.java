package aurora.cesium.element.property;

import aurora.cesium.language.writer.NodeTransformationCesiumWriter;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/28
 */
public class DefaultNodeTransformationProperty extends PropertyAdapter<NodeTransformationProperty> implements NodeTransformationProperty {

    private String name;

    private RotationProperty rotation;

    private ScaleProperty scale;

    private TranslationProperty translation;

    @Override
    public void dispatch(NodeTransformationCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getRotation()).ifPresent(rotationProperty -> rotationProperty.dispatch(writer.openRotationProperty()));
            Optional.ofNullable(getScale()).ifPresent(scaleProperty -> scaleProperty.dispatch(writer.openScaleProperty()));
            Optional.ofNullable(getTranslation()).ifPresent(translationProperty -> translationProperty.dispatch(writer.openTranslationProperty()));
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public RotationProperty getRotation() {
        return rotation;
    }

    public void setRotation(RotationProperty rotation) {
        this.rotation = rotation;
    }

    @Override
    public ScaleProperty getScale() {
        return scale;
    }

    public void setScale(ScaleProperty scale) {
        this.scale = scale;
    }

    @Override
    public TranslationProperty getTranslation() {
        return translation;
    }

    public void setTranslation(TranslationProperty translation) {
        this.translation = translation;
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }

    @Override
    public List<NodeTransformationProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<NodeTransformationProperty> intervals) {
        this.intervals = intervals;
    }

    public static final class Builder {
        private String name;
        private RotationProperty rotation;
        private ScaleProperty scale;
        private TranslationProperty translation;

        protected TimeInterval interval;
        protected List<NodeTransformationProperty> intervals;

        private Builder(String name) {
            this.name = name;
        }

        public static Builder newBuilder(String name) {
            return new Builder(name);
        }

        public Builder withRotation(RotationProperty rotation) {
            this.rotation = rotation;
            return this;
        }

        public Builder withScale(ScaleProperty scale) {
            this.scale = scale;
            return this;
        }

        public Builder withTranslation(TranslationProperty translation) {
            this.translation = translation;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<NodeTransformationProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public DefaultNodeTransformationProperty build() {
            DefaultNodeTransformationProperty defaultNodeTransformationProperty = new DefaultNodeTransformationProperty();
            defaultNodeTransformationProperty.setName(name);
            defaultNodeTransformationProperty.setRotation(rotation);
            defaultNodeTransformationProperty.setScale(scale);
            defaultNodeTransformationProperty.setTranslation(translation);
            defaultNodeTransformationProperty.setInterval(interval);
            defaultNodeTransformationProperty.setIntervals(intervals);
            return defaultNodeTransformationProperty;
        }
    }
}
