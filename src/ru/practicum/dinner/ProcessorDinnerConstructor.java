package ru.practicum.dinner;

import java.util.Scanner;

public class ProcessorDinnerConstructor implements Processor {

	@Override
	public String getKeyProcessor() {
		return "2";
	}

	@Override
	public void apply(SingletonDinnerDto dto, Scanner scanner) {
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
