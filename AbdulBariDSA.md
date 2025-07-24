

Structure :  In C++, a struct (short for structure) is a user-defined data type that groups together variables of different data types under a single name. These variables are known as "members" or "fields" of the structure. Structures provide a way to create complex data types that represent real-world entities.  

```c++
struct Rectangle
{
int length;
int breadth;
}

int main() 
{
declaration --> struct Rectangle r;
dec and initialization --> struct Rectangle r={10,5}
//read and write the member data
r.length=15;
r.bredth=10;
printf("area of rectangle is %d", r.length * r.bredth)

2:  we can define complex numbers:  
struct complex  
{   
int real;  
int img;  
};  

3: struct Student  
{  
int roll;  
char name[25];  
chaer dept[10];  
char address[50];  
};  
struct student s;  
s.roll = 10;  

4: Cards:  
struct Card  
{  
int face;  
int shape;  
int color;  
}  
int main()  
{  
struct card c;  
c.face=1;  
c.shape=0;  
c.color=0;  
}  


//array of structure
int main() {
struct card deck[52]={{1,0,0},{2,0,0},{1,1,0}};
}
prinf("%d",deck[0].face);
prinf("%d",deck[0].shape);
```


