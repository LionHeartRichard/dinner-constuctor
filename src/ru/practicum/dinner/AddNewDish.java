package ru.practicum.dinner;

import java.util.Scanner;

public class AddNewDish implements ManagerCommands {

	public AddNewDish() {
		registerMyself(HandlerCommands handler);//!!!!!!!!!!!!!!!!!!!!!!!!
	}

	@Override
	public String getIdx() {
		return "1";
	}

	@Override
	public void apply(SingletonDinnerDto dto, Scanner scanner) {
		System.out.println("Введите тип блюда:");
		String dishType = scanner.next();
		System.out.println("Введите название блюда:");
		String dishName = scanner.next();
		dto.putDinner(dishType, dishName);
	}

}
