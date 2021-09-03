package bowling.domain.frame;

import bowling.domain.pins.Pins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Frames {

    private static final int START_NUMBER = 1;
    private static final int END_NUMBER = 10;

    private final List<Frame> frames;

    private Frames() {
        this.frames = new ArrayList<>();
        frames.add(NormalFrame.of(START_NUMBER));
    }

    public static Frames of() {
        return new Frames();
    }

    public void bowl(Pins pins) {
        Frame frame = getLastFrame();
        Frame next = frame.bowl(pins);

        if (frame.isFinish()) {
            checkLastFrame();
            frames.add(next);
        }
    }

    public boolean isFinish() {
        return frames.size() == END_NUMBER && getLastFrame().isFinish();
    }

    public boolean isTurnOver() {
        Frame lastFrame = getLastFrame();
        return lastFrame.isFinish() || lastFrame.isReady();
    }

    public List<Frame> getFrames() {
        return Collections.unmodifiableList(frames);
    }

    public Frame getLastFrame() {
        return frames.get(frames.size() - 1);
    }

    private void checkLastFrame() {
        if (frames.size() == END_NUMBER) {
            frames.remove(frames.size() - 1);
        }
    }
}
