import java.util.ArrayList;

public class Solution {
    ArrayList<Employee> empList = Store.readFile();

    public void startSorts() {
        long startBuble = System.currentTimeMillis();
        buborekRendezo();
        long stopBuble = System.currentTimeMillis();

        long startQuick = System.currentTimeMillis();
        gyorsRendezo();
        long stopQuick = System.currentTimeMillis();

        long bubleTime = stopBuble - startBuble;
        long quickTime = stopQuick - startQuick;

        System.out.printf("Buborék: %d ms\n", bubleTime);
        System.out.printf("Gyors  : %d ms\n", quickTime);

    }

    public void buborekRendezo() {
        int n = empList.size();
        
        for(int i=n-1; i>1 ; i--) {
            for(int j=0; j<i-1; j++) {
                if(empList.get(j).fizetes> empList.get(j+1).fizetes ) {
                    Employee temp = empList.get(j+1);
                    empList.set(j+1, empList.get(j));
                    empList.set(j, temp);
                }
            }            
        }
    }
    public void gyorsRendezo(){
        quicksort(this.empList, 0, this.empList.size()-1);
    }

    static void quicksort(ArrayList<Employee> empList, int lo, int hi) {
        if(lo < hi) {
            int p = partition(empList, lo, hi);
            quicksort(empList, lo, p-1);
            quicksort(empList, p+1, hi);
        }
    }
    static int partition(ArrayList<Employee> empList, int lo, int hi) {
        Employee pivot = empList.get(hi);
        int i = lo -1;
        for (int j = lo; j < hi; j++) {
            if(empList.get(j).fizetes <= pivot.fizetes) {
                i++;
                swap(empList, i, j);
            }
        }
        swap(empList, i+1, hi);
        return i + 1;
    }
    static void swap(ArrayList<Employee> empList, int i, int j) {
        Employee tmp = empList.get(i);
        empList.set(i, empList.get(j));
        empList.set(j, tmp);
    }    
}
