package com.zxp.design;

public class client {
	public static void main(String[] args){
		
		//����Ĺ������������ڣ��ͻ��˲������㲿����ʵ���������ֳ�����
		IFactory factory=new Factory();
		Icar car=factory.createCar();
		car.show();
	}

}
