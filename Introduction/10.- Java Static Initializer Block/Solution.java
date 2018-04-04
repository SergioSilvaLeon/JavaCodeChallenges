static int B;
static int H;
static boolean flag = true;

static {
    
    try{
    
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();

        if (B <= 0 || H <= 0) {
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
    }catch(Exception e) {
        System.out.println(e);
    }
}
