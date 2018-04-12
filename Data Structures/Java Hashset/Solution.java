        //Write your code here
        Set<String> set = new HashSet<String>(t);
        String pair;        

        for(int i = 0; i < t; i++){
            pair = "";
            pair = String.format("%s_%s", pair_left[i], pair_right[i]);
            if (set.isEmpty() || !set.contains(pair)){
                set.add(pair);
            }
            System.out.println(set.size());
        }

        
