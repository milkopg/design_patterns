package design_patterns.com.milko.training.java_refactoring.java_writing_readable_maintainable_code.m7classes;

import java.io.File;
import java.io.InputStream;

public class CouplingExample2 {


    public int calculateSomething(File source){
        //open InputStream from File
        return 0;
    }


    public int calculateSomething2(InputStream source){
        //read from InputStream
        return 0;
    }

}
