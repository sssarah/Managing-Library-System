package Library_Management_System;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Book_Store implements Serializable  {
private List<Puplication> Catalogue; 

public Book_Store(){
	Catalogue= new ArrayList<Puplication>();	
}
public void Add_Publication(Puplication books){
	Catalogue.add(books);
	
}
@Override
public String toString(){
	String overall = "\n";
	for (int x=0; x<Catalogue.size(); x++){
	Puplication p=	Catalogue.get(x);
	overall = overall + p.toString();
}
return overall; 
}
}

