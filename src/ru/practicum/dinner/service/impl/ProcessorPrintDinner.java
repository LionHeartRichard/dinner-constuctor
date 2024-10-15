package ru.practicum.dinner.service.impl;

import java.util.Scanner;

import ru.practicum.dinner.service.Processor;
import ru.practicum.dinner.dto.SingletonDinnerDto;

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
