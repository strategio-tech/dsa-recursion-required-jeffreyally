package tech.strategio;

import java.util.*;

public class E01 {
    public int getNthFib(int n) {
        // I'm so happy. This is the clearest understanding of recursion that I've had up until this point.
        //I still have to study it more to refine my understanding but recursion isn't as scary as it used to be
        if(n <=0) return 0;
        if(n >= 1 && n<=2){
            return n-1;
        }
        return (getNthFib(n-1)+getNthFib(n-2));
    }


}