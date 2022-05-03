import java.util.ArrayList;
import java.util.List;

public class LogMessage {

	private String machineID;
	private String description;
	
	// a

	public LogMessage(String message) {
		String[] v = message.split(":");
		machineID = v[0];
		description = v[1];
	}

	// b

	public boolean containsWord(String keyword) {
		return (description.indexOf(keyword) != -1);
	}


	
}

class SystemLog {
	private List<LogMessage> messageList;
	
	public List<LogMessage> removeMessages(String keyword) {
		List<LogMessage> life = new ArrayList<LogMessage>;
		for(LogMessage v : messageList) {
			if(v.containsWord(keyword)) {
				life.add(v);
				messageList.remove(v);
			}
		}
		return life;
	}
}
