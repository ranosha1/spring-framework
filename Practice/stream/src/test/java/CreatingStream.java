import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        //creating the stream from array
        String [] course={"Java", "JS", "TS"};
        Stream<String> courseStream= Arrays.stream(course);

        String [] list={"New", "Old", "Medium"};
        Stream<String> list1=Arrays.stream(list);


        //creating  stream from collection
        List<String> courseList=Arrays.asList("Java", "JS", "TS");
        Stream<String> courseStream1=courseList.stream();


        List<Course> myCourse=Arrays.asList(
                new Course("Java",100),
                new Course("Java1",101),
                new Course("Java2",102));

        Stream<Course> myStream=myCourse.stream();

        //creating the stream from values
        Stream<Integer> stream=Stream.of(1,2,3,4);


    }
}
