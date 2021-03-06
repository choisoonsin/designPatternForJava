package com.example.template;

public abstract class CaffeineBeverage {

	public final void prepareRecipe() {
		boilWater();	// 카페인음료 공통 사항
		brew();			// 끓이는 부분은 서브클래스에서 확장
		pourInCup();

		if(customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	
	abstract void brew();
	
	abstract void addCondiments();

	private void pourInCup() {
		System.out.println("차를 붇는 중..");
	}
	
	void boilWater() {
		System.out.println("물 끓이는 중..");
	}

	// Hooking
	public boolean customerWantsCondiments() {
		return true;
	}
	
}
