class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int[] parent=new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i]=i;
        }
        int[] ans=new int[2];
        int rank[]=new int[n+1];
        for(int[] edge:edges){
            if(!union(edge[0],edge[1],parent,rank)){
                ans[0]=edge[0];
                ans[1]=edge[1];
            }
        }
        return ans;
    }
     public int find(int x,int[] parent){
        if(x==parent[x]) return x;
        return parent[x]=find(parent[x],parent);
    }
    public boolean union(int x, int y, int[] parent, int rank[]){
        int parent_x=find(x,parent);
        int parent_y=find(y,parent);
        if(parent_x==parent_y) return false;
        int rank_x=rank[parent_x];
        int rank_y=rank[parent_y];
        if(rank_x > rank_y){
            parent[parent_y]=parent_x;
        }
        else if(rank_x < rank_y){
            parent[parent_x]=parent_y;
        }
        else{
            parent[parent_x]=parent_y;
            rank[parent_y]++;
        }
        return true;
    }
}