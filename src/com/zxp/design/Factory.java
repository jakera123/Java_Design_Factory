package com.zxp.design;

public class Factory  implements IFactory{

	public Icar createCar() {
		Engine engine=new Engine();
		underpan underpan=new underpan();
		wheel wheel=new wheel();
		//������ʵ�ǵ���Icar��Ϊ�ӿڣ�Ȼ����Carȥʵ�ֽӿڵģ�
		Icar car=new Icar(underpan, wheel, engine);
		
		return car;
	}
}
