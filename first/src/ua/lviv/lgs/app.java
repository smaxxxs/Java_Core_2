package ua.lviv.lgs;

public class app {

	public static void main(String[] args) {
//1 task.
	byte a;
	short b=3;
	int c=1000000;
	long d;
	char e='e';
	float f=(float)-5.1;
	double g=9.8;
	boolean bool;
// 2 task.
	System.out.println("                       "+"Min"+"     "+"Max");
	System.out.println("Byte                  "+Byte.MIN_VALUE+"     "+Byte.MAX_VALUE);
	System.out.println("Short               "+Short.MIN_VALUE+"     "+Short.MAX_VALUE);
	System.out.println("Integer        "+Integer.MIN_VALUE+"     "+Integer.MAX_VALUE);
	System.out.println("Long  "+Long.MIN_VALUE+"     "+Long.MAX_VALUE);
	System.out.println("Char                     "+(int)Character.MIN_VALUE+"     "+(int)Character.MAX_VALUE);
	System.out.println("Float              "+Float.MIN_VALUE+"     "+Float.MAX_VALUE);
	System.out.println("Double            "+Double.MIN_VALUE+"     "+Double.MAX_VALUE);
	System.out.println("Boolean                  "+"0"+"     "+"1");
	
//3 task
int [] array1= {1,51,3,20,5,64,87,11,32,32};
int min=array1[0], max=array1[0];
for (int i=1;i<10;i++) {
	if (min>array1[i]) min= array1[i];
	if (max<array1[i])  max= array1[i];}
System.out.println("            3 TASK");
System.out.println("       min = "+min+"   max = "+max);


}
}