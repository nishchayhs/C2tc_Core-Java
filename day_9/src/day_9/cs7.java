package day_9;

public class cs7 {

	public static void main(String[] args) {
		// breaknested for loop
		for(int i=1;i<=3;i++)//1 2 3
		{
			for(int j=1;j<=3;j++) //1 2
			{
				if(i==2&&j==2)
				{
					break;//force full termination of inner for loop
				}
				System.out.println(i+""+j);//11 12 13
				//21
				//31 32 33
			}
		}

	}

}
