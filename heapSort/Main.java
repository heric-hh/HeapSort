package heapSort;

public class Main {
    public static void main(String[] args) {
        int arr[] = {45, 24, 4, 22, 78};
        int n = arr.length;
        
        HeapSort obj = new HeapSort();
        obj.ordenar(arr);
        
        obj.imprimeArreglo(arr);
    }
}
