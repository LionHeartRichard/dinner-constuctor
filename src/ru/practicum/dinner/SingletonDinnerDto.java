package ru.practicum.dinner;

import java.util.*;

public enum SingletonDinnerDto {

	DINNER;

	private Map<String, Set<String>> mapDinners = new HashMap<>();

	private SingletonDinnerDto() {
	}

	public SingletonDinnerDto getInstance() {
		return DINNER;
	}

	public boolean containsDishType(String dishType) {
		if (mapDinners.containsKey(dishType)) {
			return true;
		}
		return false;
	}

	public boolean putDinner(String dishType, String dishName) {
		if (!isValid(dishType)) {
			mapDinners.put(dishType, new HashSet<String>());
		}
		Set<String> namesDishes = mapDinners.get(dishType);
		if (namesDishes.add(dishName)) {
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

	public Set<String> getDishes(String dishType) {
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

	public boolean remove(String dishType) {
		if (mapDinners.containsKey(dishType)) {
			mapDinners.remove(dishType);
			return true;
		}
		return false;
	}

	public boolean removeDishName(String dishType, String dishName) {
		if (mapDinners.containsKey(dishType)) {
			Set<String> tmp = mapDinners.get(dishType);
			if (tmp.contains(dishName)) {
				tmp.remove(dishName);
				return true;
			}
		}
		return false;
	}
}
