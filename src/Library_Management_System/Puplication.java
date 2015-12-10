package Library_Management_System;

import java.io.Serializable;

public class Puplication implements Serializable {
private int isbn;
private String heading;
private String writer;
private Double fees;
private Boolean borrowed;
public Puplication (){
	isbn= 0;
	heading= null;
	writer= null;
	fees= (double) 0; 
	borrowed= false;
}
public Puplication(int isbn,String heading,String writer,Double fees){
	this.isbn=isbn;
	this.heading= heading;
	this.writer=writer;
	this.fees= fees;
}

@Override
 
public String toString(){
	return "\n Isbn;"+ isbn + "\n Heading;"+ heading + "\n Writer"+ writer + "\n Fees"+fees+ "\n"; 
}
public int GetIsbn() {
	// TODO Auto-generated method stub
		return isbn;
	
}
public boolean isBorrowed() {
	// TODO Auto-generated method stub
	return borrowed;
}



public void setBorrowed(boolean status) {
	// TODO Auto-generated method stub
	borrowed=status;
}

}
