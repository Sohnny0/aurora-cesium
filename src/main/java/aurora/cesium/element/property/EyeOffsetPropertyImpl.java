package aurora.cesium.element.property;

import aurora.cesium.language.writer.EyeOffsetCesiumWriter;
import aurora.cesium.language.writer.Reference;
import aurora.cesium.language.writer.TimeInterval;

import java.util.List;
import java.util.Optional;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
public class EyeOffsetPropertyImpl extends PropertyAdapter<EyeOffsetProperty> implements EyeOffsetProperty {

    private CartesianProperty cartesian;

    @Override
    public void dispatch(EyeOffsetCesiumWriter writer) {
        try (writer) {
            Optional.ofNullable(getCartesian()).ifPresent(cartesianProperty -> cartesianProperty.dispatchCartesian(writer));
            dispatchInterpolations(writer);
            dispatchInterval(writer, (intervalWriter, property) -> property.dispatch(intervalWriter));
            dispatchReference(writer);
        }
    }

    @Override
    public CartesianProperty getCartesian() {
        return cartesian;
    }

    public void setCartesian(CartesianProperty cartesian) {
        this.cartesian = cartesian;
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
    public List<EyeOffsetProperty> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<EyeOffsetProperty> intervals) {
        this.intervals = intervals;
    }

    @Override
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    public static final class Builder {
        private CartesianProperty cartesian;

        protected Interpolations interpolations;
        protected TimeInterval interval;
        protected List<EyeOffsetProperty> intervals;
        protected Reference reference;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withCartesian(CartesianProperty cartesian) {
            this.cartesian = cartesian;
            return this;
        }

        public Builder withInterpolations(Interpolations interpolations) {
            this.interpolations = interpolations;
            return this;
        }

        public Builder withInterval(TimeInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder withIntervals(List<EyeOffsetProperty> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder withReference(Reference reference) {
            this.reference = reference;
            return this;
        }

        public EyeOffsetPropertyImpl build() {
            EyeOffsetPropertyImpl eyeOffsetPropertyImpl = new EyeOffsetPropertyImpl();
            eyeOffsetPropertyImpl.setCartesian(cartesian);
            eyeOffsetPropertyImpl.setInterpolations(interpolations);
            eyeOffsetPropertyImpl.setInterval(interval);
            eyeOffsetPropertyImpl.setIntervals(intervals);
            eyeOffsetPropertyImpl.setReference(reference);
            return eyeOffsetPropertyImpl;
        }
    }
}