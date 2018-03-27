/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eye;

/**
 *
 * @author nikhil
 */
import com.sun.speech.freetts.*;
import java.util.*;

public class demofreetts
{
private String speaktext;
public void dospeak(String speak,String
voice)
{
speaktext = speak; 
try
{
    System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
VoiceManager voiceManager = 
VoiceManager.getInstance();
Voice voices = 
voiceManager.getVoice(voice);

Voice sp=null;
if(voices!=null)
{
sp=voices; 

}
else
{
System.out.println("No Voice Available");
}

//========================
sp.allocate();
sp.speak(speaktext);
sp.deallocate();
//=========================
}catch(Exception e){e.printStackTrace();}
} 
public static void main(String[] args)
{
demofreetts obj=new demofreetts();
obj.dospeak("hello i am nikhil i want to talk to you who are you i want to meet you nee entha paranje ","kevin16");
}

}