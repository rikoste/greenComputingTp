package tp.greenComputing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.omg.CORBA.portable.InputStream;

public class Run {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Kernel32.SYSTEM_POWER_STATUS batteryStatus = new Kernel32.SYSTEM_POWER_STATUS();
		Kernel32.INSTANCE.GetSystemPowerStatus(batteryStatus);

		System.out.println(batteryStatus); // Shows result of toString() method.
		
		
		System.out.println("/n------------------\n");
		
		
		 Runtime runtime = Runtime.getRuntime();
         String cmds[] = {"cmd", "/c", "tasklist"};
         Process proc = runtime.exec(cmds);
         java.io.InputStream inputstream =  proc.getInputStream();
         InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
         BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
         String line;
         while ((line = bufferedreader.readLine()) != null) {
             System.out.println(line);
         }
	}

}
