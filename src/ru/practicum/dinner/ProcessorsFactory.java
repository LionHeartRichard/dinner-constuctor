package ru.practicum.dinner;

import java.util.HashMap;
import java.util.Map;

public class ProcessorsFactory {

	private Map<String, Processor> map = new HashMap<>();

	public void register(String typeProcessor, Processor processor) {
		map.put(typeProcessor, processor);
	}

	public boolean containsProcessor(String typeProcessor) {
		if (map.containsKey(typeProcessor)) {
			return true;
		}
		return false;
	}

	public Processor getProcessorByType(String processorType) {
		return map.get(processorType);
	}

}
