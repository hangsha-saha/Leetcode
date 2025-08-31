/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {

    public int bfs(List<Employee> emp, int id) {
        int total = 0;
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[2001];

        q.add(id);
        visited[id] = true;

        while (!q.isEmpty()) {
            int currId = q.poll();

            Employee currentEmp = null;
            for (Employee e : emp) {
                if (e.id == currId) {
                    currentEmp = e;
                    break;
                }
            }

            if (currentEmp == null) continue;

            total += currentEmp.importance;

            for (int sub : currentEmp.subordinates) {
                if (!visited[sub]) {
                    visited[sub] = true;
                    q.add(sub);
                }
            }
        }

        return total;
    }

    public int getImportance(List<Employee> employees, int id) {
        return bfs(employees, id);
    }
}
