import java.util.*;
public class GreedyAlgorithmsClassWork{

    public static int maxActivitySelectionWithSorting(int sIdx[], int eIdx[], ArrayList<Integer> ans){
        int activities[][] = new int[sIdx.length][3];
        for (int i = 0; i < activities.length; i++) {
            activities[i][0] = i;
            activities[i][1] = sIdx[i];
            activities[i][2] = eIdx[i];
        }

        // sorting
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        
        int maxAct = 0;
        // 1st Activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int prevEndIdx = activities[0][2];
        for (int i = 1; i < eIdx.length; i++) {
            if (activities[i][1] >= prevEndIdx) {
                maxAct++;
                ans.add(activities[i][0]);
                prevEndIdx = activities[i][2];   
            }
        }
        return maxAct;
    }

    public static int maxActivitySelection(int sIdx[], int eIdx[], ArrayList<Integer> ans){
        int maxAct = 0;
        // 1st Activity
        maxAct = 1;
        ans.add(0);
        int prevEndIdx = eIdx[0];
        for (int i = 1; i < eIdx.length; i++) {
            if (sIdx[i]>= prevEndIdx) {
                maxAct++;
                ans.add(i);
                prevEndIdx = eIdx[i];   
            }
        }
        return maxAct;
    } 

    // Q2 fractionalKnapsack
    public static int fractionalKnapsack(int value[], int weight[], int W){
        double ratio[][] = new double[value.length][2];
        
        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double)weight[i];
        }
        // Assinding oerder Sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int cap = W;
        int totVal = 0;

        for (int i = value.length-1; i >= 0 ; i--) {
            int idx = (int) ratio[i][0];
            if (cap >= weight[idx]) {
                cap-= weight[idx];
                totVal+=value[idx];
            }else{
                totVal+= ratio[i][1]*cap;
                cap =0;
                break;
            }
        }
        return totVal;
    }

    public static int minAbsoluteDifference(int a[], int b[]){
        int minDiff = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            minDiff+= Math.abs(a[i]-b[i]);
        }
        return minDiff;
    }

    // Q4 
    public static int maxLengthChainofPairs(int pair[][]){
        int maxPair = 0;
        // sorting 
        Arrays.sort(pair, Comparator.comparingDouble(o ->o[1]));

        maxPair = 1;
        int prevPair2ndNum = pair[0][1];
        for (int i = 1; i < pair.length; i++) {
            int currPair1stNum = pair[i][0];
            if (currPair1stNum > prevPair2ndNum) {
                maxPair++;
                prevPair2ndNum = pair[i][1];
            }
        }
        return maxPair;
    }

    public static void main(String[] args) {
        // Q1
        /*
        int si[] = {1,1,0,3,4,4,5,2};
        int ei[] = {2,3,4,5,5,6,8,9};

        int sI[] = {1,0,1,4,2,5,3,4};
        int eI[] = {3,4,2,6,9,8,5,5};

        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> ans2 = new ArrayList<>();
        int maxAct = maxActivitySelection(si, ei, ans);
        int maxAct2 = maxActivitySelectionWithSorting(sI, eI, ans2);
        System.out.println("Max Activity = "+maxAct);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println("");
        System.out.println("Max Activity = "+maxAct2);

        for (int i = 0; i < ans2.size(); i++) {
            System.out.print("A"+ans2.get(i)+" ");
        }
             */

        // Q2
        /*
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        int ele =  fractionalKnapsack(value, weight, W);
        System.out.println("Total Item in Knapsack = " + ele);    
        */
        // Question 3 minimum absolute difference
        /* 
        int arr1[] = {4,1,8,7};
        int arr2[] = {2,3,6,5};

        System.out.println("Min Absolute Difference = "+minAbsoluteDifference(arr1, arr2));
        */
        // Q4 max length chain of pairs
        int pair[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        System.out.println("Max length chain of pairs = "+maxLengthChainofPairs(pair));

    }
}