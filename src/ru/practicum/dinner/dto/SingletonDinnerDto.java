package ru.practicum.dinner.dto;

import java.util.*;

public enum SingletonDinnerDto {

	DINNER;

	private Map<String, Set<String>> map = new HashMap<>();

	private SingletonDinnerDto() {
	}

	public SingletonDinnerDto getInstance() {
		return DINNER;
	}

	public boolean containsDishType(String dishType) {
		if (map.containsKey(dishType)) {
			return true;
		}
		return false;
	}

	public boolean putDinner(String dishType, String dishName) {
		if (!isValid(dishType)) {
			map.put(dishType, new HashSet<String>());
		}
		Set<String> namesDishes = map.get(dishType);
		if (namesDishes.add(dishName)) {
			map.put(dishType, namesDishes);
			return true;
		}
		return false;
	}

	public boolean isValid(String dishType) {
		if (map == null || map.isEmpty() || !map.containsKey(dishType)) {
			return false;
		}
		return true;
	}

	public boolean isValid() {
		if (map != null && !map.isEmpty()) {
			return true;
		}
		return false;
	}

	public Set<String> getDishes(String dishType) {
		if (isValid(dishType)) {
			return map.get(dishType);
		}
		return null;
	}

	public void printDinners() {
		if (map != null && !map.isEmpty()) {
			map.forEach((k, v) -> System.out.println(k + " " + v));
		}
	}

	public boolean clear() {
		if (map == null || map.isEmpty()) {
			return false;
		}
		map.clear();
		return true;
	}

	public boolean remove(String dishType) {
		if (map.containsKey(dishType)) {
			map.remove(dishType);
			return true;
		}
		return false;
	}

	public boolean removeDishName(String dishType, String dishName) {
		if (map.containsKey(dishType)) {
			Set<String> tmp = map.get(dishType);
			if (tmp.contains(dishName)) {
				tmp.remove(dishName);
				return true;
			}
		}
		return false;
	}

	public int size() {
		return map.size();
	}

	public int insideSize(String dishType) {
		if (isValid(dishType)) {
			Set<String> tmp = map.get(dishType);
			return tmp.size();
		}
		return 0;
	}

}
