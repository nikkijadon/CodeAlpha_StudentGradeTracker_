
import java.util.*;
public class task{
    
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> marks = new ArrayList<>();
    System.out.println("Enter number of students:");
            int n = sc.nextInt();
            //input marks 
            for (int i = 0; i < n; i++){
                System.out.println("Enter marks of student" + (i+1) + ":");
                marks.add(sc.nextInt());
            }
            int sum = 0;
            int highest = marks.get(0);
            int lowest = marks.get(0);

            //calculation
            for (int i = 0; i<marks.size(); i++){
                int m = marks.get(i);
                sum += m;
                if(m>highest){
                    highest = m;

                }
                if(m<lowest){
                    lowest = m;
                }
            }
            double average = (double)sum/marks.size();
            System.out.println("/n---Report----");
            System.out.println("Average Marks: " +average);
            System.out.println("Highest Marks: " +highest);
            System.out.println("Lowest Marks: "+ lowest);
           sc.close();
    
    
    
    
       

    }
}