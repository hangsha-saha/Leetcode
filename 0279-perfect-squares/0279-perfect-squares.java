class Solution {

    public int bfs(int n) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[n+1];
        int rtn = 0;

        q.add(n);
        visited[n] = true;

        while(!q.isEmpty()){
            int size = q.size();
            rtn++;

            for(int i = 0; i < size; i++) {
                int curr = q.remove();

                for(int j = 1; j * j <= curr; j++) {
                    int nxt = curr - (j * j);

                    if(nxt == 0)
                        return rtn;
                
                    if(visited[nxt] == false) {
                        visited[nxt] = true;
                        q.add(nxt);
                    }
                }
            }
        }

        return rtn;
    }

    public int numSquares(int n) {
        return bfs(n);
    }
}