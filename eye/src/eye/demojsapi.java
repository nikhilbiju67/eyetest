//lcome to EditPad.org - your online plain text editor. Enter or paste your text here. To download and save it, click on the button below.import javax.speech.*;
package eye;
import java.util.*;
import javax.speech.Central;
import javax.speech.synthesis.*;

public class demojsapi
{
String speaktext;
public void dospeak(String speak,String 
voicename)
{
speaktext=speak;
String voiceName =voicename;
try
{ System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
SynthesizerModeDesc desc = new
SynthesizerModeDesc(null,"general", 
Locale.US,null,null);
Synthesizer synthesizer = 
Central.createSynthesizer(desc);
synthesizer.allocate();
synthesizer.resume();

desc = (SynthesizerModeDesc) 
synthesizer.getEngineModeDesc();
Voice[] voices = desc.getVoices();
Voice voice = null;
for (int i = 0; i < voices.length; i++)
{
if (voices[i].getName().equals(voiceName))
{
voice = voices[i];
break;
}
} synthesizer.getSynthesizerProperties().setVoice(voice);

synthesizer.speakPlainText(speaktext, null); synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
synthesizer.deallocate();
}catch (Exception e)
{ String message = " missing speech.properties in " + System.getProperty("user.home") + "\n"; 
System.out.println(""+e);
System.out.println(message);}
}
public static void main(String[] args)
{
demojsapi obj=new demojsapi();
obj.dospeak("one","kevin");
}

}