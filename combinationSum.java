import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class combinationSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] candidates = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            candidates[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        Solution solution = new Solution();
        List<List<Integer>> result = solution.combinationSum(candidates, target);
        System.out.println("Combinations that sum to target: " + result);
        sc.close();
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    public void findCombinations(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] > target) continue;
            current.add(candidates[i]);
            findCombinations(candidates, target - candidates[i], i, current, result);
            current.remove(current.size() - 1);
        }
    }
}