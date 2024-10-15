package ru.practicum.dinner.service.impl;

import java.util.Scanner;

import ru.practicum.dinner.service.Processor;
import ru.practicum.dinner.dto.SingletonDinnerDto;

public class ProcessorClearListDinners implements Processor {

	@Override
	public String getKeyProcessor() {
		return "4";
	}

	@Override
	public void apply(SingletonDinnerDto dto, Scanner scanner) {
		System.out.println("Вы уверенны что хотите очистить список блюд? да/нет");
		String respon = scanner.next();
		if (respon.equals("да") || respon.equals("y")) {
			dto.clear();
			System.out.println("Список блюд очищен!!!");
		} else {
			System.out.println("Команда отменена");
		}
	}

}
