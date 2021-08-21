package bowling.bowling;

import bowling.exception.IllegalPayerNameException;
import bowling.exception.IllegalPinNumberException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PinsTest {

    @DisplayName("입력하는 볼링핀은 0부터 10까지 숫자여야 한다.")
    @ParameterizedTest
    @ValueSource(ints = {11, -1, 20, 30})
    void pins_validation(int pins) {
        assertThatThrownBy(() -> Pins.of(pins))
                .isInstanceOf(IllegalPinNumberException.class);
    }

    @DisplayName("입력한 볼링핀이 10이라면 스트라이크이다.")
    @Test
    void strike() {
        assertThat(Pins.of(10).isStrike()).isTrue();
        assertThat(Pins.of(3).isStrike()).isFalse();
    }
}