import java.util.*;
class RnaTranscription {
    private static final Map<Character, Character> nucleoCompl;
    static {
        Map<Character, Character> map = new HashMap<>();
        map.put('C', 'G');
        map.put('G', 'C');
        map.put('T', 'A');
        map.put('A', 'U');
        nucleoCompl = Collections.unmodifiableMap(map);
    }
    String transcribe(String dnaStrand) {
        String rnaTranscription = "";
        char[] nucleotides = dnaStrand.toCharArray();
        for (char nucleotide : nucleotides) {
            rnaTranscription += nucleoCompl.get(nucleotide);
        }
        return rnaTranscription;
    }
}
