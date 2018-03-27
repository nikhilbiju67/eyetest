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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BrightnessManager {
    public static void setBrightness(int brightness)
            throws IOException {
        //Creates a powerShell command that will set the brightness to the requested value (0-100), after the requested delay (in milliseconds) has passed. 
        String s = String.format("$brightness = %d;", brightness)
                + "$delay = 0;"
                + "$myMonitor = Get-WmiObject -Namespace root\\wmi -Class WmiMonitorBrightnessMethods;"
                + "$myMonitor.wmisetbrightness($delay, $brightness)";
        String command = "powershell.exe  " + s;
        // Executing the command
        Process powerShellProcess = Runtime.getRuntime().exec(command);

        powerShellProcess.getOutputStream().close();

        //Report any error messages
        String line;

        BufferedReader stderr = new BufferedReader(new InputStreamReader(
                powerShellProcess.getErrorStream()));
        line = stderr.readLine();
        if (line != null)
        {
            System.err.println("Standard Error:");
            do
            {
                System.err.println(line);
            } while ((line = stderr.readLine()) != null);

        }
        stderr.close();

    }
  /*  public static void main(String[] args)
    {
        try {
            BrightnessManager.setBrightness(0);
        } catch (IOException ex) {
            Logger.getLogger(BrightnessManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
}