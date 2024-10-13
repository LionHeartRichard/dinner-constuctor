package ru.practicum.dinner;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SingletonDinnerDto dto = SingletonDinnerDto.DINNER.getInstance();

		while (true) {
			printMenu();
			String command = scanner.next();

			// ------------Design--Patterns!!!!------------
			// FACTORY--------And------Registry-------------------------

			ProcessorsFactory factory = new ProcessorsFactory();

			List<Processor> processorsHandler = new ArrayList<>();
			ProcessorAddDinner dinnerAdd = new ProcessorAddDinner();
			processorsHandler.add(dinnerAdd);
			ProcessorDinnerConstructor dinnerConstructor = new ProcessorDinnerConstructor();
			processorsHandler.add(dinnerConstructor);
			ProcessorPrintDinner dinnerPrint = new ProcessorPrintDinner();
			processorsHandler.add(dinnerPrint);
			ProcessorClearListDinners dinnerClear = new ProcessorClearListDinners();
			processorsHandler.add(dinnerClear);

			for (Processor currentProcess : processorsHandler) {
				currentProcess.registerMyself(factory);
				factory.register(currentProcess.getKeyProcessor(), currentProcess);
			}

			if (command.equals("0")) {
				break;
			} else if (factory.containsProcessor(command)) {
				Processor processor = factory.getProcessorByType(command);
				processor.apply(dto, scanner);
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
		System.out.println("4 - Очистить список блюд");
	}
}
