package aurora.cesium.element.property;

import aurora.cesium.language.writer.TimeInterval;

/**
 * @author hanhaoran
 * @date 2020/8/20
 */
abstract class BaseIntervalProperty extends BaseProperty implements IntervalProperty {

    protected TimeInterval interval;

    public BaseIntervalProperty() {
        super();
    }

    @Override
    public TimeInterval getInterval() {
        return interval;
    }

    @Override
    public void setInterval(TimeInterval interval) {
        this.interval = interval;
    }
}
