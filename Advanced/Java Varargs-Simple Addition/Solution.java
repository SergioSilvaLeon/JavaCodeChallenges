class Add{
    public void add(int ...args){
        int n = 0;
        StringBuilder sb = new StringBuilder();
        for (int i : args){
            n += i;
            sb.append(i + "+");
        }
        // replace last value with '='
        
        String s = sb.substring(0, sb.length() -1) + '=';
        
        System.out.print(s);
        System.out.println(n);
    }
}
