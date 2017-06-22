package com.zxp.design;

public class Icar {
	private Engine engine=null;
	private underpan underpan=null;
	private wheel wheel=null;
	public Icar(underpan underpan,wheel wheel,Engine engine){
		this.engine=engine;
		this.underpan=underpan;
		this.wheel=wheel;
	}
	public void show(){
		
		System.out.println("我是一台汽车"+engine.name+","+underpan.name+","+wheel.name);
	}

}
