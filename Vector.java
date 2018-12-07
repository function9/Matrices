import java.util.*;


interface Vector
{
    // randomly fill all entries with number 0<=x<1
    void fill();
    // Assign the value x to element i
    void set(int i,double x);
    // Get the value of the element i
    double get(int i);
    // Get the size of the vector (number of rows) 
    int getSize();
    // Print vector using a specific format  
    void display();
    // Calculate the Loo norm of a vector // norm=max(|x_i|) (x_i component i of x)
    double normLoo();
    // Calculate the L2 norm of a vector (Euclidean norm=sqrt(sum(x_i^2)))
    double normL2();
}




//////////////////////// USING ARRAY IMPLEMENTATION

//class VectorArray implements Vector
//{ 
// 
//}



//////////////////////// USING Linked-List IMPLEMENTATION


class VecNode{
    public    int index;
    public    double entry;
    public    VecNode next;
  
    VecNode(int i,double x){index=i;entry=x;next=null;}
}


//class VectorLL implements Vector
//{ 
//  
//}




