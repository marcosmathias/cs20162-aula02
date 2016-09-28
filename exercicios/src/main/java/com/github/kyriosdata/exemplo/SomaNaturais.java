package com.github.kyriosdata.exemplo;

public class SomaNaturais {
	
	public static int soma(int n){
		
		if(1>=n)
		throw new IllegalArgumentException("O número deve ser natural");
		
		int i=2;
		int s=1;
		
		while (i<=n){
			s=s+i;
			i++;
		}
		
		return s;
	}
}

