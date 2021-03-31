
public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary; 
	 
	      
	       public BasePlusCommissionEmployee( String firstName, String lastName,
	         String socialSecurityNumber, double grossSales, double commisionRate, double baseSalary ) {
	    	   
	         super( firstName, lastName, socialSecurityNumber, grossSales, commisionRate );
	         setBaseSalary( baseSalary ); 
	      } 
	
	      
	      public BasePlusCommissionEmployee() {
			
		}
	     
	      public double getBaseSalary() {
	    	  return baseSalary;
	      }
	      
		public void setBaseSalary( double baseSalary ) {
	         if ( baseSalary >= 0.0 )
	            this.baseSalary = baseSalary;
	         else
	            System.out.println("Base salary must be >= 0.0");
	      } 
	
	                                                                 
	      public double earnings() {                                                                    
	      return getBaseSalary() + super.earnings();                        
	      }                                              
	
	     
	                                                                 
	  /*   public String toString1() {                                                                   
	      return String.format( " %s %.2f",
	             super.toString(),                            
	             getBaseSalary() );                             
	      }   */ 
	      
	      public String toString1() {
	    	  return super.toString() + "\nBase Salary: " + baseSalary + "\nEarnings: " +  earnings();
	      }
	   } 


