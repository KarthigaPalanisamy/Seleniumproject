package sampletry;

public class Ford extends CarClass{
	public  int speedLimit()
    {
	
		System.out.println(super.speedLimit());
		return 150;
		
    }
	public static void main(String args[])
    {
    	CarClass obj = new Ford();
    	//CarClass c=new CarClass();
    	//int num= c.speedLimit();
    	//Ford f=new Ford();
    	//f.speedLimit();
    	System.out.println(obj.speedLimit());
    	
    	
    }
   

}
