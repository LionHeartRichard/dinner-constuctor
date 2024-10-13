package ru.practicum.dinner;

import java.util.Scanner;

public interface Processor {

	String getKeyProcessor();

	void apply(SingletonDinnerDto dto, Scanner scanner);

	default void registerMyself(ProcessorsFactory factory) {
		factory.register(getKeyProcessor(), this);
	}

}
