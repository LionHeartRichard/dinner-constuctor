package ru.practicum.dinner;

import java.util.Scanner;

public class Main {

	static DinnerConstructor dc;
	static Scanner scanner;

	public static void main(String[] args) {
		dc = new DinnerConstructor();
		scanner = new Scanner(System.in);
		SingletonDinnerDto dinner = SingletonDinnerDto.DINNER.getInstance();

		while (true) {
			printMenu();
			String command = scanner.next();

			if()
			
				addNewDish(dinner);
			
				generateDishCombo();
			
				scanner.close();
				return;
			
				dinner.printDinners();
			
		}

	}

	private static void printMenu() {
		System.out.println("Выберите команду:");
		System.out.println("1 - Добавить новое блюдо");
		System.out.println("2 - Сгенерировать комбинации блюд");
		System.out.println("3 - Выход");
	}

	private static void addNewDish(SingletonDinner dinner) {
		System.out.println("Введите тип блюда:");
		String dishType = scanner.next();
		System.out.println("Введите название блюда:");
		String dishName = scanner.next();
		dinner.addDinner(dishType, dishName);
	}

	private static void generateDishCombo() {
		System.out.println("Начинаем конструировать обед...");

		System.out.println("Введите количество наборов, которые нужно сгенерировать:");
		int numberOfCombos = scanner.nextInt();
		scanner.nextLine();

		System.out.println(
				"Вводите типы блюда, разделяя символом переноса строки (enter). Для завершения ввода введите пустую строку");
		String nextItem = scanner.nextLine();

		// реализуйте ввод типов блюд
		while (!nextItem.isEmpty()) {

		}

		// сгенерируйте комбинации блюд и выведите на экран

	}
}
