import java.util.List;

public class _841_Key_and_Room {
    class Solution {
        int count;
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            int n = rooms.size();
            boolean[] key = new boolean[n];

            dfs(0, key, rooms);
            for(boolean flag : key){
                if(!flag) return false;
            }
            return true;
        }
        public void dfs(int index, boolean[] visited, List<List<Integer>> rooms){
            visited[index] = true;

            for(int it : rooms.get(index)){
                if(visited[it] || index == it){
                    continue;
                }
                dfs(it, visited, rooms);
            }
        }
    }
}
