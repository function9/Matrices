import java.util.*;



interface Matrix
{
    // Assign the value x to element i,j
    void set(int i,int j, double x);
    // get the value of the element i,j
    double get(int i, int j);
    // Extract the diagonal of the matrix
    double[] getDiagonal();
    // get the size of the matrix-- number of rows 
    int getSize();
    // get the number of non-zero elements
    int getNnz();
    // Multiply a matrix by a vector
    Vector multiply(Vector B);
    // Print matrix using a specific format  
    void display();
    // return info about the matrix 
    void info();
}




//////////////////////////////////// ARRAY DENSE MATRIX IMPLEMENTATION

class DenseMatrix implements Matrix
{
    //////// TO COMPLETE--you can uncomment the instructions below
   
    private int size=0; // size of the matrix- number of rows/columns
    private int nnz=0;  // number of non-zero elements
    private double[][] data;
    
   

    /////// return info about the matrix
     public void info(){
    	System.out.println("Dense Matrix n="+size+", nnz="+nnz+", Storage="+(8*size*size)+"b or "+(8*size*size)/(1024*1024)+"Mb");
    }

    
}



//////////////////////////////////// Linked-List SPARSE MATRIX IMPLEMENTATION

class RowNode{
    public    int rowindex;
    public    ColNode col;
    public    RowNode next;
  
    RowNode(int i){rowindex=i; col=null; next=null;}
}

class ColNode{
    public    double entry;
    public    int colindex;;
    public    ColNode next;

    ColNode(int j,double x){
	colindex=j;
	entry=x;
        next=null;}
}



class SparseMatrixLinkedList implements Matrix
{ 
    private   RowNode top;
    private   int size=0;
    private   int nnz=0;
 
  
    // constructors
    
    // Basic constructor- no element in the list yet
    SparseMatrixLinkedList(){top=null;} 

 
    // methods   

    public void display(){
	RowNode current = top; //start probe at the beginning
	System.out.println("i");
	while (current!=null) { // until the end of the list
	    System.out.print(current.rowindex+" ");
	    ColNode jcurrent = current.col;
	    while (jcurrent!=null) { // until the end of the list
		System.out.format("==>  (j=%d, a=%.4f)",jcurrent.colindex,jcurrent.entry); 	       
		jcurrent = jcurrent.next;
	    }
	    System.out.println();
	    current = current.next; // move to next Link
	}
	System.out.println();
    }

    // return info about the matrix
    public void info(){
	System.out.println("Sparse Matrix n="+size+", nnz="+nnz+", Storage="+(8*nnz)+"b or "+(8*nnz)/(1024*1024)+"Mb");
    }

    
}

