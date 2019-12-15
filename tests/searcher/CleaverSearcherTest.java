package searcher;

/**
 * @author Hugh Osborne
 * @version September 2018
 */

class CleaverSearcherTest extends SearcherTest {

    protected Searcher createSearcher(int[] array, int index) throws IndexingError {
        return new CleaverSearcher(array,index);
    }

}