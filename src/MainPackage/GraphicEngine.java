package MainPackage;

import static MainPackage.main.HomePanel;
import static MainPackage.main.LocalPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GraphicEngine extends java.awt.Canvas implements Runnable {
    //ANCHO:584 ALTO:492

    public static Thread GameLoop;
    public static boolean workingLoop = false;

    public static main Window;

    public static int aps = 0;
    public static int fps = 0;
    private static BufferedImage imagen;

    //public static teclado tecla;
    public int WorkBoardWidth;
    public int WorkBoardHeight;

    public static JPanel WorkBoard;
    public boolean Clicked;
    public boolean beforeClicked;
    public static Mouse mouse;

    public static int cellsH;
    public static int cellsW;
    public int escale;

    public static ArrayList<Cell> cells = new ArrayList<Cell>();

    public static JLabel time1;
    public static JLabel time2;
    public static JLabel pause;
    public static JLabel refresh;
    public static JLabel menup;
    public static JPanel inGame;
    public static JPanel inGame2;
    public static JPanel pausePanel;

    public boolean turn;//false-1, true-2
    public int ganador;//empate-0,ganadorp1-1,ganadorp2-2

    Color colorP1;
    Color colorP2;
    Color colorP3;
    Color colorP4;
    Color colorP5;
    Color colorP6;
    Color colorJ1;
    Color colorJ2;
    Image fichaOriginal1;
    Image fichaOriginal2;
    Image fichaOriginal3;
    Image fichaOriginal4;
    Image fichaOriginal5;
    Image fichaOriginal6;
    Image ficha1;
    Image ficha2;
    Image ficha3;
    Image ficha4;
    Image ficha5;
    Image ficha6;

    Image rodeo1;
    Image rodeo2;
    Image rodeo3;
    Image rodeo4;
    Image rodeo1Plus;
    Image rodeo2Plus;
    Image rodeo3Plus;
    Image rodeo4Plus;

    Image ball;
    Image ballPlus;

    int colorPlayer1;
    int colorPlayer2;

    public void ActualizarTam() {

        ficha1 = fichaOriginal1.getScaledInstance(escale + 2, escale + 2, Image.SCALE_SMOOTH);
        ficha2 = fichaOriginal2.getScaledInstance(escale + 2, escale + 2, Image.SCALE_SMOOTH);
        ficha3 = fichaOriginal3.getScaledInstance(escale + 2, escale + 2, Image.SCALE_SMOOTH);
        ficha4 = fichaOriginal4.getScaledInstance(escale + 2, escale + 2, Image.SCALE_SMOOTH);
        ficha5 = fichaOriginal5.getScaledInstance(escale + 2, escale + 2, Image.SCALE_SMOOTH);
        ficha6 = fichaOriginal6.getScaledInstance(escale + 2, escale + 2, Image.SCALE_SMOOTH);
        rodeo1Plus = rodeo1.getScaledInstance(escale * 4, (escale) * 4, Image.SCALE_SMOOTH);
        rodeo2Plus = rodeo2.getScaledInstance((escale + 2) * 4, (escale) * 4, Image.SCALE_SMOOTH);
        rodeo3Plus = rodeo3.getScaledInstance((escale) * 4, (escale) * 4, Image.SCALE_SMOOTH);
        rodeo4Plus = rodeo4.getScaledInstance((escale) * 4, (escale) * 4, Image.SCALE_SMOOTH);
        ballPlus = ball.getScaledInstance(escale + 2, escale + 2, Image.SCALE_SMOOTH);
    }

    public GraphicEngine(main w, int ancho, int alto, int colorPlayer1, int colorPlayer2) {
        escale = 41;
        try {
            fichaOriginal1 = ImageIO.read(getClass().getResource("/Files/fichaTablero1.png"));
            fichaOriginal2 = ImageIO.read(getClass().getResource("/Files/fichaTablero3.png"));
            fichaOriginal3 = ImageIO.read(getClass().getResource("/Files/fichaTablero2.png"));
            fichaOriginal4 = ImageIO.read(getClass().getResource("/Files/fichaTablero4.png"));
            fichaOriginal5 = ImageIO.read(getClass().getResource("/Files/fichaTablero5.png"));
            fichaOriginal6 = ImageIO.read(getClass().getResource("/Files/fichaTablero6.png"));
            rodeo1 = ImageIO.read(getClass().getResource("/Files/rodeo1.png"));
            rodeo2 = ImageIO.read(getClass().getResource("/Files/rodeo2.png"));
            rodeo3 = ImageIO.read(getClass().getResource("/Files/rodeo3.png"));
            rodeo4 = ImageIO.read(getClass().getResource("/Files/rodeo4.png"));
            ball = ImageIO.read(getClass().getResource("/Files/ball.png"));
            ActualizarTam();
        } catch (IOException e) {

        }

        colorP1 = new Color(185, 79, 76);
        colorP2 = new Color(64, 123, 165);
        colorP3 = new Color(193, 153, 68);
        colorP4 = new Color(72, 165, 83);
        colorP5 = new Color(160, 64, 197);
        colorP6 = new Color(205, 111, 54);
        colorJ1 = new Color(0);
        colorJ2 = new Color(0);

        this.colorPlayer1 = colorPlayer1;
        this.colorPlayer2 = colorPlayer2;
        Window = w;
        cellsH = alto;//max 8
        cellsW = ancho;//max 15

        onPause = false;
        turn = false;
        lastTurn = false;
        ganador = 0;

        WorkBoardWidth = cellsW * escale;
        WorkBoardHeight = cellsH * escale;

        WorkBoard = new JPanel();
        WorkBoard.setBounds(50, 50, WorkBoardWidth, WorkBoardHeight);
        WorkBoard.setBackground(new Color(35, 37, 43)/*Window.getContentPane().getBackground()*/);
        WorkBoard.add(this, BorderLayout.NORTH);
        WorkBoard.setVisible(true);
        setVisible(true);

        //System.out.println(Window.getContentPane().getHeight());
        //System.out.println(Window.getContentPane().getWidth());
        inGame = new JPanel();
        inGame.setLayout(null);
        inGame.setBounds(0, (Window.getContentPane().getHeight() * 8 / 47) + ((Window.getContentPane().getHeight() * 557 / (705 * 2)) - (WorkBoardHeight / 2)), (Window.getContentPane().getWidth() * 150 / 683) + ((Window.getContentPane().getWidth() * 1035 / (1366 * 2)) - (WorkBoardWidth / 2)), Window.getContentPane().getHeight());
        inGame.setBackground(new Color(38, 12, 12));
        inGame.setVisible(true);
        inGame.setOpaque(false);

        inGame2 = new JPanel();
        inGame2.setLayout(null);
        inGame2.setBounds(0, 0, Window.getContentPane().getWidth() - 84, (Window.getContentPane().getHeight() * 8 / 47) + ((Window.getContentPane().getHeight() * 557 / (705 * 2)) - (WorkBoardHeight / 2)));
        inGame2.setBackground(new Color(12, 38, 12));
        inGame2.setVisible(true);
        inGame2.setOpaque(false);

        pausePanel = new JPanel();
        pausePanel.setLayout(null);
        pausePanel.setBounds(Window.getContentPane().getWidth() - 155, 20, 135, 64);
        pausePanel.setBackground(new Color(122, 38, 12));
        pausePanel.setVisible(true);
        pausePanel.setOpaque(false);

        time1 = new JLabel("00:00 ");
        time1.setBounds(20, 0, Window.getContentPane().getWidth() - 155, inGame2.getHeight() * 7 / 10);
        time1.setLayout(null);
        time1.setOpaque(false);
        time1.setFont(new Font("century gothic", 1, 85));
        time1.setBackground(Color.gray);
        inGame2.add(time1);
        time1.setVisible(true);
        time1.setForeground(colorP1);

        time2 = new JLabel("00:00 ");
        time2.setBounds(20, inGame2.getHeight() * 7 / 10, Window.getContentPane().getWidth() - 155, inGame2.getHeight() * 3 / 10);
        time2.setLayout(null);
        time2.setOpaque(false);
        time2.setFont(new Font("century gothic", 1, 40));
        time2.setBackground(Color.white);
        time2.setForeground(colorP2);
        inGame2.add(time2);
        time2.setVisible(true);

        refresh = new JLabel();
        refresh.setBounds(0, 0, 64, 64);
        refresh.setLayout(null);
        refresh.setOpaque(false);
        refresh.setFont(new Font("century gothic", 1, 40));
        refresh.setBackground(Color.white);
        refresh.setForeground(colorP2);
        refresh.setIcon(new ImageIcon(getClass().getResource("/Files/refresh.png")));
        pausePanel.add(refresh);
        refresh.setVisible(false);

        refresh.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                refresh.setIcon(new ImageIcon(getClass().getResource("/Files/refresh1.png")));
            }
        });
        refresh.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                refresh.setIcon(new ImageIcon(getClass().getResource("/Files/refresh.png")));
            }
        });

        refresh.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK                 
                PauseLoop();
                pause.setVisible(true);
                refresh.setVisible(false);
                menup.setVisible(false);
                Window.StartNewGame();

            }

        });

        menup = new JLabel();
        menup.setBounds(70, 0, 64, 64);
        menup.setLayout(null);
        menup.setOpaque(false);
        menup.setFont(new Font("century gothic", 1, 40));
        menup.setBackground(Color.white);
        menup.setForeground(colorP2);
        menup.setIcon(new ImageIcon(getClass().getResource("/Files/home1.png")));
        pausePanel.add(menup);
        menup.setVisible(false);

        menup.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                menup.setIcon(new ImageIcon(getClass().getResource("/Files/home.png")));
            }
        });
        menup.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                menup.setIcon(new ImageIcon(getClass().getResource("/Files/home1.png")));
            }
        });

        menup.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  

                WorkBoard.setVisible(false);
                inGame.setVisible(false);
                inGame2.setVisible(false);
                pausePanel.setVisible(false);
                Window.HomePanel.setVisible(true);
                PauseLoop();
            }

        });

        pause = new JLabel();
        pause.setBounds(70, 0, 64, 64);
        pause.setLayout(null);
        pause.setOpaque(false);
        pause.setFont(new Font("century gothic", 1, 40));
        pause.setBackground(Color.white);
        pause.setForeground(colorP2);
        pause.setIcon(new ImageIcon(getClass().getResource("/Files/pause.png")));
        pausePanel.add(pause);
        pause.setVisible(true);

        pause.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                pause.setIcon(new ImageIcon(getClass().getResource("/Files/pause2.png")));
            }
        });
        pause.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                pause.setIcon(new ImageIcon(getClass().getResource("/Files/pause.png")));
            }
        });

        pause.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                onPause = true;
                WorkBoard.setVisible(false);
                inGame.setVisible(false);
                inGame2.setVisible(false);
                pausePanel.setVisible(false);
                Window.Panelpause.setVisible(true);
                if (timeP1 < 10) {
                    if (timeP1MIN < 10) {
                        Window.pauseTime1.setText("0" + timeP1MIN + ":0" + timeP1);
                    } else {
                        Window.pauseTime1.setText(timeP1MIN + ":0" + timeP1);
                    }
                } else {
                    if (timeP1MIN < 10) {
                        Window.pauseTime1.setText("0" + timeP1MIN + ":" + timeP1);
                    } else {
                        Window.pauseTime1.setText(timeP1MIN + ":" + timeP1);
                    }
                }

                if (timeP2 < 10) {
                    if (timeP2MIN < 10) {
                        Window.pauseTime2.setText("0" + timeP2MIN + ":0" + timeP2);
                    } else {
                        Window.pauseTime2.setText(timeP2MIN + ":0" + timeP2);
                    }
                } else {
                    if (timeP2MIN < 10) {
                        Window.pauseTime2.setText("0" + timeP2MIN + ":" + timeP2);
                    } else {
                        Window.pauseTime2.setText(timeP2MIN + ":" + timeP2);
                    }
                }

            }

        });

        mouse = new Mouse();
        addMouseListener(mouse);
        Clicked = false;
        beforeClicked = false;
        delta = 0;
        timeP1 = 0;
        timeP2 = 0;
        timeP1MIN = 0;
        timeP2MIN = 0;
        EndGame = false;
        imagen = new BufferedImage(WorkBoardWidth, WorkBoardHeight, BufferedImage.TYPE_INT_RGB);
        //pixeles = ((DataBufferInt) imagen.getRaster().getDataBuffer()).getData();
        //setPreferredSize(new Dimension(WorkBoardWidth, WorlkBoardHeight));
        //pixelex = new int[WorkBoardWidth * WorlkBoardHeight];
        setBounds(0, 0, WorkBoardWidth, WorkBoardHeight);

        for (int i = 0; i < cellsW; i++) {
            for (int j = 0; j < cellsH; j++) {
                addCell(i, j);
            }
        }
        w.getRootPane().addComponentListener(new ComponentAdapter() {

            @Override
            public void componentResized(ComponentEvent e) {

                int resH = (int) (Window.getContentPane().getHeight() * 100 / 1017);
                int resW = (int) (Window.getContentPane().getWidth() * 100 / 1920);
                //System.out.println(Window.getContentPane().getHeight());
                //System.out.println(Window.getContentPane().getWidth());
                if (resH < resW) {
                    escale = resH;
                    WorkBoardWidth = cellsW * escale;
                    WorkBoardHeight = cellsH * escale;
                    // WorkBoard.setBounds((Window.getContentPane().getWidth() * 150 / 683), (Window.getContentPane().getHeight() * 120 / 705), WorkBoardWidth, WorlkBoardHeight + 5);
                    WorkBoard.setBounds((Window.getContentPane().getWidth() / 2) - (WorkBoardWidth / 2), (Window.getContentPane().getHeight() * 8 / 47) + ((Window.getContentPane().getHeight() * 557 / (705 * 2)) - (WorkBoardHeight / 2)), WorkBoardWidth, WorkBoardHeight + 5);
                    //setPreferredSize(new Dimension(WorkBoardWidth, WorlkBoardHeight));
                    setBounds(0, 0, WorkBoardWidth, WorkBoardHeight);

                } else {
                    escale = resW;
                    WorkBoardWidth = cellsW * escale;
                    WorkBoardHeight = cellsH * escale;
                    WorkBoard.setBounds((Window.getContentPane().getWidth() / 2) - (WorkBoardWidth / 2), (Window.getContentPane().getHeight() * 8 / 47) + ((Window.getContentPane().getHeight() * 557 / (705 * 2)) - (WorkBoardHeight / 2)), WorkBoardWidth, WorkBoardHeight + 5);
                    //WorkBoard.setBounds(300, 120, WorkBoardWidth, WorlkBoardHeight + 5);

                    setBounds(0, 0, WorkBoardWidth, WorkBoardHeight);
                }
                //System.out.println("ancho? " + WorkBoardWidth + " /alto? " + (WorlkBoardHeight + 5));
                inGame.setBounds(0, (Window.getContentPane().getHeight() * 8 / 47) + ((Window.getContentPane().getHeight() * 557 / (705 * 2)) - (WorkBoardHeight / 2)), (Window.getContentPane().getWidth() * 150 / 683) + ((Window.getContentPane().getWidth() * 1035 / (1366 * 2)) - (WorkBoardWidth / 2)), Window.getContentPane().getHeight());
                inGame2.setBounds(0, 0, Window.getContentPane().getWidth() - 84, (Window.getContentPane().getHeight() * 8 / 47) + ((Window.getContentPane().getHeight() * 557 / (705 * 2)) - (WorkBoardHeight / 2)));
                pausePanel.setBounds(Window.getContentPane().getWidth() - 155, 20, 135, 64);
                time1.setBounds(20, 0, Window.getContentPane().getWidth() - 155, inGame2.getHeight() * 7 / 10);
                time2.setBounds(20, inGame2.getHeight() * 7 / 10, Window.getContentPane().getWidth() - 155, inGame2.getHeight() * 3 / 10);
                time1.setFont(new Font("century gothic", 1, inGame2.getHeight() * 7 / 10));
                time2.setFont(new Font("century gothic", 1, (inGame2.getHeight() * 3 / 10) * 40 / 36));
                if (ganador == 0 && EndGame == true) {
                    time1.setBounds(20, 0, Window.getContentPane().getWidth() - 155, inGame2.getHeight() * 5 / 10);
                    time2.setBounds(20, inGame2.getHeight() * 5 / 10, Window.getContentPane().getWidth() - 155, inGame2.getHeight() * 5 / 10);
                    time1.setFont(new Font("century gothic", 1, inGame2.getHeight() * 5 / 10));
                    time2.setFont(new Font("century gothic", 1, (inGame2.getHeight() * 5 / 10)));
                }
                ActualizarTam();

            }

        }
        );

        //StartLoop();
    }

    public void addCell(int x, int y) {

        Cell newCell = new Cell(x, y, this);
        cells.add(newCell);

    }
    int delta;
    int timeP1;
    int timeP2;
    int timeP1MIN;
    int timeP2MIN;

    public void Actualizations() {//Here is where should be stay all changes or actions editing the pixel array
        mouse.UpdateCursor();
        Clicked = mouse.getPress();
        if (delta > 0) {
            Clicked = false;
            delta++;
            if (delta >= 5) {
                delta = 0;
            }
        }
        if (beforeClicked == true && Clicked == false) {
            delta++;
        }

        for (int i = 0; i < cells.size(); i++) {
            cells.get(i).Actualizations(Clicked);
        }

        beforeClicked = Clicked;
    }

    private void Frames() {// Here is where the pixel array shows what it have, it depend of the size of the screen 

        BufferStrategy estrategia = getBufferStrategy();

        if (estrategia == null) {
            createBufferStrategy(3);
            return;
        }

        Graphics g = estrategia.getDrawGraphics();

        for (int i = 0; i < cells.size(); i++) {
            g = cells.get(i).Frames(g);
        }
        for (int i = 0; i < cells.size(); i++) {
            g = cells.get(i).EspecialFrames(g);
        }

        if (EndGame == true) {
            onPause = true;
        }
        //g.dispose();
        estrategia.show();
    }

    boolean EndGame;

    public void validateWin(int player) {

        int cont = 0;
        //System.out.println(player);      
        for (int j = 0; j < cellsH; j++) {//Horizontal 
            for (int i = 0; i < cellsW; i++) {

                //System.out.println(cont);
                if (cells.get(j + i * (GraphicEngine.cellsH)).state == player) {
                    cont++;
                    if (cont == 4) {
                        EndGame = true;
                        //System.out.println("wat");
                        if (player == 1) {
                            ganador = 1;
                        } else {
                            ganador = 2;
                        }
                        cells.get(j + i * (GraphicEngine.cellsH)).rodeo = 1;
                        break;

                    }
                } else {
                    cont = 0;
                }

            }
            cont = 0;
        }
        cont = 0;
        for (int j = 0; j < cellsW; j++) {//Vertical
            for (int i = 0; i < cellsH; i++) {

                //System.out.println(cont);
                if (cells.get(i + j * (GraphicEngine.cellsH)).state == player) {
                    cont++;
                    if (cont == 4) {
                        EndGame = true;
                        //System.out.println("wat");
                        if (player == 1) {
                            ganador = 1;
                        } else {
                            ganador = 2;
                        }
                        cells.get(i + j * (GraphicEngine.cellsH)).rodeo = 2;
                        break;
                    }
                } else {
                    cont = 0;
                }

            }
            cont = 0;
        }

        cont = 0;
        for (int j = 4; j < (cellsH + 1); j++) {
            int x = cellsH - j;
            int y = 0;
            while (x < cellsH && y < cellsW) {
                //System.out.println(x + "/" + y);
                if (cells.get(x + y * (GraphicEngine.cellsH)).state == player) {
                    cont++;
                    if (cont == 4) {
                        EndGame = true;
                        //System.out.println("wat");
                        if (player == 1) {
                            ganador = 1;
                        } else {
                            ganador = 2;
                        }
                        cells.get(x + y * (GraphicEngine.cellsH)).rodeo = 3;
                        break;
                    }
                } else {
                    cont = 0;
                }
                x++;
                y++;

            }
            //System.out.println("----------------------");
            cont = 0;
        }
        //cont = 0;
        for (int j = 4; j < (cellsW + 1); j++) {
            int x = 0;
            int y = cellsW - j;
            while (x < cellsH && y < cellsW) {
                if (cells.get(x + y * (GraphicEngine.cellsH)).state == player) {
                    cont++;
                    if (cont == 4) {
                        EndGame = true;
                        //System.out.println("wat");
                        if (player == 1) {
                            ganador = 1;
                        } else {
                            ganador = 2;
                        }
                        cells.get(x + y * (GraphicEngine.cellsH)).rodeo = 3;
                        break;
                    }
                } else {
                    cont = 0;
                }
                x++;
                y++;
            }
            cont = 0;
        }

        cont = 0;
        ////////////////////////////////////////////////////////////////////
        for (int j = 4; j < (cellsH + 1); j++) {
            int x = cellsH - j;
            int y = cellsW - 1;
            while (x < cellsH && y > 0) {
                //System.out.println(x + "/" + y);
                if (cells.get(x + y * (GraphicEngine.cellsH)).state == player) {
                    cont++;
                    if (cont == 4) {
                        EndGame = true;
                        //System.out.println("wat");
                        if (player == 1) {
                            ganador = 1;
                        } else {
                            ganador = 2;
                        }
                        cells.get((x - 3) + (y + 3) * (GraphicEngine.cellsH)).rodeo = 4;
                        break;
                    }
                } else {
                    cont = 0;
                }
                x++;
                y--;

            }
            //System.out.println("----------------------");
            cont = 0;
        }
        for (int j = 3; j < (cellsW); j++) {//3,cellW+1
            int x = 0;
            int y = j;
            while (x < cellsH && y >= 0) {
                //System.out.println(x + "/" + y);
                if (cells.get(x + y * (GraphicEngine.cellsH)).state == player) {
                    cont++;
                    if (cont == 4) {
                        EndGame = true;
                        //System.out.println("wat");
                        if (player == 1) {
                            ganador = 1;
                        } else {
                            ganador = 2;
                        }
                        cells.get((x - 3) + (y + 3) * (GraphicEngine.cellsH)).rodeo = 4;
                        break;
                    }
                } else {
                    cont = 0;
                }
                x++;
                y--;

            }
            //System.out.println("----------------------");
            cont = 0;
        }
        boolean cero = false;
        for (int i = 0; i < cells.size(); i++) {
            if (cells.get(i).state == 0) {
                cero = true;
                break;
            }
        }
        if (cero == false) {
            EndGame = true;
            ganador = 0;
        }

        if (EndGame == true) {
            GameOver(player);
        }

    }

    public void GameOver(int a) {
        pause.setVisible(false);
        refresh.setVisible(true);
        menup.setVisible(true);

        if (ganador == 0) {
            time1.setBounds(20, 0, Window.getContentPane().getWidth() - 155, inGame2.getHeight() * 5 / 10);
            time2.setBounds(20, inGame2.getHeight() * 5 / 10, Window.getContentPane().getWidth() - 155, inGame2.getHeight() * 5 / 10);
            time1.setFont(new Font("century gothic", 1, inGame2.getHeight() * 5 / 10));
            time2.setFont(new Font("century gothic", 1, (inGame2.getHeight() * 5 / 10)));
            time1.setText(time1.getText() + "-DRAW");
            time2.setText(time2.getText() + "-DRAW");
        }

        if (ganador == 1) {
            if (time1.getForeground() == colorJ2) {
                String aux = time1.getText();
                time1.setText(time2.getText());
                time2.setText(aux);
            }
            time2.setForeground(colorJ2);
            time1.setForeground(colorJ1);

        }

        if (ganador == 2) {
            if (time1.getForeground() == colorJ1) {
                String aux = time1.getText();
                time1.setText(time2.getText());
                time2.setText(aux);
            }

            time2.setForeground(colorJ1);
            time1.setForeground(colorJ2);

        }

    }

    public void resetParameters(int ancho, int alto, int colorPlayer1, int colorPlayer2) {
        this.colorPlayer1 = colorPlayer1;
        this.colorPlayer2 = colorPlayer2;
        cellsH = alto;//max 8
        cellsW = ancho;//max 15

        onPause = false;
        turn = false;
        lastTurn = false;

        WorkBoardWidth = cellsW * escale;
        WorkBoardHeight = cellsH * escale;

        time1.setText("00:00 ");
        time2.setText("00:00 ");

        Clicked = false;
        beforeClicked = false;
        delta = 0;
        timeP1 = 0;
        timeP2 = 0;
        timeP1MIN = 0;
        timeP2MIN = 0;
        ganador = 0;
        EndGame = false;

        cells.clear();

        for (int i = 0; i < cellsW; i++) {
            for (int j = 0; j < cellsH; j++) {
                addCell(i, j);
            }
        }

        int resH = (int) (Window.getContentPane().getHeight() * 100 / 1017);
        int resW = (int) (Window.getContentPane().getWidth() * 100 / 1920);
        if (resH < resW) {
            escale = resH;
            WorkBoardWidth = cellsW * escale;
            WorkBoardHeight = cellsH * escale;
            // WorkBoard.setBounds((Window.getContentPane().getWidth() * 150 / 683), (Window.getContentPane().getHeight() * 120 / 705), WorkBoardWidth, WorlkBoardHeight + 5);
            WorkBoard.setBounds((Window.getContentPane().getWidth() / 2) - (WorkBoardWidth / 2), (Window.getContentPane().getHeight() * 8 / 47) + ((Window.getContentPane().getHeight() * 557 / (705 * 2)) - (WorkBoardHeight / 2)), WorkBoardWidth, WorkBoardHeight + 5);
            //setPreferredSize(new Dimension(WorkBoardWidth, WorlkBoardHeight));
            setBounds(0, 0, WorkBoardWidth, WorkBoardHeight);

        } else {
            escale = resW;
            WorkBoardWidth = cellsW * escale;
            WorkBoardHeight = cellsH * escale;
            WorkBoard.setBounds((Window.getContentPane().getWidth() / 2) - (WorkBoardWidth / 2), (Window.getContentPane().getHeight() * 8 / 47) + ((Window.getContentPane().getHeight() * 557 / (705 * 2)) - (WorkBoardHeight / 2)), WorkBoardWidth, WorkBoardHeight + 5);
            //WorkBoard.setBounds(300, 120, WorkBoardWidth, WorlkBoardHeight + 5);

            setBounds(0, 0, WorkBoardWidth, WorkBoardHeight);
        }
        inGame.setBounds(0, (Window.getContentPane().getHeight() * 8 / 47) + ((Window.getContentPane().getHeight() * 557 / (705 * 2)) - (WorkBoardHeight / 2)), (Window.getContentPane().getWidth() * 150 / 683) + ((Window.getContentPane().getWidth() * 1035 / (1366 * 2)) - (WorkBoardWidth / 2)), Window.getContentPane().getHeight());
        inGame2.setBounds(0, 0, Window.getContentPane().getWidth() - 84, (Window.getContentPane().getHeight() * 8 / 47) + ((Window.getContentPane().getHeight() * 557 / (705 * 2)) - (WorkBoardHeight / 2)));
        pausePanel.setBounds(Window.getContentPane().getWidth() - 155, 20, 135, 64);
        time1.setBounds(20, 0, Window.getContentPane().getWidth() - 155, inGame2.getHeight() * 7 / 10);
        time2.setBounds(20, inGame2.getHeight() * 7 / 10, Window.getContentPane().getWidth() - 155, inGame2.getHeight() * 3 / 10);
        time1.setFont(new Font("century gothic", 1, inGame2.getHeight() * 7 / 10));
        time2.setFont(new Font("century gothic", 1, (inGame2.getHeight() * 3 / 10) * 40 / 36));

        switch (colorPlayer1) {
            case 1:
                colorJ1 = colorP1;
                break;
            case 2:
                colorJ1 = colorP2;
                break;
            case 3:
                colorJ1 = colorP3;
                break;
            case 4:
                colorJ1 = colorP4;
                break;
            case 5:
                colorJ1 = colorP5;
                break;
            case 6:
                colorJ1 = colorP6;
                break;

        }

        switch (colorPlayer2) {
            case 1:
                colorJ2 = colorP1;
                break;
            case 2:
                colorJ2 = colorP2;
                break;
            case 3:
                colorJ2 = colorP3;
                break;
            case 4:
                colorJ2 = colorP4;
                break;
            case 5:
                colorJ2 = colorP5;
                break;
            case 6:
                colorJ2 = colorP6;
                break;

        }
        time2.setForeground(colorJ2);
        time1.setForeground(colorJ1);

        Window.pauseTime1.setForeground(colorJ1);
        Window.pauseTime2.setForeground(colorJ2);

        ActualizarTam();
    }

    public void StartLoop() {
        //Limpiar();
        GameLoop = new Thread(this, "Graficos");
        workingLoop = true;
        GameLoop.start();
    }

    public void PauseLoop() {
        workingLoop = false;
        try {
            GameLoop.join();
        } catch (InterruptedException ex) {
            System.err.println("The Thread could not be paused");
        }
    }

    @Override
    public void run() {

        final int NS_SEG = 1000000000;
        final byte APS_OBJ = 60;
        final double NS_ACT = NS_SEG / APS_OBJ;

        long refact = System.nanoTime();
        long refcont = System.nanoTime();
        double time_trans;
        double delta = 0;

        while (this.workingLoop == true) {

            final long inibucle = System.nanoTime();
            time_trans = inibucle - refact;
            refact = inibucle;
            delta += time_trans / NS_ACT;

            while (delta >= 1) {

                this.Actualizations();
                this.aps++;
                delta--;
            }

            this.Frames();
            //Window.setTitle("Point In Memory: " + Points.size());
            this.fps++;
            if (System.nanoTime() - refcont > NS_SEG) {
                //this.Window.setTitle("Game Name" + " | APS: " + this.aps + " | FPS: " + this.fps);
                if (this.onPause == false) {
                    timeControl();
                }
                this.aps = 0;
                this.fps = 0;
                refcont = System.nanoTime();
            }

        }
    }
    boolean onPause;

    public void timeControl() {

        if (turn == false) {
            timeP1++;
        } else {
            timeP2++;
        }
        if (timeP1 == 60) {
            timeP1 = 0;
            timeP1MIN++;
        }
        if (timeP2 == 60) {
            timeP2 = 0;
            timeP2MIN++;
        }

        if (turn == false) {
            if (lastTurn == true) {
                time2.setForeground(colorJ2);
                time1.setForeground(colorJ1);
            }
            if (timeP1 < 10) {
                if (timeP1MIN < 10) {
                    time1.setText("0" + timeP1MIN + ":0" + timeP1);
                } else {
                    time1.setText(timeP1MIN + ":0" + timeP1);
                }
            } else {
                if (timeP1MIN < 10) {
                    time1.setText("0" + timeP1MIN + ":" + timeP1);
                } else {
                    time1.setText(timeP1MIN + ":" + timeP1);
                }
            }
            if (timeP2 < 10) {
                if (timeP2MIN < 10) {
                    time2.setText("0" + timeP2MIN + ":0" + timeP2);
                } else {
                    time2.setText(timeP2MIN + ":0" + timeP2);
                }
            } else {
                if (timeP2MIN < 10) {
                    time2.setText("0" + timeP2MIN + ":" + timeP2);
                } else {
                    time2.setText(timeP2MIN + ":" + timeP2);
                }
            }
        } else {
            if (lastTurn == false) {
                time1.setForeground(colorJ2);
                time2.setForeground(colorJ1);
            }
            if (timeP1 < 10) {
                if (timeP1MIN < 10) {
                    time2.setText("0" + timeP1MIN + ":0" + timeP1);
                } else {
                    time2.setText(timeP1MIN + ":0" + timeP1);
                }
            } else {
                if (timeP1MIN < 10) {
                    time2.setText("0" + timeP1MIN + ":" + timeP1);
                } else {
                    time2.setText(timeP1MIN + ":" + timeP1);
                }
            }
            if (timeP2 < 10) {
                if (timeP2MIN < 10) {
                    time1.setText("0" + timeP2MIN + ":0" + timeP2);
                } else {
                    time1.setText(timeP2MIN + ":0" + timeP2);
                }
            } else {
                if (timeP2MIN < 10) {
                    time1.setText("0" + timeP2MIN + ":" + timeP2);
                } else {
                    time1.setText(timeP2MIN + ":" + timeP2);
                }
            }
        }
        lastTurn = turn;
    }
    boolean lastTurn;

    public class Mouse extends MouseAdapter {

        public int x;
        public int y;
        private boolean click;
        private boolean press;
        public boolean release;

        public Mouse() {

        }

        public void UpdateCursor() {
            java.awt.Point pos = MouseInfo.getPointerInfo().getLocation();
            SwingUtilities.convertPointFromScreen(pos, WorkBoard);
            this.x = pos.x;
            this.y = pos.y - 5;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if (click == false) {
                click = true;
            }
        }

        public boolean getClick() {
            return click;
        }
        public int tipoClick = 0;

        public void resetClick() {
            ////System.out.println(release);
            release = false;
            if (sw == 1) {
                release = true;
                sw = 2;
            }

            if (click == true) {
                click = false;
            }
            if (press == false && sw == 0) {
                sw = 1;
            }
        }
        private int sw = 2;

        @Override
        public void mouseReleased(MouseEvent e) {
            if (press == true) {
                press = false;
            }

        }

        @Override
        public void mousePressed(MouseEvent e) {
            if (press == false) {
                press = true;
            }
            sw = 0;

        }

        public boolean getPress() {
            return press;
        }

        public void resetPress() {
            if (press == true) {
                press = false;
            }
        }

    }

}
