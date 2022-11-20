package bridge.view;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public static int readBridgeSize() {
        String readLine;
        while (true) {
            readLine = Console.readLine();
            if (readLine.equals(OutputView.printBridgeLengthInputErrorMessage(readLine))) {
                break;
            }
        }
        return Integer.parseInt(readLine);
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        String readLine;
        while (true) {
            readLine = Console.readLine();
            if (readLine.equals(OutputView.printMovingBlockInputErrorMessage(readLine))) {
                break;
            }
        }
        return readLine;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
