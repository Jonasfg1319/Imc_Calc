package system;

public class Calculation {
	
	private Double weight;
	private Double height;
	
	
	public Calculation(){
		
	}
	
	public Calculation(Double weight, Double height){
		
		this.weight = weight;
		this.height = height;
	}
	
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	public Double getWeight(){
		
		return weight;
		
	}
	
	public void setHeight(Double height) {
		
		this.height = height;
	}
	
	public Double getHeight() {
		
		return height;
	}
	
	public Double calc() {
		
		return weight / (Math.pow(height,2)); 
		
	}
	@Override
	public String toString() {
		  if(calc() < 18.5) {
			System.out.printf("Your imc is: %.2f %n", (calc()));
		    System.out.println("You're underweight, see a doctor");
		  }
		  else if(calc() > 18.5 && calc() < 24.99) {
		      System.out.printf("Your imc is: %.2f ",(calc()));
		      System.out.println("Your weight is normal, keep it up!!!");
		    
		  }
		  else if(calc() > 25 && calc() < 29.99) {
			  System.out.printf("Your imc is: %.2f %n",(calc()));
			  System.out.println("You are overweight, beware!!");
		  }
		  else if(calc() > 30 && calc() < 34.99) {
			  System.out.printf("Your imc is: %.2f %n",(calc()));
		      System.out.println("Are you with grade I obesity, need a diet");
		  }
		  else if(calc() > 35 && calc() < 39.99) {
			  System.out.printf("Your imc is: %.2f %n", (calc()));
			  System.out.println("Are you with grade II obesity, need a diet");
		  }
		  else if(calc() > 40) {
			  System.out.printf("Your imc is: %.2f %n",(calc()));
			  System.out.println("You are morbidly obese, See a doctor");
		  }
			  return "";
	}
	

}
