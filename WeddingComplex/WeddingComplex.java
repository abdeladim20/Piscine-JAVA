import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WeddingComplex {

    public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
        LinkedList<String> freeProposers = new LinkedList<>(first.keySet());
        Map<String, String> engagements = new HashMap<>();
        Map<String, Map<String, Integer>> secondPrefRanks = new HashMap<>();
        
        for (String person : second.keySet()) {
            List<String> prefs = second.get(person);
            Map<String, Integer> ranks = new HashMap<>();
            for (int i = 0; i < prefs.size(); i++) {
                ranks.put(prefs.get(i), i);
            }
            secondPrefRanks.put(person, ranks);
        }

        while (!freeProposers.isEmpty()) {
            String proposer = freeProposers.removeFirst();
            List<String> proposerPrefs = first.get(proposer);

            for (String proposee : proposerPrefs) {
                if (!engagements.containsKey(proposee)) {
                    engagements.put(proposee, proposer);
                    break;
                } else {
                    String currentPartner = engagements.get(proposee);
                    Map<String, Integer> ranks = secondPrefRanks.get(proposee);
                    
                    if (ranks.get(proposer) < ranks.get(currentPartner)) {
                        engagements.put(proposee, proposer);
                        freeProposers.add(currentPartner);
                        break;
                    }
                }
            }
        }

        Map<String, String> result = new HashMap<>();
        for (Map.Entry<String, String> entry : engagements.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }

        return result;
    }
}