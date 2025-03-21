import java.util.*;

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, Integer> inDegree = new HashMap<>();
        Map<String, List<String>> graph = new HashMap<>();
        Set<String> available = new HashSet<>(Arrays.asList(supplies));
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < recipes.length; i++) {
            String recipe = recipes[i];
            inDegree.put(recipe, ingredients.get(i).size());  // Number of ingredients needed
            for (String ing : ingredients.get(i)) {
                graph.computeIfAbsent(ing, x -> new ArrayList<>()).add(recipe);
            }
        }

        queue.addAll(available);

        List<String> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            String item = queue.poll();
            if (!graph.containsKey(item)) continue;
            for (String recipe : graph.get(item)) {
                inDegree.put(recipe, inDegree.get(recipe) - 1);
                if (inDegree.get(recipe) == 0) {
                    queue.offer(recipe);
                    result.add(recipe);
                }
            }
        }

        return result;
    }
}
