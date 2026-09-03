class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->Integer.compare(a[0]-a[1],b[0]-b[1]));
     int n=costs.length;
     int k=0;
    int path=0;
    for(;k<n/2;k++){
        path+=costs[k][0];
    }
    while(k<n) {path+=costs[k][1];k++;}
    return path;
    }
}