package reviewlab;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.nio.file.Path;
import java.util.List;
import java.util.stream.*;


public class search1 {

	public static void main(String[] args) {

		
		Path path = Paths.get("C:/Users/samer/Desktop/programvarutest/reviewlab/src/reviewlab/" + args[1]);
        try (Stream<String> lines = Files.lines(path)) {
        	lines
        		.filter(x -> x.contains(args[0]))
            	.forEach(s -> System.out.println(s));
        } catch (IOException ex) {
        	System.out.println("could not get file");
        }
	
	
	}

}
