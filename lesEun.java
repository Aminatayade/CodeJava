public class lesEun {
    enum Direction {
        north,east,south ,west;
    }
    public static void main(String[] args) {
        Derection derection= Derection.north;
        switch (derection) {
            case north:
                System.out.println("nous sommes dans le nord");
                break;
        
            default:
            System.out.println("nous sommes perdus");
                break;
        }
        
    }
}
