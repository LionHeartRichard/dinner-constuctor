package ru.practicum.dinner;

import java.util.*;

public class ProcessorDinnerConstructor implements Processor {

	private Map<Integer, Set<Integer>> mapStorageGenDishes = new HashMap<>();

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

		Set<String> typeDishes = new HashSet<>();
		while (!nextItem.isEmpty()) {
			nextItem = scanner.next();
			typeDishes.add(nextItem);
		}

		typeDishes.forEach(v -> System.out.println(v));
	}

}
