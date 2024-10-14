package ru.practicum.dinner;

import java.util.Scanner;

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
