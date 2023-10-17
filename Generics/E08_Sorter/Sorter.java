package Generics.E08_Sorter;

public class Sorter {
    public Sorter() {

    }

    public static <T extends Comparable<T>> void sort(CustomList<T> customList) {

        for (int i = 0; i < customList.getSize(); i++) {
            T currentEl = customList.get(i);
            for (int j = i + 1; j < customList.getSize(); j++) {
                if (currentEl.compareTo(customList.get(j)) > 0){
                    customList.swap(i,j);
                }

            }
        }
    }
}
