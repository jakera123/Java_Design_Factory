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
		
		System.out.println("����һ̨����"+engine.name+","+underpan.name+","+wheel.name);
	}

}
