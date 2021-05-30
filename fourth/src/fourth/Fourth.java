package fourth;

public class Fourth {
	static int a =10;
	double b =0.01;
	void dumb()
	{
		System.out.println("you are dumb");
	}
	
    static void deaf()
    {
    	System.out.println("you are deaf");
    }
    
	public static void main(String[] args) {
	    System.out.println("we love software testing");
	    deaf();
	    Fourth m1 = new Fourth();
	    m1.dumb();
	    System.out.println(a);
	    System.out.println(m1.b);

	}

}

