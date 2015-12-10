
package Library_Management_System1;
import Library_Management_System.Puplication;

public class Admin {

		public class Journal_Admin {
		private static final int Max = 765;
		private Puplication[]publicationList=new Puplication[Max];
		public int NumPublications=0;

		//borrow a publication 
		public Puplication borrowPublication(int isbn){
			for(int i = 0; i < NumPublications; i++){
								
					if(publicationList[i].isBorrowed()== false) {
						publicationList[i].setBorrowed(true);
						return publicationList[i];
					
					// Publication not found or all borrowed
				}
					
			}
				return null;
		}	
		
		}

		public Puplication borrowPublication() {
			// TODO Auto-generated method stub
			return null;
		}
}
			
			 
		
