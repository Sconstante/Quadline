package MainPackage;

import static MainPackage.GraphicEngine.Window;
import static MainPackage.GraphicEngine.WorkBoard;
import static MainPackage.GraphicEngine.inGame;
import static MainPackage.GraphicEngine.inGame2;
import static MainPackage.GraphicEngine.pausePanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class main extends JFrame {

    public final int FrameWidth = 948;
    public final int FrameHeight = 638;
    public static JPanel HomePanel;
    private static JPanel creditosPanel;
    private static JLabel creditosTitulo;
    public static JPanel LocalPanel;
    private static JLabel Titulo;
    private static JLabel Localgame;
    private static JLabel creditos;
    private static JLabel BackLocalBoton;
    private static JLabel BackCreditosBoton;
    private static JLabel ficha1L;
    private static JLabel ficha2L;
    private static JLabel filasL;
    private static JLabel columnasL;
    private static JLabel filasL1;
    private static JLabel columnasL1;
    private static JLabel FilaL;
    private static JLabel ColumnaL;
    private static JLabel ajustarFder;
    private static JLabel ajustarFizq;
    private static JLabel ajustarCder;
    private static JLabel ajustarCizq;
    private static JLabel BotonPlayL;
    private static JLabel ficha1Lcolor;
    private static JLabel ficha1Lcolor1;
    private static JLabel ficha1Lcolor2;
    private static JLabel ficha1Lcolor3;
    private static JLabel ficha1Lcolor4;
    private static JLabel ficha1Lcolor5;
    private static JLabel ficha1Lcolor6;
    private static JLabel ficha2Lcolor;
    private static JLabel ficha2Lcolor1;
    private static JLabel ficha2Lcolor2;
    private static JLabel ficha2Lcolor3;
    private static JLabel ficha2Lcolor4;
    private static JLabel ficha2Lcolor5;
    private static JLabel ficha2Lcolor6;
    public static JPanel Panelpause;
    private static JLabel pauseTitulo;
    private static JLabel botonReanude;
    private static JLabel botonMenu;
    public static JLabel pauseTime1;
    public static JLabel pauseTime2;

    public boolean BotonColor1;
    public boolean BotonColor2;

    public int ColorP1;
    public int ColorP2;

    public static GraphicEngine gra;

    public static void main(String[] args) {
        main i = new main();
    }

    public main() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(true);
        pack();
        Image iconoPropio = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Files/color1.png"));
        setIconImage(iconoPropio);
        setTitle("Quadline ©");
        gra = new GraphicEngine(this, 15, 8, 5, 6);
        add(gra.WorkBoard);
        add(gra.inGame);
        add(gra.inGame2);
        add(gra.pausePanel);
        gra.WorkBoard.setVisible(false);
        gra.inGame.setVisible(false);
        gra.inGame2.setVisible(false);
        gra.pausePanel.setVisible(false);
        setSize(FrameWidth, FrameHeight);//800,600
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(35, 37, 43));
        setVisible(true);

        int xx = (FrameWidth + (FrameWidth - getContentPane().getWidth()));
        int yy = (FrameHeight + (FrameHeight - getContentPane().getHeight()));
        setSize(xx, yy);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        setMinimumSize(new Dimension(966,685));

        this.getRootPane().addComponentListener(new ComponentAdapter() {

            @Override
            public void componentResized(ComponentEvent e) {
                //System.out.println(getContentPane().getWidth());
                //System.out.println(getContentPane().getHeight());
                HomePanel.setBounds(0, 0, getContentPane().getWidth(), getContentPane().getHeight());
                creditosPanel.setBounds(0, 0, getContentPane().getWidth(), getContentPane().getHeight());
                LocalPanel.setBounds(0, 0, getContentPane().getWidth(), getContentPane().getHeight());
                creditosTitulo.setBounds((int) ((getContentPane().getWidth() / 2) - 275), (int) ((getContentPane().getHeight() - 638) * 150 / 363) + 50, 550, 550);
                Titulo.setBounds((int) ((getContentPane().getWidth() / 2) - 500), (int) ((getContentPane().getHeight() - 638) * 100 / 379) - 150, 1000, 500);
                Localgame.setBounds((int) ((getContentPane().getWidth() / 2) - 225), (int) ((getContentPane().getHeight() - 638) * 180 / 363) + 240, 450, 125);
                creditos.setBounds((int) ((getContentPane().getWidth() / 2) - 225), (int) ((getContentPane().getHeight() - 638) * 190 / 363) + 430, 450, 125);
                ficha1L.setBounds((int) ((getContentPane().getWidth() / 2) - 400), (int) ((getContentPane().getHeight() - 638) * 155 / 363) + 20, 250, 250);
                ficha1Lcolor.setBounds(215, 0, 35, 35);
                ficha2L.setBounds((int) ((getContentPane().getWidth() / 2) + 150), (int) ((getContentPane().getHeight() - 638) * 155 / 363) + 20, 250, 250);
                ficha2Lcolor.setBounds(215, 0, 35, 35);
                filasL.setBounds((int) ((getContentPane().getWidth() / 2) - 80), (int) ((getContentPane().getHeight() - 638) * 250 / 363) + 290, 160, 60);
                columnasL.setBounds((int) ((getContentPane().getWidth() / 2) - 80), (int) ((getContentPane().getHeight() - 638) * 270 / 363) + 420, 160, 60);
                FilaL.setBounds((int) ((getContentPane().getWidth() / 2) - 80), (int) ((getContentPane().getHeight() - 638) * 250 / 363) + 250, 160, 30);
                ColumnaL.setBounds((int) ((getContentPane().getWidth() / 2) - 80), (int) ((getContentPane().getHeight() - 638) * 270 / 363) + 380, 160, 30);
                ajustarFizq.setBounds((int) ((getContentPane().getWidth() / 2) - 150), (int) ((getContentPane().getHeight() - 638) * 250 / 363) + 290, 50, 60);
                ajustarFder.setBounds((int) ((getContentPane().getWidth() / 2) + 100), (int) ((getContentPane().getHeight() - 638) * 250 / 363) + 290, 50, 60);
                ajustarCizq.setBounds((int) ((getContentPane().getWidth() / 2) - 150), (int) ((getContentPane().getHeight() - 638) * 270 / 363) + 420, 50, 60);
                ajustarCder.setBounds((int) ((getContentPane().getWidth() / 2) + 100), (int) ((getContentPane().getHeight() - 638) * 270 / 363) + 420, 50, 60);
                BotonPlayL.setBounds((int) ((getContentPane().getWidth() / 2) - 75), (int) ((getContentPane().getHeight() - 638) * 280 / 363) + 520, 150, 80);
                Panelpause.setBounds(0, 0, getContentPane().getWidth(), getContentPane().getHeight());
                pauseTitulo.setBounds((int) ((getContentPane().getWidth() / 2) - 500), (int) ((getContentPane().getHeight() - 638) * 50 / 363), 1000, 250);
                botonReanude.setBounds((int) ((getContentPane().getWidth() / 2) - 225), (int) ((getContentPane().getHeight() - 638) * 130 / 363) + 320, 450, 125);
                botonMenu.setBounds((int) ((getContentPane().getWidth() / 2) - 225), (int) ((getContentPane().getHeight() - 638) * 180 / 363) + 470, 450, 125);
                pauseTime1.setBounds((int) ((getContentPane().getWidth() / 2) - 225), (int) ((getContentPane().getHeight() - 638) * 130 / 363) + 220, 225, 80);
                pauseTime2.setBounds((int) ((getContentPane().getWidth() / 2)), (int) ((getContentPane().getHeight() - 638) * 130 / 363) + 220, 225, 80);
//System.out.println(getContentPane().getWidth());
            }

        }
        );
        //System.out.println(xx + "/" + yy);
        InitComponents();

    }

    //Graphic Components
    private void InitComponents() {
        HomePanel = new JPanel();
        creditosPanel = new JPanel();
        Titulo = new JLabel();
        Localgame = new JLabel();
        creditos = new JLabel();
        creditosTitulo = new JLabel();
        Panelpause = new JPanel();
        pauseTitulo = new JLabel();
        botonReanude = new JLabel();
        botonMenu = new JLabel();
        pauseTime1 = new JLabel();
        pauseTime2 = new JLabel();
        LocalPanel = new JPanel();
        BackLocalBoton = new JLabel();
        BackCreditosBoton = new JLabel();
        ficha1L = new JLabel();
        ficha2L = new JLabel();
        filasL = new JLabel();
        columnasL = new JLabel();
        filasL1 = new JLabel();
        columnasL1 = new JLabel();
        FilaL = new JLabel();
        ColumnaL = new JLabel();
        ajustarFder = new JLabel();
        ajustarFizq = new JLabel();
        ajustarCder = new JLabel();
        ajustarCizq = new JLabel();
        BotonPlayL = new JLabel();
        ficha1Lcolor = new JLabel();
        ficha2Lcolor = new JLabel();
        ficha1Lcolor1 = new JLabel();
        ficha1Lcolor2 = new JLabel();
        ficha1Lcolor3 = new JLabel();
        ficha1Lcolor4 = new JLabel();
        ficha1Lcolor5 = new JLabel();
        ficha1Lcolor6 = new JLabel();
        ficha2Lcolor1 = new JLabel();
        ficha2Lcolor2 = new JLabel();
        ficha2Lcolor3 = new JLabel();
        ficha2Lcolor4 = new JLabel();
        ficha2Lcolor5 = new JLabel();
        ficha2Lcolor6 = new JLabel();
        ColorP1 = 1;
        ColorP2 = 2;

        BotonColor1 = false;
        ficha1Lcolor1.setVisible(false);
        ficha1Lcolor2.setVisible(false);
        ficha1Lcolor3.setVisible(false);
        ficha1Lcolor4.setVisible(false);
        ficha1Lcolor5.setVisible(false);
        ficha1Lcolor6.setVisible(false);

        BotonColor2 = false;
        ficha2Lcolor1.setVisible(false);
        ficha2Lcolor2.setVisible(false);
        ficha2Lcolor3.setVisible(false);
        ficha2Lcolor4.setVisible(false);
        ficha2Lcolor5.setVisible(false);
        ficha2Lcolor6.setVisible(false);

        HomePanel.setLayout(null);
        HomePanel.setBounds(0, 0, getContentPane().getWidth(), getContentPane().getHeight());
        HomePanel.setBackground(new Color(35, 37, 43));
        HomePanel.setOpaque(true);
        add(HomePanel);
        HomePanel.setVisible(true);

        creditosPanel.setLayout(null);
        creditosPanel.setBounds(0, 0, getContentPane().getWidth(), getContentPane().getHeight());
        creditosPanel.setBackground(new Color(35, 37, 43));
        creditosPanel.setOpaque(true);
        add(creditosPanel);
        creditosPanel.setVisible(false);

        Titulo.setLayout(null);
        HomePanel.add(Titulo);
        Titulo.setBounds((int) ((getContentPane().getWidth() / 2) - 500), (int) ((getContentPane().getHeight() - 638) * 100 / 379) - 150, 1000, 500);
        Titulo.setOpaque(false);
        Titulo.setIcon(new ImageIcon(getClass().getResource("/Files/titulo.png")));

        Titulo.setBackground(Color.MAGENTA); //cambia color fondo jlabel
        Titulo.setFont(new Font("arial", 1, 40));
        Titulo.setVisible(true);

        Localgame.setLayout(null);
        HomePanel.add(Localgame);
        Localgame.setBounds((int) ((getContentPane().getWidth() / 2) - 225), (int) ((getContentPane().getHeight() - 638) * 180 / 363) + 240, 450, 125);
        Localgame.setOpaque(false);
        Localgame.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        Localgame.setFont(new Font("arial", 1, 40));
        //Localgame.setText(precio + "$");
        Localgame.setForeground(Color.WHITE);
        Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/LocalVS.png")));
        Localgame.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/Local1.png")));
            }
        });
        Localgame.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/LocalVS.png")));
            }
        });
        Localgame.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                HomePanel.setVisible(false);
                LocalPanel.setVisible(true);
                //focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        creditos.setLayout(null);
        HomePanel.add(creditos);
        creditos.setBounds((int) ((getContentPane().getWidth() / 2) - 225), (int) ((getContentPane().getHeight() / 2) + 150), 450, 125);
        creditos.setOpaque(false);
        creditos.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        creditos.setFont(new Font("arial", 1, 40));
        //creditos.setText(precio + "$");
        creditos.setForeground(Color.WHITE);
        creditos.setIcon(new ImageIcon(getClass().getResource("/Files/creditsBoton.png")));
        creditos.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                creditos.setIcon(new ImageIcon(getClass().getResource("/Files/credits1.png")));
            }
        });
        creditos.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                creditos.setIcon(new ImageIcon(getClass().getResource("/Files/creditsBoton.png")));
            }
        });
        creditos.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                HomePanel.setVisible(false);
                creditosPanel.setVisible(true);
            }

        });

        creditosTitulo.setLayout(null);
        creditosPanel.add(creditosTitulo);
        creditosTitulo.setBounds((int) ((getContentPane().getWidth() / 2) - 275), (int) ((getContentPane().getHeight() - 638) * 150 / 363) + 50, 550, 550);
        creditosTitulo.setOpaque(false);
        creditosTitulo.setIcon(new ImageIcon(getClass().getResource("/Files/creditos.png")));
        creditosTitulo.setBackground(Color.MAGENTA); //cambia color fondo jlabel
        creditosTitulo.setFont(new Font("arial", 1, 40));
        creditosTitulo.setVisible(true);

        LocalPanel.setLayout(null);
        LocalPanel.setBounds(0, 0, getContentPane().getWidth(), getContentPane().getHeight());
        LocalPanel.setBackground(new Color(35, 37, 43));
        LocalPanel.setOpaque(true);
        add(LocalPanel);
        LocalPanel.setVisible(false);

        BackLocalBoton.setLayout(null);
        LocalPanel.add(BackLocalBoton);
        BackLocalBoton.setBounds(20, 20, 64, 64);
        BackLocalBoton.setOpaque(false);
        BackLocalBoton.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        BackLocalBoton.setFont(new Font("arial", 1, 40));
        //BackLocalBoton.setText(precio + "$");
        BackLocalBoton.setForeground(Color.WHITE);
        BackLocalBoton.setIcon(new ImageIcon(getClass().getResource("/Files/back.png")));
        BackLocalBoton.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                BackLocalBoton.setIcon(new ImageIcon(getClass().getResource("/Files/back2.png")));
            }
        });
        BackLocalBoton.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                BackLocalBoton.setIcon(new ImageIcon(getClass().getResource("/Files/back.png")));
            }
        });
        BackLocalBoton.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                HomePanel.setVisible(true);
                LocalPanel.setVisible(false);
                //focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        BackCreditosBoton.setLayout(null);
        creditosPanel.add(BackCreditosBoton);
        BackCreditosBoton.setBounds(20, 20, 64, 64);
        BackCreditosBoton.setOpaque(false);
        BackCreditosBoton.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        BackCreditosBoton.setFont(new Font("arial", 1, 40));
        //BackCreditosBoton.setText(precio + "$");
        BackCreditosBoton.setForeground(Color.WHITE);
        BackCreditosBoton.setIcon(new ImageIcon(getClass().getResource("/Files/back.png")));
        BackCreditosBoton.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                BackCreditosBoton.setIcon(new ImageIcon(getClass().getResource("/Files/back2.png")));
            }
        });
        BackCreditosBoton.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                BackCreditosBoton.setIcon(new ImageIcon(getClass().getResource("/Files/back.png")));
            }
        });
        BackCreditosBoton.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                HomePanel.setVisible(true);
                creditosPanel.setVisible(false);
                //focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        ficha1L.setLayout(null);
        LocalPanel.add(ficha1L);
        ficha1L.setBounds((int) ((getContentPane().getWidth() / 2) - 400), (int) ((getContentPane().getHeight() - 638) * 155 / 363) + 20, 250, 250);
        ficha1L.setOpaque(false);
        ficha1L.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        ficha1L.setFont(new Font("arial", 1, 40));
        //ficha1L.setText(precio + "$");
        ficha1L.setForeground(Color.WHITE);
        ficha1L.setIcon(new ImageIcon(getClass().getResource("/Files/player1.png")));
        ficha1L.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //ficha1L.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
            }
        });
        ficha1L.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                    ficha1L.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                    ficha1L.setIcon(new ImageIcon(getClass().getResource("/Files/ficha1L.png")));
                }*/

            }
        });
        ficha1L.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  

                //focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        ficha1Lcolor.setLayout(null);
        ficha1L.add(ficha1Lcolor);
        ficha1Lcolor.setBounds(215, 0, 35, 35);
        ficha1Lcolor.setOpaque(false);
        ficha1Lcolor.setBackground(Color.RED); //cambia color fondo jlabel
        ficha1Lcolor.setFont(new Font("arial", 1, 40));
        //  ficha1Lcolor1.setText(precio + "$");
        ficha1Lcolor.setForeground(Color.WHITE);
        ficha1Lcolor.setIcon(new ImageIcon(getClass().getResource("/Files/fichaC.png")));
        ficha1Lcolor.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                ficha1Lcolor.setIcon(new ImageIcon(getClass().getResource("/Files/fichaC1.png")));
            }
        });
        ficha1Lcolor.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                      ficha1Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                      ficha1Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/  ficha1Lcolor1.png")));
                }*/
                ficha1Lcolor.setIcon(new ImageIcon(getClass().getResource("/Files/fichaC.png")));

            }
        });
        ficha1Lcolor.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (BotonColor1 == false) {
                    ficha1Lcolor1.setVisible(true);
                    ficha1Lcolor2.setVisible(true);
                    ficha1Lcolor3.setVisible(true);
                    ficha1Lcolor4.setVisible(true);
                    ficha1Lcolor5.setVisible(true);
                    ficha1Lcolor6.setVisible(true);
                    BotonColor1 = true;
                } else {
                    ficha1Lcolor1.setVisible(false);
                    ficha1Lcolor2.setVisible(false);
                    ficha1Lcolor3.setVisible(false);
                    ficha1Lcolor4.setVisible(false);
                    ficha1Lcolor5.setVisible(false);
                    ficha1Lcolor6.setVisible(false);
                    BotonColor1 = false;
                }
                ValidarColores();
                //focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        ficha1Lcolor1.setLayout(null);
        ficha1L.add(ficha1Lcolor1);
        ficha1Lcolor1.setBounds(83 - (125 / 3), 53 - (125 / 3), 83, 83);
        ficha1Lcolor1.setOpaque(false);
        ficha1Lcolor1.setBackground(Color.BLUE); //cambia color fondo jlabel
        ficha1Lcolor1.setFont(new Font("arial", 1, 40));
        //  ficha1Lcolor1.setText(precio + "$");
        ficha1Lcolor1.setForeground(Color.WHITE);
        ficha1Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/colores1.png")));
        ficha1Lcolor1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                if (ColorP2 != 1) {
                    ficha1Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/coloress1.png")));
                }

            }
        });
        ficha1Lcolor1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                      ficha1Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                      ficha1Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/  ficha1Lcolor1.png")));
                }*/
                if (ColorP2 != 1) {
                    ficha1Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/colores1.png")));
                }

            }
        });
        ficha1Lcolor1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (ColorP2 != 1) {
                    ColorP1 = 1;
                    ficha1L.setIcon(new ImageIcon(getClass().getResource("/Files/player1.png")));

                    ficha1Lcolor1.setVisible(false);
                    ficha1Lcolor2.setVisible(false);
                    ficha1Lcolor3.setVisible(false);
                    ficha1Lcolor4.setVisible(false);
                    ficha1Lcolor5.setVisible(false);
                    ficha1Lcolor6.setVisible(false);
                    BotonColor1 = false;
                }
                ValidarColores();
                //focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        ficha1Lcolor2.setLayout(null);
        ficha1L.add(ficha1Lcolor2);
        ficha1Lcolor2.setBounds(41 - (125 / 3), 125 - (125 / 3), 83, 83);
        ficha1Lcolor2.setOpaque(false);
        ficha1Lcolor2.setBackground(Color.BLUE); //cambia color fondo jlabel
        ficha1Lcolor2.setFont(new Font("arial", 1, 40));
        //   ficha1Lcolor2.setText(precio + "$");
        ficha1Lcolor2.setForeground(Color.WHITE);
        ficha1Lcolor2.setIcon(new ImageIcon(getClass().getResource("/Files/colores3.png")));
        ficha1Lcolor2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                if (ColorP2 != 2) {
                    ficha1Lcolor2.setIcon(new ImageIcon(getClass().getResource("/Files/coloress3.png")));
                }

                //   ficha1Lcolor2.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
            }
        });
        ficha1Lcolor2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                       ficha1Lcolor2.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                       ficha1Lcolor2.setIcon(new ImageIcon(getClass().getResource("/Files/   ficha1Lcolor2.png")));
                }*/
                if (ColorP2 != 2) {
                    ficha1Lcolor2.setIcon(new ImageIcon(getClass().getResource("/Files/colores3.png")));
                }

            }
        });
        ficha1Lcolor2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (ColorP2 != 2) {
                    ColorP1 = 2;
                    ficha1L.setIcon(new ImageIcon(getClass().getResource("/Files/player3.png")));

                    ficha1Lcolor1.setVisible(false);
                    ficha1Lcolor2.setVisible(false);
                    ficha1Lcolor3.setVisible(false);
                    ficha1Lcolor4.setVisible(false);
                    ficha1Lcolor5.setVisible(false);
                    ficha1Lcolor6.setVisible(false);
                    BotonColor1 = false;

                }

                ValidarColores();
//focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        ficha1Lcolor3.setLayout(null);
        ficha1L.add(ficha1Lcolor3);
        ficha1Lcolor3.setBounds(83 - (125 / 3), 197 - (125 / 3), 83, 83);
        ficha1Lcolor3.setOpaque(false);
        ficha1Lcolor3.setBackground(Color.BLUE); //cambia color fondo jlabel
        ficha1Lcolor3.setFont(new Font("arial", 1, 40));
        //    ficha1Lcolor3.setText(precio + "$");
        ficha1Lcolor3.setForeground(Color.WHITE);
        ficha1Lcolor3.setIcon(new ImageIcon(getClass().getResource("/Files/colores2.png")));
        ficha1Lcolor3.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //    ficha1Lcolor3.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
                if (ColorP2 != 3) {
                    ficha1Lcolor3.setIcon(new ImageIcon(getClass().getResource("/Files/coloress2.png")));
                }

            }
        });
        ficha1Lcolor3.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                        ficha1Lcolor3.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                        ficha1Lcolor3.setIcon(new ImageIcon(getClass().getResource("/Files/    ficha1Lcolor3.png")));
                }*/
                if (ColorP2 != 3) {
                    ficha1Lcolor3.setIcon(new ImageIcon(getClass().getResource("/Files/colores2.png")));
                }

            }
        });
        ficha1Lcolor3.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (ColorP2 != 3) {
                    ColorP1 = 3;
                    ficha1L.setIcon(new ImageIcon(getClass().getResource("/Files/player2.png")));

                    ficha1Lcolor1.setVisible(false);
                    ficha1Lcolor2.setVisible(false);
                    ficha1Lcolor3.setVisible(false);
                    ficha1Lcolor4.setVisible(false);
                    ficha1Lcolor5.setVisible(false);
                    ficha1Lcolor6.setVisible(false);
                    BotonColor1 = false;
                }

                ValidarColores();

                //focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        ficha1Lcolor4.setLayout(null);
        ficha1L.add(ficha1Lcolor4);
        ficha1Lcolor4.setBounds(166 - (125 / 3), 197 - (125 / 3), 83, 83);
        ficha1Lcolor4.setOpaque(false);
        ficha1Lcolor4.setBackground(Color.BLUE); //cambia color fondo jlabel
        ficha1Lcolor4.setFont(new Font("arial", 1, 40));
        //     ficha1Lcolor4.setText(precio + "$");
        ficha1Lcolor4.setForeground(Color.WHITE);
        ficha1Lcolor4.setIcon(new ImageIcon(getClass().getResource("/Files/colores4.png")));
        ficha1Lcolor4.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //     ficha1Lcolor4.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
                if (ColorP2 != 4) {
                    ficha1Lcolor4.setIcon(new ImageIcon(getClass().getResource("/Files/coloress4.png")));
                }
            }
        });
        ficha1Lcolor4.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                         ficha1Lcolor4.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                         ficha1Lcolor4.setIcon(new ImageIcon(getClass().getResource("/Files/     ficha1Lcolor4.png")));
                
                }*/
                if (ColorP2 != 4) {
                    ficha1Lcolor4.setIcon(new ImageIcon(getClass().getResource("/Files/colores4.png")));
                }
            }
        });
        ficha1Lcolor4.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (ColorP2 != 4) {
                    ColorP1 = 4;
                    ficha1L.setIcon(new ImageIcon(getClass().getResource("/Files/player4.png")));

                    ficha1Lcolor1.setVisible(false);
                    ficha1Lcolor2.setVisible(false);
                    ficha1Lcolor3.setVisible(false);
                    ficha1Lcolor4.setVisible(false);
                    ficha1Lcolor5.setVisible(false);
                    ficha1Lcolor6.setVisible(false);
                    BotonColor1 = false;
                }
                ValidarColores();
//focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        ficha1Lcolor5.setLayout(null);
        ficha1L.add(ficha1Lcolor5);
        ficha1Lcolor5.setBounds(208 - (125 / 3), 125 - (125 / 3), 83, 83);
        ficha1Lcolor5.setOpaque(false);
        ficha1Lcolor5.setBackground(Color.BLUE); //cambia color fondo jlabel
        ficha1Lcolor5.setFont(new Font("arial", 1, 40));
        //      ficha1Lcolor5.setText(precio + "$");
        ficha1Lcolor5.setForeground(Color.WHITE);
        ficha1Lcolor5.setIcon(new ImageIcon(getClass().getResource("/Files/colores5.png")));
        ficha1Lcolor5.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //      ficha1Lcolor5.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
                if (ColorP2 != 5) {
                    ficha1Lcolor5.setIcon(new ImageIcon(getClass().getResource("/Files/coloress5.png")));
                }
            }
        });
        ficha1Lcolor5.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                          ficha1Lcolor5.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                          ficha1Lcolor5.setIcon(new ImageIcon(getClass().getResource("/Files/      ficha1Lcolor5.png")));
                }*/
                if (ColorP2 != 5) {
                    ficha1Lcolor5.setIcon(new ImageIcon(getClass().getResource("/Files/colores5.png")));
                }
            }
        });
        ficha1Lcolor5.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (ColorP2 != 5) {
                    ColorP1 = 5;
                    ficha1L.setIcon(new ImageIcon(getClass().getResource("/Files/player5.png")));

                    ficha1Lcolor1.setVisible(false);
                    ficha1Lcolor2.setVisible(false);
                    ficha1Lcolor3.setVisible(false);
                    ficha1Lcolor4.setVisible(false);
                    ficha1Lcolor5.setVisible(false);
                    ficha1Lcolor6.setVisible(false);
                    BotonColor1 = false;
                }//focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));

                ValidarColores();
            }

        });

        ficha1Lcolor6.setLayout(null);
        ficha1L.add(ficha1Lcolor6);
        ficha1Lcolor6.setBounds(167 - (125 / 3), 53 - (125 / 3), 83, 83);
        ficha1Lcolor6.setOpaque(false);
        ficha1Lcolor6.setBackground(Color.BLUE); //cambia color fondo jlabel
        ficha1Lcolor6.setFont(new Font("arial", 1, 40));
        //       ficha1Lcolor6.setText(precio + "$");
        ficha1Lcolor6.setForeground(Color.WHITE);
        ficha1Lcolor6.setIcon(new ImageIcon(getClass().getResource("/Files/colores6.png")));
        ficha1Lcolor6.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //       ficha1Lcolor6.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
                if (ColorP2 != 6) {
                    ficha1Lcolor6.setIcon(new ImageIcon(getClass().getResource("/Files/coloress6.png")));
                }
            }
        });
        ficha1Lcolor6.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                           ficha1Lcolor6.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                           ficha1Lcolor6.setIcon(new ImageIcon(getClass().getResource("/Files/       ficha1Lcolor6.png")));
                }*/
                if (ColorP2 != 6) {
                    ficha1Lcolor6.setIcon(new ImageIcon(getClass().getResource("/Files/colores6.png")));
                }
            }
        });
        ficha1Lcolor6.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (ColorP2 != 6) {
                    ColorP1 = 6;
                    ficha1L.setIcon(new ImageIcon(getClass().getResource("/Files/player6.png")));

                    ficha1Lcolor1.setVisible(false);
                    ficha1Lcolor2.setVisible(false);
                    ficha1Lcolor3.setVisible(false);
                    ficha1Lcolor4.setVisible(false);
                    ficha1Lcolor5.setVisible(false);
                    ficha1Lcolor6.setVisible(false);
                    BotonColor1 = false;
                }//focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));

                ValidarColores();
            }

        });

        ficha2L.setLayout(null);
        LocalPanel.add(ficha2L);
        ficha2L.setBounds((int) ((getContentPane().getWidth() / 2) + 150), (int) ((getContentPane().getHeight() - 638) * 155 / 363) + 20, 250, 250);
        ficha2L.setOpaque(false);
        ficha2L.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        ficha2L.setFont(new Font("arial", 1, 40));
        //ficha2L.setText(precio + "$");
        ficha2L.setForeground(Color.WHITE);
        ficha2L.setIcon(new ImageIcon(getClass().getResource("/Files/player3.png")));
        ficha2L.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //ficha2L.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
            }
        });
        ficha2L.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                    ficha2L.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                    ficha2L.setIcon(new ImageIcon(getClass().getResource("/Files/ficha2L.png")));
                }*/

            }
        });
        ficha2L.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  

                //focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        ficha2Lcolor.setLayout(null);
        ficha2L.add(ficha2Lcolor);
        ficha2Lcolor.setBounds(215, 0, 35, 35);
        ficha2Lcolor.setOpaque(false);
        ficha2Lcolor.setBackground(Color.RED); //cambia color fondo jlabel
        ficha2Lcolor.setFont(new Font("arial", 1, 40));
        // ficha2Lcolor.setText(precio + "$");
        ficha2Lcolor.setForeground(Color.WHITE);
        ficha2Lcolor.setIcon(new ImageIcon(getClass().getResource("/Files/fichaC.png")));
        ficha2Lcolor.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                ficha2Lcolor.setIcon(new ImageIcon(getClass().getResource("/Files/fichaC1.png")));
            }
        });
        ficha2Lcolor.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                     ficha2Lcolor.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                     ficha2Lcolor.setIcon(new ImageIcon(getClass().getResource("/Files/ ficha2Lcolor.png")));
                }*/
                ficha2Lcolor.setIcon(new ImageIcon(getClass().getResource("/Files/fichaC.png")));

            }
        });
        ficha2Lcolor.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (BotonColor2 == false) {
                    ficha2Lcolor1.setVisible(true);
                    ficha2Lcolor2.setVisible(true);
                    ficha2Lcolor3.setVisible(true);
                    ficha2Lcolor4.setVisible(true);
                    ficha2Lcolor5.setVisible(true);
                    ficha2Lcolor6.setVisible(true);
                    BotonColor2 = true;
                } else {
                    ficha2Lcolor1.setVisible(false);
                    ficha2Lcolor2.setVisible(false);
                    ficha2Lcolor3.setVisible(false);
                    ficha2Lcolor4.setVisible(false);
                    ficha2Lcolor5.setVisible(false);
                    ficha2Lcolor6.setVisible(false);
                    BotonColor2 = false;
                }
                ValidarColores();
                //focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        ficha2Lcolor1.setLayout(null);
        ficha2L.add(ficha2Lcolor1);
        ficha2Lcolor1.setBounds(83 - (125 / 3), 53 - (125 / 3), 83, 83);
        ficha2Lcolor1.setOpaque(false);
        ficha2Lcolor1.setBackground(Color.BLUE); //cambia color fondo jlabel
        ficha2Lcolor1.setFont(new Font("arial", 1, 40));
        //   ficha2Lcolor1.setText(precio + "$");
        ficha2Lcolor1.setForeground(Color.WHITE);
        ficha2Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/colores1.png")));
        ficha2Lcolor1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //   ficha2Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
                if (ColorP1 != 1) {
                    ficha2Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/coloress1.png")));
                }
            }
        });
        ficha2Lcolor1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                       ficha2Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                       ficha2Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/   ficha2Lcolor1.png")));
                }*/
                if (ColorP1 != 1) {
                    ficha2Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/colores1.png")));
                }

            }
        });
        ficha2Lcolor1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (ColorP1 != 1) {
                    ColorP2 = 1;
                    ficha2L.setIcon(new ImageIcon(getClass().getResource("/Files/player1.png")));

                    ficha2Lcolor1.setVisible(false);
                    ficha2Lcolor2.setVisible(false);
                    ficha2Lcolor3.setVisible(false);
                    ficha2Lcolor4.setVisible(false);
                    ficha2Lcolor5.setVisible(false);
                    ficha2Lcolor6.setVisible(false);
                    BotonColor2 = false;
                }//focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
                ValidarColores();
            }

        });

        ficha2Lcolor2.setLayout(null);
        ficha2L.add(ficha2Lcolor2);
        ficha2Lcolor2.setBounds(41 - (125 / 3), 125 - (125 / 3), 83, 83);
        ficha2Lcolor2.setOpaque(false);
        ficha2Lcolor2.setBackground(Color.BLUE); //cambia color fondo jlabel
        ficha2Lcolor2.setFont(new Font("arial", 1, 40));
        //    ficha2Lcolor2.setText(precio + "$");
        ficha2Lcolor2.setForeground(Color.WHITE);
        ficha2Lcolor2.setIcon(new ImageIcon(getClass().getResource("/Files/colores3.png")));
        ficha2Lcolor2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //    ficha2Lcolor2.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
                if (ColorP1 != 2) {
                    ficha2Lcolor2.setIcon(new ImageIcon(getClass().getResource("/Files/coloress3.png")));
                }
            }
        });
        ficha2Lcolor2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                        ficha2Lcolor2.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                        ficha2Lcolor2.setIcon(new ImageIcon(getClass().getResource("/Files/    ficha2Lcolor2.png")));
                }*/
                if (ColorP1 != 2) {
                    ficha2Lcolor2.setIcon(new ImageIcon(getClass().getResource("/Files/colores3.png")));
                }

            }
        });
        ficha2Lcolor2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (ColorP1 != 2) {
                    ColorP2 = 2;
                    ficha2L.setIcon(new ImageIcon(getClass().getResource("/Files/player3.png")));

                    ficha2Lcolor1.setVisible(false);
                    ficha2Lcolor2.setVisible(false);
                    ficha2Lcolor3.setVisible(false);
                    ficha2Lcolor4.setVisible(false);
                    ficha2Lcolor5.setVisible(false);
                    ficha2Lcolor6.setVisible(false);
                    BotonColor2 = false;
                }//focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
                ValidarColores();
            }

        });

        ficha2Lcolor3.setLayout(null);
        ficha2L.add(ficha2Lcolor3);
        ficha2Lcolor3.setBounds(83 - (125 / 3), 197 - (125 / 3), 83, 83);
        ficha2Lcolor3.setOpaque(false);
        ficha2Lcolor3.setBackground(Color.BLUE); //cambia color fondo jlabel
        ficha2Lcolor3.setFont(new Font("arial", 1, 40));
        //     ficha2Lcolor3.setText(precio + "$");
        ficha2Lcolor3.setForeground(Color.WHITE);
        ficha2Lcolor3.setIcon(new ImageIcon(getClass().getResource("/Files/colores2.png")));
        ficha2Lcolor3.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //     ficha2Lcolor3.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
                if (ColorP1 != 3) {
                    ficha2Lcolor3.setIcon(new ImageIcon(getClass().getResource("/Files/coloress2.png")));
                }
            }
        });
        ficha2Lcolor3.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                         ficha2Lcolor3.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                         ficha2Lcolor3.setIcon(new ImageIcon(getClass().getResource("/Files/     ficha2Lcolor3.png")));
                }*/
                if (ColorP1 != 3) {
                    ficha2Lcolor3.setIcon(new ImageIcon(getClass().getResource("/Files/colores2.png")));
                }
            }
        });
        ficha2Lcolor3.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (ColorP1 != 3) {
                    ColorP2 = 3;
                    ficha2L.setIcon(new ImageIcon(getClass().getResource("/Files/player2.png")));

                    ficha2Lcolor1.setVisible(false);
                    ficha2Lcolor2.setVisible(false);
                    ficha2Lcolor3.setVisible(false);
                    ficha2Lcolor4.setVisible(false);
                    ficha2Lcolor5.setVisible(false);
                    ficha2Lcolor6.setVisible(false);
                    BotonColor2 = false;
                }//focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
                ValidarColores();
            }

        });

        ficha2Lcolor4.setLayout(null);
        ficha2L.add(ficha2Lcolor4);
        ficha2Lcolor4.setBounds(166 - (125 / 3), 197 - (125 / 3), 83, 83);
        ficha2Lcolor4.setOpaque(false);
        ficha2Lcolor4.setBackground(Color.BLUE); //cambia color fondo jlabel
        ficha2Lcolor4.setFont(new Font("arial", 1, 40));
        //      ficha2Lcolor4.setText(precio + "$");
        ficha2Lcolor4.setForeground(Color.WHITE);
        ficha2Lcolor4.setIcon(new ImageIcon(getClass().getResource("/Files/colores4.png")));
        ficha2Lcolor4.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //      ficha2Lcolor4.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
                if (ColorP1 != 4) {
                    ficha2Lcolor4.setIcon(new ImageIcon(getClass().getResource("/Files/coloress4.png")));
                }
            }
        });
        ficha2Lcolor4.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                          ficha2Lcolor4.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                          ficha2Lcolor4.setIcon(new ImageIcon(getClass().getResource("/Files/      ficha2Lcolor4.png")));
                
                
                }*/
                if (ColorP1 != 4) {
                    ficha2Lcolor4.setIcon(new ImageIcon(getClass().getResource("/Files/colores4.png")));
                }

            }
        });
        ficha2Lcolor4.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (ColorP1 != 4) {
                    ColorP2 = 4;
                    ficha2L.setIcon(new ImageIcon(getClass().getResource("/Files/player4.png")));

                    ficha2Lcolor1.setVisible(false);
                    ficha2Lcolor2.setVisible(false);
                    ficha2Lcolor3.setVisible(false);
                    ficha2Lcolor4.setVisible(false);
                    ficha2Lcolor5.setVisible(false);
                    ficha2Lcolor6.setVisible(false);
                    BotonColor2 = false;
                }//focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
                ValidarColores();
            }

        });

        ficha2Lcolor5.setLayout(null);
        ficha2L.add(ficha2Lcolor5);
        ficha2Lcolor5.setBounds(208 - (125 / 3), 125 - (125 / 3), 83, 83);
        ficha2Lcolor5.setOpaque(false);
        ficha2Lcolor5.setBackground(Color.BLUE); //cambia color fondo jlabel
        ficha2Lcolor5.setFont(new Font("arial", 1, 40));
        //       ficha2Lcolor5.setText(precio + "$");
        ficha2Lcolor5.setForeground(Color.WHITE);
        ficha2Lcolor5.setIcon(new ImageIcon(getClass().getResource("/Files/colores5.png")));
        ficha2Lcolor5.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //       ficha2Lcolor5.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
                if (ColorP1 != 5) {
                    ficha2Lcolor5.setIcon(new ImageIcon(getClass().getResource("/Files/coloress5.png")));
                }
            }
        });
        ficha2Lcolor5.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                           ficha2Lcolor5.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                           ficha2Lcolor5.setIcon(new ImageIcon(getClass().getResource("/Files/       ficha2Lcolor5.png")));
                }*/
                if (ColorP1 != 5) {
                    ficha2Lcolor5.setIcon(new ImageIcon(getClass().getResource("/Files/colores5.png")));
                }
            }
        });
        ficha2Lcolor5.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (ColorP1 != 5) {
                    ColorP2 = 5;
                    ficha2L.setIcon(new ImageIcon(getClass().getResource("/Files/player5.png")));

                    ficha2Lcolor1.setVisible(false);
                    ficha2Lcolor2.setVisible(false);
                    ficha2Lcolor3.setVisible(false);
                    ficha2Lcolor4.setVisible(false);
                    ficha2Lcolor5.setVisible(false);
                    ficha2Lcolor6.setVisible(false);
                    BotonColor2 = false;
                } //focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
                ValidarColores();
            }

        });

        ficha2Lcolor6.setLayout(null);
        ficha2L.add(ficha2Lcolor6);
        ficha2Lcolor6.setBounds(167 - (125 / 3), 53 - (125 / 3), 83, 83);
        ficha2Lcolor6.setOpaque(false);
        ficha2Lcolor6.setBackground(Color.BLUE); //cambia color fondo jlabel
        ficha2Lcolor6.setFont(new Font("arial", 1, 40));
        //        ficha2Lcolor6.setText(precio + "$");
        ficha2Lcolor6.setForeground(Color.WHITE);
        ficha2Lcolor6.setIcon(new ImageIcon(getClass().getResource("/Files/colores6.png")));
        ficha2Lcolor6.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //        ficha2Lcolor6.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
                if (ColorP1 != 6) {
                    ficha2Lcolor6.setIcon(new ImageIcon(getClass().getResource("/Files/coloress6.png")));
                }
            }
        });
        ficha2Lcolor6.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                            ficha2Lcolor6.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                            ficha2Lcolor6.setIcon(new ImageIcon(getClass().getResource("/Files/        ficha2Lcolor6.png")));
                }*/
                if (ColorP1 != 6) {
                    ficha2Lcolor6.setIcon(new ImageIcon(getClass().getResource("/Files/colores6.png")));
                }
            }
        });
        ficha2Lcolor6.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (ColorP1 != 6) {
                    ColorP2 = 6;
                    ficha2L.setIcon(new ImageIcon(getClass().getResource("/Files/player6.png")));

                    ficha2Lcolor1.setVisible(false);
                    ficha2Lcolor2.setVisible(false);
                    ficha2Lcolor3.setVisible(false);
                    ficha2Lcolor4.setVisible(false);
                    ficha2Lcolor5.setVisible(false);
                    ficha2Lcolor6.setVisible(false);
                    BotonColor2 = false;
                }//focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
                ValidarColores();
            }

        });

        filasL.setLayout(null);
        LocalPanel.add(filasL);
        filasL.setBounds((int) ((getContentPane().getWidth() / 2) - 80), (int) ((getContentPane().getHeight() - 638) * 250 / 363) + 290, 160, 60);
        filasL.setOpaque(false);
        filasL.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        filasL.setFont(new Font("century gothic", 1, 40));
        //filasL.setText("5");
        filasL.setHorizontalAlignment(JTextField.CENTER);
        filasL.setForeground(Color.WHITE);
        filasL.setIcon(new ImageIcon(getClass().getResource("/Files/filas.png")));
        filasL.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //filasL.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
            }
        });
        filasL.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                    filasL.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                    filasL.setIcon(new ImageIcon(getClass().getResource("/Files/filasL.png")));
                }*/

            }
        });
        filasL.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                HomePanel.setVisible(false);
                LocalPanel.setVisible(true);
                //focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        columnasL.setLayout(null);
        LocalPanel.add(columnasL);
        columnasL.setBounds((int) ((getContentPane().getWidth() / 2) - 80), (int) ((getContentPane().getHeight() - 638) * 270 / 363) + 420, 160, 60);
        columnasL.setOpaque(false);
        columnasL.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        columnasL.setFont(new Font("century gothic", 1, 40));
        //columnasL.setText("5");
        columnasL.setHorizontalAlignment(JTextField.CENTER);
        columnasL.setForeground(Color.WHITE);
        columnasL.setIcon(new ImageIcon(getClass().getResource("/Files/filas.png")));
        columnasL.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //columnasL.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
            }
        });
        columnasL.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                    columnasL.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                    columnasL.setIcon(new ImageIcon(getClass().getResource("/Files/columnasL.png")));
                }*/

            }
        });
        columnasL.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  

                //focoNodoVector = true;
                //columnasL.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        filasL1.setLayout(null);
        filasL.add(filasL1);
        filasL1.setBounds(30, 0, 100, 60);
        filasL1.setOpaque(false);
        filasL1.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        filasL1.setFont(new Font("century gothic", 1, 40));
        filasL1.setText("7");
        filasL1.setHorizontalAlignment(JTextField.CENTER);
        filasL1.setForeground(Color.WHITE);
        //filasL1.setIcon(new ImageIcon(getClass().getResource("/Files/filas.png")));
        filasL1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //filasL1.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
            }
        });
        filasL1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                    filasL1.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                    filasL1.setIcon(new ImageIcon(getClass().getResource("/Files/filasL1.png")));
                }*/

            }
        });
        filasL1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                HomePanel.setVisible(false);
                LocalPanel.setVisible(true);
                //focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        columnasL1.setLayout(null);
        columnasL.add(columnasL1);
        columnasL1.setBounds(30, 0, 100, 60);
        columnasL1.setOpaque(false);
        columnasL1.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        columnasL1.setFont(new Font("century gothic", 1, 40));
        columnasL1.setText("12");
        columnasL1.setHorizontalAlignment(JTextField.CENTER);
        columnasL1.setForeground(Color.WHITE);
        //columnasL1.setIcon(new ImageIcon(getClass().getResource("/Files/filas.png")));
        columnasL1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //columnasL1.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
            }
        });
        columnasL1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                    columnasL1.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                    columnasL1.setIcon(new ImageIcon(getClass().getResource("/Files/columnasL1.png")));
                }*/

            }
        });
        columnasL1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  

                //focoNodoVector = true;
                //columnasL1.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        FilaL.setLayout(null);
        LocalPanel.add(FilaL);
        FilaL.setBounds((int) ((getContentPane().getWidth() / 2) - 80), (int) ((getContentPane().getHeight() - 638) * 250 / 363) + 250, 160, 30);
        FilaL.setOpaque(false);
        FilaL.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        FilaL.setFont(new Font("century gothic", 1, 30));
        //FilaL.setText("Filas");
        FilaL.setHorizontalAlignment(JTextField.CENTER);
        FilaL.setForeground(Color.WHITE);
        FilaL.setIcon(new ImageIcon(getClass().getResource("/Files/rows.png")));
        FilaL.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //FilaL.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
            }
        });
        FilaL.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                    FilaL.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                    FilaL.setIcon(new ImageIcon(getClass().getResource("/Files/FilaL.png")));
                }*/

            }
        });
        FilaL.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                HomePanel.setVisible(false);
                LocalPanel.setVisible(true);
                //focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        ColumnaL.setLayout(null);
        LocalPanel.add(ColumnaL);
        ColumnaL.setBounds((int) ((getContentPane().getWidth() / 2) - 80), (int) ((getContentPane().getHeight() - 638) * 270 / 363) + 380, 160, 30);
        ColumnaL.setOpaque(false);
        ColumnaL.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        ColumnaL.setFont(new Font("century gothic", 1, 30));
        //ColumnaL.setText("Columnas");
        ColumnaL.setHorizontalAlignment(JTextField.CENTER);
        ColumnaL.setForeground(Color.WHITE);
        ColumnaL.setIcon(new ImageIcon(getClass().getResource("/Files/columns.png")));
        ColumnaL.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //ColumnaL.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
            }
        });
        ColumnaL.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                    ColumnaL.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                    ColumnaL.setIcon(new ImageIcon(getClass().getResource("/Files/ColumnaL.png")));
                }*/

            }
        });
        ColumnaL.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  

                //focoNodoVector = true;
                //ColumnaL.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        ajustarFizq.setLayout(null);
        LocalPanel.add(ajustarFizq);
        ajustarFizq.setBounds((int) ((getContentPane().getWidth() / 2) - 150), (int) ((getContentPane().getHeight() - 638) * 250 / 363) + 290, 50, 60);
        ajustarFizq.setOpaque(false);
        ajustarFizq.setBackground(Color.black); //cambia color fondo jlabel
        ajustarFizq.setFont(new Font("arial", 1, 40));
        //ajustarFizq.setText(precio + "$");
        ajustarFizq.setForeground(Color.WHITE);
        ajustarFizq.setIcon(new ImageIcon(getClass().getResource("/Files/filasIzq.png")));
        ajustarFizq.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                ajustarFizq.setIcon(new ImageIcon(getClass().getResource("/Files/filasIzq1.png")));
            }
        });
        ajustarFizq.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                ajustarFizq.setIcon(new ImageIcon(getClass().getResource("/Files/filasIzq.png")));

            }
        });
        ajustarFizq.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                String Nfila = "";
                int nfila = 0;
                Nfila = filasL1.getText();
                nfila = Integer.parseInt(Nfila);
                if (nfila > 5) {
                    nfila = nfila - 1;
                }
                Nfila = String.valueOf(nfila);
                filasL1.setText(Nfila);

                //focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        ajustarFder.setLayout(null);
        LocalPanel.add(ajustarFder);
        ajustarFder.setBounds((int) ((getContentPane().getWidth() / 2) + 100), (int) ((getContentPane().getHeight() - 638) * 250 / 363) + 290, 50, 60);
        ajustarFder.setOpaque(false);
        ajustarFder.setBackground(Color.black); //cambia color fondo jlabel
        ajustarFder.setFont(new Font("arial", 1, 40));
        //ajustarFder.setText(precio + "$");
        ajustarFder.setForeground(Color.WHITE);
        ajustarFder.setIcon(new ImageIcon(getClass().getResource("/Files/filasDer.png")));
        ajustarFder.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                ajustarFder.setIcon(new ImageIcon(getClass().getResource("/Files/filasDer1.png")));
            }
        });
        ajustarFder.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                ajustarFder.setIcon(new ImageIcon(getClass().getResource("/Files/filasDer.png")));

            }
        });
        ajustarFder.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                String Nfila1 = "";
                int nfila1 = 0;
                Nfila1 = filasL1.getText();
                nfila1 = Integer.parseInt(Nfila1);
                if (nfila1 < 8) {
                    nfila1 = nfila1 + 1;
                }

                Nfila1 = String.valueOf(nfila1);
                filasL1.setText(Nfila1);

                //focoNodoVector = true;
                //Localgame.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        ajustarCizq.setLayout(null);
        LocalPanel.add(ajustarCizq);
        ajustarCizq.setBounds((int) ((getContentPane().getWidth() / 2) - 150), (int) ((getContentPane().getHeight() - 638) * 270 / 363) + 420, 50, 60);
        ajustarCizq.setOpaque(false);
        ajustarCizq.setBackground(Color.black); //cambia color fondo jlabel
        ajustarCizq.setFont(new Font("arial", 1, 40));
        //ajustarCizq.setText(precio + "$");
        ajustarCizq.setForeground(Color.WHITE);
        ajustarCizq.setIcon(new ImageIcon(getClass().getResource("/Files/filasIzq.png")));
        ajustarCizq.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                ajustarCizq.setIcon(new ImageIcon(getClass().getResource("/Files/filasIzq1.png")));
            }
        });
        ajustarCizq.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                ajustarCizq.setIcon(new ImageIcon(getClass().getResource("/Files/filasIzq.png")));

            }
        });
        ajustarCizq.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                String Ncol = "";
                int ncol = 0;
                Ncol = columnasL1.getText();
                ncol = Integer.parseInt(Ncol);
                if (ncol > 5) {
                    ncol = ncol - 1;
                }
                Ncol = String.valueOf(ncol);
                columnasL1.setText(Ncol);

            }

        });

        ajustarCder.setLayout(null);
        LocalPanel.add(ajustarCder);
        ajustarCder.setBounds((int) ((getContentPane().getWidth() / 2) + 100), (int) ((getContentPane().getHeight() - 638) * 270 / 363) + 420, 50, 60);
        ajustarCder.setOpaque(false);
        ajustarCder.setBackground(Color.black); //cambia color fondo jlabel
        ajustarCder.setFont(new Font("arial", 1, 40));
        //ajustarCder.setText(precio + "$");
        ajustarCder.setForeground(Color.WHITE);
        ajustarCder.setIcon(new ImageIcon(getClass().getResource("/Files/filasDer.png")));
        ajustarCder.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                ajustarCder.setIcon(new ImageIcon(getClass().getResource("/Files/filasDer1.png")));
            }
        });
        ajustarCder.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                ajustarCder.setIcon(new ImageIcon(getClass().getResource("/Files/filasDer.png")));

            }
        });
        ajustarCder.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                String Ncol2;
                int ncol2;
                Ncol2 = columnasL1.getText();
                ncol2 = Integer.parseInt(Ncol2);
                if (ncol2 < 15) {
                    ncol2 = ncol2 + 1;
                }
                Ncol2 = String.valueOf(ncol2);
                columnasL1.setText(Ncol2);

            }

        });

        BotonPlayL.setLayout(null);
        LocalPanel.add(BotonPlayL);
        BotonPlayL.setBounds((int) ((getContentPane().getWidth() / 2) - 75), (int) ((getContentPane().getHeight() - 638) * 280 / 363) + 520, 150, 80);
        BotonPlayL.setOpaque(false);
        BotonPlayL.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        BotonPlayL.setFont(new Font("arial", 1, 40));
        //BotonPlayL.setText(precio + "$");
        BotonPlayL.setForeground(Color.WHITE);
        BotonPlayL.setIcon(new ImageIcon(getClass().getResource("/Files/play.png")));
        BotonPlayL.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                BotonPlayL.setIcon(new ImageIcon(getClass().getResource("/Files/play2.png")));
            }
        });
        BotonPlayL.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                BotonPlayL.setIcon(new ImageIcon(getClass().getResource("/Files/play.png")));
            }
        });
        BotonPlayL.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                StartNewGame();
                LocalPanel.setVisible(false);
                gra.WorkBoard.setVisible(true);
                gra.pause.setVisible(true);
                gra.refresh.setVisible(false);
                gra.menup.setVisible(false);
                gra.inGame.setVisible(true);
                gra.inGame2.setVisible(true);
                gra.pausePanel.setVisible(true);

            }

        });

        Panelpause.setLayout(null);
        Panelpause.setBounds(0, 0, getContentPane().getWidth(), getContentPane().getHeight());
        Panelpause.setBackground(new Color(35, 37, 43));
        Panelpause.setOpaque(true);
        add(Panelpause);
        Panelpause.setVisible(false);

        pauseTitulo.setLayout(null);
        Panelpause.add(pauseTitulo);
        pauseTitulo.setBounds((int) ((getContentPane().getWidth() / 2) - 500), (int) ((getContentPane().getHeight() - 638) * 50 / 363), 1000, 250);
        pauseTitulo.setOpaque(false);
        pauseTitulo.setText("PAUSA");
        pauseTitulo.setIcon(new ImageIcon(getClass().getResource("/Files/pauseTitulo.png")));
        pauseTitulo.setBackground(Color.MAGENTA); //cambia color fondo jlabel
        pauseTitulo.setFont(new Font("arial", 1, 40));
        pauseTitulo.setVisible(true);

        botonReanude.setLayout(null);
        Panelpause.add(botonReanude);
        botonReanude.setBounds((int) ((getContentPane().getWidth() / 2) - 225), (int) ((getContentPane().getHeight() - 638) * 130 / 363) + 320, 450, 125);
        botonReanude.setOpaque(false);
        botonReanude.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        botonReanude.setFont(new Font("arial", 1, 40));
        //botonReanude.setText("REANUDAR");
        botonReanude.setForeground(Color.WHITE);
        botonReanude.setIcon(new ImageIcon(getClass().getResource("/Files/botonReanude.png")));
        botonReanude.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                botonReanude.setIcon(new ImageIcon(getClass().getResource("/Files/botonReanude1.png")));
            }
        });
        botonReanude.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                botonReanude.setIcon(new ImageIcon(getClass().getResource("/Files/botonReanude.png")));
            }
        });
        botonReanude.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                gra.WorkBoard.setVisible(true);
                gra.inGame.setVisible(true);
                gra.inGame2.setVisible(true);
                gra.pausePanel.setVisible(true);
                Panelpause.setVisible(false);
                gra.onPause = false;
            }

        });

        botonMenu.setLayout(null);
        Panelpause.add(botonMenu);
        botonMenu.setBounds((int) ((getContentPane().getWidth() / 2) - 225), (int) ((getContentPane().getHeight() - 638) * 180 / 363) + 470, 450, 125);
        botonMenu.setOpaque(false);
        botonMenu.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        botonMenu.setFont(new Font("arial", 1, 40));
        //botonMenu.setText("MENU PRINCIPAL");
        botonMenu.setForeground(Color.WHITE);
        botonMenu.setIcon(new ImageIcon(getClass().getResource("/Files/botonMenu.png")));
        botonMenu.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                botonMenu.setIcon(new ImageIcon(getClass().getResource("/Files/botonMenu1.png")));
            }
        });
        botonMenu.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                    botonMenu.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                    botonMenu.setIcon(new ImageIcon(getClass().getResource("/Files/botonMenu.png")));
                }*/

                botonMenu.setIcon(new ImageIcon(getClass().getResource("/Files/botonMenu.png")));
            }
        });
        botonMenu.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                HomePanel.setVisible(true);
                Titulo.setVisible(true);
                Panelpause.setVisible(false);
                gra.PauseLoop();
            }

        });

        pauseTime1.setLayout(null);
        Panelpause.add(pauseTime1);
        pauseTime1.setBounds((int) ((getContentPane().getWidth() / 2) - 225), (int) ((getContentPane().getHeight() - 638) * 130 / 363) + 220, 225, 80);
        pauseTime1.setOpaque(false);
        pauseTime1.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        pauseTime1.setFont(new Font("century gothic", 1, 70));
        pauseTime1.setText("pause1");
        pauseTime1.setForeground(Color.WHITE);
        pauseTime1.setHorizontalAlignment(JTextField.CENTER);
        //pauseTime1.setIcon(new ImageIcon(getClass().getResource("/Files/LocalVS.png")));
        pauseTime1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //pauseTime1.setIcon(new ImageIcon(getClass().getResource("/Files/Local1.png")));
            }
        });
        pauseTime1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //pauseTime1.setIcon(new ImageIcon(getClass().getResource("/Files/LocalVS.png")));
            }
        });
        pauseTime1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                //Panelpause.setVisible(false);
                //LocalPanel.setVisible(true);
                //focoNodoVector = true;
                //pauseTime1.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

        pauseTime2.setLayout(null);
        Panelpause.add(pauseTime2);
        pauseTime2.setBounds((int) ((getContentPane().getWidth() / 2)), (int) ((getContentPane().getHeight() - 638) * 130 / 363) + 220, 225, 80);
        pauseTime2.setOpaque(false);
        pauseTime2.setBackground(Color.RED); //cambia color fondo jlabel
        pauseTime2.setFont(new Font("century gothic", 1, 70));
        pauseTime2.setText("pause2");
        pauseTime2.setForeground(Color.WHITE);
        pauseTime2.setHorizontalAlignment(JTextField.CENTER);
        //pauseTime2.setIcon(new ImageIcon(getClass().getResource("/Files/Local1.png")));
        pauseTime2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                //pauseTime2.setIcon(new ImageIcon(getClass().getResource("/Files/torresEncima.png")));
            }
        });
        pauseTime2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      
                /*if (focoNodoVector == true) {
                    pauseTime2.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                } else {
                    pauseTime2.setIcon(new ImageIcon(getClass().getResource("/Files/pauseTime2.png")));
                }*/

            }
        });
        pauseTime2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  

                //focoNodoVector = true;
                //pauseTime2.setIcon(new ImageIcon(getClass().getResource("/Files/torresSeleccion.png")));
                //botonVector.setIcon(new ImageIcon(getClass().getResource("/Files/botonVector.png")));
            }

        });

    }

    public void ValidarColores() {
        //player 1
        ficha1Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/colores1.png")));
        ficha1Lcolor2.setIcon(new ImageIcon(getClass().getResource("/Files/colores3.png")));
        ficha1Lcolor3.setIcon(new ImageIcon(getClass().getResource("/Files/colores2.png")));
        ficha1Lcolor4.setIcon(new ImageIcon(getClass().getResource("/Files/colores4.png")));
        ficha1Lcolor5.setIcon(new ImageIcon(getClass().getResource("/Files/colores5.png")));
        ficha1Lcolor6.setIcon(new ImageIcon(getClass().getResource("/Files/colores6.png")));
        //se asignan todos los colores
        ficha2Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/colores1.png")));
        ficha2Lcolor2.setIcon(new ImageIcon(getClass().getResource("/Files/colores3.png")));
        ficha2Lcolor3.setIcon(new ImageIcon(getClass().getResource("/Files/colores2.png")));
        ficha2Lcolor4.setIcon(new ImageIcon(getClass().getResource("/Files/colores4.png")));
        ficha2Lcolor5.setIcon(new ImageIcon(getClass().getResource("/Files/colores5.png")));
        ficha2Lcolor6.setIcon(new ImageIcon(getClass().getResource("/Files/colores6.png")));

        switch (ColorP2) {
            case 1:
                ficha1Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/NOcolor.png")));
                break;
            case 2: ///color rojo a grisNOcolor
                ficha1Lcolor2.setIcon(new ImageIcon(getClass().getResource("/Files/NOcolor.png")));
                break;
            case 3: ///color rojo a grisNOcolor
                ficha1Lcolor3.setIcon(new ImageIcon(getClass().getResource("/Files/NOcolor.png")));
                break;
            case 4: ///color rojo a grisNOcolor
                ficha1Lcolor4.setIcon(new ImageIcon(getClass().getResource("/Files/NOcolor.png")));
                break;
            case 5: ///color rojo a grisNOcolor
                ficha1Lcolor5.setIcon(new ImageIcon(getClass().getResource("/Files/NOcolor.png")));
                break;
            case 6: ///color rojo a grisNOcolor
                ficha1Lcolor6.setIcon(new ImageIcon(getClass().getResource("/Files/NOcolor.png")));
                break;
        }
        switch (ColorP1) {
            case 1: ///color rojo a gris
                ficha2Lcolor1.setIcon(new ImageIcon(getClass().getResource("/Files/NOcolor.png")));
                break;
            case 2: ///color rojo a gris
                ficha2Lcolor2.setIcon(new ImageIcon(getClass().getResource("/Files/NOcolor.png")));
                break;
            case 3: ///color rojo a gris
                ficha2Lcolor3.setIcon(new ImageIcon(getClass().getResource("/Files/NOcolor.png")));
                break;
            case 4: ///color rojo a gris
                ficha2Lcolor4.setIcon(new ImageIcon(getClass().getResource("/Files/NOcolor.png")));
                break;
            case 5: ///color rojo a gris
                ficha2Lcolor5.setIcon(new ImageIcon(getClass().getResource("/Files/NOcolor.png")));
                break;
            case 6: ///color rojo a gris
                ficha2Lcolor6.setIcon(new ImageIcon(getClass().getResource("/Files/NOcolor.png")));
                break;
        }

    }

    public void StartNewGame() {
        //gra = null;
        /*gra.WorkBoard.setVisible(false);
        gra.inGame.setVisible(false);
        gra.inGame2.setVisible(false);
        gra.pausePanel.setVisible(false);
        gra.setVisible(false);
        gra.Window = null;     gra.Window = null;
        
        remove(gra.WorkBoard);
        remove(gra.inGame);
        remove(gra.inGame2);
        remove(gra.pausePanel);
        /*gra = new GraphicEngine(this, Integer.parseInt(columnasL1.getText()), Integer.parseInt(filasL1.getText()), ColorP1, ColorP2);
        add(gra.WorkBoard);
        add(gra.inGame);
        add(gra.inGame2);
        add(gra.pausePanel);*/
 /*gra.WorkBoard = null;
        gra.inGame = null;
        gra.inGame = null;
        gra.pausePanel = null;

        gra = null;
        gra.setVisible(false);

        System.gc();
        gra = new GraphicEngine(this, Integer.parseInt(columnasL1.getText()), Integer.parseInt(filasL1.getText()), ColorP1, ColorP2);

        add(gra.WorkBoard);
        add(gra.inGame);
        add(gra.inGame2);
        add(gra.pausePanel);
        System.out.println(gra.colorPlayer1);*/
        gra.resetParameters(Integer.parseInt(columnasL1.getText()), Integer.parseInt(filasL1.getText()), ColorP1, ColorP2);
        gra.StartLoop();

    }

}
