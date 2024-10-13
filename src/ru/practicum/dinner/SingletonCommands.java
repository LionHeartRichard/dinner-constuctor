package ru.practicum.dinner;

import java.util.*;
import java.util.stream.Collectors;

public enum SingletonCommands {
	COMMANDS;

	private Map<String, String> constructorCommands;

	private SingletonCommands() {
	}

	public SingletonCommands getInstance(List<Commands> listCommands) {
		constructorCommands = listCommands.stream()
				.collect(Collectors.toMap(Commands::getIdxCommand, Commands::action));
		return COMMANDS;
	}

}
