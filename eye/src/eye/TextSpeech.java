/*
 * To change this license header, choose License Headers in Project Propertuies.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eye;
import java.util.Locale;
import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.Voice;
import static javax.speech.synthesis.Voice.AGE_DONT_CARE;

/**
 *
 * @author nikhil
 */
public class TextSpeech {
    private static int GENDER_FEMALE;
    public static void main(String[] args)
    {
    try
    {   
        System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
        Synthesizer syn=Central.createSynthesizer(null);
        SynthesizerModeDesc desc =new SynthesizerModeDesc();
        desc.setLocale(Locale.UK);
        desc.addVoice(new Voice(null,GENDER_FEMALE,AGE_DONT_CARE,null));
        Synthesizer synthesizer=Central.createSynthesizer(desc);
        Voice[] voice =desc.getVoices();
        synthesizer.getSynthesizerProperties().setVoice(voice);
        
       // Synthesizer synthesizer=Central.createSynthesizer(new SynthesizerModeDesc(Locale.ENGLISH));
        synthesizer.allocate();
        synthesizer.resume();
        
        synthesizer.speakPlainText("hello nikhil   can .you hear me now ", null);
        synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
        synthesizer.deallocate();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }}