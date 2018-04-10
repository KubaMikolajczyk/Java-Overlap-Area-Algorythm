import java.util.Scanner;

class OverlapAlgorythm{
  public static void main(String[] args) {
    funtionMenu();

  }

  private static void funtionMenu(){
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter first rectangle bottom x");
    int r1bx = input.nextInt();
    System.out.println("Please enter first rectangle bottom y");
    int r1by = input.nextInt();
    System.out.println("Please enter first rectangle top x");
    int r1tx = input.nextInt();
    System.out.println("Please enter first rectangle top y");
    int r1ty = input.nextInt();
    System.out.println("Please enter second rectangle bottom x");
    int r2bx = input.nextInt();
    System.out.println("Please enter second rectangle bottom y");
    int r2by = input.nextInt();
    System.out.println("Please enter second rectangle top x");
    int r2tx = input.nextInt();
    System.out.println("Please enter second rectangle top y");
    int r2ty = input.nextInt();

    System.out.println("\n The overlaping area of those rectangles is " +
                        Integer.toString(countOverlapArea(r1bx, r1by, r1tx, r1ty, r2bx, r2by, r2tx, r2ty)));

    input.close();
  }


  private static int countOverlapArea(int r1bx, int r1by, int r1tx, int r1ty, int r2bx, int r2by, int r2tx, int r2ty){
    int xDistance = calculateDistance(r1bx, r1tx, r2bx, r2tx);

    if(checkIfOverlap(xDistance)){
      System.out.println("Rectangles do not overlap!");
      return 0;
    }

    int yDistance = calculateDistance(r1by, r1ty, r2by,r2ty);

    if(checkIfOverlap(yDistance)){
      System.out.println("Rectangles do not overlap!");
      return 0;
    }
    return(xDistance*yDistance);
  }


  private static int calculateDistance(int R1bxy, int R1txy, int R2bxy, int R2txy){
    return (Math.min(R1txy, R2txy) - Math.max(R1bxy, R2bxy));
  }


  private static boolean checkIfOverlap(int distance){
    if (distance <= 0){
      return true;
    }
    return false;
  }
}
