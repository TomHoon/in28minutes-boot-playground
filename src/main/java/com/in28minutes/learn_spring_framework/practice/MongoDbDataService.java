package com.in28minutes.learn_spring_framework.practice;

import org.springframework.stereotype.Component;

@Component
public class MongoDbDataService implements DataService{

	@Override
	public int[] retrieveData() {
		return new int[] {1,2,3,4,5,6};
	}
	
}
