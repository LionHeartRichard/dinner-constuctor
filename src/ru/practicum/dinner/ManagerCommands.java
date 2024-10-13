package ru.practicum.dinner;

import java.util.Scanner;

public interface ManagerCommands {

	String getIdx();

	void apply(SingletonDinnerDto dto, Scanner scanner);

	default void registerMyself(HandlerCommands handler) {
		handler.register(getIdx(), this);
	}
}
