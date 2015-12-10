package Library_Management_System1;

import Library_Management_System.Puplication;

public class AdminReturn {

	public AdminReturn() {
		// TODO Auto-generated constructor stub
			 int Max = 765;
		     Puplication[]publicationList=new Puplication[Max];
			 int NumPublications=0;
		// return a book
	
		    public void returnPublications(Puplication p) {
		        for(int i = 0; i < NumPublications; i++) {
		            if(publicationList[i] == p)
		            {
		                publicationList[i].setBorrowed(false);
		                break;
		            }
		        }
		    }
		     

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
