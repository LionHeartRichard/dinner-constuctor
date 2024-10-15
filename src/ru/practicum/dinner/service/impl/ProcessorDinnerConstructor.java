package ru.practicum.dinner.service.impl;

import java.util.*;

import ru.practicum.dinner.service.Processor;
import ru.practicum.dinner.dto.SingletonDinnerDto;

public class ProcessorDinnerConstructor implements Processor {

	@Override
	public String getKeyProcessor() {
		return "2";
	}

	@Override
	public void apply(SingletonDinnerDto dto, Scanner scanner) {
		if (!dto.isValid()) {
			System.out.println("Отсутствуют блюда для генерации!");
			return;
		}
		System.out.println("Начинаем конструировать обед...");

		System.out.println("Введите количество наборов, которые нужно сгенерировать:");
		int numberOfCombos = 0;
		if (!scanner.hasNextInt()) {
			System.out.println("Введено недопустимое значение!!!");
			scanner.next();
			return;
		}
		numberOfCombos = scanner.nextInt();
		scanner.nextLine();

		System.out.println(
				"Вводите типы блюда, разделяя символом переноса строки (enter). Для завершения ввода введите пустую строку");
		String nextItem = "";

		Set<String> typeDishes = new HashSet<>();
		while (true) {
			nextItem = scanner.nextLine();
			if (nextItem.isEmpty()) {
				break;
			}
			typeDishes.add(nextItem);
		}

		if (typeDishes == null || typeDishes.isEmpty()) {
			System.out.println("Список типов блюд пуст!!!");
			return;
		}

		List<String> combos = getCombos(numberOfCombos, dto, typeDishes);
		combos.forEach(v -> System.out.println(v));
		System.out.println();
	}

	public List<String> getCombos(int numberOfCombos, SingletonDinnerDto dto, Set<String> typeDishes) {
		List<String> combos = new ArrayList<>(numberOfCombos);
		for (int i = 0; i < numberOfCombos; ++i) {
			combos.add(getCombo(dto, typeDishes));
		}
		return combos;
	}

	public String getCombo(SingletonDinnerDto dto, Set<String> typeDishes) {
		List<String> dishes = new ArrayList<>();
		for (String type : typeDishes) {
			if (dto.containsDishType(type)) {
				List<String> tmp = new ArrayList<>(dto.getDishes(type));
				dishes.add(getRandomDish(tmp));
			}
		}
		return dishes.toString();
	}

	public String getRandomDish(List<String> tmp) {
		Random random = new Random();
		int idx = random.nextInt(tmp.size());
		return tmp.get(idx);
	}
}
