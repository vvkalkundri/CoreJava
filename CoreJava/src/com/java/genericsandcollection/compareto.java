package com.java.genericsandcollection;

public class compareto {
	public static void main(String[] args) {
		DvdInfo d1 = new DvdInfo("Anitha", "Zumba");
		DvdInfo d2 = new DvdInfo("Anitha", "Zumba");
		
		System.out.println(d1);
		System.out.println(d2);
	}

}

class DvdInfo implements Comparable<DvdInfo>{
	String title ;
	String leadActor;
    
	DvdInfo(String t, String l){
		title = t;
		leadActor = l;
	}
	
	public String toString(){
		return title + " " + leadActor;
	}

	@Override
	public int compareTo(DvdInfo o) {
		return title.compareTo(o.title);
	}
	
	 
}