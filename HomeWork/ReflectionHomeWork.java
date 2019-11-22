package com.mercury.HomeWork;

public class ReflectionHomeWork {

	public final class Immutable{
		
		private final int id;
		private final String name;
		
		public Immutable(int id, String name){
			this.name = name;
			this.id = id;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}
		
	}
}
