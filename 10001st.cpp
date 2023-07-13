#include<iostream>
#include<vector>
#define N 10001

using namespace std;

int main()
{
	vector <int> it;

	it.push_back(3);
	it.push_back(5);
	int n = 7;

        while(it.size()!= (N-1))
	{   int flag = 0;
		
		for(auto i = it.begin();i != it.end();i++)
			if(n % *i == 0)
			{     flag = 1;
			 	break;
                           }
		if(flag == 0)
			it.push_back(n);
		  
		n += 2;
		
	}	

// for(auto i = it.begin();i != it.end();i++)
//	 cout<<endl<<*i<<" ";
int j = N-2;
cout<<endl<<it[j];
 cout<<endl;
 return 0;
}



