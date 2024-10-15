package ru.practicum.test;

import ru.practicum.dinner.service.impl.*;
import ru.practicum.dinner.dto.SingletonDinnerDto;
import java.util.*;

public class TestConstructorDishes {

	public static void main(String[] args) {
		SingletonDinnerDto dto = SingletonDinnerDto.DINNER.getInstance();
		dto.putDinner("Первое", "Борщ");
		dto.putDinner("Первое", "Окрошка");
		dto.putDinner("Первое", "Харчё");
		dto.putDinner("Первое", "Шурпа");
		dto.putDinner("Первое", "Фо-бо");
		dto.putDinner("Первое", "Фо-га");
		dto.putDinner("Первое", "Фо-тай");
		dto.putDinner("Второе", "Шашлык");
		dto.putDinner("Второе", "Нан-Га-Мэй");
		dto.putDinner("Второе", "Плов");
		dto.putDinner("Второе", "Плов с изюмом");
		dto.putDinner("Второе", "Стейк");
		dto.putDinner("Второе", "Стейк Ри-Бай");
		dto.putDinner("Второе", "Омлет с беконом");
		dto.putDinner("Второе", "Омлет");
		dto.putDinner("Второе", "Осетинский пирог");
		dto.putDinner("Второе", "Рис - отворной");
		dto.putDinner("Второе", "Рис - жаренный");
		dto.putDinner("Салат", "Цезарь");
		dto.putDinner("Салат", "С креветками");
		dto.putDinner("Салат", "Зимний");
		dto.putDinner("Салат", "Селедка под шубой");

		Set<String> typeDishes = new HashSet<>();
		typeDishes.add("Первое");
		typeDishes.add("Второе");
		typeDishes.add("Салат");

		ProcessorDinnerConstructor processor = new ProcessorDinnerConstructor();
		List<String> combos = processor.getCombos(30, dto, typeDishes);

		combos.forEach(v -> System.out.println(v));
	}
}
