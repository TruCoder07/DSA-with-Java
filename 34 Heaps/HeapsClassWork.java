import java.util.*;

public class HeapsClassWork{

    // PQ for Objects
    static class Student implements Comparable<Student>{
        int rank;
        String name;
        Student(int rank, String name){
            this.rank = rank;
            this.name = name;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    /*
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        //  insert in heap 
    public void add(int data){
        // Time Complexity:  O(log(n)) (where n is no of elements in the heap) Auxiliary Space: O(n)
        // Step 1
        arr.add(data);
        int cldIdx = arr.size()-1;
        int parIdx = (cldIdx -1 )/2;
        while (arr.get(cldIdx) < arr.get(parIdx)) {
            int temp = arr.get(cldIdx);
            arr.set(cldIdx,arr.get(parIdx));
            arr.set(parIdx, temp);

            cldIdx = parIdx;
            parIdx = (cldIdx -1 )/2;
        }
    }
    public int peek(){
        return arr.get(0);
    }

    public void heapify(int rootIdx){
        int minIdx = rootIdx;
        int left = 2*rootIdx+1;
        int right = 2*rootIdx+2;

        if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
            minIdx = left;
        }

        if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
            minIdx = right;
        }
        if (minIdx != rootIdx) {
            int temp = arr.get(rootIdx);
            arr.set(rootIdx, arr.get(minIdx));
            arr.set(minIdx, temp);

            heapify(minIdx);
        }
    }
    public int remove(){
        int data = arr.get(0);

        // Step : swap 
        arr.set(0, arr.get(arr.size()-1));
        arr.set(arr.size()-1, data);
        

        arr.remove(arr.size()-1);

        heapify(0);

        return data;
    }
    public boolean isEmpty(){
        return (arr.size() == 0);
    }
}
     */
    
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+ " ");
 
        System.out.println("");
    }

    //  Heap Sort
    public static void heapSort(int arr[]){
        // step 1: build Heap (rearrange array)
        int n  = arr.length;
        for (int i = n/2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // step 2 : // One by one extract an element from heap
        for (int i = 0; i < arr.length; i++) {
            // Move current root to end
            int temp = arr[n-1-i];
            arr[n-1-i] = arr[0];
            arr[0] = temp;

            // call max heapify on the reduced heap
            heapify(arr, 0, n-1-i);
        }
    }
    public static void heapify(int arr[], int rootIdx, int size){
        int left = 2*rootIdx+1; // left = 2*i + 1
        int right = 2*rootIdx+2; // right = 2*i + 2
        int maxIdx = rootIdx; // Initialize largest as root

         // If left child is larger than root
        if (left < size && arr[maxIdx] < arr[left]) {
            maxIdx = left;
        }

        // If right child is larger than largest so far
        if (right < size && arr[maxIdx] < arr[right]) {
            maxIdx = right;
        }

        // If largest is not root
        if (rootIdx != maxIdx) {
            int temp = arr[rootIdx];
            arr[rootIdx] = arr[maxIdx];
            arr[maxIdx] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, maxIdx, size);
        }
    }

    // Nearby cars
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;
        int idx;
        Point(int x, int y, int distSq, int idx){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }
        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq;
        }
    } 

    //  11 Connect N Ropes with Minimum Cost
    public static int minCost(int arr[]){
        PriorityQueue<Integer> rope = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            rope.add(arr[i]);
        }
        int cost = 0;
        while (rope.size() > 1) {
            int r1 = rope.remove();
            int r2 = rope.remove();
            cost+=r1+r2;
            rope.add(r1+r2); 
        }
        return cost;
    }

    // 12 Weakest Soldier
    static class Army implements Comparable<Army>{
        int soldCnt;
        int idx;
        Army(int soldCnt, int idx){
            this.soldCnt = soldCnt;
            this.idx = idx;
        }
        @Override
        public int compareTo(Army a2){
            if (a2.soldCnt == this.soldCnt) {
                return this.idx - a2.idx;
            }
            return this.soldCnt - a2.soldCnt;
        }
    }

    public static void main(String[] args) {
        /*
        PriorityQueue<Integer> q1 = new PriorityQueue<>();
        q1.add(2); //  O(log n)
        q1.add(5);
        q1.add(9);
        q1.add(0);

        System.out.println("Default Priority");
        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove(); // O(log n)
        }

        // reversion priority
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        
        q.add(2); //  O(log n)
        q.add(5);
        q.add(9);
        q.add(0);

        System.out.println("Reverse Priority/Order");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove(); // O(log n)
        }

        // PQ for Objects
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student(4, "Neil"));
        pq.add(new Student(77, "Rahul"));
        pq.add(new Student(45, "Raj"));
        pq.add(new Student(1, "Pasa Kamal"));   
        
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().rank+"     "+pq.peek().name);
            pq.remove();
        }
        */

        // HEAP
        /*
        Heap pq = new Heap();
        pq.add(5);
        pq.add(7);
        pq.add(1);
        pq.add(9);
        pq.add(3);

        while(!pq.isEmpty()) {
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
         */

        // heap sort 
        int arr[] = {1,2,4,5,3};
        heapSort(arr);
        System.out.print("\nHeap = ");
        printArray(arr);

        // Naerby Cars
        int pts [][] = {{3,3},{5,-1},{-2, 4}};
        int k = 2;
        PriorityQueue<Point> p = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distSq = pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            p.add(new Point(pts[i][0], pts[i][1],distSq,i));
        }
        System.out.print("Nearest "+k+" is : ");
        for (int i = 0; i < k; i++) {
            System.out.print("C"+p.remove().idx+" ");
        }

        //  11 Connect N Ropes with Minimum Cost
        // int rops [] = {2,3,3,4,6};
        // System.out.println("The Minimum Cost to Connect "+rops.length+" Ropes = "+ minCost(rops));
        
        // 12 Weakest Soldier
        int sol[][] = {{1,0,0,0}, 
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}};

        int l = 2;

        PriorityQueue<Army> wk = new PriorityQueue<>();
        for (int i = 0; i < sol.length; i++) {
            int count = 0;
            for (int j = 0; j < sol.length; j++) {
                count+= sol[i][j]==1?1:0;
            }
            wk.add(new Army(count, i));
        }
        
        for (int i = 0; i < l; i++) {
            System.out.println("row"+wk.remove().idx);
        }
    }
}