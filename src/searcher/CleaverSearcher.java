package searcher;

import java.lang.reflect.Array;
import java.util.Arrays;


/**
 * CleaverSearcher is a class that can find the Nth biggest element within an array, the inputted values are a array of integers and the nth biggest value that you want
 *
 * @author Stephen Roberts
 * @version 15/12/19
 */
public class CleaverSearcher extends Searcher {
    CleaverSearcher(int[] array, int SearchIndex) {
        super(array, SearchIndex);
    }

    /**
     * FindElement finds the Nth biggest element by searching the array by making a new one to the size of n.
     * @return
     * @throws IndexingError
     */
    @Override
    public int findElement() throws IndexingError {
        int[] array = getArray();
        int SearchIndex = getIndex();
        if (SearchIndex <= 0) {
            throw new IndexingError();
        } else if(SearchIndex > array.length){
            throw new IndexingError();
        }

        int[] newarray = new int[SearchIndex];

        for(int index = 0; index < array.length; index++){
            for(int testi = SearchIndex-1; testi >= 0;testi--){
                if(array[index] > newarray[testi]){
                    if(testi==0){
                        newarray[testi]=array[index];
                    } else {
                       for(int testii=0;testii <= testi;testii++){
                           if(testi==testii){
                               newarray[testii] = array[index];
                           } else {
                               newarray[testii]=newarray[testii+1];
                           }
                       }
                    }
                    testi = 0;
                }
            }
        }
        return newarray[0];
    }
}
