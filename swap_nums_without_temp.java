# Swap two elements without using temporary variables

# Method 1 (Math)
void Math(){
	int a = 10;
	int b = 15;
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println(a+"  "+b);
}

# Method 2 (XOR)
void XOR(){
	int a = 10;
	int b = 15;
	a = a^b;
	b = a^b;
	a = a^b;
	System.out.println(a+"  "+b);
}