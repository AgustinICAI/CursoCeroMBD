class App1
{
	public static void main (String argv[])
	{
		int i = 0;	
		while (i < 10)
		{
			System.out.println(i);
			
			i = i + 1;
			if (i>5)
				i = i + 2;
		}
		
		for (i = 0; i < 10 ; i = i +1)
			System.out.println(i);

	}
}