import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ActionEventDemo implements ActionListener {
    JFrame frame=new JFrame();
    JButton button1 =new JButton("Point team1");
    JButton button2 =new JButton("Point team2");
    Game game = new Game();
    byte tie = 0;

    ActionEventDemo(){
        prepareGUI();
        button1Properties();
        button2Properties();
    }

    public void prepareGUI(){
        frame.setTitle("My Window");
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setBounds(400,400,800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void button1Properties(){
        button1.setBounds(100,200,200,80);
        frame.add(button1);
        button1.addActionListener(this);
        button1.setMnemonic(KeyEvent.VK_D);
        button1.setActionCommand("point1");
    }

    public void button2Properties(){
        button2.setBounds(400,200,200,80);
        frame.add(button2);
        button2.addActionListener(this);
        button2.setMnemonic(KeyEvent.VK_D);
        button2.setActionCommand("point2");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if ("point1".equals(e.getActionCommand())) {
            System.out.println(game.Scored1());
            // System.out.println(game.Scored1()+game.Scored2());
        } else if ("point2".equals(e.getActionCommand())){
            System.out.println(game.Scored2());
        }

        if (((game.score1) + 5) == game.score2){
            System.out.println("player 2 is running away with it");
        }
        else if (((game.score2) + 5) == game.score1){
            System.out.println("player 1 is running away with it");
        }

        if (game.score1 == game.score2){
            System.out.println("It's anyones game");
            tie = 1;
        }
        else if (game.score1 > game.score2 && tie == 1) {
            System.out.println("player 1 tacks the lead");
            tie = 2;
        }
        else if (game.score1 < game.score2 && tie == 1) {
            System.out.println("player 2 tacks the lead");
            tie = 2;
        }

        if (game.score1 == 1 && game.score2 == 0)
            System.out.println("player 1 takes the frist point hopefully he can keep the lead");
        else if (game.score1 == 2 && game.score1 == 0)
            System.out.println("player 2 takes the frist point hopefully he can keep the lead");

        if (game.score1 == 11 && game.score2 < 10){
            System.out.println("Player 1 wins :)");
            game.newGame();
            game.Game1();
            game.Round();
        }
        else if (game.score2 == 11 && game.score1 < 10){
            System.out.println("Player2 wins :)");
            game.newGame();
            game.Game2();
            game.Round();
        }
        else if (game.score1+2 ==game.score1 && game.score2 > 9 && game.score1 > 9){
            System.out.println("Player 1 wins :)");
            game.newGame();
            game.Game1();
            game.Round();

        }
        else if (game.score2+2 ==game.score1 && game.score2 > 9 && game.score1 > 9){
            System.out.println("Player 2 wins :)");
            game.newGame();
            game.Game2();
            game.Round();

        }

    } 

    //game.setScore1();
}

public class Gui {
    public static void main(String[] args)
    {
        new ActionEventDemo();

    }
}