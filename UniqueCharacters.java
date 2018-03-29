public static boolean hasUniqueCharacters(String word) {
        String [] arr = word.split("");
        ArrayList<String> sentence = new ArrayList<String>();
        for (String c : arr) {
            if(sentence.contains(c)) {
                return false;
            } else {
                sentence.add(c);
            }
        }
        return true;
}