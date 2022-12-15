import java.util.Arrays;

public class StudentHeightSort {
	
    public static String[] sortByHeight(String names[],int heights []){
      
        for (int i=0;i< heights.length;i++){
        	
            for(int j=0;j<heights.length;j++){
            	
                if (i+j>= heights.length){
                	
                    break;
                }
                
                if(heights[i]<heights[i+j]){
               //Bubble sort
                    String string=names[i+j];
                    
                    names[i+j]=names[i];
                    
                    names[i]=string;

                    int temp=heights[i+j];
                    
                    heights[i+j]=heights[i];
                    
                    heights[i]=temp;
                }
            }
        }
        return names;

    }
    public static void main(String[] args) {
    	
        String names[] = new String[9];        

        names[0]="Bilal";
        names[1]="Bahar";
        names[2]="Enhar";
        names[3]="Gizem";
        names[4]="Ozan";
        names[5]="Ege";
        names[6]="Meral";
        names[7]="Haitham"; 
        names[8]="Losine";
        
        int heights[] = new int[9];

        heights[0]=185;
        heights[1]=169;
        heights[2]=170;
        heights[3]=173;
        heights[4]=172;
        heights[5]=178;
        heights[6]=166;
        heights[7]=181;
        heights[8]=171;

        System.out.println(Arrays.toString(sortByHeight(names,heights)));
    }
}