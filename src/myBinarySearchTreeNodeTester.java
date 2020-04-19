import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class myBinarySearchTreeNodeTester {

    //Test 1: testing the general functionality of insert method
    @Test
    public void binarySearchTest1(){
        int[] A = {6, 4, 1, 5, 3, 2};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        test.insert(3); //passed
    }

    //Test 2: testing the height method if the value was not expected
    @Test
    public void binarySearchTest2(){
        int[] A = {9, 6, 7, 8};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        assertEquals(4, test.height()); //failed
    }

    //Test 3: testing the depth method if the value was not expected
    @Test
    public void binarySearchTest3(){
        int[] A = {6, 9, 13, 3, 23, 16};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        assertEquals(3, test.depth(3)); //failed
    }

    //Test 4: testing the general functionality of size method
    @Test
    public void binarySearchTest4(){
        int[] A = {9, 3, 6};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        assertEquals(3, test.size()); //passed
    }

    //Test 5: testing insert method for duplicates
    @Test
    public void binarySearchTest5(){
        int[] A = {1, 2, 2, 5, 6, 4};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        test.insert(2);
    }
}