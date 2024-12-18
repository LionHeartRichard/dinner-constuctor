package ru.practicum.dinner.service.impl;

import java.util.Scanner;

import ru.practicum.dinner.service.Processor;
import ru.practicum.dinner.dto.SingletonDinnerDto;

public class ProcessorAddDinner implements Processor {

	@Override
	public String getKeyProcessor() {
		return "1";
	}

	@Override
	public void apply(SingletonDinnerDto dto, Scanner scanner) {
		System.out.println("Введите тип блюда:");
		scanner.nextLine();
		String dishType = scanner.nextLine();
		System.out.println("Введите название блюда:");
		String dishName = scanner.nextLine();
		dto.putDinner(dishType, dishName);
	}

}
