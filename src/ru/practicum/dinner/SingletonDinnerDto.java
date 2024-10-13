package ru.practicum.dinner;

//DTO
// SingletonDinnerDto

import java.util.*;

public enum SingletonDinnerDto {

	DINNER;

	private SingletonDinnerDto() {
	}

	public SingletonDinnerDto getInstance() {
		return DINNER;
	}

	private Map<String, List<String>> mapDinners = new HashMap<>();

	public boolean addDinner(String dishType, String dishName) {
		if (!isValid(dishType)) {
			mapDinners.put(dishType, new ArrayList<String>());
		}
		List<String> namesDishes = mapDinners.get(dishType);
		if (!namesDishes.contains(dishName)) {
			namesDishes.add(dishName);
			mapDinners.put(dishType, namesDishes);
			return true;
		}
		return false;
	}

	public boolean isValid(String dishType) {
		if (mapDinners == null || mapDinners.isEmpty() || !mapDinners.containsKey(dishType)) {
			return false;
		}
		return true;
	}

	public boolean isValid() {
		if (mapDinners != null && !mapDinners.isEmpty()) {
			return true;
		}
		return false;
	}

	public List<String> getDishes(String dishType) {
		if (isValid(dishType)) {
			return mapDinners.get(dishType);
		}
		return null;
	}

	public void printDinners() {
		if (mapDinners != null && !mapDinners.isEmpty()) {
			mapDinners.forEach((k, v) -> System.out.println(k + " " + v));
		}
	}

	public boolean clear() {
		if (mapDinners == null || mapDinners.isEmpty()) {
			return false;
		}
		mapDinners.clear();
		return true;
	}

	public boolean deleteDishType(String dishType) {
		if (mapDinners.containsKey(dishType)) {
			mapDinners.remove(dishType);
			return true;
		}
		return false;
	}

	public boolean deleteDishName(String dishType, String dishName) {
		if (mapDinners.containsKey(dishType)) {
			List<String> tmp = mapDinners.get(dishType);
			if (tmp.contains(dishName)) {
				tmp.remove(dishName);
				return true;
			}
		}
		return false;
	}
}
