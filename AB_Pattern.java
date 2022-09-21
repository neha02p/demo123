package Day4;
/*
 *  A  B  C  D D C B A
 *  A  B  C      C B A
 *  A  B           B A
 *  A                A
 */
public class AB_Pattern 
{
	public static void main(String[] args) {
		{   int i,j;
			char r='A';
			int space=0;
			for(   i=1;i<=4;i++)//row      i 1    A
			{
				r='E';
			
				for(  j=4;j>=i;j--)
				{   r--;
					System.out.print(r);
					
				}
				space=space+2;
				
			
				System.out.println();
			}
		}
		


	}

}
