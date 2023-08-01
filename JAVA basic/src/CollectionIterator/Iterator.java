package CollectionIterator;

import java.util.*;
import java.io.IOException;
import java.lang.*;
import java.util.List;

public class Iterator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
ArrayList al =new ArrayList();
	for (int i=1;i<=10;i++)
		
	{
		
		al.add(i);
		System.out.println("content of arraylist: ");
	java.util.Iterator itr= al.iterator();
		while((itr.hasNext()))
		{
			System.out.println(itr.next());
		}
	}
	
	
	}
	}


