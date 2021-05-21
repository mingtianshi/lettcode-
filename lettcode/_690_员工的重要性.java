//690. 员工的重要性
//https://leetcode-cn.com/problems/employee-importance/
/*
// Definition for Employee.
*/
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

class Solution {
    Map<Integer,Employee> map = new HashMap<Integer,Employee>();

    public int getImportance(List<Employee> employees, int id) {
        //员工1 [1, 15, [2]]
        //员工2 [2, 10, [3]]
        //员工3 [3, 5, []]
        for(Employee n : employees){
            map.put(n.id,n);
        }

        return dfs(id);
        //ArrayList<> array = new ArrayList<>();
    }
    
    public int dfs(int id){
        Employee employee = map.get(id);
        int total = employee.importance;
        List<Integer> list =  employee.subordinates;
        for(int subid : list){
            total +=dfs(subid);
        }
        return total;
    } 
}