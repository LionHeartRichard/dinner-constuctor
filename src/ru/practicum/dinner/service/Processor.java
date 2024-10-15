package ru.practicum.dinner.service;

import java.util.Scanner;
import ru.practicum.dinner.dto.SingletonDinnerDto;

public interface Processor {

	String getKeyProcessor();

	void apply(SingletonDinnerDto dto, Scanner scanner);

	default void registerMyself(ProcessorsFactory factory) {
		factory.register(getKeyProcessor(), this);
	}

}
