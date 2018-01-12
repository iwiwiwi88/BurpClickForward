package burp;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ClickForward {

	public static void main(String[] args) throws FindFailed {
		//App a = new App("DMS72CON3| Console3");
		Screen s = new Screen();
		Pattern forward = new Pattern("images/forward.PNG");
		//a.focus();
		for (int i = 0; i<10; i++) {
			try {
				s.wait(forward);
				s.click(forward);
			} catch (FindFailed e) {
			} 
		}
	}

}
