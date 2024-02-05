package edu.ensign.cs335.sorting.stable;


/**
 * Name:
 * Class:
 * Date:
 * @param <T>
 */
public class StableSorterImpl<T> implements StableSorter<T> {

    @Override
    public T[] sortInsertionSort(T[] unsortedArray, SortOrder sortOrder) {

        // TODO Implement this method by directly implementing the Insertion Sort
        return null;
    }

    @Override
    public T[] sortSelectionSort(T[] unsortedArray, SortOrder sortOrder) {

        // TODO Implement this method by directly implementing the Selection Sort
        return null;
    }

    @Override
    public T[] sortBubbleSort(T[] unsortedArray, SortOrder sortOrder) {

        if (sortOrder == SortOrder.ASCENDING) {
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                for (int j = 0; j < unsortedArray.length - i - 1; j++) {
                    if(unsortedArray[j]>unsortedArray[j+1]) {
                        T temp = unsortedArray[j];
                        unsortedArray[j] = unsortedArray[j + 1];
                        unsortedArray[j + 1] = temp;
                    }
                }
            }


        } else{
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                System.out.println(" " + unsortedArray[i] + " " + unsortedArray[i + 1]);
                for (int j = 0; j < unsortedArray.length - i - 1; j++) {
                    T temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
            }
        }
        return unsortedArray;
    }
}