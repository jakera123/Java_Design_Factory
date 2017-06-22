package com.zxp.design;

public class client {
	public static void main(String[] args){
		
		//这里的工厂方法体现在，客户端不负责零部件的实例化，体现出解耦
		IFactory factory=new Factory();
		Icar car=factory.createCar();
		car.show();
	}

}
