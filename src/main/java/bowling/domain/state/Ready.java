package bowling.domain.state;

import bowling.domain.pins.Pins;

public class Ready implements Playing {

    private Ready() {
    }

    public static State of() {
        return new Ready();
    }

    @Override
    public State bowl(Pins pins) {
        if (isStrike(pins)) {
            return Strike.of();
        }
        return FirstBowl.of(pins);
    }

    private boolean isStrike(Pins pins) {
        return Pins.MAX_PIN_NUMBER == pins.getPins();
    }
}
