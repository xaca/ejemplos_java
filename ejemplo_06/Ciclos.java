public class Ciclos{
	public static void main(String[] args) {
		int i, delta = 1, j=100;

		for(i=0;i<=10;i+=delta)//i++, equivale a i=i+1
		{
			System.out.println(i+" "+j);
			j = j - 1; 
		}
		do
		{
			System.out.println(i+" "+j);
			j = j - 1; 
			i = i + delta;
		}while(i<=20);

		while(i<=100)
		{
			System.out.print(i);
			if(j>=70)
			{
				System.out.println(" "+j);
				j = j - 1; 
			}
			else{
				System.out.println();
			}
			i = i + delta;
		}
	}
}