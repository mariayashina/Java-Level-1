import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel {
    public static final int GM_HVH = 0;
    public static final int GM_HVA = 1;

    GameMap() {
        setBackground(Color.getHSBColor(119, 217, 111));
    }
// Заглушка, чтобы в процессе посмотреть, как работает программа
    void startGameWithParams(int mapSizeX, int mapSizeY, int winLength, int modeGame) {
        System.out.println("map size " + mapSizeX + "x" + mapSizeY +
                ". WinLength = " + winLength +
                ". You play with mode = " + modeGame);
    }
}