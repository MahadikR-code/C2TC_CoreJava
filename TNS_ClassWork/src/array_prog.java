
public class array_prog 
{
	public static void main(String[] args) 
	{
		int[][][] x= {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		for(int i=0;i<x.length;++i) 
		{
			for(int j=0;j<x[i].length;++j) 
			{
				for(int k=0;k<x[j].length;++k) 
				{
					System.out.println(x[i][j][k]);
				}
			}
		}
	}
		
}
