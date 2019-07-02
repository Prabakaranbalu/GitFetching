package org.sample;

public class GitFetch {
	public void greensOmr(String Order) {
		System.out.println("Place the order"+ Order);		
	}
public void greensOmr(char type) {
	System.out.println("confirm the type"+type);
}
public void greensOmr(long number) {
	System.out.println("Course we study"+number);
}
public static void main(String[] args) {
	GitFetch m=new GitFetch();
	m.greensOmr("Courses offered");
	m.greensOmr(45456l);
	m.greensOmr('A');
	System.out.println("fetch");
}


}
