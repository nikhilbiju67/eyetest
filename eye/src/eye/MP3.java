/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eye;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;
/**
 *
 * @author nikhil
 */
public class MP3 {
    private String filename;
    private Player player;
    public MP3(String filename){
        this.filename=filename;
        
    }
    
    public void play()
    {
        try{
            FileInputStream fis=new FileInputStream(filename);
            BufferedInputStream bis=new BufferedInputStream(fis);
            player =new Player(bis);
            player.play();
        }
        catch(Exception e)
        {
            System.out.println("probelm playing file"+filename);
            System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
        MP3 mp3=new MP3("C:\\aaa.mp3");
        mp3.play();
    }
}
