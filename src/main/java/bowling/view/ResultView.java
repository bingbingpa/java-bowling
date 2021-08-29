package bowling.view;

import bowling.domain.frame.Frame;
import bowling.domain.frame.Frames;
import bowling.domain.player.Player;

import java.util.List;
import java.util.stream.IntStream;

public class ResultView {

    private ResultView() {
    }

    public static void printBoard(Player player, Frames frames) {
        printBoardHead();
        printBoardFrame(player, frames);
    }

    private static void printBoardHead() {
        System.out.printf("| NAME |");
        IntStream.rangeClosed(1, 10)
                .forEach(i -> System.out.printf("   " + String.format("%02d", i) + "   |"));
        System.out.println();
    }

    private static void printBoardFrame(Player player, Frames frames) {
        List<Frame> frameList = frames.getFrames();
        System.out.printf("|  " + player.getName() + " |");

        frameList.forEach(f -> System.out.printf("   " + String.format("%-3s", f.getState()) + String.format("%3s", "|")));

        IntStream.range(frameList.size(), 10)
                .forEach(i -> System.out.printf("        |"));
        System.out.println();
    }
}
