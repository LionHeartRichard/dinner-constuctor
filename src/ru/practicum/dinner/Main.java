package ru.practicum.dinner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SingletonDinnerDto dinner = SingletonDinnerDto.DINNER.getInstance();

		while (true) {
			printMenu();
			String command = scanner.next();

			HandlerCommands handler = new HandlerCommands();

			if (command.equals("0")) {
				break;
			} else if (handler.containsCommands(command)) {
				ManagerCommands action = handler.get(command);
				action.apply(dinner, scanner);
			} else {
				System.out.println("Извените но такой команды нет");
			}
		}
		scanner.close();
		System.out.println("Работа программы завершена! Отличного настроения!!!");

	}

	private static void printMenu() {
		System.out.println("Выберите команду:");
		System.out.println("0 - Выход");
		System.out.println("1 - Добавить новое блюдо");
		System.out.println("2 - Сгенерировать комбинации блюд");
		System.out.println("3 - Вывести на экран классификацию блюд");
	}

	private static void addNewDish(SingletonDinnerDto dinner) {

	}
}
