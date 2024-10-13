package ru.practicum.dinner;

import java.util.HashMap;
import java.util.Map;

public class HandlerCommands {

	private Map<String, ManagerCommands> mapCommands = new HashMap<>();

	public void register(String command, ManagerCommands manager) {
		mapCommands.put(command, manager);
	}

	public boolean containsCommands(String command) {
		if (mapCommands.containsKey(command)) {
			return true;
		}
		return false;
	}

	public ManagerCommands get(String command) {
		return mapCommands.get(command);
	}

}
