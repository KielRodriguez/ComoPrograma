
import javax.swing.JFrame;
public class PruebaDibujarCaraSonriente{
  public static void main(String args[]){
    DibujarCaraSonriente panel = new DibujarCaraSonriente();
    JFrame application = new JFrame();

    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.add(panel);
    application.setSize(230, 250);
    application.setVisible( true );
  }
}
