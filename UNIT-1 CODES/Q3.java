import java.util.Scanner;
class PerfectCube {
    
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int N = input.nextInt();
		int cube;
		for (int i = 0; i <= N; i++) {
			cube = i * i * i;
			if (cube == N) {
				System.out.println("Perfect Cube");
				return;
			}
			else if (cube > N) {
				System.out.println("Not Perfect Cube");
				return;
			}
		}
	}

}
