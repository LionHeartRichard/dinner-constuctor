package ru.practicum.dinner;

public class AddDinnerImplCommands implements Commands {

	@Override
	public String action(String dishType, String dishName) {
		SingletonDinnerDto dinner = SingletonDinnerDto.DINNER.getInstance();
		if (dinner.DINNER.addDinner(dishType, dishName)) {
			System.out.println("Блюдо успешно добавлено");
			return null;
		}
		System.out.println("Блюдо с таким названием - " + dishName + " уже существует в " + dishType + " категории!!!");
		return null;
	}

	@Override
	public String getIdxCommand() {
		return "1";
	}

}
