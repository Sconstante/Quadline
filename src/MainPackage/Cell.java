package MainPackage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Cell {

    int x;
    int y;
    int r;
    int g;
    int b;
    int rodeo;//sin rodeo-0 ,horizontal-1 ,vetical-2 ,izquierda-3 ,derecha-4 

    boolean selected;

    int state;
    boolean Click;
    boolean lastClick;

    GraphicEngine gra;

    Color jugado = new Color(0, 78, 22);

    public Cell(int x, int y, GraphicEngine gra) {
        this.x = x;
        this.y = y;
        r = 255;
        g = x * 12;
        b = y * 12;
        selected = false;
        state = 0;
        this.gra = gra;
        lastClick = false;
        Click = false;
        rodeo = 0;
    }

    public void Actualizations(boolean cli) {
        Click = cli;

        if (gra.mouse.x > x * gra.escale && gra.mouse.x <= x * gra.escale + gra.escale && gra.mouse.y > 0 && gra.mouse.y <= (gra.cellsH - 1) * gra.escale + gra.escale && gra.EndGame == false) {
            //GraphicEngine.cells.get(0).selected=true;
            selected = true;
        } else {
            //GraphicEngine.cells.get(0).selected=false;
            selected = false;
        }
        if (Click == true && lastClick == false && gra.EndGame == false) {

            if (gra.mouse.x > x * gra.escale && gra.mouse.x <= x * gra.escale + gra.escale && gra.mouse.y > 0 && gra.mouse.y <= (gra.cellsH - 1) * gra.escale + gra.escale && y == 0) {

                for (int i = gra.cellsH - 1; i >= 0; i--) {
                    if (gra.cells.get(i + x * (gra.cellsH)).state == 0) {

                        if (gra.turn == false) {
                            gra.turn = true;
                            gra.cells.get(i + x * (gra.cellsH)).state = 1;
                            gra.validateWin(1);
                            //System.out.println("se jugo amarillo");
                        } else {
                            gra.turn = false;
                            gra.cells.get(i + x * (gra.cellsH)).state = 2;
                            gra.validateWin(2);
                            //System.out.println("se jugo rojo");
                        }

                        //System.out.println(GraphicEngine.cells.get(x + i * (GraphicEngine.cellsW - 1)).x + "/" + GraphicEngine.cells.get(x + i * (GraphicEngine.cellsW - 1)).y);
                        break;
                    }
                    //System.out.println(i);
                }
                //GraphicEngine.cells.get(3 + 1 * (GraphicEngine.cellsH)).state = 1;
                /*for (int i = 0; i < GraphicEngine.cells.size(); i++) {
                    System.out.println(GraphicEngine.cells.get(i).x + "/" + GraphicEngine.cells.get(i).y);
                }*/

            }

        }

        lastClick = Click;

    }

    Graphics Frames(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        if (selected == false) {
            // g2.setColor(new Color(this.r, this.g, this.b));
            g2.setColor(Color.darkGray);
            if (gra.EndGame == true) {
                if (gra.ganador == 1) {
                    switch (gra.colorPlayer1) {
                        case 1:
                            g2.setColor(new Color(136, 58, 56));
                            break;
                        case 2:
                            g2.setColor(new Color(47, 90, 121));
                            break;
                        case 3:
                            g2.setColor(new Color(142, 112, 50));
                            break;
                        case 4:
                            g2.setColor(new Color(53, 121, 61));
                            break;
                        case 5:
                            g2.setColor(new Color(117, 47, 145));
                            break;
                        case 6:
                            g2.setColor(new Color(150, 81, 40));
                            break;
                    }
                }
                if (gra.ganador == 2) {
                    switch (gra.colorPlayer2) {
                        case 1:
                            g2.setColor(new Color(136, 58, 56));
                            break;
                        case 2:
                            g2.setColor(new Color(47, 90, 121));
                            break;
                        case 3:
                            g2.setColor(new Color(142, 112, 50));
                            break;
                        case 4:
                            g2.setColor(new Color(53, 121, 61));
                            break;
                        case 5:
                            g2.setColor(new Color(117, 47, 145));
                            break;
                        case 6:
                            g2.setColor(new Color(150, 81, 40));
                            break;
                    }
                }
            }
        } else {
            double rr = this.r * 0.75;
            double gg = this.g * 0.75;
            double bb = this.b * 0.75;
            g2.setColor(new Color((int) rr, (int) gg, (int) bb));
        }
        g2.fillRect((gra.escale * x), (gra.escale * y), gra.escale, gra.escale);
        g2.setColor(new Color(40, 40, 40));

        g2.drawRect((gra.escale * x), (gra.escale * y), gra.escale, gra.escale);
        if (state == 1) {
            //g2.setColor(new Color(255, 45, 45));
            //g2.drawImage(img.getImage(), (gra.escale * x), (gra.escale * y), gra.escale + 2, gra.escale + 2, null);
            switch (gra.colorPlayer1) {
                case 1:
                    g2.drawImage(gra.ficha1, (gra.escale * x), (gra.escale * y), null);
                    break;
                case 2:
                    g2.drawImage(gra.ficha2, (gra.escale * x), (gra.escale * y), null);
                    break;
                case 3:
                    g2.drawImage(gra.ficha3, (gra.escale * x), (gra.escale * y), null);
                    break;
                case 4:
                    g2.drawImage(gra.ficha4, (gra.escale * x), (gra.escale * y), null);
                    break;
                case 5:
                    g2.drawImage(gra.ficha5, (gra.escale * x), (gra.escale * y), null);
                    break;
                case 6:
                    g2.drawImage(gra.ficha6, (gra.escale * x), (gra.escale * y), null);
                    break;

            }

        }
        if (state == 2) {
            //g2.setColor(new Color(45, 45, 255));
            //g2.drawImage(img2.getImage(), (gra.escale * x), (gra.escale * y), gra.escale + 2, gra.escale + 2, null);
            switch (gra.colorPlayer2) {
                case 1:
                    g2.drawImage(gra.ficha1, (gra.escale * x), (gra.escale * y), null);
                    break;
                case 2:
                    g2.drawImage(gra.ficha2, (gra.escale * x), (gra.escale * y), null);
                    break;
                case 3:
                    g2.drawImage(gra.ficha3, (gra.escale * x), (gra.escale * y), null);
                    break;
                case 4:
                    g2.drawImage(gra.ficha4, (gra.escale * x), (gra.escale * y), null);
                    break;
                case 5:
                    g2.drawImage(gra.ficha5, (gra.escale * x), (gra.escale * y), null);
                    break;
                case 6:
                    g2.drawImage(gra.ficha6, (gra.escale * x), (gra.escale * y), null);
                    break;

            }

        }

        if (state == 0) {
            //g2.fillOval(gra.escale * x + (int) (gra.escale * 18 / 100), gra.escale * y + (int) (gra.escale * 18 / 100), (int) (gra.escale * 64 / 100), (int) (gra.escale * 64 / 100));
            //g2.drawImage(img.getImage(), 100 * x, 100 * y, 100, 100, null);
            g2.drawImage(gra.ballPlus, (gra.escale * x), (gra.escale * y), null);
        }

        //System.out.println(gra.escale);
        return g;
    }

    Graphics EspecialFrames(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        switch (rodeo) {
            case 1:
                //System.out.println(gra.escale);
                g2.drawImage(gra.rodeo1Plus, (gra.escale * (x - 3)) - (gra.escale * 2 / 98), (gra.escale * y) - (gra.escale * 1 / 98), null);
                break;
            case 2:
                g2.drawImage(gra.rodeo2Plus, (gra.escale * x) - (gra.escale * 3 / 98), (gra.escale * (y - 3)) - (gra.escale * 1 / 98), null);
                break;
            case 3:
                g2.drawImage(gra.rodeo3Plus, (gra.escale * (x - 3)) - (gra.escale * 2 / 98), (gra.escale * (y - 3)) - (gra.escale * 1 / 98), null);
                break;
            case 4:
                g2.drawImage(gra.rodeo4Plus, (gra.escale * (x - 3)) - (gra.escale * 1 / 98), (gra.escale * (y)) - (gra.escale * 1 / 98), null);
                break;
        }
        return g;
    }

}
