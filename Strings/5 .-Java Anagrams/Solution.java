    static boolean isAnagram(String a, String b) {
        // Complete the function

        // Turn them to uppercase
        a = a.toUpperCase();
        b = b.toUpperCase();

        // if they're not the same size, return false
        if (a.length() == b.length()){

            // Turn B into Char array
            List<Character> characters = new ArrayList<>();
            for (char c: b.toCharArray()){
                characters.add(c);
            }

            // remove letter if is contained
            for (char c : a.toCharArray()){
                characters.remove((Character) c);
            }

            return characters.isEmpty();

        }else {
            return false;
        }
    }
