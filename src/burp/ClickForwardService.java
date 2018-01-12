package burp;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ClickForwardService {

	static void click() {
		Screen s = new Screen();
		Pattern forward = new Pattern("images/forward.PNG");
		for (int i = 0; i<10; i++) {
			try {
				s.wait(forward);
				s.click(forward);
			} catch (FindFailed e) {
			} 
		}
	}
}
