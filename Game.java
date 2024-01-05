import java.util.*;
/**
 * Write a description of class PingPongScoreBoard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    public Scanner in = new Scanner(System.in);
    public byte score1;
    public byte score2;
    public byte game1;
    public byte game2;

    public Game(){
        this.score1 = 0;
        this.score2 = 0;
    }
    
    public int Scored1(){
        this.score1 += 1;
        return this.score1;
    }
    
    public int Scored2(){
        this.score2 += 1;
        return this.score2;
    }
    
    public void newGame(){
        this.score1 = 0;
        this.score2 = 0;
    }
    
    public int Game1(){
        this.game1 += 1;
        return this.game1;
    }
    
    public int Game2(){
        this.game1 += 2;
        return this.game2;
    }
    
    public void Round(){
        if (this.game1 > this.game2){
            System.out.println("\n\n\n New game starts\n player 1 his up "+
            this.game1+" to player's 2 "+ this.game2);
        }
        else if (this.game1 > this.game2){
            System.out.println("\n\n\n New game starts\n player 2 his up "+
            this.game1+" to player's 1 "+ this.game2);
        }
        else{
            System.out.println("\n\n\n New game starts\n it is a tie game"+
            this.game1+" too "+ this.game2);
        }
    }
}
