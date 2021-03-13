import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Settings extends JFrame {

    private static final int WIN_WIDTH = 350;
    private static final int WIN_HEIGHT = 250;
// размеры поля (мин и макс) и мин длина выигрышной позиции
    private final int MIN_WIN_LENGTH = 3;
    private final int MIN_MAP_SIZE = 3;
    private final int MAX_MAP_SIZE = 10;

    private final String MAP_SIZE_PREFIX = "Map size is: ";
    private final String WIN_LEN_PREFIX = "Win length is: ";


    private MainWindow mainWindow;

    private JRadioButton humanVsHuman;
    private JRadioButton humanVsAi;
    private JSlider sliderSetSizeMap;
    private JSlider sliderSetWinLength;
    private JButton btnStart;

    Settings(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        Rectangle mainWindowBounds = mainWindow.getBounds();
// Чтобы оазместить окно Setting относительно главного, необходимо задать параметры - см. ниже
        int posX = (int) mainWindowBounds.getCenterX() - WIN_WIDTH / 2;
        int posY = (int) mainWindowBounds.getCenterY() - WIN_HEIGHT / 2;

        setLocation(posX, posY);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setTitle("Settings");
        setResizable(false);
        setLayout(new GridLayout(10, 1));

        setGameModeControl();
        setSizeMapControl();
        finishSettings();

    }
// Определить mode - кто против кого играет (радиокнопки)
    private void setGameModeControl() {
        add(new JLabel("Choose your game mode"));
        humanVsHuman = new JRadioButton("Human vs. Human", true);
        humanVsAi = new JRadioButton("Human vs. Ai");
// Чтобы радиокнопки работали только друг с другом в нужной связке, необходимо собрать группу
        ButtonGroup gameModeGroup = new ButtonGroup();
        gameModeGroup.add(humanVsHuman);
        gameModeGroup.add(humanVsAi);

        add(humanVsHuman);
        add(humanVsAi);
    }
// Определить размер поля (слайдер)
    private void setSizeMapControl() {
        JLabel lbMapSize = new JLabel(MAP_SIZE_PREFIX + MIN_MAP_SIZE);
        JLabel lbWinLen = new JLabel(WIN_LEN_PREFIX + MIN_WIN_LENGTH);
// Положение слайдера
        sliderSetSizeMap = new JSlider(MIN_MAP_SIZE, MAX_MAP_SIZE, MIN_MAP_SIZE);
// Отслеживание изменения слайдера, в stateChanged указывается, что происходит при изменении слайдера
        sliderSetSizeMap.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentMapSize = sliderSetSizeMap.getValue();
                lbMapSize.setText(MAP_SIZE_PREFIX + currentMapSize);
// Устанавливает макс значение той карты, которую выбрал пользователь
                sliderSetWinLength.setMaximum(currentMapSize);
            }
        });
// Задание выигрышной длины
        sliderSetWinLength = new JSlider(MIN_WIN_LENGTH, MIN_MAP_SIZE, MIN_MAP_SIZE);
        sliderSetWinLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lbWinLen.setText(WIN_LEN_PREFIX + sliderSetWinLength.getValue());
            }
        });

        add(new JLabel("Choose map size"));
        add(lbMapSize);
        add(sliderSetSizeMap);
        add(lbWinLen);
        add(sliderSetWinLength);
    }
// Метод для приема настроек и начала игры
    private void finishSettings() {
        btnStart = new JButton("Start Game");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startNextGame();
            }
        });
        add(btnStart);

    }


    private void startNextGame() {
        int gameMode;
// Узнать, какая кнопка выбрана, и передать это значение в gameMode
        if (humanVsHuman.isSelected()) {
            gameMode = GameMap.GM_HVH;
        } else if (humanVsAi.isSelected()) {
            gameMode = GameMap.GM_HVA;
        } else {
            throw new RuntimeException("Invalid choose game mode");
        }

        int mapSize = sliderSetSizeMap.getValue();
        int winLn = sliderSetWinLength.getValue();

        mainWindow.getParamsFromSettingAndStartGame(mapSize, mapSize, winLn, gameMode);
// После нажатися кнопки Старт надо скрыть окно настроек
        setVisible(false);
    }

}