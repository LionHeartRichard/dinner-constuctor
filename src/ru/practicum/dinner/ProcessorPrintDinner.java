package ru.practicum.dinner;

import java.util.Scanner;

public class ProcessorPrintDinner implements Processor {

	@Override
	public String getKeyProcessor() {
		return "3";
	}

	@Override
	public void apply(SingletonDinnerDto dto, Scanner scanner) {
		dto.printDinners();
	}

}
