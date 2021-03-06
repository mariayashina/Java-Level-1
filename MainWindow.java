import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
// Размеры самого главного окна и позиционирование на экране
    private static final int WIN_WIDTH = 500;
    private static final int WIN_HEIGHT = 550;
    private static final int WIN_POS_X = 650;
    private static final int WIN_POS_Y = 250;

    private Settings settings;
    private GameMap gameMap;

    MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(WIN_POS_X, WIN_POS_Y);
        setTitle("Game X-O");
        setResizable(false);

        settings = new Settings(this);
        gameMap = new GameMap();
// ActionListener - для отслеживания кликов по кнопкам, после клика происходит событие из actionPerformed
        JButton btnStartGame = new JButton("Start New Game");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });

        JButton btnExitGame = new JButton("Exit Game");
        btnExitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel panelForButton = new JPanel();
        panelForButton.setLayout(new GridLayout(1, 2));
        panelForButton.add(btnStartGame);
        panelForButton.add(btnExitGame);

        add(panelForButton, BorderLayout.SOUTH);
        add(gameMap);

        setVisible(true);
    }

    void getParamsFromSettingAndStartGame(int mapSizeX, int mapSizeY, int winLength, int modeGame) {
        gameMap.startGameWithParams(mapSizeX, mapSizeY, winLength, modeGame);
    }

}
