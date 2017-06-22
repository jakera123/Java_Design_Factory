package com.zxp.design;

public class Factory  implements IFactory{

	public Icar createCar() {
		Engine engine=new Engine();
		underpan underpan=new underpan();
		wheel wheel=new wheel();
		//这里其实是得以Icar作为接口，然后用Car去实现接口的！
		Icar car=new Icar(underpan, wheel, engine);
		
		return car;
	}
}
