import javax.swing.*;

public class ProstyGUI {

    public static void main(String [] args)
    {
        JFrame ramka = new JFrame();
        JButton przycisk = new JButton("Kliknij mnie");

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.getContentPane().add(przycisk);
        ramka.setSize(300,300);
        ramka.setVisible(true);
        //Zmiany w pliku

        JButton przycisk1 = new JButton("zmiana");
        //Tetst
    }
}
