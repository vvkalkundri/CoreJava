package com.pranav.overloadAndOverride;

import java.io.IOException;

public class TestOverloadAndOverride {

	
	/****OVERLOAD****/
	public int myOverload(){
		return 0;
	}
	
	public int myOverload(int type) throws IOException{
		System.out.println("Class - " + this.getClass().getName());
		return type;
	}
	
	// UNCOMMENT THIS METHOD AND YOU WILL GET Duplicate method error.
	/*public long myOverload(int type){
		return 10;
	}*/
	
}

/****OVERRIDE****/
class OverrideTest extends TestOverloadAndOverride{
	
	@Override
	public int myOverload(int type) throws IOException{
		System.out.println("Class - " + this.getClass().getName());
		return super.myOverload(type);
	}
	
}
