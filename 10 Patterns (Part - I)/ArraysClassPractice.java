
public class ArraysClassPractice{

    public static void Update(int marks[]){

        for (int i = 0; i < marks.length; i++) {
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks [] = {95,96,97,98,99};
        Update(marks);

        for (int index = 0; index < marks.length; index++) {
            System.out.println(marks[index]);
            
        }

    }

}