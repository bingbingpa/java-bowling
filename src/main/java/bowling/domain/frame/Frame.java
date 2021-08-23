package bowling.domain.frame;

import bowling.domain.pins.Pins;
import bowling.domain.state.State;

import java.util.List;

public interface Frame {

    int getFrameNumber();

    Frame bowl(Pins pins);

    boolean isFinish();

    List<State> getState();
}
