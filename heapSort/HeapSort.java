package heapSort;

public class HeapSort {
    public void ordenar(int arr[]) {
        int n = arr.length;
        
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            heapify(arr, i, 0);
        }
    }
    
    public void heapify(int[]arr, int n, int i) {
        int mayor = i;
        int izq = 2 * i + 1;
        int der = 2 * 1 + 2;
        
        if(izq < n && arr[izq] > arr[mayor])
            mayor = izq;
        
        if ( der < n && arr[der] > arr[mayor])
            mayor = der;
        
        if (mayor != i) {
            int intercambio = arr[i];
            arr[i] = arr[mayor];
            arr[mayor] = intercambio;
            
            heapify(arr, n, mayor);
        }
    }
    
     public void imprimeArreglo(int[]arr) {
        System.out.println("Arreglo ordenado: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  " - ");
        }
    }
    
}
