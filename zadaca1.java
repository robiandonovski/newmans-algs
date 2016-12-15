package codefu;

public class zadaca1 {
	public static String primefactors(int n)
	{
		String s="";
		int k=n;
		int[] a = new int[k];
		for(int i=0;i<=k;i++)
		{
			for(int j=2;j<=n;j++)
			{
				if(n%j==0)
				{
					a[i]=j;
					n/=j;
					break;
				}
			}
		}
		s+=a[0];
		int l =1;
		while(a[l]!=0)
		{
			s+=", "+a[l];
			l++;
		}
		return s;
	}

	public static void main(String[] args) 
	{
		System.out.println(primefactors(1000));
		System.out.println(primefactors(10000));
		System.out.println(primefactors(500));
		System.out.println(primefactors(888));
		System.out.println(primefactors(1234));
		System.out.println(primefactors(1010));
		System.out.println(primefactors(101));
	}

}
